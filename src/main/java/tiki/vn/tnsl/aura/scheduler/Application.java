package tiki.vn.tnsl.aura.scheduler;

import tiki.vn.tnsl.aura.scheduler.algorithm.MasoraAlgorithm;
import tiki.vn.tnsl.aura.scheduler.algorithm.model.input.masora.MasoraAlgorithmInput;
import tiki.vn.tnsl.aura.scheduler.algorithm.model.output.RoutingPlanResult;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hi Master!");
        MasoraAlgorithm masoraAlgorithm = new MasoraAlgorithm();
        RoutingPlanResult result = masoraAlgorithm.createRoutingPlan(new MasoraAlgorithmInput());
        System.out.println(result);
    }
}
