package racingcar;

import java.util.Random;

public class Game {
    private static int roundCount;
    private static Random random = new Random();

    public static Cars cars = new Cars();

    public static int getRoundCount(){
        return Game.roundCount;
    }

    public static void setRoundCount(int roundCount){
        Game.roundCount = roundCount;
    }

    public static void setCars(int count){
            cars.createCars(count);
    }

    public static void playRound(){
        for (int i = 0; i < cars.getSize(); i++) {
            randomFoward(cars.getCar(i));
            drawResult(cars.getCar(i));
            ResultView.drawLineBreak();
        }
        ResultView.drawLineBreak();
    }

    public static void randomFoward(Car car){
        car.move(RandomGenerator.getRandomNumber());
    }

    public static void drawResult(Car car){
        ResultView.drawTravelDistance(car);
    }

    public void playGame(){

        InputView.viewCountCarInputMessage();
        InputView.viewCountCarInput();
        InputView.viewCountCar();

        InputView.viewCountRoundInputMessage();
        InputView.viewCountRoundInput();
        InputView.viewCountRound();

        ResultView.viewResultMessage();

        for (int i = 0; i < Game.roundCount; i++) {
            playRound();
        }
    }
}