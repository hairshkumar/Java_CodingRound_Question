package com.example.coding.oops;

public class Time {

	int seconds;
	int minutes;
	int hours;

	public Time(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	public Time(int milliSecond) {
		this.hours= milliSecond / 3600;
		this.minutes = (milliSecond % 3600) / 60;
		this.seconds= (milliSecond % 3600) % 60;
	}
	
	public int toMilliSecond() {
		int milliSec=seconds;
		milliSec+=(minutes*60);
		milliSec+=(hours*3600);
		return milliSec;
	}

	public void showTime() {
		System.out.printf("%d:%d:%d",hours,minutes,seconds);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Time start = new Time(8, 12, 15);
		Time stop = new Time(12, 34, 55);
		start.showTime();
		stop.showTime();
		Time diff = minus(stop,start);
		System.out.print("T1-T2= ");
		diff.showTime();
	}

	public static Time minus(Time start, Time stop) {
		int startMilli=start.toMilliSecond();
		int stopMilli=stop.toMilliSecond();
		if(stopMilli>startMilli)
			return new Time(stopMilli-startMilli);
		return new Time(startMilli-stopMilli);
	}
}
