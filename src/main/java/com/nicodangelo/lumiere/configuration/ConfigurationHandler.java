//as a hint a reference class would be a great place to store the data acquired from the config file:)

package com.nicodangelo.lumiere.configuration;

import net.minecraftforge.common.config.Configuration;
import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        //create the configuration object from the given configuration file
        Configuration configuration = new Configuration(configFile);

        try
        {
            //load the configuration file
            configuration.load();

            //read in the properties from configuration file
            //category just takes a String so you could just say "FORGECRAFT!!!"
            boolean configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example config value").getBoolean(true);

        }
        catch(Exception e)
        {
            //Log the exception
        }
        finally
        {
            //save the configuration file
            configuration.save();
        }
    }
}
