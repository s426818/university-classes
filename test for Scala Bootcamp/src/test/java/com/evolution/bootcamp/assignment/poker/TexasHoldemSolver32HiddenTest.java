
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TexasHoldemSolver32HiddenTest {


  @Test
  public void test_texas_holdem_8000_7d8s9cKhTh_Jh2d_JdKd_3hJc() {
    assertEquals(
      "3hJc=JdKd=Jh2d",
      Solver.process("texas-holdem 7d8s9cKhTh Jh2d JdKd 3hJc"));
  }

  @Test
  public void test_texas_holdem_8001_2h3s7d7s8h_Ac5c_8s5d_5hAd() {
    assertEquals(
      "5hAd=Ac5c 8s5d",
      Solver.process("texas-holdem 2h3s7d7s8h Ac5c 8s5d 5hAd"));
  }

  @Test
  public void test_texas_holdem_8002_2s4cAdKcTd_2hKs_JdTs_Qs5s_7s4s() {
    assertEquals(
      "Qs5s 7s4s JdTs 2hKs",
      Solver.process("texas-holdem 2s4cAdKcTd 2hKs JdTs Qs5s 7s4s"));
  }

  @Test
  public void test_texas_holdem_8003_5h5sAdAhTs_3s9d_8sAc_7c4d_2cTc_5dJh() {
    assertEquals(
      "3s9d=7c4d 2cTc 5dJh 8sAc",
      Solver.process("texas-holdem 5h5sAdAhTs 3s9d 8sAc 7c4d 2cTc 5dJh"));
  }

  @Test
  public void test_texas_holdem_8004_2s4s6c9cJc_7c8s_KhAs_6hTd_5sAd_TcTh_Ts3s() {
    assertEquals(
      "7c8s Ts3s 5sAd KhAs 6hTd TcTh",
      Solver.process("texas-holdem 2s4s6c9cJc 7c8s KhAs 6hTd 5sAd TcTh Ts3s"));
  }

  @Test
  public void test_texas_holdem_8005_4cKdKsQcQs_8h4s_JcJh_3cTc_Td9d_7h6d_9h8d_4d4h() {
    assertEquals(
      "7h6d 8h4s 9h8d 3cTc=Td9d JcJh 4d4h",
      Solver.process("texas-holdem 4cKdKsQcQs 8h4s JcJh 3cTc Td9d 7h6d 9h8d 4d4h"));
  }

  @Test
  public void test_texas_holdem_8006_2s5dAsQsTs_QhJs_7s5h_KhKd_2cAh() {
    assertEquals(
      "KhKd 2cAh 7s5h QhJs",
      Solver.process("texas-holdem 2s5dAsQsTs QhJs 7s5h KhKd 2cAh"));
  }

  @Test
  public void test_texas_holdem_8007_8d9hKsTcTs_2c5s_JcQc_9c5c() {
    assertEquals(
      "2c5s 9c5c JcQc",
      Solver.process("texas-holdem 8d9hKsTcTs 2c5s JcQc 9c5c"));
  }

  @Test
  public void test_texas_holdem_8008_2c2h5d6sTs_7d6h_Qc3c_4hJh() {
    assertEquals(
      "4hJh Qc3c 7d6h",
      Solver.process("texas-holdem 2c2h5d6sTs 7d6h Qc3c 4hJh"));
  }

  @Test
  public void test_texas_holdem_8009_3s5d6c6dJs_9s7d_TcTs_TdQh_3cAh_JhAd_6s7h() {
    assertEquals(
      "9s7d TdQh 3cAh TcTs JhAd 6s7h",
      Solver.process("texas-holdem 3s5d6c6dJs 9s7d TcTs TdQh 3cAh JhAd 6s7h"));
  }

  @Test
  public void test_texas_holdem_8010_4d7hAsKcTc_3hQd_Qs4h_Jc8c() {
    assertEquals(
      "Jc8c 3hQd Qs4h",
      Solver.process("texas-holdem 4d7hAsKcTc 3hQd Qs4h Jc8c"));
  }

  @Test
  public void test_texas_holdem_8011_2c5s8d8sKd_Js4d_3h7d_AdQs_Jd9d_4s8h_9hQh_6hKc_Qc2s() {
    assertEquals(
      "3h7d Js4d Jd9d 9hQh AdQs Qc2s 6hKc 4s8h",
      Solver.process("texas-holdem 2c5s8d8sKd Js4d 3h7d AdQs Jd9d 4s8h 9hQh 6hKc Qc2s"));
  }

  @Test
  public void test_texas_holdem_8012_5hJsKsQdTs_6cJd_As8s_6h2s_2cAd_4c2d_5cKh_6sTc_JcQh() {
    assertEquals(
      "4c2d 6h2s 6sTc 6cJd JcQh 5cKh 2cAd As8s",
      Solver.process("texas-holdem 5hJsKsQdTs 6cJd As8s 6h2s 2cAd 4c2d 5cKh 6sTc JcQh"));
  }

  @Test
  public void test_texas_holdem_8013_3h5d5s8hAs_6dTs_3c4h_2h8d_AdQc_AcKh_9dKd() {
    assertEquals(
      "6dTs 9dKd 3c4h 2h8d AdQc AcKh",
      Solver.process("texas-holdem 3h5d5s8hAs 6dTs 3c4h 2h8d AdQc AcKh 9dKd"));
  }

  @Test
  public void test_texas_holdem_8014_4c5d6dJdQh_2h6s_4d5s() {
    assertEquals(
      "2h6s 4d5s",
      Solver.process("texas-holdem 4c5d6dJdQh 2h6s 4d5s"));
  }

  @Test
  public void test_texas_holdem_8015_5h5s8c9cQs_8sKc_Ks3c_4sKh_AsTd_5c6d_TsAd_QhTh() {
    assertEquals(
      "4sKh=Ks3c AsTd=TsAd 8sKc QhTh 5c6d",
      Solver.process("texas-holdem 5h5s8c9cQs 8sKc Ks3c 4sKh AsTd 5c6d TsAd QhTh"));
  }

  @Test
  public void test_texas_holdem_8016_6d9h9sJsTc_3s8h_2dAd_2s3c_Ts7c_2c3d_6s5d() {
    assertEquals(
      "2c3d=2s3c 3s8h 2dAd 6s5d Ts7c",
      Solver.process("texas-holdem 6d9h9sJsTc 3s8h 2dAd 2s3c Ts7c 2c3d 6s5d"));
  }

  @Test
  public void test_texas_holdem_8017_8h9cJhQcTc_5h9d_3s8d_Td4h_2cTh_6h3c_JcKh_5c7c_7d2h_QdJd() {
    assertEquals(
      "2cTh=3s8d=5h9d=6h3c=7d2h=QdJd=Td4h JcKh 5c7c",
      Solver.process("texas-holdem 8h9cJhQcTc 5h9d 3s8d Td4h 2cTh 6h3c JcKh 5c7c 7d2h QdJd"));
  }

  @Test
  public void test_texas_holdem_8018_5d6d6sJsTc_4c8s_AsTh() {
    assertEquals(
      "4c8s AsTh",
      Solver.process("texas-holdem 5d6d6sJsTc 4c8s AsTh"));
  }

  @Test
  public void test_texas_holdem_8019_3d4h7hQcTh_As6d_QsJc_4s7s_3hKs_Kd6c_KhTs_5cJs() {
    assertEquals(
      "5cJs Kd6c As6d 3hKs KhTs QsJc 4s7s",
      Solver.process("texas-holdem 3d4h7hQcTh As6d QsJc 4s7s 3hKs Kd6c KhTs 5cJs"));
  }

  @Test
  public void test_texas_holdem_8020_3c5h8h9dKc_8s6h_ThAh_QcKh_Kd6d() {
    assertEquals(
      "ThAh 8s6h Kd6d QcKh",
      Solver.process("texas-holdem 3c5h8h9dKc 8s6h ThAh QcKh Kd6d"));
  }

  @Test
  public void test_texas_holdem_8021_2c2h9dJhQh_2d4c_KhAd_6dKc_Qc9h_6h3c() {
    assertEquals(
      "6h3c 6dKc KhAd Qc9h 2d4c",
      Solver.process("texas-holdem 2c2h9dJhQh 2d4c KhAd 6dKc Qc9h 6h3c"));
  }

  @Test
  public void test_texas_holdem_8022_3c5h6dJdKh_Ad4d_5d6h_9hJc_3d6s_7c7s_9d9c_8dKs_7d2h() {
    assertEquals(
      "7d2h Ad4d 7c7s 9d9c 9hJc 8dKs 3d6s 5d6h",
      Solver.process("texas-holdem 3c5h6dJdKh Ad4d 5d6h 9hJc 3d6s 7c7s 9d9c 8dKs 7d2h"));
  }

  @Test
  public void test_texas_holdem_8023_5h6d8hAcKc_Jh2d_7dQd_3d3c() {
    assertEquals(
      "Jh2d 7dQd 3d3c",
      Solver.process("texas-holdem 5h6d8hAcKc Jh2d 7dQd 3d3c"));
  }

  @Test
  public void test_texas_holdem_8024_3h7sAcAhKs_7c6c_5s2c_4hJh_Qh4s_Js2h_Jc4c() {
    assertEquals(
      "5s2c 4hJh=Jc4c=Js2h Qh4s 7c6c",
      Solver.process("texas-holdem 3h7sAcAhKs 7c6c 5s2c 4hJh Qh4s Js2h Jc4c"));
  }

  @Test
  public void test_texas_holdem_8025_5d7cAhQdTd_8c5s_KsAs_8sTc_6d9d_3d7s_ThQh_Qs3s_2cJs() {
    assertEquals(
      "2cJs 8c5s 3d7s 8sTc Qs3s KsAs ThQh 6d9d",
      Solver.process("texas-holdem 5d7cAhQdTd 8c5s KsAs 8sTc 6d9d 3d7s ThQh Qs3s 2cJs"));
  }

  @Test
  public void test_texas_holdem_8026_2c2d5dAsTs_Kh3c_5cAh_2sQd_4d7h_KcTd() {
    assertEquals(
      "4d7h Kh3c KcTd 5cAh 2sQd",
      Solver.process("texas-holdem 2c2d5dAsTs Kh3c 5cAh 2sQd 4d7h KcTd"));
  }

  @Test
  public void test_texas_holdem_8027_2h3c5hAsJs_4h5c_3d6c_8sJd_2dQc() {
    assertEquals(
      "2dQc 3d6c 8sJd 4h5c",
      Solver.process("texas-holdem 2h3c5hAsJs 4h5c 3d6c 8sJd 2dQc"));
  }

  @Test
  public void test_texas_holdem_8028_3h4s5d6c6d_QhTd_9sJc_7dTs_4dTc_2c5s_4h5h_Ad4c() {
    assertEquals(
      "9sJc QhTd 4dTc Ad4c 4h5h 2c5s 7dTs",
      Solver.process("texas-holdem 3h4s5d6c6d QhTd 9sJc 7dTs 4dTc 2c5s 4h5h Ad4c"));
  }

  @Test
  public void test_texas_holdem_8029_3d4d7dTdTh_4hAd_Qs6s() {
    assertEquals(
      "Qs6s 4hAd",
      Solver.process("texas-holdem 3d4d7dTdTh 4hAd Qs6s"));
  }

  @Test
  public void test_texas_holdem_8030_2s3h5cJdTs_9s6h_Jc7d_9h3d_5hTc_ThQd_9d2d() {
    assertEquals(
      "9s6h 9d2d 9h3d ThQd Jc7d 5hTc",
      Solver.process("texas-holdem 2s3h5cJdTs 9s6h Jc7d 9h3d 5hTc ThQd 9d2d"));
  }

  @Test
  public void test_texas_holdem_8031_3c4c5c6cAh_2s7d_4d6s_AsQs_6hTc_KcJh_Kd4h_5sQc() {
    assertEquals(
      "Kd4h AsQs 4d6s 2s7d 6hTc 5sQc KcJh",
      Solver.process("texas-holdem 3c4c5c6cAh 2s7d 4d6s AsQs 6hTc KcJh Kd4h 5sQc"));
  }

  @Test
  public void test_texas_holdem_8032_6d6s7s9hAs_Th6h_Js4s_6c5c() {
    assertEquals(
      "6c5c Th6h Js4s",
      Solver.process("texas-holdem 6d6s7s9hAs Th6h Js4s 6c5c"));
  }

  @Test
  public void test_texas_holdem_8033_2h2sAdKsTd_3d7c_JsTs_KhKc() {
    assertEquals(
      "3d7c JsTs KhKc",
      Solver.process("texas-holdem 2h2sAdKsTd 3d7c JsTs KhKc"));
  }

  @Test
  public void test_texas_holdem_8034_4s6c7sKcTs_6hAd_KsAh_3c2d_Qd8s() {
    assertEquals(
      "3c2d Qd8s 6hAd KsAh",
      Solver.process("texas-holdem 4s6c7sKcTs 6hAd KsAh 3c2d Qd8s"));
  }

  @Test
  public void test_texas_holdem_8035_2c3s9c9sQs_Kd2h_5h4d_3d7h_3c5c_Td7s_QhAc_KsJs() {
    assertEquals(
      "5h4d Td7s Kd2h 3c5c=3d7h QhAc KsJs",
      Solver.process("texas-holdem 2c3s9c9sQs Kd2h 5h4d 3d7h 3c5c Td7s QhAc KsJs"));
  }

  @Test
  public void test_texas_holdem_8036_5s6c9sAdQd_5hKh_Jd2c_9c3c_JcTs() {
    assertEquals(
      "Jd2c JcTs 5hKh 9c3c",
      Solver.process("texas-holdem 5s6c9sAdQd 5hKh Jd2c 9c3c JcTs"));
  }

  @Test
  public void test_texas_holdem_8037_2s5sJhKsQd_9d2d_Kd8c_Ad6d_Ac4d_9s3d_Th6h_Ah9c() {
    assertEquals(
      "9s3d Th6h Ac4d Ad6d Ah9c 9d2d Kd8c",
      Solver.process("texas-holdem 2s5sJhKsQd 9d2d Kd8c Ad6d Ac4d 9s3d Th6h Ah9c"));
  }

  @Test
  public void test_texas_holdem_8038_4d9sKdKhKs_7d6s_2c8s_3d4c_9h3s_4sTs_6hTh_5h5d_7h3h() {
    assertEquals(
      "7d6s=7h3h 2c8s 6hTh 3d4c=4sTs 5h5d 9h3s",
      Solver.process("texas-holdem 4d9sKdKhKs 7d6s 2c8s 3d4c 9h3s 4sTs 6hTh 5h5d 7h3h"));
  }

  @Test
  public void test_texas_holdem_8039_9hAdQdQsTc_7s2d_Js2h_5d9s_9d5s_4h4c_6s5c_8d6d_7cKd_Td3d() {
    assertEquals(
      "6s5c=7s2d=8d6d Js2h 7cKd 4h4c 5d9s=9d5s Td3d",
      Solver.process("texas-holdem 9hAdQdQsTc 7s2d Js2h 5d9s 9d5s 4h4c 6s5c 8d6d 7cKd Td3d"));
  }

  @Test
  public void test_texas_holdem_8040_2d3d7sQcTs_3hTh_Td6h() {
    assertEquals(
      "Td6h 3hTh",
      Solver.process("texas-holdem 2d3d7sQcTs 3hTh Td6h"));
  }

  @Test
  public void test_texas_holdem_8041_4c5c5h8sTh_3h8h_7sKs() {
    assertEquals(
      "7sKs 3h8h",
      Solver.process("texas-holdem 4c5c5h8sTh 3h8h 7sKs"));
  }

  @Test
  public void test_texas_holdem_8042_2d4d8sKcTs_4s5s_5d9s_Tc3c_Td8c() {
    assertEquals(
      "5d9s 4s5s Tc3c Td8c",
      Solver.process("texas-holdem 2d4d8sKcTs 4s5s 5d9s Tc3c Td8c"));
  }

  @Test
  public void test_texas_holdem_8043_3d5c6cAsTd_8s5h_4d6d_Ks7h_7d9c() {
    assertEquals(
      "7d9c Ks7h 8s5h 4d6d",
      Solver.process("texas-holdem 3d5c6cAsTd 8s5h 4d6d Ks7h 7d9c"));
  }

  @Test
  public void test_texas_holdem_8044_3h5c8d9hQc_4h4d_8sTc_9c2h_3cJd_8cTd_Ks6d_Th5s() {
    assertEquals(
      "Ks6d 3cJd 4h4d Th5s 8cTd=8sTc 9c2h",
      Solver.process("texas-holdem 3h5c8d9hQc 4h4d 8sTc 9c2h 3cJd 8cTd Ks6d Th5s"));
  }

  @Test
  public void test_texas_holdem_8045_2h9dAhJcJd_Qh4d_3hTd_AsTh_4hTs_Jh5c_4s7c_6s3s() {
    assertEquals(
      "6s3s 4s7c 3hTd=4hTs Qh4d AsTh Jh5c",
      Solver.process("texas-holdem 2h9dAhJcJd Qh4d 3hTd AsTh 4hTs Jh5c 4s7c 6s3s"));
  }

  @Test
  public void test_texas_holdem_8046_4c5s8hAdJc_Qs7c_ThKc_QcAh_4dAc_5c7d() {
    assertEquals(
      "Qs7c ThKc 5c7d QcAh 4dAc",
      Solver.process("texas-holdem 4c5s8hAdJc Qs7c ThKc QcAh 4dAc 5c7d"));
  }

  @Test
  public void test_texas_holdem_8047_3s9cKcQcTh_8h9s_7c5s_As3d_9h6c() {
    assertEquals(
      "7c5s As3d 8h9s=9h6c",
      Solver.process("texas-holdem 3s9cKcQcTh 8h9s 7c5s As3d 9h6c"));
  }

  @Test
  public void test_texas_holdem_8048_4d7s9hJhTh_6s7h_Qc2h_Tc4s_JsKc_3d8s_6d8h() {
    assertEquals(
      "Qc2h 6s7h JsKc Tc4s 3d8s=6d8h",
      Solver.process("texas-holdem 4d7s9hJhTh 6s7h Qc2h Tc4s JsKc 3d8s 6d8h"));
  }

  @Test
  public void test_texas_holdem_8049_4h4s6dKdKs_9c9d_7hJs_8s7s_Qh3d() {
    assertEquals(
      "8s7s 7hJs Qh3d 9c9d",
      Solver.process("texas-holdem 4h4s6dKdKs 9c9d 7hJs 8s7s Qh3d"));
  }

  @Test
  public void test_texas_holdem_8050_6h7h9sAhTs_9h7d_Qd6s_QsJs_3s5h_Td3c_ThAd_4dKc() {
    assertEquals(
      "3s5h QsJs 4dKc Qd6s Td3c 9h7d ThAd",
      Solver.process("texas-holdem 6h7h9sAhTs 9h7d Qd6s QsJs 3s5h Td3c ThAd 4dKc"));
  }

  @Test
  public void test_texas_holdem_8051_2h5c9cJsTc_7cAc_ThTd_5sQh() {
    assertEquals(
      "5sQh ThTd 7cAc",
      Solver.process("texas-holdem 2h5c9cJsTc 7cAc ThTd 5sQh"));
  }

  @Test
  public void test_texas_holdem_8052_6c6d8sAsJc_9h2s_JhQh_JsTd_3d9d_4dQc_Ts3h() {
    assertEquals(
      "3d9d=9h2s Ts3h 4dQc JhQh=JsTd",
      Solver.process("texas-holdem 6c6d8sAsJc 9h2s JhQh JsTd 3d9d 4dQc Ts3h"));
  }

  @Test
  public void test_texas_holdem_8053_2s3s4h7s8d_2h3h_9s4s() {
    assertEquals(
      "2h3h 9s4s",
      Solver.process("texas-holdem 2s3s4h7s8d 2h3h 9s4s"));
  }

  @Test
  public void test_texas_holdem_8054_7s9hKcQcQs_9sJh_9cAh_4s9d_8s2h_QhTh_Kd3c_6s3h_2cAc() {
    assertEquals(
      "6s3h 8s2h 2cAc 4s9d=9sJh 9cAh Kd3c QhTh",
      Solver.process("texas-holdem 7s9hKcQcQs 9sJh 9cAh 4s9d 8s2h QhTh Kd3c 6s3h 2cAc"));
  }

  @Test
  public void test_texas_holdem_8055_7c8sQdTdTs_JsAc_4sQs_Jc9c_6s8c_AsKc_3d9h() {
    assertEquals(
      "3d9h JsAc AsKc 6s8c 4sQs Jc9c",
      Solver.process("texas-holdem 7c8sQdTdTs JsAc 4sQs Jc9c 6s8c AsKc 3d9h"));
  }

  @Test
  public void test_texas_holdem_8056_3c4s5d6s8h_Ad6d_9cQc_7hTs_2cTd_8s6c_Kh8c() {
    assertEquals(
      "9cQc Ad6d Kh8c 8s6c 2cTd 7hTs",
      Solver.process("texas-holdem 3c4s5d6s8h Ad6d 9cQc 7hTs 2cTd 8s6c Kh8c"));
  }

  @Test
  public void test_texas_holdem_8057_5d5s6dJcJh_6hAh_Kc9c_QsAd_8d3c_4hQd_KsKh_5h3d() {
    assertEquals(
      "8d3c 4hQd Kc9c QsAd 6hAh KsKh 5h3d",
      Solver.process("texas-holdem 5d5s6dJcJh 6hAh Kc9c QsAd 8d3c 4hQd KsKh 5h3d"));
  }

  @Test
  public void test_texas_holdem_8058_2d3h5h7s9d_4h4s_8c6c() {
    assertEquals(
      "4h4s 8c6c",
      Solver.process("texas-holdem 2d3h5h7s9d 4h4s 8c6c"));
  }

  @Test
  public void test_texas_holdem_8059_2c3c7c9c9s_Ad5h_8d6c_4d5d_Qc8s() {
    assertEquals(
      "4d5d Ad5h 8d6c Qc8s",
      Solver.process("texas-holdem 2c3c7c9c9s Ad5h 8d6c 4d5d Qc8s"));
  }

  @Test
  public void test_texas_holdem_8060_4s9c9sJdTs_Ks3h_Kd5d_7s3d_Jh4c_3s8d_Th9h() {
    assertEquals(
      "7s3d 3s8d Kd5d=Ks3h Jh4c Th9h",
      Solver.process("texas-holdem 4s9c9sJdTs Ks3h Kd5d 7s3d Jh4c 3s8d Th9h"));
  }

  @Test
  public void test_texas_holdem_8061_3h3s6d8dTs_6cQh_Ac4c_8hTd_7dJd_6sAh_KhTh_3d3c_QsKs_9sQc() {
    assertEquals(
      "7dJd 9sQc QsKs Ac4c 6cQh 6sAh KhTh 8hTd 3d3c",
      Solver.process("texas-holdem 3h3s6d8dTs 6cQh Ac4c 8hTd 7dJd 6sAh KhTh 3d3c QsKs 9sQc"));
  }

  @Test
  public void test_texas_holdem_8062_7h9sAcAdJh_AhTd_Js7s_3d3c_QcTh_9hTc_As2s_8s4h() {
    assertEquals(
      "8s4h QcTh 3d3c 9hTc Js7s As2s AhTd",
      Solver.process("texas-holdem 7h9sAcAdJh AhTd Js7s 3d3c QcTh 9hTc As2s 8s4h"));
  }

  @Test
  public void test_texas_holdem_8063_2s5d6s8sQh_5cJd_6c4s_3c8c() {
    assertEquals(
      "5cJd 6c4s 3c8c",
      Solver.process("texas-holdem 2s5d6s8sQh 5cJd 6c4s 3c8c"));
  }

  @Test
  public void test_texas_holdem_8064_4d6d7hAdKs_4sTc_KhAh_3h7d_9c8s_5h3s_Kd7s_Qd2c() {
    assertEquals(
      "9c8s Qd2c 4sTc 3h7d Kd7s KhAh 5h3s",
      Solver.process("texas-holdem 4d6d7hAdKs 4sTc KhAh 3h7d 9c8s 5h3s Kd7s Qd2c"));
  }

  @Test
  public void test_texas_holdem_8065_2d2h6hAcJh_7c5c_5dKh_6s7h_5h3s() {
    assertEquals(
      "5h3s 7c5c 5dKh 6s7h",
      Solver.process("texas-holdem 2d2h6hAcJh 7c5c 5dKh 6s7h 5h3s"));
  }

  @Test
  public void test_texas_holdem_8066_3c6c8dAsJd_2h6d_9dKs_2d4h_QdTs() {
    assertEquals(
      "2d4h QdTs 9dKs 2h6d",
      Solver.process("texas-holdem 3c6c8dAsJd 2h6d 9dKs 2d4h QdTs"));
  }

  @Test
  public void test_texas_holdem_8067_4d4s9sQcQs_KhKd_6d5c_Jh3c_8s3h_QdKc_2h6h() {
    assertEquals(
      "2h6h=6d5c=8s3h Jh3c KhKd QdKc",
      Solver.process("texas-holdem 4d4s9sQcQs KhKd 6d5c Jh3c 8s3h QdKc 2h6h"));
  }

  @Test
  public void test_texas_holdem_8068_3d7c8sKdQh_Tc4s_4d2h_KsQc_9hKh_Js4c_5s7h() {
    assertEquals(
      "4d2h Tc4s Js4c 5s7h 9hKh KsQc",
      Solver.process("texas-holdem 3d7c8sKdQh Tc4s 4d2h KsQc 9hKh Js4c 5s7h"));
  }

  @Test
  public void test_texas_holdem_8069_2h3h9cTdTh_7dJs_5h9h_Ks9d() {
    assertEquals(
      "7dJs Ks9d 5h9h",
      Solver.process("texas-holdem 2h3h9cTdTh 7dJs 5h9h Ks9d"));
  }

  @Test
  public void test_texas_holdem_8070_3d6d7hJhKs_2dTh_JsQh_8s9c_6s4c_QdKh_5s2c_Jc2s_4h8h() {
    assertEquals(
      "5s2c 4h8h 8s9c 2dTh 6s4c Jc2s JsQh QdKh",
      Solver.process("texas-holdem 3d6d7hJhKs 2dTh JsQh 8s9c 6s4c QdKh 5s2c Jc2s 4h8h"));
  }

  @Test
  public void test_texas_holdem_8071_5h6h9sAcJd_Kc6d_8hQs_8c8s_Qd7s_4sQh_2cTs_5s2h() {
    assertEquals(
      "2cTs 4sQh Qd7s 8hQs 5s2h Kc6d 8c8s",
      Solver.process("texas-holdem 5h6h9sAcJd Kc6d 8hQs 8c8s Qd7s 4sQh 2cTs 5s2h"));
  }

  @Test
  public void test_texas_holdem_8072_2c7c8hKcQs_8c2s_5cAh_9s3c_Tc4d_8d2d_3h7d_Kh6s() {
    assertEquals(
      "9s3c Tc4d 5cAh 3h7d Kh6s 8c2s=8d2d",
      Solver.process("texas-holdem 2c7c8hKcQs 8c2s 5cAh 9s3c Tc4d 8d2d 3h7d Kh6s"));
  }

  @Test
  public void test_texas_holdem_8073_6s9cKsTdTs_7d5d_3s2d_JsJd() {
    assertEquals(
      "3s2d 7d5d JsJd",
      Solver.process("texas-holdem 6s9cKsTdTs 7d5d 3s2d JsJd"));
  }

  @Test
  public void test_texas_holdem_8074_2d7s9d9sKd_5h2c_Qs5d_QhQc_6c8d_Tc4h_AdQd() {
    assertEquals(
      "6c8d Tc4h Qs5d 5h2c QhQc AdQd",
      Solver.process("texas-holdem 2d7s9d9sKd 5h2c Qs5d QhQc 6c8d Tc4h AdQd"));
  }

  @Test
  public void test_texas_holdem_8075_2h4c4s5sQd_QhAc_Ah5h_4dQs_4h2d_6sKs() {
    assertEquals(
      "6sKs Ah5h QhAc 4h2d 4dQs",
      Solver.process("texas-holdem 2h4c4s5sQd QhAc Ah5h 4dQs 4h2d 6sKs"));
  }

  @Test
  public void test_texas_holdem_8076_2d3c8sJsTh_4hQs_7s3d_KdQd_Ad6h_4cKs_7h8d() {
    assertEquals(
      "4hQs 4cKs KdQd Ad6h 7s3d 7h8d",
      Solver.process("texas-holdem 2d3c8sJsTh 4hQs 7s3d KdQd Ad6h 4cKs 7h8d"));
  }

  @Test
  public void test_texas_holdem_8077_2h8sAcKsTh_5sKd_6h7d_TsJd_9cTc_QdKc_Kh7h() {
    assertEquals(
      "6h7d 9cTc TsJd 5sKd=Kh7h QdKc",
      Solver.process("texas-holdem 2h8sAcKsTh 5sKd 6h7d TsJd 9cTc QdKc Kh7h"));
  }

  @Test
  public void test_texas_holdem_8078_5s6c7dAsQd_3c8s_6sKs() {
    assertEquals(
      "3c8s 6sKs",
      Solver.process("texas-holdem 5s6c7dAsQd 3c8s 6sKs"));
  }

  @Test
  public void test_texas_holdem_8079_5d9d9hAsTd_4d7d_2hAh_QsJs_6s8h_6h4c_Tc3h_KsJc_3s5c() {
    assertEquals(
      "6h4c 6s8h QsJs KsJc 3s5c Tc3h 2hAh 4d7d",
      Solver.process("texas-holdem 5d9d9hAsTd 4d7d 2hAh QsJs 6s8h 6h4c Tc3h KsJc 3s5c"));
  }

  @Test
  public void test_texas_holdem_8080_6c6s7d8dQd_3sJs_QhJc_JhQc_2h8s_AsAh_Ac4d_Ad6h_5d8h() {
    assertEquals(
      "3sJs Ac4d 2h8s=5d8h JhQc=QhJc AsAh Ad6h",
      Solver.process("texas-holdem 6c6s7d8dQd 3sJs QhJc JhQc 2h8s AsAh Ac4d Ad6h 5d8h"));
  }

  @Test
  public void test_texas_holdem_8081_3s7d9cAcQd_9s3c_4d5s_Js2d_AdTd() {
    assertEquals(
      "4d5s Js2d AdTd 9s3c",
      Solver.process("texas-holdem 3s7d9cAcQd 9s3c 4d5s Js2d AdTd"));
  }

  @Test
  public void test_texas_holdem_8082_3s4cKdKhTd_9h5h_As2h_Ks6d() {
    assertEquals(
      "9h5h As2h Ks6d",
      Solver.process("texas-holdem 3s4cKdKhTd 9h5h As2h Ks6d"));
  }

  @Test
  public void test_texas_holdem_8083_6d9c9hJsKd_5d6s_Ac9d() {
    assertEquals(
      "5d6s Ac9d",
      Solver.process("texas-holdem 6d9c9hJsKd 5d6s Ac9d"));
  }

  @Test
  public void test_texas_holdem_8084_3h5h5s7dQs_2cKd_4c4d_7s6s_KcQh_AsJc() {
    assertEquals(
      "2cKd AsJc 4c4d 7s6s KcQh",
      Solver.process("texas-holdem 3h5h5s7dQs 2cKd 4c4d 7s6s KcQh AsJc"));
  }

  @Test
  public void test_texas_holdem_8085_4d8c9sAdKs_Qc5c_6h5s_3cAh_AcKd_Kh7d_As6c_9c7s_3d9d_2sTs() {
    assertEquals(
      "6h5s 2sTs Qc5c 3d9d=9c7s Kh7d 3cAh=As6c AcKd",
      Solver.process("texas-holdem 4d8c9sAdKs Qc5c 6h5s 3cAh AcKd Kh7d As6c 9c7s 3d9d 2sTs"));
  }

  @Test
  public void test_texas_holdem_8086_2c2s8d9cQh_6hQc_Ad7s_Ks8h() {
    assertEquals(
      "Ad7s Ks8h 6hQc",
      Solver.process("texas-holdem 2c2s8d9cQh 6hQc Ad7s Ks8h"));
  }

  @Test
  public void test_texas_holdem_8087_3h8hJhJsTs_6sQd_Qc9h() {
    assertEquals(
      "6sQd Qc9h",
      Solver.process("texas-holdem 3h8hJhJsTs 6sQd Qc9h"));
  }

  @Test
  public void test_texas_holdem_8088_2h5hKdQcTd_3s6s_Qs3d_5cJs_Kh6d_Th8h_Ah5d() {
    assertEquals(
      "3s6s 5cJs Ah5d Th8h Qs3d Kh6d",
      Solver.process("texas-holdem 2h5hKdQcTd 3s6s Qs3d 5cJs Kh6d Th8h Ah5d"));
  }

  @Test
  public void test_texas_holdem_8089_3h7dAcAdQd_2hJh_4hTs_Qs3d_Kh4d_6c4s_8cQc_9cJs_2d6s_5dTc() {
    assertEquals(
      "2d6s=6c4s 4hTs=5dTc 2hJh 9cJs Kh4d Qs3d 8cQc",
      Solver.process("texas-holdem 3h7dAcAdQd 2hJh 4hTs Qs3d Kh4d 6c4s 8cQc 9cJs 2d6s 5dTc"));
  }

  @Test
  public void test_texas_holdem_8090_2s3s8cJdKh_6d9h_TcTd_9c4c_6hJs_AcKs_QsAh() {
    assertEquals(
      "9c4c 6d9h QsAh TcTd 6hJs AcKs",
      Solver.process("texas-holdem 2s3s8cJdKh 6d9h TcTd 9c4c 6hJs AcKs QsAh"));
  }

  @Test
  public void test_texas_holdem_8091_2s4c7c7sAh_6c9c_3hAc() {
    assertEquals(
      "6c9c 3hAc",
      Solver.process("texas-holdem 2s4c7c7sAh 6c9c 3hAc"));
  }

  @Test
  public void test_texas_holdem_8092_5c7d7s8cAs_Qs4s_7h3s_8dKs_4hAc_3cJc() {
    assertEquals(
      "3cJc Qs4s 8dKs 4hAc 7h3s",
      Solver.process("texas-holdem 5c7d7s8cAs Qs4s 7h3s 8dKs 4hAc 3cJc"));
  }

  @Test
  public void test_texas_holdem_8093_5d6c6dJsTc_QdKs_3s7h_Ad3h_AhKc_6h2c() {
    assertEquals(
      "3s7h QdKs Ad3h AhKc 6h2c",
      Solver.process("texas-holdem 5d6c6dJsTc QdKs 3s7h Ad3h AhKc 6h2c"));
  }

  @Test
  public void test_texas_holdem_8094_2s5d7c7dAc_Qd8s_9cKc_7h6h_JhJc_3hAd_Th7s_4c9s_Ts8d_2c3d() {
    assertEquals(
      "4c9s Ts8d Qd8s 9cKc 2c3d JhJc 3hAd 7h6h Th7s",
      Solver.process("texas-holdem 2s5d7c7dAc Qd8s 9cKc 7h6h JhJc 3hAd Th7s 4c9s Ts8d 2c3d"));
  }

  @Test
  public void test_texas_holdem_8095_4d5c9cJhKd_2cTc_8c4s_Js2h_5sKh_Qd5h_4c7c_Ks9h() {
    assertEquals(
      "2cTc 4c7c=8c4s Qd5h Js2h 5sKh Ks9h",
      Solver.process("texas-holdem 4d5c9cJhKd 2cTc 8c4s Js2h 5sKh Qd5h 4c7c Ks9h"));
  }

  @Test
  public void test_texas_holdem_8096_2d6s9d9hTh_9cAh_7c3d_8d4h() {
    assertEquals(
      "7c3d 8d4h 9cAh",
      Solver.process("texas-holdem 2d6s9d9hTh 9cAh 7c3d 8d4h"));
  }

  @Test
  public void test_texas_holdem_8097_3d5s6sAsTc_8sAh_8dJh_QhTs_7s2s_4s5c_7d4h_3sTh() {
    assertEquals(
      "8dJh 4s5c QhTs 8sAh 3sTh 7d4h 7s2s",
      Solver.process("texas-holdem 3d5s6sAsTc 8sAh 8dJh QhTs 7s2s 4s5c 7d4h 3sTh"));
  }

  @Test
  public void test_texas_holdem_8098_5d6hJdKhQd_7d7s_7h9c_QhJh_Th3s_AhJs_Kd2h_TsTc_5hJc() {
    assertEquals(
      "7h9c Th3s 7d7s TsTc AhJs Kd2h 5hJc QhJh",
      Solver.process("texas-holdem 5d6hJdKhQd 7d7s 7h9c QhJh Th3s AhJs Kd2h TsTc 5hJc"));
  }

  @Test
  public void test_texas_holdem_8099_5dAcAsKcQs_2d5c_Qh5h_TsKs_Jc4c_2hJh() {
    assertEquals(
      "2hJh=Jc4c 2d5c Qh5h TsKs",
      Solver.process("texas-holdem 5dAcAsKcQs 2d5c Qh5h TsKs Jc4c 2hJh"));
  }

  @Test
  public void test_texas_holdem_8100_2d7d8s9hTd_Jh7c_JdAc_8d4d() {
    assertEquals(
      "JdAc=Jh7c 8d4d",
      Solver.process("texas-holdem 2d7d8s9hTd Jh7c JdAc 8d4d"));
  }

  @Test
  public void test_texas_holdem_8101_4c8c8d9sTs_Qh6h_8hKc_Ah5h_5sQs() {
    assertEquals(
      "5sQs=Qh6h Ah5h 8hKc",
      Solver.process("texas-holdem 4c8c8d9sTs Qh6h 8hKc Ah5h 5sQs"));
  }

  @Test
  public void test_texas_holdem_8102_6h8sKcKsQd_8hJs_3c8d_Jh9d_7hQh_2d3d_5s6c_ThTd() {
    assertEquals(
      "2d3d Jh9d 5s6c 3c8d=8hJs ThTd 7hQh",
      Solver.process("texas-holdem 6h8sKcKsQd 8hJs 3c8d Jh9d 7hQh 2d3d 5s6c ThTd"));
  }

  @Test
  public void test_texas_holdem_8103_3d4c5d6s8s_4sJh_5s3h_AsJc_7cAc_Th8d_8h2s_9sKs_6h9c() {
    assertEquals(
      "9sKs AsJc 4sJh 6h9c Th8d 5s3h 8h2s 7cAc",
      Solver.process("texas-holdem 3d4c5d6s8s 4sJh 5s3h AsJc 7cAc Th8d 8h2s 9sKs 6h9c"));
  }

  @Test
  public void test_texas_holdem_8104_6h9dAcQsTs_9sTh_2cTd_Ah8h_2s2h_Ks4s_9h3d_Qh3c_4c6c_Tc8c() {
    assertEquals(
      "Ks4s 2s2h 4c6c 9h3d 2cTd=Tc8c Qh3c Ah8h 9sTh",
      Solver.process("texas-holdem 6h9dAcQsTs 9sTh 2cTd Ah8h 2s2h Ks4s 9h3d Qh3c 4c6c Tc8c"));
  }

  @Test
  public void test_texas_holdem_8105_2c8c9hQdTd_TcKs_Js5s_4h8s_6h7d_3sQh_Ad7h_AhAs_6d4s_3dKd() {
    assertEquals(
      "6d4s 3dKd Ad7h 4h8s TcKs 3sQh AhAs 6h7d Js5s",
      Solver.process("texas-holdem 2c8c9hQdTd TcKs Js5s 4h8s 6h7d 3sQh Ad7h AhAs 6d4s 3dKd"));
  }

  @Test
  public void test_texas_holdem_8106_2d7c8cQdQh_2c8h_Jh5d_Qc4s_6d6s_KsKc_6c8s() {
    assertEquals(
      "Jh5d 6d6s 2c8h=6c8s KsKc Qc4s",
      Solver.process("texas-holdem 2d7c8cQdQh 2c8h Jh5d Qc4s 6d6s KsKc 6c8s"));
  }

  @Test
  public void test_texas_holdem_8107_3h4s5hAcTc_7cKs_9c7s() {
    assertEquals(
      "9c7s 7cKs",
      Solver.process("texas-holdem 3h4s5hAcTc 7cKs 9c7s"));
  }

  @Test
  public void test_texas_holdem_8108_3d9d9sAdJh_QcAh_9cTs() {
    assertEquals(
      "QcAh 9cTs",
      Solver.process("texas-holdem 3d9d9sAdJh QcAh 9cTs"));
  }

  @Test
  public void test_texas_holdem_8109_3c4c8c8sJh_Ks8d_6sAs_Js4h_5sTs_7d2c_Td5c_4s5h_6d7s_Qd2d() {
    assertEquals(
      "7d2c 6d7s 5sTs=Td5c Qd2d 6sAs 4s5h Js4h Ks8d",
      Solver.process("texas-holdem 3c4c8c8sJh Ks8d 6sAs Js4h 5sTs 7d2c Td5c 4s5h 6d7s Qd2d"));
  }

  @Test
  public void test_texas_holdem_8110_5c5h8hKdKh_6h3c_3dJh_3sQd() {
    assertEquals(
      "6h3c 3dJh 3sQd",
      Solver.process("texas-holdem 5c5h8hKdKh 6h3c 3dJh 3sQd"));
  }

  @Test
  public void test_texas_holdem_8111_8d8sAdKsTc_6hTs_4h2h_TdAc() {
    assertEquals(
      "4h2h 6hTs TdAc",
      Solver.process("texas-holdem 8d8sAdKsTc 6hTs 4h2h TdAc"));
  }

  @Test
  public void test_texas_holdem_8112_5dAsJdJhTs_2dKs_Kd9c_Qh6d_5h7d_6cTh_Kh5c_3d2c() {
    assertEquals(
      "3d2c Qh6d 2dKs=Kd9c 5h7d=Kh5c 6cTh",
      Solver.process("texas-holdem 5dAsJdJhTs 2dKs Kd9c Qh6d 5h7d 6cTh Kh5c 3d2c"));
  }

  @Test
  public void test_texas_holdem_8113_5c5d8sJcQh_Qd3h_4d6d_2c5s_Ac6c_Jd9c_3d2s_9hAs_KhQc() {
    assertEquals(
      "3d2s=4d6d 9hAs=Ac6c Jd9c Qd3h KhQc 2c5s",
      Solver.process("texas-holdem 5c5d8sJcQh Qd3h 4d6d 2c5s Ac6c Jd9c 3d2s 9hAs KhQc"));
  }

  @Test
  public void test_texas_holdem_8114_2c4s5c8c8h_Ks6s_2d4c_Jh8d_8s7d_JdKh() {
    assertEquals(
      "Ks6s JdKh 2d4c 8s7d Jh8d",
      Solver.process("texas-holdem 2c4s5c8c8h Ks6s 2d4c Jh8d 8s7d JdKh"));
  }

  @Test
  public void test_texas_holdem_8115_2h3c5d7cQc_JcKs_8d7d_JsTd_Qh2s_5s2c_9c9s_4d9h_8sAh_JdJh() {
    assertEquals(
      "4d9h JsTd JcKs 8sAh 8d7d 9c9s JdJh 5s2c Qh2s",
      Solver.process("texas-holdem 2h3c5d7cQc JcKs 8d7d JsTd Qh2s 5s2c 9c9s 4d9h 8sAh JdJh"));
  }

  @Test
  public void test_texas_holdem_8116_3s5h8hQsTs_QhKc_8sKd_Ks5c_5sJh_6hAd_Jc7d_Td4h_7cAh_JsTc() {
    assertEquals(
      "Jc7d 6hAd 7cAh 5sJh Ks5c 8sKd Td4h JsTc QhKc",
      Solver.process("texas-holdem 3s5h8hQsTs QhKc 8sKd Ks5c 5sJh 6hAd Jc7d Td4h 7cAh JsTc"));
  }

  @Test
  public void test_texas_holdem_8117_3h6c6h7sQc_AhAc_Ks3d_Qh5h() {
    assertEquals(
      "Ks3d Qh5h AhAc",
      Solver.process("texas-holdem 3h6c6h7sQc AhAc Ks3d Qh5h"));
  }

  @Test
  public void test_texas_holdem_8118_5s8c8dQdTh_Ac4c_5cJs() {
    assertEquals(
      "Ac4c 5cJs",
      Solver.process("texas-holdem 5s8c8dQdTh Ac4c 5cJs"));
  }

  @Test
  public void test_texas_holdem_8119_2h4h5h9cTc_6sJh_8c8s_3h2c_3s5d_TsQs_TdQh_9sAs() {
    assertEquals(
      "6sJh 3h2c 3s5d 8c8s 9sAs TdQh=TsQs",
      Solver.process("texas-holdem 2h4h5h9cTc 6sJh 8c8s 3h2c 3s5d TsQs TdQh 9sAs"));
  }

  @Test
  public void test_texas_holdem_8120_2h7c8c8hQh_KsTc_2sAh_4dJh_Js9d() {
    assertEquals(
      "4dJh Js9d KsTc 2sAh",
      Solver.process("texas-holdem 2h7c8c8hQh KsTc 2sAh 4dJh Js9d"));
  }

  @Test
  public void test_texas_holdem_8121_5d6d9hQsTc_3d4s_Jd7s_Js8h_Kc4c() {
    assertEquals(
      "3d4s Jd7s Kc4c Js8h",
      Solver.process("texas-holdem 5d6d9hQsTc 3d4s Jd7s Js8h Kc4c"));
  }

  @Test
  public void test_texas_holdem_8122_6h7dAsKsTh_3sKc_5cJc_6d8h() {
    assertEquals(
      "5cJc 6d8h 3sKc",
      Solver.process("texas-holdem 6h7dAsKsTh 3sKc 5cJc 6d8h"));
  }

  @Test
  public void test_texas_holdem_8123_8h9sJdQhQs_4h2c_8d2s_6hQc_9c3h() {
    assertEquals(
      "4h2c 8d2s 9c3h 6hQc",
      Solver.process("texas-holdem 8h9sJdQhQs 4h2c 8d2s 6hQc 9c3h"));
  }

  @Test
  public void test_texas_holdem_8124_4c7s9sJhQh_Qc7c_QdJs_Ac4h_6s3s_3cKh_6d2d_TcJc() {
    assertEquals(
      "6d2d=6s3s 3cKh Ac4h TcJc Qc7c QdJs",
      Solver.process("texas-holdem 4c7s9sJhQh Qc7c QdJs Ac4h 6s3s 3cKh 6d2d TcJc"));
  }

  @Test
  public void test_texas_holdem_8125_3d3hAcJhTs_5h2s_Js4c_9hJc_8hKc() {
    assertEquals(
      "5h2s 8hKc 9hJc=Js4c",
      Solver.process("texas-holdem 3d3hAcJhTs 5h2s Js4c 9hJc 8hKc"));
  }

  @Test
  public void test_texas_holdem_8126_2s5c5hJsQs_9sAh_9d4d_3dAs() {
    assertEquals(
      "9d4d 3dAs=9sAh",
      Solver.process("texas-holdem 2s5c5hJsQs 9sAh 9d4d 3dAs"));
  }

  @Test
  public void test_texas_holdem_8127_2hAdKdTcTd_8h7h_3d9c() {
    assertEquals(
      "8h7h 3d9c",
      Solver.process("texas-holdem 2hAdKdTcTd 8h7h 3d9c"));
  }

  @Test
  public void test_texas_holdem_8128_3h5s9c9dTd_8h9h_Qd4d_3d7s_KhQc_JhAc() {
    assertEquals(
      "Qd4d KhQc JhAc 3d7s 8h9h",
      Solver.process("texas-holdem 3h5s9c9dTd 8h9h Qd4d 3d7s KhQc JhAc"));
  }

  @Test
  public void test_texas_holdem_8129_4c6c8sKcKh_7sJc_8cJd_5h5d() {
    assertEquals(
      "7sJc 5h5d 8cJd",
      Solver.process("texas-holdem 4c6c8sKcKh 7sJc 8cJd 5h5d"));
  }

  @Test
  public void test_texas_holdem_8130_4s5d6hJhJs_3d9c_6dKs_9dTd_7dAs_5sQc_Jc7h_Th3c() {
    assertEquals(
      "3d9c Th3c 9dTd 7dAs 5sQc 6dKs Jc7h",
      Solver.process("texas-holdem 4s5d6hJhJs 3d9c 6dKs 9dTd 7dAs 5sQc Jc7h Th3c"));
  }

  @Test
  public void test_texas_holdem_8131_2c4h5sQsTs_7h8d_Jd2s() {
    assertEquals(
      "7h8d Jd2s",
      Solver.process("texas-holdem 2c4h5sQsTs 7h8d Jd2s"));
  }

  @Test
  public void test_texas_holdem_8132_7d8dJdQdTc_2d7h_3s6s_KcJs_4cQc_Ts8s_5c6h_2c3c_7s6d() {
    assertEquals(
      "2c3c=3s6s=5c6h KcJs 4cQc Ts8s 2d7h 7s6d",
      Solver.process("texas-holdem 7d8dJdQdTc 2d7h 3s6s KcJs 4cQc Ts8s 5c6h 2c3c 7s6d"));
  }

  @Test
  public void test_texas_holdem_8133_4s6hQdTdTh_8dJh_6d3h_KhQh_2dAd_8sKc_5hJc() {
    assertEquals(
      "5hJc 8dJh 8sKc 2dAd 6d3h KhQh",
      Solver.process("texas-holdem 4s6hQdTdTh 8dJh 6d3h KhQh 2dAd 8sKc 5hJc"));
  }

  @Test
  public void test_texas_holdem_8134_2c4c7c8sAh_4sTc_ThJd() {
    assertEquals(
      "ThJd 4sTc",
      Solver.process("texas-holdem 2c4c7c8sAh 4sTc ThJd"));
  }

  @Test
  public void test_texas_holdem_8135_2d6h9cJsTh_AsAh_Qh8c_4hKh_5s6s_4sTs_7c3s_Td8h_6d4d_JhKd() {
    assertEquals(
      "7c3s 4hKh 5s6s=6d4d 4sTs Td8h JhKd AsAh Qh8c",
      Solver.process("texas-holdem 2d6h9cJsTh AsAh Qh8c 4hKh 5s6s 4sTs 7c3s Td8h 6d4d JhKd"));
  }

  @Test
  public void test_texas_holdem_8136_3h4h6d7c8d_Ks9c_3d5h() {
    assertEquals(
      "Ks9c 3d5h",
      Solver.process("texas-holdem 3h4h6d7c8d Ks9c 3d5h"));
  }

  @Test
  public void test_texas_holdem_8137_5h9cAcAsQc_Jh2h_KdKc_5c8h_5d9s_3d6d() {
    assertEquals(
      "3d6d Jh2h 5c8h 5d9s KdKc",
      Solver.process("texas-holdem 5h9cAcAsQc Jh2h KdKc 5c8h 5d9s 3d6d"));
  }

  @Test
  public void test_texas_holdem_8138_4d7s9sAdKd_8cQd_Qc2h_6d2s_5d3c_9hJs_2cQs() {
    assertEquals(
      "5d3c 6d2s 2cQs=Qc2h 8cQd 9hJs",
      Solver.process("texas-holdem 4d7s9sAdKd 8cQd Qc2h 6d2s 5d3c 9hJs 2cQs"));
  }

  @Test
  public void test_texas_holdem_8139_2h5s8cAcQc_7c4c_4d9c_Kc7d_3c3s() {
    assertEquals(
      "4d9c Kc7d 3c3s 7c4c",
      Solver.process("texas-holdem 2h5s8cAcQc 7c4c 4d9c Kc7d 3c3s"));
  }

  @Test
  public void test_texas_holdem_8140_4c6c8dJsTd_KhQd_Ad4d_Qs2h_6h5d_Jh9d_4hTs() {
    assertEquals(
      "Qs2h KhQd Ad4d 6h5d Jh9d 4hTs",
      Solver.process("texas-holdem 4c6c8dJsTd KhQd Ad4d Qs2h 6h5d Jh9d 4hTs"));
  }

  @Test
  public void test_texas_holdem_8141_6h8dAhKcQc_QdJh_8s8h_5hTc_Js5s_Ts9s_2sAc_JdAs_2c9c_3cQs() {
    assertEquals(
      "2c9c 5hTc Ts9s Js5s 3cQs QdJh 2sAc JdAs 8s8h",
      Solver.process("texas-holdem 6h8dAhKcQc QdJh 8s8h 5hTc Js5s Ts9s 2sAc JdAs 2c9c 3cQs"));
  }

  @Test
  public void test_texas_holdem_8142_3s5c6c9hKc_Qd8h_Qc4c_5hAh_Jc2s_9dAc_6d8d_Js4s() {
    assertEquals(
      "Jc2s=Js4s Qd8h 5hAh 6d8d 9dAc Qc4c",
      Solver.process("texas-holdem 3s5c6c9hKc Qd8h Qc4c 5hAh Jc2s 9dAc 6d8d Js4s"));
  }

  @Test
  public void test_texas_holdem_8143_4s8hAdAhQd_5c8s_6c2d_6s9c_7d8d() {
    assertEquals(
      "6c2d 6s9c 5c8s=7d8d",
      Solver.process("texas-holdem 4s8hAdAhQd 5c8s 6c2d 6s9c 7d8d"));
  }

  @Test
  public void test_texas_holdem_8144_3s7hAdJcKh_3cAs_7s4c_6hJh_AcKc_Ks9s() {
    assertEquals(
      "7s4c 6hJh Ks9s 3cAs AcKc",
      Solver.process("texas-holdem 3s7hAdJcKh 3cAs 7s4c 6hJh AcKc Ks9s"));
  }

  @Test
  public void test_texas_holdem_8145_2h2s8h8s9s_5d6d_5s2c_3c6s_Kh5h_TsQs_Th3d_AdKd_4cKc_Td7h() {
    assertEquals(
      "3c6s=5d6d Td7h=Th3d 4cKc=Kh5h AdKd TsQs 5s2c",
      Solver.process("texas-holdem 2h2s8h8s9s 5d6d 5s2c 3c6s Kh5h TsQs Th3d AdKd 4cKc Td7h"));
  }

  @Test
  public void test_texas_holdem_8146_2c5c6d8dAh_5s3d_4cTd_AcKh() {
    assertEquals(
      "4cTd 5s3d AcKh",
      Solver.process("texas-holdem 2c5c6d8dAh 5s3d 4cTd AcKh"));
  }

  @Test
  public void test_texas_holdem_8147_2h8s9sAhQd_TsTh_7h2s_Td8d_6d6s_9c7c_5h3h() {
    assertEquals(
      "5h3h 7h2s 6d6s Td8d 9c7c TsTh",
      Solver.process("texas-holdem 2h8s9sAhQd TsTh 7h2s Td8d 6d6s 9c7c 5h3h"));
  }

  @Test
  public void test_texas_holdem_8148_4s5c5sAsTs_3sTd_2d7c() {
    assertEquals(
      "2d7c 3sTd",
      Solver.process("texas-holdem 4s5c5sAsTs 3sTd 2d7c"));
  }

  @Test
  public void test_texas_holdem_8149_3d4d6dJcKh_Td6c_AdJh_5c9s_4hJd_2s3c_9cKd_Th8d_2d4c() {
    assertEquals(
      "5c9s Th8d 2s3c 2d4c Td6c AdJh 9cKd 4hJd",
      Solver.process("texas-holdem 3d4d6dJcKh Td6c AdJh 5c9s 4hJd 2s3c 9cKd Th8d 2d4c"));
  }

  @Test
  public void test_texas_holdem_8150_6c7d9hAsJd_2h4s_KdTd_Ad5d_JcKh_8cQd_Th7s_TcQh() {
    assertEquals(
      "2h4s 8cQd TcQh KdTd Th7s JcKh Ad5d",
      Solver.process("texas-holdem 6c7d9hAsJd 2h4s KdTd Ad5d JcKh 8cQd Th7s TcQh"));
  }

  @Test
  public void test_texas_holdem_8151_7c7d8hJsKd_8s5c_As2s_Qc7h_2cKh_5hJc_3s9s() {
    assertEquals(
      "3s9s As2s 8s5c 5hJc 2cKh Qc7h",
      Solver.process("texas-holdem 7c7d8hJsKd 8s5c As2s Qc7h 2cKh 5hJc 3s9s"));
  }

  @Test
  public void test_texas_holdem_8152_2c3s8d9sTh_3dTc_9hJs_4h6d_KhQc() {
    assertEquals(
      "4h6d KhQc 9hJs 3dTc",
      Solver.process("texas-holdem 2c3s8d9sTh 3dTc 9hJs 4h6d KhQc"));
  }

  @Test
  public void test_texas_holdem_8153_3d3h7s8dJd_9h8h_4d5h_TsKd() {
    assertEquals(
      "4d5h TsKd 9h8h",
      Solver.process("texas-holdem 3d3h7s8dJd 9h8h 4d5h TsKd"));
  }

  @Test
  public void test_texas_holdem_8154_3c4dAsJhJs_3h4h_QsKc_JcQh_4s3s_6d7s_AdQc_Qd9h_6c5d_3dAh() {
    assertEquals(
      "6c5d 6d7s Qd9h QsKc 3h4h=4s3s 3dAh AdQc JcQh",
      Solver.process("texas-holdem 3c4dAsJhJs 3h4h QsKc JcQh 4s3s 6d7s AdQc Qd9h 6c5d 3dAh"));
  }

  @Test
  public void test_texas_holdem_8155_5d6cKsQcTs_ThQh_Td7s_4h2c() {
    assertEquals(
      "4h2c Td7s ThQh",
      Solver.process("texas-holdem 5d6cKsQcTs ThQh Td7s 4h2c"));
  }

  @Test
  public void test_texas_holdem_8156_3d5c7c9dTh_3s7h_Ts2h_KsQd_9h5s_Kh8s_4s8d_6c4h_AsQh() {
    assertEquals(
      "4s8d Kh8s KsQd AsQh Ts2h 3s7h 9h5s 6c4h",
      Solver.process("texas-holdem 3d5c7c9dTh 3s7h Ts2h KsQd 9h5s Kh8s 4s8d 6c4h AsQh"));
  }

  @Test
  public void test_texas_holdem_8157_2c3c8sQsTd_7hJc_8h6c_KsKh_3s4h_Kc5c_5dJh_3d6d_Th4s() {
    assertEquals(
      "5dJh 7hJc Kc5c 3d6d=3s4h 8h6c Th4s KsKh",
      Solver.process("texas-holdem 2c3c8sQsTd 7hJc 8h6c KsKh 3s4h Kc5c 5dJh 3d6d Th4s"));
  }

  @Test
  public void test_texas_holdem_8158_2s6sAhJhTd_7sKs_8c2c_QcQs_Tc2h_9c4c_5s6d_ThKc_As7d_3dQd() {
    assertEquals(
      "9c4c 3dQd 7sKs 8c2c 5s6d ThKc QcQs As7d Tc2h",
      Solver.process("texas-holdem 2s6sAhJhTd 7sKs 8c2c QcQs Tc2h 9c4c 5s6d ThKc As7d 3dQd"));
  }

  @Test
  public void test_texas_holdem_8159_4s5cAdAhJh_Qh9d_KcJs_Jc5h_2hAs_Kh3h_Tc7s_Qd6c_8cAc_3s7d() {
    assertEquals(
      "3s7d Tc7s Qd6c Qh9d Kh3h Jc5h KcJs 2hAs 8cAc",
      Solver.process("texas-holdem 4s5cAdAhJh Qh9d KcJs Jc5h 2hAs Kh3h Tc7s Qd6c 8cAc 3s7d"));
  }

  @Test
  public void test_texas_holdem_8160_3h4c4d6cJh_4sTh_AdJs_2sKd_5s3c() {
    assertEquals(
      "2sKd 5s3c AdJs 4sTh",
      Solver.process("texas-holdem 3h4c4d6cJh 4sTh AdJs 2sKd 5s3c"));
  }

  @Test
  public void test_texas_holdem_8161_6dAcAsJcQd_8h8s_4hTc_6hKd_7sAd_TdQc_3sKh() {
    assertEquals(
      "4hTc 3sKh 6hKd 8h8s TdQc 7sAd",
      Solver.process("texas-holdem 6dAcAsJcQd 8h8s 4hTc 6hKd 7sAd TdQc 3sKh"));
  }

  @Test
  public void test_texas_holdem_8162_4h8sAdAhQd_8c3h_Ac9s_9d2c_5d6d_Kc3s_4dTh() {
    assertEquals(
      "5d6d 9d2c Kc3s 4dTh 8c3h Ac9s",
      Solver.process("texas-holdem 4h8sAdAhQd 8c3h Ac9s 9d2c 5d6d Kc3s 4dTh"));
  }

  @Test
  public void test_texas_holdem_8163_2h4s8cKhQs_JsAh_Qh5h_2c3c_Ac7s_9c8d_Kd2d() {
    assertEquals(
      "Ac7s JsAh 2c3c 9c8d Qh5h Kd2d",
      Solver.process("texas-holdem 2h4s8cKhQs JsAh Qh5h 2c3c Ac7s 9c8d Kd2d"));
  }

  @Test
  public void test_texas_holdem_8164_2c2d5cQcQs_Js3d_3hQd_7d5h_2s6h_6cTs_9d5d_TcTh_Kd9c() {
    assertEquals(
      "6cTs Js3d Kd9c 7d5h 9d5d TcTh 2s6h 3hQd",
      Solver.process("texas-holdem 2c2d5cQcQs Js3d 3hQd 7d5h 2s6h 6cTs 9d5d TcTh Kd9c"));
  }

  @Test
  public void test_texas_holdem_8165_6h8h8sKsTd_TcJc_9d3c_8c3h_AsKd_Qd2s_4s6s_2h6d_9hAc() {
    assertEquals(
      "9d3c Qd2s 9hAc 2h6d=4s6s TcJc AsKd 8c3h",
      Solver.process("texas-holdem 6h8h8sKsTd TcJc 9d3c 8c3h AsKd Qd2s 4s6s 2h6d 9hAc"));
  }

  @Test
  public void test_texas_holdem_8166_6d7dJsKcQc_JcKs_Tc9d_Qs6s_2sAs_7cTh_4s4h_9s8h() {
    assertEquals(
      "9s8h 2sAs 4s4h 7cTh Qs6s JcKs Tc9d",
      Solver.process("texas-holdem 6d7dJsKcQc JcKs Tc9d Qs6s 2sAs 7cTh 4s4h 9s8h"));
  }

  @Test
  public void test_texas_holdem_8167_6d6s8hJcKs_Kh9d_9s3h() {
    assertEquals(
      "9s3h Kh9d",
      Solver.process("texas-holdem 6d6s8hJcKs Kh9d 9s3h"));
  }

  @Test
  public void test_texas_holdem_8168_2c7c7h8hTd_As8d_TcJs_JhTs_6cAd() {
    assertEquals(
      "6cAd As8d JhTs=TcJs",
      Solver.process("texas-holdem 2c7c7h8hTd As8d TcJs JhTs 6cAd"));
  }

  @Test
  public void test_texas_holdem_8169_6c7d8d9dAh_Ks8s_3s6s() {
    assertEquals(
      "3s6s Ks8s",
      Solver.process("texas-holdem 6c7d8d9dAh Ks8s 3s6s"));
  }

  @Test
  public void test_texas_holdem_8170_3d4s9sKhQc_Js3s_7hJh() {
    assertEquals(
      "7hJh Js3s",
      Solver.process("texas-holdem 3d4s9sKhQc Js3s 7hJh"));
  }

  @Test
  public void test_texas_holdem_8171_2s3c5s9cQs_QhAc_Kh8s_5hQc_3h2h_8h8d_5dJc_JhAh_2c6c_6h7h() {
    assertEquals(
      "6h7h Kh8s JhAh 2c6c 5dJc 8h8d QhAc 3h2h 5hQc",
      Solver.process("texas-holdem 2s3c5s9cQs QhAc Kh8s 5hQc 3h2h 8h8d 5dJc JhAh 2c6c 6h7h"));
  }

  @Test
  public void test_texas_holdem_8172_6h7c7s9cJh_8c9d_AhTc_QhTh_3sKd_Td3d() {
    assertEquals(
      "Td3d QhTh 3sKd AhTc 8c9d",
      Solver.process("texas-holdem 6h7c7s9cJh 8c9d AhTc QhTh 3sKd Td3d"));
  }

  @Test
  public void test_texas_holdem_8173_7s9cJcKcTs_3c7d_6c8c_4cQc_2d2s_8dAs_9dKd() {
    assertEquals(
      "2d2s 3c7d 9dKd 8dAs 6c8c 4cQc",
      Solver.process("texas-holdem 7s9cJcKcTs 3c7d 6c8c 4cQc 2d2s 8dAs 9dKd"));
  }

  @Test
  public void test_texas_holdem_8174_5s6sAdJcJs_Ks5h_5cKd_3s8c_7d9d_8s7h() {
    assertEquals(
      "3s8c 8s7h 7d9d 5cKd=Ks5h",
      Solver.process("texas-holdem 5s6sAdJcJs Ks5h 5cKd 3s8c 7d9d 8s7h"));
  }

  @Test
  public void test_texas_holdem_8175_2d3c3s8hAd_Js5c_2h7s_KsTs_ThAh_2s6h_5s4d() {
    assertEquals(
      "Js5c KsTs 2h7s=2s6h ThAh 5s4d",
      Solver.process("texas-holdem 2d3c3s8hAd Js5c 2h7s KsTs ThAh 2s6h 5s4d"));
  }

  @Test
  public void test_texas_holdem_8176_4c4s8h8sAs_Ks4h_Ts4d_Kd6d_5c7c_3hJd_TcQd() {
    assertEquals(
      "3hJd=5c7c=Kd6d=TcQd Ks4h=Ts4d",
      Solver.process("texas-holdem 4c4s8h8sAs Ks4h Ts4d Kd6d 5c7c 3hJd TcQd"));
  }

  @Test
  public void test_texas_holdem_8177_6d6s8c8dTd_2dKs_7s4s_Ts9d_QcJc_Jh3d() {
    assertEquals(
      "7s4s Jh3d QcJc 2dKs Ts9d",
      Solver.process("texas-holdem 6d6s8c8dTd 2dKs 7s4s Ts9d QcJc Jh3d"));
  }

  @Test
  public void test_texas_holdem_8178_2c4c5c7sJh_7dTd_6c7c_9s8h_9d6s_Th8s() {
    assertEquals(
      "9d6s 9s8h Th8s 7dTd 6c7c",
      Solver.process("texas-holdem 2c4c5c7sJh 7dTd 6c7c 9s8h 9d6s Th8s"));
  }

  @Test
  public void test_texas_holdem_8179_2s3s5d8hQh_4d7d_6hJh_8sJc() {
    assertEquals(
      "4d7d 6hJh 8sJc",
      Solver.process("texas-holdem 2s3s5d8hQh 4d7d 6hJh 8sJc"));
  }

  @Test
  public void test_texas_holdem_8180_6c6s8sQcTs_4h5s_JhAs_9s8h_Ac9d_5h4c_5c8d_KhTc_3cKd() {
    assertEquals(
      "4h5s=5h4c 3cKd Ac9d JhAs 5c8d=9s8h KhTc",
      Solver.process("texas-holdem 6c6s8sQcTs 4h5s JhAs 9s8h Ac9d 5h4c 5c8d KhTc 3cKd"));
  }

  @Test
  public void test_texas_holdem_8181_2s5h7h8cTs_AhJs_KsKh_7dQc_QdKd_3s4h_7s5d() {
    assertEquals(
      "3s4h QdKd AhJs 7dQc KsKh 7s5d",
      Solver.process("texas-holdem 2s5h7h8cTs AhJs KsKh 7dQc QdKd 3s4h 7s5d"));
  }

  @Test
  public void test_texas_holdem_8182_2h3d7s8sJs_JhJc_8h7d_4sQs_6h5d_KcQh_9h4d() {
    assertEquals(
      "6h5d 9h4d KcQh 8h7d JhJc 4sQs",
      Solver.process("texas-holdem 2h3d7s8sJs JhJc 8h7d 4sQs 6h5d KcQh 9h4d"));
  }

  @Test
  public void test_texas_holdem_8183_2s7d8hKsQd_7h6c_TdTh_8sQs_8cTc_3s7s() {
    assertEquals(
      "3s7s=7h6c 8cTc TdTh 8sQs",
      Solver.process("texas-holdem 2s7d8hKsQd 7h6c TdTh 8sQs 8cTc 3s7s"));
  }

  @Test
  public void test_texas_holdem_8184_4s6c8sJcTc_Kh2d_3h9d_8c4d_AdTs_5h3d() {
    assertEquals(
      "5h3d 3h9d Kh2d AdTs 8c4d",
      Solver.process("texas-holdem 4s6c8sJcTc Kh2d 3h9d 8c4d AdTs 5h3d"));
  }

  @Test
  public void test_texas_holdem_8185_2d7s9dKdTs_4s3h_5hTh_4c3d_Ah2h_8sAc() {
    assertEquals(
      "4c3d=4s3h 8sAc Ah2h 5hTh",
      Solver.process("texas-holdem 2d7s9dKdTs 4s3h 5hTh 4c3d Ah2h 8sAc"));
  }

  @Test
  public void test_texas_holdem_8186_2h5h7s9dKc_Tc5d_JcTd_Ad7h_Kd9c() {
    assertEquals(
      "JcTd Tc5d Ad7h Kd9c",
      Solver.process("texas-holdem 2h5h7s9dKc Tc5d JcTd Ad7h Kd9c"));
  }

  @Test
  public void test_texas_holdem_8187_4h8hAdJhJs_Tc6s_Th6c_2c3c_6hAh_5c9c() {
    assertEquals(
      "2c3c 5c9c Tc6s=Th6c 6hAh",
      Solver.process("texas-holdem 4h8hAdJhJs Tc6s Th6c 2c3c 6hAh 5c9c"));
  }

  @Test
  public void test_texas_holdem_8188_2c9sJhJsTc_QsAh_5s6h_8dQd_AsKd_9c7d_5d6s_ThAc_4s4d() {
    assertEquals(
      "5d6s=5s6h QsAh AsKd 4s4d 9c7d ThAc 8dQd",
      Solver.process("texas-holdem 2c9sJhJsTc QsAh 5s6h 8dQd AsKd 9c7d 5d6s ThAc 4s4d"));
  }

  @Test
  public void test_texas_holdem_8189_4sAcAdJsTs_5d3d_KhQc_4c6h_3s4d() {
    assertEquals(
      "5d3d 3s4d=4c6h KhQc",
      Solver.process("texas-holdem 4sAcAdJsTs 5d3d KhQc 4c6h 3s4d"));
  }

  @Test
  public void test_texas_holdem_8190_2h9hAcAdAs_Ks8c_9c4d_Kd5h_5d3s() {
    assertEquals(
      "5d3s Kd5h=Ks8c 9c4d",
      Solver.process("texas-holdem 2h9hAcAdAs Ks8c 9c4d Kd5h 5d3s"));
  }

  @Test
  public void test_texas_holdem_8191_4c8sQhTdTh_JsAh_9sJc_7s2c_5s8d_AdKs_QcTc_Jd3s() {
    assertEquals(
      "7s2c Jd3s JsAh AdKs 5s8d 9sJc QcTc",
      Solver.process("texas-holdem 4c8sQhTdTh JsAh 9sJc 7s2c 5s8d AdKs QcTc Jd3s"));
  }

  @Test
  public void test_texas_holdem_8192_2d2h4d7hKh_TcTd_Js2c() {
    assertEquals(
      "TcTd Js2c",
      Solver.process("texas-holdem 2d2h4d7hKh TcTd Js2c"));
  }

  @Test
  public void test_texas_holdem_8193_3h5d7d8c9h_AdKc_TsQs_Qc9d_Kd9c_6sJc_Td7h_4h6h() {
    assertEquals(
      "TsQs AdKc Td7h Qc9d Kd9c 4h6h=6sJc",
      Solver.process("texas-holdem 3h5d7d8c9h AdKc TsQs Qc9d Kd9c 6sJc Td7h 4h6h"));
  }

  @Test
  public void test_texas_holdem_8194_5h7h7sAcQs_4cTs_3s7d_Tc6h_JsJc_9hKh_4d3c_4h8s() {
    assertEquals(
      "4d3c 4h8s 4cTs=Tc6h 9hKh JsJc 3s7d",
      Solver.process("texas-holdem 5h7h7sAcQs 4cTs 3s7d Tc6h JsJc 9hKh 4d3c 4h8s"));
  }

  @Test
  public void test_texas_holdem_8195_2s3c3s5d6s_2c5s_Ad5h_9h9c() {
    assertEquals(
      "2c5s Ad5h 9h9c",
      Solver.process("texas-holdem 2s3c3s5d6s 2c5s Ad5h 9h9c"));
  }

  @Test
  public void test_texas_holdem_8196_4s6d6sAhJs_AsJh_Jd2h_8cQc_Jc9h_8d4h() {
    assertEquals(
      "8cQc 8d4h Jc9h=Jd2h AsJh",
      Solver.process("texas-holdem 4s6d6sAhJs AsJh Jd2h 8cQc Jc9h 8d4h"));
  }

  @Test
  public void test_texas_holdem_8197_6d6s8hKcQc_KsQd_9c7h_Ah3h_Th3c_9s4s() {
    assertEquals(
      "9c7h=9s4s Th3c Ah3h KsQd",
      Solver.process("texas-holdem 6d6s8hKcQc KsQd 9c7h Ah3h Th3c 9s4s"));
  }

  @Test
  public void test_texas_holdem_8198_3s5s6c6hQs_As9h_6d4s_5c6s_7dQc_2c7c() {
    assertEquals(
      "2c7c As9h 7dQc 6d4s 5c6s",
      Solver.process("texas-holdem 3s5s6c6hQs As9h 6d4s 5c6s 7dQc 2c7c"));
  }

  @Test
  public void test_texas_holdem_8199_3s4sAcKdKs_8hTh_7cKc_Tc7s_Td4d_7h6c_KhQs() {
    assertEquals(
      "7h6c Tc7s 8hTh Td4d 7cKc KhQs",
      Solver.process("texas-holdem 3s4sAcKdKs 8hTh 7cKc Tc7s Td4d 7h6c KhQs"));
  }

  @Test
  public void test_texas_holdem_8200_3d4h5s6cQd_Ts7s_6sKc_8c3h() {
    assertEquals(
      "8c3h 6sKc Ts7s",
      Solver.process("texas-holdem 3d4h5s6cQd Ts7s 6sKc 8c3h"));
  }

  @Test
  public void test_texas_holdem_8201_2c3d6d7hQd_Tc4c_Ks2h_8hAd_8s3h_7cKh() {
    assertEquals(
      "Tc4c 8hAd Ks2h 8s3h 7cKh",
      Solver.process("texas-holdem 2c3d6d7hQd Tc4c Ks2h 8hAd 8s3h 7cKh"));
  }

  @Test
  public void test_texas_holdem_8202_3d5c8d9dKh_Qh7c_4dJs_6h2d_Jd3c_6cAd_8cTs_6d9h() {
    assertEquals(
      "6h2d 4dJs Qh7c 6cAd Jd3c 8cTs 6d9h",
      Solver.process("texas-holdem 3d5c8d9dKh Qh7c 4dJs 6h2d Jd3c 6cAd 8cTs 6d9h"));
  }

  @Test
  public void test_texas_holdem_8203_2dAhJcQdTh_2h3c_AdAs_8hJs_7c5s_9dKd_Tc4s() {
    assertEquals(
      "7c5s 2h3c Tc4s 8hJs AdAs 9dKd",
      Solver.process("texas-holdem 2dAhJcQdTh 2h3c AdAs 8hJs 7c5s 9dKd Tc4s"));
  }

  @Test
  public void test_texas_holdem_8204_3d3s5d9sJd_2s8s_3c5s() {
    assertEquals(
      "2s8s 3c5s",
      Solver.process("texas-holdem 3d3s5d9sJd 2s8s 3c5s"));
  }

  @Test
  public void test_texas_holdem_8205_5h8c8d9sJc_Kh6h_7sTs() {
    assertEquals(
      "Kh6h 7sTs",
      Solver.process("texas-holdem 5h8c8d9sJc Kh6h 7sTs"));
  }

  @Test
  public void test_texas_holdem_8206_3h4c9d9hKc_8dTc_9c2d_6c9s_JdQs_7hQc_2h2s_3dQh() {
    assertEquals(
      "8dTc 7hQc JdQs 2h2s 3dQh 9c2d 6c9s",
      Solver.process("texas-holdem 3h4c9d9hKc 8dTc 9c2d 6c9s JdQs 7hQc 2h2s 3dQh"));
  }

  @Test
  public void test_texas_holdem_8207_2s3c5sAhJd_8h6c_3s5c_7h3d() {
    assertEquals(
      "8h6c 7h3d 3s5c",
      Solver.process("texas-holdem 2s3c5sAhJd 8h6c 3s5c 7h3d"));
  }

  @Test
  public void test_texas_holdem_8208_4c7d9dJcKc_2sQd_6s3d_6cKd_Ts9s_2dAd_4d7h_Jh6h_8hKh_5h7c() {
    assertEquals(
      "6s3d 2sQd 2dAd 5h7c Ts9s Jh6h 6cKd 8hKh 4d7h",
      Solver.process("texas-holdem 4c7d9dJcKc 2sQd 6s3d 6cKd Ts9s 2dAd 4d7h Jh6h 8hKh 5h7c"));
  }

  @Test
  public void test_texas_holdem_8209_2h3d6c7d8c_9s4h_8d3c_5c3h_ThTc_8hKc() {
    assertEquals(
      "9s4h 5c3h 8hKc ThTc 8d3c",
      Solver.process("texas-holdem 2h3d6c7d8c 9s4h 8d3c 5c3h ThTc 8hKc"));
  }

  @Test
  public void test_texas_holdem_8210_3c3h8sQdTs_Th9h_5cJs_8dTc_7h7c_6c2h_9cAd_JhQh_Jc4h() {
    assertEquals(
      "6c2h 5cJs=Jc4h 9cAd 7h7c Th9h 8dTc JhQh",
      Solver.process("texas-holdem 3c3h8sQdTs Th9h 5cJs 8dTc 7h7c 6c2h 9cAd JhQh Jc4h"));
  }

  @Test
  public void test_texas_holdem_8211_4s7s8cJcKh_Ac5d_3h9d_Jh6s() {
    assertEquals(
      "3h9d Ac5d Jh6s",
      Solver.process("texas-holdem 4s7s8cJcKh Ac5d 3h9d Jh6s"));
  }

  @Test
  public void test_texas_holdem_8212_3c3d4s5hTs_4c5s_2dQd_2s7c() {
    assertEquals(
      "2s7c 2dQd 4c5s",
      Solver.process("texas-holdem 3c3d4s5hTs 4c5s 2dQd 2s7c"));
  }

  @Test
  public void test_texas_holdem_8213_4h6c6hQsTc_Jh2s_9c9h_Kh4c_5c3h_5sAc_4s5h() {
    assertEquals(
      "5c3h Jh2s 5sAc 4s5h Kh4c 9c9h",
      Solver.process("texas-holdem 4h6c6hQsTc Jh2s 9c9h Kh4c 5c3h 5sAc 4s5h"));
  }

  @Test
  public void test_texas_holdem_8214_4d5h9sAsKh_Qh9d_7s3h_5s4c_Jc3s_8s6d_3d8c_Jh5c() {
    assertEquals(
      "7s3h 3d8c 8s6d Jc3s Jh5c Qh9d 5s4c",
      Solver.process("texas-holdem 4d5h9sAsKh Qh9d 7s3h 5s4c Jc3s 8s6d 3d8c Jh5c"));
  }

  @Test
  public void test_texas_holdem_8215_3c4d7h9dTd_4s2c_Ks5h_Ac6c_QhTs_4h3s_Tc5c_Jd9s() {
    assertEquals(
      "Ks5h Ac6c 4s2c Jd9s Tc5c QhTs 4h3s",
      Solver.process("texas-holdem 3c4d7h9dTd 4s2c Ks5h Ac6c QhTs 4h3s Tc5c Jd9s"));
  }

  @Test
  public void test_texas_holdem_8216_3h4s5hQcTc_Ks4h_7h3s() {
    assertEquals(
      "7h3s Ks4h",
      Solver.process("texas-holdem 3h4s5hQcTc Ks4h 7h3s"));
  }

  @Test
  public void test_texas_holdem_8217_4s9h9sAdKs_Qs7s_9dQc_Th3h_Ts6d_7c2s_4c7h() {
    assertEquals(
      "7c2s Th3h=Ts6d 4c7h 9dQc Qs7s",
      Solver.process("texas-holdem 4s9h9sAdKs Qs7s 9dQc Th3h Ts6d 7c2s 4c7h"));
  }

  @Test
  public void test_texas_holdem_8218_2s3s4d5d6s_4sKs_6d9h_8dQc_Ac5h_Qh6c_4hKc_9d7c_Td3h_8h2d() {
    assertEquals(
      "4hKc=6d9h=8dQc=8h2d=Ac5h=Qh6c=Td3h 9d7c 4sKs",
      Solver.process("texas-holdem 2s3s4d5d6s 4sKs 6d9h 8dQc Ac5h Qh6c 4hKc 9d7c Td3h 8h2d"));
  }

  @Test
  public void test_texas_holdem_8219_3d4d6d8sJd_Qh9c_ThTc() {
    assertEquals(
      "Qh9c ThTc",
      Solver.process("texas-holdem 3d4d6d8sJd Qh9c ThTc"));
  }

  @Test
  public void test_texas_holdem_8220_2h3d4c5cTc_Ks6d_8c2d_9hTd_2sAd_Kh2c_Jc6s_KdKc_3c8h() {
    assertEquals(
      "8c2d Kh2c 3c8h 9hTd KdKc 2sAd Jc6s=Ks6d",
      Solver.process("texas-holdem 2h3d4c5cTc Ks6d 8c2d 9hTd 2sAd Kh2c Jc6s KdKc 3c8h"));
  }

  @Test
  public void test_texas_holdem_8221_2d5hJsKsQs_6s2h_JdKc_Kd3c_4h5s_QhAd_8d4c_5d9s_4d8s_AcTh() {
    assertEquals(
      "4d8s=8d4c 6s2h 4h5s=5d9s QhAd Kd3c JdKc AcTh",
      Solver.process("texas-holdem 2d5hJsKsQs 6s2h JdKc Kd3c 4h5s QhAd 8d4c 5d9s 4d8s AcTh"));
  }

  @Test
  public void test_texas_holdem_8222_6hAdAsQdTd_Kd4h_Js6d_2cKh_5h2h_7d3s_Jc8d() {
    assertEquals(
      "5h2h 7d3s Jc8d 2cKh=Kd4h Js6d",
      Solver.process("texas-holdem 6hAdAsQdTd Kd4h Js6d 2cKh 5h2h 7d3s Jc8d"));
  }

  @Test
  public void test_texas_holdem_8223_3s9cJhKdKs_6d6h_Qd4h_2sAc_8c6c_5h4c() {
    assertEquals(
      "5h4c 8c6c Qd4h 2sAc 6d6h",
      Solver.process("texas-holdem 3s9cJhKdKs 6d6h Qd4h 2sAc 8c6c 5h4c"));
  }

  @Test
  public void test_texas_holdem_8224_2d7s8d9hJh_5c5h_6d9d_QhTh_8hQs_4d6s_5s7c_Ks3c_4cJs_5d3h() {
    assertEquals(
      "5d3h 4d6s Ks3c 5c5h 5s7c 8hQs 6d9d 4cJs QhTh",
      Solver.process("texas-holdem 2d7s8d9hJh 5c5h 6d9d QhTh 8hQs 4d6s 5s7c Ks3c 4cJs 5d3h"));
  }

  @Test
  public void test_texas_holdem_8225_3c5d5h9sTc_3sAd_5sQh() {
    assertEquals(
      "3sAd 5sQh",
      Solver.process("texas-holdem 3c5d5h9sTc 3sAd 5sQh"));
  }

  @Test
  public void test_texas_holdem_8226_7sJdTcTdTs_2h9h_2c4h_6h9c_8cJc_4d2s_3c8s_3sAs() {
    assertEquals(
      "2c4h=4d2s 3c8s 2h9h=6h9c 3sAs 8cJc",
      Solver.process("texas-holdem 7sJdTcTdTs 2h9h 2c4h 6h9c 8cJc 4d2s 3c8s 3sAs"));
  }

  @Test
  public void test_texas_holdem_8227_5d6s8h9dQd_8c6c_AhAd_3d9c_4c7s_Qh3c_Td5h_2h7c() {
    assertEquals(
      "Td5h 3d9c Qh3c AhAd 8c6c 2h7c=4c7s",
      Solver.process("texas-holdem 5d6s8h9dQd 8c6c AhAd 3d9c 4c7s Qh3c Td5h 2h7c"));
  }

  @Test
  public void test_texas_holdem_8228_3s5c6dJdKh_Td2h_Jh5s() {
    assertEquals(
      "Td2h Jh5s",
      Solver.process("texas-holdem 3s5c6dJdKh Td2h Jh5s"));
  }

  @Test
  public void test_texas_holdem_8229_2d6dQdQhTc_Js4d_2s9c_Ac4c_2hJc_6sAh_9sAs() {
    assertEquals(
      "Js4d Ac4c 9sAs 2s9c 2hJc 6sAh",
      Solver.process("texas-holdem 2d6dQdQhTc Js4d 2s9c Ac4c 2hJc 6sAh 9sAs"));
  }

  @Test
  public void test_texas_holdem_8230_4c4d6dKcQh_5s3s_Jc9h() {
    assertEquals(
      "5s3s Jc9h",
      Solver.process("texas-holdem 4c4d6dKcQh 5s3s Jc9h"));
  }

  @Test
  public void test_texas_holdem_8231_5cAcJsKsQd_3hTh_9s3d_2d7c_8dJd_Qc4d_As6c() {
    assertEquals(
      "2d7c 9s3d 8dJd Qc4d As6c 3hTh",
      Solver.process("texas-holdem 5cAcJsKsQd 3hTh 9s3d 2d7c 8dJd Qc4d As6c"));
  }

  @Test
  public void test_texas_holdem_8232_3d6s8d9cQh_5d9d_7hAc_TcAh_5c4s_TdQc_2cJs_KcAd_7d4c() {
    assertEquals(
      "5c4s 7d4c 2cJs 7hAc TcAh KcAd 5d9d TdQc",
      Solver.process("texas-holdem 3d6s8d9cQh 5d9d 7hAc TcAh 5c4s TdQc 2cJs KcAd 7d4c"));
  }

  @Test
  public void test_texas_holdem_8233_3h4d4s5d8h_4hAc_KcAd_7h3c_9hQc() {
    assertEquals(
      "9hQc KcAd 7h3c 4hAc",
      Solver.process("texas-holdem 3h4d4s5d8h 4hAc KcAd 7h3c 9hQc"));
  }

  @Test
  public void test_texas_holdem_8234_3d5d6s9sQd_2c6c_2dKs_6d8h_7dQs_7cJh_Td8c() {
    assertEquals(
      "Td8c 7cJh 2dKs 2c6c 6d8h 7dQs",
      Solver.process("texas-holdem 3d5d6s9sQd 2c6c 2dKs 6d8h 7dQs 7cJh Td8c"));
  }

  @Test
  public void test_texas_holdem_8235_5c5s6h9sJh_KhAd_5dKc_2h4d_Jd8d_9hJc() {
    assertEquals(
      "2h4d KhAd Jd8d 9hJc 5dKc",
      Solver.process("texas-holdem 5c5s6h9sJh KhAd 5dKc 2h4d Jd8d 9hJc"));
  }

  @Test
  public void test_texas_holdem_8236_5h8cJdTdTs_6d2h_AdQh_Kc4h_Th8h() {
    assertEquals(
      "6d2h Kc4h AdQh Th8h",
      Solver.process("texas-holdem 5h8cJdTdTs 6d2h AdQh Kc4h Th8h"));
  }

  @Test
  public void test_texas_holdem_8237_2h2s3h4sTh_3dQd_5s2c_7c6s_7dQh_7sKh_JdTs_Jh6d_5hKd_Kc6c() {
    assertEquals(
      "7c6s Jh6d 7dQh 5hKd Kc6c 7sKh 3dQd JdTs 5s2c",
      Solver.process("texas-holdem 2h2s3h4sTh 3dQd 5s2c 7c6s 7dQh 7sKh JdTs Jh6d 5hKd Kc6c"));
  }

  @Test
  public void test_texas_holdem_8238_3s5h9cKhTc_KsAh_8hKc_9s3d_QcJh_2c7h() {
    assertEquals(
      "2c7h 8hKc KsAh 9s3d QcJh",
      Solver.process("texas-holdem 3s5h9cKhTc KsAh 8hKc 9s3d QcJh 2c7h"));
  }

  @Test
  public void test_texas_holdem_8239_6hAcAhJsQs_2s9c_7c2h_Jd4s_Tc7d_7h4c_3sQh_4h8s_9h8h() {
    assertEquals(
      "7c2h=7h4c 4h8s 2s9c=9h8h Tc7d Jd4s 3sQh",
      Solver.process("texas-holdem 6hAcAhJsQs 2s9c 7c2h Jd4s Tc7d 7h4c 3sQh 4h8s 9h8h"));
  }

  @Test
  public void test_texas_holdem_8240_3h7h8hAsTc_JdTh_4sAh_TdQh_2sTs_Qs5s_Jh5d_3cKd_3s9c() {
    assertEquals(
      "Jh5d Qs5s 3s9c 3cKd 2sTs JdTh TdQh 4sAh",
      Solver.process("texas-holdem 3h7h8hAsTc JdTh 4sAh TdQh 2sTs Qs5s Jh5d 3cKd 3s9c"));
  }

  @Test
  public void test_texas_holdem_8241_3d7dAdJhTh_7c3c_4dQs_QhKs_8hJc_3s4h_4s5h_TcJd() {
    assertEquals(
      "4s5h 4dQs 3s4h 8hJc 7c3c TcJd QhKs",
      Solver.process("texas-holdem 3d7dAdJhTh 7c3c 4dQs QhKs 8hJc 3s4h 4s5h TcJd"));
  }

  @Test
  public void test_texas_holdem_8242_2s3sJdJhJs_6cTh_8cAc_6h8d_7s7c_5s5c() {
    assertEquals(
      "6h8d 6cTh 8cAc 5s5c 7s7c",
      Solver.process("texas-holdem 2s3sJdJhJs 6cTh 8cAc 6h8d 7s7c 5s5c"));
  }

  @Test
  public void test_texas_holdem_8243_7sAcJhTdTs_3d5h_KhAh_As8h_Ad3h_2h6s_4h4d() {
    assertEquals(
      "2h6s=3d5h 4h4d Ad3h=As8h KhAh",
      Solver.process("texas-holdem 7sAcJhTdTs 3d5h KhAh As8h Ad3h 2h6s 4h4d"));
  }

  @Test
  public void test_texas_holdem_8244_6d6h9dJdQd_3hAc_Ts5c_4c6c_3sKh_Jh9c_7sQc_Jc8s_QhKd() {
    assertEquals(
      "Ts5c 3sKh 3hAc Jc8s Jh9c 7sQc 4c6c QhKd",
      Solver.process("texas-holdem 6d6h9dJdQd 3hAc Ts5c 4c6c 3sKh Jh9c 7sQc Jc8s QhKd"));
  }

  @Test
  public void test_texas_holdem_8245_2s4h5d9dJh_Qs3s_6s4s() {
    assertEquals(
      "Qs3s 6s4s",
      Solver.process("texas-holdem 2s4h5d9dJh Qs3s 6s4s"));
  }

  @Test
  public void test_texas_holdem_8246_3c4c6dKcTd_KhKd_AhKs_Jd4h_7h8d_9hQs_Js4d_5h9s_3s2d_Tc8s() {
    assertEquals(
      "7h8d 5h9s 9hQs 3s2d Jd4h=Js4d Tc8s AhKs KhKd",
      Solver.process("texas-holdem 3c4c6dKcTd KhKd AhKs Jd4h 7h8d 9hQs Js4d 5h9s 3s2d Tc8s"));
  }

  @Test
  public void test_texas_holdem_8247_7c7h9dJdTh_AhQs_Ad3h_4c7d() {
    assertEquals(
      "Ad3h AhQs 4c7d",
      Solver.process("texas-holdem 7c7h9dJdTh AhQs Ad3h 4c7d"));
  }

  @Test
  public void test_texas_holdem_8248_3d6d7sJsTh_4d5h_3hTd_Ac9c_TsJh() {
    assertEquals(
      "Ac9c 3hTd TsJh 4d5h",
      Solver.process("texas-holdem 3d6d7sJsTh 4d5h 3hTd Ac9c TsJh"));
  }

  @Test
  public void test_texas_holdem_8249_3d6d8cJdTd_7c2h_2dTc_JcJh_5d3c_Kc8d_QcKd_9s4d_Qs4s_6sKh() {
    assertEquals(
      "7c2h Qs4s 6sKh JcJh 2dTc 9s4d 5d3c Kc8d QcKd",
      Solver.process("texas-holdem 3d6d8cJdTd 7c2h 2dTc JcJh 5d3c Kc8d QcKd 9s4d Qs4s 6sKh"));
  }

}
