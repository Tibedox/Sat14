package ru.samsung.sat14;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class Main extends ApplicationAdapter {
    SpriteBatch batch;
    Texture image;

    Ghost g0, g1, g2, g3;

    @Override
    public void create() {
        batch = new SpriteBatch();
        image = new Texture("ghost.png");
        g0 = new Ghost(100, 300, 25, 0);
        g1 = new Ghost(700, 200, 0, 5);
        g2 = new Ghost(0, 0, -2, 3);
        g3 = new Ghost(0, 0, 0, 5);
    }

    @Override
    public void render() {
        g0.move();
        g1.move();
        g2.move();
        g3.move1();

        ScreenUtils.clear(0.2f, 0.1f, 0.3f, 1f);
        batch.begin();
        batch.draw(image, g0.x, g0.y, 300, 300);
        batch.draw(image, g1.x, g1.y, 300, 300);
        batch.draw(image, g2.x, g2.y, 300, 300);
        batch.draw(image, g3.x, g3.y, 200, 200);
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        image.dispose();
    }
}

