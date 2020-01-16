package game_objects;

import utils.Point3D;

public class Robot
{
	public int getDest() {
		return dest;
	}
	public int getSrc() {
		return src;
	}
	public int getId() {
		return id;
	}
	public double getSpeed() {
		return speed;
	}
	public Point3D getPos() {
		return pos;
	}
	public void setDest(int dest) {
		this.dest = dest;
	}
	public void setSrc(int src) {
		this.src = src;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public void setPos(Point3D pos) {
		this.pos = pos;
	}

	public Robot()
	{
		dest = -1;
		src = -1;
		id=0;
		speed=0;
		pos = Point3D.ORIGIN;
		value=0;
	}
	public Robot(int dest, int src, int id, double speed, Point3D pos,double value) {
		super();
		this.dest = dest;
		this.src = src;
		this.id = id;
		this.speed = speed;
		this.pos = pos;
		this.value=value;
	}
	int dest;
	int src;
	int id;
	double speed;
	Point3D pos;
	double value;
	
	
}
