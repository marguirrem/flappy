package xyz.marlon.flappy.estados;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import xyz.marlon.flappy.Game;

/**
 * Created by marlon on 25/09/16.
 */
public class Juego extends Estado {

    private Texture ave;

    public Juego(ManejadorEstados manejador) {
        super(manejador);
        ave = new Texture("bird.png");
        camara.setToOrtho(false, Game.WIDTH /2 ,Game.HEIGHT /2);
    }

    @Override
    protected void entrada() {

    }

    @Override
    public void upadate(float dt) {
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(camara.combined);
        sb.begin();
        sb.draw(ave,0,0);
        sb.end();
    }

    @Override
    public void dispose() {
        ave.dispose();
    }
}
