package xyz.marlon.flappy;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import xyz.marlon.flappy.estados.*;

public class Game extends ApplicationAdapter {
	public static final int 	WIDTH	= 480;
	public static final int 	HEIGHT	= 850;
	public static final String 	TITLE 	= "Flappy Bird";

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	private xyz.marlon.flappy.estados.ManejadorEstados me;
	private SpriteBatch batch;

	@Override
	public void create () {
		me = new xyz.marlon.flappy.estados.ManejadorEstados();
		batch = new SpriteBatch();
		Gdx.gl.glClearColor(1, 0, 0, 1);
		me.push(new Menu(me));
	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		me.update(Gdx.graphics.getDeltaTime());
		me.render(batch);
	}
	/*
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}*/
}
