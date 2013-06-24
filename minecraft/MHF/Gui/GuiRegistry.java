package MHF.Gui;

public class GuiRegistry
{
	public static void init()
	{
		GuiHandlerMH.registerGui(GuiBBQ.class, ContainerBBQ.class);
		}

}
