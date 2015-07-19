/*
 * 
 */
package chatbottest;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.*;
import static java.awt.event.KeyEvent.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author DakiDozer
 */
public class ChatBotTest {

    //http://stackoverflow.com/questions/17844378/invalid-key-code-java
    public static void keyPress(Robot robot, char characterKey) {
        switch (characterKey) {
            case '☺':
                altNumpad(robot, "1");
                break;
            case '☻':
                altNumpad(robot, "2");
                break;
            case '♥':
                altNumpad(robot, "3");
                break;
            case '♦':
                altNumpad(robot, "4");
                break;
            case '♣':
                altNumpad(robot, "5");
                break;
            case '♠':
                altNumpad(robot, "6");
                break;
            case '♂':
                altNumpad(robot, "11");
                break;
            case '♀':
                altNumpad(robot, "12");
                break;
            case '♫':
                altNumpad(robot, "14");
                break;
            case '☼':
                altNumpad(robot, "15");
                break;
            case '►':
                altNumpad(robot, "16");
                break;
            case '◄':
                altNumpad(robot, "17");
                break;
            case '↕':
                altNumpad(robot, "18");
                break;
            case '‼':
                altNumpad(robot, "19");
                break;
            case '¶':
                altNumpad(robot, "20");
                break;
            case '§':
                altNumpad(robot, "21");
                break;
            case '▬':
                altNumpad(robot, "22");
                break;
            case '↨':
                altNumpad(robot, "23");
                break;
            case '↑':
                altNumpad(robot, "24");
                break;
            case '↓':
                altNumpad(robot, "25");
                break;
            case '→':
                altNumpad(robot, "26");
                break;
            case '←':
                altNumpad(robot, "27");
                break;
            case '∟':
                altNumpad(robot, "28");
                break;
            case '↔':
                altNumpad(robot, "29");
                break;
            case '▲':
                altNumpad(robot, "30");
                break;
            case '▼':
                altNumpad(robot, "31");
                break;
            case '!':
                altNumpad(robot, "33");
                break;
            case '"':
                altNumpad(robot, "34");
                break;
            case '#':
                altNumpad(robot, "35");
                break;
            case '$':
                altNumpad(robot, "36");
                break;
            case '%':
                altNumpad(robot, "37");
                break;
            case '&':
                altNumpad(robot, "38");
                break;
            case '\'':
                altNumpad(robot, "39");
                break;
            case '(':
                altNumpad(robot, "40");
                break;
            case ')':
                altNumpad(robot, "41");
                break;
            case '*':
                altNumpad(robot, "42");
                break;
            case '+':
                altNumpad(robot, "43");
                break;
            case ',':
                altNumpad(robot, "44");
                break;
            case '-':
                altNumpad(robot, "45");
                break;
            case '.':
                altNumpad(robot, "46");
                break;
            case '/':
                altNumpad(robot, "47");
                break;
            case '0':
                altNumpad(robot, "48");
                break;
            case '1':
                altNumpad(robot, "49");
                break;
            case '2':
                altNumpad(robot, "50");
                break;
            case '3':
                altNumpad(robot, "51");
                break;
            case '4':
                altNumpad(robot, "52");
                break;
            case '5':
                altNumpad(robot, "53");
                break;
            case '6':
                altNumpad(robot, "54");
                break;
            case '7':
                altNumpad(robot, "55");
                break;
            case '8':
                altNumpad(robot, "56");
                break;
            case '9':
                altNumpad(robot, "57");
                break;
            case ':':
                altNumpad(robot, "58");
                break;
            case ';':
                altNumpad(robot, "59");
                break;
            case '<':
                altNumpad(robot, "60");
                break;
            case '=':
                altNumpad(robot, "61");
                break;
            case '>':
                altNumpad(robot, "62");
                break;
            case '?':
                altNumpad(robot, "63");
                break;
            case '@':
                altNumpad(robot, "64");
                break;
            case 'A':
                altNumpad(robot, "65");
                break;
            case 'B':
                altNumpad(robot, "66");
                break;
            case 'C':
                altNumpad(robot, "67");
                break;
            case 'D':
                altNumpad(robot, "68");
                break;
            case 'E':
                altNumpad(robot, "69");
                break;
            case 'F':
                altNumpad(robot, "70");
                break;
            case 'G':
                altNumpad(robot, "71");
                break;
            case 'H':
                altNumpad(robot, "72");
                break;
            case 'I':
                altNumpad(robot, "73");
                break;
            case 'J':
                altNumpad(robot, "74");
                break;
            case 'K':
                altNumpad(robot, "75");
                break;
            case 'L':
                altNumpad(robot, "76");
                break;
            case 'M':
                altNumpad(robot, "77");
                break;
            case 'N':
                altNumpad(robot, "78");
                break;
            case 'O':
                altNumpad(robot, "79");
                break;
            case 'P':
                altNumpad(robot, "80");
                break;
            case 'Q':
                altNumpad(robot, "81");
                break;
            case 'R':
                altNumpad(robot, "82");
                break;
            case 'S':
                altNumpad(robot, "83");
                break;
            case 'T':
                altNumpad(robot, "84");
                break;
            case 'U':
                altNumpad(robot, "85");
                break;
            case 'V':
                altNumpad(robot, "86");
                break;
            case 'W':
                altNumpad(robot, "87");
                break;
            case 'X':
                altNumpad(robot, "88");
                break;
            case 'Y':
                altNumpad(robot, "89");
                break;
            case 'Z':
                altNumpad(robot, "90");
                break;
            case '[':
                altNumpad(robot, "91");
                break;
            case '\\':
                altNumpad(robot, "92");
                break;
            case ']':
                altNumpad(robot, "93");
                break;
            case '^':
                altNumpad(robot, "94");
                break;
            case '_':
                altNumpad(robot, "95");
                break;
            case '`':
                altNumpad(robot, "96");
                break;
            case 'a':
                altNumpad(robot, "97");
                break;
            case 'b':
                altNumpad(robot, "98");
                break;
            case 'c':
                altNumpad(robot, "99");
                break;
            case 'd':
                altNumpad(robot, "100");
                break;
            case 'e':
                altNumpad(robot, "101");
                break;
            case 'f':
                altNumpad(robot, "102");
                break;
            case 'g':
                altNumpad(robot, "103");
                break;
            case 'h':
                altNumpad(robot, "104");
                break;
            case 'i':
                altNumpad(robot, "105");
                break;
            case 'j':
                altNumpad(robot, "106");
                break;
            case 'k':
                altNumpad(robot, "107");
                break;
            case 'l':
                altNumpad(robot, "108");
                break;
            case 'm':
                altNumpad(robot, "109");
                break;
            case 'n':
                altNumpad(robot, "110");
                break;
            case 'o':
                altNumpad(robot, "111");
                break;
            case 'p':
                altNumpad(robot, "112");
                break;
            case 'q':
                altNumpad(robot, "113");
                break;
            case 'r':
                altNumpad(robot, "114");
                break;
            case 's':
                altNumpad(robot, "115");
                break;
            case 't':
                altNumpad(robot, "116");
                break;
            case 'u':
                altNumpad(robot, "117");
                break;
            case 'v':
                altNumpad(robot, "118");
                break;
            case 'w':
                altNumpad(robot, "119");
                break;
            case 'x':
                altNumpad(robot, "120");
                break;
            case 'y':
                altNumpad(robot, "121");
                break;
            case 'z':
                altNumpad(robot, "122");
                break;
            case '{':
                altNumpad(robot, "123");
                break;
            case '|':
                altNumpad(robot, "124");
                break;
            case '}':
                altNumpad(robot, "125");
                break;
            case '~':
                altNumpad(robot, "126");
                break;
            case '⌂':
                altNumpad(robot, "127");
                break;
            case 'Ç':
                altNumpad(robot, "128");
                break;
            case 'ü':
                altNumpad(robot, "129");
                break;
            case 'é':
                altNumpad(robot, "130");
                break;
            case 'â':
                altNumpad(robot, "131");
                break;
            case 'ä':
                altNumpad(robot, "132");
                break;
            case 'à':
                altNumpad(robot, "133");
                break;
            case 'å':
                altNumpad(robot, "134");
                break;
            case 'ç':
                altNumpad(robot, "135");
                break;
            case 'ê':
                altNumpad(robot, "136");
                break;
            case 'ë':
                altNumpad(robot, "137");
                break;
            case 'è':
                altNumpad(robot, "138");
                break;
            case 'ï':
                altNumpad(robot, "139");
                break;
            case 'î':
                altNumpad(robot, "140");
                break;
            case 'ì':
                altNumpad(robot, "141");
                break;
            case 'Ä':
                altNumpad(robot, "142");
                break;
            case 'Å':
                altNumpad(robot, "143");
                break;
            case 'É':
                altNumpad(robot, "144");
                break;
            case 'æ':
                altNumpad(robot, "145");
                break;
            case 'Æ':
                altNumpad(robot, "146");
                break;
            case 'ô':
                altNumpad(robot, "147");
                break;
            case 'ö':
                altNumpad(robot, "148");
                break;
            case 'ò':
                altNumpad(robot, "149");
                break;
            case 'û':
                altNumpad(robot, "150");
                break;
            case 'ù':
                altNumpad(robot, "151");
                break;
            case 'ÿ':
                altNumpad(robot, "152");
                break;
            case 'Ö':
                altNumpad(robot, "153");
                break;
            case 'Ü':
                altNumpad(robot, "154");
                break;
            case '¢':
                altNumpad(robot, "155");
                break;
            case '£':
                altNumpad(robot, "156");
                break;
            case '¥':
                altNumpad(robot, "157");
                break;
            case '₧':
                altNumpad(robot, "158");
                break;
            case 'ƒ':
                altNumpad(robot, "159");
                break;
            case 'á':
                altNumpad(robot, "160");
                break;
            case 'í':
                altNumpad(robot, "161");
                break;
            case 'ó':
                altNumpad(robot, "162");
                break;
            case 'ú':
                altNumpad(robot, "163");
                break;
            case 'ñ':
                altNumpad(robot, "164");
                break;
            case 'Ñ':
                altNumpad(robot, "165");
                break;
            case 'ª':
                altNumpad(robot, "166");
                break;
            case 'º':
                altNumpad(robot, "167");
                break;
            case '¿':
                altNumpad(robot, "168");
                break;
            case '⌐':
                altNumpad(robot, "169");
                break;
            case '¬':
                altNumpad(robot, "170");
                break;
            case '½':
                altNumpad(robot, "171");
                break;
            case '¼':
                altNumpad(robot, "172");
                break;
            case '¡':
                altNumpad(robot, "173");
                break;
            case '«':
                altNumpad(robot, "174");
                break;
            case '»':
                altNumpad(robot, "175");
                break;
            case '░':
                altNumpad(robot, "176");
                break;
            case '▒':
                altNumpad(robot, "177");
                break;
            case '▓':
                altNumpad(robot, "178");
                break;
            case '│':
                altNumpad(robot, "179");
                break;
            case '┤':
                altNumpad(robot, "180");
                break;
            case '╡':
                altNumpad(robot, "181");
                break;
            case '╢':
                altNumpad(robot, "182");
                break;
            case '╖':
                altNumpad(robot, "183");
                break;
            case '╕':
                altNumpad(robot, "184");
                break;
            case '╣':
                altNumpad(robot, "185");
                break;
            case '║':
                altNumpad(robot, "186");
                break;
            case '╗':
                altNumpad(robot, "187");
                break;
            case '╝':
                altNumpad(robot, "188");
                break;
            case '╜':
                altNumpad(robot, "189");
                break;
            case '╛':
                altNumpad(robot, "190");
                break;
            case '┐':
                altNumpad(robot, "191");
                break;
            case '└':
                altNumpad(robot, "192");
                break;
            case '┴':
                altNumpad(robot, "193");
                break;
            case '┬':
                altNumpad(robot, "194");
                break;
            case '├':
                altNumpad(robot, "195");
                break;
            case '─':
                altNumpad(robot, "196");
                break;
            case '┼':
                altNumpad(robot, "197");
                break;
            case '╞':
                altNumpad(robot, "198");
                break;
            case '╟':
                altNumpad(robot, "199");
                break;
            case '╚':
                altNumpad(robot, "200");
                break;
            case '╔':
                altNumpad(robot, "201");
                break;
            case '╩':
                altNumpad(robot, "202");
                break;
            case '╦':
                altNumpad(robot, "203");
                break;
            case '╠':
                altNumpad(robot, "204");
                break;
            case '═':
                altNumpad(robot, "205");
                break;
            case '╬':
                altNumpad(robot, "206");
                break;
            case '╧':
                altNumpad(robot, "207");
                break;
            case '╨':
                altNumpad(robot, "208");
                break;
            case '╤':
                altNumpad(robot, "209");
                break;
            case '╥':
                altNumpad(robot, "210");
                break;
            case '╙':
                altNumpad(robot, "211");
                break;
            case '╘':
                altNumpad(robot, "212");
                break;
            case '╒':
                altNumpad(robot, "213");
                break;
            case '╓':
                altNumpad(robot, "214");
                break;
            case '╫':
                altNumpad(robot, "215");
                break;
            case '╪':
                altNumpad(robot, "216");
                break;
            case '┘':
                altNumpad(robot, "217");
                break;
            case '┌':
                altNumpad(robot, "218");
                break;
            case '█':
                altNumpad(robot, "219");
                break;
            case '▄':
                altNumpad(robot, "220");
                break;
            case '▌':
                altNumpad(robot, "221");
                break;
            case '▐':
                altNumpad(robot, "222");
                break;
            case '▀':
                altNumpad(robot, "223");
                break;
            case 'α':
                altNumpad(robot, "224");
                break;
            case 'ß':
                altNumpad(robot, "225");
                break;
            case 'Γ':
                altNumpad(robot, "226");
                break;
            case 'π':
                altNumpad(robot, "227");
                break;
            case 'Σ':
                altNumpad(robot, "228");
                break;
            case 'σ':
                altNumpad(robot, "229");
                break;
            case 'µ':
                altNumpad(robot, "230");
                break;
            case 'τ':
                altNumpad(robot, "231");
                break;
            case 'Φ':
                altNumpad(robot, "232");
                break;
            case 'Θ':
                altNumpad(robot, "233");
                break;
            case 'Ω':
                altNumpad(robot, "234");
                break;
            case 'δ':
                altNumpad(robot, "235");
                break;
            case '∞':
                altNumpad(robot, "236");
                break;
            case 'φ':
                altNumpad(robot, "237");
                break;
            case 'ε':
                altNumpad(robot, "238");
                break;
            case '∩':
                altNumpad(robot, "239");
                break;
            case '≡':
                altNumpad(robot, "240");
                break;
            case '±':
                altNumpad(robot, "241");
                break;
            case '≥':
                altNumpad(robot, "242");
                break;
            case '≤':
                altNumpad(robot, "243");
                break;
            case '⌠':
                altNumpad(robot, "244");
                break;
            case '⌡':
                altNumpad(robot, "245");
                break;
            case '÷':
                altNumpad(robot, "246");
                break;
            case '≈':
                altNumpad(robot, "247");
                break;
            case '°':
                altNumpad(robot, "248");
                break;
            case '∙':
                altNumpad(robot, "249");
                break;
            case '·':
                altNumpad(robot, "250");
                break;
            case '√':
                altNumpad(robot, "251");
                break;
            case 'ⁿ':
                altNumpad(robot, "252");
                break;
            case '²':
                altNumpad(robot, "253");
                break;
            case '■':
                altNumpad(robot, "254");
                break;
            default:
                return;
        }
    }

