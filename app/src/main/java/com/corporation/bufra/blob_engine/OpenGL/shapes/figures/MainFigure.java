package com.corporation.bufra.blob_engine.OpenGL.shapes.figures;


import com.corporation.bufra.blob_engine.OpenGL.shapes.Rectangle;

public class MainFigure extends Rectangle {

    boolean tempRet[] = {false, false, false, false};
    float tempUpperleft[] = {0f, 0f, 0f};
    float tempDownerright[] = {0f, 0f, 0f};

    boolean CollisionArray[] = {false, false, false, false};




    public MainFigure() {
        super();
    }

    public MainFigure(float x1, float x2, float x3, float x4) {
        super(x1, x2, x3, x4);
    }

    public void setValues( Rectangle[] rec, float x2, float y2) {
        CollisionArray = CollisionDetector(rec, x2, y2);
        if(!(CollisionArray[0])) {super.setValues(x2, 0);}
        if(!(CollisionArray[2])) {super.setValues(0, y2);}
        if(!(CollisionArray[1])) {super.setValues(x2, 0);}
        if(!(CollisionArray[3])) {super.setValues(0, y2);}
    }

    public boolean[] CollisionDetector(Rectangle[] rec, float x2, float y2) {
        //Return array [Coll. left, Coll. up, Coll. right, Coll. up]
//Maintest

        //Check Border collection
        if (verticles[0] - x2 < -1 || verticles[3] - x2 < -1) {
            tempRet[0] = true;
        }
        if (verticles[0] - x2 > 1 || verticles[3] - x2 > 1) {
            tempRet[2] = true;
        }
        if(verticles[1] - y2 < -1 || verticles[4] - y2 < -1 ) {
            tempRet[1] = true;
        }
        if (verticles[1] - y2 > 1 || verticles[4] - y2 > 1) {
            tempRet[3] = true;
        }

        //For each Rectangle
       /* for (Rectangle r : rec) {


            return tempRet;
        }*/
        return tempRet;
    }


}
