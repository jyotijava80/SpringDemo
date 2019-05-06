package org.jyoti.java;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements Shape, ApplicationContextAware, BeanNameAware,InitializingBean,DisposableBean{
	
	//List<Point> pointList;
	private ApplicationContext context;
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	/*public List<Point> getPointList() {
		return pointList;
	}



	public void setPointList(List<Point> pointList) {
		this.pointList = pointList;
	}*/

	private String type;
	private int height;
	
	
	public int getHeight() {
		return height;
	}

	

	public String getType() {
		return type;
	}

	/*public void setType(String type) {
		this.type = type;
	}*/

	public void draw()
	{
		/*
		for(Point a:pointList)
		{
			System.out.println("point A is ("+a.getX()+ ", "+a.getY()+" )");
		}*/
		
		//System.out.println(getType()+"   Drawing Triangle of height--> "+getHeight()+" )");
		System.out.println("Drawing the triangle....");
		System.out.println("point A is ("+getPointA().getX()+ ", "+getPointA().getY()+" )");
		System.out.println("point B is ("+getPointB().getX()+ ", "+getPointB().getY()+" )");
		System.out.println("point C is ("+getPointC().getX()+ ", "+getPointC().getY()+" )");
	}

	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context=context;
		
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("Bean name is -->"+beanName);
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean init method called for Triangle..");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean's destroy method called for Triangle..");
	}
	
	public void myInit()
	{
		System.out.println("InitializingBean init method called for Triangle..");
	}
	public void myDestroy()
	{
		System.out.println("Destroy method called for Triangle..");
	}

}
