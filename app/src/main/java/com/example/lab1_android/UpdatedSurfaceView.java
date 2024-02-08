package com.example.lab1_android;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class UpdatedSurfaceView extends SurfaceView {

    // better to declare Paint objects here,
    //      so they are not created and destroyed
    //      everytime onDraw() is called
    private Paint brightPink = new Paint();
    private Paint forestGreen = new Paint();

    public UpdatedSurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);

        // android automatically disables the onDraw()
        //      method, you have to turn it on manually
        setWillNotDraw(false);

        // 0x before the number tells the compiler that
        //      this is a hexadecimal number
        brightPink.setColor(0xFFFC0FC0);
        forestGreen.setColor(0xFF228B22);
        forestGreen.setStyle(Paint.Style.STROKE);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        // a lowercase 'f' means "float literal" and shows
        //      that the number is not a double, but a float
        canvas.drawCircle(200.0f, 300.0f, 50.0f, brightPink);
        canvas.drawRect(300.0f, 100.0f, 350.0f, 175.0f, forestGreen);

        // create a bitmap object that contains the image
        Bitmap smiley =
                BitmapFactory.decodeResource(getResources(),
                                             R.drawable.smileyface);

        // resize to 100x100 dp
        smiley = Bitmap.createScaledBitmap(smiley, 100, 100, false);

        // draw image on the UpdatedSurfaceView
        canvas.drawBitmap(smiley, 500.0f, 200.0f, null);
    }
}
