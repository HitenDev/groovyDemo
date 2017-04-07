package com.example.groovy.closure

/**
 * Created by admin on 2017/4/5.
 */
class View {
    private Closure onClickListener
    Timer timer

    View() {
        timer = new Timer()
        timer.schedule(new TimerTask() {
            @Override
            void run() {
                perOnClick()
            }
        }, 0, 3000)
    }
    void setOnClickListener(Closure closure) {
        this.onClickListener = closure
    }
    private void perOnClick() {
        if (onClickListener != null) {
            onClickListener(this)
        }
    }
    @Override
    String toString() {
        return "this is view"
    }
}
