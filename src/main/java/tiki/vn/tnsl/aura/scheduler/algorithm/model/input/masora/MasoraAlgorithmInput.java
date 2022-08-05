package tiki.vn.tnsl.aura.scheduler.algorithm.model.input.masora;

import java.util.List;
import java.util.Map;

public class MasoraAlgorithmInput {

    private String requestCode;
    private List<InputDriversItem> drivers;
    private List<InputBoxesItem> boxes;
    private List<HexagonsItem> hexagons;
    private InputHub hub;
    private Map<String/*hex_id*/, Map<String /*hex_id*/, Double /*distance*/>> distanceMetricMap;

    public MasoraAlgorithmInput() {
    }

    public MasoraAlgorithmInput(String requestCode, List<InputDriversItem> drivers, List<InputBoxesItem> boxes, List<HexagonsItem> hexagons, InputHub hub, Map<String, Map<String, Double>> distanceMetricMap) {
        this.requestCode = requestCode;
        this.drivers = drivers;
        this.boxes = boxes;
        this.hexagons = hexagons;
        this.hub = hub;
        this.distanceMetricMap = distanceMetricMap;
    }

    public String getRequestCode() {
        return requestCode;
    }

    public MasoraAlgorithmInput setRequestCode(String requestCode) {
        this.requestCode = requestCode;
        return this;
    }

    public List<InputDriversItem> getDrivers() {
        return drivers;
    }

    public MasoraAlgorithmInput setDrivers(List<InputDriversItem> drivers) {
        this.drivers = drivers;
        return this;
    }

    public List<InputBoxesItem> getBoxes() {
        return boxes;
    }

    public MasoraAlgorithmInput setBoxes(List<InputBoxesItem> boxes) {
        this.boxes = boxes;
        return this;
    }

    public List<HexagonsItem> getHexagons() {
        return hexagons;
    }

    public MasoraAlgorithmInput setHexagons(List<HexagonsItem> hexagons) {
        this.hexagons = hexagons;
        return this;
    }

    public InputHub getHub() {
        return hub;
    }

    public MasoraAlgorithmInput setHub(InputHub hub) {
        this.hub = hub;
        return this;
    }

    public Map<String, Map<String, Double>> getDistanceMetricMap() {
        return distanceMetricMap;
    }

    public MasoraAlgorithmInput setDistanceMetricMap(Map<String, Map<String, Double>> distanceMetricMap) {
        this.distanceMetricMap = distanceMetricMap;
        return this;
    }
}
