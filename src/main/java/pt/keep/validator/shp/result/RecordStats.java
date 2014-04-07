package pt.keep.validator.shp.result;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "recordStats")
public class RecordStats {

	private int total;
	private int counterNullShape;
	private int counterPointShape;
	private int counterPolylineShape;
	private int counterPolygonShape;
	private int counterMultiPointShape;
	private int counterPointZShape;

	private int counterPolyLineZShape;
	private int counterPolygonZShape;
	private int counterMultiPointZShape;
	private int counterPointMShape;
	private int counterPolyLineMShape;
	private int counterPolygonMShape;
	private int counterMultiPointMShape;
	private int counterMultiPatchShape;

	public RecordStats() {
		this.total = 0;
		this.counterNullShape = 0;
		this.counterPointShape = 0;
		this.counterPolylineShape = 0;
		this.counterPolygonShape = 0;
		this.counterMultiPointShape = 0;
		this.counterPointZShape = 0;
		this.counterPolyLineZShape = 0;
		this.counterPolygonZShape = 0;
		this.counterMultiPointZShape = 0;
		this.counterPointMShape = 0;
		this.counterPolyLineMShape = 0;
		this.counterPolygonMShape = 0;
		this.counterMultiPointMShape = 0;
		this.counterMultiPatchShape = 0;
	}

	public RecordStats(int total, int counterNullShape, int counterPointShape,
			int counterPolylineShape, int counterPolygonShape,
			int counterMultiPointShape, int counterPointZShape,
			int counterPolyLineZShape, int counterPolygonZShape,
			int counterMultiPointZShape, int counterPointMShape,
			int counterPolyLineMShape, int counterPolygonMShape,
			int counterMultiPointMShape, int counterMultiPatchShape) {
		this.total = total;
		this.counterNullShape = counterNullShape;
		this.counterPointShape = counterPointShape;
		this.counterPolylineShape = counterPolylineShape;
		this.counterPolygonShape = counterPolygonShape;
		this.counterMultiPointShape = counterMultiPointShape;
		this.counterPointZShape = counterPointZShape;
		this.counterPolyLineZShape = counterPolyLineZShape;
		this.counterPolygonZShape = counterPolygonZShape;
		this.counterMultiPointZShape = counterMultiPointZShape;
		this.counterPointMShape = counterPointMShape;
		this.counterPolyLineMShape = counterPolyLineMShape;
		this.counterPolygonMShape = counterPolygonMShape;
		this.counterMultiPointMShape = counterMultiPointMShape;
		this.counterMultiPatchShape = counterMultiPatchShape;
	}

	@XmlElement
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@XmlElement
	public int getCounterNullShape() {
		return counterNullShape;
	}

	public void setCounterNullShape(int counterNullShape) {
		this.counterNullShape = counterNullShape;
	}

	@XmlElement
	public int getCounterPointShape() {
		return counterPointShape;
	}

	public void setCounterPointShape(int counterPointShape) {
		this.counterPointShape = counterPointShape;
	}

	@XmlElement
	public int getCounterPolylineShape() {
		return counterPolylineShape;
	}

	public void setCounterPolylineShape(int counterPolylineShape) {
		this.counterPolylineShape = counterPolylineShape;
	}

	@XmlElement
	public int getCounterPolygonShape() {
		return counterPolygonShape;
	}

	public void setCounterPolygonShape(int counterPolygonShape) {
		this.counterPolygonShape = counterPolygonShape;
	}

	@XmlElement
	public int getCounterMultiPointShape() {
		return counterMultiPointShape;
	}

	public void setCounterMultiPointShape(int counterMultiPointShape) {
		this.counterMultiPointShape = counterMultiPointShape;
	}

	@XmlElement
	public int getCounterPointZShape() {
		return counterPointZShape;
	}

	public void setCounterPointZShape(int counterPointZShape) {
		this.counterPointZShape = counterPointZShape;
	}

	@XmlElement
	public int getCounterPolyLineZShape() {
		return counterPolyLineZShape;
	}

	public void setCounterPolyLineZShape(int counterPolyLineZShape) {
		this.counterPolyLineZShape = counterPolyLineZShape;
	}

	@XmlElement
	public int getCounterPolygonZShape() {
		return counterPolygonZShape;
	}

	public void setCounterPolygonZShape(int counterPolygonZShape) {
		this.counterPolygonZShape = counterPolygonZShape;
	}

	@XmlElement
	public int getCounterMultiPointZShape() {
		return counterMultiPointZShape;
	}

	public void setCounterMultiPointZShape(int counterMultiPointZShape) {
		this.counterMultiPointZShape = counterMultiPointZShape;
	}

	@XmlElement
	public int getCounterPointMShape() {
		return counterPointMShape;
	}

	public void setCounterPointMShape(int counterPointMShape) {
		this.counterPointMShape = counterPointMShape;
	}

	@XmlElement
	public int getCounterPolyLineMShape() {
		return counterPolyLineMShape;
	}

	public void setCounterPolyLineMShape(int counterPolyLineMShape) {
		this.counterPolyLineMShape = counterPolyLineMShape;
	}

	@XmlElement
	public int getCounterPolygonMShape() {
		return counterPolygonMShape;
	}

	public void setCounterPolygonMShape(int counterPolygonMShape) {
		this.counterPolygonMShape = counterPolygonMShape;
	}

	@XmlElement
	public int getCounterMultiPointMShape() {
		return counterMultiPointMShape;
	}

	public void setCounterMultiPointMShape(int counterMultiPointMShape) {
		this.counterMultiPointMShape = counterMultiPointMShape;
	}

	public int getCounterMultiPatchShape() {
		return counterMultiPatchShape;
	}

	public void setCounterMultiPatchShape(int counterMultiPatchShape) {
		this.counterMultiPatchShape = counterMultiPatchShape;
	}

}
