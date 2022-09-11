public class Main {
    public static void main(String[] args) {
        var weightOfOneBoxer = 78.2;
        var weigtOfTwoBoxer = 82.7;
        var totalWeightOfBoxers = weightOfOneBoxer + weigtOfTwoBoxer;
        System.out.println("общий вес боксеров " + totalWeightOfBoxers + " кг" );
        var weightDifference = weigtOfTwoBoxer - weightOfOneBoxer;
        System.out.println("разница в весе боксеров " + weightDifference + " кг");
        var difference = weigtOfTwoBoxer % weightOfOneBoxer;
        System.out.println("разница в весе боксеров " + difference + " кг");
        var allHours = 640;
        System.out.println("всего рабочих часов " + allHours);
        var allWorker = allHours / 8;
        System.out.println("всего работников в компании " + allWorker + " человек");
        var worker = allWorker + 94;
        var hours = worker * 8;
        System.out.println("если в компании работает " + worker + " человек, то всего " + hours + " часов работы может быть поделено между сотрудниками");





    }
}