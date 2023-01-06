package hust.soict.aims.screen;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import main.aims.exception.PlayerException;
import main.aims.media.Media;
import main.playable.Playable;

public class MediaStore extends JPanel {
    private Media media;

    public MediaStore(Media media) {
        this.media = media;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel title = new JLabel(media.getTitle());
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
        title.setAlignmentX(CENTER_ALIGNMENT);

        JLabel cost = new JLabel(String.format("%.2f $", media.getCost()));
        cost.setAlignmentX(CENTER_ALIGNMENT);

        JPanel container = new JPanel();
        container.setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton addToCart = new JButton("Add to cart");
        addToCart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new JDialog() {
                    {
                        this.setTitle("Notify");
                        this.setSize(400, 200);

                        this.setLayout(new FlowLayout(FlowLayout.CENTER));
                        this.add(new JLabel(media.getTitle() + " added to cart!"));

                        this.setVisible(true);
                    }
                };
            };
        });
        container.add(addToCart);

        if (media instanceof Playable) {
            JButton play = new JButton("Play");
            play.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        new JDialog() {
                            {
                                this.setTitle("Player");
                                this.setSize(400, 200);

                                this.setLayout(new FlowLayout(FlowLayout.CENTER));
                                for (String line : ((Playable) media).play().split("\n"))
                                    this.add(new JLabel(line));

                                this.setVisible(true);
                            }
                        };
                    } catch (PlayerException e1) {
                        e1.printStackTrace();
                    }
                }
            });
            container.add(play);
        }

        this.add(Box.createVerticalGlue());
        this.add(title);
        this.add(cost);
        this.add(Box.createVerticalGlue());
        this.add(container);

        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
}