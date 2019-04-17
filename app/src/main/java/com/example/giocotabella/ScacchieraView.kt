package com.example.giocotabella

import android.content.Context
import android.util.AttributeSet
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.view.MotionEvent
import android.view.View


class ScacchieraView: View {

    constructor(context: Context) : super(context, null)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs, 0)

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        // DICHIARO UNA VARIABILE SCHERMO CHE USO PER CONSERVARE LE DIMENSIONI NEL CANVAS
        var schermo = Rect()
        canvas?.getClipBounds(schermo)

        var casella = Rect(100, 100, 200, 200)
        var paint = Paint()
        paint.color = Color.GREEN

        //CHIDE AL CANVAS QUAL'E' IL RETTANGOLO MASSIMO CHE PUO' CONTENERE
        canvas?.drawRect(casella, paint)
    }

    // è un codice che crea un evento che viene invocato ogni volta che l'utente tocca sulla scacchiera
    override fun onTouchEvent(event: MotionEvent?): Boolean {
// prendo la X divido per dx e lo stesso faccio per y cosi so l'utente dove ha premuto
        if (event?.action == MotionEvent.ACTION_UP) {
        }

        return super.onTouchEvent(event)


    }


}