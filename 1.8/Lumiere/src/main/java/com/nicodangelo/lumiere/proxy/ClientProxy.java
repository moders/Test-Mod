package main.java.com.nicodangelo.lumiere.proxy;

import main.java.com.nicodangelo.lumiere.init.LumiereItems;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerRenders()
    {
        LumiereItems.registerRenders();
    }
}
