package xyz.marlon.flappy.estados;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import xyz.marlon.flappy.ManejadorEstados;

/**
 * Created by marlon on 25/09/16.
 */
public class Juego extends Estado {

    private Texture ave;

    public Juego(ManejadorEstados manejador) {
        super(manejador);
        ave = new Texture("ave.png");
    }

    @Override
    protected void entrada() {

    }

    @Override
    public void upadate(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {

    }

    @Override
    public void dispose() {

    }
}
