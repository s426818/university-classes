
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TexasHoldemSolver8HiddenTest {


  @Test
  public void test_texas_holdem_2000_5s7h9hJhQh_2c8c_3h9c_4d5h_2s6c_3d4h_8h5c() {
    assertEquals(
      "2s6c 2c8c 3h9c 3d4h 4d5h 8h5c",
      Solver.process("texas-holdem 5s7h9hJhQh 2c8c 3h9c 4d5h 2s6c 3d4h 8h5c"));
  }

  @Test
  public void test_texas_holdem_2001_3h4h5dAsTs_7c3d_Kh6c_8sKc() {
    assertEquals(
      "Kh6c 8sKc 7c3d",
      Solver.process("texas-holdem 3h4h5dAsTs 7c3d Kh6c 8sKc"));
  }

  @Test
  public void test_texas_holdem_2002_5s9sJcQsTh_Ac5d_2hTc_Td3c_9d6h_9c2c_7c4d_4cJd() {
    assertEquals(
      "7c4d Ac5d 9c2c=9d6h 2hTc=Td3c 4cJd",
      Solver.process("texas-holdem 5s9sJcQsTh Ac5d 2hTc Td3c 9d6h 9c2c 7c4d 4cJd"));
  }

  @Test
  public void test_texas_holdem_2003_3d9dKhQcTd_6h6c_3cKs_2sJs() {
    assertEquals(
      "6h6c 3cKs 2sJs",
      Solver.process("texas-holdem 3d9dKhQcTd 6h6c 3cKs 2sJs"));
  }

  @Test
  public void test_texas_holdem_2004_6d8c8h9sKc_4d3c_5d6s_Tc4c_2hAd_8dJc_2d5c_9hAc_AhTs_QhJh() {
    assertEquals(
      "2d5c=4d3c Tc4c QhJh 2hAd AhTs 5d6s 9hAc 8dJc",
      Solver.process("texas-holdem 6d8c8h9sKc 4d3c 5d6s Tc4c 2hAd 8dJc 2d5c 9hAc AhTs QhJh"));
  }

  @Test
  public void test_texas_holdem_2005_6c7cJcJdQc_8c7h_8d7s_QdAh_9cKd_Kh9h_Ts4d() {
    assertEquals(
      "Ts4d Kh9h 8d7s QdAh 8c7h 9cKd",
      Solver.process("texas-holdem 6c7cJcJdQc 8c7h 8d7s QdAh 9cKd Kh9h Ts4d"));
  }

  @Test
  public void test_texas_holdem_2006_2d5c7d9sJs_4d6d_7h7c_9d9c_6c2h_KdKc_3d2s_6h9h() {
    assertEquals(
      "4d6d 3d2s=6c2h 6h9h KdKc 7h7c 9d9c",
      Solver.process("texas-holdem 2d5c7d9sJs 4d6d 7h7c 9d9c 6c2h KdKc 3d2s 6h9h"));
  }

  @Test
  public void test_texas_holdem_2007_2d3c7c8cAd_5c9h_Th7s_9s4c_Jc8s_7hAh_Kd9c_JhTs_4s6c() {
    assertEquals(
      "4s6c 9s4c 5c9h JhTs Kd9c Th7s Jc8s 7hAh",
      Solver.process("texas-holdem 2d3c7c8cAd 5c9h Th7s 9s4c Jc8s 7hAh Kd9c JhTs 4s6c"));
  }

  @Test
  public void test_texas_holdem_2008_7cAdJhKdQh_9s9d_8sJc_7dTc() {
    assertEquals(
      "9s9d 8sJc 7dTc",
      Solver.process("texas-holdem 7cAdJhKdQh 9s9d 8sJc 7dTc"));
  }

  @Test
  public void test_texas_holdem_2009_4h5d6d9hJs_3c5s_6s6c() {
    assertEquals(
      "3c5s 6s6c",
      Solver.process("texas-holdem 4h5d6d9hJs 3c5s 6s6c"));
  }

  @Test
  public void test_texas_holdem_2010_2h5c5s7dAd_3c9s_KcAc_4hJh_2s6d_8d3d_9c7s_QdTh_5dKd_Ts2c() {
    assertEquals(
      "8d3d 3c9s 4hJh QdTh 2s6d=Ts2c 9c7s KcAc 5dKd",
      Solver.process("texas-holdem 2h5c5s7dAd 3c9s KcAc 4hJh 2s6d 8d3d 9c7s QdTh 5dKd Ts2c"));
  }

  @Test
  public void test_texas_holdem_2011_4d5cJcJsQc_As6h_KhAc() {
    assertEquals(
      "As6h KhAc",
      Solver.process("texas-holdem 4d5cJcJsQc As6h KhAc"));
  }

  @Test
  public void test_texas_holdem_2012_4c6hJdQhTs_Ac4d_Td7s_8cKd_Jc6s_As5s_2s9d_2c9c() {
    assertEquals(
      "2c9c=2s9d 8cKd As5s Ac4d Td7s Jc6s",
      Solver.process("texas-holdem 4c6hJdQhTs Ac4d Td7s 8cKd Jc6s As5s 2s9d 2c9c"));
  }

  @Test
  public void test_texas_holdem_2013_4c8c9h9sQh_6h7h_2s5h_8sQd() {
    assertEquals(
      "2s5h 6h7h 8sQd",
      Solver.process("texas-holdem 4c8c9h9sQh 6h7h 2s5h 8sQd"));
  }

  @Test
  public void test_texas_holdem_2014_3h5d8c8dKd_6hKh_Ts4d_5hQh_TcJd_5s8s_4sJh_Js8h_AdTh() {
    assertEquals(
      "Ts4d 4sJh TcJd AdTh 5hQh 6hKh Js8h 5s8s",
      Solver.process("texas-holdem 3h5d8c8dKd 6hKh Ts4d 5hQh TcJd 5s8s 4sJh Js8h AdTh"));
  }

  @Test
  public void test_texas_holdem_2015_3s5d8dQsTc_2hAd_6sJd_7s2c_Kd5c() {
    assertEquals(
      "7s2c 6sJd 2hAd Kd5c",
      Solver.process("texas-holdem 3s5d8dQsTc 2hAd 6sJd 7s2c Kd5c"));
  }

  @Test
  public void test_texas_holdem_2016_2h4h5s6c7h_KhJc_7dAs_8c4s_QcTs_3cAd_9hKc() {
    assertEquals(
      "QcTs 9hKc KhJc 7dAs 3cAd 8c4s",
      Solver.process("texas-holdem 2h4h5s6c7h KhJc 7dAs 8c4s QcTs 3cAd 9hKc"));
  }

  @Test
  public void test_texas_holdem_2017_5d7c8d9cQc_5s9h_5cKd() {
    assertEquals(
      "5cKd 5s9h",
      Solver.process("texas-holdem 5d7c8d9cQc 5s9h 5cKd"));
  }

  @Test
  public void test_texas_holdem_2018_3c3d7dJsTs_8h7h_8c7s_Ah9s_8d6d() {
    assertEquals(
      "8d6d Ah9s 8c7s=8h7h",
      Solver.process("texas-holdem 3c3d7dJsTs 8h7h 8c7s Ah9s 8d6d"));
  }

  @Test
  public void test_texas_holdem_2019_3s6s8cKsTc_JdQc_6cTs_6h9c_Ah7h() {
    assertEquals(
      "JdQc Ah7h 6h9c 6cTs",
      Solver.process("texas-holdem 3s6s8cKsTc JdQc 6cTs 6h9c Ah7h"));
  }

  @Test
  public void test_texas_holdem_2020_3h8cJcQhTh_6d4c_QdKc_Ac9c_7d4h_4s2c_7c3s_JsTc_5h5s_2s4d() {
    assertEquals(
      "2s4d=4s2c 6d4c 7d4h 7c3s 5h5s QdKc JsTc Ac9c",
      Solver.process("texas-holdem 3h8cJcQhTh 6d4c QdKc Ac9c 7d4h 4s2c 7c3s JsTc 5h5s 2s4d"));
  }

  @Test
  public void test_texas_holdem_2021_2s3h6hJcQh_5s3d_7s8d_Td8c_2hJd_AhQd() {
    assertEquals(
      "7s8d Td8c 5s3d AhQd 2hJd",
      Solver.process("texas-holdem 2s3h6hJcQh 5s3d 7s8d Td8c 2hJd AhQd"));
  }

  @Test
  public void test_texas_holdem_2022_6h8hJhKdQd_Kc6c_Ad7h_Jd2s_AcTs_7s4s() {
    assertEquals(
      "7s4s Ad7h Jd2s Kc6c AcTs",
      Solver.process("texas-holdem 6h8hJhKdQd Kc6c Ad7h Jd2s AcTs 7s4s"));
  }

  @Test
  public void test_texas_holdem_2023_2s3s6sKcKh_AhQs_7d9s_9d8h() {
    assertEquals(
      "7d9s 9d8h AhQs",
      Solver.process("texas-holdem 2s3s6sKcKh AhQs 7d9s 9d8h"));
  }

  @Test
  public void test_texas_holdem_2024_2d3c4d7sTd_4c5s_Tc6s_4sJs_6h7h_5d9s_Ad7d_9dAc_2sJc_3sQs() {
    assertEquals(
      "5d9s 9dAc 2sJc 3sQs 4c5s 4sJs 6h7h Tc6s Ad7d",
      Solver.process("texas-holdem 2d3c4d7sTd 4c5s Tc6s 4sJs 6h7h 5d9s Ad7d 9dAc 2sJc 3sQs"));
  }

  @Test
  public void test_texas_holdem_2025_2s7c7dKcTd_7s9s_9cKs_QsJs_3s8h_8sAd_6h6s_Jd4h() {
    assertEquals(
      "3s8h Jd4h QsJs 8sAd 6h6s 9cKs 7s9s",
      Solver.process("texas-holdem 2s7c7dKcTd 7s9s 9cKs QsJs 3s8h 8sAd 6h6s Jd4h"));
  }

  @Test
  public void test_texas_holdem_2026_4h5h7d8hJh_Ad3d_8cTs_6h3h_Ah2c() {
    assertEquals(
      "Ad3d 8cTs 6h3h Ah2c",
      Solver.process("texas-holdem 4h5h7d8hJh Ad3d 8cTs 6h3h Ah2c"));
  }

  @Test
  public void test_texas_holdem_2027_8s9hAhAsTd_Jd6s_4c2s_7c7s_3dQc_9d4d_9c6h_2d4s_8cKs_6dTh() {
    assertEquals(
      "2d4s=4c2s Jd6s 3dQc 7c7s 8cKs 9c6h=9d4d 6dTh",
      Solver.process("texas-holdem 8s9hAhAsTd Jd6s 4c2s 7c7s 3dQc 9d4d 9c6h 2d4s 8cKs 6dTh"));
  }

  @Test
  public void test_texas_holdem_2028_2d5c6d9hAh_3c4d_6sKc_5d7d_2c9c_7hQh_5s6h_QdJs_6c8h_4hKs() {
    assertEquals(
      "7hQh QdJs 4hKs 5d7d 6c8h 6sKc 5s6h 2c9c 3c4d",
      Solver.process("texas-holdem 2d5c6d9hAh 3c4d 6sKc 5d7d 2c9c 7hQh 5s6h QdJs 6c8h 4hKs"));
  }

  @Test
  public void test_texas_holdem_2029_6d6sQcQhTs_3h7c_Ad5s_Kh6c_9s2h_9c8c_3s2s_7hTd_Jd2d_4c5h() {
    assertEquals(
      "3h7c=3s2s=4c5h=9c8c=9s2h Jd2d Ad5s 7hTd Kh6c",
      Solver.process("texas-holdem 6d6sQcQhTs 3h7c Ad5s Kh6c 9s2h 9c8c 3s2s 7hTd Jd2d 4c5h"));
  }

  @Test
  public void test_texas_holdem_2030_3s5s6d9sTd_Ac6c_5d3c_QcKd_AhJd_3d4d_4s8s_Qd7s_8c8h() {
    assertEquals(
      "Qd7s QcKd AhJd 3d4d Ac6c 8c8h 5d3c 4s8s",
      Solver.process("texas-holdem 3s5s6d9sTd Ac6c 5d3c QcKd AhJd 3d4d 4s8s Qd7s 8c8h"));
  }

  @Test
  public void test_texas_holdem_2031_2h5h6cJcTd_8cAh_8dQh_JhKd_Ks3c_9c2c() {
    assertEquals(
      "8dQh Ks3c 8cAh 9c2c JhKd",
      Solver.process("texas-holdem 2h5h6cJcTd 8cAh 8dQh JhKd Ks3c 9c2c"));
  }

  @Test
  public void test_texas_holdem_2032_6cJhJsKcQs_5dQc_8c4s_3d8s_KdAc_Jc6d() {
    assertEquals(
      "3d8s=8c4s 5dQc KdAc Jc6d",
      Solver.process("texas-holdem 6cJhJsKcQs 5dQc 8c4s 3d8s KdAc Jc6d"));
  }

  @Test
  public void test_texas_holdem_2033_6cAdTdThTs_4c5s_8cAc_Kh4h_5c7c_5dJc() {
    assertEquals(
      "4c5s 5c7c 5dJc Kh4h 8cAc",
      Solver.process("texas-holdem 6cAdTdThTs 4c5s 8cAc Kh4h 5c7c 5dJc"));
  }

  @Test
  public void test_texas_holdem_2034_4c6h7sAsTs_JsJc_5h3s_Ks8d_9h4s_5d3h() {
    assertEquals(
      "Ks8d 9h4s JsJc 5d3h=5h3s",
      Solver.process("texas-holdem 4c6h7sAsTs JsJc 5h3s Ks8d 9h4s 5d3h"));
  }

  @Test
  public void test_texas_holdem_2035_3sJcQcTcTs_QhTd_Ad9d_9s8s() {
    assertEquals(
      "Ad9d 9s8s QhTd",
      Solver.process("texas-holdem 3sJcQcTcTs QhTd Ad9d 9s8s"));
  }

  @Test
  public void test_texas_holdem_2036_2c3c4s5sJd_8hTc_7s3s() {
    assertEquals(
      "8hTc 7s3s",
      Solver.process("texas-holdem 2c3c4s5sJd 8hTc 7s3s"));
  }

  @Test
  public void test_texas_holdem_2037_5c6c7hJsTh_2cJc_5d4d_4s8c_2d2s_Ts8h_6hTd_4c3h() {
    assertEquals(
      "2d2s 5d4d Ts8h 2cJc 6hTd 4c3h 4s8c",
      Solver.process("texas-holdem 5c6c7hJsTh 2cJc 5d4d 4s8c 2d2s Ts8h 6hTd 4c3h"));
  }

  @Test
  public void test_texas_holdem_2038_6cJcJsKsQh_Tc9h_3c5s_Qc7d_7h5d_8c5c_6h2s_TsKc_6d6s_8sQd() {
    assertEquals(
      "3c5s 7h5d 8c5c 6h2s 8sQd=Qc7d TsKc Tc9h 6d6s",
      Solver.process("texas-holdem 6cJcJsKsQh Tc9h 3c5s Qc7d 7h5d 8c5c 6h2s TsKc 6d6s 8sQd"));
  }

  @Test
  public void test_texas_holdem_2039_4d4h7sAsJh_Qs5d_ThAc_8h4s_3dJc_3c6h_6c3s() {
    assertEquals(
      "3c6h=6c3s Qs5d 3dJc ThAc 8h4s",
      Solver.process("texas-holdem 4d4h7sAsJh Qs5d ThAc 8h4s 3dJc 3c6h 6c3s"));
  }

  @Test
  public void test_texas_holdem_2040_5c9cJdKhTs_7dKc_3c8d() {
    assertEquals(
      "3c8d 7dKc",
      Solver.process("texas-holdem 5c9cJdKhTs 7dKc 3c8d"));
  }

  @Test
  public void test_texas_holdem_2041_4c4h8sAdAs_Tc8c_7c2c_4s7h() {
    assertEquals(
      "7c2c Tc8c 4s7h",
      Solver.process("texas-holdem 4c4h8sAdAs Tc8c 7c2c 4s7h"));
  }

  @Test
  public void test_texas_holdem_2042_2s6s7h9cQd_Th7c_4dAh_Qc3h_9hQh_4hKd_6dKh_6h3d() {
    assertEquals(
      "4hKd 4dAh 6h3d 6dKh Th7c Qc3h 9hQh",
      Solver.process("texas-holdem 2s6s7h9cQd Th7c 4dAh Qc3h 9hQh 4hKd 6dKh 6h3d"));
  }

  @Test
  public void test_texas_holdem_2043_6d9dKcKsQd_2c3h_8c7h_6hAc_6s5c_Ad4s() {
    assertEquals(
      "2c3h 8c7h Ad4s 6s5c 6hAc",
      Solver.process("texas-holdem 6d9dKcKsQd 2c3h 8c7h 6hAc 6s5c Ad4s"));
  }

  @Test
  public void test_texas_holdem_2044_2c4c9dJhKs_6dJc_6s3s_8s7c_7s5c_TcQc_4dKc_TsAs_5s7h_Qd5h() {
    assertEquals(
      "6s3s 5s7h=7s5c 8s7c Qd5h TsAs 6dJc 4dKc TcQc",
      Solver.process("texas-holdem 2c4c9dJhKs 6dJc 6s3s 8s7c 7s5c TcQc 4dKc TsAs 5s7h Qd5h"));
  }

  @Test
  public void test_texas_holdem_2045_AcJdQhQsTd_QdQc_3s5c_Ad7d_Ks9h_6c2c() {
    assertEquals(
      "3s5c=6c2c Ad7d Ks9h QdQc",
      Solver.process("texas-holdem AcJdQhQsTd QdQc 3s5c Ad7d Ks9h 6c2c"));
  }

  @Test
  public void test_texas_holdem_2046_5c6h8dKcTs_Th8h_4d9h_2c6s() {
    assertEquals(
      "4d9h 2c6s Th8h",
      Solver.process("texas-holdem 5c6h8dKcTs Th8h 4d9h 2c6s"));
  }

  @Test
  public void test_texas_holdem_2047_2s3c8h9hTh_Qs5s_8s3h_7s4c_4s3d_2cKd_7c6s_AsQd() {
    assertEquals(
      "7s4c Qs5s AsQd 2cKd 4s3d 8s3h 7c6s",
      Solver.process("texas-holdem 2s3c8h9hTh Qs5s 8s3h 7s4c 4s3d 2cKd 7c6s AsQd"));
  }

  @Test
  public void test_texas_holdem_2048_4s7cKdKhTs_2h2c_9s5s_AcQh_Ah6h_5cAs() {
    assertEquals(
      "9s5s 5cAs=Ah6h AcQh 2h2c",
      Solver.process("texas-holdem 4s7cKdKhTs 2h2c 9s5s AcQh Ah6h 5cAs"));
  }

  @Test
  public void test_texas_holdem_2049_8hAhJdKhTh_JhQs_4h3s_As6c_Kd8d_6h7d_Kc2d() {
    assertEquals(
      "Kc2d As6c Kd8d 4h3s 6h7d JhQs",
      Solver.process("texas-holdem 8hAhJdKhTh JhQs 4h3s As6c Kd8d 6h7d Kc2d"));
  }

  @Test
  public void test_texas_holdem_2050_3c9h9sKhKs_5d8h_Qc7s_JcAh() {
    assertEquals(
      "5d8h Qc7s JcAh",
      Solver.process("texas-holdem 3c9h9sKhKs 5d8h Qc7s JcAh"));
  }

  @Test
  public void test_texas_holdem_2051_4s6c8h9cQh_9s5c_9hTs_3hTh() {
    assertEquals(
      "3hTh 9s5c 9hTs",
      Solver.process("texas-holdem 4s6c8h9cQh 9s5c 9hTs 3hTh"));
  }

  @Test
  public void test_texas_holdem_2052_2c2h4c6hTs_7s6d_7hKh_5c3h_3sQc() {
    assertEquals(
      "3sQc 7hKh 7s6d 5c3h",
      Solver.process("texas-holdem 2c2h4c6hTs 7s6d 7hKh 5c3h 3sQc"));
  }

  @Test
  public void test_texas_holdem_2053_JcJdJhQsTc_4s2h_4h7h_6h2d_9h5d_2cQc_8hKs_6d4c() {
    assertEquals(
      "4h7h=4s2h=6d4c=6h2d=9h5d 8hKs 2cQc",
      Solver.process("texas-holdem JcJdJhQsTc 4s2h 4h7h 6h2d 9h5d 2cQc 8hKs 6d4c"));
  }

  @Test
  public void test_texas_holdem_2054_7h8hAcAsKd_9s2d_5sTc_2c3c_6hQs_4dJh_5hTh() {
    assertEquals(
      "2c3c 9s2d 5hTh=5sTc 4dJh 6hQs",
      Solver.process("texas-holdem 7h8hAcAsKd 9s2d 5sTc 2c3c 6hQs 4dJh 5hTh"));
  }

  @Test
  public void test_texas_holdem_2055_5s8sAcJhJs_KhTc_5d2c_5h6h_6cAh() {
    assertEquals(
      "KhTc 5d2c=5h6h 6cAh",
      Solver.process("texas-holdem 5s8sAcJhJs KhTc 5d2c 5h6h 6cAh"));
  }

  @Test
  public void test_texas_holdem_2056_3c7c9cJsQs_9s2h_5s6c_AsQc_TsTh_JdTd_8h8c_Ad8d() {
    assertEquals(
      "5s6c Ad8d 8h8c 9s2h TsTh JdTd AsQc",
      Solver.process("texas-holdem 3c7c9cJsQs 9s2h 5s6c AsQc TsTh JdTd 8h8c Ad8d"));
  }

  @Test
  public void test_texas_holdem_2057_2d3c3dAsTc_4cQs_9dJd_8c2h_QcJc_9h8d() {
    assertEquals(
      "9h8d 9dJd 4cQs QcJc 8c2h",
      Solver.process("texas-holdem 2d3c3dAsTc 4cQs 9dJd 8c2h QcJc 9h8d"));
  }

  @Test
  public void test_texas_holdem_2058_5s6cAsJdKh_3s5c_Td2d_2c8s_7d7h_5hJs_KcAh() {
    assertEquals(
      "2c8s Td2d 3s5c 7d7h 5hJs KcAh",
      Solver.process("texas-holdem 5s6cAsJdKh 3s5c Td2d 2c8s 7d7h 5hJs KcAh"));
  }

  @Test
  public void test_texas_holdem_2059_4d6cAcAdKh_AsJd_8s8d_Tc3d() {
    assertEquals(
      "Tc3d 8s8d AsJd",
      Solver.process("texas-holdem 4d6cAcAdKh AsJd 8s8d Tc3d"));
  }

  @Test
  public void test_texas_holdem_2060_4c8h9dQdQh_As4h_2d3c_9h3s_TcTd_7d8c_7s5c_5s7h_6h6c_AdAh() {
    assertEquals(
      "2d3c 5s7h=7s5c As4h 6h6c 7d8c 9h3s TcTd AdAh",
      Solver.process("texas-holdem 4c8h9dQdQh As4h 2d3c 9h3s TcTd 7d8c 7s5c 5s7h 6h6c AdAh"));
  }

  @Test
  public void test_texas_holdem_2061_3d3h6hAcQd_Th6s_2cAh_KdKs_As5d_Ad8s_4sQh_7h8h() {
    assertEquals(
      "7h8h Th6s 4sQh KdKs 2cAh=Ad8s=As5d",
      Solver.process("texas-holdem 3d3h6hAcQd Th6s 2cAh KdKs As5d Ad8s 4sQh 7h8h"));
  }

  @Test
  public void test_texas_holdem_2062_2s5h7d8dJd_Ac2c_JsTc_6d5c() {
    assertEquals(
      "Ac2c 6d5c JsTc",
      Solver.process("texas-holdem 2s5h7d8dJd Ac2c JsTc 6d5c"));
  }

  @Test
  public void test_texas_holdem_2063_3d4s7s9hQc_Jd6s_Jh8s_3hTh() {
    assertEquals(
      "Jd6s Jh8s 3hTh",
      Solver.process("texas-holdem 3d4s7s9hQc Jd6s Jh8s 3hTh"));
  }

  @Test
  public void test_texas_holdem_2064_3d6cJhQcTh_4dKd_7d9d_7h3s() {
    assertEquals(
      "7d9d 4dKd 7h3s",
      Solver.process("texas-holdem 3d6cJhQcTh 4dKd 7d9d 7h3s"));
  }

  @Test
  public void test_texas_holdem_2065_6d6s7s8s9h_KsQd_9d3s_Th2d_3dJd_Kc8d() {
    assertEquals(
      "3dJd KsQd Kc8d 9d3s Th2d",
      Solver.process("texas-holdem 6d6s7s8s9h KsQd 9d3s Th2d 3dJd Kc8d"));
  }

  @Test
  public void test_texas_holdem_2066_4c4s5s6sAh_6h9h_3cKh() {
    assertEquals(
      "3cKh 6h9h",
      Solver.process("texas-holdem 4c4s5s6sAh 6h9h 3cKh"));
  }

  @Test
  public void test_texas_holdem_2067_3c6d9dKhQc_KsJs_2d3s_5sQd_2sAd() {
    assertEquals(
      "2sAd 2d3s 5sQd KsJs",
      Solver.process("texas-holdem 3c6d9dKhQc KsJs 2d3s 5sQd 2sAd"));
  }

  @Test
  public void test_texas_holdem_2068_3d7d8cKdKs_9h3c_Jc4c_Th9d_Kc7h_AcJd() {
    assertEquals(
      "Th9d Jc4c AcJd 9h3c Kc7h",
      Solver.process("texas-holdem 3d7d8cKdKs 9h3c Jc4c Th9d Kc7h AcJd"));
  }

  @Test
  public void test_texas_holdem_2069_9sAdKcKdQs_Ah8s_3h9d_7hAs_5c3c_Th3s_8c7c() {
    assertEquals(
      "5c3c=8c7c Th3s 3h9d 7hAs=Ah8s",
      Solver.process("texas-holdem 9sAdKcKdQs Ah8s 3h9d 7hAs 5c3c Th3s 8c7c"));
  }

  @Test
  public void test_texas_holdem_2070_2d3h6s8sTh_4h9c_As6h() {
    assertEquals(
      "4h9c As6h",
      Solver.process("texas-holdem 2d3h6s8sTh 4h9c As6h"));
  }

  @Test
  public void test_texas_holdem_2071_2h5d6s8hJd_6d4d_Td4h_ThTc_TsJh_Ah9d_QhQs_Qc6h_QdKs() {
    assertEquals(
      "Td4h QdKs Ah9d 6d4d Qc6h ThTc TsJh QhQs",
      Solver.process("texas-holdem 2h5d6s8hJd 6d4d Td4h ThTc TsJh Ah9d QhQs Qc6h QdKs"));
  }

  @Test
  public void test_texas_holdem_2072_2c6s8d9dAs_7dQc_9c9h_2d6h_2h3d_7hTs_5sJs_Qh9s_5h5c_7cKh() {
    assertEquals(
      "5sJs 7dQc 7cKh 2h3d 5h5c Qh9s 2d6h 9c9h 7hTs",
      Solver.process("texas-holdem 2c6s8d9dAs 7dQc 9c9h 2d6h 2h3d 7hTs 5sJs Qh9s 5h5c 7cKh"));
  }

  @Test
  public void test_texas_holdem_2073_3c3h5s7sQd_2s2c_Qs3d_8c4h_4cTs_Jh8d_9s5c_6c7c_Td7d_KhJc() {
    assertEquals(
      "8c4h 4cTs Jh8d KhJc 2s2c 9s5c 6c7c=Td7d Qs3d",
      Solver.process("texas-holdem 3c3h5s7sQd 2s2c Qs3d 8c4h 4cTs Jh8d 9s5c 6c7c Td7d KhJc"));
  }

  @Test
  public void test_texas_holdem_2074_5c7dAdKdTs_QcAc_Kh7s_9dKs_Jc6s_2dAs() {
    assertEquals(
      "Jc6s 9dKs 2dAs QcAc Kh7s",
      Solver.process("texas-holdem 5c7dAdKdTs QcAc Kh7s 9dKs Jc6s 2dAs"));
  }

  @Test
  public void test_texas_holdem_2075_4h8h9sAsTc_KdKh_6d8s_2h4d_6hQs_9c5c_7s2d_8d4s_9d4c() {
    assertEquals(
      "7s2d 6hQs 2h4d 6d8s 9c5c KdKh 8d4s 9d4c",
      Solver.process("texas-holdem 4h8h9sAsTc KdKh 6d8s 2h4d 6hQs 9c5c 7s2d 8d4s 9d4c"));
  }

  @Test
  public void test_texas_holdem_2076_2c4c6dJhTd_4hQh_9d6c_9c4s_2h5d_8s8h_6s9s_6h9h_3dTh_5h3c() {
    assertEquals(
      "2h5d 9c4s 4hQh 6h9h=6s9s=9d6c 8s8h 3dTh 5h3c",
      Solver.process("texas-holdem 2c4c6dJhTd 4hQh 9d6c 9c4s 2h5d 8s8h 6s9s 6h9h 3dTh 5h3c"));
  }

  @Test
  public void test_texas_holdem_2077_2h2s7sJsQd_9d4h_QcJh_7h3h_Kh8d_6sQh_ThQs_3d5d_9c4c_7c7d() {
    assertEquals(
      "3d5d 9c4c=9d4h Kh8d 7h3h 6sQh=ThQs QcJh 7c7d",
      Solver.process("texas-holdem 2h2s7sJsQd 9d4h QcJh 7h3h Kh8d 6sQh ThQs 3d5d 9c4c 7c7d"));
  }

  @Test
  public void test_texas_holdem_2078_2c4c6d8cJh_5cKs_QhTc() {
    assertEquals(
      "QhTc 5cKs",
      Solver.process("texas-holdem 2c4c6d8cJh 5cKs QhTc"));
  }

  @Test
  public void test_texas_holdem_2079_4s5c7hKdTc_Th5d_Ts7d_7cJc_2hQh_Ad7s_Ac4d() {
    assertEquals(
      "2hQh Ac4d 7cJc Ad7s Th5d Ts7d",
      Solver.process("texas-holdem 4s5c7hKdTc Th5d Ts7d 7cJc 2hQh Ad7s Ac4d"));
  }

  @Test
  public void test_texas_holdem_2080_6d7cJhKsQh_TsJc_4hQs() {
    assertEquals(
      "TsJc 4hQs",
      Solver.process("texas-holdem 6d7cJhKsQh TsJc 4hQs"));
  }

  @Test
  public void test_texas_holdem_2081_2c4c8hJdQc_Jc8c_3cJh() {
    assertEquals(
      "3cJh Jc8c",
      Solver.process("texas-holdem 2c4c8hJdQc Jc8c 3cJh"));
  }

  @Test
  public void test_texas_holdem_2082_2s3c3d4c4h_KsJh_Ts7c_2c9s_8d5d_9c6s_6hQh_7d6c() {
    assertEquals(
      "7d6c 8d5d 2c9s=9c6s Ts7c 6hQh KsJh",
      Solver.process("texas-holdem 2s3c3d4c4h KsJh Ts7c 2c9s 8d5d 9c6s 6hQh 7d6c"));
  }

  @Test
  public void test_texas_holdem_2083_2c8sQhQsTs_8d5c_8hKc_7dJh_8c4c_Jd9c_4dKs() {
    assertEquals(
      "7dJh 4dKs 8c4c=8d5c 8hKc Jd9c",
      Solver.process("texas-holdem 2c8sQhQsTs 8d5c 8hKc 7dJh 8c4c Jd9c 4dKs"));
  }

  @Test
  public void test_texas_holdem_2084_2c2h5c7dJc_9hJd_9sJs_AhAc() {
    assertEquals(
      "9hJd=9sJs AhAc",
      Solver.process("texas-holdem 2c2h5c7dJc 9hJd 9sJs AhAc"));
  }

  @Test
  public void test_texas_holdem_2085_2h5dJsKcKs_Th6c_7sTs() {
    assertEquals(
      "Th6c 7sTs",
      Solver.process("texas-holdem 2h5dJsKcKs Th6c 7sTs"));
  }

  @Test
  public void test_texas_holdem_2086_5s8s9dKdQc_6h3s_7hQs() {
    assertEquals(
      "6h3s 7hQs",
      Solver.process("texas-holdem 5s8s9dKdQc 6h3s 7hQs"));
  }

  @Test
  public void test_texas_holdem_2087_4d4s9cAhAs_5c6c_3h3d() {
    assertEquals(
      "3h3d=5c6c",
      Solver.process("texas-holdem 4d4s9cAhAs 5c6c 3h3d"));
  }

  @Test
  public void test_texas_holdem_2088_3c4h9hQsTc_Jd2h_7h3d_Ts8c_5s6s_JcAs_Ks7s_Ad8d_8s6c_Kd7c() {
    assertEquals(
      "5s6s 8s6c Jd2h Kd7c=Ks7s Ad8d JcAs 7h3d Ts8c",
      Solver.process("texas-holdem 3c4h9hQsTc Jd2h 7h3d Ts8c 5s6s JcAs Ks7s Ad8d 8s6c Kd7c"));
  }

  @Test
  public void test_texas_holdem_2089_5sAsQdTcTh_TdKc_4h2h_6d3d_Kh3h_4c5c_3cJs() {
    assertEquals(
      "4h2h 6d3d 3cJs Kh3h 4c5c TdKc",
      Solver.process("texas-holdem 5sAsQdTcTh TdKc 4h2h 6d3d Kh3h 4c5c 3cJs"));
  }

  @Test
  public void test_texas_holdem_2090_7c8dKhKsQs_4d4s_5sQc_9d9h_4c7d_2c5d_8sTc() {
    assertEquals(
      "2c5d 4d4s 4c7d 8sTc 9d9h 5sQc",
      Solver.process("texas-holdem 7c8dKhKsQs 4d4s 5sQc 9d9h 4c7d 2c5d 8sTc"));
  }

  @Test
  public void test_texas_holdem_2091_JcJhKcQhTh_3dAs_6sQs_3h5c_2sTs_Kh4h_Tc7h_7d6d() {
    assertEquals(
      "3h5c=7d6d 2sTs=Tc7h 6sQs 3dAs Kh4h",
      Solver.process("texas-holdem JcJhKcQhTh 3dAs 6sQs 3h5c 2sTs Kh4h Tc7h 7d6d"));
  }

  @Test
  public void test_texas_holdem_2092_3s4c9cAhKs_7cKd_7s5d() {
    assertEquals(
      "7s5d 7cKd",
      Solver.process("texas-holdem 3s4c9cAhKs 7cKd 7s5d"));
  }

  @Test
  public void test_texas_holdem_2093_2d3h9hJcQc_7h6c_2cTs_Kh5c_Ah3s_JdTc_7c3d_5sKc_Kd7s_2s8d() {
    assertEquals(
      "7h6c 5sKc=Kh5c Kd7s 2s8d 2cTs 7c3d Ah3s JdTc",
      Solver.process("texas-holdem 2d3h9hJcQc 7h6c 2cTs Kh5c Ah3s JdTc 7c3d 5sKc Kd7s 2s8d"));
  }

  @Test
  public void test_texas_holdem_2094_3h8d9h9sAs_6cTh_9c7s_JsAc_9d2s_5d6s() {
    assertEquals(
      "5d6s 6cTh JsAc 9c7s=9d2s",
      Solver.process("texas-holdem 3h8d9h9sAs 6cTh 9c7s JsAc 9d2s 5d6s"));
  }

  @Test
  public void test_texas_holdem_2095_4d5c6s9sKs_7s6c_6dAd_As9d_Ts8d_8sJs_5h2c_3d3h_4s7c_2hKh() {
    assertEquals(
      "Ts8d 3d3h 4s7c 5h2c 7s6c 6dAd As9d 2hKh 8sJs",
      Solver.process("texas-holdem 4d5c6s9sKs 7s6c 6dAd As9d Ts8d 8sJs 5h2c 3d3h 4s7c 2hKh"));
  }

  @Test
  public void test_texas_holdem_2096_4d7c9hAsJc_3h5d_4c2c_8dTd_AhQc_8cTh() {
    assertEquals(
      "3h5d 4c2c AhQc 8cTh=8dTd",
      Solver.process("texas-holdem 4d7c9hAsJc 3h5d 4c2c 8dTd AhQc 8cTh"));
  }

  @Test
  public void test_texas_holdem_2097_2c3h8c9hAd_Ah5s_4h5c_Kh2h_9c3d_7sAs_6d8h_3c3s() {
    assertEquals(
      "Kh2h 6d8h Ah5s 7sAs 9c3d 3c3s 4h5c",
      Solver.process("texas-holdem 2c3h8c9hAd Ah5s 4h5c Kh2h 9c3d 7sAs 6d8h 3c3s"));
  }

  @Test
  public void test_texas_holdem_2098_5c8sJhQcTh_2c8d_As7c() {
    assertEquals(
      "As7c 2c8d",
      Solver.process("texas-holdem 5c8sJhQcTh 2c8d As7c"));
  }

  @Test
  public void test_texas_holdem_2099_6d7s9hJhTs_2d4s_Ah2c_2hTh_8dKc_8c3h_3c5h_KdTc_Js4h() {
    assertEquals(
      "2d4s=3c5h Ah2c 2hTh KdTc Js4h 8c3h=8dKc",
      Solver.process("texas-holdem 6d7s9hJhTs 2d4s Ah2c 2hTh 8dKc 8c3h 3c5h KdTc Js4h"));
  }

  @Test
  public void test_texas_holdem_2100_4d4h6cJsKd_Ad9d_5s8d_7d6d_Jc5d_3d4c_3hTs_JdQh_As4s() {
    assertEquals(
      "5s8d 3hTs Ad9d 7d6d Jc5d=JdQh 3d4c As4s",
      Solver.process("texas-holdem 4d4h6cJsKd Ad9d 5s8d 7d6d Jc5d 3d4c 3hTs JdQh As4s"));
  }

  @Test
  public void test_texas_holdem_2101_2c4c5h9dKd_9sQd_4d8c_5dJh_3s4s_Td6d_QhTs_QcAh() {
    assertEquals(
      "Td6d QhTs QcAh 3s4s 4d8c 5dJh 9sQd",
      Solver.process("texas-holdem 2c4c5h9dKd 9sQd 4d8c 5dJh 3s4s Td6d QhTs QcAh"));
  }

  @Test
  public void test_texas_holdem_2102_3c4c6s7dQs_Kc8c_JhKh_9c7c_Qd7h_9h4s_Ks3s_Tc6c_8d6d() {
    assertEquals(
      "Kc8c JhKh Ks3s 9h4s 8d6d Tc6c 9c7c Qd7h",
      Solver.process("texas-holdem 3c4c6s7dQs Kc8c JhKh 9c7c Qd7h 9h4s Ks3s Tc6c 8d6d"));
  }

  @Test
  public void test_texas_holdem_2103_4d6s8s9dTd_Tc7h_4s5h_Kd7c_KhQh_JdAh_5sAd_Jh2d_9c7d() {
    assertEquals(
      "Jh2d KhQh 5sAd JdAh 4s5h 9c7d=Kd7c=Tc7h",
      Solver.process("texas-holdem 4d6s8s9dTd Tc7h 4s5h Kd7c KhQh JdAh 5sAd Jh2d 9c7d"));
  }

  @Test
  public void test_texas_holdem_2104_4c5c6s9hKc_3cTs_8d9d() {
    assertEquals(
      "3cTs 8d9d",
      Solver.process("texas-holdem 4c5c6s9hKc 3cTs 8d9d"));
  }

  @Test
  public void test_texas_holdem_2105_2h3h7d9sKs_Tc6d_Qc5s_6c2s_Jd5h() {
    assertEquals(
      "Tc6d Jd5h Qc5s 6c2s",
      Solver.process("texas-holdem 2h3h7d9sKs Tc6d Qc5s 6c2s Jd5h"));
  }

  @Test
  public void test_texas_holdem_2106_3d8dAcKsTh_2h2s_9s9d_7h5h_6dTs_7dTc_2cQs_Ah4h_Qh4s() {
    assertEquals(
      "7h5h 2cQs=Qh4s 2h2s 9s9d 6dTs=7dTc Ah4h",
      Solver.process("texas-holdem 3d8dAcKsTh 2h2s 9s9d 7h5h 6dTs 7dTc 2cQs Ah4h Qh4s"));
  }

  @Test
  public void test_texas_holdem_2107_2c2d7sKdTs_9hAh_6c8s_8c4h_Qc2h_Js5c() {
    assertEquals(
      "6c8s=8c4h Js5c 9hAh Qc2h",
      Solver.process("texas-holdem 2c2d7sKdTs 9hAh 6c8s 8c4h Qc2h Js5c"));
  }

  @Test
  public void test_texas_holdem_2108_4c5c6h6sQd_Qh9d_7hJc() {
    assertEquals(
      "7hJc Qh9d",
      Solver.process("texas-holdem 4c5c6h6sQd Qh9d 7hJc"));
  }

  @Test
  public void test_texas_holdem_2109_2d5d9dQhQs_Qd6c_Tc2s() {
    assertEquals(
      "Tc2s Qd6c",
      Solver.process("texas-holdem 2d5d9dQhQs Qd6c Tc2s"));
  }

  @Test
  public void test_texas_holdem_2110_5c7d9hJdKd_2d7h_Ac4s_3dKc_Jc4c_ThQh_4d8s() {
    assertEquals(
      "4d8s Ac4s 2d7h Jc4c 3dKc ThQh",
      Solver.process("texas-holdem 5c7d9hJdKd 2d7h Ac4s 3dKc Jc4c ThQh 4d8s"));
  }

  @Test
  public void test_texas_holdem_2111_7sAhAsKsQd_9d6s_Kd4c_Kc5s_7h3h_Jc8d_QcTc() {
    assertEquals(
      "9d6s Jc8d 7h3h QcTc Kc5s=Kd4c",
      Solver.process("texas-holdem 7sAhAsKsQd 9d6s Kd4c Kc5s 7h3h Jc8d QcTc"));
  }

  @Test
  public void test_texas_holdem_2112_4s9hAhKsQd_KcAs_Ad2s_7s2d() {
    assertEquals(
      "7s2d Ad2s KcAs",
      Solver.process("texas-holdem 4s9hAhKsQd KcAs Ad2s 7s2d"));
  }

  @Test
  public void test_texas_holdem_2113_3c3d5sAsKc_6c8h_2c6h_Th2s_AdJc_7h8d_9c5h_4cQc_5c4d() {
    assertEquals(
      "2c6h 6c8h=7h8d Th2s 4cQc 5c4d=9c5h AdJc",
      Solver.process("texas-holdem 3c3d5sAsKc 6c8h 2c6h Th2s AdJc 7h8d 9c5h 4cQc 5c4d"));
  }

  @Test
  public void test_texas_holdem_2114_4h8c8h9dTc_Ah7h_3h6d_2hQs_4d8d_Ks6h_TdJs_Th5h_9s2d() {
    assertEquals(
      "3h6d 2hQs Ks6h Ah7h 9s2d Th5h TdJs 4d8d",
      Solver.process("texas-holdem 4h8c8h9dTc Ah7h 3h6d 2hQs 4d8d Ks6h TdJs Th5h 9s2d"));
  }

  @Test
  public void test_texas_holdem_2115_6h8c8sAsKs_6c3c_5sAd_4cQh_4s2c() {
    assertEquals(
      "4s2c 4cQh 6c3c 5sAd",
      Solver.process("texas-holdem 6h8c8sAsKs 6c3c 5sAd 4cQh 4s2c"));
  }

  @Test
  public void test_texas_holdem_2116_3d6d8dJdKc_5h2c_7h9d_6cTd_3h4d_QdAd_JcQs() {
    assertEquals(
      "5h2c JcQs 3h4d 7h9d 6cTd QdAd",
      Solver.process("texas-holdem 3d6d8dJdKc 5h2c 7h9d 6cTd 3h4d QdAd JcQs"));
  }

  @Test
  public void test_texas_holdem_2117_3s7d9hTcTs_2d6d_KhTd_4c8d_QdAd_6s2h_6h2s() {
    assertEquals(
      "2d6d=6h2s=6s2h 4c8d QdAd KhTd",
      Solver.process("texas-holdem 3s7d9hTcTs 2d6d KhTd 4c8d QdAd 6s2h 6h2s"));
  }

  @Test
  public void test_texas_holdem_2118_4d5d7d8dTc_8h3h_Ks2s() {
    assertEquals(
      "Ks2s 8h3h",
      Solver.process("texas-holdem 4d5d7d8dTc 8h3h Ks2s"));
  }

  @Test
  public void test_texas_holdem_2119_6s9sAhAsJd_5d8c_9cJh_8hJc_9d2c() {
    assertEquals(
      "5d8c 9d2c 8hJc=9cJh",
      Solver.process("texas-holdem 6s9sAhAsJd 5d8c 9cJh 8hJc 9d2c"));
  }

  @Test
  public void test_texas_holdem_2120_2c6c7c9hTs_4dAs_4sJh_Kd6h_TdTh_6d5h_Kh7d_8hJc_5c3c_7h7s() {
    assertEquals(
      "4sJh 4dAs 6d5h Kd6h Kh7d 7h7s TdTh 8hJc 5c3c",
      Solver.process("texas-holdem 2c6c7c9hTs 4dAs 4sJh Kd6h TdTh 6d5h Kh7d 8hJc 5c3c 7h7s"));
  }

  @Test
  public void test_texas_holdem_2121_2c5c7s8sKs_Qd5h_QsAh() {
    assertEquals(
      "QsAh Qd5h",
      Solver.process("texas-holdem 2c5c7s8sKs Qd5h QsAh"));
  }

  @Test
  public void test_texas_holdem_2122_2c7c8sAhAs_4s4d_Qd4c_KhQs_3h7s_Ac6h_8dTc_Ts3c() {
    assertEquals(
      "Ts3c Qd4c KhQs 4s4d 3h7s 8dTc Ac6h",
      Solver.process("texas-holdem 2c7c8sAhAs 4s4d Qd4c KhQs 3h7s Ac6h 8dTc Ts3c"));
  }

  @Test
  public void test_texas_holdem_2123_2h3c7sQcQs_KdKs_3h5d_6hAd_8c5h_3d2c() {
    assertEquals(
      "8c5h 6hAd 3d2c=3h5d KdKs",
      Solver.process("texas-holdem 2h3c7sQcQs KdKs 3h5d 6hAd 8c5h 3d2c"));
  }

  @Test
  public void test_texas_holdem_2124_2s3d5d9dKc_8hKh_7sAd_Ac9c_6s2c_3c4h_QcQd() {
    assertEquals(
      "7sAd 6s2c 3c4h Ac9c QcQd 8hKh",
      Solver.process("texas-holdem 2s3d5d9dKc 8hKh 7sAd Ac9c 6s2c 3c4h QcQd"));
  }

  @Test
  public void test_texas_holdem_2125_2c8h8sQcTd_Qd9h_9c9d() {
    assertEquals(
      "9c9d Qd9h",
      Solver.process("texas-holdem 2c8h8sQcTd Qd9h 9c9d"));
  }

  @Test
  public void test_texas_holdem_2126_2c3c9cJcJh_Th9d_Ad8h_3sTs_6cJd_8dQc_Ks3d_4s4c_7dKh() {
    assertEquals(
      "7dKh Ad8h 3sTs Ks3d Th9d 4s4c 6cJd 8dQc",
      Solver.process("texas-holdem 2c3c9cJcJh Th9d Ad8h 3sTs 6cJd 8dQc Ks3d 4s4c 7dKh"));
  }

  @Test
  public void test_texas_holdem_2127_2c3s5d6hQd_KhQs_9d7s_2h9s_5c6c() {
    assertEquals(
      "9d7s 2h9s KhQs 5c6c",
      Solver.process("texas-holdem 2c3s5d6hQd KhQs 9d7s 2h9s 5c6c"));
  }

  @Test
  public void test_texas_holdem_2128_2d2s4c7sQs_3d9h_8d3h_Ah7d_AdJc_8h3c_Ac5h_3sJh_6h7c() {
    assertEquals(
      "8d3h=8h3c 3d9h 3sJh Ac5h AdJc 6h7c Ah7d",
      Solver.process("texas-holdem 2d2s4c7sQs 3d9h 8d3h Ah7d AdJc 8h3c Ac5h 3sJh 6h7c"));
  }

  @Test
  public void test_texas_holdem_2129_3d3s7sAcKc_KsJs_6dTd() {
    assertEquals(
      "6dTd KsJs",
      Solver.process("texas-holdem 3d3s7sAcKc KsJs 6dTd"));
  }

  @Test
  public void test_texas_holdem_2130_2s3c8sJhTd_TcQd_4s5s() {
    assertEquals(
      "4s5s TcQd",
      Solver.process("texas-holdem 2s3c8sJhTd TcQd 4s5s"));
  }

  @Test
  public void test_texas_holdem_2131_3d5h6d7dQd_7cKd_AcTs_5d6h_As9d_5c8c_Qc4c_Th8d_8sKh_Qs9c() {
    assertEquals(
      "8sKh AcTs 5c8c Qs9c Qc4c 5d6h Th8d As9d 7cKd",
      Solver.process("texas-holdem 3d5h6d7dQd 7cKd AcTs 5d6h As9d 5c8c Qc4c Th8d 8sKh Qs9c"));
  }

  @Test
  public void test_texas_holdem_2132_2s4d9sAhQs_9d4h_Jc9c_5hTs_7hTh_4s3s_3d6h() {
    assertEquals(
      "3d6h 5hTs 7hTh Jc9c 9d4h 4s3s",
      Solver.process("texas-holdem 2s4d9sAhQs 9d4h Jc9c 5hTs 7hTh 4s3s 3d6h"));
  }

  @Test
  public void test_texas_holdem_2133_5s8d8s9cTd_5c6c_9s6s_8cTs_9dKc_7hJd_7c7s() {
    assertEquals(
      "5c6c 7c7s 9s6s 9dKc 7hJd 8cTs",
      Solver.process("texas-holdem 5s8d8s9cTd 5c6c 9s6s 8cTs 9dKc 7hJd 7c7s"));
  }

  @Test
  public void test_texas_holdem_2134_6h9hAhJdTh_8d6c_Ad4c_6sJc_Qs2d() {
    assertEquals(
      "Qs2d 8d6c Ad4c 6sJc",
      Solver.process("texas-holdem 6h9hAhJdTh 8d6c Ad4c 6sJc Qs2d"));
  }

  @Test
  public void test_texas_holdem_2135_3s4c7c9cTh_2s6h_Kc3d_AdJs_2h4d_9s3c_8c5s_Jh7d_5d8d() {
    assertEquals(
      "2s6h 5d8d=8c5s AdJs Kc3d 2h4d Jh7d 9s3c",
      Solver.process("texas-holdem 3s4c7c9cTh 2s6h Kc3d AdJs 2h4d 9s3c 8c5s Jh7d 5d8d"));
  }

  @Test
  public void test_texas_holdem_2136_3c4dAsKhQc_7c7s_TcQh_6s5s_KdTs_6dQd_JhAd() {
    assertEquals(
      "6s5s 7c7s 6dQd TcQh KdTs JhAd",
      Solver.process("texas-holdem 3c4dAsKhQc 7c7s TcQh 6s5s KdTs 6dQd JhAd"));
  }

  @Test
  public void test_texas_holdem_2137_4d7s8sQcTs_AhKc_As5h_TdTh_9cAc_2sJd() {
    assertEquals(
      "2sJd As5h 9cAc AhKc TdTh",
      Solver.process("texas-holdem 4d7s8sQcTs AhKc As5h TdTh 9cAc 2sJd"));
  }

  @Test
  public void test_texas_holdem_2138_3c9hAcJdKh_TsAs_8dTc_5s8h_4h5h_Jh5d_Kc3h_AdJc_KsTd() {
    assertEquals(
      "4h5h 5s8h 8dTc Jh5d KsTd TsAs Kc3h AdJc",
      Solver.process("texas-holdem 3c9hAcJdKh TsAs 8dTc 5s8h 4h5h Jh5d Kc3h AdJc KsTd"));
  }

  @Test
  public void test_texas_holdem_2139_AsKsQhTcTd_5sAc_6cQs_9sJs_3d6s_4s3s_2c4c_9cKd_2h8h_Kc7c() {
    assertEquals(
      "2c4c=2h8h=3d6s=4s3s 6cQs 9cKd=Kc7c 5sAc 9sJs",
      Solver.process("texas-holdem AsKsQhTcTd 5sAc 6cQs 9sJs 3d6s 4s3s 2c4c 9cKd 2h8h Kc7c"));
  }

  @Test
  public void test_texas_holdem_2140_2d6c9dAsQc_8h3h_2h5s_3sKs_Qs5d_7s6h() {
    assertEquals(
      "8h3h 3sKs 2h5s 7s6h Qs5d",
      Solver.process("texas-holdem 2d6c9dAsQc 8h3h 2h5s 3sKs Qs5d 7s6h"));
  }

  @Test
  public void test_texas_holdem_2141_5c5dAcJhQs_7c8s_7sKc_3sAh_9s6s_Jd5s_Ad9c() {
    assertEquals(
      "7c8s=9s6s 7sKc 3sAh=Ad9c Jd5s",
      Solver.process("texas-holdem 5c5dAcJhQs 7c8s 7sKc 3sAh 9s6s Jd5s Ad9c"));
  }

  @Test
  public void test_texas_holdem_2142_3s7h8h9dKh_9hKd_7c4d_AcAd_Qs2c_AsTd_3d6d_2s3c_8s5c_9c4c() {
    assertEquals(
      "Qs2c AsTd 2s3c=3d6d 7c4d 8s5c 9c4c AcAd 9hKd",
      Solver.process("texas-holdem 3s7h8h9dKh 9hKd 7c4d AcAd Qs2c AsTd 3d6d 2s3c 8s5c 9c4c"));
  }

  @Test
  public void test_texas_holdem_2143_5cJdJhKsTs_4d8c_Kd3h() {
    assertEquals(
      "4d8c Kd3h",
      Solver.process("texas-holdem 5cJdJhKsTs 4d8c Kd3h"));
  }

  @Test
  public void test_texas_holdem_2144_2s7d9dJcJh_2h7s_6dTc_8d4h_8hKh_5d5s_Kd4s_3h2c() {
    assertEquals(
      "8d4h 6dTc Kd4s 8hKh 3h2c 5d5s 2h7s",
      Solver.process("texas-holdem 2s7d9dJcJh 2h7s 6dTc 8d4h 8hKh 5d5s Kd4s 3h2c"));
  }

  @Test
  public void test_texas_holdem_2145_2s7s9sKdQh_8hJh_Jc9c_3h2c_AcTs_QdJd_8d4h() {
    assertEquals(
      "8d4h 8hJh AcTs 3h2c Jc9c QdJd",
      Solver.process("texas-holdem 2s7s9sKdQh 8hJh Jc9c 3h2c AcTs QdJd 8d4h"));
  }

  @Test
  public void test_texas_holdem_2146_2s8hKdTcTh_Jc5c_TdAc() {
    assertEquals(
      "Jc5c TdAc",
      Solver.process("texas-holdem 2s8hKdTcTh Jc5c TdAc"));
  }

  @Test
  public void test_texas_holdem_2147_3d3s6c9hTc_Jd7s_9s5d_7d3c_8hAd_8dJs_7h2s_2dKc() {
    assertEquals(
      "7h2s 8dJs=Jd7s 2dKc 8hAd 9s5d 7d3c",
      Solver.process("texas-holdem 3d3s6c9hTc Jd7s 9s5d 7d3c 8hAd 8dJs 7h2s 2dKc"));
  }

  @Test
  public void test_texas_holdem_2148_2d3c3h6cKd_AdJc_Th2s_Qd7d_QsTc_Kh7h() {
    assertEquals(
      "Qd7d QsTc AdJc Th2s Kh7h",
      Solver.process("texas-holdem 2d3c3h6cKd AdJc Th2s Qd7d QsTc Kh7h"));
  }

  @Test
  public void test_texas_holdem_2149_2d2h8cAsJh_2c8s_7dJd_6h5d_TsTh() {
    assertEquals(
      "6h5d TsTh 7dJd 2c8s",
      Solver.process("texas-holdem 2d2h8cAsJh 2c8s 7dJd 6h5d TsTh"));
  }

  @Test
  public void test_texas_holdem_2150_2c3c8c8dKs_4d5c_6s9c_6d8h_9dJc_7d6c_5hQc_4c6h_9sTh_5s7h() {
    assertEquals(
      "4d5c 4c6h 5s7h 7d6c 6s9c 9sTh 9dJc 5hQc 6d8h",
      Solver.process("texas-holdem 2c3c8c8dKs 4d5c 6s9c 6d8h 9dJc 7d6c 5hQc 4c6h 9sTh 5s7h"));
  }

  @Test
  public void test_texas_holdem_2151_6c7d9cKsTs_5s3d_4dAh_2d5c_3s6h_QsJs_9h8h() {
    assertEquals(
      "2d5c=5s3d 4dAh 3s6h 9h8h QsJs",
      Solver.process("texas-holdem 6c7d9cKsTs 5s3d 4dAh 2d5c 3s6h QsJs 9h8h"));
  }

  @Test
  public void test_texas_holdem_2152_3c5dKcQcTc_2dJd_6h9d_Ts9h_9c7c_3dQs_4h3h_7d4c_6d9s_Jh8s() {
    assertEquals(
      "6d9s=6h9d 2dJd Jh8s 4h3h Ts9h 3dQs 7d4c 9c7c",
      Solver.process("texas-holdem 3c5dKcQcTc 2dJd 6h9d Ts9h 9c7c 3dQs 4h3h 7d4c 6d9s Jh8s"));
  }

  @Test
  public void test_texas_holdem_2153_4c5c6h7c9c_8sTc_Js7h() {
    assertEquals(
      "Js7h 8sTc",
      Solver.process("texas-holdem 4c5c6h7c9c 8sTc Js7h"));
  }

  @Test
  public void test_texas_holdem_2154_2d2s6d8sKh_KcAh_5c5d_7s2h_3h9d_Qs8h_JdQc_6c4s_8cTh() {
    assertEquals(
      "3h9d JdQc 5c5d 6c4s 8cTh=Qs8h KcAh 7s2h",
      Solver.process("texas-holdem 2d2s6d8sKh KcAh 5c5d 7s2h 3h9d Qs8h JdQc 6c4s 8cTh"));
  }

  @Test
  public void test_texas_holdem_2155_3s7d7s8dJs_6c7h_6sTd_9hTh_4c5s_9s3c_AcJd_9d9c_6hAd() {
    assertEquals(
      "4c5s 6sTd 6hAd 9s3c 9d9c AcJd 6c7h 9hTh",
      Solver.process("texas-holdem 3s7d7s8dJs 6c7h 6sTd 9hTh 4c5s 9s3c AcJd 9d9c 6hAd"));
  }

  @Test
  public void test_texas_holdem_2156_6h7cAcAsKh_6c5s_8d2s_9d2d_ThKs_Jh6s_5h4h() {
    assertEquals(
      "5h4h 8d2s 9d2d 6c5s=Jh6s ThKs",
      Solver.process("texas-holdem 6h7cAcAsKh 6c5s 8d2s 9d2d ThKs Jh6s 5h4h"));
  }

  @Test
  public void test_texas_holdem_2157_8h8s9hJcJd_4cKh_4d6s_3c8c() {
    assertEquals(
      "4d6s 4cKh 3c8c",
      Solver.process("texas-holdem 8h8s9hJcJd 4cKh 4d6s 3c8c"));
  }

  @Test
  public void test_texas_holdem_2158_7cAcAhKhQh_5sKd_ThTd_8s6c_9c3d_4hQs_2sKc_JhJc() {
    assertEquals(
      "8s6c 9c3d ThTd JhJc 4hQs 2sKc=5sKd",
      Solver.process("texas-holdem 7cAcAhKhQh 5sKd ThTd 8s6c 9c3d 4hQs 2sKc JhJc"));
  }

  @Test
  public void test_texas_holdem_2159_7c8d8hQcQh_9c8c_3s5h_9s8s_3dAc_Ts4h_9hKs_JhAd_4c2d_7d6d() {
    assertEquals(
      "3s5h=4c2d=7d6d Ts4h 9hKs 3dAc=JhAd 9c8c=9s8s",
      Solver.process("texas-holdem 7c8d8hQcQh 9c8c 3s5h 9s8s 3dAc Ts4h 9hKs JhAd 4c2d 7d6d"));
  }

  @Test
  public void test_texas_holdem_2160_5s8s9cJsKd_4d4c_7d2h_3d9s_8cQh() {
    assertEquals(
      "7d2h 4d4c 8cQh 3d9s",
      Solver.process("texas-holdem 5s8s9cJsKd 4d4c 7d2h 3d9s 8cQh"));
  }

  @Test
  public void test_texas_holdem_2161_2c7h9dJsTh_JdAd_6h6s_4dQh() {
    assertEquals(
      "4dQh 6h6s JdAd",
      Solver.process("texas-holdem 2c7h9dJsTh JdAd 6h6s 4dQh"));
  }

  @Test
  public void test_texas_holdem_2162_2h3d6cQdTh_AdTd_QhTs_6h5s_Jc9h() {
    assertEquals(
      "Jc9h 6h5s AdTd QhTs",
      Solver.process("texas-holdem 2h3d6cQdTh AdTd QhTs 6h5s Jc9h"));
  }

  @Test
  public void test_texas_holdem_2163_2d3d3hKhTd_7hAs_8dKs_Qc9s_5dKd() {
    assertEquals(
      "Qc9s 7hAs 8dKs 5dKd",
      Solver.process("texas-holdem 2d3d3hKhTd 7hAs 8dKs Qc9s 5dKd"));
  }

  @Test
  public void test_texas_holdem_2164_2h7cJcKsTs_ThQs_8s9s_Js6h_Tc6c_KdAh_Qh9c_5d5s_7d8h() {
    assertEquals(
      "5d5s 7d8h Tc6c ThQs Js6h KdAh 8s9s Qh9c",
      Solver.process("texas-holdem 2h7cJcKsTs ThQs 8s9s Js6h Tc6c KdAh Qh9c 5d5s 7d8h"));
  }

  @Test
  public void test_texas_holdem_2165_4d7sAdKcQs_QcQd_4hKh_6h2c_3sKs_3c4s_Ts8s_AsQh_9d5s_8d6s() {
    assertEquals(
      "6h2c 8d6s 9d5s Ts8s 3c4s 3sKs 4hKh AsQh QcQd",
      Solver.process("texas-holdem 4d7sAdKcQs QcQd 4hKh 6h2c 3sKs 3c4s Ts8s AsQh 9d5s 8d6s"));
  }

  @Test
  public void test_texas_holdem_2166_2c2h2s7d9s_JcKs_3sKd_6c2d() {
    assertEquals(
      "3sKd JcKs 6c2d",
      Solver.process("texas-holdem 2c2h2s7d9s JcKs 3sKd 6c2d"));
  }

  @Test
  public void test_texas_holdem_2167_3c5s7dJcJs_6s3s_Td8s_5h6d_8hJd_2d2h_As2c_9c4d() {
    assertEquals(
      "9c4d Td8s As2c 2d2h 6s3s 5h6d 8hJd",
      Solver.process("texas-holdem 3c5s7dJcJs 6s3s Td8s 5h6d 8hJd 2d2h As2c 9c4d"));
  }

  @Test
  public void test_texas_holdem_2168_2d5hKcTcTd_9dQd_Qc3c_Jd5s() {
    assertEquals(
      "Qc3c 9dQd Jd5s",
      Solver.process("texas-holdem 2d5hKcTcTd 9dQd Qc3c Jd5s"));
  }

  @Test
  public void test_texas_holdem_2169_5h8h9c9dTd_Qs6h_4dTc_Ac2h_Qc6c_Jd5c() {
    assertEquals(
      "Qc6c=Qs6h Ac2h Jd5c 4dTc",
      Solver.process("texas-holdem 5h8h9c9dTd Qs6h 4dTc Ac2h Qc6c Jd5c"));
  }

  @Test
  public void test_texas_holdem_2170_3d4cJcQsTd_QhQc_8d7d_5d6c_2cTs() {
    assertEquals(
      "5d6c 8d7d 2cTs QhQc",
      Solver.process("texas-holdem 3d4cJcQsTd QhQc 8d7d 5d6c 2cTs"));
  }

  @Test
  public void test_texas_holdem_2171_2c6h6sAdQd_8hAh_Qc7d_7s5s_Jd3h_9h4h_2d3s_TdQs_ThJc_KcAc() {
    assertEquals(
      "7s5s 9h4h Jd3h=ThJc 2d3s Qc7d=TdQs 8hAh KcAc",
      Solver.process("texas-holdem 2c6h6sAdQd 8hAh Qc7d 7s5s Jd3h 9h4h 2d3s TdQs ThJc KcAc"));
  }

  @Test
  public void test_texas_holdem_2172_5s7c8cAsKd_Jc7d_3hQd_2h9d_Th2d_Qs6h_5h6s_Jh8d() {
    assertEquals(
      "2h9d Th2d 3hQd=Qs6h 5h6s Jc7d Jh8d",
      Solver.process("texas-holdem 5s7c8cAsKd Jc7d 3hQd 2h9d Th2d Qs6h 5h6s Jh8d"));
  }

  @Test
  public void test_texas_holdem_2173_2c6h8cJcKs_4c2h_3c2s() {
    assertEquals(
      "3c2s=4c2h",
      Solver.process("texas-holdem 2c6h8cJcKs 4c2h 3c2s"));
  }

  @Test
  public void test_texas_holdem_2174_4c8s9sAsTd_Ts8d_Kc8h() {
    assertEquals(
      "Kc8h Ts8d",
      Solver.process("texas-holdem 4c8s9sAsTd Ts8d Kc8h"));
  }

  @Test
  public void test_texas_holdem_2175_2c6h9sAcJs_7c9c_7hQs() {
    assertEquals(
      "7hQs 7c9c",
      Solver.process("texas-holdem 2c6h9sAcJs 7c9c 7hQs"));
  }

  @Test
  public void test_texas_holdem_2176_2h3h5dThTs_8c6c_Kh7c_Qs8d_9c4c_QcTc_TdQd_Kc6d_3s5s_2d8h() {
    assertEquals(
      "8c6c 9c4c Qs8d Kc6d Kh7c 2d8h 3s5s QcTc=TdQd",
      Solver.process("texas-holdem 2h3h5dThTs 8c6c Kh7c Qs8d 9c4c QcTc TdQd Kc6d 3s5s 2d8h"));
  }

  @Test
  public void test_texas_holdem_2177_2c3h4c4h7h_5c5h_6cKs_3sTd_TsJd() {
    assertEquals(
      "TsJd 6cKs 3sTd 5c5h",
      Solver.process("texas-holdem 2c3h4c4h7h 5c5h 6cKs 3sTd TsJd"));
  }

  @Test
  public void test_texas_holdem_2178_3s8d9hJcKd_5hAh_2h6s_QsTd() {
    assertEquals(
      "2h6s 5hAh QsTd",
      Solver.process("texas-holdem 3s8d9hJcKd 5hAh 2h6s QsTd"));
  }

  @Test
  public void test_texas_holdem_2179_2s3c5c6c7h_Ad2d_TcJd_9h9c_6h9d_7dJs_Td3s() {
    assertEquals(
      "TcJd Ad2d Td3s 6h9d 7dJs 9h9c",
      Solver.process("texas-holdem 2s3c5c6c7h Ad2d TcJd 9h9c 6h9d 7dJs Td3s"));
  }

  @Test
  public void test_texas_holdem_2180_4d8cAcKdKs_Th9s_7d3s_8d5h() {
    assertEquals(
      "7d3s Th9s 8d5h",
      Solver.process("texas-holdem 4d8cAcKdKs Th9s 7d3s 8d5h"));
  }

  @Test
  public void test_texas_holdem_2181_4c4s7sAsJd_8c5h_Ah4h_2hAd_8s3h_6sKd_6c3s() {
    assertEquals(
      "6c3s 8c5h=8s3h 6sKd 2hAd Ah4h",
      Solver.process("texas-holdem 4c4s7sAsJd 8c5h Ah4h 2hAd 8s3h 6sKd 6c3s"));
  }

  @Test
  public void test_texas_holdem_2182_4d8s9hKdKh_7sAs_8d5s_Tc8c() {
    assertEquals(
      "7sAs 8d5s Tc8c",
      Solver.process("texas-holdem 4d8s9hKdKh 7sAs 8d5s Tc8c"));
  }

  @Test
  public void test_texas_holdem_2183_2s6d6hAhQh_4cJd_3cTc_7cKs_9s9c() {
    assertEquals(
      "3cTc 4cJd 7cKs 9s9c",
      Solver.process("texas-holdem 2s6d6hAhQh 4cJd 3cTc 7cKs 9s9c"));
  }

  @Test
  public void test_texas_holdem_2184_4c8d9hAcQs_8cAh_Kd3d_6c5h() {
    assertEquals(
      "6c5h Kd3d 8cAh",
      Solver.process("texas-holdem 4c8d9hAcQs 8cAh Kd3d 6c5h"));
  }

  @Test
  public void test_texas_holdem_2185_2d3d7hQsTs_Jc8c_4d2h_8dKd_7sJd() {
    assertEquals(
      "Jc8c 8dKd 4d2h 7sJd",
      Solver.process("texas-holdem 2d3d7hQsTs Jc8c 4d2h 8dKd 7sJd"));
  }

  @Test
  public void test_texas_holdem_2186_6c6d6s8d9h_6hKh_Jh7h_7sKc_8c8s_9d5s_Ah4h_5dQd_5c2d_Jd7d() {
    assertEquals(
      "5c2d Jd7d=Jh7h 5dQd 7sKc Ah4h 9d5s 8c8s 6hKh",
      Solver.process("texas-holdem 6c6d6s8d9h 6hKh Jh7h 7sKc 8c8s 9d5s Ah4h 5dQd 5c2d Jd7d"));
  }

  @Test
  public void test_texas_holdem_2187_2h6hJdJhKc_7c6s_Tc6d_JcTd_Ac7h_3s9s_Ad2s_4d7d_5d3h_9hTh() {
    assertEquals(
      "5d3h 4d7d 3s9s Ac7h Ad2s 7c6s=Tc6d JcTd 9hTh",
      Solver.process("texas-holdem 2h6hJdJhKc 7c6s Tc6d JcTd Ac7h 3s9s Ad2s 4d7d 5d3h 9hTh"));
  }

  @Test
  public void test_texas_holdem_2188_2c7hAhJhTh_3s5h_Jc6s_4d3h_7c2s_5dTd() {
    assertEquals(
      "5dTd Jc6s 7c2s 4d3h 3s5h",
      Solver.process("texas-holdem 2c7hAhJhTh 3s5h Jc6s 4d3h 7c2s 5dTd"));
  }

  @Test
  public void test_texas_holdem_2189_8d9d9sKsQs_TdTs_5sKh_Tc7s_8sJd_5d2s_As2h_5cAd_JsAc() {
    assertEquals(
      "5d2s Tc7s 5cAd=As2h=JsAc 8sJd TdTs 5sKh",
      Solver.process("texas-holdem 8d9d9sKsQs TdTs 5sKh Tc7s 8sJd 5d2s As2h 5cAd JsAc"));
  }

  @Test
  public void test_texas_holdem_2190_6h7d7h9h9s_Td4h_2hTc_AsJd_ThAh() {
    assertEquals(
      "2hTc=Td4h AsJd ThAh",
      Solver.process("texas-holdem 6h7d7h9h9s Td4h 2hTc AsJd ThAh"));
  }

  @Test
  public void test_texas_holdem_2191_2d2s3d3sTd_6dTc_3hQs_8s5h_9s5d_4sTs_8hKc_8c4d() {
    assertEquals(
      "8c4d=8s5h=9s5d 8hKc 4sTs 6dTc 3hQs",
      Solver.process("texas-holdem 2d2s3d3sTd 6dTc 3hQs 8s5h 9s5d 4sTs 8hKc 8c4d"));
  }

  @Test
  public void test_texas_holdem_2192_3c5c5s9cKd_JdTh_Jh7d() {
    assertEquals(
      "Jh7d JdTh",
      Solver.process("texas-holdem 3c5c5s9cKd JdTh Jh7d"));
  }

  @Test
  public void test_texas_holdem_2193_3h3s5c9hKd_5h9c_Qd8h_Th2d_4d6d_AhQs_5dKh_JsKc() {
    assertEquals(
      "4d6d Th2d Qd8h AhQs 5h9c JsKc 5dKh",
      Solver.process("texas-holdem 3h3s5c9hKd 5h9c Qd8h Th2d 4d6d AhQs 5dKh JsKc"));
  }

  @Test
  public void test_texas_holdem_2194_4h6sJcQhTh_JdTs_9d5h_8dJh_9c3d_2h9h_9sKh_2cKd_2sTc_8c4d() {
    assertEquals(
      "9c3d=9d5h 2cKd 8c4d 2sTc 8dJh JdTs 9sKh 2h9h",
      Solver.process("texas-holdem 4h6sJcQhTh JdTs 9d5h 8dJh 9c3d 2h9h 9sKh 2cKd 2sTc 8c4d"));
  }

  @Test
  public void test_texas_holdem_2195_4h5dAcAsJs_JcKs_Kc3s_2hTd_7c7d_2cQd() {
    assertEquals(
      "2hTd 2cQd Kc3s 7c7d JcKs",
      Solver.process("texas-holdem 4h5dAcAsJs JcKs Kc3s 2hTd 7c7d 2cQd"));
  }

  @Test
  public void test_texas_holdem_2196_3s7cAdQcTh_4d5s_Ks6s_5cJs_Jc5d_6d8c() {
    assertEquals(
      "4d5s 6d8c 5cJs=Jc5d Ks6s",
      Solver.process("texas-holdem 3s7cAdQcTh 4d5s Ks6s 5cJs Jc5d 6d8c"));
  }

  @Test
  public void test_texas_holdem_2197_2s5sAcAsQd_5d5h_2d6d_9hTc() {
    assertEquals(
      "9hTc 2d6d 5d5h",
      Solver.process("texas-holdem 2s5sAcAsQd 5d5h 2d6d 9hTc"));
  }

  @Test
  public void test_texas_holdem_2198_4s5s6cJcKc_Qs3s_JdQd_As2d_6hKh_8cTd() {
    assertEquals(
      "8cTd Qs3s As2d JdQd 6hKh",
      Solver.process("texas-holdem 4s5s6cJcKc Qs3s JdQd As2d 6hKh 8cTd"));
  }

  @Test
  public void test_texas_holdem_2199_5d6d9sAcJc_Th5s_3s4d_2hQh_7sJh_2cTs_Kd4h_Kc9d() {
    assertEquals(
      "3s4d 2cTs 2hQh Kd4h Th5s Kc9d 7sJh",
      Solver.process("texas-holdem 5d6d9sAcJc Th5s 3s4d 2hQh 7sJh 2cTs Kd4h Kc9d"));
  }

  @Test
  public void test_texas_holdem_2200_3d4s5c9sKc_6h4c_6d7d_Qc3s() {
    assertEquals(
      "Qc3s 6h4c 6d7d",
      Solver.process("texas-holdem 3d4s5c9sKc 6h4c 6d7d Qc3s"));
  }

  @Test
  public void test_texas_holdem_2201_3c3s4cKhTs_2d7d_Qs6s_3hKs_Kd8s_JhTc_5s5h() {
    assertEquals(
      "2d7d Qs6s 5s5h JhTc Kd8s 3hKs",
      Solver.process("texas-holdem 3c3s4cKhTs 2d7d Qs6s 3hKs Kd8s JhTc 5s5h"));
  }

  @Test
  public void test_texas_holdem_2202_4d6s9hAdJd_9d3d_Qd5h_AsQh_4c9c_Th8d_Ac5s_TcAh_6h8c_4h5d() {
    assertEquals(
      "Th8d Qd5h 4h5d 6h8c Ac5s TcAh AsQh 4c9c 9d3d",
      Solver.process("texas-holdem 4d6s9hAdJd 9d3d Qd5h AsQh 4c9c Th8d Ac5s TcAh 6h8c 4h5d"));
  }

  @Test
  public void test_texas_holdem_2203_7h9dAcAdQs_Tc5s_4sJh_6hTd_Ts3d_3c7c_6cQh() {
    assertEquals(
      "6hTd=Tc5s=Ts3d 4sJh 3c7c 6cQh",
      Solver.process("texas-holdem 7h9dAcAdQs Tc5s 4sJh 6hTd Ts3d 3c7c 6cQh"));
  }

  @Test
  public void test_texas_holdem_2204_6sAsQdTcTh_5h6h_4s8s_8c9s_7s3h() {
    assertEquals(
      "7s3h 4s8s 8c9s 5h6h",
      Solver.process("texas-holdem 6sAsQdTcTh 5h6h 4s8s 8c9s 7s3h"));
  }

  @Test
  public void test_texas_holdem_2205_2c3hAdJcQs_6h7d_8h2h_4d9d_Td7c_3s9h() {
    assertEquals(
      "6h7d 4d9d Td7c 8h2h 3s9h",
      Solver.process("texas-holdem 2c3hAdJcQs 6h7d 8h2h 4d9d Td7c 3s9h"));
  }

  @Test
  public void test_texas_holdem_2206_3d6cAcAhTc_9cKs_Ad5s() {
    assertEquals(
      "9cKs Ad5s",
      Solver.process("texas-holdem 3d6cAcAhTc 9cKs Ad5s"));
  }

  @Test
  public void test_texas_holdem_2207_2s6hAsJsQs_Jh3s_QcKd_AhKc_Kh6s_Tc8d() {
    assertEquals(
      "Tc8d QcKd AhKc Jh3s Kh6s",
      Solver.process("texas-holdem 2s6hAsJsQs Jh3s QcKd AhKc Kh6s Tc8d"));
  }

  @Test
  public void test_texas_holdem_2208_2cJhJsKsTh_9d9s_6sQc_5hAh_Tc6d_5d6c() {
    assertEquals(
      "5d6c 6sQc 5hAh 9d9s Tc6d",
      Solver.process("texas-holdem 2cJhJsKsTh 9d9s 6sQc 5hAh Tc6d 5d6c"));
  }

  @Test
  public void test_texas_holdem_2209_4h7hJcKcTd_8dQs_AhKs_Ts2c_4s6s_6dKd_6c2s_9cJs_5dTh_3s5c() {
    assertEquals(
      "3s5c 6c2s 8dQs 4s6s 5dTh=Ts2c 9cJs 6dKd AhKs",
      Solver.process("texas-holdem 4h7hJcKcTd 8dQs AhKs Ts2c 4s6s 6dKd 6c2s 9cJs 5dTh 3s5c"));
  }

  @Test
  public void test_texas_holdem_2210_7h7s9sQdTh_9dTc_2h6s_9h6c_8s5s_3dAh_AcKc() {
    assertEquals(
      "2h6s=8s5s 3dAh AcKc 9h6c 9dTc",
      Solver.process("texas-holdem 7h7s9sQdTh 9dTc 2h6s 9h6c 8s5s 3dAh AcKc"));
  }

  @Test
  public void test_texas_holdem_2211_4d7dAdKdTc_3d3c_9s2c_Jh8c_5c7h_6dJc_ThQc_Qs3h_8d2h() {
    assertEquals(
      "9s2c Jh8c Qs3h 5c7h ThQc 3d3c 6dJc 8d2h",
      Solver.process("texas-holdem 4d7dAdKdTc 3d3c 9s2c Jh8c 5c7h 6dJc ThQc Qs3h 8d2h"));
  }

  @Test
  public void test_texas_holdem_2212_3h6c6sJcJs_7h7s_9sAc_5s9h() {
    assertEquals(
      "5s9h 9sAc 7h7s",
      Solver.process("texas-holdem 3h6c6sJcJs 7h7s 9sAc 5s9h"));
  }

  @Test
  public void test_texas_holdem_2213_2d2h8d9hQs_JsQh_5s7s_AcAh_Qc6h_As6d_3s9s_8s4h() {
    assertEquals(
      "5s7s As6d 8s4h 3s9s Qc6h JsQh AcAh",
      Solver.process("texas-holdem 2d2h8d9hQs JsQh 5s7s AcAh Qc6h As6d 3s9s 8s4h"));
  }

  @Test
  public void test_texas_holdem_2214_2h8d8h9cQc_Kd7s_5d2s_TsJd_AhAc_4h4d_3dKc_Jc6d_8c9d_6h6c() {
    assertEquals(
      "Jc6d 3dKc=Kd7s 5d2s 4h4d 6h6c AhAc TsJd 8c9d",
      Solver.process("texas-holdem 2h8d8h9cQc Kd7s 5d2s TsJd AhAc 4h4d 3dKc Jc6d 8c9d 6h6c"));
  }

  @Test
  public void test_texas_holdem_2215_3d3s6dJdKs_9d2d_Qc7s_AsTc_8sKh_8hJc_5sKd_7c6h_4sJh_4h2c() {
    assertEquals(
      "4h2c Qc7s AsTc 7c6h 4sJh=8hJc 5sKd=8sKh 9d2d",
      Solver.process("texas-holdem 3d3s6dJdKs 9d2d Qc7s AsTc 8sKh 8hJc 5sKd 7c6h 4sJh 4h2c"));
  }

  @Test
  public void test_texas_holdem_2216_5s6d9hKdKs_TcJd_4h5h_4d5c_Qd6h_JcTd_3cJs_8h7h() {
    assertEquals(
      "3cJs JcTd=TcJd 4d5c=4h5h Qd6h 8h7h",
      Solver.process("texas-holdem 5s6d9hKdKs TcJd 4h5h 4d5c Qd6h JcTd 3cJs 8h7h"));
  }

  @Test
  public void test_texas_holdem_2217_6h8h9dAcTs_2d3h_3dJc_2h5d_8c5s_Td5h_7s6s() {
    assertEquals(
      "2d3h=2h5d 3dJc 8c5s Td5h 7s6s",
      Solver.process("texas-holdem 6h8h9dAcTs 2d3h 3dJc 2h5d 8c5s Td5h 7s6s"));
  }

  @Test
  public void test_texas_holdem_2218_2s4cQcThTs_7d4s_Ad9h_Ah7c() {
    assertEquals(
      "Ah7c Ad9h 7d4s",
      Solver.process("texas-holdem 2s4cQcThTs 7d4s Ad9h Ah7c"));
  }

  @Test
  public void test_texas_holdem_2219_3c6s9dAsQs_3h7d_Jd7c_2sKc_Ks2d_AhTd_4dTh_Qd3s() {
    assertEquals(
      "4dTh Jd7c 2sKc=Ks2d 3h7d AhTd Qd3s",
      Solver.process("texas-holdem 3c6s9dAsQs 3h7d Jd7c 2sKc Ks2d AhTd 4dTh Qd3s"));
  }

  @Test
  public void test_texas_holdem_2220_2h4d6dJdQc_6s8h_7c9c_2c8c_Jc7s_Kc7d_4s4c() {
    assertEquals(
      "7c9c Kc7d 2c8c 6s8h Jc7s 4s4c",
      Solver.process("texas-holdem 2h4d6dJdQc 6s8h 7c9c 2c8c Jc7s Kc7d 4s4c"));
  }

  @Test
  public void test_texas_holdem_2221_2c3cJdKdKh_As7d_5d7h_Th9h_8d4h_6sJc_KcAd_Jh5c_3dQd_3h3s() {
    assertEquals(
      "5d7h 8d4h Th9h As7d 3dQd Jh5c 6sJc KcAd 3h3s",
      Solver.process("texas-holdem 2c3cJdKdKh As7d 5d7h Th9h 8d4h 6sJc KcAd Jh5c 3dQd 3h3s"));
  }

  @Test
  public void test_texas_holdem_2222_2d5h5s8d9d_KcKd_7s2s_9sTh_3sJh_2h3d_9c6h_Kh4s_7c4c_Js6s() {
    assertEquals(
      "7c4c 3sJh=Js6s Kh4s 2h3d=7s2s 9c6h 9sTh KcKd",
      Solver.process("texas-holdem 2d5h5s8d9d KcKd 7s2s 9sTh 3sJh 2h3d 9c6h Kh4s 7c4c Js6s"));
  }

  @Test
  public void test_texas_holdem_2223_4c5c8hKdQs_4s9h_Ks9d_As2c_TcTs_8d7s_2dJs_Ah3s_5d5s_6s7c() {
    assertEquals(
      "2dJs Ah3s=As2c 4s9h 8d7s TcTs Ks9d 5d5s 6s7c",
      Solver.process("texas-holdem 4c5c8hKdQs 4s9h Ks9d As2c TcTs 8d7s 2dJs Ah3s 5d5s 6s7c"));
  }

  @Test
  public void test_texas_holdem_2224_5cKcQsTcTh_7sAs_5s8s_2c8c_7cAd() {
    assertEquals(
      "7cAd=7sAs 5s8s 2c8c",
      Solver.process("texas-holdem 5cKcQsTcTh 7sAs 5s8s 2c8c 7cAd"));
  }

  @Test
  public void test_texas_holdem_2225_2d4d4s8sKs_2sAs_Qc7h_TsKd() {
    assertEquals(
      "Qc7h TsKd 2sAs",
      Solver.process("texas-holdem 2d4d4s8sKs 2sAs Qc7h TsKd"));
  }

  @Test
  public void test_texas_holdem_2226_5s7sAhAsKs_TcTs_8sJh_8dKc_2dKh_4s3h() {
    assertEquals(
      "2dKh 8dKc 4s3h 8sJh TcTs",
      Solver.process("texas-holdem 5s7sAhAsKs TcTs 8sJh 8dKc 2dKh 4s3h"));
  }

  @Test
  public void test_texas_holdem_2227_8d9sJdJhQc_8hQd_2d9c_2h5s() {
    assertEquals(
      "2h5s 2d9c 8hQd",
      Solver.process("texas-holdem 8d9sJdJhQc 8hQd 2d9c 2h5s"));
  }

  @Test
  public void test_texas_holdem_2228_JhKcKsQdTd_Ts8h_9sAs_6hQs_5s4d_9cAc_5h5c() {
    assertEquals(
      "5s4d 5h5c Ts8h 6hQs 9cAc=9sAs",
      Solver.process("texas-holdem JhKcKsQdTd Ts8h 9sAs 6hQs 5s4d 9cAc 5h5c"));
  }

  @Test
  public void test_texas_holdem_2229_2s6d9sKcTd_4cAh_Th6h_5h2d_9h4s_QcKd_7c2h_5c6s_4hTc_3s7d() {
    assertEquals(
      "3s7d 4cAh 5h2d=7c2h 5c6s 9h4s 4hTc QcKd Th6h",
      Solver.process("texas-holdem 2s6d9sKcTd 4cAh Th6h 5h2d 9h4s QcKd 7c2h 5c6s 4hTc 3s7d"));
  }

  @Test
  public void test_texas_holdem_2230_3d6s9cQcQh_4hAh_JdJh() {
    assertEquals(
      "4hAh JdJh",
      Solver.process("texas-holdem 3d6s9cQcQh 4hAh JdJh"));
  }

  @Test
  public void test_texas_holdem_2231_3h5c8dAdAs_7hJs_8hJd_3dKc_Tc4h_ThKh() {
    assertEquals(
      "Tc4h 7hJs ThKh 3dKc 8hJd",
      Solver.process("texas-holdem 3h5c8dAdAs 7hJs 8hJd 3dKc Tc4h ThKh"));
  }

  @Test
  public void test_texas_holdem_2232_4d9cJsKcTh_6d8c_Jc2d_Ah7c() {
    assertEquals(
      "6d8c Ah7c Jc2d",
      Solver.process("texas-holdem 4d9cJsKcTh 6d8c Jc2d Ah7c"));
  }

  @Test
  public void test_texas_holdem_2233_2s4d4h5hKs_6s9c_6h8c_3d3h_5s8d_9h2c() {
    assertEquals(
      "6h8c 6s9c 9h2c 3d3h 5s8d",
      Solver.process("texas-holdem 2s4d4h5hKs 6s9c 6h8c 3d3h 5s8d 9h2c"));
  }

  @Test
  public void test_texas_holdem_2234_3d5s7cKsTh_4c2c_5c9c_6hTc_Kh4h() {
    assertEquals(
      "4c2c 5c9c 6hTc Kh4h",
      Solver.process("texas-holdem 3d5s7cKsTh 4c2c 5c9c 6hTc Kh4h"));
  }

  @Test
  public void test_texas_holdem_2235_2h6dJhQcTc_9d6s_7c5h_7h4h_3c4d_6cAs_Td5c_AdAh() {
    assertEquals(
      "3c4d 7c5h=7h4h 9d6s 6cAs Td5c AdAh",
      Solver.process("texas-holdem 2h6dJhQcTc 9d6s 7c5h 7h4h 3c4d 6cAs Td5c AdAh"));
  }

  @Test
  public void test_texas_holdem_2236_5d6h9cAdKd_Ac6c_5cTc_4hKs_Ts5h() {
    assertEquals(
      "5cTc=Ts5h 4hKs Ac6c",
      Solver.process("texas-holdem 5d6h9cAdKd Ac6c 5cTc 4hKs Ts5h"));
  }

  @Test
  public void test_texas_holdem_2237_2h6d7c7dKc_5d9d_3s8h_Kh3d_3c8s_JsQh_Jh9c() {
    assertEquals(
      "3c8s=3s8h 5d9d Jh9c JsQh Kh3d",
      Solver.process("texas-holdem 2h6d7c7dKc 5d9d 3s8h Kh3d 3c8s JsQh Jh9c"));
  }

  @Test
  public void test_texas_holdem_2238_2d4h8h9h9s_Ac3c_KcKs_Qh9d_7cJs_7h8c() {
    assertEquals(
      "7cJs Ac3c 7h8c KcKs Qh9d",
      Solver.process("texas-holdem 2d4h8h9h9s Ac3c KcKs Qh9d 7cJs 7h8c"));
  }

  @Test
  public void test_texas_holdem_2239_4d4h9sKdTs_AsJh_Th5c_2hQd_2s4s_5d8d_6cQc() {
    assertEquals(
      "5d8d 2hQd=6cQc AsJh Th5c 2s4s",
      Solver.process("texas-holdem 4d4h9sKdTs AsJh Th5c 2hQd 2s4s 5d8d 6cQc"));
  }

  @Test
  public void test_texas_holdem_2240_2h9d9sAdQh_Jc4d_7cKc_Jh8d_4c3s_As5h_6c8h_4s8s_KhTc() {
    assertEquals(
      "4c3s 4s8s=6c8h Jc4d=Jh8d 7cKc=KhTc As5h",
      Solver.process("texas-holdem 2h9d9sAdQh Jc4d 7cKc Jh8d 4c3s As5h 6c8h 4s8s KhTc"));
  }

  @Test
  public void test_texas_holdem_2241_4h7h8dKcKs_AhAd_Td4s_5h9s_KhJs_3s9c() {
    assertEquals(
      "3s9c=5h9s Td4s AhAd KhJs",
      Solver.process("texas-holdem 4h7h8dKcKs AhAd Td4s 5h9s KhJs 3s9c"));
  }

  @Test
  public void test_texas_holdem_2242_3s4d6s9sKh_JcKc_6cAs_4cTs_4h2c_5h5c_Ac7s() {
    assertEquals(
      "Ac7s 4h2c 4cTs 5h5c 6cAs JcKc",
      Solver.process("texas-holdem 3s4d6s9sKh JcKc 6cAs 4cTs 4h2c 5h5c Ac7s"));
  }

  @Test
  public void test_texas_holdem_2243_3s9sJsQcTs_Kd6s_2dTh_7c8c_Ah5d_8sJc_6h5h_9h2c_4h3c_3dKs() {
    assertEquals(
      "6h5h Ah5d 4h3c 9h2c 2dTh 7c8c Kd6s 8sJc 3dKs",
      Solver.process("texas-holdem 3s9sJsQcTs Kd6s 2dTh 7c8c Ah5d 8sJc 6h5h 9h2c 4h3c 3dKs"));
  }

  @Test
  public void test_texas_holdem_2244_3c3s4h8h9d_6c5d_7sJd_9s2h() {
    assertEquals(
      "6c5d 7sJd 9s2h",
      Solver.process("texas-holdem 3c3s4h8h9d 6c5d 7sJd 9s2h"));
  }

  @Test
  public void test_texas_holdem_2245_3h4c9dQcTc_ThTd_3c6s_7hKd_7dQs_4hKs_3d2c() {
    assertEquals(
      "7hKd 3c6s=3d2c 4hKs 7dQs ThTd",
      Solver.process("texas-holdem 3h4c9dQcTc ThTd 3c6s 7hKd 7dQs 4hKs 3d2c"));
  }

  @Test
  public void test_texas_holdem_2246_6s9d9sAdQs_6d5c_Jh4h() {
    assertEquals(
      "Jh4h 6d5c",
      Solver.process("texas-holdem 6s9d9sAdQs 6d5c Jh4h"));
  }

  @Test
  public void test_texas_holdem_2247_4d7d7hQdQh_6hKc_3d8c_AdTc_As3h_6cQc() {
    assertEquals(
      "3d8c 6hKc AdTc=As3h 6cQc",
      Solver.process("texas-holdem 4d7d7hQdQh 6hKc 3d8c AdTc As3h 6cQc"));
  }

  @Test
  public void test_texas_holdem_2248_2d3h4h6h7h_Jh3c_Ts5s_7dKc_QhJc_5c5d_ThQc_2s5h_4s9d() {
    assertEquals(
      "4s9d 7dKc 5c5d=Ts5s ThQc Jh3c QhJc 2s5h",
      Solver.process("texas-holdem 2d3h4h6h7h Jh3c Ts5s 7dKc QhJc 5c5d ThQc 2s5h 4s9d"));
  }

  @Test
  public void test_texas_holdem_2249_4h5d6dQhTh_9sJh_9h6c() {
    assertEquals(
      "9sJh 9h6c",
      Solver.process("texas-holdem 4h5d6dQhTh 9sJh 9h6c"));
  }

}
