
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TexasHoldemSolver24HiddenTest {


  @Test
  public void test_texas_holdem_6000_2hAsQdQsTd_5s3s_JsKs() {
    assertEquals(
      "5s3s JsKs",
      Solver.process("texas-holdem 2hAsQdQsTd 5s3s JsKs"));
  }

  @Test
  public void test_texas_holdem_6001_4s6h6sAsJh_3dTs_8s9h() {
    assertEquals(
      "8s9h 3dTs",
      Solver.process("texas-holdem 4s6h6sAsJh 3dTs 8s9h"));
  }

  @Test
  public void test_texas_holdem_6002_3h8s9c9hAc_7h4c_8h4s_Qs3c_JhAh_TcAs_9s7d() {
    assertEquals(
      "7h4c Qs3c 8h4s TcAs JhAh 9s7d",
      Solver.process("texas-holdem 3h8s9c9hAc 7h4c 8h4s Qs3c JhAh TcAs 9s7d"));
  }

  @Test
  public void test_texas_holdem_6003_2s6hJcJhQc_Qh6s_Qd8d_Tc4h_2dAd() {
    assertEquals(
      "Tc4h 2dAd Qh6s Qd8d",
      Solver.process("texas-holdem 2s6hJcJhQc Qh6s Qd8d Tc4h 2dAd"));
  }

  @Test
  public void test_texas_holdem_6004_3h6c6dAdJh_7hJd_Qc4h() {
    assertEquals(
      "Qc4h 7hJd",
      Solver.process("texas-holdem 3h6c6dAdJh 7hJd Qc4h"));
  }

  @Test
  public void test_texas_holdem_6005_8c9hAsQcQd_Qh8d_8hJs_6cTd_9s3s_Tc2s_4h4s() {
    assertEquals(
      "6cTd=Tc2s 4h4s 8hJs 9s3s Qh8d",
      Solver.process("texas-holdem 8c9hAsQcQd Qh8d 8hJs 6cTd 9s3s Tc2s 4h4s"));
  }

  @Test
  public void test_texas_holdem_6006_4d4hAsJdKs_3c6d_7h5s_7d6c_8sQh_KhAh_5dTs_Jh4c() {
    assertEquals(
      "3c6d=5dTs=7d6c=7h5s 8sQh KhAh Jh4c",
      Solver.process("texas-holdem 4d4hAsJdKs 3c6d 7h5s 7d6c 8sQh KhAh 5dTs Jh4c"));
  }

  @Test
  public void test_texas_holdem_6007_3s7c8dKcQc_QhTs_6s7d_As5s() {
    assertEquals(
      "As5s 6s7d QhTs",
      Solver.process("texas-holdem 3s7c8dKcQc QhTs 6s7d As5s"));
  }

  @Test
  public void test_texas_holdem_6008_2h4h8hJdKs_Qd6c_9sJc_QhAd_As2s_2dJs_9cTd_Tc3d_6sKc_4c8s() {
    assertEquals(
      "Tc3d 9cTd Qd6c QhAd As2s 9sJc 6sKc 4c8s 2dJs",
      Solver.process("texas-holdem 2h4h8hJdKs Qd6c 9sJc QhAd As2s 2dJs 9cTd Tc3d 6sKc 4c8s"));
  }

  @Test
  public void test_texas_holdem_6009_3d5d5h9cQd_JcTd_6sKc_4sAd() {
    assertEquals(
      "JcTd 6sKc 4sAd",
      Solver.process("texas-holdem 3d5d5h9cQd JcTd 6sKc 4sAd"));
  }

  @Test
  public void test_texas_holdem_6010_7s8cJcJhKd_8sAd_5h5s_2sQd_3d5d_3sQc_2h4c() {
    assertEquals(
      "2h4c=3d5d 2sQd=3sQc 5h5s 8sAd",
      Solver.process("texas-holdem 7s8cJcJhKd 8sAd 5h5s 2sQd 3d5d 3sQc 2h4c"));
  }

  @Test
  public void test_texas_holdem_6011_3c4d5hJsKc_6s2h_8hJd_Ah2d_Ac8d_6d3d_ThQh_6h4h_7h9h() {
    assertEquals(
      "7h9h ThQh Ac8d 6d3d 6h4h 8hJd Ah2d 6s2h",
      Solver.process("texas-holdem 3c4d5hJsKc 6s2h 8hJd Ah2d Ac8d 6d3d ThQh 6h4h 7h9h"));
  }

  @Test
  public void test_texas_holdem_6012_4h7sAcJcQd_AsQc_4d7d_2d6h_5h4c_9c2c_3c5c_8s5d() {
    assertEquals(
      "3c5c 2d6h 8s5d 9c2c 5h4c 4d7d AsQc",
      Solver.process("texas-holdem 4h7sAcJcQd AsQc 4d7d 2d6h 5h4c 9c2c 3c5c 8s5d"));
  }

  @Test
  public void test_texas_holdem_6013_3c5sKcKdTh_2s3s_8s6d_7h5h_Ah3h_9d2d() {
    assertEquals(
      "8s6d 9d2d 2s3s Ah3h 7h5h",
      Solver.process("texas-holdem 3c5sKcKdTh 2s3s 8s6d 7h5h Ah3h 9d2d"));
  }

  @Test
  public void test_texas_holdem_6014_2s7sJhKcKh_Ts4c_Qc2d_Ks6h_Jd9d() {
    assertEquals(
      "Ts4c Qc2d Jd9d Ks6h",
      Solver.process("texas-holdem 2s7sJhKcKh Ts4c Qc2d Ks6h Jd9d"));
  }

  @Test
  public void test_texas_holdem_6015_2c2h8dAdAh_3s2s_3h4s_5h5d_Qh6h_7hKd_7c4c_QcAc_Ts9d() {
    assertEquals(
      "3h4s=7c4c Ts9d Qh6h 7hKd 5h5d 3s2s QcAc",
      Solver.process("texas-holdem 2c2h8dAdAh 3s2s 3h4s 5h5d Qh6h 7hKd 7c4c QcAc Ts9d"));
  }

  @Test
  public void test_texas_holdem_6016_2h5s8c9cJs_5d7c_Qc2s_9h3h_KhQh_8hKs_6hAh_Th4s() {
    assertEquals(
      "Th4s KhQh 6hAh Qc2s 5d7c 8hKs 9h3h",
      Solver.process("texas-holdem 2h5s8c9cJs 5d7c Qc2s 9h3h KhQh 8hKs 6hAh Th4s"));
  }

  @Test
  public void test_texas_holdem_6017_3d6dJdQcQh_TcAc_8hKs_Jc7h() {
    assertEquals(
      "8hKs TcAc Jc7h",
      Solver.process("texas-holdem 3d6dJdQcQh TcAc 8hKs Jc7h"));
  }

  @Test
  public void test_texas_holdem_6018_3hKcKhKsQs_Tc7c_7s2c_AdQc_9hTd_3sQh_Qd7h() {
    assertEquals(
      "7s2c 9hTd=Tc7c 3sQh=AdQc=Qd7h",
      Solver.process("texas-holdem 3hKcKhKsQs Tc7c 7s2c AdQc 9hTd 3sQh Qd7h"));
  }

  @Test
  public void test_texas_holdem_6019_2c3s6h9dQd_5d7s_9hKc_6d7c_8hTs() {
    assertEquals(
      "5d7s 8hTs 6d7c 9hKc",
      Solver.process("texas-holdem 2c3s6h9dQd 5d7s 9hKc 6d7c 8hTs"));
  }

  @Test
  public void test_texas_holdem_6020_2c3h6h8dKs_4cAs_Qc9s_Ts9d_Jd8c_5c2d() {
    assertEquals(
      "Ts9d Qc9s 4cAs 5c2d Jd8c",
      Solver.process("texas-holdem 2c3h6h8dKs 4cAs Qc9s Ts9d Jd8c 5c2d"));
  }

  @Test
  public void test_texas_holdem_6021_4s6hJcKdQs_Qc5c_Ts7h_As4h_Th9s_3h4c_6s9h() {
    assertEquals(
      "Ts7h 3h4c As4h 6s9h Qc5c Th9s",
      Solver.process("texas-holdem 4s6hJcKdQs Qc5c Ts7h As4h Th9s 3h4c 6s9h"));
  }

  @Test
  public void test_texas_holdem_6022_5c5d6hKdTh_3cTd_6c7d_Kc4h_5hJc() {
    assertEquals(
      "6c7d 3cTd Kc4h 5hJc",
      Solver.process("texas-holdem 5c5d6hKdTh 3cTd 6c7d Kc4h 5hJc"));
  }

  @Test
  public void test_texas_holdem_6023_3c5c5d7c8s_2d2s_7d6s_6dJd_Jh3d_AsQd_Qh2c_QsTd_3s7h_Ad9c() {
    assertEquals(
      "6dJd Qh2c QsTd Ad9c AsQd 2d2s Jh3d 3s7h=7d6s",
      Solver.process("texas-holdem 3c5c5d7c8s 2d2s 7d6s 6dJd Jh3d AsQd Qh2c QsTd 3s7h Ad9c"));
  }

  @Test
  public void test_texas_holdem_6024_2d5s9sQdTs_Js7c_3c7h_4h9h() {
    assertEquals(
      "3c7h Js7c 4h9h",
      Solver.process("texas-holdem 2d5s9sQdTs Js7c 3c7h 4h9h"));
  }

  @Test
  public void test_texas_holdem_6025_3h6dAhJhQd_As9c_6s6h_6c4s_9h4d_Qc5d_Th8c() {
    assertEquals(
      "9h4d Th8c 6c4s Qc5d As9c 6s6h",
      Solver.process("texas-holdem 3h6dAhJhQd As9c 6s6h 6c4s 9h4d Qc5d Th8c"));
  }

  @Test
  public void test_texas_holdem_6026_7d8hAhAsQs_Ad2s_9s2c_7sTc_6cQd_Jc7h_2d6s_Th4h_5cAc_QhJd() {
    assertEquals(
      "2d6s 9s2c Th4h 7sTc=Jc7h 6cQd QhJd 5cAc=Ad2s",
      Solver.process("texas-holdem 7d8hAhAsQs Ad2s 9s2c 7sTc 6cQd Jc7h 2d6s Th4h 5cAc QhJd"));
  }

  @Test
  public void test_texas_holdem_6027_4h4s7s9hQd_Ah3s_8h9d_Ad5s() {
    assertEquals(
      "Ad5s=Ah3s 8h9d",
      Solver.process("texas-holdem 4h4s7s9hQd Ah3s 8h9d Ad5s"));
  }

  @Test
  public void test_texas_holdem_6028_3d4d4s9dJc_JdAs_7d6d_3hQc_4h7s_5c4c_TdKc_Th8s_5d9s_6sAc() {
    assertEquals(
      "Th8s TdKc 6sAc 3hQc 5d9s JdAs 4h7s=5c4c 7d6d",
      Solver.process("texas-holdem 3d4d4s9dJc JdAs 7d6d 3hQc 4h7s 5c4c TdKc Th8s 5d9s 6sAc"));
  }

  @Test
  public void test_texas_holdem_6029_2c6h8c9sQd_4sAh_6c8s_Ts6d_7s2d_8hTd_ThJs_AsKc() {
    assertEquals(
      "4sAh AsKc 7s2d Ts6d 8hTd 6c8s ThJs",
      Solver.process("texas-holdem 2c6h8c9sQd 4sAh 6c8s Ts6d 7s2d 8hTd ThJs AsKc"));
  }

  @Test
  public void test_texas_holdem_6030_4d5sAhQhTh_Ac5h_2s8s_Js7h_JdTd_Ts7d_KcAs_9c6h_7s5d_3dAd() {
    assertEquals(
      "2s8s 9c6h Js7h 7s5d Ts7d JdTd 3dAd KcAs Ac5h",
      Solver.process("texas-holdem 4d5sAhQhTh Ac5h 2s8s Js7h JdTd Ts7d KcAs 9c6h 7s5d 3dAd"));
  }

  @Test
  public void test_texas_holdem_6031_2d5s6s9sAc_3sJh_Js3h_QhKd_JdKs_2s9h_Kc8c_5d6h_Td7h() {
    assertEquals(
      "Td7h 3sJh=Js3h Kc8c JdKs QhKd 5d6h 2s9h",
      Solver.process("texas-holdem 2d5s6s9sAc 3sJh Js3h QhKd JdKs 2s9h Kc8c 5d6h Td7h"));
  }

  @Test
  public void test_texas_holdem_6032_5h6s8sJsKd_9h2d_7c4d_Ah2h_KhJh_6hKs() {
    assertEquals(
      "9h2d Ah2h 6hKs KhJh 7c4d",
      Solver.process("texas-holdem 5h6s8sJsKd 9h2d 7c4d Ah2h KhJh 6hKs"));
  }

  @Test
  public void test_texas_holdem_6033_2h4d7d8dKd_9d9h_Qd9c_7c3s_8s2c_6cTh() {
    assertEquals(
      "6cTh 7c3s 8s2c 9d9h Qd9c",
      Solver.process("texas-holdem 2h4d7d8dKd 9d9h Qd9c 7c3s 8s2c 6cTh"));
  }

  @Test
  public void test_texas_holdem_6034_5c5s8sQdTd_KhTc_8hAd_Js5h_3c3d_JdQs_4dTh() {
    assertEquals(
      "3c3d 8hAd 4dTh KhTc JdQs Js5h",
      Solver.process("texas-holdem 5c5s8sQdTd KhTc 8hAd Js5h 3c3d JdQs 4dTh"));
  }

  @Test
  public void test_texas_holdem_6035_3c6c7cAhKd_4dQh_8h2h_7s6d_5dTc_Td7d_9s4s_QdKh() {
    assertEquals(
      "8h2h 9s4s 5dTc 4dQh Td7d QdKh 7s6d",
      Solver.process("texas-holdem 3c6c7cAhKd 4dQh 8h2h 7s6d 5dTc Td7d 9s4s QdKh"));
  }

  @Test
  public void test_texas_holdem_6036_3h4s7sKcQh_9dAc_4d7c() {
    assertEquals(
      "9dAc 4d7c",
      Solver.process("texas-holdem 3h4s7sKcQh 9dAc 4d7c"));
  }

  @Test
  public void test_texas_holdem_6037_2c5c9c9dJd_5dAc_3s6c_4d5h_Kh2d() {
    assertEquals(
      "3s6c Kh2d 4d5h 5dAc",
      Solver.process("texas-holdem 2c5c9c9dJd 5dAc 3s6c 4d5h Kh2d"));
  }

  @Test
  public void test_texas_holdem_6038_2s3h4s5s7s_5d2d_QcKd_5c8s_8dTh_AcAd_3cJc() {
    assertEquals(
      "8dTh QcKd 3cJc 5d2d AcAd 5c8s",
      Solver.process("texas-holdem 2s3h4s5s7s 5d2d QcKd 5c8s 8dTh AcAd 3cJc"));
  }

  @Test
  public void test_texas_holdem_6039_2d5s6h7cTh_9s6s_8c8h() {
    assertEquals(
      "9s6s 8c8h",
      Solver.process("texas-holdem 2d5s6h7cTh 9s6s 8c8h"));
  }

  @Test
  public void test_texas_holdem_6040_2d4d7sQcTd_6d2h_As3d_KcTh_3cJh_2cKh_Ad5d() {
    assertEquals(
      "3cJh As3d 6d2h 2cKh KcTh Ad5d",
      Solver.process("texas-holdem 2d4d7sQcTd 6d2h As3d KcTh 3cJh 2cKh Ad5d"));
  }

  @Test
  public void test_texas_holdem_6041_2d6d8dJsQd_5cJh_6c9d_5hAh_TdKc_Tc6s() {
    assertEquals(
      "5hAh Tc6s 5cJh 6c9d TdKc",
      Solver.process("texas-holdem 2d6d8dJsQd 5cJh 6c9d 5hAh TdKc Tc6s"));
  }

  @Test
  public void test_texas_holdem_6042_6h8c9cKsTc_Jc3d_2h7h_9dKd_4sKh_7d5s_9s5c_Qc3s_3h2d() {
    assertEquals(
      "3h2d Jc3d Qc3s 9s5c 4sKh 9dKd 2h7h=7d5s",
      Solver.process("texas-holdem 6h8c9cKsTc Jc3d 2h7h 9dKd 4sKh 7d5s 9s5c Qc3s 3h2d"));
  }

  @Test
  public void test_texas_holdem_6043_4h5c9sAcKd_QcQh_2d3h() {
    assertEquals(
      "QcQh 2d3h",
      Solver.process("texas-holdem 4h5c9sAcKd QcQh 2d3h"));
  }

  @Test
  public void test_texas_holdem_6044_3s5c8sKdKh_Ah2s_Kc9d_TsJh_ThAc_6d2c_7c2d_7sTd_Qc3c_2h8c() {
    assertEquals(
      "6d2c 7c2d 7sTd TsJh Ah2s ThAc Qc3c 2h8c Kc9d",
      Solver.process("texas-holdem 3s5c8sKdKh Ah2s Kc9d TsJh ThAc 6d2c 7c2d 7sTd Qc3c 2h8c"));
  }

  @Test
  public void test_texas_holdem_6045_3s4s8hAhKs_2c2h_3c7s_Ts6s_4cQc_Qs9s_4dAs_6h7d_Kc9d() {
    assertEquals(
      "6h7d 2c2h 3c7s 4cQc Kc9d 4dAs Ts6s Qs9s",
      Solver.process("texas-holdem 3s4s8hAhKs 2c2h 3c7s Ts6s 4cQc Qs9s 4dAs 6h7d Kc9d"));
  }

  @Test
  public void test_texas_holdem_6046_2h5d8d9dKd_4dTs_TcKc_8c9h_3cAc_3d7s_Ah6c_4hAs() {
    assertEquals(
      "3cAc=4hAs Ah6c TcKc 8c9h 3d7s 4dTs",
      Solver.process("texas-holdem 2h5d8d9dKd 4dTs TcKc 8c9h 3cAc 3d7s Ah6c 4hAs"));
  }

  @Test
  public void test_texas_holdem_6047_2s3s4c6dKd_Tc7h_2d5h_4dAh() {
    assertEquals(
      "Tc7h 4dAh 2d5h",
      Solver.process("texas-holdem 2s3s4c6dKd Tc7h 2d5h 4dAh"));
  }

  @Test
  public void test_texas_holdem_6048_3c4c6d7h7s_6hJc_9h8s_Qs2h_8cTh_KhJs_4h8h_AdAh_2s9c_5cTc() {
    assertEquals(
      "2s9c 9h8s 8cTh Qs2h KhJs 4h8h 6hJc AdAh 5cTc",
      Solver.process("texas-holdem 3c4c6d7h7s 6hJc 9h8s Qs2h 8cTh KhJs 4h8h AdAh 2s9c 5cTc"));
  }

  @Test
  public void test_texas_holdem_6049_2s4d4s7cKh_7s5h_QhAs_JhKs_9dAd_3sTc_5d8d() {
    assertEquals(
      "5d8d 3sTc 9dAd QhAs 7s5h JhKs",
      Solver.process("texas-holdem 2s4d4s7cKh 7s5h QhAs JhKs 9dAd 3sTc 5d8d"));
  }

  @Test
  public void test_texas_holdem_6050_3c4c5hAhQs_Kh5d_Qh3h_7s2c_4d9s_6c6s() {
    assertEquals(
      "4d9s Kh5d 6c6s Qh3h 7s2c",
      Solver.process("texas-holdem 3c4c5hAhQs Kh5d Qh3h 7s2c 4d9s 6c6s"));
  }

  @Test
  public void test_texas_holdem_6051_2h7d9sJcQd_KsJh_5s4h_Tc3h_Js9d_2c4s_AdQs() {
    assertEquals(
      "5s4h Tc3h 2c4s KsJh AdQs Js9d",
      Solver.process("texas-holdem 2h7d9sJcQd KsJh 5s4h Tc3h Js9d 2c4s AdQs"));
  }

  @Test
  public void test_texas_holdem_6052_2c3c3d3h7c_TcAh_Ad6h() {
    assertEquals(
      "Ad6h TcAh",
      Solver.process("texas-holdem 2c3c3d3h7c TcAh Ad6h"));
  }

  @Test
  public void test_texas_holdem_6053_3d8h9hKhQd_Kd6h_4h9d_2hTc_3hAd_7c7h_5s4d_6sQh_6c8s() {
    assertEquals(
      "5s4d 2hTc 3hAd 7c7h 6c8s 4h9d 6sQh Kd6h",
      Solver.process("texas-holdem 3d8h9hKhQd Kd6h 4h9d 2hTc 3hAd 7c7h 5s4d 6sQh 6c8s"));
  }

  @Test
  public void test_texas_holdem_6054_2s5h7h9hQs_2d8c_3cTs_QdJc_5c4d_Th5s_7d9s_5dTc() {
    assertEquals(
      "3cTs 2d8c 5c4d 5dTc=Th5s QdJc 7d9s",
      Solver.process("texas-holdem 2s5h7h9hQs 2d8c 3cTs QdJc 5c4d Th5s 7d9s 5dTc"));
  }

  @Test
  public void test_texas_holdem_6055_4c5c5h5sJc_8s2s_JsJd_Jh4s() {
    assertEquals(
      "8s2s Jh4s JsJd",
      Solver.process("texas-holdem 4c5c5h5sJc 8s2s JsJd Jh4s"));
  }

  @Test
  public void test_texas_holdem_6056_3s5cAhJsQd_4dTs_3cAs() {
    assertEquals(
      "4dTs 3cAs",
      Solver.process("texas-holdem 3s5cAhJsQd 4dTs 3cAs"));
  }

  @Test
  public void test_texas_holdem_6057_2s9hJcKcQh_9d9s_8h3d_6sAh_6cTc() {
    assertEquals(
      "8h3d 6sAh 9d9s 6cTc",
      Solver.process("texas-holdem 2s9hJcKcQh 9d9s 8h3d 6sAh 6cTc"));
  }

  @Test
  public void test_texas_holdem_6058_AcJcKsQdQs_AhAd_2d3s_Jh9d_Qc8h() {
    assertEquals(
      "2d3s Jh9d Qc8h AhAd",
      Solver.process("texas-holdem AcJcKsQdQs AhAd 2d3s Jh9d Qc8h"));
  }

  @Test
  public void test_texas_holdem_6059_2s3s5hJhJs_Td2c_7dAd_7hTs_Qc4s_Kd6s_3hJd_Kc5c_8h3d() {
    assertEquals(
      "7hTs Qc4s Kd6s 7dAd Td2c 8h3d Kc5c 3hJd",
      Solver.process("texas-holdem 2s3s5hJhJs Td2c 7dAd 7hTs Qc4s Kd6s 3hJd Kc5c 8h3d"));
  }

  @Test
  public void test_texas_holdem_6060_3d6c6sQsTs_Jd2d_TdAd_5c3c_4dKs_6h6d_Js5s_Tc5d_Ac9c() {
    assertEquals(
      "Jd2d 4dKs Ac9c 5c3c Tc5d TdAd Js5s 6h6d",
      Solver.process("texas-holdem 3d6c6sQsTs Jd2d TdAd 5c3c 4dKs 6h6d Js5s Tc5d Ac9c"));
  }

  @Test
  public void test_texas_holdem_6061_4h5c5s8c9d_TdQs_Ac3d_Kc8d_Jh2c_QdQc_3h2h_6sQh_6c4s_6d3c() {
    assertEquals(
      "3h2h 6d3c Jh2c 6sQh TdQs Ac3d 6c4s Kc8d QdQc",
      Solver.process("texas-holdem 4h5c5s8c9d TdQs Ac3d Kc8d Jh2c QdQc 3h2h 6sQh 6c4s 6d3c"));
  }

  @Test
  public void test_texas_holdem_6062_5d7c7sKcTc_JcAs_Ac2s() {
    assertEquals(
      "Ac2s JcAs",
      Solver.process("texas-holdem 5d7c7sKcTc JcAs Ac2s"));
  }

  @Test
  public void test_texas_holdem_6063_3s4c4h9dJs_Tc7s_3h9c_2d2c_3d7c_TdKd_Ad8d_4sJh_QdJd() {
    assertEquals(
      "Tc7s TdKd Ad8d 2d2c 3d7c 3h9c QdJd 4sJh",
      Solver.process("texas-holdem 3s4c4h9dJs Tc7s 3h9c 2d2c 3d7c TdKd Ad8d 4sJh QdJd"));
  }

  @Test
  public void test_texas_holdem_6064_5hAsKcKdTd_Jd8h_2c7h_2d6d_6c4s_4hQc_Tc6h_2s3d_5d6s_3h4c() {
    assertEquals(
      "2s3d=3h4c 2d6d=6c4s 2c7h Jd8h 4hQc 5d6s Tc6h",
      Solver.process("texas-holdem 5hAsKcKdTd Jd8h 2c7h 2d6d 6c4s 4hQc Tc6h 2s3d 5d6s 3h4c"));
  }

  @Test
  public void test_texas_holdem_6065_6c8cAsJsTh_2c6s_7s4d_2h8d_3s5s_3h7h() {
    assertEquals(
      "3s5s 3h7h=7s4d 2c6s 2h8d",
      Solver.process("texas-holdem 6c8cAsJsTh 2c6s 7s4d 2h8d 3s5s 3h7h"));
  }

  @Test
  public void test_texas_holdem_6066_3d5d5h8sTs_7sKh_8hQc_Qd9d() {
    assertEquals(
      "Qd9d 7sKh 8hQc",
      Solver.process("texas-holdem 3d5d5h8sTs 7sKh 8hQc Qd9d"));
  }

  @Test
  public void test_texas_holdem_6067_2s4s7sAcJs_KhQd_6cTc_Td3c() {
    assertEquals(
      "Td3c 6cTc KhQd",
      Solver.process("texas-holdem 2s4s7sAcJs KhQd 6cTc Td3c"));
  }

  @Test
  public void test_texas_holdem_6068_4d5dAcKcKd_3sQc_Td5h_Jh6d_8h2c_8d8c() {
    assertEquals(
      "8h2c Jh6d 3sQc Td5h 8d8c",
      Solver.process("texas-holdem 4d5dAcKcKd 3sQc Td5h Jh6d 8h2c 8d8c"));
  }

  @Test
  public void test_texas_holdem_6069_2h4c5s8hQs_Kh4d_8s4s() {
    assertEquals(
      "Kh4d 8s4s",
      Solver.process("texas-holdem 2h4c5s8hQs Kh4d 8s4s"));
  }

  @Test
  public void test_texas_holdem_6070_6hAcJcKdTd_8d6s_9h5c_AsTc_3sQs_5sTs() {
    assertEquals(
      "9h5c 8d6s 5sTs AsTc 3sQs",
      Solver.process("texas-holdem 6hAcJcKdTd 8d6s 9h5c AsTc 3sQs 5sTs"));
  }

  @Test
  public void test_texas_holdem_6071_2d3h3s5s7d_3c2h_Jh6c() {
    assertEquals(
      "Jh6c 3c2h",
      Solver.process("texas-holdem 2d3h3s5s7d 3c2h Jh6c"));
  }

  @Test
  public void test_texas_holdem_6072_2d3h3s8dQc_3d2h_9cAs_Ad6s_6hJs_TcKd_Jc8c() {
    assertEquals(
      "6hJs TcKd Ad6s 9cAs Jc8c 3d2h",
      Solver.process("texas-holdem 2d3h3s8dQc 3d2h 9cAs Ad6s 6hJs TcKd Jc8c"));
  }

  @Test
  public void test_texas_holdem_6073_2c3s4dKhQs_7dQh_5d4s_2h5h_AhQd_3hTh_7s2s_As2d_QcTc() {
    assertEquals(
      "2h5h 7s2s As2d 3hTh 5d4s 7dQh QcTc AhQd",
      Solver.process("texas-holdem 2c3s4dKhQs 7dQh 5d4s 2h5h AhQd 3hTh 7s2s As2d QcTc"));
  }

  @Test
  public void test_texas_holdem_6074_2c5d8hKhQc_2hAc_KcJs_Qs2s_6hTs() {
    assertEquals(
      "6hTs 2hAc KcJs Qs2s",
      Solver.process("texas-holdem 2c5d8hKhQc 2hAc KcJs Qs2s 6hTs"));
  }

  @Test
  public void test_texas_holdem_6075_8d8hAcQcQd_6h5s_2s2d_4sJh_Th7s_7cAs_Ks3s_Tc5d() {
    assertEquals(
      "2s2d=4sJh=6h5s=Ks3s=Tc5d=Th7s 7cAs",
      Solver.process("texas-holdem 8d8hAcQcQd 6h5s 2s2d 4sJh Th7s 7cAs Ks3s Tc5d"));
  }

  @Test
  public void test_texas_holdem_6076_4d5sKsQhTd_9s6c_Qs3s_KcJd_9c8d_Ah5c_8sTc_4s8c_Jh5h() {
    assertEquals(
      "9s6c 9c8d 4s8c Jh5h Ah5c 8sTc Qs3s KcJd",
      Solver.process("texas-holdem 4d5sKsQhTd 9s6c Qs3s KcJd 9c8d Ah5c 8sTc 4s8c Jh5h"));
  }

  @Test
  public void test_texas_holdem_6077_2d6d7c7dQs_3h3c_4d2s_Qd8h() {
    assertEquals(
      "4d2s 3h3c Qd8h",
      Solver.process("texas-holdem 2d6d7c7dQs 3h3c 4d2s Qd8h"));
  }

  @Test
  public void test_texas_holdem_6078_2h5h6s9sJh_8d8c_Ts2c() {
    assertEquals(
      "Ts2c 8d8c",
      Solver.process("texas-holdem 2h5h6s9sJh 8d8c Ts2c"));
  }

  @Test
  public void test_texas_holdem_6079_2c6dJhKhTh_Jc2h_Qd9d_Tc8c_3s4d_Jd7c_6c9c_4sQs() {
    assertEquals(
      "3s4d 4sQs 6c9c Tc8c Jd7c Jc2h Qd9d",
      Solver.process("texas-holdem 2c6dJhKhTh Jc2h Qd9d Tc8c 3s4d Jd7c 6c9c 4sQs"));
  }

  @Test
  public void test_texas_holdem_6080_2d5c8cJhQc_QsKc_Kd5s_4c9c_6sTh_Jc4s_7dKh() {
    assertEquals(
      "6sTh 7dKh Kd5s Jc4s QsKc 4c9c",
      Solver.process("texas-holdem 2d5c8cJhQc QsKc Kd5s 4c9c 6sTh Jc4s 7dKh"));
  }

  @Test
  public void test_texas_holdem_6081_3h4h6c7c9s_6hAc_8sJc_Kc8h_AsJs_AhKh_7s5h_KsTs_Qd6d_2dTh() {
    assertEquals(
      "2dTh 8sJc Kc8h KsTs AsJs AhKh Qd6d 6hAc 7s5h",
      Solver.process("texas-holdem 3h4h6c7c9s 6hAc 8sJc Kc8h AsJs AhKh 7s5h KsTs Qd6d 2dTh"));
  }

  @Test
  public void test_texas_holdem_6082_3h5h8hKhQc_8cKs_Ah3c_As2h_9h5d_6sJh_JsJd() {
    assertEquals(
      "JsJd 8cKs As2h 9h5d 6sJh Ah3c",
      Solver.process("texas-holdem 3h5h8hKhQc 8cKs Ah3c As2h 9h5d 6sJh JsJd"));
  }

  @Test
  public void test_texas_holdem_6083_4h8hAhKdTc_5h3d_Js7c_Qd6h_9d9h() {
    assertEquals(
      "5h3d Js7c Qd6h 9d9h",
      Solver.process("texas-holdem 4h8hAhKdTc 5h3d Js7c Qd6h 9d9h"));
  }

  @Test
  public void test_texas_holdem_6084_3d3s4c6hAd_5sJd_QsJs_Ah2d_Kd5d_6s6c_4s5h() {
    assertEquals(
      "5sJd QsJs Kd5d 4s5h Ah2d 6s6c",
      Solver.process("texas-holdem 3d3s4c6hAd 5sJd QsJs Ah2d Kd5d 6s6c 4s5h"));
  }

  @Test
  public void test_texas_holdem_6085_2d3c7d9sTs_5d8c_4d3s_8sJd_Qc2h_Ad6h_Kh4h_Tc8d() {
    assertEquals(
      "5d8c Kh4h Ad6h Qc2h 4d3s Tc8d 8sJd",
      Solver.process("texas-holdem 2d3c7d9sTs 5d8c 4d3s 8sJd Qc2h Ad6h Kh4h Tc8d"));
  }

  @Test
  public void test_texas_holdem_6086_3hAdJcKhTh_8s9h_Qc3s_4s8d() {
    assertEquals(
      "4s8d 8s9h Qc3s",
      Solver.process("texas-holdem 3hAdJcKhTh 8s9h Qc3s 4s8d"));
  }

  @Test
  public void test_texas_holdem_6087_3s9cAcAhJd_4d7d_KcTd() {
    assertEquals(
      "4d7d KcTd",
      Solver.process("texas-holdem 3s9cAcAhJd 4d7d KcTd"));
  }

  @Test
  public void test_texas_holdem_6088_2d6c7dJdJs_KhQh_AsQd_6d4c_4h4d() {
    assertEquals(
      "KhQh AsQd 4h4d 6d4c",
      Solver.process("texas-holdem 2d6c7dJdJs KhQh AsQd 6d4c 4h4d"));
  }

  @Test
  public void test_texas_holdem_6089_3d3s6sAsTs_JcTd_3h9c_AcTh_7sJh_4d6d_QcKh_QsJs_Jd8s_6h8c() {
    assertEquals(
      "QcKh 4d6d=6h8c JcTd AcTh 3h9c 7sJh Jd8s QsJs",
      Solver.process("texas-holdem 3d3s6sAsTs JcTd 3h9c AcTh 7sJh 4d6d QcKh QsJs Jd8s 6h8c"));
  }

  @Test
  public void test_texas_holdem_6090_2h3s8sQcTc_6s5h_As3h_Qh4h_9hKd_Td5d_Th9s() {
    assertEquals(
      "6s5h 9hKd As3h Td5d Th9s Qh4h",
      Solver.process("texas-holdem 2h3s8sQcTc 6s5h As3h Qh4h 9hKd Td5d Th9s"));
  }

  @Test
  public void test_texas_holdem_6091_2d4h6c9c9h_6d9d_3d6s() {
    assertEquals(
      "3d6s 6d9d",
      Solver.process("texas-holdem 2d4h6c9c9h 6d9d 3d6s"));
  }

  @Test
  public void test_texas_holdem_6092_3h3s5c5hKd_9s9h_QhJc_5sJd_Td2d_8h6d_7d3c() {
    assertEquals(
      "8h6d=QhJc=Td2d 9s9h 7d3c 5sJd",
      Solver.process("texas-holdem 3h3s5c5hKd 9s9h QhJc 5sJd Td2d 8h6d 7d3c"));
  }

  @Test
  public void test_texas_holdem_6093_9hAsJcJhJs_5dKh_2h8s_7s8d_3dKd_6sAd_6d4h_6c5s_Tc8h() {
    assertEquals(
      "2h8s=6c5s=6d4h=7s8d Tc8h 3dKd=5dKh 6sAd",
      Solver.process("texas-holdem 9hAsJcJhJs 5dKh 2h8s 7s8d 3dKd 6sAd 6d4h 6c5s Tc8h"));
  }

  @Test
  public void test_texas_holdem_6094_3c3d6sAsKs_5hJh_4c9h_8h4h_3sJc_8c6c_4d9d_4sKc_Ah3h_8dQh() {
    assertEquals(
      "8h4h 4c9h=4d9d 5hJh 8dQh 8c6c 4sKc 3sJc Ah3h",
      Solver.process("texas-holdem 3c3d6sAsKs 5hJh 4c9h 8h4h 3sJc 8c6c 4d9d 4sKc Ah3h 8dQh"));
  }

  @Test
  public void test_texas_holdem_6095_6h8hJsTcTd_2cQh_2d3s_5c2h_Ad9c_5sQd_3dQs_9sJh() {
    assertEquals(
      "2d3s=5c2h 2cQh=3dQs=5sQd Ad9c 9sJh",
      Solver.process("texas-holdem 6h8hJsTcTd 2cQh 2d3s 5c2h Ad9c 5sQd 3dQs 9sJh"));
  }

  @Test
  public void test_texas_holdem_6096_4s5s7s9sTc_7h2c_8dAh_Ks3c_Jh3d_KdQs_6d2h_Js4h() {
    assertEquals(
      "6d2h Jh3d 8dAh 7h2c Js4h KdQs Ks3c",
      Solver.process("texas-holdem 4s5s7s9sTc 7h2c 8dAh Ks3c Jh3d KdQs 6d2h Js4h"));
  }

  @Test
  public void test_texas_holdem_6097_2d4dKhKsQc_4cAc_8dTd_Qd7d_6s5c_5sTc_8cAs_3h4s_9c2s_7c2c() {
    assertEquals(
      "6s5c 5sTc 8dTd 8cAs 7c2c=9c2s 3h4s 4cAc Qd7d",
      Solver.process("texas-holdem 2d4dKhKsQc 4cAc 8dTd Qd7d 6s5c 5sTc 8cAs 3h4s 9c2s 7c2c"));
  }

  @Test
  public void test_texas_holdem_6098_2d3h8h8sQc_3s2c_8d3c_5c7c_6sKs() {
    assertEquals(
      "5c7c 6sKs 3s2c 8d3c",
      Solver.process("texas-holdem 2d3h8h8sQc 3s2c 8d3c 5c7c 6sKs"));
  }

  @Test
  public void test_texas_holdem_6099_4d6s7d9cQs_As2c_QhJc_Ad6d_8sJh_8h5c_Jd9s_Ac2s_Ks3h() {
    assertEquals(
      "8sJh Ks3h Ac2s=As2c Ad6d Jd9s QhJc 8h5c",
      Solver.process("texas-holdem 4d6s7d9cQs As2c QhJc Ad6d 8sJh 8h5c Jd9s Ac2s Ks3h"));
  }

  @Test
  public void test_texas_holdem_6100_2s3c4c4sQc_2h5c_Tc8s_QdJc_5sAs() {
    assertEquals(
      "Tc8s 2h5c QdJc 5sAs",
      Solver.process("texas-holdem 2s3c4c4sQc 2h5c Tc8s QdJc 5sAs"));
  }

  @Test
  public void test_texas_holdem_6101_5c7dJsKcQs_6dTh_TsQc_Jd4c_Ks7c_8s3d_Td9d_6sQd() {
    assertEquals(
      "8s3d 6dTh Jd4c 6sQd TsQc Ks7c Td9d",
      Solver.process("texas-holdem 5c7dJsKcQs 6dTh TsQc Jd4c Ks7c 8s3d Td9d 6sQd"));
  }

  @Test
  public void test_texas_holdem_6102_2h6c8d9d9s_8h8s_ThKc_2dAc_7cTc_AdAh_7d3h_Jh9h_4cKs() {
    assertEquals(
      "7d3h 4cKs ThKc 2dAc AdAh Jh9h 7cTc 8h8s",
      Solver.process("texas-holdem 2h6c8d9d9s 8h8s ThKc 2dAc 7cTc AdAh 7d3h Jh9h 4cKs"));
  }

  @Test
  public void test_texas_holdem_6103_2c4h8dKsQh_5cKd_5sJs_3c2h() {
    assertEquals(
      "5sJs 3c2h 5cKd",
      Solver.process("texas-holdem 2c4h8dKsQh 5cKd 5sJs 3c2h"));
  }

  @Test
  public void test_texas_holdem_6104_2h7h8dAsTc_5s7d_6h4c_2s6d_TsTh_Ad2c() {
    assertEquals(
      "6h4c 2s6d 5s7d Ad2c TsTh",
      Solver.process("texas-holdem 2h7h8dAsTc 5s7d 6h4c 2s6d TsTh Ad2c"));
  }

  @Test
  public void test_texas_holdem_6105_2h3c6hAhTh_4sJs_7sJh() {
    assertEquals(
      "4sJs 7sJh",
      Solver.process("texas-holdem 2h3c6hAhTh 4sJs 7sJh"));
  }

  @Test
  public void test_texas_holdem_6106_4d4h6hAsTs_Jd8c_Qs5c_QcJs_5d7s_Kh9d_QdKs() {
    assertEquals(
      "5d7s Jd8c Qs5c QcJs Kh9d QdKs",
      Solver.process("texas-holdem 4d4h6hAsTs Jd8c Qs5c QcJs 5d7s Kh9d QdKs"));
  }

  @Test
  public void test_texas_holdem_6107_4d4s5s6hKh_Qd8s_Jh7d_4h2c_5cKs_3dQc() {
    assertEquals(
      "Jh7d 3dQc Qd8s 5cKs 4h2c",
      Solver.process("texas-holdem 4d4s5s6hKh Qd8s Jh7d 4h2c 5cKs 3dQc"));
  }

  @Test
  public void test_texas_holdem_6108_5d6dAhQhQs_Td7c_AdQd_7h2h_Ks8h_9d2c() {
    assertEquals(
      "7h2h 9d2c Td7c Ks8h AdQd",
      Solver.process("texas-holdem 5d6dAhQhQs Td7c AdQd 7h2h Ks8h 9d2c"));
  }

  @Test
  public void test_texas_holdem_6109_2h8cAdJcQs_QdAc_7h2c_9s7d_TsJh_3s5d_8h3c() {
    assertEquals(
      "3s5d 9s7d 7h2c 8h3c TsJh QdAc",
      Solver.process("texas-holdem 2h8cAdJcQs QdAc 7h2c 9s7d TsJh 3s5d 8h3c"));
  }

  @Test
  public void test_texas_holdem_6110_2d3c5sAhKc_Ac9c_7d4c_2s6c_3d4s_Kh7s() {
    assertEquals(
      "2s6c Kh7s Ac9c 3d4s=7d4c",
      Solver.process("texas-holdem 2d3c5sAhKc Ac9c 7d4c 2s6c 3d4s Kh7s"));
  }

  @Test
  public void test_texas_holdem_6111_2c3cJcJdQc_Kd7c_Js8d_5hTc_2sAc_6s7h_9c8h_Ad4d_3dKs_2d2h() {
    assertEquals(
      "6s7h Ad4d 3dKs Js8d Kd7c 9c8h 5hTc 2sAc 2d2h",
      Solver.process("texas-holdem 2c3cJcJdQc Kd7c Js8d 5hTc 2sAc 6s7h 9c8h Ad4d 3dKs 2d2h"));
  }

  @Test
  public void test_texas_holdem_6112_2c3d6c9cTh_4cQd_8d5d_Td7c_KdKs_2dAc_AsJc_7s8s() {
    assertEquals(
      "8d5d 4cQd AsJc 2dAc Td7c KdKs 7s8s",
      Solver.process("texas-holdem 2c3d6c9cTh 4cQd 8d5d Td7c KdKs 2dAc AsJc 7s8s"));
  }

  @Test
  public void test_texas_holdem_6113_2h3d9dQhTc_7h4s_3h9h() {
    assertEquals(
      "7h4s 3h9h",
      Solver.process("texas-holdem 2h3d9dQhTc 7h4s 3h9h"));
  }

  @Test
  public void test_texas_holdem_6114_2d5s7hAcTc_Kc2c_5c8h() {
    assertEquals(
      "Kc2c 5c8h",
      Solver.process("texas-holdem 2d5s7hAcTc Kc2c 5c8h"));
  }

  @Test
  public void test_texas_holdem_6115_2s4c4s7c9c_9sJh_6h7d_AdAs_KhKs_3h6c_9h6d_QsKd_TdQh_4dJd() {
    assertEquals(
      "3h6c TdQh QsKd 6h7d 9h6d 9sJh KhKs AdAs 4dJd",
      Solver.process("texas-holdem 2s4c4s7c9c 9sJh 6h7d AdAs KhKs 3h6c 9h6d QsKd TdQh 4dJd"));
  }

  @Test
  public void test_texas_holdem_6116_3c3d7cKhTc_QdQc_Kc6s() {
    assertEquals(
      "QdQc Kc6s",
      Solver.process("texas-holdem 3c3d7cKhTc QdQc Kc6s"));
  }

  @Test
  public void test_texas_holdem_6117_2d4h6dKsTc_4c5d_8c3c_Js2c_Qc7s_8s9c_7c9h_6cAc_Kd4s_Td7h() {
    assertEquals(
      "8c3c 7c9h 8s9c Qc7s Js2c 4c5d 6cAc Td7h Kd4s",
      Solver.process("texas-holdem 2d4h6dKsTc 4c5d 8c3c Js2c Qc7s 8s9c 7c9h 6cAc Kd4s Td7h"));
  }

  @Test
  public void test_texas_holdem_6118_2d3s8c9sAs_7s4c_3c5c_Kh3d() {
    assertEquals(
      "7s4c 3c5c Kh3d",
      Solver.process("texas-holdem 2d3s8c9sAs 7s4c 3c5c Kh3d"));
  }

  @Test
  public void test_texas_holdem_6119_2s5d7dQhQs_JdQd_JhKs_6d6c_Kd9h_9dTh() {
    assertEquals(
      "9dTh Kd9h JhKs 6d6c JdQd",
      Solver.process("texas-holdem 2s5d7dQhQs JdQd JhKs 6d6c Kd9h 9dTh"));
  }

  @Test
  public void test_texas_holdem_6120_3c5d5h6c8d_Jc9h_7sTd_9c9d_8hQc_Kd4c_Tc2c_Jd2s() {
    assertEquals(
      "Tc2c 7sTd Jd2s Jc9h Kd4c 8hQc 9c9d",
      Solver.process("texas-holdem 3c5d5h6c8d Jc9h 7sTd 9c9d 8hQc Kd4c Tc2c Jd2s"));
  }

  @Test
  public void test_texas_holdem_6121_3h8s9sJcJd_3s3c_Th4h_7h9d_4sAs_Td7c() {
    assertEquals(
      "Th4h 4sAs 7h9d Td7c 3s3c",
      Solver.process("texas-holdem 3h8s9sJcJd 3s3c Th4h 7h9d 4sAs Td7c"));
  }

  @Test
  public void test_texas_holdem_6122_2d2s5h6dAc_8sJs_Jd3s_9d4d_AhKs_4sJc_3dQc() {
    assertEquals(
      "9d4d 4sJc=Jd3s 8sJs 3dQc AhKs",
      Solver.process("texas-holdem 2d2s5h6dAc 8sJs Jd3s 9d4d AhKs 4sJc 3dQc"));
  }

  @Test
  public void test_texas_holdem_6123_8hJsQcQdQs_6sJd_Td2d_4c7s_TcKs_7hTh_2c2h_9s9d_KdTs_6dKc() {
    assertEquals(
      "4c7s 7hTh=Td2d 6dKc=KdTs=TcKs 2c2h 9s9d 6sJd",
      Solver.process("texas-holdem 8hJsQcQdQs 6sJd Td2d 4c7s TcKs 7hTh 2c2h 9s9d KdTs 6dKc"));
  }

  @Test
  public void test_texas_holdem_6124_6c8d8h9sKs_8cAd_AsKc_2d3s() {
    assertEquals(
      "2d3s AsKc 8cAd",
      Solver.process("texas-holdem 6c8d8h9sKs 8cAd AsKc 2d3s"));
  }

  @Test
  public void test_texas_holdem_6125_2s3s9sJhQc_JsKd_5d7s_4h2h_5sAs_Kc5c() {
    assertEquals(
      "5d7s Kc5c 4h2h JsKd 5sAs",
      Solver.process("texas-holdem 2s3s9sJhQc JsKd 5d7s 4h2h 5sAs Kc5c"));
  }

  @Test
  public void test_texas_holdem_6126_3d4d6h6s8h_4h7s_Tc2d_5cAs_JhQc() {
    assertEquals(
      "Tc2d JhQc 5cAs 4h7s",
      Solver.process("texas-holdem 3d4d6h6s8h 4h7s Tc2d 5cAs JhQc"));
  }

  @Test
  public void test_texas_holdem_6127_4c4d5d7c8h_6hJc_7s5c_3d9s_Jh9c_5hQd_AcAh_2sKs_6dJd_QsTc() {
    assertEquals(
      "3d9s Jh9c QsTc 2sKs 5hQd 7s5c AcAh 6dJd=6hJc",
      Solver.process("texas-holdem 4c4d5d7c8h 6hJc 7s5c 3d9s Jh9c 5hQd AcAh 2sKs 6dJd QsTc"));
  }

  @Test
  public void test_texas_holdem_6128_5c5d8hKhTh_3c3d_7c6c_Ts5h_2d9s_9hTd() {
    assertEquals(
      "7c6c 2d9s 3c3d 9hTd Ts5h",
      Solver.process("texas-holdem 5c5d8hKhTh 3c3d 7c6c Ts5h 2d9s 9hTd"));
  }

  @Test
  public void test_texas_holdem_6129_6d8h9cKsQh_4s8d_Jh9s_5s8c_JcKd_5c6c_JdKh() {
    assertEquals(
      "5c6c 4s8d=5s8c Jh9s JcKd=JdKh",
      Solver.process("texas-holdem 6d8h9cKsQh 4s8d Jh9s 5s8c JcKd 5c6c JdKh"));
  }

  @Test
  public void test_texas_holdem_6130_5h6d8cAhKh_6hJs_3c4s_7h9h_6c9s() {
    assertEquals(
      "3c4s 6c9s 6hJs 7h9h",
      Solver.process("texas-holdem 5h6d8cAhKh 6hJs 3c4s 7h9h 6c9s"));
  }

  @Test
  public void test_texas_holdem_6131_3c3d7d9dTs_9cJd_3s6h_6sKs_2cAd_7hKh_9s5d_7cAc() {
    assertEquals(
      "6sKs 2cAd 7hKh 7cAc 9s5d 9cJd 3s6h",
      Solver.process("texas-holdem 3c3d7d9dTs 9cJd 3s6h 6sKs 2cAd 7hKh 9s5d 7cAc"));
  }

  @Test
  public void test_texas_holdem_6132_3s6c6sAcJc_5hAs_3c4s() {
    assertEquals(
      "3c4s 5hAs",
      Solver.process("texas-holdem 3s6c6sAcJc 5hAs 3c4s"));
  }

  @Test
  public void test_texas_holdem_6133_3h5d6s7h8s_3c5h_7s3s_9d6d_5sTs() {
    assertEquals(
      "5sTs 3c5h 7s3s 9d6d",
      Solver.process("texas-holdem 3h5d6s7h8s 3c5h 7s3s 9d6d 5sTs"));
  }

  @Test
  public void test_texas_holdem_6134_4h6h6s7dAd_KsTh_3c8c() {
    assertEquals(
      "3c8c KsTh",
      Solver.process("texas-holdem 4h6h6s7dAd KsTh 3c8c"));
  }

  @Test
  public void test_texas_holdem_6135_3d5h8d9cKc_4s9h_6d4d_6sTh() {
    assertEquals(
      "6d4d 6sTh 4s9h",
      Solver.process("texas-holdem 3d5h8d9cKc 4s9h 6d4d 6sTh"));
  }

  @Test
  public void test_texas_holdem_6136_3c5h6sAcTs_5d9d_7c8d_9cKh_7dJd_2d8s_8h4s_4cJs() {
    assertEquals(
      "2d8s=8h4s 7c8d 4cJs 7dJd 9cKh 5d9d",
      Solver.process("texas-holdem 3c5h6sAcTs 5d9d 7c8d 9cKh 7dJd 2d8s 8h4s 4cJs"));
  }

  @Test
  public void test_texas_holdem_6137_4s6h6s7d7s_QsTs_3c4c_5dAd_8c2s_4h3d_Kd2d_9sAh_Jd2h_6cTc() {
    assertEquals(
      "3c4c=4h3d 8c2s Jd2h Kd2d 5dAd=9sAh QsTs 6cTc",
      Solver.process("texas-holdem 4s6h6s7d7s QsTs 3c4c 5dAd 8c2s 4h3d Kd2d 9sAh Jd2h 6cTc"));
  }

  @Test
  public void test_texas_holdem_6138_3h7s8cAdJc_Ah9d_9s6c_2s5h() {
    assertEquals(
      "2s5h 9s6c Ah9d",
      Solver.process("texas-holdem 3h7s8cAdJc Ah9d 9s6c 2s5h"));
  }

  @Test
  public void test_texas_holdem_6139_2c4cJsQdTc_2sTs_Jc5c_3sKs_As6d_Ad7c_6h9s_7s5h_Jh8c_3c9d() {
    assertEquals(
      "7s5h 3c9d 6h9s 3sKs As6d Ad7c Jh8c 2sTs Jc5c",
      Solver.process("texas-holdem 2c4cJsQdTc 2sTs Jc5c 3sKs As6d Ad7c 6h9s 7s5h Jh8c 3c9d"));
  }

  @Test
  public void test_texas_holdem_6140_2s5s7dAcJs_3s6s_5d3h_7h9h_2d9d_KcTc_3d2h_Qd8s_7cJd_2c5h() {
    assertEquals(
      "Qd8s KcTc 3d2h 2d9d 5d3h 7h9h 2c5h 7cJd 3s6s",
      Solver.process("texas-holdem 2s5s7dAcJs 3s6s 5d3h 7h9h 2d9d KcTc 3d2h Qd8s 7cJd 2c5h"));
  }

  @Test
  public void test_texas_holdem_6141_4h7d8hAdJc_KdJd_5h9s_2cJs_Jh8c_AcQc() {
    assertEquals(
      "5h9s 2cJs KdJd AcQc Jh8c",
      Solver.process("texas-holdem 4h7d8hAdJc KdJd 5h9s 2cJs Jh8c AcQc"));
  }

  @Test
  public void test_texas_holdem_6142_7c7s8d9cJs_Jh3d_Qh5d_JdKs_2s8c_2c6c_3c5s() {
    assertEquals(
      "2c6c=3c5s Qh5d 2s8c Jh3d JdKs",
      Solver.process("texas-holdem 7c7s8d9cJs Jh3d Qh5d JdKs 2s8c 2c6c 3c5s"));
  }

  @Test
  public void test_texas_holdem_6143_6h8c8hKcKd_9c9s_8dQd_Qs2d_Jd4c_KhQc_AdAc_3s4d() {
    assertEquals(
      "3s4d Jd4c Qs2d 9c9s AdAc 8dQd KhQc",
      Solver.process("texas-holdem 6h8c8hKcKd 9c9s 8dQd Qs2d Jd4c KhQc AdAc 3s4d"));
  }

  @Test
  public void test_texas_holdem_6144_3d5d5hAsJs_2c7h_QdAc_2h8c_6sTc() {
    assertEquals(
      "2c7h 2h8c 6sTc QdAc",
      Solver.process("texas-holdem 3d5d5hAsJs 2c7h QdAc 2h8c 6sTc"));
  }

  @Test
  public void test_texas_holdem_6145_2h2s4s7sTd_Kc6s_4c8c_7h3d() {
    assertEquals(
      "Kc6s 4c8c 7h3d",
      Solver.process("texas-holdem 2h2s4s7sTd Kc6s 4c8c 7h3d"));
  }

  @Test
  public void test_texas_holdem_6146_6s7c7s8dTc_Qs3d_Th5d_4s3h_2s8s_Qh5s_JdJs() {
    assertEquals(
      "4s3h Qh5s=Qs3d 2s8s Th5d JdJs",
      Solver.process("texas-holdem 6s7c7s8dTc Qs3d Th5d 4s3h 2s8s Qh5s JdJs"));
  }

  @Test
  public void test_texas_holdem_6147_2c3d9dAcQc_6h7s_7cQd() {
    assertEquals(
      "6h7s 7cQd",
      Solver.process("texas-holdem 2c3d9dAcQc 6h7s 7cQd"));
  }

  @Test
  public void test_texas_holdem_6148_4d5d6d8hQd_8sJc_AsTc_5s2s_6s6c_Td7h_Qs7s_2dJd_QcKs() {
    assertEquals(
      "AsTc 5s2s 8sJc QcKs 6s6c Qs7s Td7h 2dJd",
      Solver.process("texas-holdem 4d5d6d8hQd 8sJc AsTc 5s2s 6s6c Td7h Qs7s 2dJd QcKs"));
  }

  @Test
  public void test_texas_holdem_6149_5c5s8cKcQh_Qs5h_3dQd_Ad3s_8h8s() {
    assertEquals(
      "Ad3s 3dQd Qs5h 8h8s",
      Solver.process("texas-holdem 5c5s8cKcQh Qs5h 3dQd Ad3s 8h8s"));
  }

  @Test
  public void test_texas_holdem_6150_7h7s9dKdTd_4hAc_9h8h_Th6s_Js3s_6h4c_TsQc_JhKh_8s5c() {
    assertEquals(
      "6h4c=8s5c Js3s 4hAc 9h8h Th6s=TsQc JhKh",
      Solver.process("texas-holdem 7h7s9dKdTd 4hAc 9h8h Th6s Js3s 6h4c TsQc JhKh 8s5c"));
  }

  @Test
  public void test_texas_holdem_6151_5d7cAsJsQh_3s7h_Ts3c_JdKh_Tc2s_Ks8c_9dQs_6cQc() {
    assertEquals(
      "Tc2s=Ts3c Ks8c 3s7h JdKh 6cQc 9dQs",
      Solver.process("texas-holdem 5d7cAsJsQh 3s7h Ts3c JdKh Tc2s Ks8c 9dQs 6cQc"));
  }

  @Test
  public void test_texas_holdem_6152_5h7c8h9sAs_4c8s_2h4s_6d6c_TdJs() {
    assertEquals(
      "2h4s 4c8s 6d6c TdJs",
      Solver.process("texas-holdem 5h7c8h9sAs 4c8s 2h4s 6d6c TdJs"));
  }

  @Test
  public void test_texas_holdem_6153_3c5s8s9sTh_Jd4h_Qc3s_7h8h_2s6c() {
    assertEquals(
      "2s6c Jd4h Qc3s 7h8h",
      Solver.process("texas-holdem 3c5s8s9sTh Jd4h Qc3s 7h8h 2s6c"));
  }

  @Test
  public void test_texas_holdem_6154_2d3c4cKsTd_Kh7c_7dJh_9d9s_6c3s_3hAs_3d4s() {
    assertEquals(
      "7dJh 6c3s 3hAs 9d9s Kh7c 3d4s",
      Solver.process("texas-holdem 2d3c4cKsTd Kh7c 7dJh 9d9s 6c3s 3hAs 3d4s"));
  }

  @Test
  public void test_texas_holdem_6155_5c7d9sJhQh_4dAh_6h5s_7cQc() {
    assertEquals(
      "4dAh 6h5s 7cQc",
      Solver.process("texas-holdem 5c7d9sJhQh 4dAh 6h5s 7cQc"));
  }

  @Test
  public void test_texas_holdem_6156_6d7hAsJcKc_8h8d_2sQc_5dJh_Ts6c_5hTd_Js4c_7c2d_5s9h() {
    assertEquals(
      "5s9h 5hTd 2sQc Ts6c 7c2d 8h8d 5dJh=Js4c",
      Solver.process("texas-holdem 6d7hAsJcKc 8h8d 2sQc 5dJh Ts6c 5hTd Js4c 7c2d 5s9h"));
  }

  @Test
  public void test_texas_holdem_6157_3h6c6s7h9c_2h7d_As8d_7s9h_Kc8h_Ts3s_Ks7c() {
    assertEquals(
      "Kc8h As8d Ts3s 2h7d Ks7c 7s9h",
      Solver.process("texas-holdem 3h6c6s7h9c 2h7d As8d 7s9h Kc8h Ts3s Ks7c"));
  }

  @Test
  public void test_texas_holdem_6158_2h6h9sJcJh_4sQs_Ks8s_3s9c_Ts7h_Kh4d_Qd4h() {
    assertEquals(
      "Ts7h 4sQs=Qd4h Kh4d Ks8s 3s9c",
      Solver.process("texas-holdem 2h6h9sJcJh 4sQs Ks8s 3s9c Ts7h Kh4d Qd4h"));
  }

  @Test
  public void test_texas_holdem_6159_2s7hAdAsJc_5s8d_5cKs_Qd8h_8s7c() {
    assertEquals(
      "5s8d Qd8h 5cKs 8s7c",
      Solver.process("texas-holdem 2s7hAdAsJc 5s8d 5cKs Qd8h 8s7c"));
  }

  @Test
  public void test_texas_holdem_6160_3h4d6s9cQs_3dQc_5s2d_8hTs_Jd2c_9d8d_Ks9h_6cQd_Ah9s() {
    assertEquals(
      "8hTs Jd2c 9d8d Ks9h Ah9s 3dQc 6cQd 5s2d",
      Solver.process("texas-holdem 3h4d6s9cQs 3dQc 5s2d 8hTs Jd2c 9d8d Ks9h 6cQd Ah9s"));
  }

  @Test
  public void test_texas_holdem_6161_3h5dKdKhKs_4s9s_Ac7h_Kc6s_Td6h_2c2s_4d4c_5h4h_9c6c_Jc8h() {
    assertEquals(
      "4s9s 9c6c Td6h Jc8h Ac7h 2c2s 4d4c 5h4h Kc6s",
      Solver.process("texas-holdem 3h5dKdKhKs 4s9s Ac7h Kc6s Td6h 2c2s 4d4c 5h4h 9c6c Jc8h"));
  }

  @Test
  public void test_texas_holdem_6162_4c7h8c8sTd_8hTc_Qc5h_Jh2h_6hAd_2s9c_Js6c() {
    assertEquals(
      "2s9c Jh2h=Js6c Qc5h 6hAd 8hTc",
      Solver.process("texas-holdem 4c7h8c8sTd 8hTc Qc5h Jh2h 6hAd 2s9c Js6c"));
  }

  @Test
  public void test_texas_holdem_6163_4d7h7s9sKc_Jc9h_6hJs_8cQh_6c5c_8h7d_Ts6s() {
    assertEquals(
      "6c5c Ts6s 6hJs 8cQh Jc9h 8h7d",
      Solver.process("texas-holdem 4d7h7s9sKc Jc9h 6hJs 8cQh 6c5c 8h7d Ts6s"));
  }

  @Test
  public void test_texas_holdem_6164_2c5c8sAsKc_JsKs_9h6s_TsKd_7s6c_5h6h_JhAd() {
    assertEquals(
      "7s6c 9h6s 5h6h TsKd JsKs JhAd",
      Solver.process("texas-holdem 2c5c8sAsKc JsKs 9h6s TsKd 7s6c 5h6h JhAd"));
  }

  @Test
  public void test_texas_holdem_6165_3d5s8dAcAs_8h6c_2s6h_Ks5h_Ts4d_7s2c_4c5c_Td8c_Jh9c_AdQs() {
    assertEquals(
      "2s6h 7s2c Ts4d Jh9c 4c5c Ks5h 8h6c Td8c AdQs",
      Solver.process("texas-holdem 3d5s8dAcAs 8h6c 2s6h Ks5h Ts4d 7s2c 4c5c Td8c Jh9c AdQs"));
  }

  @Test
  public void test_texas_holdem_6166_2h4h6h8cKc_8d4s_9cJs_2cKh_4cTc_8sAs_ThTd_JhQs_9dKs() {
    assertEquals(
      "9cJs JhQs 4cTc 8sAs ThTd 9dKs 8d4s 2cKh",
      Solver.process("texas-holdem 2h4h6h8cKc 8d4s 9cJs 2cKh 4cTc 8sAs ThTd JhQs 9dKs"));
  }

  @Test
  public void test_texas_holdem_6167_2c4s5hJdTh_Qh6c_5dAc() {
    assertEquals(
      "Qh6c 5dAc",
      Solver.process("texas-holdem 2c4s5hJdTh Qh6c 5dAc"));
  }

  @Test
  public void test_texas_holdem_6168_5h6cAdKhTc_3s2c_3d3h_4sTd_7dJs_4c8d_4d9c() {
    assertEquals(
      "3s2c 4c8d 4d9c 7dJs 3d3h 4sTd",
      Solver.process("texas-holdem 5h6cAdKhTc 3s2c 3d3h 4sTd 7dJs 4c8d 4d9c"));
  }

  @Test
  public void test_texas_holdem_6169_5s7dJhKsQd_4c4d_Qc2s_Qs7s_7h4s_8cAs() {
    assertEquals(
      "8cAs 4c4d 7h4s Qc2s Qs7s",
      Solver.process("texas-holdem 5s7dJhKsQd 4c4d Qc2s Qs7s 7h4s 8cAs"));
  }

  @Test
  public void test_texas_holdem_6170_4c6hAhJdKh_TdKc_6sJs() {
    assertEquals(
      "TdKc 6sJs",
      Solver.process("texas-holdem 4c6hAhJdKh TdKc 6sJs"));
  }

  @Test
  public void test_texas_holdem_6171_3h4h9hAcJc_Kc8d_Qh7h_Th6c_8hJs_KsTd_5s8c_7c3c_Ah2d_9d4d() {
    assertEquals(
      "5s8c Th6c Kc8d KsTd 7c3c 8hJs Ah2d 9d4d Qh7h",
      Solver.process("texas-holdem 3h4h9hAcJc Kc8d Qh7h Th6c 8hJs KsTd 5s8c 7c3c Ah2d 9d4d"));
  }

  @Test
  public void test_texas_holdem_6172_3d8s9sJdQs_Jh8d_9d2d_4dKs_2h5h_Ah5s_5c7h_Td8h_As6h() {
    assertEquals(
      "2h5h 5c7h 4dKs Ah5s=As6h 9d2d Jh8d Td8h",
      Solver.process("texas-holdem 3d8s9sJdQs Jh8d 9d2d 4dKs 2h5h Ah5s 5c7h Td8h As6h"));
  }

  @Test
  public void test_texas_holdem_6173_6d6sAdAsTd_5d7d_Ks4d_4h5s_7c2h_Jh2c_KcTh_2s5c() {
    assertEquals(
      "2s5c=4h5s=7c2h Jh2c Ks4d KcTh 5d7d",
      Solver.process("texas-holdem 6d6sAdAsTd 5d7d Ks4d 4h5s 7c2h Jh2c KcTh 2s5c"));
  }

  @Test
  public void test_texas_holdem_6174_2h5s7d9cTc_Qc7h_Jc3d_AcQs_Js5h_3c8h_Ah9h() {
    assertEquals(
      "3c8h Jc3d AcQs Js5h Qc7h Ah9h",
      Solver.process("texas-holdem 2h5s7d9cTc Qc7h Jc3d AcQs Js5h 3c8h Ah9h"));
  }

  @Test
  public void test_texas_holdem_6175_2dAdJdQdQs_Td9s_Ah6d_8d4s_6sQh() {
    assertEquals(
      "6sQh Ah6d 8d4s Td9s",
      Solver.process("texas-holdem 2dAdJdQdQs Td9s Ah6d 8d4s 6sQh"));
  }

  @Test
  public void test_texas_holdem_6176_4d5c6dAsTh_5s9c_Ks8d_5h7h() {
    assertEquals(
      "Ks8d 5h7h 5s9c",
      Solver.process("texas-holdem 4d5c6dAsTh 5s9c Ks8d 5h7h"));
  }

  @Test
  public void test_texas_holdem_6177_5c6c9d9hQd_8cAs_Ah3c_Js9c_3sKd_8dJc_Ad6d_ThJh_4h7s() {
    assertEquals(
      "4h7s 8dJc ThJh 3sKd Ah3c 8cAs Ad6d Js9c",
      Solver.process("texas-holdem 5c6c9d9hQd 8cAs Ah3c Js9c 3sKd 8dJc Ad6d ThJh 4h7s"));
  }

  @Test
  public void test_texas_holdem_6178_2d6d6h9hJd_QdAd_4h2h_8dTd_7sTs_6s5s() {
    assertEquals(
      "7sTs 4h2h 6s5s 8dTd QdAd",
      Solver.process("texas-holdem 2d6d6h9hJd QdAd 4h2h 8dTd 7sTs 6s5s"));
  }

  @Test
  public void test_texas_holdem_6179_4d4s5s6hTh_7d9h_Ts9d_JhTc_Qs9c_2cAh_8c6c() {
    assertEquals(
      "7d9h Qs9c 2cAh 8c6c Ts9d JhTc",
      Solver.process("texas-holdem 4d4s5s6hTh 7d9h Ts9d JhTc Qs9c 2cAh 8c6c"));
  }

  @Test
  public void test_texas_holdem_6180_2d3s4c7cJc_TsJh_Jd9s_Th3h_Kd8s() {
    assertEquals(
      "Kd8s Th3h Jd9s TsJh",
      Solver.process("texas-holdem 2d3s4c7cJc TsJh Jd9s Th3h Kd8s"));
  }

  @Test
  public void test_texas_holdem_6181_3c6h8h9sQh_7sKs_7d4s_9c3d_Qd7h_8d4d_As3s() {
    assertEquals(
      "7d4s 7sKs As3s 8d4d Qd7h 9c3d",
      Solver.process("texas-holdem 3c6h8h9sQh 7sKs 7d4s 9c3d Qd7h 8d4d As3s"));
  }

  @Test
  public void test_texas_holdem_6182_3h9d9sKsQd_6cJc_5d7s_Qs6h_Qc2d_AhKc_2s4h() {
    assertEquals(
      "2s4h 5d7s 6cJc Qc2d=Qs6h AhKc",
      Solver.process("texas-holdem 3h9d9sKsQd 6cJc 5d7s Qs6h Qc2d AhKc 2s4h"));
  }

  @Test
  public void test_texas_holdem_6183_2s3c6c7s8s_Ks9d_5s6d_3s2h_TsAh_Jc2d_4hAs_8c5c() {
    assertEquals(
      "Ks9d 4hAs TsAh Jc2d 5s6d 8c5c 3s2h",
      Solver.process("texas-holdem 2s3c6c7s8s Ks9d 5s6d 3s2h TsAh Jc2d 4hAs 8c5c"));
  }

  @Test
  public void test_texas_holdem_6184_5s6h7h8dQh_Kc6d_3hQd_Jh5d_5h2s_5c7c_4d9d_7d2d_8c6s() {
    assertEquals(
      "5h2s Jh5d Kc6d 7d2d 3hQd 5c7c 8c6s 4d9d",
      Solver.process("texas-holdem 5s6h7h8dQh Kc6d 3hQd Jh5d 5h2s 5c7c 4d9d 7d2d 8c6s"));
  }

  @Test
  public void test_texas_holdem_6185_3h3s5c6dKs_KdQs_9c6h_2c4s_9d6c_4h8s_9s5d_8c3d_KcAh_7cAc() {
    assertEquals(
      "4h8s 7cAc 9s5d 9c6h=9d6c KdQs KcAh 8c3d 2c4s",
      Solver.process("texas-holdem 3h3s5c6dKs KdQs 9c6h 2c4s 9d6c 4h8s 9s5d 8c3d KcAh 7cAc"));
  }

  @Test
  public void test_texas_holdem_6186_2c2h6c6sQd_3d5h_KdKh() {
    assertEquals(
      "3d5h KdKh",
      Solver.process("texas-holdem 2c2h6c6sQd 3d5h KdKh"));
  }

  @Test
  public void test_texas_holdem_6187_3d7hAsKhQh_4dTd_8h2h_3hAc_Jh7c_9c8c_7dQc() {
    assertEquals(
      "9c8c 4dTd Jh7c 7dQc 3hAc 8h2h",
      Solver.process("texas-holdem 3d7hAsKhQh 4dTd 8h2h 3hAc Jh7c 9c8c 7dQc"));
  }

  @Test
  public void test_texas_holdem_6188_3s4s5d6s8s_6d6h_Jh9d_As2c_KcJc_AhQc_Th8c_Jd7d_9h2d_Ad2s() {
    assertEquals(
      "Jh9d KcJc AhQc Th8c 6d6h 9h2d Jd7d Ad2s As2c",
      Solver.process("texas-holdem 3s4s5d6s8s 6d6h Jh9d As2c KcJc AhQc Th8c Jd7d 9h2d Ad2s"));
  }

  @Test
  public void test_texas_holdem_6189_2d4c9dAhJh_6dKc_Td7c_8d5h_Kd9s_As3d() {
    assertEquals(
      "8d5h Td7c 6dKc Kd9s As3d",
      Solver.process("texas-holdem 2d4c9dAhJh 6dKc Td7c 8d5h Kd9s As3d"));
  }

  @Test
  public void test_texas_holdem_6190_2c3s5d9dKh_8s6s_8h5s_9hTs_7hQc_4c8c_7dJh_9sQd() {
    assertEquals(
      "4c8c 8s6s 7dJh 7hQc 8h5s 9hTs 9sQd",
      Solver.process("texas-holdem 2c3s5d9dKh 8s6s 8h5s 9hTs 7hQc 4c8c 7dJh 9sQd"));
  }

  @Test
  public void test_texas_holdem_6191_3d5h5s6cKs_Jh8d_Qs2c_4sJs_2sKd_Kc4c() {
    assertEquals(
      "4sJs Jh8d Qs2c 2sKd=Kc4c",
      Solver.process("texas-holdem 3d5h5s6cKs Jh8d Qs2c 4sJs 2sKd Kc4c"));
  }

  @Test
  public void test_texas_holdem_6192_2d4d6hQdQh_KsQc_9c3s_3h2c() {
    assertEquals(
      "9c3s 3h2c KsQc",
      Solver.process("texas-holdem 2d4d6hQdQh KsQc 9c3s 3h2c"));
  }

  @Test
  public void test_texas_holdem_6193_2c4c6c8dKc_3c3h_5c2h_QhQs() {
    assertEquals(
      "QhQs 3c3h 5c2h",
      Solver.process("texas-holdem 2c4c6c8dKc 3c3h 5c2h QhQs"));
  }

  @Test
  public void test_texas_holdem_6194_2sAhJhKcQd_JsTh_4hQh_4c9c_6c2c() {
    assertEquals(
      "4c9c 6c2c 4hQh JsTh",
      Solver.process("texas-holdem 2sAhJhKcQd JsTh 4hQh 4c9c 6c2c"));
  }

  @Test
  public void test_texas_holdem_6195_2d5hJsTcTs_6h4d_Td8c() {
    assertEquals(
      "6h4d Td8c",
      Solver.process("texas-holdem 2d5hJsTcTs 6h4d Td8c"));
  }

  @Test
  public void test_texas_holdem_6196_2c8d9dQhTc_9hJh_KsKc_Ts3d_AdJc_As7d_KhJd_7c3s_5d2d() {
    assertEquals(
      "7c3s As7d 5d2d Ts3d KsKc 9hJh=AdJc KhJd",
      Solver.process("texas-holdem 2c8d9dQhTc 9hJh KsKc Ts3d AdJc As7d KhJd 7c3s 5d2d"));
  }

  @Test
  public void test_texas_holdem_6197_6d6h8s9dAc_TcQd_9s4s_9hTh() {
    assertEquals(
      "TcQd 9hTh=9s4s",
      Solver.process("texas-holdem 6d6h8s9dAc TcQd 9s4s 9hTh"));
  }

  @Test
  public void test_texas_holdem_6198_2s9hJhQhTh_4s6d_6sJc_6cTd_KdAd_9cJs_Ts5h_TcKc_8c5s() {
    assertEquals(
      "4s6d 6cTd 6sJc 9cJs 8c5s TcKc KdAd Ts5h",
      Solver.process("texas-holdem 2s9hJhQhTh 4s6d 6sJc 6cTd KdAd 9cJs Ts5h TcKc 8c5s"));
  }

  @Test
  public void test_texas_holdem_6199_7c8sAsJdTd_5dAh_6d4d_Ks2d_2sTc_2c3c_Kc5s_Qs7d_9sQh_8d8c() {
    assertEquals(
      "2c3c=6d4d Kc5s=Ks2d Qs7d 2sTc 5dAh 8d8c 9sQh",
      Solver.process("texas-holdem 7c8sAsJdTd 5dAh 6d4d Ks2d 2sTc 2c3c Kc5s Qs7d 9sQh 8d8c"));
  }

  @Test
  public void test_texas_holdem_6200_2h4c8sJsQc_3cJh_7cKd_3sAc_7s9h_9s5s_5c6h_Jc2c_AdTh() {
    assertEquals(
      "5c6h 9s5s 7s9h 7cKd 3sAc AdTh 3cJh Jc2c",
      Solver.process("texas-holdem 2h4c8sJsQc 3cJh 7cKd 3sAc 7s9h 9s5s 5c6h Jc2c AdTh"));
  }

  @Test
  public void test_texas_holdem_6201_3h5c5sKsQc_2s8h_Jh2h() {
    assertEquals(
      "2s8h Jh2h",
      Solver.process("texas-holdem 3h5c5sKsQc 2s8h Jh2h"));
  }

  @Test
  public void test_texas_holdem_6202_2d3s4sKcTs_8h5h_8c5c_9sTd_Qc6h() {
    assertEquals(
      "8c5c=8h5h Qc6h 9sTd",
      Solver.process("texas-holdem 2d3s4sKcTs 8h5h 8c5c 9sTd Qc6h"));
  }

  @Test
  public void test_texas_holdem_6203_2cJcJhKcQs_Ac5d_4s8d_7h6s_5s3d_JsKd_9d3s() {
    assertEquals(
      "5s3d 7h6s 4s8d 9d3s Ac5d JsKd",
      Solver.process("texas-holdem 2cJcJhKcQs Ac5d 4s8d 7h6s 5s3d JsKd 9d3s"));
  }

  @Test
  public void test_texas_holdem_6204_3h5s7c7d9h_ThJh_8s8c_6dTd() {
    assertEquals(
      "6dTd ThJh 8s8c",
      Solver.process("texas-holdem 3h5s7c7d9h ThJh 8s8c 6dTd"));
  }

  @Test
  public void test_texas_holdem_6205_4h9dAcKhQh_Jd2h_TdTh_AsQs_7d2c() {
    assertEquals(
      "7d2c Jd2h TdTh AsQs",
      Solver.process("texas-holdem 4h9dAcKhQh Jd2h TdTh AsQs 7d2c"));
  }

  @Test
  public void test_texas_holdem_6206_4c5h8sKdQd_2hTs_Ks6s_7c6h_5d3d_Tc7d_QcQs_2cJd_Td2s_5s8c() {
    assertEquals(
      "2hTs=Td2s Tc7d 2cJd 5d3d Ks6s 5s8c QcQs 7c6h",
      Solver.process("texas-holdem 4c5h8sKdQd 2hTs Ks6s 7c6h 5d3d Tc7d QcQs 2cJd Td2s 5s8c"));
  }

  @Test
  public void test_texas_holdem_6207_4c9sJcKcQs_2c2h_2d8h_Qh6c_7dAh() {
    assertEquals(
      "2d8h 7dAh 2c2h Qh6c",
      Solver.process("texas-holdem 4c9sJcKcQs 2c2h 2d8h Qh6c 7dAh"));
  }

  @Test
  public void test_texas_holdem_6208_2c3c6h8hAs_2dJs_Ad7c_3h8c_Ac9h_6s4s_5d3s_2sQc() {
    assertEquals(
      "2dJs 2sQc 5d3s 6s4s Ad7c Ac9h 3h8c",
      Solver.process("texas-holdem 2c3c6h8hAs 2dJs Ad7c 3h8c Ac9h 6s4s 5d3s 2sQc"));
  }

  @Test
  public void test_texas_holdem_6209_4s5h6s7cQh_7sQd_Qc8h_6dTh_5cTc_8s3d_2s9d_9hKh() {
    assertEquals(
      "2s9d 9hKh 5cTc 6dTh 7sQd 8s3d=Qc8h",
      Solver.process("texas-holdem 4s5h6s7cQh 7sQd Qc8h 6dTh 5cTc 8s3d 2s9d 9hKh"));
  }

  @Test
  public void test_texas_holdem_6210_4h5c5d5s9s_Qd7c_4c8s_KcAc_7d9c_3h8h_3c2h() {
    assertEquals(
      "3c2h 3h8h Qd7c KcAc 4c8s 7d9c",
      Solver.process("texas-holdem 4h5c5d5s9s Qd7c 4c8s KcAc 7d9c 3h8h 3c2h"));
  }

  @Test
  public void test_texas_holdem_6211_4s6d8h9cTc_AhQd_Qh7d_5c5h_9d8c_Kd2h_3cTd_8sQc_3h6s() {
    assertEquals(
      "Kd2h AhQd 5c5h 3h6s 8sQc 3cTd 9d8c Qh7d",
      Solver.process("texas-holdem 4s6d8h9cTc AhQd Qh7d 5c5h 9d8c Kd2h 3cTd 8sQc 3h6s"));
  }

  @Test
  public void test_texas_holdem_6212_2d5s9dQhTd_9c7s_KdJc() {
    assertEquals(
      "9c7s KdJc",
      Solver.process("texas-holdem 2d5s9dQhTd 9c7s KdJc"));
  }

  @Test
  public void test_texas_holdem_6213_4h6c9sJhQs_5c2s_Ac8s_AdTd() {
    assertEquals(
      "5c2s Ac8s AdTd",
      Solver.process("texas-holdem 4h6c9sJhQs 5c2s Ac8s AdTd"));
  }

  @Test
  public void test_texas_holdem_6214_6d9c9sJhQd_Qh4c_2s3c_5h5c_QsKh() {
    assertEquals(
      "2s3c 5h5c Qh4c QsKh",
      Solver.process("texas-holdem 6d9c9sJhQd Qh4c 2s3c 5h5c QsKh"));
  }

  @Test
  public void test_texas_holdem_6215_2d8dJdJsQs_9cTh_Kc3d() {
    assertEquals(
      "Kc3d 9cTh",
      Solver.process("texas-holdem 2d8dJdJsQs 9cTh Kc3d"));
  }

  @Test
  public void test_texas_holdem_6216_9sAhKhTcTs_3dJs_AdQs_3hAc_6c8c_6sKd_3sQd_7dJh() {
    assertEquals(
      "6c8c 3dJs=7dJh 3sQd 6sKd 3hAc=AdQs",
      Solver.process("texas-holdem 9sAhKhTcTs 3dJs AdQs 3hAc 6c8c 6sKd 3sQd 7dJh"));
  }

  @Test
  public void test_texas_holdem_6217_3d5h9hKdTs_9cQc_4d7c_JdTh_4sAc_5s2d_9s8c_Qd3h_6h2h_5c7d() {
    assertEquals(
      "6h2h 4d7c 4sAc Qd3h 5c7d=5s2d 9s8c 9cQc JdTh",
      Solver.process("texas-holdem 3d5h9hKdTs 9cQc 4d7c JdTh 4sAc 5s2d 9s8c Qd3h 6h2h 5c7d"));
  }

  @Test
  public void test_texas_holdem_6218_4c6d8dKcQd_Qs6c_Ah8h_Jh7c_8sJc() {
    assertEquals(
      "Jh7c 8sJc Ah8h Qs6c",
      Solver.process("texas-holdem 4c6d8dKcQd Qs6c Ah8h Jh7c 8sJc"));
  }

  @Test
  public void test_texas_holdem_6219_5d7s9dJcTh_7cKs_2hTs_7d6d_Qc5h() {
    assertEquals(
      "Qc5h 7d6d 7cKs 2hTs",
      Solver.process("texas-holdem 5d7s9dJcTh 7cKs 2hTs 7d6d Qc5h"));
  }

  @Test
  public void test_texas_holdem_6220_7h8c8hKcKs_Qd6d_6sAh_QsKh_Tc9h_Kd7c_8d9s_4dQh() {
    assertEquals(
      "Tc9h 4dQh=Qd6d 6sAh 8d9s Kd7c=QsKh",
      Solver.process("texas-holdem 7h8c8hKcKs Qd6d 6sAh QsKh Tc9h Kd7c 8d9s 4dQh"));
  }

  @Test
  public void test_texas_holdem_6221_6d8d8h8sKd_6hQh_3dTc_8c2s_4sTd_7sKs_JhTh() {
    assertEquals(
      "3dTc=4sTd JhTh 6hQh 7sKs 8c2s",
      Solver.process("texas-holdem 6d8d8h8sKd 6hQh 3dTc 8c2s 4sTd 7sKs JhTh"));
  }

  @Test
  public void test_texas_holdem_6222_2c3d7d9cJc_Ts5s_6s2h_QhQc_7cJd_3cAs_4d3s_AdJs_Kd5d() {
    assertEquals(
      "Ts5s Kd5d 6s2h 4d3s 3cAs AdJs QhQc 7cJd",
      Solver.process("texas-holdem 2c3d7d9cJc Ts5s 6s2h QhQc 7cJd 3cAs 4d3s AdJs Kd5d"));
  }

  @Test
  public void test_texas_holdem_6223_5d8h9sQcQh_Td3h_3d7s_7hKc_Qd2s_8d5c_6h2d_Kh4d() {
    assertEquals(
      "6h2d 3d7s Td3h 7hKc=Kh4d 8d5c Qd2s",
      Solver.process("texas-holdem 5d8h9sQcQh Td3h 3d7s 7hKc Qd2s 8d5c 6h2d Kh4d"));
  }

  @Test
  public void test_texas_holdem_6224_2c3s4hJcQh_6sTc_7d6d_3hTh() {
    assertEquals(
      "7d6d 6sTc 3hTh",
      Solver.process("texas-holdem 2c3s4hJcQh 6sTc 7d6d 3hTh"));
  }

  @Test
  public void test_texas_holdem_6225_2d8dKsQcQh_6dKh_ThQd_4cJd_4s6s_5h2c_9hAc_2sAs_2hJc_5c5s() {
    assertEquals(
      "4s6s 4cJd 9hAc 2hJc=5h2c 2sAs 5c5s 6dKh ThQd",
      Solver.process("texas-holdem 2d8dKsQcQh 6dKh ThQd 4cJd 4s6s 5h2c 9hAc 2sAs 2hJc 5c5s"));
  }

  @Test
  public void test_texas_holdem_6226_2d5d7d7sAh_3s8d_3dJd() {
    assertEquals(
      "3s8d 3dJd",
      Solver.process("texas-holdem 2d5d7d7sAh 3s8d 3dJd"));
  }

  @Test
  public void test_texas_holdem_6227_2s7d7sAhJc_9s5c_6d4s_Kc7h_3c9h_8s6h_2cKd_Tc3h_Qs6c() {
    assertEquals(
      "6d4s 8s6h 3c9h=9s5c Tc3h Qs6c 2cKd Kc7h",
      Solver.process("texas-holdem 2s7d7sAhJc 9s5c 6d4s Kc7h 3c9h 8s6h 2cKd Tc3h Qs6c"));
  }

  @Test
  public void test_texas_holdem_6228_3cJcKcKsTc_2d3s_2s4s_3dKh_6dQc_Ah8h_7h2c() {
    assertEquals(
      "2s4s Ah8h 2d3s 7h2c 6dQc 3dKh",
      Solver.process("texas-holdem 3cJcKcKsTc 2d3s 2s4s 3dKh 6dQc Ah8h 7h2c"));
  }

  @Test
  public void test_texas_holdem_6229_3c3s7d9sQs_4s2h_6d5h_7cQd_AdKd_9d6c_QcTh_2cQh_6sTs_8sKc() {
    assertEquals(
      "4s2h=6d5h 8sKc AdKd 9d6c 2cQh QcTh 7cQd 6sTs",
      Solver.process("texas-holdem 3c3s7d9sQs 4s2h 6d5h 7cQd AdKd 9d6c QcTh 2cQh 6sTs 8sKc"));
  }

  @Test
  public void test_texas_holdem_6230_4s9h9sQdTh_Ah6c_As9c() {
    assertEquals(
      "Ah6c As9c",
      Solver.process("texas-holdem 4s9h9sQdTh Ah6c As9c"));
  }

  @Test
  public void test_texas_holdem_6231_3s4c4d4sJc_8dQs_8s9c_3dTd_TsJs_2hJh_Ac2d() {
    assertEquals(
      "8s9c 8dQs Ac2d 3dTd 2hJh=TsJs",
      Solver.process("texas-holdem 3s4c4d4sJc 8dQs 8s9c 3dTd TsJs 2hJh Ac2d"));
  }

  @Test
  public void test_texas_holdem_6232_5d8d9sJcQc_QdJd_AcKc_4d7d() {
    assertEquals(
      "4d7d AcKc QdJd",
      Solver.process("texas-holdem 5d8d9sJcQc QdJd AcKc 4d7d"));
  }

  @Test
  public void test_texas_holdem_6233_5dAcAsKdTh_6cAd_4d8d_2h2c_7c5c_5h4s_3cTs() {
    assertEquals(
      "4d8d 2h2c 5h4s=7c5c 3cTs 6cAd",
      Solver.process("texas-holdem 5dAcAsKdTh 6cAd 4d8d 2h2c 7c5c 5h4s 3cTs"));
  }

  @Test
  public void test_texas_holdem_6234_3d4h6d7dKc_KsJc_QdAd() {
    assertEquals(
      "KsJc QdAd",
      Solver.process("texas-holdem 3d4h6d7dKc KsJc QdAd"));
  }

  @Test
  public void test_texas_holdem_6235_4h5s9cJdQh_Ad8d_6sKd_QdJs_9hTc_Td5h_3hAs_Jh2c_3d2s() {
    assertEquals(
      "3d2s 6sKd 3hAs Ad8d Td5h 9hTc Jh2c QdJs",
      Solver.process("texas-holdem 4h5s9cJdQh Ad8d 6sKd QdJs 9hTc Td5h 3hAs Jh2c 3d2s"));
  }

  @Test
  public void test_texas_holdem_6236_4s6d9d9hKd_Qh8d_2dJc_5cAh_Kc4d_3c3d_QsAs_Ad6c_3hAc_3s5d() {
    assertEquals(
      "3s5d 2dJc Qh8d 3hAc=5cAh QsAs 3c3d Ad6c Kc4d",
      Solver.process("texas-holdem 4s6d9d9hKd Qh8d 2dJc 5cAh Kc4d 3c3d QsAs Ad6c 3hAc 3s5d"));
  }

  @Test
  public void test_texas_holdem_6237_3h5d5s7dJc_Jd3c_6c3s_8c6h_Th7s_6sAs_Qd2h() {
    assertEquals(
      "8c6h Qd2h 6sAs 6c3s Th7s Jd3c",
      Solver.process("texas-holdem 3h5d5s7dJc Jd3c 6c3s 8c6h Th7s 6sAs Qd2h"));
  }

  @Test
  public void test_texas_holdem_6238_2c3s9dTcTd_QdAc_5dQh_Ad7s_JcTh_7c7d_Jh3c_2d5c() {
    assertEquals(
      "5dQh Ad7s QdAc 2d5c Jh3c 7c7d JcTh",
      Solver.process("texas-holdem 2c3s9dTcTd QdAc 5dQh Ad7s JcTh 7c7d Jh3c 2d5c"));
  }

  @Test
  public void test_texas_holdem_6239_6c6d9dAdTc_7s9h_7hAc_4c2s_2hJs_6h9c_JhKh_Qd7d_Td5d() {
    assertEquals(
      "4c2s 2hJs JhKh 7s9h 7hAc Td5d Qd7d 6h9c",
      Solver.process("texas-holdem 6c6d9dAdTc 7s9h 7hAc 4c2s 2hJs 6h9c JhKh Qd7d Td5d"));
  }

  @Test
  public void test_texas_holdem_6240_3s5c8d8sKc_6cJd_4s9d_5h8c() {
    assertEquals(
      "4s9d 6cJd 5h8c",
      Solver.process("texas-holdem 3s5c8d8sKc 6cJd 4s9d 5h8c"));
  }

  @Test
  public void test_texas_holdem_6241_5d7hAcKcTd_9c4c_Tc9d_5hQs_2sTs_2hTh() {
    assertEquals(
      "9c4c 5hQs 2hTh=2sTs Tc9d",
      Solver.process("texas-holdem 5d7hAcKcTd 9c4c Tc9d 5hQs 2sTs 2hTh"));
  }

  @Test
  public void test_texas_holdem_6242_2c5d7sKsQs_9d3d_2h2d_3s8d_Th9c_5h9s_Ad4d_Ts7d_Jd8h() {
    assertEquals(
      "3s8d 9d3d Th9c Jd8h Ad4d 5h9s Ts7d 2h2d",
      Solver.process("texas-holdem 2c5d7sKsQs 9d3d 2h2d 3s8d Th9c 5h9s Ad4d Ts7d Jd8h"));
  }

  @Test
  public void test_texas_holdem_6243_5hAsJsKsQh_8cQd_6hKh_7sJc_Ac7d_KcJd_Th4h_Kd6c() {
    assertEquals(
      "7sJc 8cQd 6hKh=Kd6c Ac7d KcJd Th4h",
      Solver.process("texas-holdem 5hAsJsKsQh 8cQd 6hKh 7sJc Ac7d KcJd Th4h Kd6c"));
  }

  @Test
  public void test_texas_holdem_6244_3s5dJcKsQh_Ah7s_AdKh_2d6d_3d9h_JdTh_5h2s_3h4s_6h4c_9cQc() {
    assertEquals(
      "2d6d=6h4c Ah7s 3d9h=3h4s 5h2s JdTh 9cQc AdKh",
      Solver.process("texas-holdem 3s5dJcKsQh Ah7s AdKh 2d6d 3d9h JdTh 5h2s 3h4s 6h4c 9cQc"));
  }

  @Test
  public void test_texas_holdem_6245_2d2s5c9c9h_2hQc_5s7h_3s7c_8dJc() {
    assertEquals(
      "3s7c 8dJc 5s7h 2hQc",
      Solver.process("texas-holdem 2d2s5c9c9h 2hQc 5s7h 3s7c 8dJc"));
  }

  @Test
  public void test_texas_holdem_6246_2s3d4d6sJh_5s6h_9h4s_4hQh_KhKc_As9s_Js9c_2h8d_Tc9d_8h5h() {
    assertEquals(
      "Tc9d As9s 2h8d 9h4s 4hQh Js9c KhKc 5s6h=8h5h",
      Solver.process("texas-holdem 2s3d4d6sJh 5s6h 9h4s 4hQh KhKc As9s Js9c 2h8d Tc9d 8h5h"));
  }

  @Test
  public void test_texas_holdem_6247_2s3d6hJdQh_8dKd_Jh9s_9h3c_5cAh_AdTd_8cKs_9c4d_2c8h_7hQc() {
    assertEquals(
      "9c4d 8cKs=8dKd 5cAh AdTd 2c8h 9h3c Jh9s 7hQc",
      Solver.process("texas-holdem 2s3d6hJdQh 8dKd Jh9s 9h3c 5cAh AdTd 8cKs 9c4d 2c8h 7hQc"));
  }

  @Test
  public void test_texas_holdem_6248_3h4c8s9cQh_5c7s_AsJc_JsQd_7c8c_6dKc_2d9h_6sAc_6cQc() {
    assertEquals(
      "5c7s 6dKc 6sAc AsJc 7c8c 2d9h 6cQc JsQd",
      Solver.process("texas-holdem 3h4c8s9cQh 5c7s AsJc JsQd 7c8c 6dKc 2d9h 6sAc 6cQc"));
  }

  @Test
  public void test_texas_holdem_6249_2s3s4s9hAh_8c7h_3cJd_4h6h_AcJh_Th7s_5dQh_9s9d_Kh5c() {
    assertEquals(
      "8c7h Th7s 3cJd 4h6h AcJh 9s9d 5dQh=Kh5c",
      Solver.process("texas-holdem 2s3s4s9hAh 8c7h 3cJd 4h6h AcJh Th7s 5dQh 9s9d Kh5c"));
  }

}