    private static void altNumpad(Robot robot, int... numpadCodes) {
        if (numpadCodes.length == 0) {
            return;
        }

        robot.keyPress(VK_ALT);

        for (int NUMPAD_KEY : numpadCodes) {
            robot.keyPress(NUMPAD_KEY);
            robot.keyRelease(NUMPAD_KEY);
        }

        robot.keyRelease(VK_ALT);
    }

    private static void altNumpad(Robot robot, String numpadCodes) {
        if (numpadCodes == null || !numpadCodes.matches("^\\d+$")) {
            return;
        }

        robot.keyPress(VK_ALT);

        for (char charater : numpadCodes.toCharArray()) {

            int NUMPAD_KEY = getNumpad(charater);

            if (NUMPAD_KEY != -1) {
                robot.keyPress(NUMPAD_KEY);
                robot.keyRelease(NUMPAD_KEY);
            }
        }

        robot.keyRelease(VK_ALT);
    }

    private static int getNumpad(char numberChar) {
        switch (numberChar) {
            case '0':
                return VK_NUMPAD0;
            case '1':
                return VK_NUMPAD1;
            case '2':
                return VK_NUMPAD2;
            case '3':
                return VK_NUMPAD3;
            case '4':
                return VK_NUMPAD4;
            case '5':
                return VK_NUMPAD5;
            case '6':
                return VK_NUMPAD6;
            case '7':
                return VK_NUMPAD7;
            case '8':
                return VK_NUMPAD8;
            case '9':
                return VK_NUMPAD9;
            default:
                return -1;
        }

    }

