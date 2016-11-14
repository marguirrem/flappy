package xyz.marlon.flappy.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import xyz.marlon.flappy.Game;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width	= Game.WIDTH;
		config.height	= Game.HEIGHT;
		config.title 	= Game.TITLE;
		new LwjglApplication(new Game(), config);
	}
}
