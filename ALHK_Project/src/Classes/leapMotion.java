
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 * Imports.
 */
import com.leapmotion.leap.*;

/**
 *
 * @author apple
 */
class LeapListener extends Listener {

    /**
     *
     * This method will be fired when the leap motion finish initializing.
     */
    public void onInit(Controller controller) {
        System.out.println("Initialized");

    }

    /**
     *
     * It will be fired when the leap motion controller device is connected, or
     * when this ListenerListener object is added to a controller that is
     * already connected.
     */
    public void onConnect(Controller controller) {
        System.out.println("Connected to motion sensor");
        /**
         * To enable the gestures that the leap motion controller will recognize
         * the (type) of gesture to enable, in our case is CIRCLE.
         *
         */
        controller.enableGesture(Gesture.Type.TYPE_CIRCLE);
    }

    /**
     *
     * This method will be fired when the leap motion is disconnected.
     */
    public void onDisconnect(Controller controller) {
        System.out.println("Motion sensor disconnected");
    }

    /**
     *
     * This method will be fired when the leap LeapListener is removed from the
     * LeapController.
     */
    public void onExit(Controller controller) {
        System.out.println("Exited");
    }

    /**
     *
     * This method will be fired when a new leap frame is available with hand
     * and fingers data.
     */
    public void onFrame(Controller controller) {
        /**
         *
         * This is the frame that is taken from the controller in one second,
         * 300 frame is captured.
         */
        Frame frame = controller.frame();
        GestureList gestures = frame.gestures();
        for (int i = 0; i < gestures.count(); i++) {
            Gesture gesture = gestures.get(i);
            //Switch on the gesture type that was specifed eariler (circle)
            //Or, if the gesture is known, it won't be recognized and "Unknown gesture" will be displyed
            switch (gesture.type()) {
                // This code will be excuted if the gesture was circle
                case TYPE_CIRCLE:
                    CircleGesture circle = new CircleGesture(gesture);
                    // To know if the circle was clockwise or not
                    String clockwises;
                    // for loop to get the the type of the hand that is currently using the leap motion
                    for (Hand hand : frame.hands()) {
                        // if the condetion is true then the angle is less than 90 Degree
                        //means that the circke is clockwise
                        if (circle.pointable().direction().angleTo(circle.normal()) <= Math.PI / 4) {
                            // if the hand is right, it'll zoom in.
                            if (hand.isRight()) {
                                ALHKProject.applet.moveObject("in");
                                System.out.println("circkling clockwises with right");
                            }
                            // if the hand is left, it'll rotate right.
                            if (hand.isLeft()) {
                                ALHKProject.applet.moveObject("right");

                                System.out.println("circkling clockwises with left");
                            }

                            clockwises = "clockwise";

                        } else {
                            // if the hand is right, it'll zoom out.
                            if (hand.isRight()) {
                                ALHKProject.applet.moveObject("out");
                                System.out.println("circkling counter-clockwise with right");
                            }
                            // if the hand is left, it'll rotate left.
                            if (hand.isLeft()) {
                                ALHKProject.applet.moveObject("left");
                                System.out.println("circkling counter-clockwise with left");
                            }

                            clockwises = "counter-clockwise";

                        }
                    }

                    break;

                default:
                    System.out.println("Unknown gesture.");
                    break;

            }
        }

    }

}

public class leapMotion {

    static public Controller controller = new Controller();
    static public LeapListener listener = new LeapListener();

    /**
     * Initialize the leap listener and add it to the controller.
     */
    public static void main(String[] args) {
        controller.addListener(listener);
    }

    /**
     * Remove the leap listener and remove the controller.
     */
    public void Exit() {
        listener.onExit(controller);
        controller.removeListener(listener);
    }

}
