package kanbanSimulator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.lang.Math;
import bsh.This;

import ausim.xtext.kanban.domainmodel.kanbanmodel.*;
import ausim.xtext.kanban.domainmodel.kanbanmodel.impl.*;

public class KSSTrigger {
	
	private boolean executed;	
	private boolean repetitive;
	private LinkedList<KSSTask> triggered;
	private double atProgress;
	private double onProbability;
	
	public KSSTrigger (Causality ct) {
		this.executed = false;
		this.repetitive = false;
		this.triggered = new LinkedList<KSSTask>();
		this.atProgress = ct.getTProgress()/100;
		this.onProbability = ct.getTProbability()/100;
	}


	public void setExecuted() {
		this.executed = true;
	}
	public boolean isRepetitive() {
		return this.repetitive;
	}
	public LinkedList<KSSTask> getTriggered() {
		return this.triggered;
	}
	public void addTriggered(KSSTask e) {
		this.getTriggered().add(e);
	}
	public double getAtProgress() {
		return this.atProgress;
	}
	public double getOnProbability() {
		return this.onProbability;
	}
}