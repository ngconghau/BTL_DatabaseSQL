/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import CODE.BAOHANH.BH;
import CODE.HOADON.CTHD;
import CODE.HOADON.HD;
import CODE.HOADON.udhd;
import CODE.KHACHHANG.KH;
import CODE.KHACHHANG.SPKHBH;
import CODE.KHO.K;
import CODE.NHACC.NCC;
import CODE.NHANVIEN.NH;
import CODE.NHANVIEN.NV;
import CODE.SANPHAM.MUASP;
import CODE.SANPHAM.SP;
import CODE.THANHTOAN.MT;
import CODE.THANHTOAN.PTTT;
import CODE.THANHTOAN.TG;
import CODE.THANHTOAN.lantragop;
import CODE.THANHTOAN.table1;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class controller implements Serializable {
    
    
    private Connection conn ;
    public   controller(){
       
                
        try {
             conn = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=QUANLYCUAHANGDIENTHOAI;username=sa;password=hau@@123");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
        public boolean addNV(NV s){
          
       String sql="insert into NHANVIEN values(?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,s.getHODEM());
            ps.setString(2,s.getTEN());
            ps.setString(3,s.getMANV());
            ps.setString(4,s.getCHUCVU());
            ps.setString(5,  s.getNGAYSINH());
            ps.setString(6,  s.getNGAYLAM());
            ps.setString(7,s.getDIACHI());
            ps.setString(8,s.getGT());
            ps.setString(9,s.getSDT());
            ps.setInt(10,s.getLUONG());
            return ps.executeUpdate() >0;
        } catch (Exception e) {
             e.printStackTrace();
        }
        return false;
        
    }           
        public  ArrayList<NV> getNV(){
        ArrayList<NV> list =new ArrayList<NV>();
          String sql="select *from NHANVIEN ";
         try {
              PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
             while (rs.next()) {
                 NV s=new NV();
            s.setHODEM(rs.getString("HOTENDEM"));
            s.setTEN(rs.getString("TEN"));
            s.setMANV(rs.getString("MANV"));
            s.setCHUCVU(rs.getString("CHUCVU"));
            s.setNGAYSINH(rs.getString("NGAYSINH"));
            s.setNGAYLAM(rs.getString("NGAYLAM"));
            s.setDIACHI(rs.getString("DIACHI"));
            s.setGT(rs.getString("GT"));
            s.setLUONG(rs.getInt("LUONG"));

                  list.add(s);
             }
        } catch (Exception e) {
             e.printStackTrace();
        }
      return  list;
    }
      
      
    public boolean addKH(KH s){
          
       String sql="insert into KHACHHANG values(?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,s.getTENKH());
            ps.setString(2,s.getMAKH());
            ps.setString(3,s.getSDT());
            ps.setString(4,s.getSOCMNN());
            ps.setString(5,s.getDIACHI());
             return ps.executeUpdate() >0;
        } catch (Exception e) {
             e.printStackTrace();
        }
        return false;
        
    }
    public  ArrayList<KH> getKH(){
        ArrayList<KH> list =new ArrayList<KH>();
          String sql="select *from KHACHHANG ";
         try {
             PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
             while (rs.next()) {
                 KH s=new KH();
            s.setTENKH(rs.getString("TENKH"));
            s.setMAKH(rs.getString("MAKH"));
            s.setSDT(rs.getString("SDT"));
            s.setSOCMNN(rs.getString("SOCMNN"));
            s.setDIACHI(rs.getString("DIACHI"));
                  list.add(s);
             }
        } catch (Exception e) {
             e.printStackTrace();
        }
      return  list;
    } 
       
       
        public boolean addSP(SP s){
          
       String sql="insert into SANPHAM values(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,s.getTENSP());
            ps.setString(2,s.getMASP());
            ps.setString(3,s.getMAKHO());
            ps.setInt(4,s.getTHOILUONGBH());
            ps.setString(5,s.getHANGSP());
            ps.setInt(6,s.getGIA());
            
            return ps.executeUpdate() >0;
        } catch (Exception e) {
             e.printStackTrace();
        }
        return false;
        
    }   
        public  ArrayList<SP> getSP(){
        ArrayList<SP> list =new ArrayList<SP>();
          String sql="select *from SANPHAM ";
         try {
             PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
             while (rs.next()) {
                 SP s=new SP();
            s.setTENSP(rs.getString("TENSP"));
            s.setMASP(rs.getString("MASP"));
            s.setMAKHO(rs.getString("MAKHO"));
            s.setTHOILUONGBH(rs.getInt("THOILUONGBH"));
            s.setHANGSP(rs.getString("HANGSP"));
            s.setGIA(rs.getInt("GIA"));
           

                  list.add(s);
             }
        } catch (Exception e) {
             e.printStackTrace();
        }
      return  list;
    }   
               public  ArrayList<SP> getSPdb(){
        ArrayList<SP> list =new ArrayList<SP>();
          String sql="select *from SANPHAM where MASP  in(select MASP from MUASP) ";
         try {
             PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
             while (rs.next()) {
                 SP s=new SP();
            s.setTENSP(rs.getString("TENSP"));
            s.setMASP(rs.getString("MASP"));
            s.setMAKHO(rs.getString("MAKHO"));
            s.setTHOILUONGBH(rs.getInt("THOILUONGBH"));
            s.setHANGSP(rs.getString("HANGSP"));
            s.setGIA(rs.getInt("GIA"));
           

                  list.add(s);
             }
        } catch (Exception e) {
             e.printStackTrace();
        }
      return  list;
    } 
                    public  ArrayList<SP> getSPc(){
        ArrayList<SP> list =new ArrayList<SP>();
          String sql="select *from SANPHAM where MASP not in(select MASP from MUASP) ";
         try {
             PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
             while (rs.next()) {
                 SP s=new SP();
            s.setTENSP(rs.getString("TENSP"));
            s.setMASP(rs.getString("MASP"));
            s.setMAKHO(rs.getString("MAKHO"));
            s.setTHOILUONGBH(rs.getInt("THOILUONGBH"));
            s.setHANGSP(rs.getString("HANGSP"));
            s.setGIA(rs.getInt("GIA"));
           

                  list.add(s);
             }
        } catch (Exception e) {
             e.printStackTrace();
        }
      return  list;
    }   
          
    public boolean addSPKHBH(SPKHBH s){
          
       String sql="insert into SP_KH_BH values(?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,s.getMABH());
            ps.setString(2,s.getMASP());
            ps.setString(3,s.getMAKH());
            
            return ps.executeUpdate() >0;
        } catch (Exception e) {
             e.printStackTrace();
        }
        return false;
        
    }  
    public  ArrayList<SPKHBH> getSPKHBH(){
        ArrayList<SPKHBH> list =new ArrayList<SPKHBH>();
          String sql="select *from SP_BH_KH ";
         try {
             PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
             while (rs.next()) {
                 SPKHBH s=new SPKHBH();
            s.setMABH(rs.getString("MABH"));
            s.setMASP(rs.getString("MASP"));
            s.setMAKH(rs.getString("MAKH"));
                  list.add(s);
             }
        } catch (Exception e) {
             e.printStackTrace();
        }
      return  list;
    }
       
       
        public boolean addHD(HD s){
          
       String sql="insert into HOADON values(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,s.getMAHD());
            ps.setString(2,s.getMANV());
            ps.setString(3,s.getMAKH());
            ps.setString(4,s.getMATG());
            ps.setString(5,s.getMAMT());
            ps.setInt(6,  s.getTONGTIEN());
            ps.setString(7, s.getNGAY());
            ps.setString(8,s.getHTTT());
            return ps.executeUpdate() >0;
        } catch (Exception e) {
             e.printStackTrace();
        }
        return false;
        
    }
        public  ArrayList<HD> getHD(){
        ArrayList<HD> list =new ArrayList<HD>();
          String sql="select *from HOADON ";
         try {
             PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
             while (rs.next()) {
                 HD s=new HD();
            s.setMAHD(rs.getString("MAHD"));
            s.setMANV(rs.getString("MANV"));
            s.setMAKH(rs.getString("MAKH"));
            s.setMATG(rs.getString("MATG"));
            s.setMAMT(rs.getString("MAMT"));
            s.setTONGTIEN(rs.getInt("TONGTIEN"));
            s.setNGAY(rs.getString("NGAY"));
            s.setHTTT(rs.getString("HTTT"));
                  list.add(s);
                  
             }
        } catch (Exception e) {
             e.printStackTrace();
        }
      return  list;
    }
             
             
    public boolean addCTHD(CTHD s){
          
       String sql="insert into CHITIETHD values(?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,s.getMASP());
            ps.setString(2,s.getMAHD());
            ps.setInt(3,s.getTHANHTIEN());
            
            return ps.executeUpdate() >0;
        } catch (Exception e) {
             e.printStackTrace();
        }
        return false;
        
    }      
    public  ArrayList<CTHD> getCTHD(){
        ArrayList<CTHD> list =new ArrayList<CTHD>();
          String sql="select *from CHITIETHD ";
         try {
             PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
             while (rs.next()) {
                 CTHD s=new CTHD();
            s.setMASP(rs.getString("MASP"));
            s.setMAHD(rs.getString("MAHD"));
            s.setTHANHTIEN(rs.getInt("THANHTIEN"));
                  list.add(s);
                  
             }
        } catch (Exception e) {
             e.printStackTrace();
        }
      return  list;
    }
                
                
        public boolean addBH(BH s){
          
       String sql="insert into BAOHANH values(?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,s.getMABH());
            
            ps.setString(2,s.getMASP());
            ps.setString(3,s.getMAKH());
           ps.setString(4,s.getTGBD());
            ps.setString(5,s.getTGKT());
            return ps.executeUpdate() >0;
        } catch (Exception e) {
             e.printStackTrace();
        }
        return false;
        
    }    
        public  ArrayList<BH> getBH(){
        ArrayList<BH> list =new ArrayList<BH>();
          String sql="select *from BAOHANH ";
         try {
             PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
             while (rs.next()) {
                 BH s=new BH();
            s.setMABH(rs.getString("BH"));
            s.setMASP(rs.getString("MASP"));
            s.setMAKH(rs.getString("MAKH"));
            s.setTGBD(rs.getString("NGAYBD"));
            s.setTGKT(rs.getString("NGAYKT"));
                  list.add(s);
                  
             }
        } catch (Exception e) {
             e.printStackTrace();
        }
      return  list;
    }
         
    public boolean addKHO(K s){
          
       String sql="insert into KHO values(?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,s.getMAKHO());
            ps.setString(2,s.getDIACHI());
            ps.setInt(3,s.getSDT());
            return ps.executeUpdate() >0;
        } catch (Exception e) {
             e.printStackTrace();
        }
        return false;
        
    }     
    public  ArrayList<K> getKHO(){
        ArrayList<K> list =new ArrayList<K>();
          String sql="select *from KHO ";
         try {
             PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
             while (rs.next()) {
                 K s=new K();
            s.setMAKHO(rs.getString("MAKHO"));
            s.setDIACHI(rs.getString("DIACHI"));
            s.setSDT(rs.getInt("SDT"));
                  list.add(s);
                  
             }
        } catch (Exception e) {
             e.printStackTrace();
        }
      return  list;
    }
    
        public boolean addNHACC(NCC s){
          
       String sql="insert into NHACC values(?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,s.getTENNHACC());
            ps.setString(2,s.getMANHACC());
            ps.setString(3,s.getDIACHI());
            ps.setInt(4,s.getSDT());
            return ps.executeUpdate() >0;
        } catch (Exception e) {
             e.printStackTrace();
        }
        return false;
        
    }  
        public  ArrayList<NCC> getNHACC(){
        ArrayList<NCC> list =new ArrayList<NCC>();
          String sql="select *from NHACC ";
         try {
             PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
             while (rs.next()) {
                 NCC s=new NCC();
            s.setTENNHACC(rs.getString("TENNHACC"));
            s.setMANHACC(rs.getString("MANHACC"));
            s.setDIACHI(rs.getString("DIACHI"));
            s.setSDT(rs.getInt("SDT"));
            
                  list.add(s);
                  
             }
        } catch (Exception e) {
             e.printStackTrace();
        }
      return  list;
    }
           
    public boolean addNH(NH s){
          
       String sql="insert into NHAPHANG values(?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,s.getMANV());
            ps.setString(2,s.getMANHACC());
            ps.setString(3,s.getMASP());
           ps.setString(4,s.getNGAYN());
            return ps.executeUpdate() >0;
        } catch (Exception e) {
             e.printStackTrace();
        }
        return false;
        
    }   
    public  ArrayList<NH> getNHAPHANG(){
        ArrayList<NH> list =new ArrayList<NH>();
          String sql="select *from NHAPHANG ";
         try {
             PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
             while (rs.next()) {
                 NH s=new NH();
            s.setMANV(rs.getString("MANV"));
            s.setMANHACC(rs.getString("MANHACC"));
            s.setMASP(rs.getString("MASP"));
            s.setNGAYN(rs.getString("NGAYN"));
            
                  list.add(s);
                  
             }
        } catch (Exception e) {
             e.printStackTrace();
        }
      return  list;
    }
    
        public boolean addMUASP(MUASP s){
          
       String sql="insert into MUASP values(?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,s.getMASP());
            ps.setString(2,s.getMAKH());
           ps.setString(3,s.getNGAYMUA());
           
            return ps.executeUpdate() >0;
        } catch (Exception e) {
             e.printStackTrace();
        }
        return false;
        
    }      
        public  ArrayList<MUASP> getMUASP(){
        ArrayList<MUASP> list =new ArrayList<MUASP>();
          String sql="select *from MUASP ";
         try {
             PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
             while (rs.next()) {
                 MUASP s=new MUASP();
            s.setMASP(rs.getString("MASP"));
            s.setMAKH(rs.getString("MAKH"));
            s.setNGAYMUA(rs.getString("NGAYMUA"));
            
                  list.add(s);
                  
             }
        } catch (Exception e) {
             e.printStackTrace();
        }
      return  list;
    }
        
    public boolean addMT(MT s){
          
       String sql="insert into MUATHUONG values(?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,s.getMAMT());
            ps.setInt(2,s.getQUATANG());
     
            return ps.executeUpdate() >0;
        } catch (Exception e) {
             e.printStackTrace();
        }
        return false;
        
    } 
    public  ArrayList<MT> getMUATHUONG(){
        ArrayList<MT> list =new ArrayList<MT>();
          String sql="select *from MUATHUONG ";
         try {
             PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
             while (rs.next()) {
                 MT s=new MT();
            s.setMAMT(rs.getString("MAMT"));
            s.setQUATANG(rs.getInt("QUATANG"));
            
                  list.add(s);
                  
             }
        } catch (Exception e) {
             e.printStackTrace();
        }
      return  list;
    }
    
        public boolean addMUATG(TG s){
          
       String sql="insert into MUATRAGOP values(?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,s.getMATG());
            ps.setInt(2,s.getKIHAN());
           ps.setInt(3,s.getLAISUAT());
           ps.setInt(4,s.getTIENTRATRUOC());
            ps.setInt(5,s.getTIENDATRA());
            return ps.executeUpdate() >0;
        } catch (Exception e) {
             e.printStackTrace();
        }
        return false;
        
    }  
        public  ArrayList<TG> getMUATRAGOP(){
        ArrayList<TG> list =new ArrayList<TG>();
          String sql="select *from MUATRAGOP ";
         try {
             PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
             while (rs.next()) {
                 TG s=new TG();
            s.setMATG(rs.getString("MATG"));
            s.setKIHAN(rs.getInt("KIHAN"));
            s.setLAISUAT(rs.getInt("LAISUAT"));
            s.setTIENTRATRUOC(rs.getInt("TIENTRATRUOC"));
            s.setTIENDATRA(rs.getInt("TIENDATRA"));
                  list.add(s);
                  
             }
        } catch (Exception e) {
             e.printStackTrace();
        }
      return  list;
    }
        
    public boolean addPTTT(PTTT s){
          
       String sql="insert into PHUONGTHUCTT values(?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,s.getMAHD());
             ps.setString(2,s.getMATG());
              ps.setString(3,s.getMAMT());
              
            return ps.executeUpdate() >0;
        } catch (Exception e) {
             e.printStackTrace();
        }
        return false;
        
    } 
    public  ArrayList<PTTT> getPTTT(){
        ArrayList<PTTT> list =new ArrayList<PTTT>();
          String sql="select *from PHUONGTHUCTT ";
         try {
             PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
             while (rs.next()) {
                 PTTT s=new PTTT();
            s.setMAHD(rs.getString("MAHD"));
            s.setMATG(rs.getString("MATG"));
            s.setMAMT(rs.getString("MAMT"));
                  list.add(s);
                  
             }
        } catch (Exception e) {
             e.printStackTrace();
        }
      return  list;
    }
     public void deletemsp(String s){
           String sql="delete from MUASP where MASP= ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s);
           ps.execute();
            ps.close();
        } catch (Exception e) {
             e.printStackTrace();
        }
         
     }
      public void deletecthd(String s){
           String sql="delete from CHITIETHD where MASP= ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s);
            ps.execute();
            ps.close();
        } catch (Exception e) {
             e.printStackTrace();
        }
       
         
     }
     
       public void updateptttmt(String s1,String s2){
          String sql="update PHUONGTHUCTT set MAMT=? where MAHD=? ";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s1);
            ps.setString(2, s2);
             ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
             e.printStackTrace();
        }
        
         
     }
       public void updatepttttg(String s1,String s2){
          String sql="update PHUONGTHUCTT set MATG= ? where MAHD=? ";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s1);
            ps.setString(2, s2);
             ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
             e.printStackTrace();
        }
        
         
     }
       
       public boolean updatehdmt(udhd s) {
          String sql="update HOADON set MAMT= ?,TONGTIEN=? ,HTTT=? where MAHD=? ";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getMamt());
            ps.setInt(2, s.getTongtien());
            ps.setString(3, s.getHttt());
            ps.setString(4, s.getMahd());
             ps.executeUpdate();
            ps.close();
            return ps.executeUpdate() >0;
            
           } catch (Exception e) {
             e.printStackTrace();
        }  
        
        return  false;
         
     }
       public void updatehdtg(udhd s){
          String sql="update HOADON set MATG=? ,TONGTIEN=? ,HTTT=? where MAHD=? ";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
           
            ps.setString(1, s.getMatg());
            ps.setInt(2, s.getTongtien());
            ps.setString(3, s.getHttt());
            ps.setString(4, s.getMahd());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
             e.printStackTrace();
        }
       
         
     }
       public void updatemuatg(int s1,String s2){
           String sql="update MUATRAGOP set TIENDATRA=? where MATG=? ";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
           
            ps.setInt(1, s1);
            ps.setString(2, s2);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
             e.printStackTrace();
        }  
       }
       
       public ArrayList<lantragop> getlantragop(){
               String sql="SELECT TENKH,K.MAKH,H.MAHD,M.MATG,TONGTIEN,LAISUAT,KIHAN,TIENTRATRUOC,TIENDATRA FROM KHACHHANG K ,MUATRAGOP M,HOADON H WHERE K.MAKH=H.MAKH AND M.MATG=H.MATG";
               ArrayList list=new ArrayList();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
           
           ResultSet rs = ps.executeQuery();
             while (rs.next()) {
                 lantragop s=new lantragop();
           s.setTenkh(rs.getString("TENKH"));
            s.setMakh(rs.getString("MAKH"));
             s.setMahd(rs.getString("MAHD"));
              s.setMatg(rs.getString("MATG"));
               s.setTongtien(rs.getInt("TONGTIEN"));
                s.setLaixuat(rs.getInt("LAISUAT"));
                 s.setKihan(rs.getInt("KIHAN"));
                  s.setSotientratruoc(rs.getInt("TIENTRATRUOC"));
                   s.setSotiendatra(rs.getInt("TIENDATRA"));
                  list.add(s);
            
             }
        } catch (Exception e) {
             e.printStackTrace();
        }  
        return list;
       }
       
       public ArrayList<table1> gettable(){
               String sql="SELECT TENKH,SDT,H.MAHD,THANHTIEN,C.MASP FROM KHACHHANG K ,CHITIETHD C,HOADON H WHERE K.MAKH=H.MAKH AND  C.MAHD=H.MAHD and TONGTIEN =0 ";
               ArrayList list=new ArrayList();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
           
           ResultSet rs = ps.executeQuery();
             while (rs.next()) {
                table1 s=new table1();
                s.setTen(rs.getString("TENKH"));
                s.setSdt("0"+rs.getString("SDT"));
                s.setMasp(rs.getString("MASP"));
                s.setMahd(rs.getString("MAHD"));
                s.setGia(rs.getInt("THANHTIEN"));
                  list.add(s);
            
             }
        } catch (Exception e) {
             e.printStackTrace();
        }  
        return list;
       }
       
     public static void main(String[] args) {
        new controller();
    }

    public void addNHACC(K KHO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

