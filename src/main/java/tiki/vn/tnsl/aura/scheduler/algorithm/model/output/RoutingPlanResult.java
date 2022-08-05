package tiki.vn.tnsl.aura.scheduler.algorithm.model.output;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RoutingPlanResult {

    @JsonProperty("routing_plan")
    private RoutingPlan routingPlan;

    @JsonProperty("request_code")
    private String requestCode;

    public void setRoutingPlan(RoutingPlan routingPlan) {
        this.routingPlan = routingPlan;
    }

    public RoutingPlan getRoutingPlan() {
        return routingPlan;
    }

    public void setRequestCode(String requestCode) {
        this.requestCode = requestCode;
    }

    public String getRequestCode() {
        return requestCode;
    }

    @Override
    public String toString() {
        return
                "Response{" +
                        "routing_plan = '" + routingPlan + '\'' +
                        ",request_code = '" + requestCode + '\'' +
                        "}";
    }
}