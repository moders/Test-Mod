//This is the main mod class and the first class that forge will look at when loading the mod
//The three methods all have a very important purpose and will all do those things in the order that they are called
//Every mod will get the chance to do each of these before the next one happens...
//so like botania and our mod and buildcraft all get to preInitialize before anyone gets to Initialize...
//we don't have to worry about depending on any other mod in that respect:)

//the files gui, models will not be loaded automatically by minecraft we have to do that ourselves:) later

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//preInit - initializing network stuff and more importantly initialize all the items and blocks you add...
//init - register GUI, tile entities and crafting recipes
//postInit - wrap up, if there is anything we want to happen after other mods are done with there stuff:)

package com.nicodangelo.lumiere;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.beans.EventHandler;

@Mod(modid="lumiere", name="Lumiere", version="1.8-1.0")
public class Lumiere
{
    @Mod.Instance("lumiere")
    public static Lumiere instance;

    //These three events are a must have for the first class of the mod
    //Init stands for initialization
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
