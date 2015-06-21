package com.nicodangelo.lumiere.client.gui;

import com.nicodangelo.lumiere.handler.ConfigurationHandler;
import com.nicodangelo.lumiere.reference.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;

import java.util.List;

public class ModGuiConfig extends GuiConfig
{

    public ModGuiConfig(GuiScreen parentScreen)
    {
        //dont really understand what this is... but it is really important
        super(parentScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }
}
