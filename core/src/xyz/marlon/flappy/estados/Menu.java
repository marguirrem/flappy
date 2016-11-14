package xyz.marlon.flappy.estados;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import xyz.marlon.flappy.Game;
import xyz.marlon.flappy.ManejadorEstados;

/**
 * Created by marlon on 25/09/16.
 */
public class Menu extends Estado {

    private Texture fondo;
    private Texture botonInicio;

    public Menu(ManejadorEstados manejador){
        super(manejador);
        fondo       = new Texture("fondo.png");
        botonInicio = new Texture("inicio.png");
    }

    @Override
    protected void entrada() {

    }

    @Override
    public void upadate(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(fondo,0,0, Game.WIDTH,Game.HEIGHT);
        sb.draw(botonInicio,Game.WIDTH / 2 - botonInicio.getWidth()/2,(Game.HEIGHT /2)-(botonInicio.getHeight()/2));
        sb.end();
    }

    @Override
    public void dispose() {
        botonInicio.dispose();
        fondo.dispose();
    }
}
