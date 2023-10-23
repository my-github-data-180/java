package com.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

public class CandidateDao implements AutoCloseable {
	private Connection con;
	
	
	public CandidateDao() throws SQLException {
		con = DBUtil.getConnection();
	}
	
	
	@Override
	public void close() {
		try {
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int save(Candidate c)throws SQLException {
		String sql="INSERT INTO candidates values(default, ?,?,?)";
		try(PreparedStatement stmt =con.prepareStatement(sql))
		{ 
			stmt.setString(1,c.getName());
			stmt.setString(2, c.getParty());
			stmt.setInt(3, c.getVotes());
			int cnt=stmt.executeUpdate();
			return cnt;
		}
	}
	
	
	public int update(Candidate c) throws SQLException {
		  String sqm ="UPDATE candidates SET name=?,party=? where id=?";
		  try(PreparedStatement stm=con.prepareStatement(sqm)){
			  stm.setString(1,c.getName());
			  stm.setString(2,c.getParty());
			  stm.setInt(3,c.getId());
			  int cnt=stm.executeUpdate();
			  return cnt;
		  }
	}
	
	
	public List<PartyVotes> getpartyWisevotes() throws SQLException {
		String sqw="select party,sum(votes) as votes from candidates group by party";
		List<PartyVotes> list =new ArrayList<PartyVotes>();
		try(PreparedStatement stmm =con.prepareStatement(sqw)){
			try(ResultSet rs =  stmm.executeQuery()){
				while(rs.next()) {
					String party=rs.getString("party");
					int votes =rs.getInt("votes");    //table columns we get are party and sum(votes) ---so we have to make AS(alias) or give("sum(votes)")in this line 
					PartyVotes p= new PartyVotes(party,votes);
					list.add(p);
				}
				return list;
			}
		      				
	}
	}
}

