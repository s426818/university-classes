
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TexasHoldemSolver16HiddenTest {


  @Test
  public void test_texas_holdem_4000_3c5d7cAhTh_Td7s_Qs2h_8s2c_5sKs_8cJh_6cTc_4d7h_7d5h() {
    assertEquals(
      "8s2c 8cJh Qs2h 5sKs 4d7h 6cTc 7d5h Td7s",
      Solver.process("texas-holdem 3c5d7cAhTh Td7s Qs2h 8s2c 5sKs 8cJh 6cTc 4d7h 7d5h"));
  }

  @Test
  public void test_texas_holdem_4001_2c5h8dJdKs_Jh5s_Ah8h_3hJc_Qh2h_Ad5c_KhQs() {
    assertEquals(
      "Qh2h Ad5c Ah8h 3hJc KhQs Jh5s",
      Solver.process("texas-holdem 2c5h8dJdKs Jh5s Ah8h 3hJc Qh2h Ad5c KhQs"));
  }

  @Test
  public void test_texas_holdem_4002_2s3h4hJdTc_4d6d_KsAs_4s6h_9dAc_3dTh() {
    assertEquals(
      "9dAc KsAs 4d6d=4s6h 3dTh",
      Solver.process("texas-holdem 2s3h4hJdTc 4d6d KsAs 4s6h 9dAc 3dTh"));
  }

  @Test
  public void test_texas_holdem_4003_3s9c9hAdTc_Kh3c_3dAh_2h4c_6h8h_Ks7s() {
    assertEquals(
      "2h4c 6h8h Ks7s Kh3c 3dAh",
      Solver.process("texas-holdem 3s9c9hAdTc Kh3c 3dAh 2h4c 6h8h Ks7s"));
  }

  @Test
  public void test_texas_holdem_4004_5c7s8hJdJh_4h6h_Tc7h_9s2s_8s3s_JsAd_6dAh() {
    assertEquals(
      "9s2s 6dAh Tc7h 8s3s JsAd 4h6h",
      Solver.process("texas-holdem 5c7s8hJdJh 4h6h Tc7h 9s2s 8s3s JsAd 6dAh"));
  }

  @Test
  public void test_texas_holdem_4005_5c6s8cQdQh_Qs7h_Ac3c_Ad7s() {
    assertEquals(
      "Ac3c Ad7s Qs7h",
      Solver.process("texas-holdem 5c6s8cQdQh Qs7h Ac3c Ad7s"));
  }

  @Test
  public void test_texas_holdem_4006_4c5c7hKsTd_3h4h_9d6s() {
    assertEquals(
      "9d6s 3h4h",
      Solver.process("texas-holdem 4c5c7hKsTd 3h4h 9d6s"));
  }

  @Test
  public void test_texas_holdem_4007_9h9sKcKdTd_QsQh_Jc4s_5c8h_2c4c_Jh6s() {
    assertEquals(
      "2c4c=5c8h Jc4s=Jh6s QsQh",
      Solver.process("texas-holdem 9h9sKcKdTd QsQh Jc4s 5c8h 2c4c Jh6s"));
  }

  @Test
  public void test_texas_holdem_4008_7h9cAhQcQs_7s9d_9s2h_7c2s_Js4s_KsJh() {
    assertEquals(
      "Js4s KsJh 7c2s 7s9d=9s2h",
      Solver.process("texas-holdem 7h9cAhQcQs 7s9d 9s2h 7c2s Js4s KsJh"));
  }

  @Test
  public void test_texas_holdem_4009_2c5s7hAdJd_4d6s_3dJc() {
    assertEquals(
      "4d6s 3dJc",
      Solver.process("texas-holdem 2c5s7hAdJd 4d6s 3dJc"));
  }

  @Test
  public void test_texas_holdem_4010_2s3c6cAsKd_8d8c_Ks8s_TcTs_Qh9d() {
    assertEquals(
      "Qh9d 8d8c TcTs Ks8s",
      Solver.process("texas-holdem 2s3c6cAsKd 8d8c Ks8s TcTs Qh9d"));
  }

  @Test
  public void test_texas_holdem_4011_2s3d5s6d6s_5hJc_9c4d() {
    assertEquals(
      "5hJc 9c4d",
      Solver.process("texas-holdem 2s3d5s6d6s 5hJc 9c4d"));
  }

  @Test
  public void test_texas_holdem_4012_5c6sAhJhKd_Ks6c_TcTd_6d2c_Ad9c_7sKh_TsQc_9h9s_Js4c() {
    assertEquals(
      "6d2c 9h9s TcTd Js4c 7sKh Ad9c Ks6c TsQc",
      Solver.process("texas-holdem 5c6sAhJhKd Ks6c TcTd 6d2c Ad9c 7sKh TsQc 9h9s Js4c"));
  }

  @Test
  public void test_texas_holdem_4013_2h4h7s9dQs_3sKh_8h5d_9sJd_6h8c_5h4s_AhQc_5sTh_8d5c() {
    assertEquals(
      "8d5c=8h5d 6h8c 5sTh 3sKh 5h4s 9sJd AhQc",
      Solver.process("texas-holdem 2h4h7s9dQs 3sKh 8h5d 9sJd 6h8c 5h4s AhQc 5sTh 8d5c"));
  }

  @Test
  public void test_texas_holdem_4014_6cAdAsKcTs_9cJs_Qc4h_Tc7d_3d9d_6sJd_7cKd_Jc9s() {
    assertEquals(
      "3d9d 9cJs=Jc9s Qc4h 6sJd Tc7d 7cKd",
      Solver.process("texas-holdem 6cAdAsKcTs 9cJs Qc4h Tc7d 3d9d 6sJd 7cKd Jc9s"));
  }

  @Test
  public void test_texas_holdem_4015_3s5d7dAhTd_3c4h_9c5c() {
    assertEquals(
      "3c4h 9c5c",
      Solver.process("texas-holdem 3s5d7dAhTd 3c4h 9c5c"));
  }

  @Test
  public void test_texas_holdem_4016_3c6cAcJcQs_As7c_Qd5s_7h9c_6s4d() {
    assertEquals(
      "6s4d Qd5s As7c 7h9c",
      Solver.process("texas-holdem 3c6cAcJcQs As7c Qd5s 7h9c 6s4d"));
  }

  @Test
  public void test_texas_holdem_4017_5c9sQhTcTh_Jc9c_4h8h_4c5h_2c8c_9h6s() {
    assertEquals(
      "2c8c=4h8h 4c5h 9h6s=Jc9c",
      Solver.process("texas-holdem 5c9sQhTcTh Jc9c 4h8h 4c5h 2c8c 9h6s"));
  }

  @Test
  public void test_texas_holdem_4018_2d4c8hQdTc_8sJs_3h7s_AhAd_9cJd_9sQs_4d5s_8dJc() {
    assertEquals(
      "3h7s 4d5s 8dJc=8sJs 9sQs AhAd 9cJd",
      Solver.process("texas-holdem 2d4c8hQdTc 8sJs 3h7s AhAd 9cJd 9sQs 4d5s 8dJc"));
  }

  @Test
  public void test_texas_holdem_4019_4h7d8c9sKh_Jh2d_7hKs_6hKc_6s6d_5h3c_Qs9d() {
    assertEquals(
      "5h3c Jh2d 6s6d Qs9d 6hKc 7hKs",
      Solver.process("texas-holdem 4h7d8c9sKh Jh2d 7hKs 6hKc 6s6d 5h3c Qs9d"));
  }

  @Test
  public void test_texas_holdem_4020_2s6h8s9h9s_7s5d_8h9c_TsAh() {
    assertEquals(
      "TsAh 7s5d 8h9c",
      Solver.process("texas-holdem 2s6h8s9h9s 7s5d 8h9c TsAh"));
  }

  @Test
  public void test_texas_holdem_4021_2hJhKdKsTd_6cTh_6h5h_3c9s_Js9d_4sQs_Ah6d() {
    assertEquals(
      "6h5h 3c9s 4sQs Ah6d 6cTh Js9d",
      Solver.process("texas-holdem 2hJhKdKsTd 6cTh 6h5h 3c9s Js9d 4sQs Ah6d"));
  }

  @Test
  public void test_texas_holdem_4022_6h7cAcJcQd_6dJd_5hQh_9c5c_4s3d() {
    assertEquals(
      "4s3d 5hQh 6dJd 9c5c",
      Solver.process("texas-holdem 6h7cAcJcQd 6dJd 5hQh 9c5c 4s3d"));
  }

  @Test
  public void test_texas_holdem_4023_3h6hAcAhTd_7h8h_JcQh() {
    assertEquals(
      "JcQh 7h8h",
      Solver.process("texas-holdem 3h6hAcAhTd 7h8h JcQh"));
  }

  @Test
  public void test_texas_holdem_4024_2h4d6c6hAd_KsJs_Ac5c_6s7s_9cQh_6dJh_3c3d_7c5d_Kh2c() {
    assertEquals(
      "7c5d 9cQh KsJs Kh2c 3c3d Ac5c 6s7s 6dJh",
      Solver.process("texas-holdem 2h4d6c6hAd KsJs Ac5c 6s7s 9cQh 6dJh 3c3d 7c5d Kh2c"));
  }

  @Test
  public void test_texas_holdem_4025_4s7s8cKcQs_TdJd_9d3c_Js7h_4h6c() {
    assertEquals(
      "9d3c TdJd 4h6c Js7h",
      Solver.process("texas-holdem 4s7s8cKcQs TdJd 9d3c Js7h 4h6c"));
  }

  @Test
  public void test_texas_holdem_4026_2s3c3d6sAc_7hJh_KhJd_Ah2h_4c5h_6d2d_Js4d_3s5s_9c5d() {
    assertEquals(
      "9c5d Js4d 7hJh KhJd 6d2d Ah2h 3s5s 4c5h",
      Solver.process("texas-holdem 2s3c3d6sAc 7hJh KhJd Ah2h 4c5h 6d2d Js4d 3s5s 9c5d"));
  }

  @Test
  public void test_texas_holdem_4027_3h4c7sAhKs_9cAc_JdTs_Jh3c_QhKh() {
    assertEquals(
      "JdTs Jh3c QhKh 9cAc",
      Solver.process("texas-holdem 3h4c7sAhKs 9cAc JdTs Jh3c QhKh"));
  }

  @Test
  public void test_texas_holdem_4028_2d4s9cJhKh_4dQh_7dKd_9hKs_3dKc_6h6c_JsQs_8s6s_3c4c_7s8d() {
    assertEquals(
      "8s6s 7s8d 3c4c 4dQh 6h6c JsQs 3dKc 7dKd 9hKs",
      Solver.process("texas-holdem 2d4s9cJhKh 4dQh 7dKd 9hKs 3dKc 6h6c JsQs 8s6s 3c4c 7s8d"));
  }

  @Test
  public void test_texas_holdem_4029_4c8d9cAsQs_9s6h_6c8s_Jd8c_5c9h_2hTc_KdAc_7cKh_JsKs_6d7d() {
    assertEquals(
      "6d7d 2hTc 7cKh JsKs 6c8s Jd8c 5c9h=9s6h KdAc",
      Solver.process("texas-holdem 4c8d9cAsQs 9s6h 6c8s Jd8c 5c9h 2hTc KdAc 7cKh JsKs 6d7d"));
  }

  @Test
  public void test_texas_holdem_4030_6h7s8sJsKs_Kh3s_9d3d() {
    assertEquals(
      "9d3d Kh3s",
      Solver.process("texas-holdem 6h7s8sJsKs Kh3s 9d3d"));
  }

  @Test
  public void test_texas_holdem_4031_4d5h6sAsTh_JsKd_7c8s_TdJh_2hKh_JcKs_6d3h_AhAd_6h7d_Qc5s() {
    assertEquals(
      "2hKh JcKs=JsKd Qc5s 6d3h 6h7d TdJh AhAd 7c8s",
      Solver.process("texas-holdem 4d5h6sAsTh JsKd 7c8s TdJh 2hKh JcKs 6d3h AhAd 6h7d Qc5s"));
  }

  @Test
  public void test_texas_holdem_4032_6d7s8h9dQs_3s4h_Ad8s_5c7h_4cTd_Tc7c_6sQd_AcQh_Jh6h() {
    assertEquals(
      "3s4h Jh6h Ad8s AcQh 6sQd 5c7h 4cTd=Tc7c",
      Solver.process("texas-holdem 6d7s8h9dQs 3s4h Ad8s 5c7h 4cTd Tc7c 6sQd AcQh Jh6h"));
  }

  @Test
  public void test_texas_holdem_4033_2d3d7s8sQc_8dQd_9hTc_7hJd_Ah6d_Jc2c_6sQh_5sJh_As5c_8h7c() {
    assertEquals(
      "9hTc 5sJh As5c Ah6d Jc2c 7hJd 6sQh 8h7c 8dQd",
      Solver.process("texas-holdem 2d3d7s8sQc 8dQd 9hTc 7hJd Ah6d Jc2c 6sQh 5sJh As5c 8h7c"));
  }

  @Test
  public void test_texas_holdem_4034_2h4d8sAcAs_7s8h_6dKc_6sKh_Qh5c_Ks9h_5h9d() {
    assertEquals(
      "5h9d Qh5c 6dKc=6sKh Ks9h 7s8h",
      Solver.process("texas-holdem 2h4d8sAcAs 7s8h 6dKc 6sKh Qh5c Ks9h 5h9d"));
  }

  @Test
  public void test_texas_holdem_4035_6cAcJdQcTd_7h8s_3hQh_4c6s_8cKs_As5d_Qs7c() {
    assertEquals(
      "7h8s 4c6s 3hQh=Qs7c As5d 8cKs",
      Solver.process("texas-holdem 6cAcJdQcTd 7h8s 3hQh 4c6s 8cKs As5d Qs7c"));
  }

  @Test
  public void test_texas_holdem_4036_2h3s6h7d8d_7s3d_4dQc_2cKc_Th5d_QhTs_6d8h_8s8c_5hJc() {
    assertEquals(
      "Th5d 5hJc 4dQc QhTs 2cKc 7s3d 6d8h 8s8c",
      Solver.process("texas-holdem 2h3s6h7d8d 7s3d 4dQc 2cKc Th5d QhTs 6d8h 8s8c 5hJc"));
  }

  @Test
  public void test_texas_holdem_4037_2c4h5h9sQc_KcQd_JcTs_5c3s_3c4s_6d8d() {
    assertEquals(
      "6d8d JcTs 3c4s 5c3s KcQd",
      Solver.process("texas-holdem 2c4h5h9sQc KcQd JcTs 5c3s 3c4s 6d8d"));
  }

  @Test
  public void test_texas_holdem_4038_2s3c3sKsTd_8sJh_5s5d_KdJd_Qs4h_6d4c_7dJc_5c4s() {
    assertEquals(
      "5c4s 6d4c 7dJc=8sJh Qs4h 5s5d KdJd",
      Solver.process("texas-holdem 2s3c3sKsTd 8sJh 5s5d KdJd Qs4h 6d4c 7dJc 5c4s"));
  }

  @Test
  public void test_texas_holdem_4039_2c4d5c6d7h_AhTd_5h4h_5d2s_Kd9s_Ks6c_KcQc_JcQh_9d3s_9c2d() {
    assertEquals(
      "JcQh Kd9s KcQc AhTd 9c2d Ks6c 5d2s 5h4h 9d3s",
      Solver.process("texas-holdem 2c4d5c6d7h AhTd 5h4h 5d2s Kd9s Ks6c KcQc JcQh 9d3s 9c2d"));
  }

  @Test
  public void test_texas_holdem_4040_9hAdAhJdJh_7c7h_9s3h_Ks6s_Kd3d_9c6c_Ts5d() {
    assertEquals(
      "7c7h=9c6c=9s3h Ts5d Kd3d=Ks6s",
      Solver.process("texas-holdem 9hAdAhJdJh 7c7h 9s3h Ks6s Kd3d 9c6c Ts5d"));
  }

  @Test
  public void test_texas_holdem_4041_5d6h7cJsQc_6d5c_4d4s_JhKd() {
    assertEquals(
      "4d4s JhKd 6d5c",
      Solver.process("texas-holdem 5d6h7cJsQc 6d5c 4d4s JhKd"));
  }

  @Test
  public void test_texas_holdem_4042_4s6h9cKdTs_4dAs_Qc9d_Ac5s_3s8d_KsJs() {
    assertEquals(
      "3s8d Ac5s 4dAs Qc9d KsJs",
      Solver.process("texas-holdem 4s6h9cKdTs 4dAs Qc9d Ac5s 3s8d KsJs"));
  }

  @Test
  public void test_texas_holdem_4043_3d3h4s9cKd_Td3s_Ks9d_8hKc() {
    assertEquals(
      "8hKc Ks9d Td3s",
      Solver.process("texas-holdem 3d3h4s9cKd Td3s Ks9d 8hKc"));
  }

  @Test
  public void test_texas_holdem_4044_6cAhQdTcTd_3cJc_5s4h_KcAs_7cAd_2sTh_JdAc_8s8c_8h6h_2h2c() {
    assertEquals(
      "5s4h 3cJc 2h2c 8h6h 8s8c 7cAd=JdAc KcAs 2sTh",
      Solver.process("texas-holdem 6cAhQdTcTd 3cJc 5s4h KcAs 7cAd 2sTh JdAc 8s8c 8h6h 2h2c"));
  }

  @Test
  public void test_texas_holdem_4045_2d6cAhJsTh_Ts6h_KcTd_6d7h_Qd9h_4cJc_8h2h_3c4s() {
    assertEquals(
      "3c4s Qd9h 8h2h 6d7h KcTd 4cJc Ts6h",
      Solver.process("texas-holdem 2d6cAhJsTh Ts6h KcTd 6d7h Qd9h 4cJc 8h2h 3c4s"));
  }

  @Test
  public void test_texas_holdem_4046_4sAcAdKdTs_Jh8c_7s8d_3d6h_KhKc_3c3h_6sTh_6d7h_9sTc() {
    assertEquals(
      "3d6h 6d7h 7s8d Jh8c 3c3h 6sTh=9sTc KhKc",
      Solver.process("texas-holdem 4sAcAdKdTs Jh8c 7s8d 3d6h KhKc 3c3h 6sTh 6d7h 9sTc"));
  }

  @Test
  public void test_texas_holdem_4047_2d5h8c9hKc_7cAc_6dTh_7s2c_Jd2h_5dKh_3h6c() {
    assertEquals(
      "3h6c 6dTh 7cAc 7s2c Jd2h 5dKh",
      Solver.process("texas-holdem 2d5h8c9hKc 7cAc 6dTh 7s2c Jd2h 5dKh 3h6c"));
  }

  @Test
  public void test_texas_holdem_4048_5h5s6hAdJd_Ts3d_6sTh_Kh2d_AhKc() {
    assertEquals(
      "Ts3d Kh2d 6sTh AhKc",
      Solver.process("texas-holdem 5h5s6hAdJd Ts3d 6sTh Kh2d AhKc"));
  }

  @Test
  public void test_texas_holdem_4049_2s5d7c8cKh_QsKd_AdJc_JdJs_Ac6d_3s8d_9d3h_2d4c_QhQd_4sTh() {
    assertEquals(
      "9d3h 4sTh Ac6d AdJc 2d4c 3s8d JdJs QhQd QsKd",
      Solver.process("texas-holdem 2s5d7c8cKh QsKd AdJc JdJs Ac6d 3s8d 9d3h 2d4c QhQd 4sTh"));
  }

  @Test
  public void test_texas_holdem_4050_2s6d7h8dTc_2hAc_QdJd_4cKs_6s9s_Td6h_5dQs_AdQc_9d4d() {
    assertEquals(
      "5dQs QdJd 4cKs AdQc 2hAc Td6h 6s9s=9d4d",
      Solver.process("texas-holdem 2s6d7h8dTc 2hAc QdJd 4cKs 6s9s Td6h 5dQs AdQc 9d4d"));
  }

  @Test
  public void test_texas_holdem_4051_5c7s8d9cAh_Jc4h_4c6d_5d2d_Tc5h_3s6c() {
    assertEquals(
      "Jc4h 5d2d Tc5h 3s6c=4c6d",
      Solver.process("texas-holdem 5c7s8d9cAh Jc4h 4c6d 5d2d Tc5h 3s6c"));
  }

  @Test
  public void test_texas_holdem_4052_3d4s6s9sJh_JdQs_7cKc_9c6d() {
    assertEquals(
      "7cKc JdQs 9c6d",
      Solver.process("texas-holdem 3d4s6s9sJh JdQs 7cKc 9c6d"));
  }

  @Test
  public void test_texas_holdem_4053_5c6s7dKsQh_6h9c_9h6c_4h5h_JsAd_Ac6d_7hJd_3sTc_7cQs() {
    assertEquals(
      "3sTc JsAd 4h5h 6h9c=9h6c Ac6d 7hJd 7cQs",
      Solver.process("texas-holdem 5c6s7dKsQh 6h9c 9h6c 4h5h JsAd Ac6d 7hJd 3sTc 7cQs"));
  }

  @Test
  public void test_texas_holdem_4054_7h8hAsJhTh_9s3s_4cJc_6d7d_4hAh_3h9d_5cQc() {
    assertEquals(
      "5cQc 6d7d 4cJc 9s3s 3h9d 4hAh",
      Solver.process("texas-holdem 7h8hAsJhTh 9s3s 4cJc 6d7d 4hAh 3h9d 5cQc"));
  }

  @Test
  public void test_texas_holdem_4055_7h8d8sQdTd_Kh9d_5c2h_5dTs_Th7s_8h5s_7dQh_Js6h_2cTc_Ad3c() {
    assertEquals(
      "5c2h Js6h Kh9d Ad3c 2cTc=5dTs=Th7s 7dQh 8h5s",
      Solver.process("texas-holdem 7h8d8sQdTd Kh9d 5c2h 5dTs Th7s 8h5s 7dQh Js6h 2cTc Ad3c"));
  }

  @Test
  public void test_texas_holdem_4056_3d9c9d9h9s_Qc4s_Jh2c_Ks4d_5s3s_2hAc_3hAh_TdKc() {
    assertEquals(
      "5s3s Jh2c Qc4s Ks4d=TdKc 2hAc=3hAh",
      Solver.process("texas-holdem 3d9c9d9h9s Qc4s Jh2c Ks4d 5s3s 2hAc 3hAh TdKc"));
  }

  @Test
  public void test_texas_holdem_4057_3s9cAhKdTc_3c8d_8cJh_7h8h() {
    assertEquals(
      "7h8h 8cJh 3c8d",
      Solver.process("texas-holdem 3s9cAhKdTc 3c8d 8cJh 7h8h"));
  }

  @Test
  public void test_texas_holdem_4058_3d6hJcKcQs_Ad9d_Kh4h_8h6d_JdKs_3h7h_7s5h_AhJh_4c9s() {
    assertEquals(
      "7s5h 4c9s Ad9d 3h7h 8h6d AhJh Kh4h JdKs",
      Solver.process("texas-holdem 3d6hJcKcQs Ad9d Kh4h 8h6d JdKs 3h7h 7s5h AhJh 4c9s"));
  }

  @Test
  public void test_texas_holdem_4059_5dAsJdKcTc_Kh8h_8sAc_9s7c_7s8c_5c3s_Th6d_6c7h() {
    assertEquals(
      "6c7h 7s8c 9s7c 5c3s Th6d Kh8h 8sAc",
      Solver.process("texas-holdem 5dAsJdKcTc Kh8h 8sAc 9s7c 7s8c 5c3s Th6d 6c7h"));
  }

  @Test
  public void test_texas_holdem_4060_3s7h8d9dJc_2d3h_Kd2s_9s5d_8c2c_Ac5s_9hJs() {
    assertEquals(
      "Kd2s Ac5s 2d3h 8c2c 9s5d 9hJs",
      Solver.process("texas-holdem 3s7h8d9dJc 2d3h Kd2s 9s5d 8c2c Ac5s 9hJs"));
  }

  @Test
  public void test_texas_holdem_4061_6c6h8dAcTd_Js7h_9dQd_3s6s_7c5c_KdKc() {
    assertEquals(
      "7c5c Js7h 9dQd KdKc 3s6s",
      Solver.process("texas-holdem 6c6h8dAcTd Js7h 9dQd 3s6s 7c5c KdKc"));
  }

  @Test
  public void test_texas_holdem_4062_4d6h7cJcQs_5cKh_9hQc() {
    assertEquals(
      "5cKh 9hQc",
      Solver.process("texas-holdem 4d6h7cJcQs 5cKh 9hQc"));
  }

  @Test
  public void test_texas_holdem_4063_3s4s8s9sQc_7hTh_Qd2h_KcJs() {
    assertEquals(
      "7hTh Qd2h KcJs",
      Solver.process("texas-holdem 3s4s8s9sQc 7hTh Qd2h KcJs"));
  }

  @Test
  public void test_texas_holdem_4064_2c2s5c7c8c_3dQh_7s3s_Qd6s_2h8s_5hJs_9s2d() {
    assertEquals(
      "3dQh=Qd6s 5hJs 7s3s 9s2d 2h8s",
      Solver.process("texas-holdem 2c2s5c7c8c 3dQh 7s3s Qd6s 2h8s 5hJs 9s2d"));
  }

  @Test
  public void test_texas_holdem_4065_2c6s7sQhTc_As9s_Kd3h_Jc9d_8hJd_7c4s_TdAh_3d2s_AdQd() {
    assertEquals(
      "8hJd Jc9d Kd3h As9s 3d2s 7c4s TdAh AdQd",
      Solver.process("texas-holdem 2c6s7sQhTc As9s Kd3h Jc9d 8hJd 7c4s TdAh 3d2s AdQd"));
  }

  @Test
  public void test_texas_holdem_4066_3h4cQcQsTs_4s2s_4dKd() {
    assertEquals(
      "4s2s 4dKd",
      Solver.process("texas-holdem 3h4cQcQsTs 4s2s 4dKd"));
  }

  @Test
  public void test_texas_holdem_4067_5d5h6s7h8s_Tc2c_3d6c_Qd4c_2dTs_8h4d() {
    assertEquals(
      "2dTs=Tc2c 3d6c 8h4d=Qd4c",
      Solver.process("texas-holdem 5d5h6s7h8s Tc2c 3d6c Qd4c 2dTs 8h4d"));
  }

  @Test
  public void test_texas_holdem_4068_2d3hJhKdKh_3c6s_QhAd_Ah5c_2h8c_JcTs_2s4h_8dAc_7s9c() {
    assertEquals(
      "7s9c Ah5c 8dAc QhAd 2h8c=2s4h 3c6s JcTs",
      Solver.process("texas-holdem 2d3hJhKdKh 3c6s QhAd Ah5c 2h8c JcTs 2s4h 8dAc 7s9c"));
  }

  @Test
  public void test_texas_holdem_4069_2h3s8dJdKc_TsAs_3c4c_4dKh() {
    assertEquals(
      "TsAs 3c4c 4dKh",
      Solver.process("texas-holdem 2h3s8dJdKc TsAs 3c4c 4dKh"));
  }

  @Test
  public void test_texas_holdem_4070_4h5cJsKdQd_AsJd_6dTd_9h3d_3s4s() {
    assertEquals(
      "9h3d 6dTd 3s4s AsJd",
      Solver.process("texas-holdem 4h5cJsKdQd AsJd 6dTd 9h3d 3s4s"));
  }

  @Test
  public void test_texas_holdem_4071_2h2s4sJsQc_4h8h_7s2c_ThJd_5h4d_Tc6c_Ah5s_7c9s_3d9d_8s5c() {
    assertEquals(
      "8s5c 3d9d=7c9s Tc6c Ah5s 4h8h=5h4d ThJd 7s2c",
      Solver.process("texas-holdem 2h2s4sJsQc 4h8h 7s2c ThJd 5h4d Tc6c Ah5s 7c9s 3d9d 8s5c"));
  }

  @Test
  public void test_texas_holdem_4072_3d6c8d9cQc_Ts4h_Th6d_6hTd_Ks6s_Ad5s_3s7c() {
    assertEquals(
      "Ts4h Ad5s 3s7c 6hTd=Th6d Ks6s",
      Solver.process("texas-holdem 3d6c8d9cQc Ts4h Th6d 6hTd Ks6s Ad5s 3s7c"));
  }

  @Test
  public void test_texas_holdem_4073_2c5h9cKdTs_AhQd_Td3d_9sQc_Tc5d() {
    assertEquals(
      "AhQd 9sQc Td3d Tc5d",
      Solver.process("texas-holdem 2c5h9cKdTs AhQd Td3d 9sQc Tc5d"));
  }

  @Test
  public void test_texas_holdem_4074_2d9c9dJsQc_5d4h_2c3s_Ac5c_Th8h_Jc2h_JhAd_9sQh_JdKh_5h4c() {
    assertEquals(
      "5d4h=5h4c Ac5c 2c3s Jc2h JdKh JhAd Th8h 9sQh",
      Solver.process("texas-holdem 2d9c9dJsQc 5d4h 2c3s Ac5c Th8h Jc2h JhAd 9sQh JdKh 5h4c"));
  }

  @Test
  public void test_texas_holdem_4075_2s5h5sAhKs_TcQd_3h2d_4c4s_Kh9h_4h2c_9s2h() {
    assertEquals(
      "TcQd 3h2d=4h2c=9s2h 4c4s Kh9h",
      Solver.process("texas-holdem 2s5h5sAhKs TcQd 3h2d 4c4s Kh9h 4h2c 9s2h"));
  }

  @Test
  public void test_texas_holdem_4076_2c2s3sJcJs_9h6s_7dKs_4s8c_6dAs_5hQs_9d3c() {
    assertEquals(
      "4s8c 9h6s 5hQs 7dKs 6dAs 9d3c",
      Solver.process("texas-holdem 2c2s3sJcJs 9h6s 7dKs 4s8c 6dAs 5hQs 9d3c"));
  }

  @Test
  public void test_texas_holdem_4077_3h4d5s7d9s_Qs4s_KcQh_Th5h_7sAd_5dAc_2d2h_Jc8d_TdJs_Jd3c() {
    assertEquals(
      "Jc8d TdJs KcQh 2d2h Jd3c Qs4s Th5h 5dAc 7sAd",
      Solver.process("texas-holdem 3h4d5s7d9s Qs4s KcQh Th5h 7sAd 5dAc 2d2h Jc8d TdJs Jd3c"));
  }

  @Test
  public void test_texas_holdem_4078_2d7cJsKhQc_5s8h_5d3h_3cJc_6cJd() {
    assertEquals(
      "5d3h 5s8h 3cJc=6cJd",
      Solver.process("texas-holdem 2d7cJsKhQc 5s8h 5d3h 3cJc 6cJd"));
  }

  @Test
  public void test_texas_holdem_4079_3d4d5cAhQs_Qh9d_6dTs_2hJd_2sQd_2d5s_6sJc_4hAc() {
    assertEquals(
      "6dTs 6sJc Qh9d 4hAc 2d5s=2hJd=2sQd",
      Solver.process("texas-holdem 3d4d5cAhQs Qh9d 6dTs 2hJd 2sQd 2d5s 6sJc 4hAc"));
  }

  @Test
  public void test_texas_holdem_4080_4h4s6s7dAc_ThAs_Jh6d() {
    assertEquals(
      "Jh6d ThAs",
      Solver.process("texas-holdem 4h4s6s7dAc ThAs Jh6d"));
  }

  @Test
  public void test_texas_holdem_4081_3c4c5hKsQd_8c4d_QcKc_9cAs_7h2c_Qs9d() {
    assertEquals(
      "7h2c 9cAs 8c4d Qs9d QcKc",
      Solver.process("texas-holdem 3c4c5hKsQd 8c4d QcKc 9cAs 7h2c Qs9d"));
  }

  @Test
  public void test_texas_holdem_4082_2c4c5d6c9c_Ad9h_7d4s() {
    assertEquals(
      "7d4s Ad9h",
      Solver.process("texas-holdem 2c4c5d6c9c Ad9h 7d4s"));
  }

  @Test
  public void test_texas_holdem_4083_2h3s5d6dJh_Td4h_7sQs_9c5s_5c7d_3hJd_7c2s_Ad6h_6s7h_AhJs() {
    assertEquals(
      "7sQs 7c2s 5c7d 9c5s 6s7h Ad6h AhJs 3hJd Td4h",
      Solver.process("texas-holdem 2h3s5d6dJh Td4h 7sQs 9c5s 5c7d 3hJd 7c2s Ad6h 6s7h AhJs"));
  }

  @Test
  public void test_texas_holdem_4084_2c5h7dJcJd_3s3d_Ad6h_8h9h_5sQd_9cTh() {
    assertEquals(
      "8h9h 9cTh Ad6h 3s3d 5sQd",
      Solver.process("texas-holdem 2c5h7dJcJd 3s3d Ad6h 8h9h 5sQd 9cTh"));
  }

  @Test
  public void test_texas_holdem_4085_3s4h7h9hTs_6sAh_8c9s_As7c_5s7d_Ac8h_JcJd() {
    assertEquals(
      "6sAh Ac8h 5s7d As7c 8c9s JcJd",
      Solver.process("texas-holdem 3s4h7h9hTs 6sAh 8c9s As7c 5s7d Ac8h JcJd"));
  }

  @Test
  public void test_texas_holdem_4086_6c8d8s9cJd_QhJh_ThKc_4sKs_2d8h_2hTs_3d3h() {
    assertEquals(
      "2hTs 4sKs ThKc 3d3h QhJh 2d8h",
      Solver.process("texas-holdem 6c8d8s9cJd QhJh ThKc 4sKs 2d8h 2hTs 3d3h"));
  }

  @Test
  public void test_texas_holdem_4087_2c2h5c9hAd_9cKc_Qh5h_TsAc_JcQd_7c2s_Kd6h() {
    assertEquals(
      "JcQd Kd6h Qh5h 9cKc TsAc 7c2s",
      Solver.process("texas-holdem 2c2h5c9hAd 9cKc Qh5h TsAc JcQd 7c2s Kd6h"));
  }

  @Test
  public void test_texas_holdem_4088_5c7hAdKhTs_QdKc_6dQs_8s4d_3cQh_9s8h_6c9d() {
    assertEquals(
      "8s4d 6c9d 9s8h 3cQh=6dQs QdKc",
      Solver.process("texas-holdem 5c7hAdKhTs QdKc 6dQs 8s4d 3cQh 9s8h 6c9d"));
  }

  @Test
  public void test_texas_holdem_4089_4c6d7hKcTh_8d2d_QdJd_5h3d() {
    assertEquals(
      "8d2d QdJd 5h3d",
      Solver.process("texas-holdem 4c6d7hKcTh 8d2d QdJd 5h3d"));
  }

  @Test
  public void test_texas_holdem_4090_3c3d4hAcKd_3hQh_5d8d_4d4s_9h6d_9c8h_Jh5c_Td6s_7dAs() {
    assertEquals(
      "5d8d 9c8h=9h6d Td6s Jh5c 7dAs 3hQh 4d4s",
      Solver.process("texas-holdem 3c3d4hAcKd 3hQh 5d8d 4d4s 9h6d 9c8h Jh5c Td6s 7dAs"));
  }

  @Test
  public void test_texas_holdem_4091_4s8d8sQdTd_3c2d_8cTc_5sKh_4hJd_Th4d_9sAc_8h2s_Kc3d_2hJc() {
    assertEquals(
      "3c2d 2hJc 5sKh=Kc3d 9sAc 4hJd Th4d 8h2s 8cTc",
      Solver.process("texas-holdem 4s8d8sQdTd 3c2d 8cTc 5sKh 4hJd Th4d 9sAc 8h2s Kc3d 2hJc"));
  }

  @Test
  public void test_texas_holdem_4092_2h7c8hQdTd_As5d_KhAh_4d8c_AdJs_6h6s_3s2d_Qc3d_9d3c() {
    assertEquals(
      "9d3c As5d AdJs KhAh 3s2d 6h6s 4d8c Qc3d",
      Solver.process("texas-holdem 2h7c8hQdTd As5d KhAh 4d8c AdJs 6h6s 3s2d Qc3d 9d3c"));
  }

  @Test
  public void test_texas_holdem_4093_6s7h7s8cTs_Ks9c_Kh2c_3dAh_AsQd_5c6d_Td9d() {
    assertEquals(
      "Kh2c 3dAh AsQd 5c6d Ks9c=Td9d",
      Solver.process("texas-holdem 6s7h7s8cTs Ks9c Kh2c 3dAh AsQd 5c6d Td9d"));
  }

  @Test
  public void test_texas_holdem_4094_2c2h4d4sAh_Th7d_Qd8c_6s3h_6hAd_TdAc_9s2d_Kc8h_AsQs_5hKh() {
    assertEquals(
      "5hKh=6s3h=Kc8h=Qd8c=Th7d 6hAd TdAc AsQs 9s2d",
      Solver.process("texas-holdem 2c2h4d4sAh Th7d Qd8c 6s3h 6hAd TdAc 9s2d Kc8h AsQs 5hKh"));
  }

  @Test
  public void test_texas_holdem_4095_3c4s5s6sTh_Ad4d_9sJc_Jh3d_7dJd_7h8h_7c6h_4h9h() {
    assertEquals(
      "9sJc Jh3d 4h9h Ad4d 7c6h=7dJd 7h8h",
      Solver.process("texas-holdem 3c4s5s6sTh Ad4d 9sJc Jh3d 7dJd 7h8h 7c6h 4h9h"));
  }

  @Test
  public void test_texas_holdem_4096_3c5c5d9dTc_9h8h_2c9c_Qd7c_QsKc() {
    assertEquals(
      "Qd7c QsKc 9h8h 2c9c",
      Solver.process("texas-holdem 3c5c5d9dTc 9h8h 2c9c Qd7c QsKc"));
  }

  @Test
  public void test_texas_holdem_4097_2d4h6d8dTd_Jh7c_5c9d_3hJd_Qc2h_As9h_8s5s() {
    assertEquals(
      "Jh7c As9h Qc2h 8s5s 5c9d 3hJd",
      Solver.process("texas-holdem 2d4h6d8dTd Jh7c 5c9d 3hJd Qc2h As9h 8s5s"));
  }

  @Test
  public void test_texas_holdem_4098_6s8cJdQcTh_5sKc_7hKs_Qh4h_JcAd() {
    assertEquals(
      "5sKc=7hKs JcAd Qh4h",
      Solver.process("texas-holdem 6s8cJdQcTh 5sKc 7hKs Qh4h JcAd"));
  }

  @Test
  public void test_texas_holdem_4099_7c9c9dJhTh_Ks5d_3s7s_TdJd_8h6d_QdJc_Kh3d_9s8s_2h4c_QsAc() {
    assertEquals(
      "2h4c Kh3d=Ks5d QsAc 3s7s QdJc TdJd 8h6d=9s8s",
      Solver.process("texas-holdem 7c9c9dJhTh Ks5d 3s7s TdJd 8h6d QdJc Kh3d 9s8s 2h4c QsAc"));
  }

  @Test
  public void test_texas_holdem_4100_2h6s9cAhTd_8s5c_5hKc_6cQs_8dJc_3cJs_9dTc() {
    assertEquals(
      "8s5c 3cJs 8dJc 5hKc 6cQs 9dTc",
      Solver.process("texas-holdem 2h6s9cAhTd 8s5c 5hKc 6cQs 8dJc 3cJs 9dTc"));
  }

  @Test
  public void test_texas_holdem_4101_2c3s7h7sAc_QhTh_8dKd_4c7d() {
    assertEquals(
      "QhTh 8dKd 4c7d",
      Solver.process("texas-holdem 2c3s7h7sAc QhTh 8dKd 4c7d"));
  }

  @Test
  public void test_texas_holdem_4102_2c4h4s7cQd_2s9d_Kh6s_Jh9h_8d6c_8hJs_AsJc_Kc9s() {
    assertEquals(
      "8d6c 8hJs Jh9h Kh6s Kc9s AsJc 2s9d",
      Solver.process("texas-holdem 2c4h4s7cQd 2s9d Kh6s Jh9h 8d6c 8hJs AsJc Kc9s"));
  }

  @Test
  public void test_texas_holdem_4103_4d9dAsQdTs_8c3h_2hJc_4s9s_6c2c_Tc6s_QcKs_6h8d_5hJs() {
    assertEquals(
      "6c2c 6h8d=8c3h 2hJc=5hJs Tc6s QcKs 4s9s",
      Solver.process("texas-holdem 4d9dAsQdTs 8c3h 2hJc 4s9s 6c2c Tc6s QcKs 6h8d 5hJs"));
  }

  @Test
  public void test_texas_holdem_4104_4h7c7dAdJh_JsKs_9s6d_7sJd_Kh4s_Ah8c_3h5d_5cQd_5h8h_2d6s() {
    assertEquals(
      "3h5d 2d6s 5h8h 9s6d 5cQd Kh4s JsKs Ah8c 7sJd",
      Solver.process("texas-holdem 4h7c7dAdJh JsKs 9s6d 7sJd Kh4s Ah8c 3h5d 5cQd 5h8h 2d6s"));
  }

  @Test
  public void test_texas_holdem_4105_7d8dAsKhTs_Jc6s_QhQs_5d8s_9dAd() {
    assertEquals(
      "Jc6s 5d8s QhQs 9dAd",
      Solver.process("texas-holdem 7d8dAsKhTs Jc6s QhQs 5d8s 9dAd"));
  }

  @Test
  public void test_texas_holdem_4106_6cJdKdKsTh_9hQc_7h7s_9c5d_KhAd_6d8c() {
    assertEquals(
      "9c5d 6d8c 7h7s KhAd 9hQc",
      Solver.process("texas-holdem 6cJdKdKsTh 9hQc 7h7s 9c5d KhAd 6d8c"));
  }

  @Test
  public void test_texas_holdem_4107_2d5h5sQcQs_Ts3h_Jd6s() {
    assertEquals(
      "Ts3h Jd6s",
      Solver.process("texas-holdem 2d5h5sQcQs Ts3h Jd6s"));
  }

  @Test
  public void test_texas_holdem_4108_4h7d8hJdJh_5hQc_4s4d_8c2h_7s6c_9cJc_KdTc_3cTd_QhTs() {
    assertEquals(
      "3cTd 5hQc QhTs KdTc 7s6c 8c2h 9cJc 4s4d",
      Solver.process("texas-holdem 4h7d8hJdJh 5hQc 4s4d 8c2h 7s6c 9cJc KdTc 3cTd QhTs"));
  }

  @Test
  public void test_texas_holdem_4109_3d4h5dAdTd_8c6c_QdTs_Js8h_Ah4s_2h9s_8sJd_5sQc_7hQs_JhKd() {
    assertEquals(
      "8c6c Js8h 7hQs 5sQc Ah4s 2h9s 8sJd QdTs JhKd",
      Solver.process("texas-holdem 3d4h5dAdTd 8c6c QdTs Js8h Ah4s 2h9s 8sJd 5sQc 7hQs JhKd"));
  }

  @Test
  public void test_texas_holdem_4110_4h7c9d9sJc_7d6c_5s5d_8c8d_AdAh_3sTs() {
    assertEquals(
      "3sTs 5s5d 7d6c 8c8d AdAh",
      Solver.process("texas-holdem 4h7c9d9sJc 7d6c 5s5d 8c8d AdAh 3sTs"));
  }

  @Test
  public void test_texas_holdem_4111_3d7c9dKcKh_9h5s_Ks9c_6c7h_Th4s_6sAd() {
    assertEquals(
      "Th4s 6sAd 6c7h 9h5s Ks9c",
      Solver.process("texas-holdem 3d7c9dKcKh 9h5s Ks9c 6c7h Th4s 6sAd"));
  }

  @Test
  public void test_texas_holdem_4112_2s5d7s8s9h_5hTs_QdAs_Jd9c_2d2c() {
    assertEquals(
      "QdAs 5hTs Jd9c 2d2c",
      Solver.process("texas-holdem 2s5d7s8s9h 5hTs QdAs Jd9c 2d2c"));
  }

  @Test
  public void test_texas_holdem_4113_5s9sAcJsKh_2d3c_6sTd_Kc5d_7h9c_3sAs_7sJc_KsQd_4hTs() {
    assertEquals(
      "2d3c 4hTs=6sTd 7h9c 7sJc KsQd Kc5d 3sAs",
      Solver.process("texas-holdem 5s9sAcJsKh 2d3c 6sTd Kc5d 7h9c 3sAs 7sJc KsQd 4hTs"));
  }

  @Test
  public void test_texas_holdem_4114_4s6c7h8cJs_JdAs_5h9h() {
    assertEquals(
      "JdAs 5h9h",
      Solver.process("texas-holdem 4s6c7h8cJs JdAs 5h9h"));
  }

  @Test
  public void test_texas_holdem_4115_5c6hAdJhQh_TcAs_2dJs_AhKh_9s7s_8hJd_8s5d_4d4h_9h6d_Jc6c() {
    assertEquals(
      "9s7s 4d4h 8s5d 9h6d 2dJs 8hJd TcAs Jc6c AhKh",
      Solver.process("texas-holdem 5c6hAdJhQh TcAs 2dJs AhKh 9s7s 8hJd 8s5d 4d4h 9h6d Jc6c"));
  }

  @Test
  public void test_texas_holdem_4116_4d9dJsKhTh_5h8d_7dTc_Ah6h_9s8s_AdQs_7cJd_Qd2s_3s6s_2hTs() {
    assertEquals(
      "3s6s 5h8d Ah6h 9s8s 2hTs=7dTc 7cJd Qd2s AdQs",
      Solver.process("texas-holdem 4d9dJsKhTh 5h8d 7dTc Ah6h 9s8s AdQs 7cJd Qd2s 3s6s 2hTs"));
  }

  @Test
  public void test_texas_holdem_4117_3s4d5c6c9s_3hQd_4c5s_Th3c_Jh2d_KsAc_TcQs_Kc8d_6dAs_TsJc() {
    assertEquals(
      "TsJc TcQs Kc8d KsAc Th3c 3hQd 6dAs 4c5s Jh2d",
      Solver.process("texas-holdem 3s4d5c6c9s 3hQd 4c5s Th3c Jh2d KsAc TcQs Kc8d 6dAs TsJc"));
  }

  @Test
  public void test_texas_holdem_4118_4s6c6sJdKd_7hTd_Ks9h_8c8h_Th5d_5c5h_9c2c_8sJh() {
    assertEquals(
      "9c2c 7hTd=Th5d 5c5h 8c8h 8sJh Ks9h",
      Solver.process("texas-holdem 4s6c6sJdKd 7hTd Ks9h 8c8h Th5d 5c5h 9c2c 8sJh"));
  }

  @Test
  public void test_texas_holdem_4119_5h6hAdJsQd_8c5s_7c6s_6c2c_Kd4h_2dTd_Kh9d() {
    assertEquals(
      "2dTd Kd4h Kh9d 8c5s 6c2c=7c6s",
      Solver.process("texas-holdem 5h6hAdJsQd 8c5s 7c6s 6c2c Kd4h 2dTd Kh9d"));
  }

  @Test
  public void test_texas_holdem_4120_2s3d6h8hKh_4dJs_9cAc_4h7c_QdJd_AsTs() {
    assertEquals(
      "4h7c 4dJs QdJd 9cAc AsTs",
      Solver.process("texas-holdem 2s3d6h8hKh 4dJs 9cAc 4h7c QdJd AsTs"));
  }

  @Test
  public void test_texas_holdem_4121_2h6d6s8sQs_AdKs_8c5s_5c9h_7c3s_AsQh_AhJs_4dKh() {
    assertEquals(
      "7c3s 5c9h 4dKh AhJs AdKs 8c5s AsQh",
      Solver.process("texas-holdem 2h6d6s8sQs AdKs 8c5s 5c9h 7c3s AsQh AhJs 4dKh"));
  }

  @Test
  public void test_texas_holdem_4122_2c3hAdJsKc_Ts6s_Jc9h_8d6c_QhJh_4d7s_3s2h_As5d_QdKs_Tc8s() {
    assertEquals(
      "4d7s 8d6c Ts6s Tc8s Jc9h QhJh QdKs As5d 3s2h",
      Solver.process("texas-holdem 2c3hAdJsKc Ts6s Jc9h 8d6c QhJh 4d7s 3s2h As5d QdKs Tc8s"));
  }

  @Test
  public void test_texas_holdem_4123_4s7d8dJcTc_Js3s_2d5c_7sAh() {
    assertEquals(
      "2d5c 7sAh Js3s",
      Solver.process("texas-holdem 4s7d8dJcTc Js3s 2d5c 7sAh"));
  }

  @Test
  public void test_texas_holdem_4124_2d5sKcQhTh_6s3s_3cKd() {
    assertEquals(
      "6s3s 3cKd",
      Solver.process("texas-holdem 2d5sKcQhTh 6s3s 3cKd"));
  }

  @Test
  public void test_texas_holdem_4125_8s9dJsKhTh_As3d_QdAd_Qs2c_8dJh() {
    assertEquals(
      "As3d 8dJh Qs2c QdAd",
      Solver.process("texas-holdem 8s9dJsKhTh As3d QdAd Qs2c 8dJh"));
  }

  @Test
  public void test_texas_holdem_4126_2c3s5d8dKh_QsTc_3h6s_2d4c_Qd6d_3d4s_7d6h_8h7h_KsTd_7cAc() {
    assertEquals(
      "7d6h Qd6d QsTc 7cAc 2d4c 3d4s 3h6s 8h7h KsTd",
      Solver.process("texas-holdem 2c3s5d8dKh QsTc 3h6s 2d4c Qd6d 3d4s 7d6h 8h7h KsTd 7cAc"));
  }

  @Test
  public void test_texas_holdem_4127_2h5d7sAsQs_4h6s_3cQd_9s8h_8c5s_Qc3s_6h4d() {
    assertEquals(
      "4h6s=6h4d 9s8h 8c5s 3cQd=Qc3s",
      Solver.process("texas-holdem 2h5d7sAsQs 4h6s 3cQd 9s8h 8c5s Qc3s 6h4d"));
  }

  @Test
  public void test_texas_holdem_4128_2d2s8c8hKh_2h7s_AhJc() {
    assertEquals(
      "AhJc 2h7s",
      Solver.process("texas-holdem 2d2s8c8hKh 2h7s AhJc"));
  }

  @Test
  public void test_texas_holdem_4129_3h6s7cJcKh_4dJs_JdQs_3dQh_As5s_KcTh_6h7s_Kd9c_7h5d_2s2h() {
    assertEquals(
      "As5s 2s2h 3dQh 7h5d 4dJs JdQs Kd9c KcTh 6h7s",
      Solver.process("texas-holdem 3h6s7cJcKh 4dJs JdQs 3dQh As5s KcTh 6h7s Kd9c 7h5d 2s2h"));
  }

  @Test
  public void test_texas_holdem_4130_2d4sAcQcTs_Js6c_7c9d_3s2s_Jh6s_5d9s_4h5c_9c4c_KdAh_Td3h() {
    assertEquals(
      "5d9s 7c9d Jh6s=Js6c 3s2s 4h5c=9c4c Td3h KdAh",
      Solver.process("texas-holdem 2d4sAcQcTs Js6c 7c9d 3s2s Jh6s 5d9s 4h5c 9c4c KdAh Td3h"));
  }

  @Test
  public void test_texas_holdem_4131_2d6h8h9sKd_3d2h_7cAc_3sJs_7d4s() {
    assertEquals(
      "7d4s 3sJs 7cAc 3d2h",
      Solver.process("texas-holdem 2d6h8h9sKd 3d2h 7cAc 3sJs 7d4s"));
  }

  @Test
  public void test_texas_holdem_4132_4h5d7d9dKd_Jh5c_Qh3c_3hKs_8c4c_7hTh_6sJd_4sAs() {
    assertEquals(
      "Qh3c 8c4c 4sAs Jh5c 7hTh 3hKs 6sJd",
      Solver.process("texas-holdem 4h5d7d9dKd Jh5c Qh3c 3hKs 8c4c 7hTh 6sJd 4sAs"));
  }

  @Test
  public void test_texas_holdem_4133_5c7s8dKhKs_7h9s_6s2d_Td4s_3c5s() {
    assertEquals(
      "6s2d Td4s 3c5s 7h9s",
      Solver.process("texas-holdem 5c7s8dKhKs 7h9s 6s2d Td4s 3c5s"));
  }

  @Test
  public void test_texas_holdem_4134_4s5d6hKdTh_7s2d_6cAc() {
    assertEquals(
      "7s2d 6cAc",
      Solver.process("texas-holdem 4s5d6hKdTh 7s2d 6cAc"));
  }

  @Test
  public void test_texas_holdem_4135_2h3s4dKsQc_9dAs_Th7d() {
    assertEquals(
      "Th7d 9dAs",
      Solver.process("texas-holdem 2h3s4dKsQc 9dAs Th7d"));
  }

  @Test
  public void test_texas_holdem_4136_2h3d9cKhQc_JhQs_3sTh_Td7c_8c3h_7dJc_2d5h_4cKd_8d4d_9s5c() {
    assertEquals(
      "8d4d Td7c 7dJc 2d5h 8c3h 3sTh 9s5c JhQs 4cKd",
      Solver.process("texas-holdem 2h3d9cKhQc JhQs 3sTh Td7c 8c3h 7dJc 2d5h 4cKd 8d4d 9s5c"));
  }

  @Test
  public void test_texas_holdem_4137_4h9hAdJsTh_Ks8h_8sQd_Jh7c_6s2h_Td4c_Jc6h_Kd8d_5hAc() {
    assertEquals(
      "6s2h Kd8d=Ks8h Jc6h=Jh7c 5hAc Td4c 8sQd",
      Solver.process("texas-holdem 4h9hAdJsTh Ks8h 8sQd Jh7c 6s2h Td4c Jc6h Kd8d 5hAc"));
  }

  @Test
  public void test_texas_holdem_4138_3hAhAsQsTs_2cJd_5d3d_8s4s() {
    assertEquals(
      "2cJd 5d3d 8s4s",
      Solver.process("texas-holdem 3hAhAsQsTs 2cJd 5d3d 8s4s"));
  }

  @Test
  public void test_texas_holdem_4139_6d7c7s9dTc_5dJh_6cJd_4sTh_Ac9s() {
    assertEquals(
      "5dJh 6cJd Ac9s 4sTh",
      Solver.process("texas-holdem 6d7c7s9dTc 5dJh 6cJd 4sTh Ac9s"));
  }

  @Test
  public void test_texas_holdem_4140_3d9dJhJsQh_4d5s_6dQs_Kd4h_2c7d_9c7h_TdJc_2d8c_2h4c() {
    assertEquals(
      "2h4c 4d5s 2c7d 2d8c Kd4h 9c7h 6dQs TdJc",
      Solver.process("texas-holdem 3d9dJhJsQh 4d5s 6dQs Kd4h 2c7d 9c7h TdJc 2d8c 2h4c"));
  }

  @Test
  public void test_texas_holdem_4141_2c3h5d7h9c_6h3c_Qs8d_5cJs() {
    assertEquals(
      "Qs8d 6h3c 5cJs",
      Solver.process("texas-holdem 2c3h5d7h9c 6h3c Qs8d 5cJs"));
  }

  @Test
  public void test_texas_holdem_4142_3c3d7h7sTd_4d7c_QsJc_6d9c_5sTs() {
    assertEquals(
      "6d9c QsJc 5sTs 4d7c",
      Solver.process("texas-holdem 3c3d7h7sTd 4d7c QsJc 6d9c 5sTs"));
  }

  @Test
  public void test_texas_holdem_4143_AcAhAsQcTh_2d5h_9h8d_6d5c_Jh8s() {
    assertEquals(
      "2d5h=6d5c=9h8d Jh8s",
      Solver.process("texas-holdem AcAhAsQcTh 2d5h 9h8d 6d5c Jh8s"));
  }

  @Test
  public void test_texas_holdem_4144_3d3h5s7sTd_Tc7h_8hAs_4dJc_KsJd_Ac9d_6cQs_Ah9s_QhAd_8cJs() {
    assertEquals(
      "4dJc 8cJs 6cQs KsJd 8hAs Ac9d=Ah9s QhAd Tc7h",
      Solver.process("texas-holdem 3d3h5s7sTd Tc7h 8hAs 4dJc KsJd Ac9d 6cQs Ah9s QhAd 8cJs"));
  }

  @Test
  public void test_texas_holdem_4145_4d4s5h7h9d_6dKc_AhKd_Th2c() {
    assertEquals(
      "Th2c 6dKc AhKd",
      Solver.process("texas-holdem 4d4s5h7h9d 6dKc AhKd Th2c"));
  }

  @Test
  public void test_texas_holdem_4146_3h4d6sAcQs_2s6h_9hKh_5sJd_9c9s_QhJc() {
    assertEquals(
      "5sJd 9hKh 2s6h 9c9s QhJc",
      Solver.process("texas-holdem 3h4d6sAcQs 2s6h 9hKh 5sJd 9c9s QhJc"));
  }

  @Test
  public void test_texas_holdem_4147_7hAsJdJsQc_6h8h_3cJh_5sTc_4c9s_2sKh_KdTh_Qh4s() {
    assertEquals(
      "6h8h 4c9s 5sTc 2sKh Qh4s 3cJh KdTh",
      Solver.process("texas-holdem 7hAsJdJsQc 6h8h 3cJh 5sTc 4c9s 2sKh KdTh Qh4s"));
  }

  @Test
  public void test_texas_holdem_4148_8h8s9hAdTc_ThQs_Qh3c_Jh8c_6c2h_6sKc_Js9c() {
    assertEquals(
      "6c2h Qh3c 6sKc Js9c ThQs Jh8c",
      Solver.process("texas-holdem 8h8s9hAdTc ThQs Qh3c Jh8c 6c2h 6sKc Js9c"));
  }

  @Test
  public void test_texas_holdem_4149_8dJhQcTcTd_5d9d_2h3h_7c3d_KdAh_4c4h() {
    assertEquals(
      "2h3h=7c3d 4c4h 5d9d KdAh",
      Solver.process("texas-holdem 8dJhQcTcTd 5d9d 2h3h 7c3d KdAh 4c4h"));
  }

  @Test
  public void test_texas_holdem_4150_3h4s9cJcQs_3sKs_8d2d_6c5d_Kc8c_4c4d_3cTd_7cJs_9d9h_QdAh() {
    assertEquals(
      "6c5d 8d2d Kc8c 3cTd 3sKs 7cJs QdAh 4c4d 9d9h",
      Solver.process("texas-holdem 3h4s9cJcQs 3sKs 8d2d 6c5d Kc8c 4c4d 3cTd 7cJs 9d9h QdAh"));
  }

  @Test
  public void test_texas_holdem_4151_3c5h6s7h7s_6dKc_9h6h_Ah6c_TsQh_2sQc_5c3s() {
    assertEquals(
      "2sQc TsQh 5c3s 9h6h 6dKc Ah6c",
      Solver.process("texas-holdem 3c5h6s7h7s 6dKc 9h6h Ah6c TsQh 2sQc 5c3s"));
  }

  @Test
  public void test_texas_holdem_4152_3d4c6dAcKs_Kd4h_8c3c_8dJs() {
    assertEquals(
      "8dJs 8c3c Kd4h",
      Solver.process("texas-holdem 3d4c6dAcKs Kd4h 8c3c 8dJs"));
  }

  @Test
  public void test_texas_holdem_4153_4s8sAdJhTs_Jd7s_7hKh_6dKd_3d2d_Qc5s_6sAh_7d5c_5d2s_3sKc() {
    assertEquals(
      "3d2d 5d2s 7d5c Qc5s 3sKc=6dKd=7hKh Jd7s 6sAh",
      Solver.process("texas-holdem 4s8sAdJhTs Jd7s 7hKh 6dKd 3d2d Qc5s 6sAh 7d5c 5d2s 3sKc"));
  }

  @Test
  public void test_texas_holdem_4154_2h9dAhJdQc_5dQs_Kh5c_9c8c_4sJs_Qh2c_3h6h_3s2s_QdJc() {
    assertEquals(
      "3h6h Kh5c 3s2s 9c8c 4sJs 5dQs Qh2c QdJc",
      Solver.process("texas-holdem 2h9dAhJdQc 5dQs Kh5c 9c8c 4sJs Qh2c 3h6h 3s2s QdJc"));
  }

  @Test
  public void test_texas_holdem_4155_2s7c9cKsQc_7sQh_4hKc_4d6c_8s2h_6h3s_Qd8c_QsJc_6dJh_AcTc() {
    assertEquals(
      "4d6c=6h3s 6dJh 8s2h Qd8c QsJc 4hKc 7sQh AcTc",
      Solver.process("texas-holdem 2s7c9cKsQc 7sQh 4hKc 4d6c 8s2h 6h3s Qd8c QsJc 6dJh AcTc"));
  }

  @Test
  public void test_texas_holdem_4156_7h9hQcQhTc_4c5d_9c6d_3hKs_3sAs_4dJs_8h6s_9d3d() {
    assertEquals(
      "4c5d 4dJs 3hKs 3sAs 9c6d=9d3d 8h6s",
      Solver.process("texas-holdem 7h9hQcQhTc 4c5d 9c6d 3hKs 3sAs 4dJs 8h6s 9d3d"));
  }

  @Test
  public void test_texas_holdem_4157_4d6d7d8cAd_5c3s_Kc5s_4s6s_6h9s_9d2s() {
    assertEquals(
      "6h9s 4s6s 5c3s=Kc5s 9d2s",
      Solver.process("texas-holdem 4d6d7d8cAd 5c3s Kc5s 4s6s 6h9s 9d2s"));
  }

  @Test
  public void test_texas_holdem_4158_5c7h9sAhKc_Ks8s_9cKd_5s7c_9hQd_8d5h_6h7s() {
    assertEquals(
      "8d5h 6h7s 9hQd Ks8s 5s7c 9cKd",
      Solver.process("texas-holdem 5c7h9sAhKc Ks8s 9cKd 5s7c 9hQd 8d5h 6h7s"));
  }

  @Test
  public void test_texas_holdem_4159_2h6sAdAhKc_2c5c_7c7h_9cTh_2s5s_4h4c_7sAc_Jc8d_Tc9d_6d8c() {
    assertEquals(
      "9cTh=Tc9d Jc8d 2c5c=2s5s 4h4c 6d8c 7c7h 7sAc",
      Solver.process("texas-holdem 2h6sAdAhKc 2c5c 7c7h 9cTh 2s5s 4h4c 7sAc Jc8d Tc9d 6d8c"));
  }

  @Test
  public void test_texas_holdem_4160_2d4d7d8hJd_7s2s_8dTh_6sQs_7h2h_6hAd() {
    assertEquals(
      "6sQs 7h2h=7s2s 8dTh 6hAd",
      Solver.process("texas-holdem 2d4d7d8hJd 7s2s 8dTh 6sQs 7h2h 6hAd"));
  }

  @Test
  public void test_texas_holdem_4161_4s5c6c6sJs_2s7d_Th9s_8s3c_4c7h_KcKh_Ad5d_JhTd() {
    assertEquals(
      "2s7d 8s3c Th9s 4c7h Ad5d JhTd KcKh",
      Solver.process("texas-holdem 4s5c6c6sJs 2s7d Th9s 8s3c 4c7h KcKh Ad5d JhTd"));
  }

  @Test
  public void test_texas_holdem_4162_3c6c8c9cKs_Qd4h_8sTc_9d9h_3s4d() {
    assertEquals(
      "Qd4h 3s4d 9d9h 8sTc",
      Solver.process("texas-holdem 3c6c8c9cKs Qd4h 8sTc 9d9h 3s4d"));
  }

  @Test
  public void test_texas_holdem_4163_2s5c9sJsKs_KcJd_Jc3c_8d9h_AsTc_7cQc() {
    assertEquals(
      "7cQc 8d9h Jc3c KcJd AsTc",
      Solver.process("texas-holdem 2s5c9sJsKs KcJd Jc3c 8d9h AsTc 7cQc"));
  }

  @Test
  public void test_texas_holdem_4164_4s6sAsJsQd_TsJh_7dKc_5s8s_4h2c_3h6h() {
    assertEquals(
      "7dKc 4h2c 3h6h 5s8s TsJh",
      Solver.process("texas-holdem 4s6sAsJsQd TsJh 7dKc 5s8s 4h2c 3h6h"));
  }

  @Test
  public void test_texas_holdem_4165_3c6s8s9hJh_2d3h_9sAh_7s6h_Jc9d_4s4h_7hKc() {
    assertEquals(
      "7hKc 2d3h 4s4h 7s6h 9sAh Jc9d",
      Solver.process("texas-holdem 3c6s8s9hJh 2d3h 9sAh 7s6h Jc9d 4s4h 7hKc"));
  }

  @Test
  public void test_texas_holdem_4166_2h3d6s9dQd_QcKd_KsQs() {
    assertEquals(
      "KsQs=QcKd",
      Solver.process("texas-holdem 2h3d6s9dQd QcKd KsQs"));
  }

  @Test
  public void test_texas_holdem_4167_3h6d7hJcTh_7d7s_Td2h_2s9d_2dQc_9c4c_TcQd_8c5c_KsKd() {
    assertEquals(
      "8c5c 2s9d=9c4c 2dQc Td2h TcQd KsKd 7d7s",
      Solver.process("texas-holdem 3h6d7hJcTh 7d7s Td2h 2s9d 2dQc 9c4c TcQd 8c5c KsKd"));
  }

  @Test
  public void test_texas_holdem_4168_2c4d8dJcKh_Ah3s_4s9d_5sAs_Qc2s_3h7s_QsKc_5d4h_5c8c() {
    assertEquals(
      "3h7s Ah3s 5sAs Qc2s 5d4h 4s9d 5c8c QsKc",
      Solver.process("texas-holdem 2c4d8dJcKh Ah3s 4s9d 5sAs Qc2s 3h7s QsKc 5d4h 5c8c"));
  }

  @Test
  public void test_texas_holdem_4169_2d2h4c8h9d_Kc2c_Th3s_5sQd_4dKh() {
    assertEquals(
      "Th3s 5sQd 4dKh Kc2c",
      Solver.process("texas-holdem 2d2h4c8h9d Kc2c Th3s 5sQd 4dKh"));
  }

  @Test
  public void test_texas_holdem_4170_3s6c7d8cJc_QcKc_2h6s_4c8h_Qs2s_QhJd() {
    assertEquals(
      "Qs2s 2h6s 4c8h QhJd QcKc",
      Solver.process("texas-holdem 3s6c7d8cJc QcKc 2h6s 4c8h Qs2s QhJd"));
  }

  @Test
  public void test_texas_holdem_4171_3c5s6h7cTh_Td3s_4dAd_QhTs_4h9c_6c4c_5d6s_8d8h_AhQs() {
    assertEquals(
      "AhQs 8d8h QhTs 5d6s Td3s 4dAd=4h9c=6c4c",
      Solver.process("texas-holdem 3c5s6h7cTh Td3s 4dAd QhTs 4h9c 6c4c 5d6s 8d8h AhQs"));
  }

  @Test
  public void test_texas_holdem_4172_3h4s6s9sKh_Kc8h_Ad2h_3d3s() {
    assertEquals(
      "Ad2h Kc8h 3d3s",
      Solver.process("texas-holdem 3h4s6s9sKh Kc8h Ad2h 3d3s"));
  }

  @Test
  public void test_texas_holdem_4173_2c6s7c8cAc_Th3s_9cTs_Qh4s_8dAh_4cKh() {
    assertEquals(
      "Th3s Qh4s 8dAh 4cKh 9cTs",
      Solver.process("texas-holdem 2c6s7c8cAc Th3s 9cTs Qh4s 8dAh 4cKh"));
  }

  @Test
  public void test_texas_holdem_4174_2h4d5h9sQd_4c7c_Jd6s_3dTd_6h9c_Ah3s_Ad2c_7s6c_As8s_9d7h() {
    assertEquals(
      "7s6c 3dTd Jd6s As8s Ad2c 4c7c 6h9c 9d7h Ah3s",
      Solver.process("texas-holdem 2h4d5h9sQd 4c7c Jd6s 3dTd 6h9c Ah3s Ad2c 7s6c As8s 9d7h"));
  }

  @Test
  public void test_texas_holdem_4175_2h2s7cAcJh_6d2d_QhTh_6sJs_Td9h_9d6c() {
    assertEquals(
      "9d6c Td9h QhTh 6sJs 6d2d",
      Solver.process("texas-holdem 2h2s7cAcJh 6d2d QhTh 6sJs Td9h 9d6c"));
  }

  @Test
  public void test_texas_holdem_4176_3h4c8sAhJs_6dQh_3dAc_KdQd_Ks8d_6s4h_7dTd_2d5d_2s7s_7cJd() {
    assertEquals(
      "2s7s 7dTd 6dQh KdQd 6s4h Ks8d 7cJd 3dAc 2d5d",
      Solver.process("texas-holdem 3h4c8sAhJs 6dQh 3dAc KdQd Ks8d 6s4h 7dTd 2d5d 2s7s 7cJd"));
  }

  @Test
  public void test_texas_holdem_4177_2c3h6d8cJd_Ad4s_2d3d_2sTh_As9d_3sTd_3c4c_8hJc_7s5s() {
    assertEquals(
      "7s5s Ad4s As9d 2sTh 3c4c 3sTd 2d3d 8hJc",
      Solver.process("texas-holdem 2c3h6d8cJd Ad4s 2d3d 2sTh As9d 3sTd 3c4c 8hJc 7s5s"));
  }

  @Test
  public void test_texas_holdem_4178_3d4s6h8cAc_2h3c_5h7s_2d8d_KhTs_8hJh() {
    assertEquals(
      "KhTs 2h3c 2d8d 8hJh 5h7s",
      Solver.process("texas-holdem 3d4s6h8cAc 2h3c 5h7s 2d8d KhTs 8hJh"));
  }

  @Test
  public void test_texas_holdem_4179_4d6hQcQhTd_8c5c_KsAs_JdTh_3dJh_8s6c_8hJs_AcAd_9h9d_4c5d() {
    assertEquals(
      "8c5c 3dJh 8hJs KsAs 4c5d 8s6c 9h9d JdTh AcAd",
      Solver.process("texas-holdem 4d6hQcQhTd 8c5c KsAs JdTh 3dJh 8s6c 8hJs AcAd 9h9d 4c5d"));
  }

  @Test
  public void test_texas_holdem_4180_4s7d7hJcKh_2sQs_Td8d() {
    assertEquals(
      "Td8d 2sQs",
      Solver.process("texas-holdem 4s7d7hJcKh 2sQs Td8d"));
  }

  @Test
  public void test_texas_holdem_4181_6d7h9sJcKs_3h4c_Tc8s_2c9h_6sTs_QcKd() {
    assertEquals(
      "3h4c 6sTs 2c9h QcKd Tc8s",
      Solver.process("texas-holdem 6d7h9sJcKs 3h4c Tc8s 2c9h 6sTs QcKd"));
  }

  @Test
  public void test_texas_holdem_4182_6hAdQcQdTh_9hKc_7h5h_Tc6s_8d6d_7c7d_3s4h_3h5s() {
    assertEquals(
      "3h5s=3s4h 7h5h 9hKc 8d6d 7c7d Tc6s",
      Solver.process("texas-holdem 6hAdQcQdTh 9hKc 7h5h Tc6s 8d6d 7c7d 3s4h 3h5s"));
  }

  @Test
  public void test_texas_holdem_4183_8c8d8sAdJc_7dJd_3dTh() {
    assertEquals(
      "3dTh 7dJd",
      Solver.process("texas-holdem 8c8d8sAdJc 7dJd 3dTh"));
  }

  @Test
  public void test_texas_holdem_4184_6c7c7sTcTs_3d2d_Ks4c_2sAs_QsAh_4h5s() {
    assertEquals(
      "3d2d=4h5s Ks4c 2sAs=QsAh",
      Solver.process("texas-holdem 6c7c7sTcTs 3d2d Ks4c 2sAs QsAh 4h5s"));
  }

  @Test
  public void test_texas_holdem_4185_2c6h7d8hJd_Jh2s_5d4h() {
    assertEquals(
      "Jh2s 5d4h",
      Solver.process("texas-holdem 2c6h7d8hJd Jh2s 5d4h"));
  }

  @Test
  public void test_texas_holdem_4186_3h4c4d6s7h_Ks8d_7d4h_KhAc_Kc8s_5d3c_AsJd_7cAd_Th2s() {
    assertEquals(
      "Th2s Kc8s=Ks8d AsJd KhAc 7cAd 5d3c 7d4h",
      Solver.process("texas-holdem 3h4c4d6s7h Ks8d 7d4h KhAc Kc8s 5d3c AsJd 7cAd Th2s"));
  }

  @Test
  public void test_texas_holdem_4187_3d4c7dAcJc_Qs4h_5hAh() {
    assertEquals(
      "Qs4h 5hAh",
      Solver.process("texas-holdem 3d4c7dAcJc Qs4h 5hAh"));
  }

  @Test
  public void test_texas_holdem_4188_2d6c9dAcTs_5d6h_KsAs_TcKh_Jd9s_5h5c_7hAh_3dTd() {
    assertEquals(
      "5h5c 5d6h Jd9s 3dTd TcKh 7hAh KsAs",
      Solver.process("texas-holdem 2d6c9dAcTs 5d6h KsAs TcKh Jd9s 5h5c 7hAh 3dTd"));
  }

  @Test
  public void test_texas_holdem_4189_7h8sKsTcTd_Ah5d_6dJh_8h3h_6h9c() {
    assertEquals(
      "6dJh Ah5d 8h3h 6h9c",
      Solver.process("texas-holdem 7h8sKsTcTd Ah5d 6dJh 8h3h 6h9c"));
  }

  @Test
  public void test_texas_holdem_4190_6h9cQcQdTh_8d3c_9hQs_2c5s_4hAh_4dKs_7h7d_9s3h_9d4c() {
    assertEquals(
      "2c5s 8d3c 4dKs 4hAh 7h7d 9d4c=9s3h 9hQs",
      Solver.process("texas-holdem 6h9cQcQdTh 8d3c 9hQs 2c5s 4hAh 4dKs 7h7d 9s3h 9d4c"));
  }

  @Test
  public void test_texas_holdem_4191_6h9d9sJcKc_9hKs_8dJh_JdTc_QcTh_Ad2c_AsKh_2s3c_Qs4s() {
    assertEquals(
      "2s3c Qs4s Ad2c 8dJh=JdTc AsKh QcTh 9hKs",
      Solver.process("texas-holdem 6h9d9sJcKc 9hKs 8dJh JdTc QcTh Ad2c AsKh 2s3c Qs4s"));
  }

  @Test
  public void test_texas_holdem_4192_4s8s9hAhTd_Js7h_8c7s_KdTh() {
    assertEquals(
      "8c7s KdTh Js7h",
      Solver.process("texas-holdem 4s8s9hAhTd Js7h 8c7s KdTh"));
  }

  @Test
  public void test_texas_holdem_4193_5s7d8sAcJd_3d4s_5c7c_3cQd_KsQs_3sJs_2cAh_Ts6c_Ad6h() {
    assertEquals(
      "3d4s Ts6c 3cQd KsQs 3sJs 2cAh=Ad6h 5c7c",
      Solver.process("texas-holdem 5s7d8sAcJd 3d4s 5c7c 3cQd KsQs 3sJs 2cAh Ts6c Ad6h"));
  }

  @Test
  public void test_texas_holdem_4194_2h3s8sAdKh_9s2d_TdQh_Ts6h_Ac3h_9c2s_3dQd_8h4h() {
    assertEquals(
      "Ts6h TdQh 9c2s=9s2d 3dQd 8h4h Ac3h",
      Solver.process("texas-holdem 2h3s8sAdKh 9s2d TdQh Ts6h Ac3h 9c2s 3dQd 8h4h"));
  }

  @Test
  public void test_texas_holdem_4195_4sAcJsQcQh_6sJd_QdAh_9c6d() {
    assertEquals(
      "9c6d 6sJd QdAh",
      Solver.process("texas-holdem 4sAcJsQcQh 6sJd QdAh 9c6d"));
  }

  @Test
  public void test_texas_holdem_4196_4h7h9hAcQd_5h4s_5dAd_6h9c_5sAh_8s7c_TsKh_Qh9s_4dQs() {
    assertEquals(
      "TsKh 5h4s 8s7c 6h9c 5dAd=5sAh 4dQs Qh9s",
      Solver.process("texas-holdem 4h7h9hAcQd 5h4s 5dAd 6h9c 5sAh 8s7c TsKh Qh9s 4dQs"));
  }

  @Test
  public void test_texas_holdem_4197_2s5h8cKdTc_5s7c_TsQc() {
    assertEquals(
      "5s7c TsQc",
      Solver.process("texas-holdem 2s5h8cKdTc 5s7c TsQc"));
  }

  @Test
  public void test_texas_holdem_4198_3d3h8d8h8s_Td9s_Ah7s() {
    assertEquals(
      "Ah7s=Td9s",
      Solver.process("texas-holdem 3d3h8d8h8s Td9s Ah7s"));
  }

  @Test
  public void test_texas_holdem_4199_5c5d8h9sAd_Kh6c_Ac7s_4h5h() {
    assertEquals(
      "Kh6c Ac7s 4h5h",
      Solver.process("texas-holdem 5c5d8h9sAd Kh6c Ac7s 4h5h"));
  }

  @Test
  public void test_texas_holdem_4200_4d8h9dKdQd_8sAc_Ts6c_KsAh_Jd9s_Tc3c_9c5c_QsJs() {
    assertEquals(
      "Tc3c=Ts6c 8sAc 9c5c QsJs KsAh Jd9s",
      Solver.process("texas-holdem 4d8h9dKdQd 8sAc Ts6c KsAh Jd9s Tc3c 9c5c QsJs"));
  }

  @Test
  public void test_texas_holdem_4201_2s3d5h7sJd_JhTh_3h6h_7h4h() {
    assertEquals(
      "3h6h 7h4h JhTh",
      Solver.process("texas-holdem 2s3d5h7sJd JhTh 3h6h 7h4h"));
  }

  @Test
  public void test_texas_holdem_4202_2d5h5sAhJh_Th9c_Ad9d_8c2h() {
    assertEquals(
      "Th9c 8c2h Ad9d",
      Solver.process("texas-holdem 2d5h5sAhJh Th9c Ad9d 8c2h"));
  }

  @Test
  public void test_texas_holdem_4203_2c3s5d7d8h_8s3c_9d5c() {
    assertEquals(
      "9d5c 8s3c",
      Solver.process("texas-holdem 2c3s5d7d8h 8s3c 9d5c"));
  }

  @Test
  public void test_texas_holdem_4204_2h2s8sAdKs_As6s_7h8h_Td6c() {
    assertEquals(
      "Td6c 7h8h As6s",
      Solver.process("texas-holdem 2h2s8sAdKs As6s 7h8h Td6c"));
  }

  @Test
  public void test_texas_holdem_4205_6c7hQhQsTd_As7s_KsKc() {
    assertEquals(
      "As7s KsKc",
      Solver.process("texas-holdem 6c7hQhQsTd As7s KsKc"));
  }

  @Test
  public void test_texas_holdem_4206_2d5c7dQcTd_3d6h_Qd5s_Kd5h_Ah3h_7cJs_2cQh() {
    assertEquals(
      "3d6h Ah3h Kd5h 7cJs 2cQh Qd5s",
      Solver.process("texas-holdem 2d5c7dQcTd 3d6h Qd5s Kd5h Ah3h 7cJs 2cQh"));
  }

  @Test
  public void test_texas_holdem_4207_2c3c3h4dTc_JsKd_9d6h_ThAs_5sAd() {
    assertEquals(
      "9d6h JsKd ThAs 5sAd",
      Solver.process("texas-holdem 2c3c3h4dTc JsKd 9d6h ThAs 5sAd"));
  }

  @Test
  public void test_texas_holdem_4208_5h6s9sAhJh_2d2h_KdQd_8cTc() {
    assertEquals(
      "8cTc KdQd 2d2h",
      Solver.process("texas-holdem 5h6s9sAhJh 2d2h KdQd 8cTc"));
  }

  @Test
  public void test_texas_holdem_4209_8c8sAsJsTh_8d2c_6d5d_5c4c() {
    assertEquals(
      "5c4c=6d5d 8d2c",
      Solver.process("texas-holdem 8c8sAsJsTh 8d2c 6d5d 5c4c"));
  }

  @Test
  public void test_texas_holdem_4210_2c6sJcQcTc_2hTs_3h9c_As2d() {
    assertEquals(
      "As2d 2hTs 3h9c",
      Solver.process("texas-holdem 2c6sJcQcTc 2hTs 3h9c As2d"));
  }

  @Test
  public void test_texas_holdem_4211_3c5d5s9hTs_Ks7s_2d6c_Th2s_8s7c_5h2h() {
    assertEquals(
      "2d6c 8s7c Ks7s Th2s 5h2h",
      Solver.process("texas-holdem 3c5d5s9hTs Ks7s 2d6c Th2s 8s7c 5h2h"));
  }

  @Test
  public void test_texas_holdem_4212_2d3s7hKcKs_Js7d_9c2c_3h4h_Jd9s_9d6s_AhQc_6hTd() {
    assertEquals(
      "9d6s 6hTd Jd9s AhQc 9c2c 3h4h Js7d",
      Solver.process("texas-holdem 2d3s7hKcKs Js7d 9c2c 3h4h Jd9s 9d6s AhQc 6hTd"));
  }

  @Test
  public void test_texas_holdem_4213_3h4h5hJdKs_As5s_2h8d() {
    assertEquals(
      "2h8d As5s",
      Solver.process("texas-holdem 3h4h5hJdKs As5s 2h8d"));
  }

  @Test
  public void test_texas_holdem_4214_3d5h9cAhQh_2h5c_Js7s_3c7c_4c6s_4h8h_4d6c_KhQs_9sKd() {
    assertEquals(
      "4c6s=4d6c Js7s 3c7c 2h5c 9sKd KhQs 4h8h",
      Solver.process("texas-holdem 3d5h9cAhQh 2h5c Js7s 3c7c 4c6s 4h8h 4d6c KhQs 9sKd"));
  }

  @Test
  public void test_texas_holdem_4215_6d7h9cTcTd_Js5s_As4s_Ks8d_7d2s_9sQs_8hAh_Jd8s_5c9d_QdAd() {
    assertEquals(
      "Js5s As4s QdAd 7d2s 5c9d 9sQs 8hAh=Ks8d Jd8s",
      Solver.process("texas-holdem 6d7h9cTcTd Js5s As4s Ks8d 7d2s 9sQs 8hAh Jd8s 5c9d QdAd"));
  }

  @Test
  public void test_texas_holdem_4216_4c6s9dKdTd_2hKc_6hTs_Ad3h() {
    assertEquals(
      "Ad3h 2hKc 6hTs",
      Solver.process("texas-holdem 4c6s9dKdTd 2hKc 6hTs Ad3h"));
  }

  @Test
  public void test_texas_holdem_4217_4h6s8cQcTh_Jc8d_2c5h_9d2d() {
    assertEquals(
      "2c5h 9d2d Jc8d",
      Solver.process("texas-holdem 4h6s8cQcTh Jc8d 2c5h 9d2d"));
  }

  @Test
  public void test_texas_holdem_4218_6d8s9hJhKh_9s6s_3h2c_5d3c_Ah7c_6cQd_4h7s_3sTd() {
    assertEquals(
      "3h2c=5d3c 4h7s 3sTd Ah7c 6cQd 9s6s",
      Solver.process("texas-holdem 6d8s9hJhKh 9s6s 3h2c 5d3c Ah7c 6cQd 4h7s 3sTd"));
  }

  @Test
  public void test_texas_holdem_4219_3s4d7s8hJd_4cQc_3dQh() {
    assertEquals(
      "3dQh 4cQc",
      Solver.process("texas-holdem 3s4d7s8hJd 4cQc 3dQh"));
  }

  @Test
  public void test_texas_holdem_4220_2d4h5s6c9h_7d3c_Js7c_Ac7h() {
    assertEquals(
      "Js7c Ac7h 7d3c",
      Solver.process("texas-holdem 2d4h5s6c9h 7d3c Js7c Ac7h"));
  }

  @Test
  public void test_texas_holdem_4221_2c6h7sJhTc_4sKd_6dQh_8c8s_Ts8d_3c4d_7d2d_KhJd_QsTd_Qc5c() {
    assertEquals(
      "3c4d Qc5c 4sKd 6dQh 8c8s Ts8d QsTd KhJd 7d2d",
      Solver.process("texas-holdem 2c6h7sJhTc 4sKd 6dQh 8c8s Ts8d 3c4d 7d2d KhJd QsTd Qc5c"));
  }

  @Test
  public void test_texas_holdem_4222_3h5s6sQhQs_Ac8h_Td7s_8d6c() {
    assertEquals(
      "Td7s Ac8h 8d6c",
      Solver.process("texas-holdem 3h5s6sQhQs Ac8h Td7s 8d6c"));
  }

  @Test
  public void test_texas_holdem_4223_8h9cAsQcTh_9hAd_Jh5d_7c4c_7sAh_5cJc_9d4d_Kd7h_AcQh_Kh8s() {
    assertEquals(
      "7c4c Kd7h Kh8s 9d4d 7sAh 9hAd AcQh 5cJc=Jh5d",
      Solver.process("texas-holdem 8h9cAsQcTh 9hAd Jh5d 7c4c 7sAh 5cJc 9d4d Kd7h AcQh Kh8s"));
  }

  @Test
  public void test_texas_holdem_4224_5c8hAhTcTd_QdJs_4s7c_3c8c_9c8d_9d2h() {
    assertEquals(
      "4s7c 9d2h QdJs 3c8c=9c8d",
      Solver.process("texas-holdem 5c8hAhTcTd QdJs 4s7c 3c8c 9c8d 9d2h"));
  }

  @Test
  public void test_texas_holdem_4225_2h3c3s4s7h_Js7c_Ac8c() {
    assertEquals(
      "Ac8c Js7c",
      Solver.process("texas-holdem 2h3c3s4s7h Js7c Ac8c"));
  }

  @Test
  public void test_texas_holdem_4226_3c7d8dKsTd_TsJs_QcKd_Ad4s_5d5h_8c2c_5sAs() {
    assertEquals(
      "5sAs=Ad4s 5d5h 8c2c TsJs QcKd",
      Solver.process("texas-holdem 3c7d8dKsTd TsJs QcKd Ad4s 5d5h 8c2c 5sAs"));
  }

  @Test
  public void test_texas_holdem_4227_2c2d5hAcJc_2h4d_8c8s_Js9h() {
    assertEquals(
      "8c8s Js9h 2h4d",
      Solver.process("texas-holdem 2c2d5hAcJc 2h4d 8c8s Js9h"));
  }

  @Test
  public void test_texas_holdem_4228_5d5s8cJhQc_5h6s_TsTh_4d4s_7cJs_Td2s_6dTc_8h8d() {
    assertEquals(
      "6dTc=Td2s 4d4s TsTh 7cJs 5h6s 8h8d",
      Solver.process("texas-holdem 5d5s8cJhQc 5h6s TsTh 4d4s 7cJs Td2s 6dTc 8h8d"));
  }

  @Test
  public void test_texas_holdem_4229_8s9hJhQhQs_8cQc_2c7d_4h8h_KsAs_Js2s_AcTd_4d5h_Jd5d_6s3s() {
    assertEquals(
      "2c7d=4d5h=6s3s KsAs Jd5d=Js2s AcTd 4h8h 8cQc",
      Solver.process("texas-holdem 8s9hJhQhQs 8cQc 2c7d 4h8h KsAs Js2s AcTd 4d5h Jd5d 6s3s"));
  }

  @Test
  public void test_texas_holdem_4230_7c9sAdJhKs_8d9c_3d2c_2dJc_9dTd_3h5h_7dTs_Tc6c() {
    assertEquals(
      "3d2c=3h5h Tc6c 7dTs 8d9c=9dTd 2dJc",
      Solver.process("texas-holdem 7c9sAdJhKs 8d9c 3d2c 2dJc 9dTd 3h5h 7dTs Tc6c"));
  }

  @Test
  public void test_texas_holdem_4231_3h5hAdKdQs_6c5s_2cKh_2s4c_7cJc_6dJd_8h4d_7d6h_Ac9h() {
    assertEquals(
      "7d6h 8h4d 6dJd 7cJc 6c5s 2cKh Ac9h 2s4c",
      Solver.process("texas-holdem 3h5hAdKdQs 6c5s 2cKh 2s4c 7cJc 6dJd 8h4d 7d6h Ac9h"));
  }

  @Test
  public void test_texas_holdem_4232_4c6h8hKcQd_2c5s_TcAs_3c7s_Qh4s_2d7d() {
    assertEquals(
      "2c5s 2d7d=3c7s TcAs Qh4s",
      Solver.process("texas-holdem 4c6h8hKcQd 2c5s TcAs 3c7s Qh4s 2d7d"));
  }

  @Test
  public void test_texas_holdem_4233_2h5s6sJdTh_Kc4d_5c4s_Tc9h_AcQd_8c7c_Js9d_Qc7h() {
    assertEquals(
      "8c7c Qc7h Kc4d AcQd 5c4s Tc9h Js9d",
      Solver.process("texas-holdem 2h5s6sJdTh Kc4d 5c4s Tc9h AcQd 8c7c Js9d Qc7h"));
  }

  @Test
  public void test_texas_holdem_4234_2h3c4h5s8s_7d3h_4s5d_Td9c_KcAs_9dKh_9sJh_Th7s() {
    assertEquals(
      "Th7s Td9c 9sJh 9dKh 7d3h 4s5d KcAs",
      Solver.process("texas-holdem 2h3c4h5s8s 7d3h 4s5d Td9c KcAs 9dKh 9sJh Th7s"));
  }

  @Test
  public void test_texas_holdem_4235_3s6s8s9sQc_8hTh_2c6c_4sJd_Kd9c_5cTs_JsAs_7cJh_6h8c() {
    assertEquals(
      "7cJh 2c6c 8hTh Kd9c 6h8c 4sJd 5cTs JsAs",
      Solver.process("texas-holdem 3s6s8s9sQc 8hTh 2c6c 4sJd Kd9c 5cTs JsAs 7cJh 6h8c"));
  }

  @Test
  public void test_texas_holdem_4236_4h7c9hJhKd_8sAd_2h9d_Th6h_3c9s_KhJd_4sAs_7h2d() {
    assertEquals(
      "8sAd 4sAs 7h2d 2h9d=3c9s KhJd Th6h",
      Solver.process("texas-holdem 4h7c9hJhKd 8sAd 2h9d Th6h 3c9s KhJd 4sAs 7h2d"));
  }

  @Test
  public void test_texas_holdem_4237_2d5d6hQcQd_2s3s_9d8d_Ks6d() {
    assertEquals(
      "2s3s Ks6d 9d8d",
      Solver.process("texas-holdem 2d5d6hQcQd 2s3s 9d8d Ks6d"));
  }

  @Test
  public void test_texas_holdem_4238_7s8sAsJcTh_Td7h_KsKc_6c6d_8d7c_3dJh_2cJd() {
    assertEquals(
      "6c6d 2cJd=3dJh KsKc 8d7c Td7h",
      Solver.process("texas-holdem 7s8sAsJcTh Td7h KsKc 6c6d 8d7c 3dJh 2cJd"));
  }

  @Test
  public void test_texas_holdem_4239_8d8sAsJhKd_9h5h_Kh3s() {
    assertEquals(
      "9h5h Kh3s",
      Solver.process("texas-holdem 8d8sAsJhKd 9h5h Kh3s"));
  }

  @Test
  public void test_texas_holdem_4240_5h6c6hJsTc_4sKd_Ks6d_9h5c_9dKc_Qd3d_QcAh_7hAd_3s8c_Jh6s() {
    assertEquals(
      "3s8c Qd3d 4sKd=9dKc 7hAd QcAh 9h5c Ks6d Jh6s",
      Solver.process("texas-holdem 5h6c6hJsTc 4sKd Ks6d 9h5c 9dKc Qd3d QcAh 7hAd 3s8c Jh6s"));
  }

  @Test
  public void test_texas_holdem_4241_3h5sAsKdTc_5d2s_3dJc_4h3s_4s3c_8c7c_8d6d() {
    assertEquals(
      "8d6d 8c7c 4h3s=4s3c 3dJc 5d2s",
      Solver.process("texas-holdem 3h5sAsKdTc 5d2s 3dJc 4h3s 4s3c 8c7c 8d6d"));
  }

  @Test
  public void test_texas_holdem_4242_4h6h7c9sAd_5dKc_QhAc_Tc5c_7s8s_JdJh_Ks2c_2d6s_8cJs_KhTd() {
    assertEquals(
      "Tc5c 8cJs 5dKc=Ks2c KhTd 2d6s 7s8s JdJh QhAc",
      Solver.process("texas-holdem 4h6h7c9sAd 5dKc QhAc Tc5c 7s8s JdJh Ks2c 2d6s 8cJs KhTd"));
  }

  @Test
  public void test_texas_holdem_4243_AhAsJdThTs_3hTd_5cJs_3cQs_8hKd_8s6s_Tc2d_7s5s() {
    assertEquals(
      "7s5s=8s6s 3cQs 8hKd 5cJs 3hTd=Tc2d",
      Solver.process("texas-holdem AhAsJdThTs 3hTd 5cJs 3cQs 8hKd 8s6s Tc2d 7s5s"));
  }

  @Test
  public void test_texas_holdem_4244_3c3d5d7s9h_6cTs_8s4s_9dTd_QcAc_8hJd_2sKc_Th3s_5c7d_8d9c() {
    assertEquals(
      "8s4s 6cTs 8hJd 2sKc QcAc 5c7d 8d9c 9dTd Th3s",
      Solver.process("texas-holdem 3c3d5d7s9h 6cTs 8s4s 9dTd QcAc 8hJd 2sKc Th3s 5c7d 8d9c"));
  }

  @Test
  public void test_texas_holdem_4245_4c4h6s7s9h_8cQh_Jh6d_JsTh_8s9s_6cTd_9d3h_Kh8d() {
    assertEquals(
      "JsTh 8cQh Kh8d 6cTd Jh6d 9d3h 8s9s",
      Solver.process("texas-holdem 4c4h6s7s9h 8cQh Jh6d JsTh 8s9s 6cTd 9d3h Kh8d"));
  }

  @Test
  public void test_texas_holdem_4246_5d5h6h8d9s_QcJc_Ks9d() {
    assertEquals(
      "QcJc Ks9d",
      Solver.process("texas-holdem 5d5h6h8d9s QcJc Ks9d"));
  }

  @Test
  public void test_texas_holdem_4247_2s3d5sJhKc_QsAh_Qh6d_Jd2d_7c9c_8h6h_QdAc_JsQc_9s5h() {
    assertEquals(
      "8h6h 7c9c Qh6d QdAc=QsAh 9s5h JsQc Jd2d",
      Solver.process("texas-holdem 2s3d5sJhKc QsAh Qh6d Jd2d 7c9c 8h6h QdAc JsQc 9s5h"));
  }

  @Test
  public void test_texas_holdem_4248_8c8h9hKcKh_Ts8d_Jc2d_6d7c_5hQs_7hQh_2c6h_3c3d() {
    assertEquals(
      "2c6h=3c3d=6d7c Jc2d 5hQs 7hQh Ts8d",
      Solver.process("texas-holdem 8c8h9hKcKh Ts8d Jc2d 6d7c 5hQs 7hQh 2c6h 3c3d"));
  }

  @Test
  public void test_texas_holdem_4249_3s6s7s9dTs_2cQh_4h3c_9c4c_Td7c_4sQd_8h7d_JsJc_AdKc_Jh4d() {
    assertEquals(
      "Jh4d 2cQh AdKc 4h3c 9c4c Td7c 8h7d 4sQd JsJc",
      Solver.process("texas-holdem 3s6s7s9dTs 2cQh 4h3c 9c4c Td7c 4sQd 8h7d JsJc AdKc Jh4d"));
  }

}
