
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TexasHoldemSolver28HiddenTest {


  @Test
  public void test_texas_holdem_7000_3h3s9cAsKh_6cJh_Tc9d_9hAc() {
    assertEquals(
      "6cJh Tc9d 9hAc",
      Solver.process("texas-holdem 3h3s9cAsKh 6cJh Tc9d 9hAc"));
  }

  @Test
  public void test_texas_holdem_7001_3d9hKdTdTh_5dAs_2s3h_8s5h_QcAc_2d6d_6hJc_4dKc_4s5s_Jh6s() {
    assertEquals(
      "4s5s 8s5h 6hJc=Jh6s 5dAs QcAc 2s3h 4dKc 2d6d",
      Solver.process("texas-holdem 3d9hKdTdTh 5dAs 2s3h 8s5h QcAc 2d6d 6hJc 4dKc 4s5s Jh6s"));
  }

  @Test
  public void test_texas_holdem_7002_2c3c7hJcTc_8hTs_2hKc_AcAh_8cTd_9cKh_JhAs_9s5c_Qs3d_Kd7d() {
    assertEquals(
      "Qs3d Kd7d 8hTs JhAs 9s5c 8cTd 9cKh 2hKc AcAh",
      Solver.process("texas-holdem 2c3c7hJcTc 8hTs 2hKc AcAh 8cTd 9cKh JhAs 9s5c Qs3d Kd7d"));
  }

  @Test
  public void test_texas_holdem_7003_2s4s5d9c9d_3dTh_2d4h_7dKd() {
    assertEquals(
      "3dTh 7dKd 2d4h",
      Solver.process("texas-holdem 2s4s5d9c9d 3dTh 2d4h 7dKd"));
  }

  @Test
  public void test_texas_holdem_7004_4c7d8sAsQd_Td8c_4hKs_7s8d_2h6d_AhTh_6sAc() {
    assertEquals(
      "2h6d 4hKs Td8c 6sAc AhTh 7s8d",
      Solver.process("texas-holdem 4c7d8sAsQd Td8c 4hKs 7s8d 2h6d AhTh 6sAc"));
  }

  @Test
  public void test_texas_holdem_7005_3d4s7dKcTs_3hAh_Qc4d_As6h_Th2s_JcQh_9c4h_9d6s() {
    assertEquals(
      "9d6s JcQh As6h 3hAh 9c4h Qc4d Th2s",
      Solver.process("texas-holdem 3d4s7dKcTs 3hAh Qc4d As6h Th2s JcQh 9c4h 9d6s"));
  }

  @Test
  public void test_texas_holdem_7006_2d7sAsJcQd_5h8d_3h5d_5cTh() {
    assertEquals(
      "3h5d 5h8d 5cTh",
      Solver.process("texas-holdem 2d7sAsJcQd 5h8d 3h5d 5cTh"));
  }

  @Test
  public void test_texas_holdem_7007_8hAsQcThTs_6s3h_9d8s_3dJh_5hQh_TcJc_7hJs() {
    assertEquals(
      "6s3h 3dJh=7hJs 9d8s 5hQh TcJc",
      Solver.process("texas-holdem 8hAsQcThTs 6s3h 9d8s 3dJh 5hQh TcJc 7hJs"));
  }

  @Test
  public void test_texas_holdem_7008_8c9c9dJsKs_3sAd_Td5d_3c8d_2s9h_As5s_4d7h() {
    assertEquals(
      "4d7h Td5d 3sAd=As5s 3c8d 2s9h",
      Solver.process("texas-holdem 8c9c9dJsKs 3sAd Td5d 3c8d 2s9h As5s 4d7h"));
  }

  @Test
  public void test_texas_holdem_7009_3s7hAsQcTh_9hQd_AdKh_6d5s_JcTs_9d4d_4h7s_5c6c_Kd3c() {
    assertEquals(
      "5c6c=6d5s 9d4d Kd3c 4h7s JcTs 9hQd AdKh",
      Solver.process("texas-holdem 3s7hAsQcTh 9hQd AdKh 6d5s JcTs 9d4d 4h7s 5c6c Kd3c"));
  }

  @Test
  public void test_texas_holdem_7010_3s7hAsJsKh_QhTs_8sJd_Jh6d_6c7s_2h3d() {
    assertEquals(
      "2h3d 6c7s Jh6d 8sJd QhTs",
      Solver.process("texas-holdem 3s7hAsJsKh QhTs 8sJd Jh6d 6c7s 2h3d"));
  }

  @Test
  public void test_texas_holdem_7011_5s6sJsKsQs_4d8h_6c9h_5cJh_Qc9s_7s7d_2sJd_Jc8s_7cTc_Ah9c() {
    assertEquals(
      "2sJd=4d8h=5cJh=6c9h=7cTc=Ah9c 7s7d Jc8s Qc9s",
      Solver.process("texas-holdem 5s6sJsKsQs 4d8h 6c9h 5cJh Qc9s 7s7d 2sJd Jc8s 7cTc Ah9c"));
  }

  @Test
  public void test_texas_holdem_7012_3d4s6d9cJd_Qd8d_9d5d() {
    assertEquals(
      "9d5d Qd8d",
      Solver.process("texas-holdem 3d4s6d9cJd Qd8d 9d5d"));
  }

  @Test
  public void test_texas_holdem_7013_7d7s9d9hAh_Kc7c_5cJd() {
    assertEquals(
      "5cJd Kc7c",
      Solver.process("texas-holdem 7d7s9d9hAh Kc7c 5cJd"));
  }

  @Test
  public void test_texas_holdem_7014_2c8hAcJdQc_9h6h_3c4h_2dKs_8c2h_Kc3d() {
    assertEquals(
      "3c4h 9h6h Kc3d 2dKs 8c2h",
      Solver.process("texas-holdem 2c8hAcJdQc 9h6h 3c4h 2dKs 8c2h Kc3d"));
  }

  @Test
  public void test_texas_holdem_7015_3d4c6h7cQc_Kc8d_4s6c_Qd2s_5h2h_QsAs_3c9c() {
    assertEquals(
      "Kc8d Qd2s QsAs 4s6c 5h2h 3c9c",
      Solver.process("texas-holdem 3d4c6h7cQc Kc8d 4s6c Qd2s 5h2h QsAs 3c9c"));
  }

  @Test
  public void test_texas_holdem_7016_4h5d6h8cAd_Ks8s_Qh9d_TcJh_Kh6d_9cKd_9h7h_3dAc_5hQc_Jd4c() {
    assertEquals(
      "TcJh Qh9d 9cKd Jd4c 5hQc Kh6d Ks8s 3dAc 9h7h",
      Solver.process("texas-holdem 4h5d6h8cAd Ks8s Qh9d TcJh Kh6d 9cKd 9h7h 3dAc 5hQc Jd4c"));
  }

  @Test
  public void test_texas_holdem_7017_2c2d9dJhTd_3c8c_9h5d_3d5s_6dAs_2s4d_Ac2h() {
    assertEquals(
      "3c8c=3d5s 6dAs 9h5d 2s4d Ac2h",
      Solver.process("texas-holdem 2c2d9dJhTd 3c8c 9h5d 3d5s 6dAs 2s4d Ac2h"));
  }

  @Test
  public void test_texas_holdem_7018_7s9hKsTcTs_5c4s_6h8s_Qc9c() {
    assertEquals(
      "5c4s Qc9c 6h8s",
      Solver.process("texas-holdem 7s9hKsTcTs 5c4s 6h8s Qc9c"));
  }

  @Test
  public void test_texas_holdem_7019_2s5sKdQhTd_7c6c_TcQc_4d3s_As5h() {
    assertEquals(
      "4d3s 7c6c As5h TcQc",
      Solver.process("texas-holdem 2s5sKdQhTd 7c6c TcQc 4d3s As5h"));
  }

  @Test
  public void test_texas_holdem_7020_2d8cAdKdTc_3c4h_3h7c_6hJc_Qh2c_Jh9c_4s5h() {
    assertEquals(
      "3c4h 4s5h 3h7c 6hJc Jh9c Qh2c",
      Solver.process("texas-holdem 2d8cAdKdTc 3c4h 3h7c 6hJc Qh2c Jh9c 4s5h"));
  }

  @Test
  public void test_texas_holdem_7021_2d6c7cKsQs_3h8d_8s5s() {
    assertEquals(
      "3h8d=8s5s",
      Solver.process("texas-holdem 2d6c7cKsQs 3h8d 8s5s"));
  }

  @Test
  public void test_texas_holdem_7022_2c7h8cJdQd_4dJs_Ah8s_5cTh() {
    assertEquals(
      "5cTh Ah8s 4dJs",
      Solver.process("texas-holdem 2c7h8cJdQd 4dJs Ah8s 5cTh"));
  }

  @Test
  public void test_texas_holdem_7023_5h6d9cKcKs_Th7d_7cAd_3s3c() {
    assertEquals(
      "Th7d 7cAd 3s3c",
      Solver.process("texas-holdem 5h6d9cKcKs Th7d 7cAd 3s3c"));
  }

  @Test
  public void test_texas_holdem_7024_5d7hJdJhQc_3d2h_3hTc_Th6c_Ad2s_6h9d_Jc6s_2d8h() {
    assertEquals(
      "3d2h 2d8h 6h9d 3hTc=Th6c Ad2s Jc6s",
      Solver.process("texas-holdem 5d7hJdJhQc 3d2h 3hTc Th6c Ad2s 6h9d Jc6s 2d8h"));
  }

  @Test
  public void test_texas_holdem_7025_3s4h5c5hKs_Ah3c_4d7s_5dQd_Ad6d_8sTs() {
    assertEquals(
      "8sTs Ad6d Ah3c 4d7s 5dQd",
      Solver.process("texas-holdem 3s4h5c5hKs Ah3c 4d7s 5dQd Ad6d 8sTs"));
  }

  @Test
  public void test_texas_holdem_7026_2d6s7sQcQs_6c6d_AdJh_7d8s_7hQh_3hKd_Jd4s_AcJs() {
    assertEquals(
      "Jd4s 3hKd AcJs=AdJh 7d8s 6c6d 7hQh",
      Solver.process("texas-holdem 2d6s7sQcQs 6c6d AdJh 7d8s 7hQh 3hKd Jd4s AcJs"));
  }

  @Test
  public void test_texas_holdem_7027_2c3h4c7hTd_2s6d_9s9d_5hAh_2h5s_6cTs_8h3d_QsQh() {
    assertEquals(
      "2h5s 2s6d 8h3d 9s9d 6cTs QsQh 5hAh",
      Solver.process("texas-holdem 2c3h4c7hTd 2s6d 9s9d 5hAh 2h5s 6cTs 8h3d QsQh"));
  }

  @Test
  public void test_texas_holdem_7028_2c4c6hTcTs_Jh6s_6c8d() {
    assertEquals(
      "6c8d Jh6s",
      Solver.process("texas-holdem 2c4c6hTcTs Jh6s 6c8d"));
  }

  @Test
  public void test_texas_holdem_7029_6c6h7c8cJd_2d6s_Jh2s_4hKs_9s2c_Qh9d_TcQd_8d3c_Th9h_5s4s() {
    assertEquals(
      "9s2c Qh9d TcQd 4hKs 8d3c Jh2s 2d6s 5s4s Th9h",
      Solver.process("texas-holdem 6c6h7c8cJd 2d6s Jh2s 4hKs 9s2c Qh9d TcQd 8d3c Th9h 5s4s"));
  }

  @Test
  public void test_texas_holdem_7030_2h3h7c7h9s_4sAd_8hKc_4cQs_3s4h_QdKs_2c6h_6sJd_Kd9c() {
    assertEquals(
      "6sJd 4cQs 8hKc QdKs 4sAd 2c6h 3s4h Kd9c",
      Solver.process("texas-holdem 2h3h7c7h9s 4sAd 8hKc 4cQs 3s4h QdKs 2c6h 6sJd Kd9c"));
  }

  @Test
  public void test_texas_holdem_7031_5c7sJsKcQh_3c4d_6h4s_8h6s_7c7h_5d5s() {
    assertEquals(
      "3c4d 6h4s 8h6s 5d5s 7c7h",
      Solver.process("texas-holdem 5c7sJsKcQh 3c4d 6h4s 8h6s 7c7h 5d5s"));
  }

  @Test
  public void test_texas_holdem_7032_6s7sAdJsTd_4cJh_5s9c_4s2d_Qs4h_TcQc_3c5c_TsJd_8h2c_9h3h() {
    assertEquals(
      "3c5c=4s2d 8h2c 5s9c=9h3h Qs4h TcQc 4cJh TsJd",
      Solver.process("texas-holdem 6s7sAdJsTd 4cJh 5s9c 4s2d Qs4h TcQc 3c5c TsJd 8h2c 9h3h"));
  }

  @Test
  public void test_texas_holdem_7033_5c7c7d9sTd_2d8h_2h5h_4cJd_8cAc() {
    assertEquals(
      "2d8h 4cJd 8cAc 2h5h",
      Solver.process("texas-holdem 5c7c7d9sTd 2d8h 2h5h 4cJd 8cAc"));
  }

  @Test
  public void test_texas_holdem_7034_2s3d3h4cJd_7s9d_Kc2d() {
    assertEquals(
      "7s9d Kc2d",
      Solver.process("texas-holdem 2s3d3h4cJd 7s9d Kc2d"));
  }

  @Test
  public void test_texas_holdem_7035_7d8dAcAhTh_JdTd_3s2d_KhJs_2h5d() {
    assertEquals(
      "2h5d=3s2d KhJs JdTd",
      Solver.process("texas-holdem 7d8dAcAhTh JdTd 3s2d KhJs 2h5d"));
  }

  @Test
  public void test_texas_holdem_7036_4h9hAsKsTc_AhJh_4sJc_6dAd_8c5s_3dKd_7c9s_3c8d_3sQh_Jd5h() {
    assertEquals(
      "3c8d=8c5s Jd5h 3sQh 4sJc 7c9s 3dKd 6dAd AhJh",
      Solver.process("texas-holdem 4h9hAsKsTc AhJh 4sJc 6dAd 8c5s 3dKd 7c9s 3c8d 3sQh Jd5h"));
  }

  @Test
  public void test_texas_holdem_7037_5d7h8cQhTs_Jc2h_QsTc_7s3c_9h2c_9sKd_6c3h_6s5c_7c5s_4h2s() {
    assertEquals(
      "4h2s 6c3h 9h2c Jc2h 9sKd 6s5c 7s3c 7c5s QsTc",
      Solver.process("texas-holdem 5d7h8cQhTs Jc2h QsTc 7s3c 9h2c 9sKd 6c3h 6s5c 7c5s 4h2s"));
  }

  @Test
  public void test_texas_holdem_7038_4h6sJdKcKd_4d5h_9sKs() {
    assertEquals(
      "4d5h 9sKs",
      Solver.process("texas-holdem 4h6sJdKcKd 4d5h 9sKs"));
  }

  @Test
  public void test_texas_holdem_7039_2d3c8c8sAc_Qs3h_6h9c_6s9d_7h4c_2cKc_KhTc_AsTd_9s9h() {
    assertEquals(
      "7h4c 6h9c=6s9d KhTc Qs3h 9s9h AsTd 2cKc",
      Solver.process("texas-holdem 2d3c8c8sAc Qs3h 6h9c 6s9d 7h4c 2cKc KhTc AsTd 9s9h"));
  }

  @Test
  public void test_texas_holdem_7040_5s6s9dQcTd_5d6h_9h3c_AcQh() {
    assertEquals(
      "9h3c AcQh 5d6h",
      Solver.process("texas-holdem 5s6s9dQcTd 5d6h 9h3c AcQh"));
  }

  @Test
  public void test_texas_holdem_7041_4h4s9d9sJs_7s9h_8c6c_4cAd_Jc2c_5hJh_Tc2h_Ts3c_7d9c() {
    assertEquals(
      "8c6c=Tc2h=Ts3c Jc2c 5hJh 4cAd 7d9c=7s9h",
      Solver.process("texas-holdem 4h4s9d9sJs 7s9h 8c6c 4cAd Jc2c 5hJh Tc2h Ts3c 7d9c"));
  }

  @Test
  public void test_texas_holdem_7042_3d6dAsJsQc_7c4h_3cTh_5hAd_JdTd_5d9s() {
    assertEquals(
      "7c4h 5d9s 3cTh JdTd 5hAd",
      Solver.process("texas-holdem 3d6dAsJsQc 7c4h 3cTh 5hAd JdTd 5d9s"));
  }

  @Test
  public void test_texas_holdem_7043_6s7d8c8dJd_9c3c_JsQh_4dKc_9s8s_As3h_6hKs_2hKh() {
    assertEquals(
      "9c3c 2hKh=4dKc As3h 6hKs JsQh 9s8s",
      Solver.process("texas-holdem 6s7d8c8dJd 9c3c JsQh 4dKc 9s8s As3h 6hKs 2hKh"));
  }

  @Test
  public void test_texas_holdem_7044_5c6s9sAdTd_5h2h_Jc6d_Ks2s_Th4s() {
    assertEquals(
      "Ks2s 5h2h Jc6d Th4s",
      Solver.process("texas-holdem 5c6s9sAdTd 5h2h Jc6d Ks2s Th4s"));
  }

  @Test
  public void test_texas_holdem_7045_6d9sAdAhJd_JhTh_9d9c_KdKs_As5c_8h2d_7h2c_Js7d() {
    assertEquals(
      "7h2c 8h2d Js7d JhTh KdKs As5c 9d9c",
      Solver.process("texas-holdem 6d9sAdAhJd JhTh 9d9c KdKs As5c 8h2d 7h2c Js7d"));
  }

  @Test
  public void test_texas_holdem_7046_3c5c8sAcJh_Ad8h_8d7h_5sTc() {
    assertEquals(
      "5sTc 8d7h Ad8h",
      Solver.process("texas-holdem 3c5c8sAcJh Ad8h 8d7h 5sTc"));
  }

  @Test
  public void test_texas_holdem_7047_2s3s9dQcQs_5c6c_6s8d_Kh4h_7h9c() {
    assertEquals(
      "5c6c 6s8d Kh4h 7h9c",
      Solver.process("texas-holdem 2s3s9dQcQs 5c6c 6s8d Kh4h 7h9c"));
  }

  @Test
  public void test_texas_holdem_7048_3c3s4hAcJh_2c4s_6dJc_7h5d() {
    assertEquals(
      "7h5d 2c4s 6dJc",
      Solver.process("texas-holdem 3c3s4hAcJh 2c4s 6dJc 7h5d"));
  }

  @Test
  public void test_texas_holdem_7049_3c3s6sKcKs_4d5d_4hKd_7hJh_9d3h_8h8d() {
    assertEquals(
      "4d5d 7hJh 8h8d 9d3h 4hKd",
      Solver.process("texas-holdem 3c3s6sKcKs 4d5d 4hKd 7hJh 9d3h 8h8d"));
  }

  @Test
  public void test_texas_holdem_7050_2h3c6dQsTs_As9s_KhJh_JdQd_2cAd_6c4h_9c7d_9h6s() {
    assertEquals(
      "9c7d KhJh As9s 2cAd 6c4h 9h6s JdQd",
      Solver.process("texas-holdem 2h3c6dQsTs As9s KhJh JdQd 2cAd 6c4h 9c7d 9h6s"));
  }

  @Test
  public void test_texas_holdem_7051_4h5h9cQsTh_AcAs_8h9s_2cTd_KsJh_8dKc_2h6s_Kd4d_JsQc() {
    assertEquals(
      "2h6s 8dKc Kd4d 8h9s 2cTd JsQc AcAs KsJh",
      Solver.process("texas-holdem 4h5h9cQsTh AcAs 8h9s 2cTd KsJh 8dKc 2h6s Kd4d JsQc"));
  }

  @Test
  public void test_texas_holdem_7052_3d8c8dJdKh_AcQd_Jh7h() {
    assertEquals(
      "AcQd Jh7h",
      Solver.process("texas-holdem 3d8c8dJdKh AcQd Jh7h"));
  }

  @Test
  public void test_texas_holdem_7053_4c6c7hAdQd_AhJh_3c7c_Jd8h_KhKs_ThQh_6d4h_4s2c_5d3s() {
    assertEquals(
      "Jd8h 4s2c 3c7c ThQh KhKs AhJh 6d4h 5d3s",
      Solver.process("texas-holdem 4c6c7hAdQd AhJh 3c7c Jd8h KhKs ThQh 6d4h 4s2c 5d3s"));
  }

  @Test
  public void test_texas_holdem_7054_2h3s4s6dJh_9sQh_3hKd_9c8d_7sKs_Ac4h_Kc6c_Js5c() {
    assertEquals(
      "9c8d 9sQh 7sKs 3hKd Ac4h Kc6c Js5c",
      Solver.process("texas-holdem 2h3s4s6dJh 9sQh 3hKd 9c8d 7sKs Ac4h Kc6c Js5c"));
  }

  @Test
  public void test_texas_holdem_7055_4sAcJsKdQc_Ah9d_7s4h_As9c_5d6s_ThJh_8d4d_Qs8s_4cTd() {
    assertEquals(
      "5d6s 7s4h=8d4d Qs8s Ah9d=As9c 4cTd=ThJh",
      Solver.process("texas-holdem 4sAcJsKdQc Ah9d 7s4h As9c 5d6s ThJh 8d4d Qs8s 4cTd"));
  }

  @Test
  public void test_texas_holdem_7056_2h6c7c9hTh_Qs7h_Kd8c_8h9s_Qc3s_2d4d_KhQh_8dKc_7dTs() {
    assertEquals(
      "Qc3s 2d4d Qs7h 7dTs 8dKc=8h9s=Kd8c KhQh",
      Solver.process("texas-holdem 2h6c7c9hTh Qs7h Kd8c 8h9s Qc3s 2d4d KhQh 8dKc 7dTs"));
  }

  @Test
  public void test_texas_holdem_7057_9dJdKcQcTc_3sKh_QsQd_Jh3h_7h8s_7dAs_4sKs_8dTd() {
    assertEquals(
      "3sKh=4sKs=7h8s=8dTd=Jh3h=QsQd 7dAs",
      Solver.process("texas-holdem 9dJdKcQcTc 3sKh QsQd Jh3h 7h8s 7dAs 4sKs 8dTd"));
  }

  @Test
  public void test_texas_holdem_7058_5s6d8h9sKd_9cJs_9h3c_2h3d_Qs3s() {
    assertEquals(
      "2h3d Qs3s 9h3c 9cJs",
      Solver.process("texas-holdem 5s6d8h9sKd 9cJs 9h3c 2h3d Qs3s"));
  }

  @Test
  public void test_texas_holdem_7059_3d4s9c9dQc_7h5c_7cQs_4h8s_QhAs_2h2s_TdJh_2d5h_AhTh() {
    assertEquals(
      "2d5h 7h5c TdJh AhTh 2h2s 4h8s 7cQs QhAs",
      Solver.process("texas-holdem 3d4s9c9dQc 7h5c 7cQs 4h8s QhAs 2h2s TdJh 2d5h AhTh"));
  }

  @Test
  public void test_texas_holdem_7060_4d7sJsKcTh_6h9d_As3d() {
    assertEquals(
      "6h9d As3d",
      Solver.process("texas-holdem 4d7sJsKcTh 6h9d As3d"));
  }

  @Test
  public void test_texas_holdem_7061_2s4c8dAdKd_AsTh_3cKh_KcTc() {
    assertEquals(
      "3cKh KcTc AsTh",
      Solver.process("texas-holdem 2s4c8dAdKd AsTh 3cKh KcTc"));
  }

  @Test
  public void test_texas_holdem_7062_7h7sAcJcTh_TdTc_3dKc_3s8c_8d4c_AsQd_Qc9c_2h2d_Ad8s() {
    assertEquals(
      "3s8c=8d4c Qc9c 3dKc 2h2d Ad8s AsQd TdTc",
      Solver.process("texas-holdem 7h7sAcJcTh TdTc 3dKc 3s8c 8d4c AsQd Qc9c 2h2d Ad8s"));
  }

  @Test
  public void test_texas_holdem_7063_2s5d5h7sQc_8hAs_3d9h_8dTc_8sTd_6dTs_AhKs_2dQh_9sQs_3c4h() {
    assertEquals(
      "3c4h 3d9h 6dTs 8dTc=8sTd 8hAs AhKs 2dQh 9sQs",
      Solver.process("texas-holdem 2s5d5h7sQc 8hAs 3d9h 8dTc 8sTd 6dTs AhKs 2dQh 9sQs 3c4h"));
  }

  @Test
  public void test_texas_holdem_7064_8dAhJdKsQd_2d7d_9cJh_5cKc_9sTs_2h2c_9d8h_5dJc_3h4c_6s3d() {
    assertEquals(
      "3h4c=6s3d 2h2c 9d8h 5dJc=9cJh 5cKc 9sTs 2d7d",
      Solver.process("texas-holdem 8dAhJdKsQd 2d7d 9cJh 5cKc 9sTs 2h2c 9d8h 5dJc 3h4c 6s3d"));
  }

  @Test
  public void test_texas_holdem_7065_4h7h9hQsTd_JcAd_QdTs_2dTh_Kh5h_JhKs_As9s_3s7s_JdQh() {
    assertEquals(
      "JcAd 3s7s As9s 2dTh JdQh QdTs JhKs Kh5h",
      Solver.process("texas-holdem 4h7h9hQsTd JcAd QdTs 2dTh Kh5h JhKs As9s 3s7s JdQh"));
  }

  @Test
  public void test_texas_holdem_7066_3d5c7c8c9c_TsTc_4h5d() {
    assertEquals(
      "4h5d TsTc",
      Solver.process("texas-holdem 3d5c7c8c9c TsTc 4h5d"));
  }

  @Test
  public void test_texas_holdem_7067_3s5h7h9hKs_JcQd_6s2c() {
    assertEquals(
      "6s2c JcQd",
      Solver.process("texas-holdem 3s5h7h9hKs JcQd 6s2c"));
  }

  @Test
  public void test_texas_holdem_7068_2h5dAsJdTc_Ac8c_4hJs_6cKd() {
    assertEquals(
      "6cKd 4hJs Ac8c",
      Solver.process("texas-holdem 2h5dAsJdTc Ac8c 4hJs 6cKd"));
  }

  @Test
  public void test_texas_holdem_7069_6hAdKdKhKs_8c5s_AhTd() {
    assertEquals(
      "8c5s AhTd",
      Solver.process("texas-holdem 6hAdKdKhKs 8c5s AhTd"));
  }

  @Test
  public void test_texas_holdem_7070_2d4c5hJhJs_Ks8c_Qd5d_9c3h_3d3c_2h5c_As8s_AdKh() {
    assertEquals(
      "9c3h Ks8c As8s AdKh 3d3c 2h5c Qd5d",
      Solver.process("texas-holdem 2d4c5hJhJs Ks8c Qd5d 9c3h 3d3c 2h5c As8s AdKh"));
  }

  @Test
  public void test_texas_holdem_7071_2d5s6sAsKs_Kh9h_Jd9c_3h8d_7s4s_TdJs_KcTs_QsTc_6h2s_Th8c() {
    assertEquals(
      "3h8d Th8c Jd9c Kh9h 6h2s 7s4s KcTs TdJs QsTc",
      Solver.process("texas-holdem 2d5s6sAsKs Kh9h Jd9c 3h8d 7s4s TdJs KcTs QsTc 6h2s Th8c"));
  }

  @Test
  public void test_texas_holdem_7072_2s5c6d8hKs_4d7h_Ac3c_Jh9s_Jd5s_8d7c_Th8c_JsQd() {
    assertEquals(
      "Jh9s JsQd Ac3c Jd5s 8d7c Th8c 4d7h",
      Solver.process("texas-holdem 2s5c6d8hKs 4d7h Ac3c Jh9s Jd5s 8d7c Th8c JsQd"));
  }

  @Test
  public void test_texas_holdem_7073_2s3d4d6cAc_7d2d_9d6h_2h7h() {
    assertEquals(
      "2h7h=7d2d 9d6h",
      Solver.process("texas-holdem 2s3d4d6cAc 7d2d 9d6h 2h7h"));
  }

  @Test
  public void test_texas_holdem_7074_2c3s6sAdQs_TsKc_7s4s_KsAc() {
    assertEquals(
      "TsKc KsAc 7s4s",
      Solver.process("texas-holdem 2c3s6sAdQs TsKc 7s4s KsAc"));
  }

  @Test
  public void test_texas_holdem_7075_2c3h8sAsKd_KsTd_3s2h_Jd5c_7h8d_Th4h_Qh5d() {
    assertEquals(
      "Th4h Jd5c Qh5d 7h8d KsTd 3s2h",
      Solver.process("texas-holdem 2c3h8sAsKd KsTd 3s2h Jd5c 7h8d Th4h Qh5d"));
  }

  @Test
  public void test_texas_holdem_7076_4d5c8cQcTs_3hTc_Qs7s_3c3d_Ah2c_7d6s_5sQd_6hJc_Jd4h_As2h() {
    assertEquals(
      "6hJc Ah2c=As2h 3c3d Jd4h 3hTc Qs7s 5sQd 7d6s",
      Solver.process("texas-holdem 4d5c8cQcTs 3hTc Qs7s 3c3d Ah2c 7d6s 5sQd 6hJc Jd4h As2h"));
  }

  @Test
  public void test_texas_holdem_7077_2c2h4d5h9d_Qs8c_5s6h() {
    assertEquals(
      "Qs8c 5s6h",
      Solver.process("texas-holdem 2c2h4d5h9d Qs8c 5s6h"));
  }

  @Test
  public void test_texas_holdem_7078_7h9dKcKdKs_3d3c_Ts9s_6cAc_2s4c_2c8d() {
    assertEquals(
      "2s4c 2c8d 6cAc 3d3c Ts9s",
      Solver.process("texas-holdem 7h9dKcKdKs 3d3c Ts9s 6cAc 2s4c 2c8d"));
  }

  @Test
  public void test_texas_holdem_7079_2c3s5dAsJd_6cQd_4hKc_7d4c() {
    assertEquals(
      "6cQd 4hKc=7d4c",
      Solver.process("texas-holdem 2c3s5dAsJd 6cQd 4hKc 7d4c"));
  }

  @Test
  public void test_texas_holdem_7080_3d3sAhJhTc_7s7h_Ac8s_6sAs_9hTd() {
    assertEquals(
      "7s7h 9hTd 6sAs=Ac8s",
      Solver.process("texas-holdem 3d3sAhJhTc 7s7h Ac8s 6sAs 9hTd"));
  }

  @Test
  public void test_texas_holdem_7081_3h6hJcJdJs_AhAd_9d7d_8d9h_Kc7h_6s9s() {
    assertEquals(
      "9d7d 8d9h Kc7h 6s9s AhAd",
      Solver.process("texas-holdem 3h6hJcJdJs AhAd 9d7d 8d9h Kc7h 6s9s"));
  }

  @Test
  public void test_texas_holdem_7082_5s8d8hAdKh_9c7s_Tc9h_3h4s() {
    assertEquals(
      "3h4s 9c7s Tc9h",
      Solver.process("texas-holdem 5s8d8hAdKh 9c7s Tc9h 3h4s"));
  }

  @Test
  public void test_texas_holdem_7083_2c6h8c9cKs_7dJd_Tc5c_4c6d_6sQh_Ts7c_2s2d_KdAd_2h9s() {
    assertEquals(
      "7dJd 4c6d 6sQh KdAd 2h9s 2s2d Ts7c Tc5c",
      Solver.process("texas-holdem 2c6h8c9cKs 7dJd Tc5c 4c6d 6sQh Ts7c 2s2d KdAd 2h9s"));
  }

  @Test
  public void test_texas_holdem_7084_2c4c5d7dQd_7h9c_Ad2h_2s5c_JdQh_7cQs_3cTs_KdAc_JsAs_9h9s() {
    assertEquals(
      "3cTs JsAs KdAc Ad2h 7h9c 9h9s JdQh 2s5c 7cQs",
      Solver.process("texas-holdem 2c4c5d7dQd 7h9c Ad2h 2s5c JdQh 7cQs 3cTs KdAc JsAs 9h9s"));
  }

  @Test
  public void test_texas_holdem_7085_9c9hKcQcTs_3h8d_Td3s_KsTh_QsJc_Js6s_5h7d_Kh4s_AcTc() {
    assertEquals(
      "3h8d=5h7d Td3s Kh4s KsTh Js6s=QsJc AcTc",
      Solver.process("texas-holdem 9c9hKcQcTs 3h8d Td3s KsTh QsJc Js6s 5h7d Kh4s AcTc"));
  }

  @Test
  public void test_texas_holdem_7086_3d4h5sKdQh_Ah7h_5d7c_Ad8h_3s2c_Th7s_Tc8c_9c2d_QcTd() {
    assertEquals(
      "9c2d Th7s Tc8c Ah7h Ad8h 3s2c 5d7c QcTd",
      Solver.process("texas-holdem 3d4h5sKdQh Ah7h 5d7c Ad8h 3s2c Th7s Tc8c 9c2d QcTd"));
  }

  @Test
  public void test_texas_holdem_7087_2c3s7hAcQc_6c5h_Jh6h_KdJd_Th2s() {
    assertEquals(
      "6c5h Jh6h KdJd Th2s",
      Solver.process("texas-holdem 2c3s7hAcQc 6c5h Jh6h KdJd Th2s"));
  }

  @Test
  public void test_texas_holdem_7088_5h7d8d9cTc_2hKc_Ts2s_2cAd_3hAh_6c4c() {
    assertEquals(
      "2hKc 2cAd=3hAh Ts2s 6c4c",
      Solver.process("texas-holdem 5h7d8d9cTc 2hKc Ts2s 2cAd 3hAh 6c4c"));
  }

  @Test
  public void test_texas_holdem_7089_2d2h8s9dAd_JhTs_Ks7c_Ac9c_3hTh_Kd3d_4hKh_Tc2c_As9s() {
    assertEquals(
      "3hTh JhTs 4hKh=Ks7c Ac9c=As9s Tc2c Kd3d",
      Solver.process("texas-holdem 2d2h8s9dAd JhTs Ks7c Ac9c 3hTh Kd3d 4hKh Tc2c As9s"));
  }

  @Test
  public void test_texas_holdem_7090_2c5c5s6c7d_3sQd_Kc3c() {
    assertEquals(
      "3sQd Kc3c",
      Solver.process("texas-holdem 2c5c5s6c7d 3sQd Kc3c"));
  }

  @Test
  public void test_texas_holdem_7091_2s3c6d8c9d_Qh5h_7s5s_Td8d_9s4s() {
    assertEquals(
      "Qh5h Td8d 9s4s 7s5s",
      Solver.process("texas-holdem 2s3c6d8c9d Qh5h 7s5s Td8d 9s4s"));
  }

  @Test
  public void test_texas_holdem_7092_4d5s6s9cAc_9s8s_3d7h_AhAs_2sTd_Kh3c_Ks8h_7dKd() {
    assertEquals(
      "2sTd Kh3c 7dKd Ks8h 9s8s AhAs 3d7h",
      Solver.process("texas-holdem 4d5s6s9cAc 9s8s 3d7h AhAs 2sTd Kh3c Ks8h 7dKd"));
  }

  @Test
  public void test_texas_holdem_7093_4s7s8c8dTs_5d8s_2c9s_Js6c() {
    assertEquals(
      "2c9s Js6c 5d8s",
      Solver.process("texas-holdem 4s7s8c8dTs 5d8s 2c9s Js6c"));
  }

  @Test
  public void test_texas_holdem_7094_4c6d8d9dQd_7sTh_Js5d_Ah8h_Qh3s_3cTc_6cAd() {
    assertEquals(
      "3cTc Ah8h Qh3s 7sTh Js5d 6cAd",
      Solver.process("texas-holdem 4c6d8d9dQd 7sTh Js5d Ah8h Qh3s 3cTc 6cAd"));
  }

  @Test
  public void test_texas_holdem_7095_2c4c7c8dTd_Kh7d_7h2d_9cAs_2h5s_Jd9d_Qs6h_9sQd_3c4s_Qc3s() {
    assertEquals(
      "Qc3s Qs6h 9sQd 9cAs 2h5s 3c4s Kh7d 7h2d Jd9d",
      Solver.process("texas-holdem 2c4c7c8dTd Kh7d 7h2d 9cAs 2h5s Jd9d Qs6h 9sQd 3c4s Qc3s"));
  }

  @Test
  public void test_texas_holdem_7096_2h3c3d4h7d_9h8c_Ac4c_QdJh() {
    assertEquals(
      "9h8c QdJh Ac4c",
      Solver.process("texas-holdem 2h3c3d4h7d 9h8c Ac4c QdJh"));
  }

  @Test
  public void test_texas_holdem_7097_5d5h7cTcTs_3s9h_9c7h_Ad5s_5c3c_3h4d_4s2c_Qd8d_3d2d() {
    assertEquals(
      "3d2d=3h4d=4s2c 3s9h Qd8d 9c7h 5c3c=Ad5s",
      Solver.process("texas-holdem 5d5h7cTcTs 3s9h 9c7h Ad5s 5c3c 3h4d 4s2c Qd8d 3d2d"));
  }

  @Test
  public void test_texas_holdem_7098_4s5sKcKsQs_6s8s_9s8c_9c7d_As2c_6c5d_2s3s_3d8h() {
    assertEquals(
      "3d8h 9c7d 6c5d 2s3s 6s8s 9s8c As2c",
      Solver.process("texas-holdem 4s5sKcKsQs 6s8s 9s8c 9c7d As2c 6c5d 2s3s 3d8h"));
  }

  @Test
  public void test_texas_holdem_7099_4h6h9sAsKs_JhTh_AcQd_2c7h_6s8h_Qc5c_2dTd_5s3c_2h4c() {
    assertEquals(
      "5s3c 2c7h 2dTd JhTh Qc5c 2h4c 6s8h AcQd",
      Solver.process("texas-holdem 4h6h9sAsKs JhTh AcQd 2c7h 6s8h Qc5c 2dTd 5s3c 2h4c"));
  }

  @Test
  public void test_texas_holdem_7100_8dJcKcKhQc_TdTh_AdAs_6c4s_Tc6s_6hJh_5d3c_4dAh_5hAc() {
    assertEquals(
      "5d3c=6c4s Tc6s 4dAh=5hAc TdTh 6hJh AdAs",
      Solver.process("texas-holdem 8dJcKcKhQc TdTh AdAs 6c4s Tc6s 6hJh 5d3c 4dAh 5hAc"));
  }

  @Test
  public void test_texas_holdem_7101_2d3dJcQhTs_8s8c_KsQs_TdAc_5hKc_Th3h_Ah8h_JhJd_4h9d() {
    assertEquals(
      "4h9d 5hKc Ah8h 8s8c TdAc KsQs Th3h JhJd",
      Solver.process("texas-holdem 2d3dJcQhTs 8s8c KsQs TdAc 5hKc Th3h Ah8h JhJd 4h9d"));
  }

  @Test
  public void test_texas_holdem_7102_2c3c3h9cTs_5hKd_4hQd_4cQs_TdJd_3sKh_Ah2h_Ad7s_Js6h_5d5s() {
    assertEquals(
      "Js6h 4cQs=4hQd 5hKd Ad7s Ah2h 5d5s TdJd 3sKh",
      Solver.process("texas-holdem 2c3c3h9cTs 5hKd 4hQd 4cQs TdJd 3sKh Ah2h Ad7s Js6h 5d5s"));
  }

  @Test
  public void test_texas_holdem_7103_7c9cAhAsTd_Qh3d_4h4c_6c5s_8h4d_8c5c_9dAc_2cJc_Js3c_6dKh() {
    assertEquals(
      "6c5s 8c5c=8h4d 2cJc=Js3c Qh3d 6dKh 4h4c 9dAc",
      Solver.process("texas-holdem 7c9cAhAsTd Qh3d 4h4c 6c5s 8h4d 8c5c 9dAc 2cJc Js3c 6dKh"));
  }

  @Test
  public void test_texas_holdem_7104_6d7cJhKcQd_2dQs_5h6c_Ac8c_Ah4s_5s7h_2c3s_JdTh_3d7s_6h6s() {
    assertEquals(
      "2c3s Ah4s Ac8c 5h6c 3d7s=5s7h JdTh 2dQs 6h6s",
      Solver.process("texas-holdem 6d7cJhKcQd 2dQs 5h6c Ac8c Ah4s 5s7h 2c3s JdTh 3d7s 6h6s"));
  }

  @Test
  public void test_texas_holdem_7105_3d5s7h8cKd_Qh6d_6h9c_2d8h_2h5h_3c2s_4dAc_6c8d_KsQd_Td7d() {
    assertEquals(
      "Qh6d 4dAc 3c2s 2h5h Td7d 2d8h 6c8d KsQd 6h9c",
      Solver.process("texas-holdem 3d5s7h8cKd Qh6d 6h9c 2d8h 2h5h 3c2s 4dAc 6c8d KsQd Td7d"));
  }

  @Test
  public void test_texas_holdem_7106_6c6dAdQcTc_7d6h_5cKs_JsJc_Ac8c_2d5s_JdJh_8s6s() {
    assertEquals(
      "2d5s 5cKs JdJh=JsJc 7d6h=8s6s Ac8c",
      Solver.process("texas-holdem 6c6dAdQcTc 7d6h 5cKs JsJc Ac8c 2d5s JdJh 8s6s"));
  }

  @Test
  public void test_texas_holdem_7107_2c4h8c8hTh_2d8d_JdTs_9hTc_5cQc_9d7c_8sKs_4s5h_7hQs_AdJc() {
    assertEquals(
      "9d7c 5cQc 7hQs AdJc 4s5h 9hTc JdTs 8sKs 2d8d",
      Solver.process("texas-holdem 2c4h8c8hTh 2d8d JdTs 9hTc 5cQc 9d7c 8sKs 4s5h 7hQs AdJc"));
  }

  @Test
  public void test_texas_holdem_7108_4d9sKsThTs_Jh6h_Js8c_Ad5s() {
    assertEquals(
      "Jh6h=Js8c Ad5s",
      Solver.process("texas-holdem 4d9sKsThTs Jh6h Js8c Ad5s"));
  }

  @Test
  public void test_texas_holdem_7109_2c6h7cQcQs_Th2h_KcJs() {
    assertEquals(
      "KcJs Th2h",
      Solver.process("texas-holdem 2c6h7cQcQs Th2h KcJs"));
  }

  @Test
  public void test_texas_holdem_7110_2s7c9dAcKs_4d5h_6cAd_Qs4c_Jh4h_6hJd_5d3d_As3h() {
    assertEquals(
      "4d5h=5d3d 6hJd=Jh4h Qs4c 6cAd=As3h",
      Solver.process("texas-holdem 2s7c9dAcKs 4d5h 6cAd Qs4c Jh4h 6hJd 5d3d As3h"));
  }

  @Test
  public void test_texas_holdem_7111_4d6h6sAhTc_JdAd_7dQs() {
    assertEquals(
      "7dQs JdAd",
      Solver.process("texas-holdem 4d6h6sAhTc JdAd 7dQs"));
  }

  @Test
  public void test_texas_holdem_7112_9sJcJsKdQd_5s5d_5c6h_Qh8h_Td6c_Th8s_6s6d() {
    assertEquals(
      "5c6h 5s5d 6s6d Qh8h Td6c=Th8s",
      Solver.process("texas-holdem 9sJcJsKdQd 5s5d 5c6h Qh8h Td6c Th8s 6s6d"));
  }

  @Test
  public void test_texas_holdem_7113_3c3d4s8dKc_9dJc_2dTh_3hQc_Js8h_Qd5h_9cJd_6s7d_AdQs() {
    assertEquals(
      "6s7d 2dTh 9cJd=9dJc Qd5h AdQs Js8h 3hQc",
      Solver.process("texas-holdem 3c3d4s8dKc 9dJc 2dTh 3hQc Js8h Qd5h 9cJd 6s7d AdQs"));
  }

  @Test
  public void test_texas_holdem_7114_2h3h7cAdKh_Qd9c_Tc5d_Th3c() {
    assertEquals(
      "Tc5d Qd9c Th3c",
      Solver.process("texas-holdem 2h3h7cAdKh Qd9c Tc5d Th3c"));
  }

  @Test
  public void test_texas_holdem_7115_3d5d6dKcKh_8sKd_TcKs() {
    assertEquals(
      "8sKd TcKs",
      Solver.process("texas-holdem 3d5d6dKcKh 8sKd TcKs"));
  }

  @Test
  public void test_texas_holdem_7116_2d5d5h7cQc_6h3c_KcTd_9sQs_6c8c_4s2c_5s3s_4d9c_Jd2s_Ad7h() {
    assertEquals(
      "6h3c 6c8c 4d9c KcTd 4s2c=Jd2s Ad7h 9sQs 5s3s",
      Solver.process("texas-holdem 2d5d5h7cQc 6h3c KcTd 9sQs 6c8c 4s2c 5s3s 4d9c Jd2s Ad7h"));
  }

  @Test
  public void test_texas_holdem_7117_AsJhJsKhKs_3c8h_9cJc_9hTh_4hJd_3d2c() {
    assertEquals(
      "3c8h=3d2c=9hTh 4hJd=9cJc",
      Solver.process("texas-holdem AsJhJsKhKs 3c8h 9cJc 9hTh 4hJd 3d2c"));
  }

  @Test
  public void test_texas_holdem_7118_4s5c7h8cQd_Jc2d_4hKd_2s8h_KsKh_7d6s_QhAd_Jh3c_9hAh() {
    assertEquals(
      "Jc2d=Jh3c 9hAh 4hKd 2s8h QhAd KsKh 7d6s",
      Solver.process("texas-holdem 4s5c7h8cQd Jc2d 4hKd 2s8h KsKh 7d6s QhAd Jh3c 9hAh"));
  }

  @Test
  public void test_texas_holdem_7119_2h3s6c7dAc_Ts4c_7h9d() {
    assertEquals(
      "Ts4c 7h9d",
      Solver.process("texas-holdem 2h3s6c7dAc Ts4c 7h9d"));
  }

  @Test
  public void test_texas_holdem_7120_2c2sJhTdTs_9sAs_2d3s_3h8h_KcKs() {
    assertEquals(
      "3h8h 9sAs KcKs 2d3s",
      Solver.process("texas-holdem 2c2sJhTdTs 9sAs 2d3s 3h8h KcKs"));
  }

  @Test
  public void test_texas_holdem_7121_4h7hAdQsTh_6s5c_3cQc_3h4c_3d2d_8d9d_Kd3s_8hQh_Ts4s() {
    assertEquals(
      "3d2d 6s5c 8d9d Kd3s 3h4c 3cQc Ts4s 8hQh",
      Solver.process("texas-holdem 4h7hAdQsTh 6s5c 3cQc 3h4c 3d2d 8d9d Kd3s 8hQh Ts4s"));
  }

  @Test
  public void test_texas_holdem_7122_2d6hJhKdTc_7s2c_4c7h_TsKs_8d8s_7d8h_9h4h_Qs4s_3dQh() {
    assertEquals(
      "4c7h 7d8h 9h4h 3dQh=Qs4s 7s2c 8d8s TsKs",
      Solver.process("texas-holdem 2d6hJhKdTc 7s2c 4c7h TsKs 8d8s 7d8h 9h4h Qs4s 3dQh"));
  }

  @Test
  public void test_texas_holdem_7123_5s6d6h6sKs_8s2s_As3d_8d9s_Ad4h_3h9c_3c5c_3s5d_9dJs() {
    assertEquals(
      "3h9c=8d9s 9dJs Ad4h=As3d 8s2s 3c5c=3s5d",
      Solver.process("texas-holdem 5s6d6h6sKs 8s2s As3d 8d9s Ad4h 3h9c 3c5c 3s5d 9dJs"));
  }

  @Test
  public void test_texas_holdem_7124_2d2s4c6dQh_Tc3c_9s8s_QcAc_5dJs() {
    assertEquals(
      "9s8s Tc3c 5dJs QcAc",
      Solver.process("texas-holdem 2d2s4c6dQh Tc3c 9s8s QcAc 5dJs"));
  }

  @Test
  public void test_texas_holdem_7125_2s5s9dAhQh_Qc9s_8c6c() {
    assertEquals(
      "8c6c Qc9s",
      Solver.process("texas-holdem 2s5s9dAhQh Qc9s 8c6c"));
  }

  @Test
  public void test_texas_holdem_7126_4h4s8h9dJs_5sJh_3s2d_KsAh() {
    assertEquals(
      "3s2d KsAh 5sJh",
      Solver.process("texas-holdem 4h4s8h9dJs 5sJh 3s2d KsAh"));
  }

  @Test
  public void test_texas_holdem_7127_2h2s5s9hJd_5c7s_9s2c_Qh9d_AdJs_8d2d_5h8h() {
    assertEquals(
      "5c7s=5h8h Qh9d AdJs 8d2d 9s2c",
      Solver.process("texas-holdem 2h2s5s9hJd 5c7s 9s2c Qh9d AdJs 8d2d 5h8h"));
  }

  @Test
  public void test_texas_holdem_7128_3h5s7c7s9h_8sQd_8h7h_Jc7d_KcAh_KdTs_QsJd_Kh5h_Ks3c_9sJh() {
    assertEquals(
      "8sQd QsJd KdTs KcAh Ks3c Kh5h 9sJh 8h7h Jc7d",
      Solver.process("texas-holdem 3h5s7c7s9h 8sQd 8h7h Jc7d KcAh KdTs QsJd Kh5h Ks3c 9sJh"));
  }

  @Test
  public void test_texas_holdem_7129_3d5cQdQsTd_8hAh_ThKh() {
    assertEquals(
      "8hAh ThKh",
      Solver.process("texas-holdem 3d5cQdQsTd 8hAh ThKh"));
  }

  @Test
  public void test_texas_holdem_7130_4c4hJhTcTs_2cQh_5h7s() {
    assertEquals(
      "5h7s 2cQh",
      Solver.process("texas-holdem 4c4hJhTcTs 2cQh 5h7s"));
  }

  @Test
  public void test_texas_holdem_7131_5h8c8h8sKd_6s4c_2dAc_6c9s_KsKc() {
    assertEquals(
      "6s4c 6c9s 2dAc KsKc",
      Solver.process("texas-holdem 5h8c8h8sKd 6s4c 2dAc 6c9s KsKc"));
  }

  @Test
  public void test_texas_holdem_7132_4h7cAcKhQd_2h6c_7hKc_8d3c() {
    assertEquals(
      "2h6c 8d3c 7hKc",
      Solver.process("texas-holdem 4h7cAcKhQd 2h6c 7hKc 8d3c"));
  }

  @Test
  public void test_texas_holdem_7133_5h7c7sAdAh_9c8c_7dJs_Td4h_JdQs() {
    assertEquals(
      "9c8c Td4h JdQs 7dJs",
      Solver.process("texas-holdem 5h7c7sAdAh 9c8c 7dJs Td4h JdQs"));
  }

  @Test
  public void test_texas_holdem_7134_2h7hAcQsTh_Ad6s_6hTd_6d9d_7d9h_4s5h_5s2s_Qc3s() {
    assertEquals(
      "4s5h 6d9d 5s2s 7d9h 6hTd Qc3s Ad6s",
      Solver.process("texas-holdem 2h7hAcQsTh Ad6s 6hTd 6d9d 7d9h 4s5h 5s2s Qc3s"));
  }

  @Test
  public void test_texas_holdem_7135_8c9dAcKcKs_ThJs_Ad5s_3h4c_8d2s_Qh4d_5d3d_As6c() {
    assertEquals(
      "3h4c=5d3d ThJs Qh4d 8d2s Ad5s=As6c",
      Solver.process("texas-holdem 8c9dAcKcKs ThJs Ad5s 3h4c 8d2s Qh4d 5d3d As6c"));
  }

  @Test
  public void test_texas_holdem_7136_3d6d7sJdTd_6c3c_9c4h_Ad2h_7d8s_JcAc_8hTh_AhQc() {
    assertEquals(
      "9c4h AhQc 8hTh JcAc 6c3c 7d8s Ad2h",
      Solver.process("texas-holdem 3d6d7sJdTd 6c3c 9c4h Ad2h 7d8s JcAc 8hTh AhQc"));
  }

  @Test
  public void test_texas_holdem_7137_2s8cAdKcQd_9h9c_9d3c_4dKs_2c5c_7s7h_3dQh_7dTs_2d6c_Th9s() {
    assertEquals(
      "9d3c 7dTs Th9s 2c5c=2d6c 7s7h 9h9c 3dQh 4dKs",
      Solver.process("texas-holdem 2s8cAdKcQd 9h9c 9d3c 4dKs 2c5c 7s7h 3dQh 7dTs 2d6c Th9s"));
  }

  @Test
  public void test_texas_holdem_7138_2s3s8h9cQs_4d4c_5dAc_Jc6c_3h5h_6s9s_Ad2c() {
    assertEquals(
      "Jc6c 5dAc Ad2c 3h5h 4d4c 6s9s",
      Solver.process("texas-holdem 2s3s8h9cQs 4d4c 5dAc Jc6c 3h5h 6s9s Ad2c"));
  }

  @Test
  public void test_texas_holdem_7139_4h7d7h8d9c_6cQs_Jh8c() {
    assertEquals(
      "6cQs Jh8c",
      Solver.process("texas-holdem 4h7d7h8d9c 6cQs Jh8c"));
  }

  @Test
  public void test_texas_holdem_7140_2d5d6dJdQs_2h8h_8s9h_Tc9d_Kc6h_5cJc() {
    assertEquals(
      "8s9h 2h8h Kc6h 5cJc Tc9d",
      Solver.process("texas-holdem 2d5d6dJdQs 2h8h 8s9h Tc9d Kc6h 5cJc"));
  }

  @Test
  public void test_texas_holdem_7141_2s4s6s9sJd_TcQc_5cKd_Qd9c_5sTh_Kh7d_9h4c_6h6d_7cAh() {
    assertEquals(
      "TcQc 5cKd Kh7d 7cAh Qd9c 9h4c 6h6d 5sTh",
      Solver.process("texas-holdem 2s4s6s9sJd TcQc 5cKd Qd9c 5sTh Kh7d 9h4c 6h6d 7cAh"));
  }

  @Test
  public void test_texas_holdem_7142_6d8s9sJcKc_KsQc_5s3s_Jd3d_4h3h_9hAs_6hJh_9c8c_Th8d() {
    assertEquals(
      "4h3h=5s3s Th8d 9hAs Jd3d KsQc 9c8c 6hJh",
      Solver.process("texas-holdem 6d8s9sJcKc KsQc 5s3s Jd3d 4h3h 9hAs 6hJh 9c8c Th8d"));
  }

  @Test
  public void test_texas_holdem_7143_4c5s6dAhJh_Jd2s_Qs2h_ThQd_AsKs_2d7s_Ac2c_3s4h_KhTd_5c5d() {
    assertEquals(
      "2d7s Qs2h ThQd KhTd 3s4h Jd2s Ac2c AsKs 5c5d",
      Solver.process("texas-holdem 4c5s6dAhJh Jd2s Qs2h ThQd AsKs 2d7s Ac2c 3s4h KhTd 5c5d"));
  }

  @Test
  public void test_texas_holdem_7144_2s5d9sQsTh_7cAc_Kd2d_7s7d() {
    assertEquals(
      "7cAc Kd2d 7s7d",
      Solver.process("texas-holdem 2s5d9sQsTh 7cAc Kd2d 7s7d"));
  }

  @Test
  public void test_texas_holdem_7145_2h7d8h9dQc_4d3c_Jd9c_3sKs_8c2d_3h9s_As9h_Jh8s_7h6s_4hTh() {
    assertEquals(
      "4d3c 4hTh 3sKs 7h6s Jh8s 3h9s Jd9c As9h 8c2d",
      Solver.process("texas-holdem 2h7d8h9dQc 4d3c Jd9c 3sKs 8c2d 3h9s As9h Jh8s 7h6s 4hTh"));
  }

  @Test
  public void test_texas_holdem_7146_4h8hAsJcTd_5d6d_7d5s() {
    assertEquals(
      "5d6d 7d5s",
      Solver.process("texas-holdem 4h8hAsJcTd 5d6d 7d5s"));
  }

  @Test
  public void test_texas_holdem_7147_4c6hAdKhTs_As8s_9c2c_5hQd_8h9d_Ah4s_5c6d_9s8c() {
    assertEquals(
      "9c2c 8h9d=9s8c 5hQd 5c6d As8s Ah4s",
      Solver.process("texas-holdem 4c6hAdKhTs As8s 9c2c 5hQd 8h9d Ah4s 5c6d 9s8c"));
  }

  @Test
  public void test_texas_holdem_7148_2d5h7cKsQc_9d9h_QdQh_3c7s_ThAd_3s6s_8s3h() {
    assertEquals(
      "3s6s 8s3h ThAd 3c7s 9d9h QdQh",
      Solver.process("texas-holdem 2d5h7cKsQc 9d9h QdQh 3c7s ThAd 3s6s 8s3h"));
  }

  @Test
  public void test_texas_holdem_7149_2c2d9cKdTd_5dKs_9sQd_3c5c_8s6h_4hQs_Jd8h() {
    assertEquals(
      "3c5c=8s6h Jd8h 4hQs 9sQd 5dKs",
      Solver.process("texas-holdem 2c2d9cKdTd 5dKs 9sQd 3c5c 8s6h 4hQs Jd8h"));
  }

  @Test
  public void test_texas_holdem_7150_4s6s7d8dAc_Ad3c_6d3h_3dJh_Ks5d() {
    assertEquals(
      "3dJh 6d3h Ad3c Ks5d",
      Solver.process("texas-holdem 4s6s7d8dAc Ad3c 6d3h 3dJh Ks5d"));
  }

  @Test
  public void test_texas_holdem_7151_2d3d3h7c8h_3c6d_2s7h_7d6s_7sKd_9sKc() {
    assertEquals(
      "9sKc 2s7h=7d6s 7sKd 3c6d",
      Solver.process("texas-holdem 2d3d3h7c8h 3c6d 2s7h 7d6s 7sKd 9sKc"));
  }

  @Test
  public void test_texas_holdem_7152_5c6h8sKcKh_7cKd_5s7h_2h2s_9cQd_8cAd_7s5d() {
    assertEquals(
      "9cQd 2h2s 5s7h=7s5d 8cAd 7cKd",
      Solver.process("texas-holdem 5c6h8sKcKh 7cKd 5s7h 2h2s 9cQd 8cAd 7s5d"));
  }

  @Test
  public void test_texas_holdem_7153_2s7sAdAhQs_5cTd_9hQd_3sKc() {
    assertEquals(
      "5cTd 3sKc 9hQd",
      Solver.process("texas-holdem 2s7sAdAhQs 5cTd 9hQd 3sKc"));
  }

  @Test
  public void test_texas_holdem_7154_5d7sJdKhTh_AdAs_4sTc_Ks9d_7h3s_4h3d_4c5s_5cTs_Ac3h() {
    assertEquals(
      "4h3d Ac3h 4c5s 7h3s 4sTc Ks9d AdAs 5cTs",
      Solver.process("texas-holdem 5d7sJdKhTh AdAs 4sTc Ks9d 7h3s 4h3d 4c5s 5cTs Ac3h"));
  }

  @Test
  public void test_texas_holdem_7155_9hJcJhKsTs_8c7c_Ah7d_7hTc_6c7s_3cQs_Ac5h_2c9c_Kh4c() {
    assertEquals(
      "6c7s Ac5h=Ah7d 2c9c 7hTc Kh4c 8c7c 3cQs",
      Solver.process("texas-holdem 9hJcJhKsTs 8c7c Ah7d 7hTc 6c7s 3cQs Ac5h 2c9c Kh4c"));
  }

  @Test
  public void test_texas_holdem_7156_3c3d6dAdJh_7hQs_Qd8h_Qh7c() {
    assertEquals(
      "7hQs=Qd8h=Qh7c",
      Solver.process("texas-holdem 3c3d6dAdJh 7hQs Qd8h Qh7c"));
  }

  @Test
  public void test_texas_holdem_7157_5c8c9cTcTd_4h6c_7d6d_Qc3c() {
    assertEquals(
      "7d6d 4h6c Qc3c",
      Solver.process("texas-holdem 5c8c9cTcTd 4h6c 7d6d Qc3c"));
  }

  @Test
  public void test_texas_holdem_7158_5d9sAdJhQc_7h3h_JcKd_9c2c_5hQs_3sQd_TdKs_8dTs() {
    assertEquals(
      "7h3h 9c2c JcKd 3sQd 5hQs 8dTs TdKs",
      Solver.process("texas-holdem 5d9sAdJhQc 7h3h JcKd 9c2c 5hQs 3sQd TdKs 8dTs"));
  }

  @Test
  public void test_texas_holdem_7159_2c4h5c7d9c_Ad7s_3sQh_Js8c_JcTh_3c2h_8sAc() {
    assertEquals(
      "Js8c JcTh 3sQh 8sAc 3c2h Ad7s",
      Solver.process("texas-holdem 2c4h5c7d9c Ad7s 3sQh Js8c JcTh 3c2h 8sAc"));
  }

  @Test
  public void test_texas_holdem_7160_7hKhQhTcTs_5hAc_2s9c_7c6s_7d4s_Qd2h_Jd6d_4c8s_4d5c_3s8d() {
    assertEquals(
      "4d5c 3s8d=4c8s 2s9c Jd6d 5hAc 7c6s=7d4s Qd2h",
      Solver.process("texas-holdem 7hKhQhTcTs 5hAc 2s9c 7c6s 7d4s Qd2h Jd6d 4c8s 4d5c 3s8d"));
  }

  @Test
  public void test_texas_holdem_7161_9hAhAsKsTs_8c8s_9c6h_4hJh_4d9d_QdJc_Qs6s_2h6d_Jd5h_2c5s() {
    assertEquals(
      "2c5s=2h6d 4hJh=Jd5h 8c8s 4d9d=9c6h QdJc Qs6s",
      Solver.process("texas-holdem 9hAhAsKsTs 8c8s 9c6h 4hJh 4d9d QdJc Qs6s 2h6d Jd5h 2c5s"));
  }

  @Test
  public void test_texas_holdem_7162_4d5d6cJsTs_Ac7d_KhTh() {
    assertEquals(
      "Ac7d KhTh",
      Solver.process("texas-holdem 4d5d6cJsTs Ac7d KhTh"));
  }

  @Test
  public void test_texas_holdem_7163_3h7h8hAsJs_4s3c_9hKc_6dTc() {
    assertEquals(
      "6dTc 9hKc 4s3c",
      Solver.process("texas-holdem 3h7h8hAsJs 4s3c 9hKc 6dTc"));
  }

  @Test
  public void test_texas_holdem_7164_2d3d4s5cKs_JdKh_Th3c_8s2c_6hKc_3sAs_9hTd_5h5s_5d4d_7cTs() {
    assertEquals(
      "7cTs 9hTd 8s2c Th3c JdKh 5d4d 5h5s 3sAs 6hKc",
      Solver.process("texas-holdem 2d3d4s5cKs JdKh Th3c 8s2c 6hKc 3sAs 9hTd 5h5s 5d4d 7cTs"));
  }

  @Test
  public void test_texas_holdem_7165_3d4d6c8cAs_JsKh_Kd4s_2c6h_AdTc_8h8s_Ks5h_Th9c_AcQs() {
    assertEquals(
      "Th9c Ks5h JsKh Kd4s 2c6h AdTc AcQs 8h8s",
      Solver.process("texas-holdem 3d4d6c8cAs JsKh Kd4s 2c6h AdTc 8h8s Ks5h Th9c AcQs"));
  }

  @Test
  public void test_texas_holdem_7166_3s6d6h9dQd_As9s_Ah8h_7dTs_Ks6s_QsKh_9c2c_4hJs() {
    assertEquals(
      "7dTs 4hJs Ah8h 9c2c As9s QsKh Ks6s",
      Solver.process("texas-holdem 3s6d6h9dQd As9s Ah8h 7dTs Ks6s QsKh 9c2c 4hJs"));
  }

  @Test
  public void test_texas_holdem_7167_2d4s6hKcKh_Qh4h_8h9h_6cJd_Js7d() {
    assertEquals(
      "8h9h Js7d Qh4h 6cJd",
      Solver.process("texas-holdem 2d4s6hKcKh Qh4h 8h9h 6cJd Js7d"));
  }

  @Test
  public void test_texas_holdem_7168_5c5s7s8sJs_8d3h_3d6s_8c5d_6c4c() {
    assertEquals(
      "8d3h 6c4c 3d6s 8c5d",
      Solver.process("texas-holdem 5c5s7s8sJs 8d3h 3d6s 8c5d 6c4c"));
  }

  @Test
  public void test_texas_holdem_7169_3s6s7sQhTh_AhJc_Qd6h_Kh5s_7c8c_9s7d_Ks2c_9c9d() {
    assertEquals(
      "Kh5s=Ks2c AhJc 7c8c 9s7d 9c9d Qd6h",
      Solver.process("texas-holdem 3s6s7sQhTh AhJc Qd6h Kh5s 7c8c 9s7d Ks2c 9c9d"));
  }

  @Test
  public void test_texas_holdem_7170_3c5s7c9cAc_8c9h_2sAd_9d8h_5hJh_3d4h() {
    assertEquals(
      "3d4h 5hJh 9d8h 2sAd 8c9h",
      Solver.process("texas-holdem 3c5s7c9cAc 8c9h 2sAd 9d8h 5hJh 3d4h"));
  }

  @Test
  public void test_texas_holdem_7171_4h6h9hJdTs_5d6c_4d2c_2dAs_8s5c_5s3h_JcKs_7h8d() {
    assertEquals(
      "5s3h 8s5c 2dAs 4d2c 5d6c JcKs 7h8d",
      Solver.process("texas-holdem 4h6h9hJdTs 5d6c 4d2c 2dAs 8s5c 5s3h JcKs 7h8d"));
  }

  @Test
  public void test_texas_holdem_7172_8c9hJdJhQs_9d5c_9s6s_3sAd_4s5s_KcAh_Js3d_7hAs_2d7d() {
    assertEquals(
      "2d7d=4s5s 3sAd=7hAs KcAh 9d5c=9s6s Js3d",
      Solver.process("texas-holdem 8c9hJdJhQs 9d5c 9s6s 3sAd 4s5s KcAh Js3d 7hAs 2d7d"));
  }

  @Test
  public void test_texas_holdem_7173_5h9hKdQcTd_7s3d_Ts6d_QsQh_Qd2s_4s6s_Ks6h_3cTc_6c3h_2h8s() {
    assertEquals(
      "4s6s=6c3h 7s3d 2h8s 3cTc=Ts6d Qd2s Ks6h QsQh",
      Solver.process("texas-holdem 5h9hKdQcTd 7s3d Ts6d QsQh Qd2s 4s6s Ks6h 3cTc 6c3h 2h8s"));
  }

  @Test
  public void test_texas_holdem_7174_4s5d6dAsQd_7dJc_Th5c_Tc3c_6h2c() {
    assertEquals(
      "Tc3c 7dJc Th5c 6h2c",
      Solver.process("texas-holdem 4s5d6dAsQd 7dJc Th5c Tc3c 6h2c"));
  }

  @Test
  public void test_texas_holdem_7175_4d4s5d5sJh_8hTc_4h6c_Qd6s_TsTh() {
    assertEquals(
      "8hTc Qd6s TsTh 4h6c",
      Solver.process("texas-holdem 4d4s5d5sJh 8hTc 4h6c Qd6s TsTh"));
  }

  @Test
  public void test_texas_holdem_7176_2c3d5s8sJc_Kd4s_Js9s_8d6d_Qc7d_6h4d_8c4c_Tc7c() {
    assertEquals(
      "Tc7c Qc7d Kd4s 8c4c 8d6d Js9s 6h4d",
      Solver.process("texas-holdem 2c3d5s8sJc Kd4s Js9s 8d6d Qc7d 6h4d 8c4c Tc7c"));
  }

  @Test
  public void test_texas_holdem_7177_2d2s7dKhTc_Ad9d_JsJh_7sJc_3h5s_4d4s_QhAs_KcKd_3d5h_3c8c() {
    assertEquals(
      "3d5h=3h5s 3c8c Ad9d QhAs 4d4s 7sJc JsJh KcKd",
      Solver.process("texas-holdem 2d2s7dKhTc Ad9d JsJh 7sJc 3h5s 4d4s QhAs KcKd 3d5h 3c8c"));
  }

  @Test
  public void test_texas_holdem_7178_3d4dAdKdQs_AhJc_AsQh_Ac7d_Qc2c_6d7h() {
    assertEquals(
      "Qc2c AhJc AsQh 6d7h Ac7d",
      Solver.process("texas-holdem 3d4dAdKdQs AhJc AsQh Ac7d Qc2c 6d7h"));
  }

  @Test
  public void test_texas_holdem_7179_3c4h6c8dTs_6h6s_5cQc_Kd7h_5h7c_Qd5s() {
    assertEquals(
      "5cQc=Qd5s Kd7h 6h6s 5h7c",
      Solver.process("texas-holdem 3c4h6c8dTs 6h6s 5cQc Kd7h 5h7c Qd5s"));
  }

  @Test
  public void test_texas_holdem_7180_2c4s5h8dKc_JcTc_7c6s_8hQc() {
    assertEquals(
      "JcTc 8hQc 7c6s",
      Solver.process("texas-holdem 2c4s5h8dKc JcTc 7c6s 8hQc"));
  }

  @Test
  public void test_texas_holdem_7181_2h5sJhKdQc_2c3h_2dQd_AhJs_Ad5d_8d7c_9d3s_3dKs_6dKh_TsAc() {
    assertEquals(
      "8d7c 9d3s 2c3h Ad5d AhJs 3dKs 6dKh 2dQd TsAc",
      Solver.process("texas-holdem 2h5sJhKdQc 2c3h 2dQd AhJs Ad5d 8d7c 9d3s 3dKs 6dKh TsAc"));
  }

  @Test
  public void test_texas_holdem_7182_2h4s6h7dKd_QsKh_5d3h_Th2d_JsQd() {
    assertEquals(
      "JsQd Th2d QsKh 5d3h",
      Solver.process("texas-holdem 2h4s6h7dKd QsKh 5d3h Th2d JsQd"));
  }

  @Test
  public void test_texas_holdem_7183_5d5h6s9cAh_6h5c_As8h_Qc6d_2hKh_Qd4h_Tc8c_3d9s_KcJc_9d4c() {
    assertEquals(
      "Tc8c Qd4h 2hKh KcJc Qc6d 3d9s=9d4c As8h 6h5c",
      Solver.process("texas-holdem 5d5h6s9cAh 6h5c As8h Qc6d 2hKh Qd4h Tc8c 3d9s KcJc 9d4c"));
  }

  @Test
  public void test_texas_holdem_7184_2h4h6s7sKd_Jc7d_4s9c_Jh8c_6c9s() {
    assertEquals(
      "Jh8c 4s9c 6c9s Jc7d",
      Solver.process("texas-holdem 2h4h6s7sKd Jc7d 4s9c Jh8c 6c9s"));
  }

  @Test
  public void test_texas_holdem_7185_4d4h6s8sKs_Qs6c_2hKc_Jc4s_7s8d_KhTc_9h5h_8c8h_Ac9c_9s5c() {
    assertEquals(
      "9h5h=9s5c Ac9c Qs6c 7s8d 2hKc KhTc Jc4s 8c8h",
      Solver.process("texas-holdem 4d4h6s8sKs Qs6c 2hKc Jc4s 7s8d KhTc 9h5h 8c8h Ac9c 9s5c"));
  }

  @Test
  public void test_texas_holdem_7186_5c5h6hKdQc_Kh4c_4dTs() {
    assertEquals(
      "4dTs Kh4c",
      Solver.process("texas-holdem 5c5h6hKdQc Kh4c 4dTs"));
  }

  @Test
  public void test_texas_holdem_7187_3s7h8c8hJs_5s4h_6h8d_5dAc() {
    assertEquals(
      "5s4h 5dAc 6h8d",
      Solver.process("texas-holdem 3s7h8c8hJs 5s4h 6h8d 5dAc"));
  }

  @Test
  public void test_texas_holdem_7188_5c8c9cJcKc_5d8d_Th7h_7d2c_QcKh_8s9h_Ad5h_Qs3d() {
    assertEquals(
      "5d8d=7d2c=8s9h=Ad5h=Qs3d=Th7h QcKh",
      Solver.process("texas-holdem 5c8c9cJcKc 5d8d Th7h 7d2c QcKh 8s9h Ad5h Qs3d"));
  }

  @Test
  public void test_texas_holdem_7189_3s6dJcJdTh_3cKs_8s8h_TdAs_4h6s_5c9d_5h9c() {
    assertEquals(
      "5c9d=5h9c 3cKs 4h6s 8s8h TdAs",
      Solver.process("texas-holdem 3s6dJcJdTh 3cKs 8s8h TdAs 4h6s 5c9d 5h9c"));
  }

  @Test
  public void test_texas_holdem_7190_2hJsQcTcTd_8dJh_7dKd_7hKs_6h2s_9h9d_6s8c_7sTs_Qd7c() {
    assertEquals(
      "6s8c 7dKd=7hKs 6h2s 9h9d 8dJh Qd7c 7sTs",
      Solver.process("texas-holdem 2hJsQcTcTd 8dJh 7dKd 7hKs 6h2s 9h9d 6s8c 7sTs Qd7c"));
  }

  @Test
  public void test_texas_holdem_7191_3h4s5c5sAs_4hQc_TsKd_9sJc() {
    assertEquals(
      "9sJc TsKd 4hQc",
      Solver.process("texas-holdem 3h4s5c5sAs 4hQc TsKd 9sJc"));
  }

  @Test
  public void test_texas_holdem_7192_6h7s8cAdAh_9sJs_AsKs_4s2d_5h3s_Ac3h_Th6s_5sKc() {
    assertEquals(
      "4s2d=5h3s 9sJs 5sKc Th6s Ac3h AsKs",
      Solver.process("texas-holdem 6h7s8cAdAh 9sJs AsKs 4s2d 5h3s Ac3h Th6s 5sKc"));
  }

  @Test
  public void test_texas_holdem_7193_4h5h7c7dQd_Ts6h_Th3h_5sAc() {
    assertEquals(
      "Th3h Ts6h 5sAc",
      Solver.process("texas-holdem 4h5h7c7dQd Ts6h Th3h 5sAc"));
  }

  @Test
  public void test_texas_holdem_7194_6s9hKsQsTd_8dKc_Jd7c() {
    assertEquals(
      "8dKc Jd7c",
      Solver.process("texas-holdem 6s9hKsQsTd 8dKc Jd7c"));
  }

  @Test
  public void test_texas_holdem_7195_2d4h5d5sTs_AcAd_6hQs_Qd9s() {
    assertEquals(
      "6hQs Qd9s AcAd",
      Solver.process("texas-holdem 2d4h5d5sTs AcAd 6hQs Qd9s"));
  }

  @Test
  public void test_texas_holdem_7196_3c8h9cAhKc_2dKd_TsQd_4d6h_Js7s_2sQs_9dKs_9h5h() {
    assertEquals(
      "4d6h Js7s 2sQs TsQd 9h5h 2dKd 9dKs",
      Solver.process("texas-holdem 3c8h9cAhKc 2dKd TsQd 4d6h Js7s 2sQs 9dKs 9h5h"));
  }

  @Test
  public void test_texas_holdem_7197_3s4s5d9cJh_6c7c_9d2c_3hQc_Ah2s_4cJd() {
    assertEquals(
      "3hQc 9d2c 4cJd Ah2s 6c7c",
      Solver.process("texas-holdem 3s4s5d9cJh 6c7c 9d2c 3hQc Ah2s 4cJd"));
  }

  @Test
  public void test_texas_holdem_7198_3d7dAcKcQc_6h6d_8d3s_2s9s_3cQd_5sQh() {
    assertEquals(
      "2s9s 8d3s 6h6d 5sQh 3cQd",
      Solver.process("texas-holdem 3d7dAcKcQc 6h6d 8d3s 2s9s 3cQd 5sQh"));
  }

  @Test
  public void test_texas_holdem_7199_8dAcJdJsKh_Qh6d_TsTc_6s5s_7c2c_9d4h_3dQs_8s7h_Ah8h_3c9c() {
    assertEquals(
      "6s5s=7c2c 3c9c=9d4h 3dQs=Qh6d 8s7h TsTc Ah8h",
      Solver.process("texas-holdem 8dAcJdJsKh Qh6d TsTc 6s5s 7c2c 9d4h 3dQs 8s7h Ah8h 3c9c"));
  }

  @Test
  public void test_texas_holdem_7200_2c2s9sJcTd_9d8d_KcKh_7c3s_6dJs_8cQd_TsJd_9h6h_5hAd() {
    assertEquals(
      "7c3s 5hAd 9d8d=9h6h 6dJs TsJd KcKh 8cQd",
      Solver.process("texas-holdem 2c2s9sJcTd 9d8d KcKh 7c3s 6dJs 8cQd TsJd 9h6h 5hAd"));
  }

  @Test
  public void test_texas_holdem_7201_2c5c5hQhQs_ThAh_Kc6s_3sAs_9h6h_Tc8s_9d4h_3h7c() {
    assertEquals(
      "3h7c 9d4h=9h6h Tc8s Kc6s 3sAs=ThAh",
      Solver.process("texas-holdem 2c5c5hQhQs ThAh Kc6s 3sAs 9h6h Tc8s 9d4h 3h7c"));
  }

  @Test
  public void test_texas_holdem_7202_2s4h7d8hTs_5d8c_QhKc_5sAc() {
    assertEquals(
      "QhKc 5sAc 5d8c",
      Solver.process("texas-holdem 2s4h7d8hTs 5d8c QhKc 5sAc"));
  }

  @Test
  public void test_texas_holdem_7203_4c9d9sKdTs_8d6h_2c6c_Ac6d_7c7s_As9c_2s7d() {
    assertEquals(
      "2c6c 2s7d 8d6h Ac6d 7c7s As9c",
      Solver.process("texas-holdem 4c9d9sKdTs 8d6h 2c6c Ac6d 7c7s As9c 2s7d"));
  }

  @Test
  public void test_texas_holdem_7204_6dAsJdQcQs_7cAh_3cKh_8sAd_5s4s_2c6h_5dQd_8cJh_5c2d() {
    assertEquals(
      "5c2d=5s4s 3cKh 2c6h 8cJh 7cAh=8sAd 5dQd",
      Solver.process("texas-holdem 6dAsJdQcQs 7cAh 3cKh 8sAd 5s4s 2c6h 5dQd 8cJh 5c2d"));
  }

  @Test
  public void test_texas_holdem_7205_2d5s6sAcKs_6h3d_5cJs_4sAd_3s8s() {
    assertEquals(
      "5cJs 6h3d 4sAd 3s8s",
      Solver.process("texas-holdem 2d5s6sAcKs 6h3d 5cJs 4sAd 3s8s"));
  }

  @Test
  public void test_texas_holdem_7206_2s3c3dJdTd_3sQc_6sQd_Jh2d_Ts9s() {
    assertEquals(
      "6sQd Ts9s Jh2d 3sQc",
      Solver.process("texas-holdem 2s3c3dJdTd 3sQc 6sQd Jh2d Ts9s"));
  }

  @Test
  public void test_texas_holdem_7207_3s4d6cKsTs_2d8s_TdTh_8dJc() {
    assertEquals(
      "2d8s 8dJc TdTh",
      Solver.process("texas-holdem 3s4d6cKsTs 2d8s TdTh 8dJc"));
  }

  @Test
  public void test_texas_holdem_7208_5d8c8dAdQc_Th7d_Qd2s_6d3c_AhTd_6hKc() {
    assertEquals(
      "6d3c Th7d 6hKc Qd2s AhTd",
      Solver.process("texas-holdem 5d8c8dAdQc Th7d Qd2s 6d3c AhTd 6hKc"));
  }

  @Test
  public void test_texas_holdem_7209_3s4hAcKhQd_3c9s_4cTh_2c5h_QsKd_6s6d_6c7s_2s3h_JcTd_AsKs() {
    assertEquals(
      "6c7s 2s3h=3c9s 4cTh 6s6d QsKd AsKs 2c5h JcTd",
      Solver.process("texas-holdem 3s4hAcKhQd 3c9s 4cTh 2c5h QsKd 6s6d 6c7s 2s3h JcTd AsKs"));
  }

  @Test
  public void test_texas_holdem_7210_2s4c6h8cKh_7hAs_3h3c_TdAh_Tc9s_Ts9c_9dQh_Qd2c_JsJh() {
    assertEquals(
      "Tc9s=Ts9c 9dQh 7hAs TdAh Qd2c 3h3c JsJh",
      Solver.process("texas-holdem 2s4c6h8cKh 7hAs 3h3c TdAh Tc9s Ts9c 9dQh Qd2c JsJh"));
  }

  @Test
  public void test_texas_holdem_7211_5s8c9sJhTs_7dTc_5d3h_3d9h_Qs3c() {
    assertEquals(
      "5d3h 3d9h 7dTc Qs3c",
      Solver.process("texas-holdem 5s8c9sJhTs 7dTc 5d3h 3d9h Qs3c"));
  }

  @Test
  public void test_texas_holdem_7212_4d6c6d7sKc_4cJd_6h8h_AsQd_Qh2c_2h8s_5hKs_Ad4h_QcAh() {
    assertEquals(
      "2h8s Qh2c AsQd=QcAh 4cJd Ad4h 5hKs 6h8h",
      Solver.process("texas-holdem 4d6c6d7sKc 4cJd 6h8h AsQd Qh2c 2h8s 5hKs Ad4h QcAh"));
  }

  @Test
  public void test_texas_holdem_7213_2s8hJdKhQs_QcTd_6c3h_5s6s_QhKs() {
    assertEquals(
      "5s6s=6c3h QcTd QhKs",
      Solver.process("texas-holdem 2s8hJdKhQs QcTd 6c3h 5s6s QhKs"));
  }

  @Test
  public void test_texas_holdem_7214_2d5dKcQcQs_5h6d_KdAc_4s6c_8d7h_Jc5c() {
    assertEquals(
      "4s6c 8d7h 5h6d=Jc5c KdAc",
      Solver.process("texas-holdem 2d5dKcQcQs 5h6d KdAc 4s6c 8d7h Jc5c"));
  }

  @Test
  public void test_texas_holdem_7215_5h6dAdAhKh_7s8s_Qd8c_Kd3d_6hQh_5d4s() {
    assertEquals(
      "7s8s Qd8c 5d4s Kd3d 6hQh",
      Solver.process("texas-holdem 5h6dAdAhKh 7s8s Qd8c Kd3d 6hQh 5d4s"));
  }

  @Test
  public void test_texas_holdem_7216_3d5h7dAhQh_KsTs_9c6s_As6d_Jh7s_8sQd_Jc2c() {
    assertEquals(
      "9c6s Jc2c KsTs Jh7s 8sQd As6d",
      Solver.process("texas-holdem 3d5h7dAhQh KsTs 9c6s As6d Jh7s 8sQd Jc2c"));
  }

  @Test
  public void test_texas_holdem_7217_3h8c8d8hKs_5d7s_6hKc_5cJh() {
    assertEquals(
      "5d7s 5cJh 6hKc",
      Solver.process("texas-holdem 3h8c8d8hKs 5d7s 6hKc 5cJh"));
  }

  @Test
  public void test_texas_holdem_7218_2c4s7hJsKd_QcTd_Ks4c() {
    assertEquals(
      "QcTd Ks4c",
      Solver.process("texas-holdem 2c4s7hJsKd QcTd Ks4c"));
  }

  @Test
  public void test_texas_holdem_7219_6c6h8c8sJh_Ac3h_Th4s_AsJc_4c5d_JdQs() {
    assertEquals(
      "4c5d=Th4s Ac3h JdQs AsJc",
      Solver.process("texas-holdem 6c6h8c8sJh Ac3h Th4s AsJc 4c5d JdQs"));
  }

  @Test
  public void test_texas_holdem_7220_5h7dAsKdKs_6cAh_Js7s_2c8d_8c4c_9dAd_7hTc_KhJc_9hJd() {
    assertEquals(
      "2c8d=8c4c 9hJd 7hTc=Js7s 6cAh 9dAd KhJc",
      Solver.process("texas-holdem 5h7dAsKdKs 6cAh Js7s 2c8d 8c4c 9dAd 7hTc KhJc 9hJd"));
  }

  @Test
  public void test_texas_holdem_7221_4s5h6s8cQd_8h9c_8s6c_7d2c_Td9h_5cJd_7cTc_Qc7h_Js3h() {
    assertEquals(
      "Td9h Js3h 5cJd 8h9c 8s6c 7cTc=7d2c=Qc7h",
      Solver.process("texas-holdem 4s5h6s8cQd 8h9c 8s6c 7d2c Td9h 5cJd 7cTc Qc7h Js3h"));
  }

  @Test
  public void test_texas_holdem_7222_4d6h9hJcJs_AhJd_6c3s() {
    assertEquals(
      "6c3s AhJd",
      Solver.process("texas-holdem 4d6h9hJcJs AhJd 6c3s"));
  }

  @Test
  public void test_texas_holdem_7223_2h4s7sKdQh_AcQd_Jc2d_7hAd_As8d_6s4d_9cQs_5c3c_7dTd_2s7c() {
    assertEquals(
      "5c3c As8d Jc2d 6s4d 7dTd 7hAd 9cQs AcQd 2s7c",
      Solver.process("texas-holdem 2h4s7sKdQh AcQd Jc2d 7hAd As8d 6s4d 9cQs 5c3c 7dTd 2s7c"));
  }

  @Test
  public void test_texas_holdem_7224_2c9dJsKcTh_8h8d_KdJc_7hKs_4h2h_6c4d_9s5c_3s6h_TdQc_3d9c() {
    assertEquals(
      "3s6h=6c4d 4h2h 8h8d 3d9c=9s5c 7hKs KdJc TdQc",
      Solver.process("texas-holdem 2c9dJsKcTh 8h8d KdJc 7hKs 4h2h 6c4d 9s5c 3s6h TdQc 3d9c"));
  }

  @Test
  public void test_texas_holdem_7225_3d5c9hQsTd_Jd5s_2dAd_4s4h_8h5d_4d2s() {
    assertEquals(
      "4d2s 2dAd 4s4h 8h5d Jd5s",
      Solver.process("texas-holdem 3d5c9hQsTd Jd5s 2dAd 4s4h 8h5d 4d2s"));
  }

  @Test
  public void test_texas_holdem_7226_5s8sJcJdKs_Kd2s_9c6d_4cTs_3d6c() {
    assertEquals(
      "3d6c 9c6d 4cTs Kd2s",
      Solver.process("texas-holdem 5s8sJcJdKs Kd2s 9c6d 4cTs 3d6c"));
  }

  @Test
  public void test_texas_holdem_7227_4h6sJhKcTs_4c9s_JdAh_Kd8d() {
    assertEquals(
      "4c9s JdAh Kd8d",
      Solver.process("texas-holdem 4h6sJhKcTs 4c9s JdAh Kd8d"));
  }

  @Test
  public void test_texas_holdem_7228_3h3s6c6d7s_3cQc_AcTs_Jd4c() {
    assertEquals(
      "Jd4c AcTs 3cQc",
      Solver.process("texas-holdem 3h3s6c6d7s 3cQc AcTs Jd4c"));
  }

  @Test
  public void test_texas_holdem_7229_3h5dAhKcQh_JdQc_2s6d_4h7c_2c8s_4sKs_9dAc_JcKd_3c8d_3d3s() {
    assertEquals(
      "2s6d 4h7c 2c8s 3c8d JdQc 4sKs JcKd 9dAc 3d3s",
      Solver.process("texas-holdem 3h5dAhKcQh JdQc 2s6d 4h7c 2c8s 4sKs 9dAc JcKd 3c8d 3d3s"));
  }

  @Test
  public void test_texas_holdem_7230_3h5c6d9sQd_Jd8h_KhQc_5h5s_2hKs_9hJc_8dTs_5dTh() {
    assertEquals(
      "8dTs Jd8h 2hKs 5dTh 9hJc KhQc 5h5s",
      Solver.process("texas-holdem 3h5c6d9sQd Jd8h KhQc 5h5s 2hKs 9hJc 8dTs 5dTh"));
  }

  @Test
  public void test_texas_holdem_7231_4h8hJcKdKh_9s2h_4cJs() {
    assertEquals(
      "9s2h 4cJs",
      Solver.process("texas-holdem 4h8hJcKdKh 9s2h 4cJs"));
  }

  @Test
  public void test_texas_holdem_7232_2h5s7sJdKd_As9s_Tc5d_6hTh_5hQh_8c3s_9hQs_7c6c() {
    assertEquals(
      "8c3s 6hTh 9hQs As9s Tc5d 5hQh 7c6c",
      Solver.process("texas-holdem 2h5s7sJdKd As9s Tc5d 6hTh 5hQh 8c3s 9hQs 7c6c"));
  }

  @Test
  public void test_texas_holdem_7233_6c9dAhAsJd_Kh7h_7s8h_Td9h_5c5d_8s4c_Jc4h() {
    assertEquals(
      "7s8h=8s4c Kh7h 5c5d Td9h Jc4h",
      Solver.process("texas-holdem 6c9dAhAsJd Kh7h 7s8h Td9h 5c5d 8s4c Jc4h"));
  }

  @Test
  public void test_texas_holdem_7234_2c7c8c9sAd_Ah2h_5dKs() {
    assertEquals(
      "5dKs Ah2h",
      Solver.process("texas-holdem 2c7c8c9sAd Ah2h 5dKs"));
  }

  @Test
  public void test_texas_holdem_7235_2c2h9hKhTh_Jc2d_5hQd_Qh6d_8d3c_KcJs_4sQs_Td4h_3s5d_8h3d() {
    assertEquals(
      "3s5d=8d3c 4sQs KcJs Jc2d Td4h 5hQd 8h3d Qh6d",
      Solver.process("texas-holdem 2c2h9hKhTh Jc2d 5hQd Qh6d 8d3c KcJs 4sQs Td4h 3s5d 8h3d"));
  }

  @Test
  public void test_texas_holdem_7236_3c3d4s7hJs_Qc9h_4c8c_Jd7c_5h2s() {
    assertEquals(
      "5h2s Qc9h 4c8c Jd7c",
      Solver.process("texas-holdem 3c3d4s7hJs Qc9h 4c8c Jd7c 5h2s"));
  }

  @Test
  public void test_texas_holdem_7237_4d8dAsKcTc_Kd9h_3s2h_Qc7d() {
    assertEquals(
      "3s2h Qc7d Kd9h",
      Solver.process("texas-holdem 4d8dAsKcTc Kd9h 3s2h Qc7d"));
  }

  @Test
  public void test_texas_holdem_7238_4c6h8sQdQh_As5c_8dQc() {
    assertEquals(
      "As5c 8dQc",
      Solver.process("texas-holdem 4c6h8sQdQh As5c 8dQc"));
  }

  @Test
  public void test_texas_holdem_7239_3c4s7d7hTs_5d8h_2c9h_6c6d() {
    assertEquals(
      "5d8h 2c9h 6c6d",
      Solver.process("texas-holdem 3c4s7d7hTs 5d8h 2c9h 6c6d"));
  }

  @Test
  public void test_texas_holdem_7240_2c8cJsKdQh_Ad4h_AcAh_Ts6s() {
    assertEquals(
      "Ts6s Ad4h AcAh",
      Solver.process("texas-holdem 2c8cJsKdQh Ad4h AcAh Ts6s"));
  }

  @Test
  public void test_texas_holdem_7241_2s3d5c6dKc_3s2h_2c6h_9cAd_Td6s_KsAc() {
    assertEquals(
      "9cAd Td6s KsAc 3s2h 2c6h",
      Solver.process("texas-holdem 2s3d5c6dKc 3s2h 2c6h 9cAd Td6s KsAc"));
  }

  @Test
  public void test_texas_holdem_7242_3s4h6c9d9s_Td3d_QsAs_Jh2s_Ac2h_5dQc_9hQd_2c6d() {
    assertEquals(
      "Jh2s 5dQc Ac2h QsAs Td3d 2c6d 9hQd",
      Solver.process("texas-holdem 3s4h6c9d9s Td3d QsAs Jh2s Ac2h 5dQc 9hQd 2c6d"));
  }

  @Test
  public void test_texas_holdem_7243_4d8c8d9cJd_Tc6c_Qc2h_5hQs_Th2d_5d2s_4cAs_7s9s_5cKs() {
    assertEquals(
      "5d2s Tc6c=Th2d 5hQs=Qc2h 5cKs 4cAs 7s9s",
      Solver.process("texas-holdem 4d8c8d9cJd Tc6c Qc2h 5hQs Th2d 5d2s 4cAs 7s9s 5cKs"));
  }

  @Test
  public void test_texas_holdem_7244_2h8d8hQsTs_JcJs_AdJd_3hQc_4s6h_4h8s_5hAs_KdQd_2d3c() {
    assertEquals(
      "4s6h 5hAs AdJd 2d3c JcJs 3hQc KdQd 4h8s",
      Solver.process("texas-holdem 2h8d8hQsTs JcJs AdJd 3hQc 4s6h 4h8s 5hAs KdQd 2d3c"));
  }

  @Test
  public void test_texas_holdem_7245_3s4c7cAhJs_4dQc_8h5c_9dAs_QsKd_QdTc_Th8c_8s5d() {
    assertEquals(
      "8h5c=8s5d Th8c QdTc QsKd 4dQc 9dAs",
      Solver.process("texas-holdem 3s4c7cAhJs 4dQc 8h5c 9dAs QsKd QdTc Th8c 8s5d"));
  }

  @Test
  public void test_texas_holdem_7246_2c7s9dKcQs_Ts5h_Td5d_2hQc_Jd3s_Kd9h() {
    assertEquals(
      "Td5d=Ts5h Jd3s 2hQc Kd9h",
      Solver.process("texas-holdem 2c7s9dKcQs Ts5h Td5d 2hQc Jd3s Kd9h"));
  }

  @Test
  public void test_texas_holdem_7247_2s6c7h8cJc_ThJd_TsAh_2dJs_QcTd_5d5s_Qh4d_8dAc_5h8s_3hQd() {
    assertEquals(
      "3hQd=Qh4d QcTd TsAh 5d5s 5h8s 8dAc ThJd 2dJs",
      Solver.process("texas-holdem 2s6c7h8cJc ThJd TsAh 2dJs QcTd 5d5s Qh4d 8dAc 5h8s 3hQd"));
  }

  @Test
  public void test_texas_holdem_7248_7dJdKcKhQc_3s3d_5sKs_7h2s_AdQd_9h2d_Js9d_5d8s_4d2h() {
    assertEquals(
      "4d2h 5d8s 9h2d 3s3d 7h2s Js9d AdQd 5sKs",
      Solver.process("texas-holdem 7dJdKcKhQc 3s3d 5sKs 7h2s AdQd 9h2d Js9d 5d8s 4d2h"));
  }

  @Test
  public void test_texas_holdem_7249_8hAsKsQsTh_4c3h_6dQd_7h3c_9cTs_7s8c_3sAd_9s4s() {
    assertEquals(
      "4c3h=7h3c 7s8c 9cTs 6dQd 3sAd 9s4s",
      Solver.process("texas-holdem 8hAsKsQsTh 4c3h 6dQd 7h3c 9cTs 7s8c 3sAd 9s4s"));
  }

}
