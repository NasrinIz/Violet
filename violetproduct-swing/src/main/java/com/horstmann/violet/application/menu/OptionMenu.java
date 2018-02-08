/*
 Violet - A program for editing UML diagrams.

 Copyright (C) 2007 Cay S. Horstmann (http://horstmann.com)
 Alexandre de Pellegrin (http://alexdp.free.fr);

 This program is free software; you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation; either version 2 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program; if not, write to the Free Software
 Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package com.horstmann.violet.application.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import com.horstmann.violet.application.gui.MainFrame;
import com.horstmann.violet.application.help.AboutDialog;
import com.horstmann.violet.application.help.HelpManager;
import com.horstmann.violet.application.help.ShortcutDialog;
import com.horstmann.violet.framework.injection.resources.ResourceBundleInjector;
import com.horstmann.violet.framework.injection.resources.annotation.ResourceBundleBean;

/**
 * Help menu
 *
 * @author Alexandre de Pellegrin
 *
 */
@ResourceBundleBean(resourceReference = MenuFactory.class)
public class OptionMenu extends JMenu
{

    /**
     * Default constructor
     *
     * @param mainFrame where this menu is atatched
     * @param factory to access to external resources such as texts, icons
     */
    @ResourceBundleBean(key = "option")
    public OptionMenu(MainFrame mainFrame)
    {
        ResourceBundleInjector.getInjector().inject(this);
        this.mainFrame = mainFrame;
        this.createMenu();
    }

    /**
     * Initializes menu
     */
    private void createMenu()
    {

        enableFeature1Item.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {

            }

        });
        this.add(enableFeature1Item);

        disableFeature1Item.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {

            }

        });
        this.add(disableFeature1Item);

        enableFeature2Item.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {

            }

        });
        this.add(enableFeature2Item);

        disableFeature2Item.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {

            }
        });
        this.add(disableFeature2Item);

    }



    /**
     * Main app frame where this menu is attached to
     */
    private JFrame mainFrame;

    @ResourceBundleBean(key = "option.enableFeature1")
    private JMenuItem enableFeature1Item;

    @ResourceBundleBean(key = "option.disableFeature1")
    private JMenuItem disableFeature1Item;

    @ResourceBundleBean(key = "option.enableFeature2")
    private JMenuItem enableFeature2Item;

    @ResourceBundleBean(key = "option.disableFeature2")
    private JMenuItem disableFeature2Item;



}