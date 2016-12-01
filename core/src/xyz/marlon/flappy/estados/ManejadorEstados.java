package xyz.marlon.flappy.estados;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;

import xyz.marlon.flappy.estados.Estado;

/**
 * Created by marlon on 25/09/16.
 */
public class ManejadorEstados {

    private Stack<Estado> estados;

    public ManejadorEstados(){
        estados = new Stack<Estado>();
    }

    public void push(Estado estado){
        estados.push(estado);
    }

    public void pop(){
        estados.pop();
    }

    public void set(Estado estado){
        estados.pop();
        estados.push(estado);
    }

    public void update(float dt){
        estados.peek().upadate(dt);
    }

    public void render(SpriteBatch sb){
        estados.peek().render(sb);
    }

}
