package com.jenkins.model;

import java.util.Map;

import org.springframework.lang.Nullable;

public class OverallLoad {

	private String _class;
	
	   @Nullable
	    public  Map<String, String> availableExecutors;

	    @Nullable
	    public  Map<String, String> busyExecutors;

	    @Nullable
	    public  Map<String, String> connectingExecutors;

	    @Nullable
	    public  Map<String, String> definedExecutors;

	    @Nullable
	    public  Map<String, String> idleExecutors;

	    @Nullable
	    public  Map<String, String> onlineExecutors;

	    @Nullable
	    public  Map<String, String> queueLength;

	    @Nullable
	    public  Map<String, String> totalExecutors;

	    @Nullable
	    public  Map<String, String> totalQueueLength;

		public String get_class() {
			return _class;
		}

		public void set_class(String _class) {
			this._class = _class;
		}

		public Map<String, String> getAvailableExecutors() {
			return availableExecutors;
		}

		public void setAvailableExecutors(Map<String, String> availableExecutors) {
			this.availableExecutors = availableExecutors;
		}

		public Map<String, String> getBusyExecutors() {
			return busyExecutors;
		}

		public void setBusyExecutors(Map<String, String> busyExecutors) {
			this.busyExecutors = busyExecutors;
		}

		public Map<String, String> getConnectingExecutors() {
			return connectingExecutors;
		}

		public void setConnectingExecutors(Map<String, String> connectingExecutors) {
			this.connectingExecutors = connectingExecutors;
		}

		public Map<String, String> getDefinedExecutors() {
			return definedExecutors;
		}

		public void setDefinedExecutors(Map<String, String> definedExecutors) {
			this.definedExecutors = definedExecutors;
		}

		public Map<String, String> getIdleExecutors() {
			return idleExecutors;
		}

		public void setIdleExecutors(Map<String, String> idleExecutors) {
			this.idleExecutors = idleExecutors;
		}

		public Map<String, String> getOnlineExecutors() {
			return onlineExecutors;
		}

		public void setOnlineExecutors(Map<String, String> onlineExecutors) {
			this.onlineExecutors = onlineExecutors;
		}

		public Map<String, String> getQueueLength() {
			return queueLength;
		}

		public void setQueueLength(Map<String, String> queueLength) {
			this.queueLength = queueLength;
		}

		public Map<String, String> getTotalExecutors() {
			return totalExecutors;
		}

		public void setTotalExecutors(Map<String, String> totalExecutors) {
			this.totalExecutors = totalExecutors;
		}

		public Map<String, String> getTotalQueueLength() {
			return totalQueueLength;
		}

		public void setTotalQueueLength(Map<String, String> totalQueueLength) {
			this.totalQueueLength = totalQueueLength;
		}
	    
	    
	    


	

}
