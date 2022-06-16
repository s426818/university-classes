
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OmahaHoldemSolver4HiddenTest {


  @Test
  public void test_omaha_holdem_1000_5h6h7s8cQc_7d4dTd2h_6d5d7c3d_Js8s9cJd_7hAs9d3c_KdKh4s3s() {
    assertEquals(
      "6d5d7c3d KdKh4s3s 7d4dTd2h 7hAs9d3c=Js8s9cJd",
      Solver.process("omaha-holdem 5h6h7s8cQc 7d4dTd2h 6d5d7c3d Js8s9cJd 7hAs9d3c KdKh4s3s"));
  }

  @Test
  public void test_omaha_holdem_1001_2c3d8c8hTh_9dQcQh6s_5s7h2d7d_JsKh3c6h_Kd6d9hAd_7s2hJcQd_Kc5hAc4s_3s9c5c4d_Ks2s3hTd_TsQsJhTc() {
    assertEquals(
      "Kc5hAc4s=Kd6d9hAd 7s2hJcQd 3s9c5c4d JsKh3c6h 5s7h2d7d Ks2s3hTd 9dQcQh6s TsQsJhTc",
      Solver.process("omaha-holdem 2c3d8c8hTh 9dQcQh6s 5s7h2d7d JsKh3c6h Kd6d9hAd 7s2hJcQd Kc5hAc4s 3s9c5c4d Ks2s3hTd TsQsJhTc"));
  }

  @Test
  public void test_omaha_holdem_1002_5h7dAsJhKh_6dQc6hKd_8dQd8h5s_Qs2h3dTc_4s9hAd3c() {
    assertEquals(
      "8dQd8h5s 6dQc6hKd 4s9hAd3c Qs2h3dTc",
      Solver.process("omaha-holdem 5h7dAsJhKh 6dQc6hKd 8dQd8h5s Qs2h3dTc 4s9hAd3c"));
  }

  @Test
  public void test_omaha_holdem_1003_7c8d9cAsQd_Td7h3h5h_AdKc9s6h_6c7d2sAh() {
    assertEquals(
      "Td7h3h5h 6c7d2sAh AdKc9s6h",
      Solver.process("omaha-holdem 7c8d9cAsQd Td7h3h5h AdKc9s6h 6c7d2sAh"));
  }

  @Test
  public void test_omaha_holdem_1004_4h6sKhQsTs_9sKd9c7c_2hQd6hTc_9hAd7sKs() {
    assertEquals(
      "9sKd9c7c 2hQd6hTc 9hAd7sKs",
      Solver.process("omaha-holdem 4h6sKhQsTs 9sKd9c7c 2hQd6hTc 9hAd7sKs"));
  }

  @Test
  public void test_omaha_holdem_1005_2d7cAhJhKs_9cTcKh8c_Js9h5sAd_4h6hQh7d_6c5d5hAc_4s2s4c6s_Qc9s2h3d() {
    assertEquals(
      "Qc9s2h3d 4s2s4c6s 4h6hQh7d 9cTcKh8c 6c5d5hAc Js9h5sAd",
      Solver.process("omaha-holdem 2d7cAhJhKs 9cTcKh8c Js9h5sAd 4h6hQh7d 6c5d5hAc 4s2s4c6s Qc9s2h3d"));
  }

  @Test
  public void test_omaha_holdem_1006_8h9d9sKcTc_2h3dJs5d_JdQc9h3h_Ks8s2sJh_9c4d2d4h_Qh2cTh5c_8c7dQdTd_Ac6c4c5s() {
    assertEquals(
      "2h3dJs5d Ac6c4c5s 8c7dQdTd=Qh2cTh5c Ks8s2sJh 9c4d2d4h JdQc9h3h",
      Solver.process("omaha-holdem 8h9d9sKcTc 2h3dJs5d JdQc9h3h Ks8s2sJh 9c4d2d4h Qh2cTh5c 8c7dQdTd Ac6c4c5s"));
  }

  @Test
  public void test_omaha_holdem_1007_2c9sAsJsQd_7h2hQs4h_6h5hKc5d() {
    assertEquals(
      "6h5hKc5d 7h2hQs4h",
      Solver.process("omaha-holdem 2c9sAsJsQd 7h2hQs4h 6h5hKc5d"));
  }

  @Test
  public void test_omaha_holdem_1008_2s4s5d6c9s_4cJcQc3c_4hJd7d2d_3s8h3h4d() {
    assertEquals(
      "4hJd7d2d 3s8h3h4d=4cJcQc3c",
      Solver.process("omaha-holdem 2s4s5d6c9s 4cJcQc3c 4hJd7d2d 3s8h3h4d"));
  }

  @Test
  public void test_omaha_holdem_1009_2s7c9cKsTc_2h6c8d5h_6h7hAhKh_8c9h2cAs_TsAc9dJs_ThQd3hTd_8sJd8h5c_6dQhKdAd_4d4s5s3d_JcQs4h3s() {
    assertEquals(
      "4d4s5s3d 6dQhKdAd TsAc9dJs 6h7hAhKh ThQd3hTd 2h6c8d5h 8sJd8h5c JcQs4h3s 8c9h2cAs",
      Solver.process("omaha-holdem 2s7c9cKsTc 2h6c8d5h 6h7hAhKh 8c9h2cAs TsAc9dJs ThQd3hTd 8sJd8h5c 6dQhKdAd 4d4s5s3d JcQs4h3s"));
  }

  @Test
  public void test_omaha_holdem_1010_8s9dAsJsTs_5sKsQs4c_Tc8c7cQc_2dKh4dJc_2cJhJdQh_Qd6d5hKc_2s7s7h3d_6h7dAhTh_6c2hAd3h_8h6s9c4s() {
    assertEquals(
      "2dKh4dJc 6c2hAd3h 6h7dAhTh 2cJhJdQh=Tc8c7cQc Qd6d5hKc 8h6s9c4s 2s7s7h3d 5sKsQs4c",
      Solver.process("omaha-holdem 8s9dAsJsTs 5sKsQs4c Tc8c7cQc 2dKh4dJc 2cJhJdQh Qd6d5hKc 2s7s7h3d 6h7dAhTh 6c2hAd3h 8h6s9c4s"));
  }

  @Test
  public void test_omaha_holdem_1011_5c7cAdAsJc_Td9h4cQc_Ks5hJh7h_4d8d3sJs_3cKh8h9c_8c5s9s3d_Jd9d3h6s_Ac5dQdTc() {
    assertEquals(
      "8c5s9s3d 4d8d3sJs Jd9d3h6s Ks5hJh7h 3cKh8h9c Td9h4cQc Ac5dQdTc",
      Solver.process("omaha-holdem 5c7cAdAsJc Td9h4cQc Ks5hJh7h 4d8d3sJs 3cKh8h9c 8c5s9s3d Jd9d3h6s Ac5dQdTc"));
  }

  @Test
  public void test_omaha_holdem_1012_5h6h9cJcKd_4hTc9h4c_Qs8c5s8h_3d2cJs7d_AhKsTd6d_Kh6s8sKc_3h9s8dAc_7cTh5dQh_4dJd5cJh_2h3sQc2d() {
    assertEquals(
      "2h3sQc2d Qs8c5s8h 4hTc9h4c 3h9s8dAc 3d2cJs7d AhKsTd6d 4dJd5cJh Kh6s8sKc 7cTh5dQh",
      Solver.process("omaha-holdem 5h6h9cJcKd 4hTc9h4c Qs8c5s8h 3d2cJs7d AhKsTd6d Kh6s8sKc 3h9s8dAc 7cTh5dQh 4dJd5cJh 2h3sQc2d"));
  }

  @Test
  public void test_omaha_holdem_1013_3c3d4d9c9d_2c3h6h2s_6sKd2hTd_6d5d8s2d_Kc5sAc7s_7dTc7h4c_9hQd6cTh_8dQcJsJh_5hTsQh4h_JcKh8h8c() {
    assertEquals(
      "Kc5sAc7s 5hTsQh4h 7dTc7h4c JcKh8h8c 8dQcJsJh 2c3h6h2s 9hQd6cTh 6d5d8s2d 6sKd2hTd",
      Solver.process("omaha-holdem 3c3d4d9c9d 2c3h6h2s 6sKd2hTd 6d5d8s2d Kc5sAc7s 7dTc7h4c 9hQd6cTh 8dQcJsJh 5hTsQh4h JcKh8h8c"));
  }

  @Test
  public void test_omaha_holdem_1014_4h7sAcJsQd_5d6s7cJc_9h9s2h7d() {
    assertEquals(
      "9h9s2h7d 5d6s7cJc",
      Solver.process("omaha-holdem 4h7sAcJsQd 5d6s7cJc 9h9s2h7d"));
  }

  @Test
  public void test_omaha_holdem_1015_2c6s9cQcTd_Jc8h7hJd_6h9s7c8c_Th7sJs5d_5s8sTsTc_9h4d7d3d_AsJhKhKd_Qs3hQh4s_2s5h9d5c_2h2d3c6d() {
    assertEquals(
      "9h4d7d3d Th7sJs5d 2s5h9d5c 2h2d3c6d 5s8sTsTc Qs3hQh4s Jc8h7hJd AsJhKhKd 6h9s7c8c",
      Solver.process("omaha-holdem 2c6s9cQcTd Jc8h7hJd 6h9s7c8c Th7sJs5d 5s8sTsTc 9h4d7d3d AsJhKhKd Qs3hQh4s 2s5h9d5c 2h2d3c6d"));
  }

  @Test
  public void test_omaha_holdem_1016_3dKdTdThTs_7hQcTc3h_QdJh4c7d_8sAdKs2h_5s2cJcKh_6h4s9hJd() {
    assertEquals(
      "6h4s9hJd 5s2cJcKh 8sAdKs2h QdJh4c7d 7hQcTc3h",
      Solver.process("omaha-holdem 3dKdTdThTs 7hQcTc3h QdJh4c7d 8sAdKs2h 5s2cJcKh 6h4s9hJd"));
  }

  @Test
  public void test_omaha_holdem_1017_2h5d7d9hTc_Ac6s4s4d_2c6cJhAd_3hQsKdAh_8cKc7h8h_5c8d5hQc_2s5sKhQd() {
    assertEquals(
      "3hQsKdAh 2c6cJhAd Ac6s4s4d 8cKc7h8h 2s5sKhQd 5c8d5hQc",
      Solver.process("omaha-holdem 2h5d7d9hTc Ac6s4s4d 2c6cJhAd 3hQsKdAh 8cKc7h8h 5c8d5hQc 2s5sKhQd"));
  }

  @Test
  public void test_omaha_holdem_1018_2d3hKsTcTd_AdQcJs9h_KdKh6s5h() {
    assertEquals(
      "AdQcJs9h KdKh6s5h",
      Solver.process("omaha-holdem 2d3hKsTcTd AdQcJs9h KdKh6s5h"));
  }

  @Test
  public void test_omaha_holdem_1019_3d6s7s8sJh_6cQhTh2c_8hJd8cTc_4h2s5hJs_4cTsTd9d_Ac3sKd4d_AdAsKh7d_6hQcQd2d_2hJc3h7h_8dAh9c7c() {
    assertEquals(
      "Ac3sKd4d 6cQhTh2c 6hQcQd2d AdAsKh7d 8dAh9c7c 2hJc3h7h 8hJd8cTc 4cTsTd9d 4h2s5hJs",
      Solver.process("omaha-holdem 3d6s7s8sJh 6cQhTh2c 8hJd8cTc 4h2s5hJs 4cTsTd9d Ac3sKd4d AdAsKh7d 6hQcQd2d 2hJc3h7h 8dAh9c7c"));
  }

  @Test
  public void test_omaha_holdem_1020_3s6h9sKsTs_Ac6c2s7h_JsTc5hQh_Qs7s5d4d_9hAsJdQc_Kc2c5c7d_3h8c4h3d_Th8dKdKh_Ah9d4s4c_Jc9cTdQd() {
    assertEquals(
      "Ac6c2s7h Ah9d4s4c Kc2c5c7d 3h8c4h3d Th8dKdKh 9hAsJdQc=Jc9cTdQd=JsTc5hQh Qs7s5d4d",
      Solver.process("omaha-holdem 3s6h9sKsTs Ac6c2s7h JsTc5hQh Qs7s5d4d 9hAsJdQc Kc2c5c7d 3h8c4h3d Th8dKdKh Ah9d4s4c Jc9cTdQd"));
  }

  @Test
  public void test_omaha_holdem_1021_2d7h8dTdTs_5h6hTh2s_Qd6d6sKs() {
    assertEquals(
      "Qd6d6sKs 5h6hTh2s",
      Solver.process("omaha-holdem 2d7h8dTdTs 5h6hTh2s Qd6d6sKs"));
  }

  @Test
  public void test_omaha_holdem_1022_2s3d4c7h9c_4hAh8c9d_KhQh8sJs() {
    assertEquals(
      "KhQh8sJs 4hAh8c9d",
      Solver.process("omaha-holdem 2s3d4c7h9c 4hAh8c9d KhQh8sJs"));
  }

  @Test
  public void test_omaha_holdem_1023_6dAcKcKdQc_3c2sTs8d_ThAs2dJs_9d8hTc2h_8c5sAh4d_Jd3hAd7c_4s5d8s3d_Jh6s7d4c() {
    assertEquals(
      "4s5d8s3d 3c2sTs8d 9d8hTc2h Jh6s7d4c 8c5sAh4d Jd3hAd7c ThAs2dJs",
      Solver.process("omaha-holdem 6dAcKcKdQc 3c2sTs8d ThAs2dJs 9d8hTc2h 8c5sAh4d Jd3hAd7c 4s5d8s3d Jh6s7d4c"));
  }

  @Test
  public void test_omaha_holdem_1024_2d6hAsThTs_3dTd9cKc_7dTcAh4d_Js6d7hQs_Qc7s4c3c_3s6cQhJd_9s7c8s2s_Jh5c8h6s_JcAc9d8c_5s2hQd9h() {
    assertEquals(
      "Qc7s4c3c 9s7c8s2s 5s2hQd9h Jh5c8h6s 3s6cQhJd=Js6d7hQs JcAc9d8c 3dTd9cKc 7dTcAh4d",
      Solver.process("omaha-holdem 2d6hAsThTs 3dTd9cKc 7dTcAh4d Js6d7hQs Qc7s4c3c 3s6cQhJd 9s7c8s2s Jh5c8h6s JcAc9d8c 5s2hQd9h"));
  }

  @Test
  public void test_omaha_holdem_1025_4c4sAcJdKc_Jh8hTsTc_8s3s9h7c_2d8cQsTd_Qd5s5d5h_Ks7d4d3c_9c5cAhQh_Js8d7s9d_As6c7hJc_Th6s2h2c() {
    assertEquals(
      "8s3s9h7c Th6s2h2c Qd5s5d5h Js8d7s9d Jh8hTsTc 2d8cQsTd 9c5cAhQh As6c7hJc Ks7d4d3c",
      Solver.process("omaha-holdem 4c4sAcJdKc Jh8hTsTc 8s3s9h7c 2d8cQsTd Qd5s5d5h Ks7d4d3c 9c5cAhQh Js8d7s9d As6c7hJc Th6s2h2c"));
  }

  @Test
  public void test_omaha_holdem_1026_3d6h7sJdKd_5dAd4h9c_8s9dQcTc_Jh4dQd6d() {
    assertEquals(
      "8s9dQcTc Jh4dQd6d 5dAd4h9c",
      Solver.process("omaha-holdem 3d6h7sJdKd 5dAd4h9c 8s9dQcTc Jh4dQd6d"));
  }

  @Test
  public void test_omaha_holdem_1027_5c7sAhJcTh_7h4sAcTd_Tc8sKh5s_4c9d2s9h_Ts9s6d3h_8hKc6cQd_QsQc2h4d_6s2cQh5h() {
    assertEquals(
      "6s2cQh5h 4c9d2s9h Ts9s6d3h QsQc2h4d Tc8sKh5s 7h4sAcTd 8hKc6cQd",
      Solver.process("omaha-holdem 5c7sAhJcTh 7h4sAcTd Tc8sKh5s 4c9d2s9h Ts9s6d3h 8hKc6cQd QsQc2h4d 6s2cQh5h"));
  }

  @Test
  public void test_omaha_holdem_1028_5h7sKhTdTh_3c2d9c4h_7hTsJc2c_3s5s5d3h() {
    assertEquals(
      "3c2d9c4h 3s5s5d3h 7hTsJc2c",
      Solver.process("omaha-holdem 5h7sKhTdTh 3c2d9c4h 7hTsJc2c 3s5s5d3h"));
  }

  @Test
  public void test_omaha_holdem_1029_6d7h7sAsQd_8s4s5d6h_Jc2h3hQs_5h9s5cQc_8cAc6cKh() {
    assertEquals(
      "8s4s5d6h 5h9s5cQc Jc2h3hQs 8cAc6cKh",
      Solver.process("omaha-holdem 6d7h7sAsQd 8s4s5d6h Jc2h3hQs 5h9s5cQc 8cAc6cKh"));
  }

  @Test
  public void test_omaha_holdem_1030_2d3cJcTcTs_7c9c8d8s_Ks5cTd5h_6dAsAc2s_QcJhQsAd_9hQh8c6h() {
    assertEquals(
      "9hQh8c6h QcJhQsAd 6dAsAc2s Ks5cTd5h 7c9c8d8s",
      Solver.process("omaha-holdem 2d3cJcTcTs 7c9c8d8s Ks5cTd5h 6dAsAc2s QcJhQsAd 9hQh8c6h"));
  }

  @Test
  public void test_omaha_holdem_1031_2h3d4h6sAc_2dJhTs3s_2cQc5d2s() {
    assertEquals(
      "2dJhTs3s 2cQc5d2s",
      Solver.process("omaha-holdem 2h3d4h6sAc 2dJhTs3s 2cQc5d2s"));
  }

  @Test
  public void test_omaha_holdem_1032_7s9dKcKsTc_6hTd5cAs_6d3h9h2s_Ah6cQhAc_6s4h9sQd_KdKhJc2d() {
    assertEquals(
      "6d3h9h2s 6s4h9sQd 6hTd5cAs Ah6cQhAc KdKhJc2d",
      Solver.process("omaha-holdem 7s9dKcKsTc 6hTd5cAs 6d3h9h2s Ah6cQhAc 6s4h9sQd KdKhJc2d"));
  }

  @Test
  public void test_omaha_holdem_1033_2d2s4c7d9d_3c4d5cTs_3d6d6sTd_Jd8s9hAh() {
    assertEquals(
      "3c4d5cTs Jd8s9hAh 3d6d6sTd",
      Solver.process("omaha-holdem 2d2s4c7d9d 3c4d5cTs 3d6d6sTd Jd8s9hAh"));
  }

  @Test
  public void test_omaha_holdem_1034_2c4d5d6hAs_5hJs5c3d_4c3hKc7c_3cTh8s2h_Ts9d7sTc_6dAh8hTd() {
    assertEquals(
      "Ts9d7sTc 6dAh8hTd 3cTh8s2h=5hJs5c3d 4c3hKc7c",
      Solver.process("omaha-holdem 2c4d5d6hAs 5hJs5c3d 4c3hKc7c 3cTh8s2h Ts9d7sTc 6dAh8hTd"));
  }

  @Test
  public void test_omaha_holdem_1035_3c6c7cJdJs_9cTsKsJh_7h6dQs4d_9sQh8c7s_5h2d3d5d_KdAcTh9d_5cTd8d2s_9h7d8s6h_4c3hQcAs_2h6sJcKh() {
    assertEquals(
      "5cTd8d2s KdAcTh9d 5h2d3d5d 9h7d8s6h 7h6dQs4d=9sQh8c7s 9cTsKsJh 4c3hQcAs 2h6sJcKh",
      Solver.process("omaha-holdem 3c6c7cJdJs 9cTsKsJh 7h6dQs4d 9sQh8c7s 5h2d3d5d KdAcTh9d 5cTd8d2s 9h7d8s6h 4c3hQcAs 2h6sJcKh"));
  }

  @Test
  public void test_omaha_holdem_1036_3d5c6sQhQs_Ac7dTsAd_9h8cTh6c() {
    assertEquals(
      "9h8cTh6c Ac7dTsAd",
      Solver.process("omaha-holdem 3d5c6sQhQs Ac7dTsAd 9h8cTh6c"));
  }

  @Test
  public void test_omaha_holdem_1037_2d5s7s8dTc_8c6s5cJh_8s5h7h2c_Kd4h6dAs_Ts3d8h3h_3s4sQs2s_6h9hAc3c_Ad6cJcQd() {
    assertEquals(
      "Ad6cJcQd 3s4sQs2s 8c6s5cJh 8s5h7h2c Ts3d8h3h Kd4h6dAs 6h9hAc3c",
      Solver.process("omaha-holdem 2d5s7s8dTc 8c6s5cJh 8s5h7h2c Kd4h6dAs Ts3d8h3h 3s4sQs2s 6h9hAc3c Ad6cJcQd"));
  }

  @Test
  public void test_omaha_holdem_1038_5hAcJcKcQd_4d6s9c7d_Kd9s7c6h_8s2s2c3c_7hTdQsKs() {
    assertEquals(
      "4d6s9c7d Kd9s7c6h 7hTdQsKs 8s2s2c3c",
      Solver.process("omaha-holdem 5hAcJcKcQd 4d6s9c7d Kd9s7c6h 8s2s2c3c 7hTdQsKs"));
  }

  @Test
  public void test_omaha_holdem_1039_3s8cJcKsTc_4h8h3dKd_2c3hKh6d_9c9s8sAh_5hAsTdQc_3c8d7cAd_Qh7s2hKc_5d5s9d9h_7hAcTh6c() {
    assertEquals(
      "5d5s9d9h=9c9s8sAh Qh7s2hKc 2c3hKh6d 4h8h3dKd 5hAsTdQc 3c8d7cAd 7hAcTh6c",
      Solver.process("omaha-holdem 3s8cJcKsTc 4h8h3dKd 2c3hKh6d 9c9s8sAh 5hAsTdQc 3c8d7cAd Qh7s2hKc 5d5s9d9h 7hAcTh6c"));
  }

  @Test
  public void test_omaha_holdem_1040_3c5h5s9sJh_8sJcAhTd_2dQc8h4c_Js3h7s3s_6s6d3d6c_Ac7d4dAd_8c7cAs6h_2cKh7h5d() {
    assertEquals(
      "2dQc8h4c 8c7cAs6h 6s6d3d6c 8sJcAhTd Ac7d4dAd 2cKh7h5d Js3h7s3s",
      Solver.process("omaha-holdem 3c5h5s9sJh 8sJcAhTd 2dQc8h4c Js3h7s3s 6s6d3d6c Ac7d4dAd 8c7cAs6h 2cKh7h5d"));
  }

  @Test
  public void test_omaha_holdem_1041_AcJcJdKhQs_8cKs7hTd_6cJs2hAd_5d9h8d7c_4d6h5cTh_2sTs2dTc_4cQc4s6s() {
    assertEquals(
      "5d9h8d7c 4d6h5cTh 2sTs2dTc 4cQc4s6s 8cKs7hTd 6cJs2hAd",
      Solver.process("omaha-holdem AcJcJdKhQs 8cKs7hTd 6cJs2hAd 5d9h8d7c 4d6h5cTh 2sTs2dTc 4cQc4s6s"));
  }

  @Test
  public void test_omaha_holdem_1042_2h9cAhJdJs_Kc5sKd6c_8s6d3cAs_7cQc8cJh_Td2s5cTs_Qh9s7d3s_9d8hTc5d_3hQd4c9h() {
    assertEquals(
      "9d8hTc5d 3hQd4c9h=Qh9s7d3s Td2s5cTs Kc5sKd6c 8s6d3cAs 7cQc8cJh",
      Solver.process("omaha-holdem 2h9cAhJdJs Kc5sKd6c 8s6d3cAs 7cQc8cJh Td2s5cTs Qh9s7d3s 9d8hTc5d 3hQd4c9h"));
  }

  @Test
  public void test_omaha_holdem_1043_2s6s8s9hQh_Tc6cTs9c_3hQc7sKc_Th7d7hJs_9sKhKs4d_Jc5h8c5d_QdJdKd3s_9d2c4cAh_2h8d5s2d_5cAd3c3d() {
    assertEquals(
      "5cAd3c3d Jc5h8c5d 3hQc7sKc=QdJdKd3s 9d2c4cAh Tc6cTs9c 2h8d5s2d Th7d7hJs 9sKhKs4d",
      Solver.process("omaha-holdem 2s6s8s9hQh Tc6cTs9c 3hQc7sKc Th7d7hJs 9sKhKs4d Jc5h8c5d QdJdKd3s 9d2c4cAh 2h8d5s2d 5cAd3c3d"));
  }

  @Test
  public void test_omaha_holdem_1044_4d8dKcQsTs_5c6s7d8h_Qd7s2c3h_6dAh2hJd_Kd8c3dKs_6h7cAc3c() {
    assertEquals(
      "6h7cAc3c 5c6s7d8h Qd7s2c3h Kd8c3dKs 6dAh2hJd",
      Solver.process("omaha-holdem 4d8dKcQsTs 5c6s7d8h Qd7s2c3h 6dAh2hJd Kd8c3dKs 6h7cAc3c"));
  }

  @Test
  public void test_omaha_holdem_1045_5d6d7dJsKh_5sTd4c9c_Qd2c5c2h_6h6c4d9s() {
    assertEquals(
      "5sTd4c9c Qd2c5c2h 6h6c4d9s",
      Solver.process("omaha-holdem 5d6d7dJsKh 5sTd4c9c Qd2c5c2h 6h6c4d9s"));
  }

  @Test
  public void test_omaha_holdem_1046_2h3s6h6sAd_5sTdKd5c_4s3c9dAc_7s7h7dQc_9hJhQhTc() {
    assertEquals(
      "9hJhQhTc 5sTdKd5c 7s7h7dQc 4s3c9dAc",
      Solver.process("omaha-holdem 2h3s6h6sAd 5sTdKd5c 4s3c9dAc 7s7h7dQc 9hJhQhTc"));
  }

  @Test
  public void test_omaha_holdem_1047_3d4h7h9dTd_2hJc2dQc_JsAs6sQh_6d8h7d7c_Ac8dKs8c_Kc9s3h5h_Ts2c5cAh_9c7s3c8s() {
    assertEquals(
      "JsAs6sQh 2hJc2dQc Ac8dKs8c Ts2c5cAh Kc9s3h5h 9c7s3c8s 6d8h7d7c",
      Solver.process("omaha-holdem 3d4h7h9dTd 2hJc2dQc JsAs6sQh 6d8h7d7c Ac8dKs8c Kc9s3h5h Ts2c5cAh 9c7s3c8s"));
  }

  @Test
  public void test_omaha_holdem_1048_3c3d6cAsKc_4s7cAh9c_TsJdThTd_Kh4c8c3s_4hKdQh6s_Ad9d2hAc_2d8dJc2c_7dQsQc4d_5cJhKs9s_2s3h8s8h() {
    assertEquals(
      "TsJdThTd 7dQsQc4d 5cJhKs9s 4hKdQh6s 2s3h8s8h 4s7cAh9c 2d8dJc2c Kh4c8c3s Ad9d2hAc",
      Solver.process("omaha-holdem 3c3d6cAsKc 4s7cAh9c TsJdThTd Kh4c8c3s 4hKdQh6s Ad9d2hAc 2d8dJc2c 7dQsQc4d 5cJhKs9s 2s3h8s8h"));
  }

  @Test
  public void test_omaha_holdem_1049_6h7dAhAsKc_2s4dAcKs_8h5d2hJh() {
    assertEquals(
      "8h5d2hJh 2s4dAcKs",
      Solver.process("omaha-holdem 6h7dAhAsKc 2s4dAcKs 8h5d2hJh"));
  }

  @Test
  public void test_omaha_holdem_1050_6dAhJcKcQc_TsAd8sKh_Th3d2d8c_3cJd7cJs() {
    assertEquals(
      "Th3d2d8c TsAd8sKh 3cJd7cJs",
      Solver.process("omaha-holdem 6dAhJcKcQc TsAd8sKh Th3d2d8c 3cJd7cJs"));
  }

  @Test
  public void test_omaha_holdem_1051_5h7c7dKhTs_Kd9hJc5s_AhJs8c5c_Jd3h3s9s() {
    assertEquals(
      "Jd3h3s9s AhJs8c5c Kd9hJc5s",
      Solver.process("omaha-holdem 5h7c7dKhTs Kd9hJc5s AhJs8c5c Jd3h3s9s"));
  }

  @Test
  public void test_omaha_holdem_1052_2s3s8hAsKs_QhKdAdQc_4h3d9s8c_4dQd2d7s_6c9d6hAh_7hAc8s2h_Th5d3cJc_5cTc5h4s() {
    assertEquals(
      "4dQd2d7s Th5d3cJc 6c9d6hAh 4h3d9s8c 7hAc8s2h QhKdAdQc 5cTc5h4s",
      Solver.process("omaha-holdem 2s3s8hAsKs QhKdAdQc 4h3d9s8c 4dQd2d7s 6c9d6hAh 7hAc8s2h Th5d3cJc 5cTc5h4s"));
  }

  @Test
  public void test_omaha_holdem_1053_5c6c6h6sQh_Td4c2s8s_Th2d7h5h_AsJsJh4d_AdKhAcJd_KdQc3c5s() {
    assertEquals(
      "Th2d7h5h Td4c2s8s KdQc3c5s AsJsJh4d AdKhAcJd",
      Solver.process("omaha-holdem 5c6c6h6sQh Td4c2s8s Th2d7h5h AsJsJh4d AdKhAcJd KdQc3c5s"));
  }

  @Test
  public void test_omaha_holdem_1054_3h5h8d9dQd_7h3sQc5c_AdJd3dTh_JsKsKdAs_6d7c5d7s_Kh2dQsJc() {
    assertEquals(
      "Kh2dQsJc JsKsKdAs 7h3sQc5c 6d7c5d7s AdJd3dTh",
      Solver.process("omaha-holdem 3h5h8d9dQd 7h3sQc5c AdJd3dTh JsKsKdAs 6d7c5d7s Kh2dQsJc"));
  }

  @Test
  public void test_omaha_holdem_1055_3d9c9hAsQs_2c4sQh2h_4h6h6sKs_7c9s7h5d_3s4c6cAc_2dQc5c3h_Kd9dJhKc() {
    assertEquals(
      "4h6h6sKs 2c4sQh2h 2dQc5c3h 3s4c6cAc 7c9s7h5d Kd9dJhKc",
      Solver.process("omaha-holdem 3d9c9hAsQs 2c4sQh2h 4h6h6sKs 7c9s7h5d 3s4c6cAc 2dQc5c3h Kd9dJhKc"));
  }

  @Test
  public void test_omaha_holdem_1056_5s6s7dAdQc_TsKh8cKc_6cQd2c8h_3dAc5d9s_4c9cQhAh() {
    assertEquals(
      "TsKh8cKc 6cQd2c8h 3dAc5d9s 4c9cQhAh",
      Solver.process("omaha-holdem 5s6s7dAdQc TsKh8cKc 6cQd2c8h 3dAc5d9s 4c9cQhAh"));
  }

  @Test
  public void test_omaha_holdem_1057_3c4c8dJhTs_6h3h7d6c_4h4s5c6s() {
    assertEquals(
      "6h3h7d6c 4h4s5c6s",
      Solver.process("omaha-holdem 3c4c8dJhTs 6h3h7d6c 4h4s5c6s"));
  }

  @Test
  public void test_omaha_holdem_1058_5d5s6sAhJs_Th4c7s8c_7dAc9hKs_2h9d5c4s_Qd2d4hQc() {
    assertEquals(
      "Th4c7s8c Qd2d4hQc 7dAc9hKs 2h9d5c4s",
      Solver.process("omaha-holdem 5d5s6sAhJs Th4c7s8c 7dAc9hKs 2h9d5c4s Qd2d4hQc"));
  }

  @Test
  public void test_omaha_holdem_1059_2c6c7c8sQh_3dJsAsTc_9dJh2hTd() {
    assertEquals(
      "3dJsAsTc 9dJh2hTd",
      Solver.process("omaha-holdem 2c6c7c8sQh 3dJsAsTc 9dJh2hTd"));
  }

  @Test
  public void test_omaha_holdem_1060_2c4h7s9sAs_4c3dJc3h_QhTh4d2s_8hAh8s3c_8c6cKdJh_JdTc3s7c() {
    assertEquals(
      "8c6cKdJh 4c3dJc3h JdTc3s7c 8hAh8s3c QhTh4d2s",
      Solver.process("omaha-holdem 2c4h7s9sAs 4c3dJc3h QhTh4d2s 8hAh8s3c 8c6cKdJh JdTc3s7c"));
  }

  @Test
  public void test_omaha_holdem_1061_9cAcKhQcTh_Jc4h8d9h_2c4d4c7s_6s3d7dJd_QsQh7hJh_6hAd9s8c_3cKd4s6c_Ks3s8h8s_Tc5c5sAh() {
    assertEquals(
      "6s3d7dJd Ks3s8h8s 6hAd9s8c Jc4h8d9h QsQh7hJh 2c4d4c7s 3cKd4s6c Tc5c5sAh",
      Solver.process("omaha-holdem 9cAcKhQcTh Jc4h8d9h 2c4d4c7s 6s3d7dJd QsQh7hJh 6hAd9s8c 3cKd4s6c Ks3s8h8s Tc5c5sAh"));
  }

  @Test
  public void test_omaha_holdem_1062_7c7h8d8sKs_2c9h4sJh_Qd8hAd4d_JcAc5sTd_3h7s5cQc() {
    assertEquals(
      "2c9h4sJh JcAc5sTd 3h7s5cQc Qd8hAd4d",
      Solver.process("omaha-holdem 7c7h8d8sKs 2c9h4sJh Qd8hAd4d JcAc5sTd 3h7s5cQc"));
  }

  @Test
  public void test_omaha_holdem_1063_2c5c6sAsJs_2dQsTd6d_Th9c5h7h() {
    assertEquals(
      "Th9c5h7h 2dQsTd6d",
      Solver.process("omaha-holdem 2c5c6sAsJs 2dQsTd6d Th9c5h7h"));
  }

  @Test
  public void test_omaha_holdem_1064_5d7d7hAhQs_2c8h7s6s_4sKhJcJs_AdTd9d5c_TsJd9hQd_4hJh4d8s() {
    assertEquals(
      "4hJh4d8s 4sKhJcJs TsJd9hQd AdTd9d5c 2c8h7s6s",
      Solver.process("omaha-holdem 5d7d7hAhQs 2c8h7s6s 4sKhJcJs AdTd9d5c TsJd9hQd 4hJh4d8s"));
  }

  @Test
  public void test_omaha_holdem_1065_3c6h7cKsTd_QsKcJh5s_AcQh9hAd_2h7hTs2c() {
    assertEquals(
      "QsKcJh5s AcQh9hAd 2h7hTs2c",
      Solver.process("omaha-holdem 3c6h7cKsTd QsKcJh5s AcQh9hAd 2h7hTs2c"));
  }

  @Test
  public void test_omaha_holdem_1066_3c5c9cJhQs_Ad6c2s7c_7s3d4cKc() {
    assertEquals(
      "Ad6c2s7c 7s3d4cKc",
      Solver.process("omaha-holdem 3c5c9cJhQs Ad6c2s7c 7s3d4cKc"));
  }

  @Test
  public void test_omaha_holdem_1067_2h9c9hJcKh_7dKs6sJh_2dAh2cQc_8c7h5hQs_6hJd4s5s() {
    assertEquals(
      "6hJd4s5s 7dKs6sJh 8c7h5hQs 2dAh2cQc",
      Solver.process("omaha-holdem 2h9c9hJcKh 7dKs6sJh 2dAh2cQc 8c7h5hQs 6hJd4s5s"));
  }

  @Test
  public void test_omaha_holdem_1068_6c6d8hAhJs_8cAc2hKs_9s4c4h4s_3s2dQd7c_6hQcTc2c_5c8d3hJd_6sKcQsTh() {
    assertEquals(
      "3s2dQd7c 9s4c4h4s 5c8d3hJd 8cAc2hKs 6hQcTc2c 6sKcQsTh",
      Solver.process("omaha-holdem 6c6d8hAhJs 8cAc2hKs 9s4c4h4s 3s2dQd7c 6hQcTc2c 5c8d3hJd 6sKcQsTh"));
  }

  @Test
  public void test_omaha_holdem_1069_2h5d6hAcJs_Qd8dThTc_9h7cJhAd_3dKs8h6c() {
    assertEquals(
      "3dKs8h6c Qd8dThTc 9h7cJhAd",
      Solver.process("omaha-holdem 2h5d6hAcJs Qd8dThTc 9h7cJhAd 3dKs8h6c"));
  }

  @Test
  public void test_omaha_holdem_1070_3s8h9sAdQd_9cJh9h3h_8dKh5hJc_AhAs3cTc_QcTsQhKd_5c6d4dAc() {
    assertEquals(
      "8dKh5hJc 5c6d4dAc 9cJh9h3h QcTsQhKd AhAs3cTc",
      Solver.process("omaha-holdem 3s8h9sAdQd 9cJh9h3h 8dKh5hJc AhAs3cTc QcTsQhKd 5c6d4dAc"));
  }

  @Test
  public void test_omaha_holdem_1071_2s4c4h7dJs_6s3h2hAd_5s6h7sTs_7h8s8hKc_7c3c6d8c_AsKd9s4s_Tc5d8dQc_9c2dJh5c() {
    assertEquals(
      "Tc5d8dQc 6s3h2hAd 7c3c6d8c 5s6h7sTs 7h8s8hKc 9c2dJh5c AsKd9s4s",
      Solver.process("omaha-holdem 2s4c4h7dJs 6s3h2hAd 5s6h7sTs 7h8s8hKc 7c3c6d8c AsKd9s4s Tc5d8dQc 9c2dJh5c"));
  }

  @Test
  public void test_omaha_holdem_1072_2h5h6dJhTd_Qc8dJsTh_QsKh7h2s_4dQh5s4h_8h2cAs6c_2d3d7sQd_3cKs4s9c() {
    assertEquals(
      "2d3d7sQd 8h2cAs6c Qc8dJsTh 3cKs4s9c 4dQh5s4h QsKh7h2s",
      Solver.process("omaha-holdem 2h5h6dJhTd Qc8dJsTh QsKh7h2s 4dQh5s4h 8h2cAs6c 2d3d7sQd 3cKs4s9c"));
  }

  @Test
  public void test_omaha_holdem_1073_2h4h9dJcKc_5d9cKsJs_Jh3d8c2s() {
    assertEquals(
      "Jh3d8c2s 5d9cKsJs",
      Solver.process("omaha-holdem 2h4h9dJcKc 5d9cKsJs Jh3d8c2s"));
  }

  @Test
  public void test_omaha_holdem_1074_3h4c9cKdQs_8sTh3dJh_5c8h2dQd() {
    assertEquals(
      "5c8h2dQd 8sTh3dJh",
      Solver.process("omaha-holdem 3h4c9cKdQs 8sTh3dJh 5c8h2dQd"));
  }

  @Test
  public void test_omaha_holdem_1075_4c5d7cKdTc_Qh6d7s4s_Qd7dJdTd_Th6c3hJs_4hKs3dKc_Jh5cAd9h() {
    assertEquals(
      "Jh5cAd9h Qh6d7s4s Qd7dJdTd 4hKs3dKc Th6c3hJs",
      Solver.process("omaha-holdem 4c5d7cKdTc Qh6d7s4s Qd7dJdTd Th6c3hJs 4hKs3dKc Jh5cAd9h"));
  }

  @Test
  public void test_omaha_holdem_1076_3d4h9hAdQs_8dAsAc2h_Th9dKc2s() {
    assertEquals(
      "Th9dKc2s 8dAsAc2h",
      Solver.process("omaha-holdem 3d4h9hAdQs 8dAsAc2h Th9dKc2s"));
  }

  @Test
  public void test_omaha_holdem_1077_2s4c4sTcTh_AdKs9cJc_5h8s2dJh_2h7c6c5d_3cQc5sTd() {
    assertEquals(
      "AdKs9cJc 2h7c6c5d 5h8s2dJh 3cQc5sTd",
      Solver.process("omaha-holdem 2s4c4sTcTh AdKs9cJc 5h8s2dJh 2h7c6c5d 3cQc5sTd"));
  }

  @Test
  public void test_omaha_holdem_1078_5s9dJcJdKd_4hQc9hKc_2sQs4cTs_6h3cAcJh_2h6sAd5c_7dThKh3s() {
    assertEquals(
      "2h6sAd5c 7dThKh3s 4hQc9hKc 6h3cAcJh 2sQs4cTs",
      Solver.process("omaha-holdem 5s9dJcJdKd 4hQc9hKc 2sQs4cTs 6h3cAcJh 2h6sAd5c 7dThKh3s"));
  }

  @Test
  public void test_omaha_holdem_1079_2h4s5s8hJh_9dJs2sTh_Td6c3s9h_7h3dAc9c_9s4dQh3c_5dTs6h2d_Kh7s7d8c_5hKd8dAd_Qc3hJd6d() {
    assertEquals(
      "9s4dQh3c Kh7s7d8c 5dTs6h2d 5hKd8dAd 9dJs2sTh 7h3dAc9c Qc3hJd6d=Td6c3s9h",
      Solver.process("omaha-holdem 2h4s5s8hJh 9dJs2sTh Td6c3s9h 7h3dAc9c 9s4dQh3c 5dTs6h2d Kh7s7d8c 5hKd8dAd Qc3hJd6d"));
  }

  @Test
  public void test_omaha_holdem_1080_2c2dJdJsTc_Qh7c8sJh_Jc9h4c3h_5d4s7h8h_6cKd9d7s_Ah4h5h6h_2sQd9s8c_8d9c3c5c_Ad5s4d2h_AcAsTsKc() {
    assertEquals(
      "5d4s7h8h 8d9c3c5c 6cKd9d7s Ah4h5h6h AcAsTsKc 2sQd9s8c Ad5s4d2h Jc9h4c3h Qh7c8sJh",
      Solver.process("omaha-holdem 2c2dJdJsTc Qh7c8sJh Jc9h4c3h 5d4s7h8h 6cKd9d7s Ah4h5h6h 2sQd9s8c 8d9c3c5c Ad5s4d2h AcAsTsKc"));
  }

  @Test
  public void test_omaha_holdem_1081_2h3hAcKdKh_8c3cQd2d_Th9d7dAh_4cTsTd8s_As7c4sQc_3s6s8hTc_Qh5hQsKc_4d8d9s5d_4h6c9h5c() {
    assertEquals(
      "3s6s8hTc 8c3cQd2d 4cTsTd8s As7c4sQc 4d8d9s5d 4h6c9h5c Qh5hQsKc Th9d7dAh",
      Solver.process("omaha-holdem 2h3hAcKdKh 8c3cQd2d Th9d7dAh 4cTsTd8s As7c4sQc 3s6s8hTc Qh5hQsKc 4d8d9s5d 4h6c9h5c"));
  }

  @Test
  public void test_omaha_holdem_1082_2c4d8cJhQd_Tc6sTs3c_9hAdJc7d_6c7h6d3s() {
    assertEquals(
      "6c7h6d3s Tc6sTs3c 9hAdJc7d",
      Solver.process("omaha-holdem 2c4d8cJhQd Tc6sTs3c 9hAdJc7d 6c7h6d3s"));
  }

  @Test
  public void test_omaha_holdem_1083_8dJcKcKdTh_3d8hQhKh_QsQdJh8s_Ad9s3h9d_9c3c6cQc_4sAs7h5d_JsAh8c6d_5c7c5s7d_Td5h7sKs_2h6h4c4d() {
    assertEquals(
      "4sAs7h5d 2h6h4c4d 5c7c5s7d Ad9s3h9d JsAh8c6d QsQdJh8s 9c3c6cQc 3d8hQhKh Td5h7sKs",
      Solver.process("omaha-holdem 8dJcKcKdTh 3d8hQhKh QsQdJh8s Ad9s3h9d 9c3c6cQc 4sAs7h5d JsAh8c6d 5c7c5s7d Td5h7sKs 2h6h4c4d"));
  }

  @Test
  public void test_omaha_holdem_1084_2s8s9hJdKd_3s3hAh2c_3c7dQhQs() {
    assertEquals(
      "3s3hAh2c 3c7dQhQs",
      Solver.process("omaha-holdem 2s8s9hJdKd 3s3hAh2c 3c7dQhQs"));
  }

  @Test
  public void test_omaha_holdem_1085_2h3c3h7s9d_KcTc6sAh_4dAc4c9s() {
    assertEquals(
      "KcTc6sAh 4dAc4c9s",
      Solver.process("omaha-holdem 2h3c3h7s9d KcTc6sAh 4dAc4c9s"));
  }

  @Test
  public void test_omaha_holdem_1086_2s7c7d9sAc_QdQc8hTs_3c5c6dAs_4dThKc3d_7s5d5s2d_Kd3hKh8c_4s6hJd7h() {
    assertEquals(
      "4dThKc3d QdQc8hTs Kd3hKh8c 3c5c6dAs 4s6hJd7h 7s5d5s2d",
      Solver.process("omaha-holdem 2s7c7d9sAc QdQc8hTs 3c5c6dAs 4dThKc3d 7s5d5s2d Kd3hKh8c 4s6hJd7h"));
  }

  @Test
  public void test_omaha_holdem_1087_3c8d9d9hKs_6d2sAcAd_8sQd7cTc_8c9cKd7h() {
    assertEquals(
      "8sQd7cTc 6d2sAcAd 8c9cKd7h",
      Solver.process("omaha-holdem 3c8d9d9hKs 6d2sAcAd 8sQd7cTc 8c9cKd7h"));
  }

  @Test
  public void test_omaha_holdem_1088_3cJdJsQcTd_3h4d2h5d_Ks8c3dQs_AsAh9hAd_Jc4c6dTc_7dAc4hTh_5h8d9d3s() {
    assertEquals(
      "3h4d2h5d 7dAc4hTh Ks8c3dQs AsAh9hAd 5h8d9d3s Jc4c6dTc",
      Solver.process("omaha-holdem 3cJdJsQcTd 3h4d2h5d Ks8c3dQs AsAh9hAd Jc4c6dTc 7dAc4hTh 5h8d9d3s"));
  }

  @Test
  public void test_omaha_holdem_1089_3c4d7cJhKc_2h9sJc9d_Th7h5dKs_4c7d7s2c_3s2s8c5c_TsQcAh9h_5hTd2dTc_Jd4h6sKd_Js4sAsAd() {
    assertEquals(
      "TsQcAh9h 5hTd2dTc 2h9sJc9d Js4sAsAd Th7h5dKs Jd4h6sKd 4c7d7s2c 3s2s8c5c",
      Solver.process("omaha-holdem 3c4d7cJhKc 2h9sJc9d Th7h5dKs 4c7d7s2c 3s2s8c5c TsQcAh9h 5hTd2dTc Jd4h6sKd Js4sAsAd"));
  }

  @Test
  public void test_omaha_holdem_1090_6d7d8hAcJs_Jh2c4s7h_2dTc6hTh_8dQsAhJd() {
    assertEquals(
      "2dTc6hTh Jh2c4s7h 8dQsAhJd",
      Solver.process("omaha-holdem 6d7d8hAcJs Jh2c4s7h 2dTc6hTh 8dQsAhJd"));
  }

  @Test
  public void test_omaha_holdem_1091_2d4s9hJsKd_6d2hAcQh_8h6sTc9d_As9s8cJd_9c5sTh3s_4c5h7cKs() {
    assertEquals(
      "6d2hAcQh 8h6sTc9d=9c5sTh3s As9s8cJd 4c5h7cKs",
      Solver.process("omaha-holdem 2d4s9hJsKd 6d2hAcQh 8h6sTc9d As9s8cJd 9c5sTh3s 4c5h7cKs"));
  }

  @Test
  public void test_omaha_holdem_1092_3c6c7d7h9h_4hQcTh4s_Ad3sKcQs_5cAhJc7s_Js8cAc6d_Kh2cAs5h() {
    assertEquals(
      "Kh2cAs5h Ad3sKcQs 4hQcTh4s Js8cAc6d 5cAhJc7s",
      Solver.process("omaha-holdem 3c6c7d7h9h 4hQcTh4s Ad3sKcQs 5cAhJc7s Js8cAc6d Kh2cAs5h"));
  }

  @Test
  public void test_omaha_holdem_1093_5c6c6s7cAs_2c4dKd9s_Js8d8hTd() {
    assertEquals(
      "2c4dKd9s Js8d8hTd",
      Solver.process("omaha-holdem 5c6c6s7cAs 2c4dKd9s Js8d8hTd"));
  }

  @Test
  public void test_omaha_holdem_1094_3h6d7c7hKd_Jd3sTh3c_Qd2h8d2s_9d7sTsJs_5dKcJhTc_Qs5s6c4h() {
    assertEquals(
      "Qd2h8d2s 5dKcJhTc 9d7sTsJs Qs5s6c4h Jd3sTh3c",
      Solver.process("omaha-holdem 3h6d7c7hKd Jd3sTh3c Qd2h8d2s 9d7sTsJs 5dKcJhTc Qs5s6c4h"));
  }

  @Test
  public void test_omaha_holdem_1095_2c2s4c5h6h_8h8sKsTh_9c9h4sTc_7h5d3hJh() {
    assertEquals(
      "8h8sKsTh 9c9h4sTc 7h5d3hJh",
      Solver.process("omaha-holdem 2c2s4c5h6h 8h8sKsTh 9c9h4sTc 7h5d3hJh"));
  }

  @Test
  public void test_omaha_holdem_1096_2d6cAhKdTh_9cJh8dQd_3hTc4d2h() {
    assertEquals(
      "3hTc4d2h 9cJh8dQd",
      Solver.process("omaha-holdem 2d6cAhKdTh 9cJh8dQd 3hTc4d2h"));
  }

  @Test
  public void test_omaha_holdem_1097_2s5h8cJdJh_2dKc4d8s_2h4s9cJs_Kd3h7d5c_5s8h9hTc_6sQcTh7h_KsQs2c6h_Qd7c6d6c_8d4c3dTd_3sAdAsAh() {
    assertEquals(
      "6sQcTh7h KsQs2c6h Kd3h7d5c Qd7c6d6c 5s8h9hTc=8d4c3dTd 2dKc4d8s 3sAdAsAh 2h4s9cJs",
      Solver.process("omaha-holdem 2s5h8cJdJh 2dKc4d8s 2h4s9cJs Kd3h7d5c 5s8h9hTc 6sQcTh7h KsQs2c6h Qd7c6d6c 8d4c3dTd 3sAdAsAh"));
  }

  @Test
  public void test_omaha_holdem_1098_6c7d9cAsKd_9hJcAhAc_Jd3c7c8d_5sKs2h4c() {
    assertEquals(
      "Jd3c7c8d 5sKs2h4c 9hJcAhAc",
      Solver.process("omaha-holdem 6c7d9cAsKd 9hJcAhAc Jd3c7c8d 5sKs2h4c"));
  }

  @Test
  public void test_omaha_holdem_1099_2c2d3h4c5d_Kd9s8sQd_3dKsQhQs() {
    assertEquals(
      "Kd9s8sQd 3dKsQhQs",
      Solver.process("omaha-holdem 2c2d3h4c5d Kd9s8sQd 3dKsQhQs"));
  }

  @Test
  public void test_omaha_holdem_1100_3s6s7cQdQs_Qc9cKc5c_KsTc7h5d_2s3hKdJc_Qh4c4dTs_Js2hAs8h_Td3d6d8s_9s9hAcTh() {
    assertEquals(
      "2s3hKdJc Td3d6d8s KsTc7h5d 9s9hAcTh Qh4c4dTs Qc9cKc5c Js2hAs8h",
      Solver.process("omaha-holdem 3s6s7cQdQs Qc9cKc5c KsTc7h5d 2s3hKdJc Qh4c4dTs Js2hAs8h Td3d6d8s 9s9hAcTh"));
  }

  @Test
  public void test_omaha_holdem_1101_7h7s8c9cJd_Qd8d4cAh_2d4hQs6d_3s4s4d7d_6s5c5h6h_As9hQh9d() {
    assertEquals(
      "2d4hQs6d Qd8d4cAh 3s4s4d7d 6s5c5h6h As9hQh9d",
      Solver.process("omaha-holdem 7h7s8c9cJd Qd8d4cAh 2d4hQs6d 3s4s4d7d 6s5c5h6h As9hQh9d"));
  }

  @Test
  public void test_omaha_holdem_1102_3c9c9hJdTd_Qh7h8dJs_9s5c9dJc() {
    assertEquals(
      "Qh7h8dJs 9s5c9dJc",
      Solver.process("omaha-holdem 3c9c9hJdTd Qh7h8dJs 9s5c9dJc"));
  }

  @Test
  public void test_omaha_holdem_1103_4c5s7cAcTd_KsKd3s2d_9hAs2s7s_5hJd8s8c_Qc8hQh9d_TsJh7hJs() {
    assertEquals(
      "5hJd8s8c Qc8hQh9d TsJh7hJs 9hAs2s7s KsKd3s2d",
      Solver.process("omaha-holdem 4c5s7cAcTd KsKd3s2d 9hAs2s7s 5hJd8s8c Qc8hQh9d TsJh7hJs"));
  }

  @Test
  public void test_omaha_holdem_1104_2h4h8sAsTd_Tc9d7s8d_4c3cKh5c() {
    assertEquals(
      "Tc9d7s8d 4c3cKh5c",
      Solver.process("omaha-holdem 2h4h8sAsTd Tc9d7s8d 4c3cKh5c"));
  }

  @Test
  public void test_omaha_holdem_1105_5s7sAsJcKs_9h6dAhKc_5dJsJhTh() {
    assertEquals(
      "9h6dAhKc 5dJsJhTh",
      Solver.process("omaha-holdem 5s7sAsJcKs 9h6dAhKc 5dJsJhTh"));
  }

  @Test
  public void test_omaha_holdem_1106_3c4c6sJcJh_3dQh2c9d_4dJd2hJs_Ts6h7s5h_4sAs3s2d_7c8d5sKh_6cAhKcAc_3hQd6d2s() {
    assertEquals(
      "3dQh2c9d 4sAs3s2d 3hQd6d2s 7c8d5sKh=Ts6h7s5h 6cAhKcAc 4dJd2hJs",
      Solver.process("omaha-holdem 3c4c6sJcJh 3dQh2c9d 4dJd2hJs Ts6h7s5h 4sAs3s2d 7c8d5sKh 6cAhKcAc 3hQd6d2s"));
  }

  @Test
  public void test_omaha_holdem_1107_4s5s7dKcQd_Ah5d8s9c_6h2c4d9h_9d3d2s3c_5hJcAc8c_6dTcJsQs_Th4hTd2d() {
    assertEquals(
      "9d3d2s3c 6h2c4d9h 5hJcAc8c=Ah5d8s9c Th4hTd2d 6dTcJsQs",
      Solver.process("omaha-holdem 4s5s7dKcQd Ah5d8s9c 6h2c4d9h 9d3d2s3c 5hJcAc8c 6dTcJsQs Th4hTd2d"));
  }

  @Test
  public void test_omaha_holdem_1108_2s7c7hTdTh_5s5c3d6c_6sKd8sAd() {
    assertEquals(
      "6sKd8sAd 5s5c3d6c",
      Solver.process("omaha-holdem 2s7c7hTdTh 5s5c3d6c 6sKd8sAd"));
  }

  @Test
  public void test_omaha_holdem_1109_4c5s7cAcQh_9hQd7s8s_Jh5d6dKc_7d5hAh6h_9d6c2sTc_Js3h6s3s_9cKd3d8h_8c4d2hTs() {
    assertEquals(
      "9cKd3d8h 8c4d2hTs Jh5d6dKc 9hQd7s8s 7d5hAh6h Js3h6s3s 9d6c2sTc",
      Solver.process("omaha-holdem 4c5s7cAcQh 9hQd7s8s Jh5d6dKc 7d5hAh6h 9d6c2sTc Js3h6s3s 9cKd3d8h 8c4d2hTs"));
  }

  @Test
  public void test_omaha_holdem_1110_4h5s8h9cAd_3c9s2cJc_3hKcKh7c_9h3d6cTc_5cAsKdAc_8dTsQd7d_Jh2d2h7s_Ks4c6dQc_6hTd4d3s_9dJs8c4s() {
    assertEquals(
      "Jh2d2h7s 6hTd4d3s Ks4c6dQc 8dTsQd7d 9h3d6cTc 3hKcKh7c 9dJs8c4s 5cAsKdAc 3c9s2cJc",
      Solver.process("omaha-holdem 4h5s8h9cAd 3c9s2cJc 3hKcKh7c 9h3d6cTc 5cAsKdAc 8dTsQd7d Jh2d2h7s Ks4c6dQc 6hTd4d3s 9dJs8c4s"));
  }

  @Test
  public void test_omaha_holdem_1111_7c8d9hAcKd_7hKc9s5c_4c8h3s6d_Ad5h5sKs_AhJs4h9c_9dTsTcQs_Qc2d6h8s_6s4sThJh_Qd3cJc2s() {
    assertEquals(
      "Qd3cJc2s 4c8h3s6d Qc2d6h8s 9dTsTcQs 7hKc9s5c AhJs4h9c Ad5h5sKs 6s4sThJh",
      Solver.process("omaha-holdem 7c8d9hAcKd 7hKc9s5c 4c8h3s6d Ad5h5sKs AhJs4h9c 9dTsTcQs Qc2d6h8s 6s4sThJh Qd3cJc2s"));
  }

  @Test
  public void test_omaha_holdem_1112_2c2d2s4dQh_6hQd7h6s_Qs4sAh3s_JhTdAc6d_3cKs3h8d_9s5sJsJd() {
    assertEquals(
      "JhTdAc6d Qs4sAh3s 3cKs3h8d 6hQd7h6s 9s5sJsJd",
      Solver.process("omaha-holdem 2c2d2s4dQh 6hQd7h6s Qs4sAh3s JhTdAc6d 3cKs3h8d 9s5sJsJd"));
  }

  @Test
  public void test_omaha_holdem_1113_2d6c9hJcTs_5dKsQd7h_Ad5c6d8h_2hKd4c4s_9d6hTcTh_3c4hQsKh_8c7s3d2s_6s9sJdAs_JhQc4dKc() {
    assertEquals(
      "2hKd4c4s Ad5c6d8h 6s9sJdAs 9d6hTcTh 8c7s3d2s 3c4hQsKh=5dKsQd7h=JhQc4dKc",
      Solver.process("omaha-holdem 2d6c9hJcTs 5dKsQd7h Ad5c6d8h 2hKd4c4s 9d6hTcTh 3c4hQsKh 8c7s3d2s 6s9sJdAs JhQc4dKc"));
  }

  @Test
  public void test_omaha_holdem_1114_3hJhKsQcTh_Qs2s9h5c_7d9cQdKd() {
    assertEquals(
      "7d9cQdKd=Qs2s9h5c",
      Solver.process("omaha-holdem 3hJhKsQcTh Qs2s9h5c 7d9cQdKd"));
  }

  @Test
  public void test_omaha_holdem_1115_7s8hAsThTs_9dQcAcTc_Td9hQd2h_8cJc3h8s_4cJh6s6h_Jd5c5s4h() {
    assertEquals(
      "Jd5c5s4h 4cJh6s6h Td9hQd2h 8cJc3h8s 9dQcAcTc",
      Solver.process("omaha-holdem 7s8hAsThTs 9dQcAcTc Td9hQd2h 8cJc3h8s 4cJh6s6h Jd5c5s4h"));
  }

  @Test
  public void test_omaha_holdem_1116_2h6h8sJsKh_4hQh3cJc_8d9dKs8c_Qs5d7c6c_2d5h3h7s_ThAdTd2c_9s2s5s7d_QdQcJd5c_Ah9h6d9c() {
    assertEquals(
      "9s2s5s7d Qs5d7c6c ThAdTd2c QdQcJd5c 8d9dKs8c 2d5h3h7s 4hQh3cJc Ah9h6d9c",
      Solver.process("omaha-holdem 2h6h8sJsKh 4hQh3cJc 8d9dKs8c Qs5d7c6c 2d5h3h7s ThAdTd2c 9s2s5s7d QdQcJd5c Ah9h6d9c"));
  }

  @Test
  public void test_omaha_holdem_1117_2c4d5h7d8h_3d8dAsAd_Qs9c6h9d_5d4h4c4s_6cKc7s7h_5s2sJc6d() {
    assertEquals(
      "5d4h4c4s 3d8dAsAd 5s2sJc6d=6cKc7s7h Qs9c6h9d",
      Solver.process("omaha-holdem 2c4d5h7d8h 3d8dAsAd Qs9c6h9d 5d4h4c4s 6cKc7s7h 5s2sJc6d"));
  }

  @Test
  public void test_omaha_holdem_1118_4s5h9sAcTs_8c3s6hJh_2hAdTd5d_2s7c9d9h_5cTcTh7h_As6cKd4h() {
    assertEquals(
      "8c3s6hJh As6cKd4h 2hAdTd5d 2s7c9d9h 5cTcTh7h",
      Solver.process("omaha-holdem 4s5h9sAcTs 8c3s6hJh 2hAdTd5d 2s7c9d9h 5cTcTh7h As6cKd4h"));
  }

  @Test
  public void test_omaha_holdem_1119_3c3sKsQdTs_KcJdTd4c_4h9hTc2h_7cQs8s5d() {
    assertEquals(
      "4h9hTc2h KcJdTd4c 7cQs8s5d",
      Solver.process("omaha-holdem 3c3sKsQdTs KcJdTd4c 4h9hTc2h 7cQs8s5d"));
  }

  @Test
  public void test_omaha_holdem_1120_6c7c7d7hKs_Ac6hQdTd_Js5c8sAd_3dKh5dAh_ThJc4h4s_Kd9dKc3s_Tc4d8c4c_2s5h5s8h_7sQh2hQs() {
    assertEquals(
      "Js5c8sAd Ac6hQdTd 3dKh5dAh Tc4d8c4c=ThJc4h4s 2s5h5s8h Kd9dKc3s 7sQh2hQs",
      Solver.process("omaha-holdem 6c7c7d7hKs Ac6hQdTd Js5c8sAd 3dKh5dAh ThJc4h4s Kd9dKc3s Tc4d8c4c 2s5h5s8h 7sQh2hQs"));
  }

  @Test
  public void test_omaha_holdem_1121_5d8sAcJdQs_7h9hQc9s_2sAh6c4h_2dThJc6d() {
    assertEquals(
      "2dThJc6d 7h9hQc9s 2sAh6c4h",
      Solver.process("omaha-holdem 5d8sAcJdQs 7h9hQc9s 2sAh6c4h 2dThJc6d"));
  }

  @Test
  public void test_omaha_holdem_1122_3h6h7c8sQd_Ts4dKdAd_9hThKh9d_8h2s4hJc_JsKsAs5h_7s9sTd5s_Jd3d9c2c_8dQc5d7d_AhQh3s2d_6c3cKcTc() {
    assertEquals(
      "JsKsAs5h=Ts4dKdAd Jd3d9c2c 8h2s4hJc 6c3cKcTc AhQh3s2d 8dQc5d7d 7s9sTd5s=9hThKh9d",
      Solver.process("omaha-holdem 3h6h7c8sQd Ts4dKdAd 9hThKh9d 8h2s4hJc JsKsAs5h 7s9sTd5s Jd3d9c2c 8dQc5d7d AhQh3s2d 6c3cKcTc"));
  }

  @Test
  public void test_omaha_holdem_1123_8cAdJcQhTh_3dAcTsKd_QsJh6d3h_6s7s2s3s_Qd8d4h4d() {
    assertEquals(
      "6s7s2s3s Qd8d4h4d QsJh6d3h 3dAcTsKd",
      Solver.process("omaha-holdem 8cAdJcQhTh 3dAcTsKd QsJh6d3h 6s7s2s3s Qd8d4h4d"));
  }

  @Test
  public void test_omaha_holdem_1124_4sJhQsTcTs_8s6dJs5c_6s8d2sAd_Ks7hAs3h_Qc3c4h6c_Kh9s7d8h() {
    assertEquals(
      "Qc3c4h6c Kh9s7d8h 6s8d2sAd 8s6dJs5c Ks7hAs3h",
      Solver.process("omaha-holdem 4sJhQsTcTs 8s6dJs5c 6s8d2sAd Ks7hAs3h Qc3c4h6c Kh9s7d8h"));
  }

  @Test
  public void test_omaha_holdem_1125_2c3h9hQcTd_5d6sKd7c_3c9cKcTh_2dJd8s5h_AsJhQs7h_2sAc3sQd_5cTs7dJc_6dAh6hJs_6cAd4c4h() {
    assertEquals(
      "5d6sKd7c 6cAd4c4h 6dAh6hJs 5cTs7dJc AsJhQs7h 3c9cKcTh 2sAc3sQd 2dJd8s5h",
      Solver.process("omaha-holdem 2c3h9hQcTd 5d6sKd7c 3c9cKcTh 2dJd8s5h AsJhQs7h 2sAc3sQd 5cTs7dJc 6dAh6hJs 6cAd4c4h"));
  }

  @Test
  public void test_omaha_holdem_1126_6c7cJcKcQd_8s8cQs8d_Ts9c3d4h_Ad5s2h6h_6d5d9hAs() {
    assertEquals(
      "6d5d9hAs=Ad5s2h6h 8s8cQs8d Ts9c3d4h",
      Solver.process("omaha-holdem 6c7cJcKcQd 8s8cQs8d Ts9c3d4h Ad5s2h6h 6d5d9hAs"));
  }

  @Test
  public void test_omaha_holdem_1127_2h7c8hKdTd_JcTc5h9c_5s3dAs6c_3h8d4c5d_3c5c9dKh() {
    assertEquals(
      "5s3dAs6c 3h8d4c5d 3c5c9dKh JcTc5h9c",
      Solver.process("omaha-holdem 2h7c8hKdTd JcTc5h9c 5s3dAs6c 3h8d4c5d 3c5c9dKh"));
  }

  @Test
  public void test_omaha_holdem_1128_4s8dKsQsTh_8c4h5cAh_4d2s6h6d_4cTdAs2d_2c6cKhAc_Jc8hKd3h_5sTsJh7s_Kc3c2hQd() {
    assertEquals(
      "4d2s6h6d 2c6cKhAc 8c4h5cAh 4cTdAs2d Jc8hKd3h Kc3c2hQd 5sTsJh7s",
      Solver.process("omaha-holdem 4s8dKsQsTh 8c4h5cAh 4d2s6h6d 4cTdAs2d 2c6cKhAc Jc8hKd3h 5sTsJh7s Kc3c2hQd"));
  }

  @Test
  public void test_omaha_holdem_1129_3d5h7sKhTs_AcKsTc3s_4cJd9cAs() {
    assertEquals(
      "4cJd9cAs AcKsTc3s",
      Solver.process("omaha-holdem 3d5h7sKhTs AcKsTc3s 4cJd9cAs"));
  }

  @Test
  public void test_omaha_holdem_1130_4c5d8cAhQh_6hQs4h3d_2hQc7h4d() {
    assertEquals(
      "2hQc7h4d=6hQs4h3d",
      Solver.process("omaha-holdem 4c5d8cAhQh 6hQs4h3d 2hQc7h4d"));
  }

  @Test
  public void test_omaha_holdem_1131_5h6d7c8d8h_QcTdJsJc_Qh7s5c6c() {
    assertEquals(
      "Qh7s5c6c QcTdJsJc",
      Solver.process("omaha-holdem 5h6d7c8d8h QcTdJsJc Qh7s5c6c"));
  }

  @Test
  public void test_omaha_holdem_1132_3s4s6sAsTc_5s9s9c8d_8h2s8s4h_2c5c6c2d() {
    assertEquals(
      "2c5c6c2d 8h2s8s4h 5s9s9c8d",
      Solver.process("omaha-holdem 3s4s6sAsTc 5s9s9c8d 8h2s8s4h 2c5c6c2d"));
  }

  @Test
  public void test_omaha_holdem_1133_2h4s6cJsTs_9cQdQh3s_7s8dKs2s_3hTc4dJc_6sAdJd9s() {
    assertEquals(
      "9cQdQh3s 3hTc4dJc 6sAdJd9s 7s8dKs2s",
      Solver.process("omaha-holdem 2h4s6cJsTs 9cQdQh3s 7s8dKs2s 3hTc4dJc 6sAdJd9s"));
  }

  @Test
  public void test_omaha_holdem_1134_3h3s5h8cQd_8h5dQcJs_5sKsQhAs_9d5c6dAd_JdKh2c2d_Ac7d6cJh_7hTd4h9c_7s3dJcTh_8d4c2h8s() {
    assertEquals(
      "7hTd4h9c Ac7d6cJh JdKh2c2d 9d5c6dAd 5sKsQhAs 8h5dQcJs 7s3dJcTh 8d4c2h8s",
      Solver.process("omaha-holdem 3h3s5h8cQd 8h5dQcJs 5sKsQhAs 9d5c6dAd JdKh2c2d Ac7d6cJh 7hTd4h9c 7s3dJcTh 8d4c2h8s"));
  }

  @Test
  public void test_omaha_holdem_1135_2c7s8d8hJh_5h4s4cAh_As9cQcJc_3hTcAd8c_3c8s7hJd_Ts5cKd7c() {
    assertEquals(
      "5h4s4cAh Ts5cKd7c As9cQcJc 3hTcAd8c 3c8s7hJd",
      Solver.process("omaha-holdem 2c7s8d8hJh 5h4s4cAh As9cQcJc 3hTcAd8c 3c8s7hJd Ts5cKd7c"));
  }

  @Test
  public void test_omaha_holdem_1136_3d6d6h9hJc_5sTc6cKh_Js3cTs6s_Jd8hQs7s_2dQh8sKs_Th2s3s9c() {
    assertEquals(
      "2dQh8sKs Th2s3s9c Jd8hQs7s 5sTc6cKh Js3cTs6s",
      Solver.process("omaha-holdem 3d6d6h9hJc 5sTc6cKh Js3cTs6s Jd8hQs7s 2dQh8sKs Th2s3s9c"));
  }

  @Test
  public void test_omaha_holdem_1137_2c3d7hAsJd_6hQc8dJs_9c4d6dJh_Qs5h2d6c() {
    assertEquals(
      "Qs5h2d6c 9c4d6dJh 6hQc8dJs",
      Solver.process("omaha-holdem 2c3d7hAsJd 6hQc8dJs 9c4d6dJh Qs5h2d6c"));
  }

  @Test
  public void test_omaha_holdem_1138_2s4c4d5h6c_Ts7dJdAc_8sThTd7h_6d3s8hKs_5cQs3h2d_KhAd4h6h() {
    assertEquals(
      "Ts7dJdAc 5cQs3h2d=6d3s8hKs 8sThTd7h KhAd4h6h",
      Solver.process("omaha-holdem 2s4c4d5h6c Ts7dJdAc 8sThTd7h 6d3s8hKs 5cQs3h2d KhAd4h6h"));
  }

  @Test
  public void test_omaha_holdem_1139_4s7h9sKdQs_3h5cKs9c_5h3s9d8c_4h5dQd2d_Qc3d3c4d() {
    assertEquals(
      "5h3s9d8c 4h5dQd2d=Qc3d3c4d 3h5cKs9c",
      Solver.process("omaha-holdem 4s7h9sKdQs 3h5cKs9c 5h3s9d8c 4h5dQd2d Qc3d3c4d"));
  }

  @Test
  public void test_omaha_holdem_1140_2d3d5cJdQh_5hTcKc9h_Qd7c8hTd_3h2c8d2h() {
    assertEquals(
      "5hTcKc9h 3h2c8d2h Qd7c8hTd",
      Solver.process("omaha-holdem 2d3d5cJdQh 5hTcKc9h Qd7c8hTd 3h2c8d2h"));
  }

  @Test
  public void test_omaha_holdem_1141_5h7d7hAsQs_Jd2hKs4s_4c8s9c6d_JhTs9s5d_2cTd5s8c() {
    assertEquals(
      "4c8s9c6d Jd2hKs4s 2cTd5s8c JhTs9s5d",
      Solver.process("omaha-holdem 5h7d7hAsQs Jd2hKs4s 4c8s9c6d JhTs9s5d 2cTd5s8c"));
  }

  @Test
  public void test_omaha_holdem_1142_3s8d8hAsQc_6c7sKhQs_Tc6h9h8c_5c2c9dAh_7d2d3h6d_2h9c4sTs() {
    assertEquals(
      "2h9c4sTs 7d2d3h6d 6c7sKhQs 5c2c9dAh Tc6h9h8c",
      Solver.process("omaha-holdem 3s8d8hAsQc 6c7sKhQs Tc6h9h8c 5c2c9dAh 7d2d3h6d 2h9c4sTs"));
  }

  @Test
  public void test_omaha_holdem_1143_5h6c9hAdJh_KhTsJd4h_4s3c5c7s_JsJcQc8c_AcTc9c9s() {
    assertEquals(
      "4s3c5c7s AcTc9c9s JsJcQc8c KhTsJd4h",
      Solver.process("omaha-holdem 5h6c9hAdJh KhTsJd4h 4s3c5c7s JsJcQc8c AcTc9c9s"));
  }

  @Test
  public void test_omaha_holdem_1144_2c2s5h7d8s_5s6s9sJh_8cAs2hKc_8hAd4dJs_2d4c7cQc() {
    assertEquals(
      "8hAd4dJs 5s6s9sJh 2d4c7cQc 8cAs2hKc",
      Solver.process("omaha-holdem 2c2s5h7d8s 5s6s9sJh 8cAs2hKc 8hAd4dJs 2d4c7cQc"));
  }

  @Test
  public void test_omaha_holdem_1145_3d4s7h7sKh_6hJc4dKs_9dQs9h6c_4cQc8hAd_5dAhTsJd_3cAcKc4h_Th3h8s2s_2d9c8cAs_7dQdKd5c_9s3s5s7c() {
    assertEquals(
      "2d9c8cAs 5dAhTsJd Th3h8s2s 4cQc8hAd 9dQs9h6c 6hJc4dKs 3cAcKc4h 9s3s5s7c 7dQdKd5c",
      Solver.process("omaha-holdem 3d4s7h7sKh 6hJc4dKs 9dQs9h6c 4cQc8hAd 5dAhTsJd 3cAcKc4h Th3h8s2s 2d9c8cAs 7dQdKd5c 9s3s5s7c"));
  }

  @Test
  public void test_omaha_holdem_1146_2h8c8dKdTd_7h4dKs7d_2cJs3d6h_5hTs9d5c_3cAcJcAd_5d6c6s4s_QcQhTc3s_6dTh9hAh_JhQs8h7c_3h2s9s7s() {
    assertEquals(
      "3h2s9s7s 2cJs3d6h 5d6c6s4s 5hTs9d5c 6dTh9hAh QcQhTc3s 3cAcJcAd JhQs8h7c 7h4dKs7d",
      Solver.process("omaha-holdem 2h8c8dKdTd 7h4dKs7d 2cJs3d6h 5hTs9d5c 3cAcJcAd 5d6c6s4s QcQhTc3s 6dTh9hAh JhQs8h7c 3h2s9s7s"));
  }

  @Test
  public void test_omaha_holdem_1147_2c6c8hAhQh_As4s7h6s_QdQcJsKh_3s7s2d9h_6hJhQs4c_Kc6d2s8c_3h7dJcTh_8s7c4dTd_KsJd3d5c_4h5s9d8d() {
    assertEquals(
      "KsJd3d5c 3s7s2d9h 4h5s9d8d 8s7c4dTd Kc6d2s8c As4s7h6s QdQcJsKh 3h7dJcTh 6hJhQs4c",
      Solver.process("omaha-holdem 2c6c8hAhQh As4s7h6s QdQcJsKh 3s7s2d9h 6hJhQs4c Kc6d2s8c 3h7dJcTh 8s7c4dTd KsJd3d5c 4h5s9d8d"));
  }

  @Test
  public void test_omaha_holdem_1148_3h5c6c8sKs_Th6sQs7s_6hJh7hTd() {
    assertEquals(
      "6hJh7hTd Th6sQs7s",
      Solver.process("omaha-holdem 3h5c6c8sKs Th6sQs7s 6hJh7hTd"));
  }

  @Test
  public void test_omaha_holdem_1149_4d4h5s9c9s_6s7h3dTh_AdQd6dQc() {
    assertEquals(
      "6s7h3dTh AdQd6dQc",
      Solver.process("omaha-holdem 4d4h5s9c9s 6s7h3dTh AdQd6dQc"));
  }

  @Test
  public void test_omaha_holdem_1150_6s8c8s9hKh_7h2sJdJs_3s5hJhQs_As5dQc6h_Tc3hTh9c() {
    assertEquals(
      "3s5hJhQs As5dQc6h Tc3hTh9c 7h2sJdJs",
      Solver.process("omaha-holdem 6s8c8s9hKh 7h2sJdJs 3s5hJhQs As5dQc6h Tc3hTh9c"));
  }

  @Test
  public void test_omaha_holdem_1151_2c6h7d8d9s_QsKsAdTc_Td8hKh4h_2h5sAcKd_JdQd9h4c_Js9d4dQh_5h9c3hKc_Jc6s7cQc_7s8sTs3d() {
    assertEquals(
      "QsKsAdTc 2h5sAcKd JdQd9h4c=Js9d4dQh Jc6s7cQc 5h9c3hKc 7s8sTs3d=Td8hKh4h",
      Solver.process("omaha-holdem 2c6h7d8d9s QsKsAdTc Td8hKh4h 2h5sAcKd JdQd9h4c Js9d4dQh 5h9c3hKc Jc6s7cQc 7s8sTs3d"));
  }

  @Test
  public void test_omaha_holdem_1152_2h8s9c9dTs_5sTd7c8c_2sKhQh2d_5cQs5dAh_Kd8dJh3s_JcJs2cQc_4d9hJd9s() {
    assertEquals(
      "5cQs5dAh Kd8dJh3s 5sTd7c8c JcJs2cQc 2sKhQh2d 4d9hJd9s",
      Solver.process("omaha-holdem 2h8s9c9dTs 5sTd7c8c 2sKhQh2d 5cQs5dAh Kd8dJh3s JcJs2cQc 4d9hJd9s"));
  }

  @Test
  public void test_omaha_holdem_1153_3h5h8dQhTh_7c3d9cAs_6sJd6dJc_AhJsAcQs_2c5sJh9s_Qd2sKsTc_Qc8s4d7s_4s9d2dTd_6h7h5c8h_4c7d5dAd() {
    assertEquals(
      "7c3d9cAs 4c7d5dAd 4s9d2dTd 6sJd6dJc AhJsAcQs Qc8s4d7s Qd2sKsTc 2c5sJh9s 6h7h5c8h",
      Solver.process("omaha-holdem 3h5h8dQhTh 7c3d9cAs 6sJd6dJc AhJsAcQs 2c5sJh9s Qd2sKsTc Qc8s4d7s 4s9d2dTd 6h7h5c8h 4c7d5dAd"));
  }

  @Test
  public void test_omaha_holdem_1154_4d4h8hAhKc_TdAs2h7h_Jc5d9dJs_QhTh3d8c_3s2sKh9c_Qd6sAdAc_5h9h8d5s() {
    assertEquals(
      "Jc5d9dJs 3s2sKh9c TdAs2h7h 5h9h8d5s QhTh3d8c Qd6sAdAc",
      Solver.process("omaha-holdem 4d4h8hAhKc TdAs2h7h Jc5d9dJs QhTh3d8c 3s2sKh9c Qd6sAdAc 5h9h8d5s"));
  }

  @Test
  public void test_omaha_holdem_1155_2c3h6h8cAd_KsKhJd6s_2s8hQd5s_8dJc2d6d_7sKcThQc_3dAcAhTs_TdTc9d7c() {
    assertEquals(
      "7sKcThQc TdTc9d7c KsKhJd6s 2s8hQd5s 8dJc2d6d 3dAcAhTs",
      Solver.process("omaha-holdem 2c3h6h8cAd KsKhJd6s 2s8hQd5s 8dJc2d6d 7sKcThQc 3dAcAhTs TdTc9d7c"));
  }

  @Test
  public void test_omaha_holdem_1156_2c5c8d9sKh_AhAsQs5h_Jc4h8h8c_4s6cTdQc_7c4cTh3s_KsJd2s3d() {
    assertEquals(
      "7c4cTh3s 4s6cTdQc AhAsQs5h KsJd2s3d Jc4h8h8c",
      Solver.process("omaha-holdem 2c5c8d9sKh AhAsQs5h Jc4h8h8c 4s6cTdQc 7c4cTh3s KsJd2s3d"));
  }

  @Test
  public void test_omaha_holdem_1157_2c2h3c3hQh_Ac4c7dQc_Qd4d4hKc_4sKs2d3d_7h5sAd6s_2s5h9hTd() {
    assertEquals(
      "7h5sAd6s Qd4d4hKc Ac4c7dQc 2s5h9hTd 4sKs2d3d",
      Solver.process("omaha-holdem 2c2h3c3hQh Ac4c7dQc Qd4d4hKc 4sKs2d3d 7h5sAd6s 2s5h9hTd"));
  }

  @Test
  public void test_omaha_holdem_1158_3dAhQsTcTd_9dAs2d4c_4s6c9c5c() {
    assertEquals(
      "4s6c9c5c 9dAs2d4c",
      Solver.process("omaha-holdem 3dAhQsTcTd 9dAs2d4c 4s6c9c5c"));
  }

  @Test
  public void test_omaha_holdem_1159_5d7h8c9hTs_7d2dKdTh_Qh5c4sTd_8s6d5s2h_9s9cQdAs_7c6h8d2s_3dAhJd3h_4d9dJc4c_JhQs8hQc() {
    assertEquals(
      "3dAhJd3h Qh5c4sTd 7d2dKdTh 9s9cQdAs 7c6h8d2s=8s6d5s2h 4d9dJc4c JhQs8hQc",
      Solver.process("omaha-holdem 5d7h8c9hTs 7d2dKdTh Qh5c4sTd 8s6d5s2h 9s9cQdAs 7c6h8d2s 3dAhJd3h 4d9dJc4c JhQs8hQc"));
  }

  @Test
  public void test_omaha_holdem_1160_5c6d6hAsQc_9s5dAd4h_TcJs3c7d_5h6cJd8s_8hKsAh4s_9c5s3d2d_4d2hJcKc_4cKh7h7s() {
    assertEquals(
      "TcJs3c7d 4d2hJcKc 9c5s3d2d 4cKh7h7s 9s5dAd4h 8hKsAh4s 5h6cJd8s",
      Solver.process("omaha-holdem 5c6d6hAsQc 9s5dAd4h TcJs3c7d 5h6cJd8s 8hKsAh4s 9c5s3d2d 4d2hJcKc 4cKh7h7s"));
  }

  @Test
  public void test_omaha_holdem_1161_2c6d8dJcKh_8c9cKc6s_8h2s3d7c_JsQh7h4s_6hAd7sTd_3hTcKd5d() {
    assertEquals(
      "6hAd7sTd JsQh7h4s 3hTcKd5d 8h2s3d7c 8c9cKc6s",
      Solver.process("omaha-holdem 2c6d8dJcKh 8c9cKc6s 8h2s3d7c JsQh7h4s 6hAd7sTd 3hTcKd5d"));
  }

  @Test
  public void test_omaha_holdem_1162_8cAcAdKhQc_7hKs7c8d_4d5h6h2h_Qh7d4cJc() {
    assertEquals(
      "4d5h6h2h 7hKs7c8d Qh7d4cJc",
      Solver.process("omaha-holdem 8cAcAdKhQc 7hKs7c8d 4d5h6h2h Qh7d4cJc"));
  }

  @Test
  public void test_omaha_holdem_1163_3c6h8sJdTs_5cTcKhKc_ThTd4c2s_Qd7sAd9c_5d7hAh4d_8d3dAcQh() {
    assertEquals(
      "5d7hAh4d 5cTcKhKc 8d3dAcQh ThTd4c2s Qd7sAd9c",
      Solver.process("omaha-holdem 3c6h8sJdTs 5cTcKhKc ThTd4c2s Qd7sAd9c 5d7hAh4d 8d3dAcQh"));
  }

  @Test
  public void test_omaha_holdem_1164_6h8d9cKhQs_5cQcTc3d_Js6d6s7s_6c4s2c8s_Th8hKs7h_KcJc2hJh_Td8c9h7c_Qh9sQdKd_3hAdAc3s_4c5hTs4d() {
    assertEquals(
      "4c5hTs4d 5cQcTc3d KcJc2hJh 3hAdAc3s 6c4s2c8s Js6d6s7s Qh9sQdKd Td8c9h7c=Th8hKs7h",
      Solver.process("omaha-holdem 6h8d9cKhQs 5cQcTc3d Js6d6s7s 6c4s2c8s Th8hKs7h KcJc2hJh Td8c9h7c Qh9sQdKd 3hAdAc3s 4c5hTs4d"));
  }

  @Test
  public void test_omaha_holdem_1165_2s3s8hAsJs_3d8dTs9s_Kc9h3c7c_QsTd5dAd_Ac7s9cAh_KsJd8c6s() {
    assertEquals(
      "Kc9h3c7c QsTd5dAd Ac7s9cAh 3d8dTs9s KsJd8c6s",
      Solver.process("omaha-holdem 2s3s8hAsJs 3d8dTs9s Kc9h3c7c QsTd5dAd Ac7s9cAh KsJd8c6s"));
  }

  @Test
  public void test_omaha_holdem_1166_3h7d9dJsQh_Qs2h6s9s_8dAhKh4d_2d9h4sJh_5s6h3cAd_TdKsJd2s_6dJc7hQc_3s5h7sQd_Th5dKc8s() {
    assertEquals(
      "8dAhKh4d 5s6h3cAd 2d9h4sJh 3s5h7sQd Qs2h6s9s 6dJc7hQc TdKsJd2s=Th5dKc8s",
      Solver.process("omaha-holdem 3h7d9dJsQh Qs2h6s9s 8dAhKh4d 2d9h4sJh 5s6h3cAd TdKsJd2s 6dJc7hQc 3s5h7sQd Th5dKc8s"));
  }

  @Test
  public void test_omaha_holdem_1167_2d3c3h4hTh_6c7d8cKd_2cJh5c9h_Ad7h5s4c_6h2hQsTs_Jc9dJd6d_QcAh2s8h_9s5d4sKs_4dAc5hKh_Td3sQhKc() {
    assertEquals(
      "6c7d8cKd 9s5d4sKs Jc9dJd6d Ad7h5s4c 6h2hQsTs 2cJh5c9h 4dAc5hKh QcAh2s8h Td3sQhKc",
      Solver.process("omaha-holdem 2d3c3h4hTh 6c7d8cKd 2cJh5c9h Ad7h5s4c 6h2hQsTs Jc9dJd6d QcAh2s8h 9s5d4sKs 4dAc5hKh Td3sQhKc"));
  }

  @Test
  public void test_omaha_holdem_1168_2h3c4d6cJd_8s5h2c5c_3s8h7dJc_5d7s4h9s() {
    assertEquals(
      "3s8h7dJc 8s5h2c5c 5d7s4h9s",
      Solver.process("omaha-holdem 2h3c4d6cJd 8s5h2c5c 3s8h7dJc 5d7s4h9s"));
  }

  @Test
  public void test_omaha_holdem_1169_2c8c8h9hQh_2s4cTd9d_QcJh5d4h_3c5h5cKs_9sKd3hJs_AcQdJcTc_Jd2h6h7h() {
    assertEquals(
      "3c5h5cKs 2s4cTd9d 9sKd3hJs AcQdJcTc Jd2h6h7h QcJh5d4h",
      Solver.process("omaha-holdem 2c8c8h9hQh 2s4cTd9d QcJh5d4h 3c5h5cKs 9sKd3hJs AcQdJcTc Jd2h6h7h"));
  }

  @Test
  public void test_omaha_holdem_1170_5d5hJhJsKs_3c5sKcAc_7d9h2h7s_4s3dKdKh_9c4cAh6h_7hAd4h4d_2cJdJcTs_QsQd8dTd() {
    assertEquals(
      "9c4cAh6h 7hAd4h4d 7d9h2h7s QsQd8dTd 3c5sKcAc 4s3dKdKh 2cJdJcTs",
      Solver.process("omaha-holdem 5d5hJhJsKs 3c5sKcAc 7d9h2h7s 4s3dKdKh 9c4cAh6h 7hAd4h4d 2cJdJcTs QsQd8dTd"));
  }

  @Test
  public void test_omaha_holdem_1171_3s4d6dAdJh_8s9cAhTd_QdQh3c2s_7dJs2h6c_7sKc8hAc() {
    assertEquals(
      "QdQh3c2s 8s9cAhTd 7sKc8hAc 7dJs2h6c",
      Solver.process("omaha-holdem 3s4d6dAdJh 8s9cAhTd QdQh3c2s 7dJs2h6c 7sKc8hAc"));
  }

  @Test
  public void test_omaha_holdem_1172_5s8hKcKhTc_4s3h2c6s_4d6h7cAd() {
    assertEquals(
      "4s3h2c6s 4d6h7cAd",
      Solver.process("omaha-holdem 5s8hKcKhTc 4s3h2c6s 4d6h7cAd"));
  }

  @Test
  public void test_omaha_holdem_1173_2s4h6sAsJs_5sQh2hKs_8s9s5d3s() {
    assertEquals(
      "8s9s5d3s 5sQh2hKs",
      Solver.process("omaha-holdem 2s4h6sAsJs 5sQh2hKs 8s9s5d3s"));
  }

  @Test
  public void test_omaha_holdem_1174_3d7d7s8sKh_2dKdQcTh_Js9s9hAh_5c4dAd6h() {
    assertEquals(
      "5c4dAd6h Js9s9hAh 2dKdQcTh",
      Solver.process("omaha-holdem 3d7d7s8sKh 2dKdQcTh Js9s9hAh 5c4dAd6h"));
  }

  @Test
  public void test_omaha_holdem_1175_3c6d7c8hJd_Kd3d9s2s_ThJs4c5c_8dJh6h2d_Qd4d5s4s_Tc2c8s7d() {
    assertEquals(
      "Kd3d9s2s Tc2c8s7d 8dJh6h2d Qd4d5s4s=ThJs4c5c",
      Solver.process("omaha-holdem 3c6d7c8hJd Kd3d9s2s ThJs4c5c 8dJh6h2d Qd4d5s4s Tc2c8s7d"));
  }

  @Test
  public void test_omaha_holdem_1176_2c6c9cJhKs_4h7c5c3d_7dTc6hAh_5hTs8c3c_8h9dJdQd_Td3s2s9s() {
    assertEquals(
      "7dTc6hAh Td3s2s9s 8h9dJdQd 4h7c5c3d 5hTs8c3c",
      Solver.process("omaha-holdem 2c6c9cJhKs 4h7c5c3d 7dTc6hAh 5hTs8c3c 8h9dJdQd Td3s2s9s"));
  }

  @Test
  public void test_omaha_holdem_1177_2s4d5hAdKc_9hAsQc3s_Tc8s3c8h_Ac7s6sQh_Jd3hJh6d_Qs8c7cJs_Kd2h5d3d_9c4hQd7d_Kh4s9dTh() {
    assertEquals(
      "Qs8c7cJs 9c4hQd7d Tc8s3c8h Ac7s6sQh Kh4s9dTh 9hAsQc3s=Kd2h5d3d Jd3hJh6d",
      Solver.process("omaha-holdem 2s4d5hAdKc 9hAsQc3s Tc8s3c8h Ac7s6sQh Jd3hJh6d Qs8c7cJs Kd2h5d3d 9c4hQd7d Kh4s9dTh"));
  }

  @Test
  public void test_omaha_holdem_1178_5d6c8sJdQh_4h3h4dQs_QdQc6d5s() {
    assertEquals(
      "4h3h4dQs QdQc6d5s",
      Solver.process("omaha-holdem 5d6c8sJdQh 4h3h4dQs QdQc6d5s"));
  }

  @Test
  public void test_omaha_holdem_1179_2d7c7sKdKs_JcQc6c6h_Th3dJh3c() {
    assertEquals(
      "Th3dJh3c JcQc6c6h",
      Solver.process("omaha-holdem 2d7c7sKdKs JcQc6c6h Th3dJh3c"));
  }

  @Test
  public void test_omaha_holdem_1180_3h7s8hAhKh_9d2sJs5d_KdAdQsTc_7h9s3d2h_Ks5cJdAc_KcTd5s7c() {
    assertEquals(
      "9d2sJs5d KcTd5s7c KdAdQsTc=Ks5cJdAc 7h9s3d2h",
      Solver.process("omaha-holdem 3h7s8hAhKh 9d2sJs5d KdAdQsTc 7h9s3d2h Ks5cJdAc KcTd5s7c"));
  }

  @Test
  public void test_omaha_holdem_1181_6s8h9hJcTd_Qs4cThKs_Qh9d8s2h_Ac5sKh3s_2c5cKdJh_Js2d7cTc_8d4sTs9s_Jd4h5dAh() {
    assertEquals(
      "Ac5sKh3s 2c5cKdJh Jd4h5dAh 8d4sTs9s Js2d7cTc Qh9d8s2h Qs4cThKs",
      Solver.process("omaha-holdem 6s8h9hJcTd Qs4cThKs Qh9d8s2h Ac5sKh3s 2c5cKdJh Js2d7cTc 8d4sTs9s Jd4h5dAh"));
  }

  @Test
  public void test_omaha_holdem_1182_2h3d3h4dAc_8s6cKhJh_9sKcKs4h_7h2s9h7c_2c4cQc3c_8dQh4sTs_7sTh6sKd_Ad2d5c3s_5h5sJsQd() {
    assertEquals(
      "7sTh6sKd 8s6cKhJh 8dQh4sTs 5h5sJsQd 7h2s9h7c 9sKcKs4h 2c4cQc3c Ad2d5c3s",
      Solver.process("omaha-holdem 2h3d3h4dAc 8s6cKhJh 9sKcKs4h 7h2s9h7c 2c4cQc3c 8dQh4sTs 7sTh6sKd Ad2d5c3s 5h5sJsQd"));
  }

  @Test
  public void test_omaha_holdem_1183_2c2h6s9hJd_9s5c6dTh_7sAd5dQs_Js5h9c7c_3c3dTd4d_8hKh4c5s_JhAc8dAh_QcJcQh7d_9d6c4s6h() {
    assertEquals(
      "8hKh4c5s 7sAd5dQs 3c3dTd4d 9s5c6dTh Js5h9c7c QcJcQh7d JhAc8dAh 9d6c4s6h",
      Solver.process("omaha-holdem 2c2h6s9hJd 9s5c6dTh 7sAd5dQs Js5h9c7c 3c3dTd4d 8hKh4c5s JhAc8dAh QcJcQh7d 9d6c4s6h"));
  }

  @Test
  public void test_omaha_holdem_1184_3h4h7hKcQs_3cQcAh9d_2c6hAc5d() {
    assertEquals(
      "3cQcAh9d 2c6hAc5d",
      Solver.process("omaha-holdem 3h4h7hKcQs 3cQcAh9d 2c6hAc5d"));
  }

  @Test
  public void test_omaha_holdem_1185_3c4h5d9cKd_4c3dTsKh_7cQh4dTc_Ad2h4sQs_JcJd7d6d() {
    assertEquals(
      "7cQh4dTc 4c3dTsKh Ad2h4sQs JcJd7d6d",
      Solver.process("omaha-holdem 3c4h5d9cKd 4c3dTsKh 7cQh4dTc Ad2h4sQs JcJd7d6d"));
  }

  @Test
  public void test_omaha_holdem_1186_4c9dAdAsKc_8cKd8dAc_5d7s4d9h_3c7h5s4h_2hTs7c9c_Ah2dTh3d_6cJd2s6s() {
    assertEquals(
      "3c7h5s4h 6cJd2s6s 5d7s4d9h 2hTs7c9c Ah2dTh3d 8cKd8dAc",
      Solver.process("omaha-holdem 4c9dAdAsKc 8cKd8dAc 5d7s4d9h 3c7h5s4h 2hTs7c9c Ah2dTh3d 6cJd2s6s"));
  }

  @Test
  public void test_omaha_holdem_1187_2d2h9sJcTs_9h4s5d6s_Td5hKs2c_4h8h6hAs_7d4d3sJd() {
    assertEquals(
      "4h8h6hAs 9h4s5d6s 7d4d3sJd Td5hKs2c",
      Solver.process("omaha-holdem 2d2h9sJcTs 9h4s5d6s Td5hKs2c 4h8h6hAs 7d4d3sJd"));
  }

  @Test
  public void test_omaha_holdem_1188_5c8sAdAhJh_7d3h4h3s_7sTh7h5d_2cKh9h8c_AsTsJsJc() {
    assertEquals(
      "7d3h4h3s 7sTh7h5d 2cKh9h8c AsTsJsJc",
      Solver.process("omaha-holdem 5c8sAdAhJh 7d3h4h3s 7sTh7h5d 2cKh9h8c AsTsJsJc"));
  }

  @Test
  public void test_omaha_holdem_1189_4h4sKcKdKh_6c7sQs4d_Js3d7cAd_Jd3c8c8s_QhJc8h8d() {
    assertEquals(
      "6c7sQs4d Js3d7cAd Jd3c8c8s=QhJc8h8d",
      Solver.process("omaha-holdem 4h4sKcKdKh 6c7sQs4d Js3d7cAd Jd3c8c8s QhJc8h8d"));
  }

  @Test
  public void test_omaha_holdem_1190_2c3d8dKsTd_8s2h4h3c_JcAcAs9h_Jh3s2s5d_6c6dTc4s_6h9sAd4d_7hQs7cTs_7d8h6sTh() {
    assertEquals(
      "6c6dTc4s 7hQs7cTs JcAcAs9h Jh3s2s5d 8s2h4h3c 7d8h6sTh 6h9sAd4d",
      Solver.process("omaha-holdem 2c3d8dKsTd 8s2h4h3c JcAcAs9h Jh3s2s5d 6c6dTc4s 6h9sAd4d 7hQs7cTs 7d8h6sTh"));
  }

  @Test
  public void test_omaha_holdem_1191_3d7sJhKcQh_KdTs3c7h_4d9h3h8s() {
    assertEquals(
      "4d9h3h8s KdTs3c7h",
      Solver.process("omaha-holdem 3d7sJhKcQh KdTs3c7h 4d9h3h8s"));
  }

  @Test
  public void test_omaha_holdem_1192_2d4h7h9hTd_8sAhKd6h_8h4sJc7s_AcKh6dKs_7d3h5d4d() {
    assertEquals(
      "AcKh6dKs 7d3h5d4d 8h4sJc7s 8sAhKd6h",
      Solver.process("omaha-holdem 2d4h7h9hTd 8sAhKd6h 8h4sJc7s AcKh6dKs 7d3h5d4d"));
  }

  @Test
  public void test_omaha_holdem_1193_2s3h4d4h6s_8cJs3s6h_Jd5cTd2d_Kc9sAd9d() {
    assertEquals(
      "8cJs3s6h Kc9sAd9d Jd5cTd2d",
      Solver.process("omaha-holdem 2s3h4d4h6s 8cJs3s6h Jd5cTd2d Kc9sAd9d"));
  }

  @Test
  public void test_omaha_holdem_1194_4c7d9hAsQs_8sKcAh7h_Js4s5c5h_Ad6dTs6c() {
    assertEquals(
      "Js4s5c5h Ad6dTs6c 8sKcAh7h",
      Solver.process("omaha-holdem 4c7d9hAsQs 8sKcAh7h Js4s5c5h Ad6dTs6c"));
  }

  @Test
  public void test_omaha_holdem_1195_2d5s6s8cKs_3h8sAsJd_Jc4h2s7c_9d4sQhQs_Th2hTsTd_3sKhAcQc_9sKdQd4d_Kc7d2c6c_Ad7sAh3c_6hTc5c4c() {
    assertEquals(
      "Th2hTsTd 9sKdQd4d 3sKhAcQc Ad7sAh3c 6hTc5c4c Kc7d2c6c Jc4h2s7c 9d4sQhQs 3h8sAsJd",
      Solver.process("omaha-holdem 2d5s6s8cKs 3h8sAsJd Jc4h2s7c 9d4sQhQs Th2hTsTd 3sKhAcQc 9sKdQd4d Kc7d2c6c Ad7sAh3c 6hTc5c4c"));
  }

  @Test
  public void test_omaha_holdem_1196_3s5s8s9dJd_7d6d6s9h_QsKcKd5c_2dQc2s2h_Ts9c7sAd_KhKsThAc_Tc2cQd8c_6c8d3cJc_4c7h4sAh() {
    assertEquals(
      "2dQc2s2h 4c7h4sAh KhKsThAc=QsKcKd5c 6c8d3cJc 7d6d6s9h Tc2cQd8c Ts9c7sAd",
      Solver.process("omaha-holdem 3s5s8s9dJd 7d6d6s9h QsKcKd5c 2dQc2s2h Ts9c7sAd KhKsThAc Tc2cQd8c 6c8d3cJc 4c7h4sAh"));
  }

  @Test
  public void test_omaha_holdem_1197_2c2d7c7dAs_Td5c5s5h_KcKs3s4h_Js8h3hQc_7hTs9sAd_3d4s9h6d_Tc2h8cJc_QhQdKd4c_Ac9dJd8s_7s6s4d3c() {
    assertEquals(
      "3d4s9h6d Js8h3hQc Td5c5s5h QhQdKd4c KcKs3s4h Ac9dJd8s Tc2h8cJc 7s6s4d3c 7hTs9sAd",
      Solver.process("omaha-holdem 2c2d7c7dAs Td5c5s5h KcKs3s4h Js8h3hQc 7hTs9sAd 3d4s9h6d Tc2h8cJc QhQdKd4c Ac9dJd8s 7s6s4d3c"));
  }

  @Test
  public void test_omaha_holdem_1198_6c6sKhQdTh_2c9s3s7d_4cQs4h3d_8h7h5dTd() {
    assertEquals(
      "2c9s3s7d 8h7h5dTd 4cQs4h3d",
      Solver.process("omaha-holdem 6c6sKhQdTh 2c9s3s7d 4cQs4h3d 8h7h5dTd"));
  }

  @Test
  public void test_omaha_holdem_1199_8hJhKcQcTs_Kd4h3hKh_8dQs7hKs_ThAh7dAd_3cAs7s7c_6d8cAcJs_8s6cJc2d_Jd9h5c5d_4d6s6hQh() {
    assertEquals(
      "3cAs7s7c 4d6s6hQh 8s6cJc2d 8dQs7hKs Kd4h3hKh Jd9h5c5d 6d8cAcJs=ThAh7dAd",
      Solver.process("omaha-holdem 8hJhKcQcTs Kd4h3hKh 8dQs7hKs ThAh7dAd 3cAs7s7c 6d8cAcJs 8s6cJc2d Jd9h5c5d 4d6s6hQh"));
  }

  @Test
  public void test_omaha_holdem_1200_4s5h5s7sTc_Ks7h2d8d_7dJdKc3h_4c2c9h2h_QsJsAd3d_6sKd9sQc_JcAh5d6c_8sTh9dTd_2s8h8c7c_As3c6hAc() {
    assertEquals(
      "4c2c9h2h 7dJdKc3h=Ks7h2d8d 2s8h8c7c JcAh5d6c As3c6hAc 6sKd9sQc QsJsAd3d 8sTh9dTd",
      Solver.process("omaha-holdem 4s5h5s7sTc Ks7h2d8d 7dJdKc3h 4c2c9h2h QsJsAd3d 6sKd9sQc JcAh5d6c 8sTh9dTd 2s8h8c7c As3c6hAc"));
  }

  @Test
  public void test_omaha_holdem_1201_8h9hJhJsTh_3h2s6h8s_2h8dJc8c_3c7d7h6s_KhKd6d4c_TsAh7c3s_QhAdQc4h_As2d2c4d_Ks9s5dAc() {
    assertEquals(
      "As2d2c4d Ks9s5dAc KhKd6d4c 3c7d7h6s TsAh7c3s 3h2s6h8s QhAdQc4h 2h8dJc8c",
      Solver.process("omaha-holdem 8h9hJhJsTh 3h2s6h8s 2h8dJc8c 3c7d7h6s KhKd6d4c TsAh7c3s QhAdQc4h As2d2c4d Ks9s5dAc"));
  }

  @Test
  public void test_omaha_holdem_1202_7dAhKcKsQc_Kd5h2h8c_9h9cAs6c() {
    assertEquals(
      "9h9cAs6c Kd5h2h8c",
      Solver.process("omaha-holdem 7dAhKcKsQc Kd5h2h8c 9h9cAs6c"));
  }

  @Test
  public void test_omaha_holdem_1203_3d5c7c7hTs_Qd3hAdAc_TcQc3s4c_ThQh9d5d_KcQsJsAs_6dJh6s9s_9cAh9h7s_2c6hJd4h() {
    assertEquals(
      "KcQsJsAs 6dJh6s9s TcQc3s4c=ThQh9d5d Qd3hAdAc 9cAh9h7s 2c6hJd4h",
      Solver.process("omaha-holdem 3d5c7c7hTs Qd3hAdAc TcQc3s4c ThQh9d5d KcQsJsAs 6dJh6s9s 9cAh9h7s 2c6hJd4h"));
  }

  @Test
  public void test_omaha_holdem_1204_2h5c5d7cAh_Qh7dAc8s_7s8c8d9h() {
    assertEquals(
      "7s8c8d9h Qh7dAc8s",
      Solver.process("omaha-holdem 2h5c5d7cAh Qh7dAc8s 7s8c8d9h"));
  }

  @Test
  public void test_omaha_holdem_1205_6d6s8s9dTc_9hAd8c5s_QsAh4sKd_Qd5h5cKs() {
    assertEquals(
      "QsAh4sKd Qd5h5cKs 9hAd8c5s",
      Solver.process("omaha-holdem 6d6s8s9dTc 9hAd8c5s QsAh4sKd Qd5h5cKs"));
  }

  @Test
  public void test_omaha_holdem_1206_3h3s6d9cKs_JdJc8h9h_5sAhTdKc_8s7h7d4c_6cKdAc8d_Ad3dTs9s_2c2dJs5c_2s6sJhQh() {
    assertEquals(
      "2c2dJs5c 2s6sJhQh 8s7h7d4c JdJc8h9h 5sAhTdKc 6cKdAc8d Ad3dTs9s",
      Solver.process("omaha-holdem 3h3s6d9cKs JdJc8h9h 5sAhTdKc 8s7h7d4c 6cKdAc8d Ad3dTs9s 2c2dJs5c 2s6sJhQh"));
  }

  @Test
  public void test_omaha_holdem_1207_3s5h5sJcJd_Jh2dKs7s_Qc2s9h8s_Kc7c4c5c_8h8d9c4d_6hTh4h8c_3c6dAdAh_Ts9sTcKh_Qs6sTd3d_KdAcJs5d() {
    assertEquals(
      "6hTh4h8c Qc2s9h8s Qs6sTd3d 8h8d9c4d Ts9sTcKh 3c6dAdAh Kc7c4c5c Jh2dKs7s KdAcJs5d",
      Solver.process("omaha-holdem 3s5h5sJcJd Jh2dKs7s Qc2s9h8s Kc7c4c5c 8h8d9c4d 6hTh4h8c 3c6dAdAh Ts9sTcKh Qs6sTd3d KdAcJs5d"));
  }

  @Test
  public void test_omaha_holdem_1208_4c7dAdJsKs_2d5hKd9d_5d6cTs7s() {
    assertEquals(
      "5d6cTs7s 2d5hKd9d",
      Solver.process("omaha-holdem 4c7dAdJsKs 2d5hKd9d 5d6cTs7s"));
  }

  @Test
  public void test_omaha_holdem_1209_7c9c9hKsTd_6cAd9d6d_6h2c3d4d_8cTs5s8h_4s7hJcQd_Kh5hQc4h() {
    assertEquals(
      "6h2c3d4d 8cTs5s8h Kh5hQc4h 6cAd9d6d 4s7hJcQd",
      Solver.process("omaha-holdem 7c9c9hKsTd 6cAd9d6d 6h2c3d4d 8cTs5s8h 4s7hJcQd Kh5hQc4h"));
  }

  @Test
  public void test_omaha_holdem_1210_3d3h4d5c7c_8hJd4cQc_5dTc9dAd_3sTh6cTd() {
    assertEquals(
      "8hJd4cQc 5dTc9dAd 3sTh6cTd",
      Solver.process("omaha-holdem 3d3h4d5c7c 8hJd4cQc 5dTc9dAd 3sTh6cTd"));
  }

  @Test
  public void test_omaha_holdem_1211_7h8c8sKcTd_Jh3s4c5d_3h4h2hQc_2d7sJcTc_Kd6hQhJd_ThQs9c6s_Kh9d3c7d() {
    assertEquals(
      "Jh3s4c5d 3h4h2hQc 2d7sJcTc Kh9d3c7d Kd6hQhJd ThQs9c6s",
      Solver.process("omaha-holdem 7h8c8sKcTd Jh3s4c5d 3h4h2hQc 2d7sJcTc Kd6hQhJd ThQs9c6s Kh9d3c7d"));
  }

  @Test
  public void test_omaha_holdem_1212_8d9dJcKsTs_TcQc7h9c_Js2h6hQd_Ah5hQhJh_4d5d3s8h_5s6cTdQs_4cAdKh7c_Th7d5cAs_3c6s8s3h() {
    assertEquals(
      "4d5d3s8h 3c6s8s3h 4cAdKh7c Th7d5cAs 5s6cTdQs=Js2h6hQd=TcQc7h9c Ah5hQhJh",
      Solver.process("omaha-holdem 8d9dJcKsTs TcQc7h9c Js2h6hQd Ah5hQhJh 4d5d3s8h 5s6cTdQs 4cAdKh7c Th7d5cAs 3c6s8s3h"));
  }

  @Test
  public void test_omaha_holdem_1213_4c5s7s9sTc_Ts3cTh2c_Jc7h4h4s_Qc5hJh8c_Qh8d7d7c_As8sKs6d_9dKdQdAd() {
    assertEquals(
      "9dKdQdAd Jc7h4h4s Qh8d7d7c Ts3cTh2c Qc5hJh8c As8sKs6d",
      Solver.process("omaha-holdem 4c5s7s9sTc Ts3cTh2c Jc7h4h4s Qc5hJh8c Qh8d7d7c As8sKs6d 9dKdQdAd"));
  }

  @Test
  public void test_omaha_holdem_1214_2d4h9hJcTh_TsQdKhAh_8d5dTd2c_Kd4dQc6d_9c7h6s5h() {
    assertEquals(
      "8d5dTd2c Kd4dQc6d 9c7h6s5h TsQdKhAh",
      Solver.process("omaha-holdem 2d4h9hJcTh TsQdKhAh 8d5dTd2c Kd4dQc6d 9c7h6s5h"));
  }

  @Test
  public void test_omaha_holdem_1215_3s4h6dAcQs_5d9cJdKs_Qd8c3d6c_2hKcJh4d_4c2s3h6s_Kd8sKh8d_Th5c9d5h_5sAs2cJs_Ah3c9h7h_Jc8hQhTc() {
    assertEquals(
      "5d9cJdKs 2hKcJh4d Th5c9d5h Jc8hQhTc Kd8sKh8d 4c2s3h6s Qd8c3d6c Ah3c9h7h 5sAs2cJs",
      Solver.process("omaha-holdem 3s4h6dAcQs 5d9cJdKs Qd8c3d6c 2hKcJh4d 4c2s3h6s Kd8sKh8d Th5c9d5h 5sAs2cJs Ah3c9h7h Jc8hQhTc"));
  }

  @Test
  public void test_omaha_holdem_1216_6d7c9d9hQc_2d8dJcAc_8s5d8hKh_5c4d4s4h_6cKc2cTs_Jh8c7s7h_TcAs6hAh_QhJd9cTd_Kd2sJs7d() {
    assertEquals(
      "2d8dJcAc 5c4d4s4h 6cKc2cTs Kd2sJs7d TcAs6hAh 8s5d8hKh Jh8c7s7h QhJd9cTd",
      Solver.process("omaha-holdem 6d7c9d9hQc 2d8dJcAc 8s5d8hKh 5c4d4s4h 6cKc2cTs Jh8c7s7h TcAs6hAh QhJd9cTd Kd2sJs7d"));
  }

  @Test
  public void test_omaha_holdem_1217_9hAsJhKcKd_6dAdAcTh_Jc2c8s3d_2dQs6sQc_4h8h7cJs_9sJd7d5c() {
    assertEquals(
      "4h8h7cJs=Jc2c8s3d 9sJd7d5c 2dQs6sQc 6dAdAcTh",
      Solver.process("omaha-holdem 9hAsJhKcKd 6dAdAcTh Jc2c8s3d 2dQs6sQc 4h8h7cJs 9sJd7d5c"));
  }

  @Test
  public void test_omaha_holdem_1218_3s4d6s8cJc_JhKdAd2d_8dAs5h3d_6dTh4s5c_Qd8sKcJd_3hAh9hQs_JsKh3cAc_Tc4h7sTd() {
    assertEquals(
      "3hAh9hQs Tc4h7sTd JhKdAd2d 6dTh4s5c 8dAs5h3d JsKh3cAc Qd8sKcJd",
      Solver.process("omaha-holdem 3s4d6s8cJc JhKdAd2d 8dAs5h3d 6dTh4s5c Qd8sKcJd 3hAh9hQs JsKh3cAc Tc4h7sTd"));
  }

  @Test
  public void test_omaha_holdem_1219_2h5c9sKsQd_2cQc7hAh_7dAd3c6c_AsThQh8h_7sAc6s9d_Js6d7c8d_6h5hTcTd_9cKc3s3h_4s4dKd9h_JdJcKhQs() {
    assertEquals(
      "Js6d7c8d 7dAd3c6c 7sAc6s9d 6h5hTcTd AsThQh8h 2cQc7hAh 4s4dKd9h=9cKc3s3h JdJcKhQs",
      Solver.process("omaha-holdem 2h5c9sKsQd 2cQc7hAh 7dAd3c6c AsThQh8h 7sAc6s9d Js6d7c8d 6h5hTcTd 9cKc3s3h 4s4dKd9h JdJcKhQs"));
  }

  @Test
  public void test_omaha_holdem_1220_4h5sQsTdTs_JsKh9d4s_2d8s6sTc_6c3h4c8d_7cAd8cKc_3d3c6hJd_9sAsAc5h() {
    assertEquals(
      "7cAd8cKc 3d3c6hJd 6c3h4c8d 2d8s6sTc JsKh9d4s 9sAsAc5h",
      Solver.process("omaha-holdem 4h5sQsTdTs JsKh9d4s 2d8s6sTc 6c3h4c8d 7cAd8cKc 3d3c6hJd 9sAsAc5h"));
  }

  @Test
  public void test_omaha_holdem_1221_2d3s6c8cAs_9cKh3cKd_Kc4hQh5h_8s3h6d2c_7dTd4d7h_7cQc2h6h() {
    assertEquals(
      "7dTd4d7h 9cKh3cKd 7cQc2h6h 8s3h6d2c Kc4hQh5h",
      Solver.process("omaha-holdem 2d3s6c8cAs 9cKh3cKd Kc4hQh5h 8s3h6d2c 7dTd4d7h 7cQc2h6h"));
  }

  @Test
  public void test_omaha_holdem_1222_2h8c8dJhQd_Jd5dKhQc_2cAc8h7c_AhTs9d2d() {
    assertEquals(
      "Jd5dKhQc AhTs9d2d 2cAc8h7c",
      Solver.process("omaha-holdem 2h8c8dJhQd Jd5dKhQc 2cAc8h7c AhTs9d2d"));
  }

  @Test
  public void test_omaha_holdem_1223_4s8d9cAdTh_Kd7h4d6c_8cQs3s6s_Qd7d2sJd_Qh8h6hAc_4cKh5d9s_3cJhTc9d_5s2h2d5h() {
    assertEquals(
      "5s2h2d5h 8cQs3s6s 4cKh5d9s 3cJhTc9d Qh8h6hAc Kd7h4d6c Qd7d2sJd",
      Solver.process("omaha-holdem 4s8d9cAdTh Kd7h4d6c 8cQs3s6s Qd7d2sJd Qh8h6hAc 4cKh5d9s 3cJhTc9d 5s2h2d5h"));
  }

  @Test
  public void test_omaha_holdem_1224_8cAdJdJsQs_9h6sTs8h_Ac7s3dKs_Jc7c4c9s() {
    assertEquals(
      "Ac7s3dKs Jc7c4c9s 9h6sTs8h",
      Solver.process("omaha-holdem 8cAdJdJsQs 9h6sTs8h Ac7s3dKs Jc7c4c9s"));
  }

  @Test
  public void test_omaha_holdem_1225_7c7s8c9cJs_TcAd2s3c_Ac6dTh8d_2hAs4hKd_3sKc7d5d_9s6hTs4d_9hQd7hTd_4s4cQcQh_Ks5c9dKh() {
    assertEquals(
      "2hAs4hKd Ks5c9dKh 3sKc7d5d 9s6hTs4d=Ac6dTh8d TcAd2s3c 4s4cQcQh 9hQd7hTd",
      Solver.process("omaha-holdem 7c7s8c9cJs TcAd2s3c Ac6dTh8d 2hAs4hKd 3sKc7d5d 9s6hTs4d 9hQd7hTd 4s4cQcQh Ks5c9dKh"));
  }

  @Test
  public void test_omaha_holdem_1226_9d9sJcKdKs_Js6h3sQs_8hQc6c9h_6sThTd4c() {
    assertEquals(
      "6sThTd4c Js6h3sQs 8hQc6c9h",
      Solver.process("omaha-holdem 9d9sJcKdKs Js6h3sQs 8hQc6c9h 6sThTd4c"));
  }

  @Test
  public void test_omaha_holdem_1227_2d7h8c9dQc_6h5sKcAh_Qd6d4c3c_3d7sJdAd_3sQs5h3h_Td6sTc8h_TsJc9hTh_9sAcAs7c_Qh2s8s2c_KsJh7dKd() {
    assertEquals(
      "3d7sJdAd 3sQs5h3h Qd6d4c3c KsJh7dKd 9sAcAs7c Qh2s8s2c 6h5sKcAh Td6sTc8h TsJc9hTh",
      Solver.process("omaha-holdem 2d7h8c9dQc 6h5sKcAh Qd6d4c3c 3d7sJdAd 3sQs5h3h Td6sTc8h TsJc9hTh 9sAcAs7c Qh2s8s2c KsJh7dKd"));
  }

  @Test
  public void test_omaha_holdem_1228_5sAdAsJcTc_Jd3s2h8h_5hKc7dAh_7cQc4sQh_Js3d4c3c_6cQs4d7h() {
    assertEquals(
      "6cQs4d7h Js3d4c3c Jd3s2h8h 7cQc4sQh 5hKc7dAh",
      Solver.process("omaha-holdem 5sAdAsJcTc Jd3s2h8h 5hKc7dAh 7cQc4sQh Js3d4c3c 6cQs4d7h"));
  }

  @Test
  public void test_omaha_holdem_1229_4d5c5h9c9s_4hJsQhAd_KsJh5s8c_Tc2cTs7s_4sAh2s8h_Ac3d6s2h_2d6dQc6c() {
    assertEquals(
      "Ac3d6s2h 4hJsQhAd=4sAh2s8h 2d6dQc6c Tc2cTs7s KsJh5s8c",
      Solver.process("omaha-holdem 4d5c5h9c9s 4hJsQhAd KsJh5s8c Tc2cTs7s 4sAh2s8h Ac3d6s2h 2d6dQc6c"));
  }

  @Test
  public void test_omaha_holdem_1230_2s3h5s6hAs_JdQcTs2d_Ad7s9sTc_Kc3dQsJc_7h4h9c4d_8h6sAcJh_2c5h2h7c_5dQdKdKh_6dQh6c7d_3cKs4s9d() {
    assertEquals(
      "JdQcTs2d Kc3dQsJc 5dQdKdKh 8h6sAcJh 2c5h2h7c 6dQh6c7d 7h4h9c4d Ad7s9sTc 3cKs4s9d",
      Solver.process("omaha-holdem 2s3h5s6hAs JdQcTs2d Ad7s9sTc Kc3dQsJc 7h4h9c4d 8h6sAcJh 2c5h2h7c 5dQdKdKh 6dQh6c7d 3cKs4s9d"));
  }

  @Test
  public void test_omaha_holdem_1231_3h4h6sAsTd_9c7dTh6d_Ks7hTsJs() {
    assertEquals(
      "Ks7hTsJs 9c7dTh6d",
      Solver.process("omaha-holdem 3h4h6sAsTd 9c7dTh6d Ks7hTsJs"));
  }

  @Test
  public void test_omaha_holdem_1232_3c7sKcTdTh_4h3dTcQd_JcAd4d6d() {
    assertEquals(
      "JcAd4d6d 4h3dTcQd",
      Solver.process("omaha-holdem 3c7sKcTdTh 4h3dTcQd JcAd4d6d"));
  }

  @Test
  public void test_omaha_holdem_1233_3c8h8s9hJs_2d4c4d4h_5h3s8d6c_9dKcQsKs_7c7d6s7s_TdAc7h6d_As2c8cJd_AdTc3dTs() {
    assertEquals(
      "2d4c4d4h 7c7d6s7s AdTc3dTs 9dKcQsKs TdAc7h6d 5h3s8d6c As2c8cJd",
      Solver.process("omaha-holdem 3c8h8s9hJs 2d4c4d4h 5h3s8d6c 9dKcQsKs 7c7d6s7s TdAc7h6d As2c8cJd AdTc3dTs"));
  }

  @Test
  public void test_omaha_holdem_1234_5d5h6d7cKc_3s9s9h8c_6cTh5cTs_9c6hKd3h_2dKs7d4h() {
    assertEquals(
      "9c6hKd3h 2dKs7d4h 3s9s9h8c 6cTh5cTs",
      Solver.process("omaha-holdem 5d5h6d7cKc 3s9s9h8c 6cTh5cTs 9c6hKd3h 2dKs7d4h"));
  }

  @Test
  public void test_omaha_holdem_1235_5s8sJcKcKs_Ts2c7c5d_2hKhKd8c_6d4sThAd_7d3h3d6c_7sTd4c2d_As3c9hJs_9d7hQsQd_4d4hAh8h() {
    assertEquals(
      "7sTd4c2d 6d4sThAd 7d3h3d6c Ts2c7c5d 4d4hAh8h 9d7hQsQd As3c9hJs 2hKhKd8c",
      Solver.process("omaha-holdem 5s8sJcKcKs Ts2c7c5d 2hKhKd8c 6d4sThAd 7d3h3d6c 7sTd4c2d As3c9hJs 9d7hQsQd 4d4hAh8h"));
  }

  @Test
  public void test_omaha_holdem_1236_2d2h8hAsJc_8c6s9hAh_6h5sAd4h_QdJdTdJs_5cKsQc8s_2cQs3s7d_7cKc5hAc() {
    assertEquals(
      "5cKsQc8s 6h5sAd4h 7cKc5hAc 8c6s9hAh 2cQs3s7d QdJdTdJs",
      Solver.process("omaha-holdem 2d2h8hAsJc 8c6s9hAh 6h5sAd4h QdJdTdJs 5cKsQc8s 2cQs3s7d 7cKc5hAc"));
  }

  @Test
  public void test_omaha_holdem_1237_4s6dJhQhTc_2s5c9s8s_QdJd4hTs_7s2d9c7c_5s3s4dTh() {
    assertEquals(
      "7s2d9c7c 5s3s4dTh QdJd4hTs 2s5c9s8s",
      Solver.process("omaha-holdem 4s6dJhQhTc 2s5c9s8s QdJd4hTs 7s2d9c7c 5s3s4dTh"));
  }

  @Test
  public void test_omaha_holdem_1238_2h5s6dAsQd_9dJh8s4s_Js8cJcAc_2sTc7hQs_7sKs6hTh() {
    assertEquals(
      "9dJh8s4s 7sKs6hTh Js8cJcAc 2sTc7hQs",
      Solver.process("omaha-holdem 2h5s6dAsQd 9dJh8s4s Js8cJcAc 2sTc7hQs 7sKs6hTh"));
  }

  @Test
  public void test_omaha_holdem_1239_3c5c6sJcQd_5d4h2d7s_9hQh2cKs() {
    assertEquals(
      "9hQh2cKs 5d4h2d7s",
      Solver.process("omaha-holdem 3c5c6sJcQd 5d4h2d7s 9hQh2cKs"));
  }

  @Test
  public void test_omaha_holdem_1240_4d6hJcKcQh_Ad7c4hTs_8d2c4s5d_6cTcQs7d() {
    assertEquals(
      "8d2c4s5d 6cTcQs7d Ad7c4hTs",
      Solver.process("omaha-holdem 4d6hJcKcQh Ad7c4hTs 8d2c4s5d 6cTcQs7d"));
  }

  @Test
  public void test_omaha_holdem_1241_2d3c3d5dAh_TsKcQhTc_JhAcQd8d_4s4h2c4c_5h9dJs7s_9s6d7d9c_5c7c4dKs_8s3s8cQs() {
    assertEquals(
      "5h9dJs7s TsKcQhTc 8s3s8cQs 4s4h2c4c=5c7c4dKs 9s6d7d9c JhAcQd8d",
      Solver.process("omaha-holdem 2d3c3d5dAh TsKcQhTc JhAcQd8d 4s4h2c4c 5h9dJs7s 9s6d7d9c 5c7c4dKs 8s3s8cQs"));
  }

  @Test
  public void test_omaha_holdem_1242_8c8d8h9hJd_9s9d4d5h_9cQs3h4h_Ks7sJs6c_KdJc5d7h_AsAc2c6h_3c7dTc3d_6sTd6d5s_2hQh7cKc() {
    assertEquals(
      "9cQs3h4h KdJc5d7h=Ks7sJs6c 2hQh7cKc 3c7dTc3d 6sTd6d5s AsAc2c6h 9s9d4d5h",
      Solver.process("omaha-holdem 8c8d8h9hJd 9s9d4d5h 9cQs3h4h Ks7sJs6c KdJc5d7h AsAc2c6h 3c7dTc3d 6sTd6d5s 2hQh7cKc"));
  }

  @Test
  public void test_omaha_holdem_1243_7h8c8sAdQh_6cJc6h4c_6d9s4hTd_3dKs2d8d_5sKd9cJh_5dTs7sKc_6sTc4d9h() {
    assertEquals(
      "6d9s4hTd=6sTc4d9h 5sKd9cJh 6cJc6h4c 5dTs7sKc 3dKs2d8d",
      Solver.process("omaha-holdem 7h8c8sAdQh 6cJc6h4c 6d9s4hTd 3dKs2d8d 5sKd9cJh 5dTs7sKc 6sTc4d9h"));
  }

  @Test
  public void test_omaha_holdem_1244_4d6c7cJdTs_8d5sKh6d_3sAc7sTd_Qs8cTcAd_Kd4h4sJh_9s7h2s6s_2hKcAh3d_4c9h9cTh_Qc6hJs5c() {
    assertEquals(
      "2hKcAh3d Qs8cTcAd 9s7h2s6s 4c9h9cTh 3sAc7sTd Qc6hJs5c Kd4h4sJh 8d5sKh6d",
      Solver.process("omaha-holdem 4d6c7cJdTs 8d5sKh6d 3sAc7sTd Qs8cTcAd Kd4h4sJh 9s7h2s6s 2hKcAh3d 4c9h9cTh Qc6hJs5c"));
  }

  @Test
  public void test_omaha_holdem_1245_6c9c9dJdTh_Kc7s3c8d_4d3sKhJc_8sTd5c5d_KsQd5hAd_3d2c9hTc() {
    assertEquals(
      "8sTd5c5d 4d3sKhJc Kc7s3c8d KsQd5hAd 3d2c9hTc",
      Solver.process("omaha-holdem 6c9c9dJdTh Kc7s3c8d 4d3sKhJc 8sTd5c5d KsQd5hAd 3d2c9hTc"));
  }

  @Test
  public void test_omaha_holdem_1246_2d2s6s7cAd_TsQs4c4s_6d9s9d3d_Td7s8c4d_2h5hAsKh() {
    assertEquals(
      "TsQs4c4s Td7s8c4d 6d9s9d3d 2h5hAsKh",
      Solver.process("omaha-holdem 2d2s6s7cAd TsQs4c4s 6d9s9d3d Td7s8c4d 2h5hAsKh"));
  }

  @Test
  public void test_omaha_holdem_1247_8cAdJhQdTs_Kh6s7h8d_4cTcAh8h_6c3dKc9c() {
    assertEquals(
      "Kh6s7h8d 4cTcAh8h 6c3dKc9c",
      Solver.process("omaha-holdem 8cAdJhQdTs Kh6s7h8d 4cTcAh8h 6c3dKc9c"));
  }

  @Test
  public void test_omaha_holdem_1248_2c4h6h9dQd_7h7dQcKs_TcJc8c2s_2dTh8s5c_5h3sJh8h_4sJs9s3d() {
    assertEquals(
      "2dTh8s5c TcJc8c2s 7h7dQcKs 4sJs9s3d 5h3sJh8h",
      Solver.process("omaha-holdem 2c4h6h9dQd 7h7dQcKs TcJc8c2s 2dTh8s5c 5h3sJh8h 4sJs9s3d"));
  }

  @Test
  public void test_omaha_holdem_1249_5h8c9dKcKs_TdQhTh4h_Ad4s3h6s_Jh5dJc9s_3dKhAs5s_3c6d9h7h_8s2cTsJs_6hQcTc2h_Qs9c2d8h_8dAc5c3s() {
    assertEquals(
      "6hQcTc2h Ad4s3h6s 8s2cTsJs 8dAc5c3s Qs9c2d8h TdQhTh4h Jh5dJc9s 3c6d9h7h 3dKhAs5s",
      Solver.process("omaha-holdem 5h8c9dKcKs TdQhTh4h Ad4s3h6s Jh5dJc9s 3dKhAs5s 3c6d9h7h 8s2cTsJs 6hQcTc2h Qs9c2d8h 8dAc5c3s"));
  }

}
