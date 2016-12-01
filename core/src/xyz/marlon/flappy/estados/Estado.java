package xyz.marlon.flappy.estados;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by marlon on 24/09/16.
 */
public abstract class Estado {

    protected OrthographicCamera    camara;
    protected Vector3               mouse;
    protected ManejadorEstados manejador;

    public Estado(ManejadorEstados manejador){
        this.manejador  = manejador;
        camara          = new OrthographicCamera();
        mouse           = new Vector3();
    }

    protected   abstract void entrada();
    public      abstract void upadate(float dt);
    public      abstract void render(SpriteBatch sb);
    public      abstract void dispose();
}
