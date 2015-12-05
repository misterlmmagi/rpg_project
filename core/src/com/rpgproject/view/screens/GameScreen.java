package com.rpgproject.view.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.FillViewport;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.rpgproject.RPGGame;

/**
 * Created by Lukas on 1-12-2015.
 */
public abstract class GameScreen implements Screen {

    protected RPGGame game;
    protected Stage stage;

    public GameScreen(RPGGame game)
    {
        this.game = game;
        stage = new Stage();
        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void show() {

    }

    public abstract void update(float delta);
    public abstract void draw();

    @Override
    public void render(float delta) {
        stage.act(delta);
        update(delta);
        draw();
    }

    @Override
    public void resize(int width, int height) {
        stage.getViewport().update(width, height, false);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        stage.dispose();
    }
}
