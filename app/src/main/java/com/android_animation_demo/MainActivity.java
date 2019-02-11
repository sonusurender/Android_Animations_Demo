package com.android_animation_demo;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends ActionBarActivity implements OnClickListener {

	// Making instance of all Animations that are going to be used
	private static Animation blink_animtion, bounce_animation, move_animation,
			rotate_animtion, fadein_animation, fadeout_animation,
			bottomup_animtion, bottomdown_animation, topin_animation,
			topout_animtion, rightin_animation, rightout_animation,
			leftin_animtion, leftout_animation, zoomin_animation,
			zoomout_animtion, sequential_animation, together_animation;

	private static Button blink, bounce, move, rotate, fadein, fadeout,
			bottomup, bottomdown, topin, topout, rightin, rightout, leftin,
			leftout, zoomin, zoomout, together, sequential;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		init();
		setListeners();
		loadAnimations();
	}

	// Initializing all buttons
	void init() {
		blink = (Button) findViewById(R.id.blink);
		bounce = (Button) findViewById(R.id.bounce);
		move = (Button) findViewById(R.id.move);
		rotate = (Button) findViewById(R.id.rotate);
		fadein = (Button) findViewById(R.id.fadein);
		fadeout = (Button) findViewById(R.id.fadeout);
		bottomup = (Button) findViewById(R.id.bottomup);
		bottomdown = (Button) findViewById(R.id.bottomdown);
		topin = (Button) findViewById(R.id.topin);
		topout = (Button) findViewById(R.id.topout);
		rightin = (Button) findViewById(R.id.slide_in_right);
		rightout = (Button) findViewById(R.id.slide_out_right);
		leftin = (Button) findViewById(R.id.slide_in_left);
		leftout = (Button) findViewById(R.id.slide_out_left);
		zoomin = (Button) findViewById(R.id.zoomin);
		zoomout = (Button) findViewById(R.id.zoomout);
		together = (Button) findViewById(R.id.together);
		sequential = (Button) findViewById(R.id.sequential);
	}

	// Setting listeners to all buttons
	void setListeners() {
		blink.setOnClickListener(this);
		bounce.setOnClickListener(this);
		move.setOnClickListener(this);
		rotate.setOnClickListener(this);
		fadein.setOnClickListener(this);
		fadeout.setOnClickListener(this);
		bottomup.setOnClickListener(this);
		bottomdown.setOnClickListener(this);
		topin.setOnClickListener(this);
		topout.setOnClickListener(this);
		rightin.setOnClickListener(this);
		rightout.setOnClickListener(this);
		leftin.setOnClickListener(this);
		leftout.setOnClickListener(this);
		zoomin.setOnClickListener(this);
		zoomout.setOnClickListener(this);
		together.setOnClickListener(this);
		sequential.setOnClickListener(this);

	}

	// Loading animations from "anim" folder
	void loadAnimations() {

		blink_animtion = AnimationUtils.loadAnimation(MainActivity.this,
				R.anim.blink);
		bounce_animation = AnimationUtils.loadAnimation(MainActivity.this,
				R.anim.bounce);
		move_animation = AnimationUtils.loadAnimation(MainActivity.this,
				R.anim.move);
		rotate_animtion = AnimationUtils.loadAnimation(MainActivity.this,
				R.anim.rotate);
		fadein_animation = AnimationUtils.loadAnimation(MainActivity.this,
				R.anim.fade_in);
		fadeout_animation = AnimationUtils.loadAnimation(MainActivity.this,
				R.anim.fade_out);
		bottomup_animtion = AnimationUtils.loadAnimation(MainActivity.this,
				R.anim.slide_up);
		bottomdown_animation = AnimationUtils.loadAnimation(MainActivity.this,
				R.anim.slide_down);
		topin_animation = AnimationUtils.loadAnimation(MainActivity.this,
				R.anim.slide_in_top);
		topout_animtion = AnimationUtils.loadAnimation(MainActivity.this,
				R.anim.slide_out_top);
		rightin_animation = AnimationUtils.loadAnimation(MainActivity.this,
				R.anim.right_enter);
		rightout_animation = AnimationUtils.loadAnimation(MainActivity.this,
				R.anim.right_out);
		leftin_animtion = AnimationUtils.loadAnimation(MainActivity.this,
				R.anim.in_from_left);
		leftout_animation = AnimationUtils.loadAnimation(MainActivity.this,
				R.anim.left_out);
		zoomin_animation = AnimationUtils.loadAnimation(MainActivity.this,
				R.anim.zoom_in);
		zoomout_animtion = AnimationUtils.loadAnimation(MainActivity.this,
				R.anim.zoom_out);
		sequential_animation = AnimationUtils.loadAnimation(MainActivity.this,
				R.anim.sequential);
		together_animation = AnimationUtils.loadAnimation(MainActivity.this,
				R.anim.together);

	}

	// Implementing click listeners to all buttons and starting animations
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.blink:
			blink.startAnimation(blink_animtion);
			break;

		case R.id.bounce:
			bounce.startAnimation(bounce_animation);
			break;
		case R.id.move:
			move.startAnimation(move_animation);
			break;
		case R.id.rotate:
			rotate.startAnimation(rotate_animtion);
			break;

		case R.id.fadein:
			fadein.startAnimation(fadein_animation);
			break;
		case R.id.fadeout:
			fadeout.startAnimation(fadeout_animation);
			break;

		case R.id.bottomup:
			bottomup.startAnimation(bottomup_animtion);
			break;
		case R.id.bottomdown:
			bottomdown.startAnimation(bottomdown_animation);
			break;
		case R.id.topin:
			topin.startAnimation(topin_animation);
			break;
		case R.id.topout:
			topout.startAnimation(topout_animtion);
			break;
		case R.id.slide_in_right:
			rightin.startAnimation(rightin_animation);
			break;
		case R.id.slide_out_right:
			rightout.startAnimation(rightout_animation);
			break;
		case R.id.slide_in_left:
			leftin.startAnimation(leftin_animtion);
			break;

		case R.id.slide_out_left:
			leftout.startAnimation(leftout_animation);
			break;
		case R.id.zoomin:
			zoomin.startAnimation(zoomin_animation);
			break;
		case R.id.zoomout:
			zoomout.startAnimation(zoomout_animtion);
			break;
		case R.id.sequential:
			sequential.startAnimation(sequential_animation);
			break;
		case R.id.together:
			together.startAnimation(together_animation);
			break;

		}

	}

}
