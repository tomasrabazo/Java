package com.enumexamples;

import java.util.Map;
import java.util.TreeMap;

public class Example1 {
	
	public enum ActionsType {
		LOGON(1, "logon"), 
        LOGOUT(2, "logout"), 
		MESSAGE(3, "");

		private int id;
		private String action;

		private ActionsType(int id, String action) {
			this.id = id;
			this.action = action;
		}

		public int getId() {
			return id;
		}

		public String getAction() {
			return action;
		}

		private static Map<Integer, ActionsType> mapOfActionsType = new TreeMap<Integer, ActionsType>();

		static {
			for (ActionsType type : ActionsType.values()) {
				mapOfActionsType.put(type.getId(), type);
			}
		}

		static public ActionsType getFromId(int _id) {
			return mapOfActionsType.get(_id);
		}
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Example1.ActionsType.getFromId(1));
		System.out.println(Example1.ActionsType.LOGON.getAction());
	}

}