    //Classes and methods
    public static void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        System.out.println(key);
    }

    //Used to get the location of the mouse after the timer goes off.
    public static class GetLocation {

        private boolean timerDone = false;

        public void finished() {
            timerDone = true;
        }

        public boolean isTimerDone() {
            return timerDone;
        }
    }

    //Randomly capitalizes input.
    public static void randomCapitalize(Robot robot) {
        if (Math.random() > .5) {
            robot.keyPress(16);//Shift
        }
    }

    public static String[] getTextDoc(String filename) {
        BufferedReader br = null;
        int i = 0;

        try {
            br = new BufferedReader(new FileReader(new File(filename)));
            while (br.readLine() != null ) {
                i++;
            }
        } catch (IOException ex) {
            System.out.println(ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
        
        String[] array = new String[i];
        String inLine = "";
        for (int z = 0; z < i; z++) {
            try {
                br = new BufferedReader(new FileReader(new File(filename)));
                for (int p = 0; p < i; p++) {
                    inLine = br.readLine();
                    inLine = inLine.toUpperCase();
                    inLine += "\n";
                    array[p] = inLine;            
                }
            } catch (IOException ex) {
                System.out.println(ex);
            } finally {
                try {
                    br.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }

        return array;
    }

    public static void main(String[] args) throws AWTException, InterruptedException {
        //This can be used to track the position of the mouse on the screen.
        //Mainly used for automated Java testing.
        Robot robot = new Robot();

        //Holds the x and y coordinates of the mouse after 5 seconds.
        int xCoord = 0;
        int yCoord = 0;
        //Call my class getLocation
        GetLocation getLocation = new GetLocation();

        System.out.println("Click on whatever you want to insert the text into. You have 5 seconds.");

        //Create a timer
        Timer timer = new Timer();
        //Schedule a task to be executed once.
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                //Tell the program that we have a location now.
                getLocation.finished();
            }
        }, 5 * 1000//,anotherTime -> You'd put this extra time here if you wanted the event to happen every X milliseconds.
        );

        while (getLocation.isTimerDone() == false) {
            //Get the mouse position
            Point lastPosition = MouseInfo.getPointerInfo().getLocation();
            Point currentPosition = MouseInfo.getPointerInfo().getLocation();

            if (!(lastPosition.equals(currentPosition))) {
                //Keep setting the new mouse position.
                xCoord = MouseInfo.getPointerInfo().getLocation().x;
                yCoord = MouseInfo.getPointerInfo().getLocation().y;
                lastPosition = MouseInfo.getPointerInfo().getLocation();
            }
        }

        //Move the mouse to where it is (seems redundant).
        robot.mouseMove(xCoord, yCoord);

        //Clicks the mouse.
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);

        //Used to pause the chatbot for *roughly/not exactly* X milliseconds.
        int restInterval = 1;
        //Used for the test_ program bit that was commented out.
        String numStr;
        //Used to hold a character from the substring of textToWrite found below
        char c;
        //Used to hold the char ASCII character code.
        int charInt;

        //Pick a delay time.
        boolean ultralong = false;
        boolean realisticDelay = false;
        boolean smallDelay = true;
        boolean superShort = false;

        if (ultralong == true) {
            restInterval = 10000;
        } else if (realisticDelay == true) {
            restInterval = 1000;
        } else if (smallDelay == true) {
            restInterval = 500;
        } else if (superShort == true) {
            restInterval = 50;
        }

        //This must be all capitals because of how the JVM(?) interprets ASCII character key codes(?).
        //Get random emotes using ;0 (semicolon zero)
        //After program use, hit left SHIFT since the robot doesn't always let go.
        String filename = "";
        BufferedReader br = null;

        while (true) {
            //O(textToWrite)
            String[] array = getTextDoc(filename);

            for (int z = 0; z < array.length; z++) {
                if(array[z].length() != 0){           
                    for (int i = 0; i < array[z].length(); i++) {
                        c = array[z].charAt(i);
                        charInt = (int) c;
                        try{
                            robot.keyPress(charInt);
                            robot.keyRelease(charInt);
                        } catch(Exception e) {
                            keyPress(robot, c);
                        }
                    }
                }

                robot.keyPress(10); //Enter aka Carriage return

                if (ultralong == true) {
                    Thread.sleep(restInterval);
                    if (Math.random() < .5 && restInterval <= 500000) {
                        restInterval += Math.floor(Math.random() * 100000.0);
                    } else if (restInterval >= 100000) {
                        restInterval -= Math.floor(Math.random() * 100000.0);
                    }
                }
                if (realisticDelay == true) {
                    Thread.sleep(restInterval);
                    if (Math.random() < .5 && restInterval <= 1500) {
                        restInterval += Math.floor(Math.random() * 100.0);
                    } else if (restInterval >= 700) {
                        restInterval -= Math.floor(Math.random() * 100.0);
                    }
                }
                if (smallDelay == true) {
                    Thread.sleep(restInterval);
                    if (Math.random() < .5 && restInterval <= 500) {
                        restInterval += Math.floor(Math.random() * 100.0);
                    } else if (restInterval >= 100) {
                        restInterval -= Math.floor(Math.random() * 100.0);
                    }
                } else if (superShort == true) {
                    Thread.sleep(restInterval);
                    if (Math.random() < .5 && restInterval <= 100) {
                        restInterval += Math.floor(Math.random() * 10.0);
                    } else if (restInterval >= 1) {
                        restInterval -= Math.floor(Math.random() * 10.0);
                    }
                    if (restInterval < 1) {
                        restInterval = 1;
                    }
                }
            }
        }
    }
}
