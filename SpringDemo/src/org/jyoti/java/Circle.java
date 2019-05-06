package org.jyoti.java;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Component
public class Circle implements Shape,ApplicationEventPublisherAware {
	
	private Point centre;
	@Autowired
    private MessageSource messageSource;
	
	private ApplicationEventPublisher publisher;

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public Point getCentre() {
		return centre;
	}
	
	/*@Autowired
	@Qualifier("circleRelated")*/
	@Resource(name="pointC")
	public void setCentre(Point centre) {
		this.centre = centre;
	}
	@PostConstruct
	public void initializeCircle()
	{
		System.out.println("Initializing circle---");
	}
	@PreDestroy
	public void destroyCircle()
	{
		System.out.println("destroying circle---");
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle... ("+centre.getX()+","+centre.getY()+" )");
		System.out.println(this.messageSource.getMessage("Greeting", null,"Default message!",null));
		DrawEvent drawEvent = new DrawEvent(this);
		publisher.publishEvent(drawEvent);

	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		// TODO Auto-generated method stub
		this.publisher=publisher;
	}

}
