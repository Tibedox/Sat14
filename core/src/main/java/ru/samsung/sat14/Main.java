package ru.samsung.sat14;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class Main extends ApplicationAdapter {
    SpriteBatch batch;
    Texture image;
    float x = 100;
    float y = 100;

    @Override
    public void create() {
        batch = new SpriteBatch();
        image = new Texture("ghost.png");
    }

    @Override
    public void render() {
        x = x+1;
        y = y+1;
        ScreenUtils.clear(0.2f, 0.1f, 0.3f, 1f);
        batch.begin();
        batch.draw(image, x, y, 250, 250);
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        image.dispose();
    }
}
