package com.digient.testgame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.digient.testgame.sprite.Ball;
import com.digient.testgame.sprite.Ball1;
import com.digient.testgame.sprite.Ball2;
import com.digient.testgame.sprite.Ball3;
import com.digient.testgame.sprite.Basket;



public class TestGame extends ApplicationAdapter {

	SpriteBatch batch;
	Ball ball;
	Ball1 ball1;
	Ball2 ball2;
	Ball3 ball3;
	Basket basket;
	OrthographicCamera cam;
	Vector3 input;
//	Vector3 input1;
//	Vector3 input2;
//	Vector3 input3;

	@Override
	public void create() {
		batch = new SpriteBatch();
		ball = new Ball();
		ball1 = new Ball1();
		ball2 = new Ball2();
		ball3 = new Ball3();
		basket = new Basket();
		input = new Vector3();
//		input1 = new Vector3();
//		input2 = new Vector3();
//		input3 = new Vector3();
		cam = new OrthographicCamera();
		cam.setToOrtho(true, 800, 800);
	 }

	@Override
	public void render() {
		Gdx.gl.glClearColor(1, 1, 0.1f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		if (Gdx.input.isTouched()){
			input.set(Gdx.input.getX(), Gdx.input.getY(), 0);
//			input1.set(Gdx.input.getX(), Gdx.input.getY(), 0);
//			input2.set(Gdx.input.getX(), Gdx.input.getY(), 0);
//			input3.set(Gdx.input.getX(), Gdx.input.getY(), 0);
			//cam.unproject(input);
			//System.out.println("clicked "+Gdx.input.getX()+" "+ Gdx.input.getY());
			if (input.x > ball.getX())
			{
				ball.setPosition(250,600);

			}
			if (input.x > ball1.getX())
			{
				ball1.setPosition(350,600);
			}
			if (input.x > ball2.getX())
			{
				ball2.setPosition(450,600);
			}
			if (input.x > ball3.getX())
			{
				ball3.setPosition(525,600);
			}

//			if (input.x > sprite.getX() && input.x < sprite.getX() + sprite.getWidth()){
//				if (input.y > sprite.getY() && input.y < sprite.getY() + sprite.getHeight()){
//					System.out.println("working");
//					ball.setPosition(200, 600);
//					 }
//			}
//			if (ball.getBoundingRectangle().contains(input.x, input.y)) {
//				System.out.println("clicked");
//				ball.setPosition(200, 600);
//			}
		}


//		if (Gdx.input.isTouched()) {
//			System.out.println("isTouched " + Gdx.input.getX() + "-" + Gdx.input.getY());
//			ball.setPosition(200, 600);
//		}
//		if (Gdx.input.isTouched()) {
//			System.out.println("isTouched " + Gdx.input.getX() + "-" + Gdx.input.getY());
//			ball1.setPosition(300, 600);
//		}
//		if (Gdx.input.isTouched()) {
//			System.out.println("isTouched " + Gdx.input.getX() + "-" + Gdx.input.getY());
//			ball2.setPosition(400, 600);
//		}
//		if (Gdx.input.isTouched()) {
//			System.out.println("isTouched " + Gdx.input.getX() + "-" + Gdx.input.getY());
//			ball3.setPosition(500, 600);
//		}
		ball.draw(batch);
		ball1.draw(batch);
		ball2.draw(batch);
		ball3.draw(batch);
		basket.draw(batch);
		batch.end();
	}

	@Override
	public void dispose() {
		batch.dispose();


	}

}















//		if(count<5){
//			ball.setPosition(ball.getX(),ball.getY());
//			ball1.setPosition(ball1.getX(),ball1.getY());
//			ball2.setPosition(ball2.getX(),ball2.getY());
//			ball3.setPosition(ball3.getX(),ball3.getY());
//			basket.setPosition(basket.getX(),basket.getY());
//		}else {
//			count = 0;
//		}
//		count++;


//	SpriteBatch batch;
//	Texture img;
////	Texture img1;
////	Texture img2;
//	@Override
//	public void create () {
//		batch = new SpriteBatch();
//		img = new Texture("badlogic.jpg");
////		img1 = new Texture("gametime.png");
////		img2 = new Texture("gameimage1.jpg");
//	}
//
//	@Override
//	public void render () {
//		Gdx.gl.glClearColor(1, 1, 0.3f, 0.5f);
//		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//		batch.begin();
//		batch.draw(img, 0.8f, 1);
////		batch.draw(img1, 1, 1);
////		batch.draw(img2, 0.4f, 1);
//		batch.end();
//
//
////		batch.begin();
////		Gdx.gl.glClearColor(1, 1, 0.3f, 0.5f);
////		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
////		batch.draw(img, 0.5f, 0.5f);
////		Gdx.gl.glClearColor(1, 0, 0, 0);
////		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
////		batch.draw(img1, 1, 1);
////		Gdx.gl.glClearColor(1, 0, 0.5f, 0.5f);
////		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
////		batch.draw(img2, 1, 0.8f);
////		batch.end();
//
//
//	}
//
//	@Override
//	public void dispose () {
//		batch.dispose();
//		img.dispose();
////		img1.dispose();
////		img2.dispose();
//	}

