
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OmahaHoldemSolver16HiddenTest {


  @Test
  public void test_omaha_holdem_4000_3h4h7dJcKd_5c6cJd6s_As9s5h6h_9d2h2sQh_5dAhQc4c_7c3cAc5s() {
    assertEquals(
      "9d2h2sQh 5dAhQc4c 7c3cAc5s 5c6cJd6s=As9s5h6h",
      Solver.process("omaha-holdem 3h4h7dJcKd 5c6cJd6s As9s5h6h 9d2h2sQh 5dAhQc4c 7c3cAc5s"));
  }

  @Test
  public void test_omaha_holdem_4001_4s5h8s9cTh_4dJsKh7c_Qc8d7sAs_Jd2dJh6h_8hQs7d8c_QdQh6s5s_2h9sAdTs_4cAhAc3s_3hKs4hJc_Tc7hKd5d() {
    assertEquals(
      "3hKs4hJc Qc8d7sAs Jd2dJh6h QdQh6s5s 4cAhAc3s Tc7hKd5d 2h9sAdTs 8hQs7d8c 4dJsKh7c",
      Solver.process("omaha-holdem 4s5h8s9cTh 4dJsKh7c Qc8d7sAs Jd2dJh6h 8hQs7d8c QdQh6s5s 2h9sAdTs 4cAhAc3s 3hKs4hJc Tc7hKd5d"));
  }

  @Test
  public void test_omaha_holdem_4002_2d2s6cJhKs_7s4c3h2h_Th7cJsQs_9d9sTc8s_3d5d9c9h_Ad7d4dKh_Kc6s7h8d() {
    assertEquals(
      "3d5d9c9h=9d9sTc8s Th7cJsQs Ad7d4dKh Kc6s7h8d 7s4c3h2h",
      Solver.process("omaha-holdem 2d2s6cJhKs 7s4c3h2h Th7cJsQs 9d9sTc8s 3d5d9c9h Ad7d4dKh Kc6s7h8d"));
  }

  @Test
  public void test_omaha_holdem_4003_3s4s5s7sTd_2hAs9d8d_Qc2cJs9c_JhAcAd3d() {
    assertEquals(
      "Qc2cJs9c JhAcAd3d 2hAs9d8d",
      Solver.process("omaha-holdem 3s4s5s7sTd 2hAs9d8d Qc2cJs9c JhAcAd3d"));
  }

  @Test
  public void test_omaha_holdem_4004_4d4s9hAcKd_8hQsThTc_Kc5s8d4c_3c7d6h2h_6s4hQh8c() {
    assertEquals(
      "3c7d6h2h 8hQsThTc 6s4hQh8c Kc5s8d4c",
      Solver.process("omaha-holdem 4d4s9hAcKd 8hQsThTc Kc5s8d4c 3c7d6h2h 6s4hQh8c"));
  }

  @Test
  public void test_omaha_holdem_4005_5d8h9sAcQh_3d5c3s5h_2d6s6c2h_8cTsTd3h_9c4h8d4c_8s4sJhJd_5sAsTc7h_JsKsAh9d_9hQd6h6d() {
    assertEquals(
      "2d6s6c2h 8cTsTd3h 8s4sJhJd 9c4h8d4c 9hQd6h6d 5sAsTc7h JsKsAh9d 3d5c3s5h",
      Solver.process("omaha-holdem 5d8h9sAcQh 3d5c3s5h 2d6s6c2h 8cTsTd3h 9c4h8d4c 8s4sJhJd 5sAsTc7h JsKsAh9d 9hQd6h6d"));
  }

  @Test
  public void test_omaha_holdem_4006_6c7s8cKcTs_3dQs8h2d_9d3h4c2s_6hAs4sKs() {
    assertEquals(
      "9d3h4c2s 3dQs8h2d 6hAs4sKs",
      Solver.process("omaha-holdem 6c7s8cKcTs 3dQs8h2d 9d3h4c2s 6hAs4sKs"));
  }

  @Test
  public void test_omaha_holdem_4007_6d9d9h9sQd_TdQs3hQc_7h5dJs3c_8sAh7d9c_Ks2dAdJh_6cAs8h5s_5h7c6hTs_Kh7s3d2s() {
    assertEquals(
      "5h7c6hTs 7h5dJs3c Kh7s3d2s 6cAs8h5s Ks2dAdJh TdQs3hQc 8sAh7d9c",
      Solver.process("omaha-holdem 6d9d9h9sQd TdQs3hQc 7h5dJs3c 8sAh7d9c Ks2dAdJh 6cAs8h5s 5h7c6hTs Kh7s3d2s"));
  }

  @Test
  public void test_omaha_holdem_4008_2s9sJcKsTd_As4s9cKd_5h3c6sJh_JsAd6c4c_QhKc7d7h_9d8c3s5s_5d3d4dQc_8dTs2d5c_6hAcQd3h() {
    assertEquals(
      "5d3d4dQc 5h3c6sJh JsAd6c4c 8dTs2d5c QhKc7d7h 6hAcQd3h 9d8c3s5s As4s9cKd",
      Solver.process("omaha-holdem 2s9sJcKsTd As4s9cKd 5h3c6sJh JsAd6c4c QhKc7d7h 9d8c3s5s 5d3d4dQc 8dTs2d5c 6hAcQd3h"));
  }

  @Test
  public void test_omaha_holdem_4009_2h3d4c4hKc_Jh6d9dTc_Jd7d4dKh_5h7s8dAc_5sQc3h5c_3sTdKs9h_8hQs2s9c() {
    assertEquals(
      "Jh6d9dTc 8hQs2s9c 5sQc3h5c 3sTdKs9h 5h7s8dAc Jd7d4dKh",
      Solver.process("omaha-holdem 2h3d4c4hKc Jh6d9dTc Jd7d4dKh 5h7s8dAc 5sQc3h5c 3sTdKs9h 8hQs2s9c"));
  }

  @Test
  public void test_omaha_holdem_4010_4h9hJcQcQh_8cTd5dKs_8sJd6d2h() {
    assertEquals(
      "8sJd6d2h 8cTd5dKs",
      Solver.process("omaha-holdem 4h9hJcQcQh 8cTd5dKs 8sJd6d2h"));
  }

  @Test
  public void test_omaha_holdem_4011_3s8hKhKsTd_5hJcTs2c_7h4d7d3d_Ah3h2dJh_6s4h5d8s_4cTcKd9c_6h8cKc2h() {
    assertEquals(
      "Ah3h2dJh 7h4d7d3d 6s4h5d8s 5hJcTs2c 6h8cKc2h 4cTcKd9c",
      Solver.process("omaha-holdem 3s8hKhKsTd 5hJcTs2c 7h4d7d3d Ah3h2dJh 6s4h5d8s 4cTcKd9c 6h8cKc2h"));
  }

  @Test
  public void test_omaha_holdem_4012_4d7cAsKhQs_Ah3s6h8d_Tc9hTdJh_6dJcJd3d_8sQhQcKs_7h4h2cKc() {
    assertEquals(
      "6dJcJd3d Ah3s6h8d 7h4h2cKc 8sQhQcKs Tc9hTdJh",
      Solver.process("omaha-holdem 4d7cAsKhQs Ah3s6h8d Tc9hTdJh 6dJcJd3d 8sQhQcKs 7h4h2cKc"));
  }

  @Test
  public void test_omaha_holdem_4013_3s9c9dAcAs_4d5s6c8s_QsKdJd2s_7c7h4c4h_6h6dTd4s_QcTcJhKs_3hTs5c9s() {
    assertEquals(
      "4d5s6c8s QcTcJhKs=QsKdJd2s 6h6dTd4s 7c7h4c4h 3hTs5c9s",
      Solver.process("omaha-holdem 3s9c9dAcAs 4d5s6c8s QsKdJd2s 7c7h4c4h 6h6dTd4s QcTcJhKs 3hTs5c9s"));
  }

  @Test
  public void test_omaha_holdem_4014_3h4d5sQdQh_9dJdAh3s_4c5h6hAd_4h7d5cKs_KhQc2h7s_2c5dJs2d_3dKd8s6c_7hTcKc6d() {
    assertEquals(
      "3dKd8s6c 9dJdAh3s 2c5dJs2d 4h7d5cKs 4c5h6hAd KhQc2h7s 7hTcKc6d",
      Solver.process("omaha-holdem 3h4d5sQdQh 9dJdAh3s 4c5h6hAd 4h7d5cKs KhQc2h7s 2c5dJs2d 3dKd8s6c 7hTcKc6d"));
  }

  @Test
  public void test_omaha_holdem_4015_3c4c5c8cKd_8s4dTcJd_6h2d4h9h_2c4s9c2h() {
    assertEquals(
      "8s4dTcJd 6h2d4h9h 2c4s9c2h",
      Solver.process("omaha-holdem 3c4c5c8cKd 8s4dTcJd 6h2d4h9h 2c4s9c2h"));
  }

  @Test
  public void test_omaha_holdem_4016_2cAhJdJhKd_7d4h9c7s_3s6dQdQc() {
    assertEquals(
      "7d4h9c7s 3s6dQdQc",
      Solver.process("omaha-holdem 2cAhJdJhKd 7d4h9c7s 3s6dQdQc"));
  }

  @Test
  public void test_omaha_holdem_4017_5d6d9c9dKh_QhQc8d7c_Ts8s4s3c_JsTc9hJh_7d4d5c4h_3h6h8c3s() {
    assertEquals(
      "Ts8s4s3c 3h6h8c3s JsTc9hJh QhQc8d7c 7d4d5c4h",
      Solver.process("omaha-holdem 5d6d9c9dKh QhQc8d7c Ts8s4s3c JsTc9hJh 7d4d5c4h 3h6h8c3s"));
  }

  @Test
  public void test_omaha_holdem_4018_4s7cJsKsTd_Qh2s5dAc_Jd8hKh3c_4c4dQs9h_2dTcAd9d_Ah7h3h6s_QcQdTs5c_2c8dJhTh_3dKd6cAs_6d9c2h9s() {
    assertEquals(
      "Ah7h3h6s 6d9c2h9s 2dTcAd9d QcQdTs5c 3dKd6cAs 2c8dJhTh Jd8hKh3c 4c4dQs9h Qh2s5dAc",
      Solver.process("omaha-holdem 4s7cJsKsTd Qh2s5dAc Jd8hKh3c 4c4dQs9h 2dTcAd9d Ah7h3h6s QcQdTs5c 2c8dJhTh 3dKd6cAs 6d9c2h9s"));
  }

  @Test
  public void test_omaha_holdem_4019_5c7cAhQcTd_5dKcJs2d_Qd7s6s6c_8hAcJd3c_4s2cThQh_9c8d9d3s_9h4h8cAs() {
    assertEquals(
      "9c8d9d3s 9h4h8cAs Qd7s6s6c 4s2cThQh 5dKcJs2d 8hAcJd3c",
      Solver.process("omaha-holdem 5c7cAhQcTd 5dKcJs2d Qd7s6s6c 8hAcJd3c 4s2cThQh 9c8d9d3s 9h4h8cAs"));
  }

  @Test
  public void test_omaha_holdem_4020_3h7dAcKdQd_4h4c2cJh_6c6h5hQc_Td2hAd8c_9c7hQs8h_5dAsJd7s_Kc6d9hJc_Th2sTcQh_5c4d8sTs() {
    assertEquals(
      "5c4d8sTs 4h4c2cJh 6c6h5hQc Th2sTcQh Kc6d9hJc 9c7hQs8h 5dAsJd7s Td2hAd8c",
      Solver.process("omaha-holdem 3h7dAcKdQd 4h4c2cJh 6c6h5hQc Td2hAd8c 9c7hQs8h 5dAsJd7s Kc6d9hJc Th2sTcQh 5c4d8sTs"));
  }

  @Test
  public void test_omaha_holdem_4021_5s6d7c7hAc_Td5c3sQd_2h6s8dJc_9s3hJhKc() {
    assertEquals(
      "9s3hJhKc Td5c3sQd 2h6s8dJc",
      Solver.process("omaha-holdem 5s6d7c7hAc Td5c3sQd 2h6s8dJc 9s3hJhKc"));
  }

  @Test
  public void test_omaha_holdem_4022_3d3h6h8dKs_4c3cTsQc_Jd5sJs6d_5d7c6sAs() {
    assertEquals(
      "5d7c6sAs Jd5sJs6d 4c3cTsQc",
      Solver.process("omaha-holdem 3d3h6h8dKs 4c3cTsQc Jd5sJs6d 5d7c6sAs"));
  }

  @Test
  public void test_omaha_holdem_4023_2c4d9dAdQc_KcJcTd9c_9h3c8d8h_3d8c2hJs_5h6h4cAs_QhJhQd3h_5dAc6d4s_2dAh9sTh() {
    assertEquals(
      "3d8c2hJs 9h3c8d8h KcJcTd9c 5h6h4cAs 2dAh9sTh QhJhQd3h 5dAc6d4s",
      Solver.process("omaha-holdem 2c4d9dAdQc KcJcTd9c 9h3c8d8h 3d8c2hJs 5h6h4cAs QhJhQd3h 5dAc6d4s 2dAh9sTh"));
  }

  @Test
  public void test_omaha_holdem_4024_2s3h4c8sJh_AhJs3s4h_5sQd5c6d() {
    assertEquals(
      "AhJs3s4h 5sQd5c6d",
      Solver.process("omaha-holdem 2s3h4c8sJh AhJs3s4h 5sQd5c6d"));
  }

  @Test
  public void test_omaha_holdem_4025_2s4c4h9cKs_JdJs6sTc_6cQd5c7h_7c4s8s4d_2h2d9hJc_Ah8cAc2c() {
    assertEquals(
      "6cQd5c7h JdJs6sTc Ah8cAc2c 2h2d9hJc 7c4s8s4d",
      Solver.process("omaha-holdem 2s4c4h9cKs JdJs6sTc 6cQd5c7h 7c4s8s4d 2h2d9hJc Ah8cAc2c"));
  }

  @Test
  public void test_omaha_holdem_4026_2d2s7dQcTs_QsAdTd6c_5d7h6d2h_6h7sTh8h_4hJc9c6s_Kh7cQdAs() {
    assertEquals(
      "4hJc9c6s 6h7sTh8h Kh7cQdAs QsAdTd6c 5d7h6d2h",
      Solver.process("omaha-holdem 2d2s7dQcTs QsAdTd6c 5d7h6d2h 6h7sTh8h 4hJc9c6s Kh7cQdAs"));
  }

  @Test
  public void test_omaha_holdem_4027_2s4h6dJsQd_7hQh6sTc_7s2h2cKh_Ad9hJhTd_8h5hJc8c_Ac3h7cTh_3sAs9sTs_JdAh4d8d_9cKc2dKs_3cQs3dKd() {
    assertEquals(
      "3sAs9sTs=Ac3h7cTh 8h5hJc8c Ad9hJhTd 3cQs3dKd 9cKc2dKs JdAh4d8d 7hQh6sTc 7s2h2cKh",
      Solver.process("omaha-holdem 2s4h6dJsQd 7hQh6sTc 7s2h2cKh Ad9hJhTd 8h5hJc8c Ac3h7cTh 3sAs9sTs JdAh4d8d 9cKc2dKs 3cQs3dKd"));
  }

  @Test
  public void test_omaha_holdem_4028_3c4d7d7s8s_2cJh3d3s_JsKsAcKd_5cTc6h6c_QcQs4c9s_5dKcTd2h() {
    assertEquals(
      "5dKcTd2h QcQs4c9s JsKsAcKd 5cTc6h6c 2cJh3d3s",
      Solver.process("omaha-holdem 3c4d7d7s8s 2cJh3d3s JsKsAcKd 5cTc6h6c QcQs4c9s 5dKcTd2h"));
  }

  @Test
  public void test_omaha_holdem_4029_3d7d7h9hTc_JsQcAc7c_9s3cJcKd() {
    assertEquals(
      "9s3cJcKd JsQcAc7c",
      Solver.process("omaha-holdem 3d7d7h9hTc JsQcAc7c 9s3cJcKd"));
  }

  @Test
  public void test_omaha_holdem_4030_2c2d8hAsTh_Jd3c3s5s_4c2sQs2h_7h9hJh4h_7dJs9d7c_4d4s3d3h_Ah9sKcQc_KdTdTcQh_8s9cAc6s_Qd5cJc5d() {
    assertEquals(
      "7h9hJh4h Jd3c3s5s 4d4s3d3h Qd5cJc5d 7dJs9d7c Ah9sKcQc 8s9cAc6s KdTdTcQh 4c2sQs2h",
      Solver.process("omaha-holdem 2c2d8hAsTh Jd3c3s5s 4c2sQs2h 7h9hJh4h 7dJs9d7c 4d4s3d3h Ah9sKcQc KdTdTcQh 8s9cAc6s Qd5cJc5d"));
  }

  @Test
  public void test_omaha_holdem_4031_4s9sKsQdTs_6dTd7s5h_9dKh8dQs() {
    assertEquals(
      "6dTd7s5h 9dKh8dQs",
      Solver.process("omaha-holdem 4s9sKsQdTs 6dTd7s5h 9dKh8dQs"));
  }

  @Test
  public void test_omaha_holdem_4032_6d9cAcAdTh_2dKcAsQh_Ks7s6c9d_3c4sJs4d() {
    assertEquals(
      "3c4sJs4d Ks7s6c9d 2dKcAsQh",
      Solver.process("omaha-holdem 6d9cAcAdTh 2dKcAsQh Ks7s6c9d 3c4sJs4d"));
  }

  @Test
  public void test_omaha_holdem_4033_3h6s9sQhTs_6dAd3s2d_4c5hKs3d_5c7h4hTd_5dJh5sJd_8h6h3cAs_8d9h9d4d_QsKc8s7s_4s2s2c8c() {
    assertEquals(
      "4c5hKs3d 5c7h4hTd 5dJh5sJd 6dAd3s2d=8h6h3cAs 8d9h9d4d 4s2s2c8c QsKc8s7s",
      Solver.process("omaha-holdem 3h6s9sQhTs 6dAd3s2d 4c5hKs3d 5c7h4hTd 5dJh5sJd 8h6h3cAs 8d9h9d4d QsKc8s7s 4s2s2c8c"));
  }

  @Test
  public void test_omaha_holdem_4034_2d2h9d9hAs_4h5c7cTh_5s3c8cTs_8sJh2s7s_2c5d7dJd_TcKs7hAd_4sQh3s5h_KcJc6s4d_QcKdAcQs_AhKh6dJs() {
    assertEquals(
      "4h5c7cTh 5s3c8cTs 4sQh3s5h KcJc6s4d AhKh6dJs=QcKdAcQs=TcKs7hAd 2c5d7dJd=8sJh2s7s",
      Solver.process("omaha-holdem 2d2h9d9hAs 4h5c7cTh 5s3c8cTs 8sJh2s7s 2c5d7dJd TcKs7hAd 4sQh3s5h KcJc6s4d QcKdAcQs AhKh6dJs"));
  }

  @Test
  public void test_omaha_holdem_4035_5c6d6s9sTs_2h8s3h5h_2d6hAsJh_KdJc6c9c_Ac9dQd7s_2sKh8cAh_Jd4d4h9h_Tc5dQcAd_7dKs4cTh() {
    assertEquals(
      "2sKh8cAh 2h8s3h5h Jd4d4h9h Ac9dQd7s 7dKs4cTh Tc5dQcAd 2d6hAsJh KdJc6c9c",
      Solver.process("omaha-holdem 5c6d6s9sTs 2h8s3h5h 2d6hAsJh KdJc6c9c Ac9dQd7s 2sKh8cAh Jd4d4h9h Tc5dQcAd 7dKs4cTh"));
  }

  @Test
  public void test_omaha_holdem_4036_9sAcAsKdQc_9dJc3cJd_Tc8d8s6s() {
    assertEquals(
      "Tc8d8s6s 9dJc3cJd",
      Solver.process("omaha-holdem 9sAcAsKdQc 9dJc3cJd Tc8d8s6s"));
  }

  @Test
  public void test_omaha_holdem_4037_2c4s6h8sQh_8cKd5hTd_7s9s8h6d_Kc3s4d6s_TcKsAh3d_2dJd3h2s_8d5s5c9h_7d9dQdJs_5dTsJhAd_QsTh2h4h() {
    assertEquals(
      "5dTsJhAd TcKsAh3d 8d5s5c9h 8cKd5hTd 7d9dQdJs Kc3s4d6s 7s9s8h6d QsTh2h4h 2dJd3h2s",
      Solver.process("omaha-holdem 2c4s6h8sQh 8cKd5hTd 7s9s8h6d Kc3s4d6s TcKsAh3d 2dJd3h2s 8d5s5c9h 7d9dQdJs 5dTsJhAd QsTh2h4h"));
  }

  @Test
  public void test_omaha_holdem_4038_2h3s4d8cTh_9cAd7sKc_5hJh5c4h_2dKdQc3d_9s7h3h6h_Td6s4cTs() {
    assertEquals(
      "9cAd7sKc 9s7h3h6h 5hJh5c4h 2dKdQc3d Td6s4cTs",
      Solver.process("omaha-holdem 2h3s4d8cTh 9cAd7sKc 5hJh5c4h 2dKdQc3d 9s7h3h6h Td6s4cTs"));
  }

  @Test
  public void test_omaha_holdem_4039_2d3h5cQsTd_8cThAc9h_7c2c4h5s_4c4dAs7h() {
    assertEquals(
      "8cThAc9h 7c2c4h5s 4c4dAs7h",
      Solver.process("omaha-holdem 2d3h5cQsTd 8cThAc9h 7c2c4h5s 4c4dAs7h"));
  }

  @Test
  public void test_omaha_holdem_4040_4s5d5s9sAs_6hQh2s3d_KsKcJdJh_Qs6d9d5h_2h8h6c3c_7dAd9h5c_Qc9c4d4h_ThJcAh3h() {
    assertEquals(
      "KsKcJdJh ThJcAh3h 2h8h6c3c=6hQh2s3d Qc9c4d4h Qs6d9d5h 7dAd9h5c",
      Solver.process("omaha-holdem 4s5d5s9sAs 6hQh2s3d KsKcJdJh Qs6d9d5h 2h8h6c3c 7dAd9h5c Qc9c4d4h ThJcAh3h"));
  }

  @Test
  public void test_omaha_holdem_4041_3s7hJsKdTs_6cQsQdQh_7s9cKs4c_Jc8cKcTd_2c4hTh2d_4dAh6s5s_3c8h6d5c_6hJh2h3d_Ad7d3h9s_8sAsKhTc() {
    assertEquals(
      "3c8h6d5c 2c4hTh2d 6cQsQdQh Ad7d3h9s 6hJh2h3d Jc8cKcTd 4dAh6s5s 7s9cKs4c 8sAsKhTc",
      Solver.process("omaha-holdem 3s7hJsKdTs 6cQsQdQh 7s9cKs4c Jc8cKcTd 2c4hTh2d 4dAh6s5s 3c8h6d5c 6hJh2h3d Ad7d3h9s 8sAsKhTc"));
  }

  @Test
  public void test_omaha_holdem_4042_3c3h3s5c6s_9h4sJh2s_2c6c2dAh_9cKd7dAd_4c8s7h8c() {
    assertEquals(
      "9cKd7dAd 9h4sJh2s 2c6c2dAh 4c8s7h8c",
      Solver.process("omaha-holdem 3c3h3s5c6s 9h4sJh2s 2c6c2dAh 9cKd7dAd 4c8s7h8c"));
  }

  @Test
  public void test_omaha_holdem_4043_4s7d9hQdTh_6d2sTcKd_3h6hQsAh_Ac4hJc9d_JdKh3s7h_Js5c2hTd_Qh5d8c8h() {
    assertEquals(
      "Js5c2hTd 6d2sTcKd Qh5d8c8h 3h6hQsAh Ac4hJc9d JdKh3s7h",
      Solver.process("omaha-holdem 4s7d9hQdTh 6d2sTcKd 3h6hQsAh Ac4hJc9d JdKh3s7h Js5c2hTd Qh5d8c8h"));
  }

  @Test
  public void test_omaha_holdem_4044_4d4sJcKdQc_7dJdAc8s_Ts6d6cQs() {
    assertEquals(
      "7dJdAc8s Ts6d6cQs",
      Solver.process("omaha-holdem 4d4sJcKdQc 7dJdAc8s Ts6d6cQs"));
  }

  @Test
  public void test_omaha_holdem_4045_8sKdQdQhTh_4c9sAdAc_Jc8h9c3h_6d4d3cJs_6hAs5h9h_Jd6cTc3s() {
    assertEquals(
      "6d4d3cJs 6hAs5h9h Jd6cTc3s 4c9sAdAc Jc8h9c3h",
      Solver.process("omaha-holdem 8sKdQdQhTh 4c9sAdAc Jc8h9c3h 6d4d3cJs 6hAs5h9h Jd6cTc3s"));
  }

  @Test
  public void test_omaha_holdem_4046_4h4s6cAdQh_2c2hQs9d_7hTsQc8c_3s7cJs8s_Th5hQd6h_9h9sKd2d() {
    assertEquals(
      "3s7cJs8s 9h9sKd2d 2c2hQs9d 7hTsQc8c Th5hQd6h",
      Solver.process("omaha-holdem 4h4s6cAdQh 2c2hQs9d 7hTsQc8c 3s7cJs8s Th5hQd6h 9h9sKd2d"));
  }

  @Test
  public void test_omaha_holdem_4047_5c7s8sJdQc_3c7h5s9h_Kc4cQh4h_QsTsJc9s_Th7d5hKs() {
    assertEquals(
      "Kc4cQh4h 3c7h5s9h=Th7d5hKs QsTsJc9s",
      Solver.process("omaha-holdem 5c7s8sJdQc 3c7h5s9h Kc4cQh4h QsTsJc9s Th7d5hKs"));
  }

  @Test
  public void test_omaha_holdem_4048_2h4h8h9dAh_8s8d6hTd_4c4dQdQs_Jh7h7sJc_8cKh2d9c_3h6d5dTc_2s3s3cAs_7d3dThQh_5s4s5cKd() {
    assertEquals(
      "5s4s5cKd 8cKh2d9c 2s3s3cAs 4c4dQdQs 8s8d6hTd 3h6d5dTc Jh7h7sJc 7d3dThQh",
      Solver.process("omaha-holdem 2h4h8h9dAh 8s8d6hTd 4c4dQdQs Jh7h7sJc 8cKh2d9c 3h6d5dTc 2s3s3cAs 7d3dThQh 5s4s5cKd"));
  }

  @Test
  public void test_omaha_holdem_4049_2c3d4h7d7h_JhJsThAh_5c2sQs9s() {
    assertEquals(
      "5c2sQs9s JhJsThAh",
      Solver.process("omaha-holdem 2c3d4h7d7h JhJsThAh 5c2sQs9s"));
  }

  @Test
  public void test_omaha_holdem_4050_2d3sJhJsTs_5d8cThTc_5s5h8s7s_Td9h2hJd_8hKs6sAs() {
    assertEquals(
      "5s5h8s7s 8hKs6sAs 5d8cThTc Td9h2hJd",
      Solver.process("omaha-holdem 2d3sJhJsTs 5d8cThTc 5s5h8s7s Td9h2hJd 8hKs6sAs"));
  }

  @Test
  public void test_omaha_holdem_4051_3d5s6s8sKd_3h6d6c9h_2d5hKhJc_3c2sAc4h_8d7dJh5c_AhQcKc4c_5dTsQdQs_Td7s9c4d() {
    assertEquals(
      "AhQcKc4c 8d7dJh5c 2d5hKhJc 3h6d6c9h 3c2sAc4h Td7s9c4d 5dTsQdQs",
      Solver.process("omaha-holdem 3d5s6s8sKd 3h6d6c9h 2d5hKhJc 3c2sAc4h 8d7dJh5c AhQcKc4c 5dTsQdQs Td7s9c4d"));
  }

  @Test
  public void test_omaha_holdem_4052_3d6sAdKsQh_9c5s2sTs_6hJdKd8d_Qd5cAh8s() {
    assertEquals(
      "9c5s2sTs 6hJdKd8d Qd5cAh8s",
      Solver.process("omaha-holdem 3d6sAdKsQh 9c5s2sTs 6hJdKd8d Qd5cAh8s"));
  }

  @Test
  public void test_omaha_holdem_4053_2s5sJhQdTs_4d3h3c8d_2h5hAsAc_5c2cJsQs_Ks6dAd3s_Ah7s4h6c_ThJc9c4c_6s5d3dTc_4s7hKd9h_Td8s6hQh() {
    assertEquals(
      "Ah7s4h6c 4d3h3c8d 2h5hAsAc 6s5d3dTc ThJc9c4c Td8s6hQh 4s7hKd9h 5c2cJsQs Ks6dAd3s",
      Solver.process("omaha-holdem 2s5sJhQdTs 4d3h3c8d 2h5hAsAc 5c2cJsQs Ks6dAd3s Ah7s4h6c ThJc9c4c 6s5d3dTc 4s7hKd9h Td8s6hQh"));
  }

  @Test
  public void test_omaha_holdem_4054_6d7hJdKsTh_2d6c6s7s_JhJc8s5c_3c5s8h9h_2h9s6h2s_JsAh3dQc_7c8d4cQs_9d3s9c4h_KcAd4dTd_5dQh4s3h() {
    assertEquals(
      "5dQh4s3h 2h9s6h2s 7c8d4cQs 9d3s9c4h KcAd4dTd 2d6c6s7s JhJc8s5c 3c5s8h9h JsAh3dQc",
      Solver.process("omaha-holdem 6d7hJdKsTh 2d6c6s7s JhJc8s5c 3c5s8h9h 2h9s6h2s JsAh3dQc 7c8d4cQs 9d3s9c4h KcAd4dTd 5dQh4s3h"));
  }

  @Test
  public void test_omaha_holdem_4055_5sJsKcKdQh_2c9cAc8c_5cAhQsTd() {
    assertEquals(
      "2c9cAc8c 5cAhQsTd",
      Solver.process("omaha-holdem 5sJsKcKdQh 2c9cAc8c 5cAhQsTd"));
  }

  @Test
  public void test_omaha_holdem_4056_2h4h9sAcQc_8h2c5s3d_6h8d8sJs_7dJh9c2s_9d4sQd5c_7h3sTs6s_Tc5dAh9h_Jc8c4dTh() {
    assertEquals(
      "7h3sTs6s Jc8c4dTh 6h8d8sJs 7dJh9c2s 9d4sQd5c Tc5dAh9h 8h2c5s3d",
      Solver.process("omaha-holdem 2h4h9sAcQc 8h2c5s3d 6h8d8sJs 7dJh9c2s 9d4sQd5c 7h3sTs6s Tc5dAh9h Jc8c4dTh"));
  }

  @Test
  public void test_omaha_holdem_4057_2c2s9hAcKh_4h5c3dKs_Ts3h8c3c_KdJd4c7c_Jh6dKcQs_2d5h9c9s_6sQhTd7s_Ah6hAd5d_6cAsJc5s_2hJs4dTh() {
    assertEquals(
      "6sQhTd7s Ts3h8c3c 4h5c3dKs KdJd4c7c Jh6dKcQs 6cAsJc5s 2hJs4dTh 2d5h9c9s Ah6hAd5d",
      Solver.process("omaha-holdem 2c2s9hAcKh 4h5c3dKs Ts3h8c3c KdJd4c7c Jh6dKcQs 2d5h9c9s 6sQhTd7s Ah6hAd5d 6cAsJc5s 2hJs4dTh"));
  }

  @Test
  public void test_omaha_holdem_4058_4d5d7cJsQd_KsAs6cKd_Kc3hQh5h_9s7sAhTc_2s9cJhJd_TsKh6d4c() {
    assertEquals(
      "TsKh6d4c 9s7sAhTc KsAs6cKd Kc3hQh5h 2s9cJhJd",
      Solver.process("omaha-holdem 4d5d7cJsQd KsAs6cKd Kc3hQh5h 9s7sAhTc 2s9cJhJd TsKh6d4c"));
  }

  @Test
  public void test_omaha_holdem_4059_4c5h6dJcTc_8h2s3h4s_Qd4d3d2c() {
    assertEquals(
      "8h2s3h4s=Qd4d3d2c",
      Solver.process("omaha-holdem 4c5h6dJcTc 8h2s3h4s Qd4d3d2c"));
  }

  @Test
  public void test_omaha_holdem_4060_5s7h8hQdTd_Jh9h5d4d_As4c8s7s_3c6hKd5h_2s2c2h8c_4hAhJd9d_AcTh6s5c() {
    assertEquals(
      "3c6hKd5h 2s2c2h8c As4c8s7s AcTh6s5c 4hAhJd9d=Jh9h5d4d",
      Solver.process("omaha-holdem 5s7h8hQdTd Jh9h5d4d As4c8s7s 3c6hKd5h 2s2c2h8c 4hAhJd9d AcTh6s5c"));
  }

  @Test
  public void test_omaha_holdem_4061_3h6h8sAhQs_9d4h8d2d_9s5h2c4c() {
    assertEquals(
      "9s5h2c4c 9d4h8d2d",
      Solver.process("omaha-holdem 3h6h8sAhQs 9d4h8d2d 9s5h2c4c"));
  }

  @Test
  public void test_omaha_holdem_4062_7h8d9c9dJh_Jd5d2sTd_8h5h2dTc_3hKsJc8s_Ac2hKc7s() {
    assertEquals(
      "Ac2hKc7s 3hKsJc8s 8h5h2dTc=Jd5d2sTd",
      Solver.process("omaha-holdem 7h8d9c9dJh Jd5d2sTd 8h5h2dTc 3hKsJc8s Ac2hKc7s"));
  }

  @Test
  public void test_omaha_holdem_4063_9dAcKsQdQs_Js6d9h6h_5s2d6cAd_JhJcAh5c_7sKc2hKh_3cJdQh9s_4d9c8h8s_Kd3s6s7h_7d3hAs2c() {
    assertEquals(
      "4d9c8h8s Js6d9h6h Kd3s6s7h 5s2d6cAd 7d3hAs2c JhJcAh5c 3cJdQh9s 7sKc2hKh",
      Solver.process("omaha-holdem 9dAcKsQdQs Js6d9h6h 5s2d6cAd JhJcAh5c 7sKc2hKh 3cJdQh9s 4d9c8h8s Kd3s6s7h 7d3hAs2c"));
  }

  @Test
  public void test_omaha_holdem_4064_2c2d8h9sKh_Qh8cKd7s_Kc6s5dQs_2h5c3hAs_4s9h6cQc_9cJcQd3c_4dTh6dJd_9d8s7c6h_Ks5hAh5s_Jh7dTd2s() {
    assertEquals(
      "4dTh6dJd 4s9h6cQc=9cJcQd3c 9d8s7c6h Kc6s5dQs Ks5hAh5s Qh8cKd7s Jh7dTd2s 2h5c3hAs",
      Solver.process("omaha-holdem 2c2d8h9sKh Qh8cKd7s Kc6s5dQs 2h5c3hAs 4s9h6cQc 9cJcQd3c 4dTh6dJd 9d8s7c6h Ks5hAh5s Jh7dTd2s"));
  }

  @Test
  public void test_omaha_holdem_4065_3d4s6cAhTc_As9cKd8s_4dKh3c5c_5dQd3h2c_Jh4cQh4h_6dJc8h6h_5h9d6sTd_5s7sJsKs_QcAd7dAc_Ts9h8d7c() {
    assertEquals(
      "Ts9h8d7c As9cKd8s 4dKh3c5c 5h9d6sTd Jh4cQh4h 6dJc8h6h QcAd7dAc 5dQd3h2c 5s7sJsKs",
      Solver.process("omaha-holdem 3d4s6cAhTc As9cKd8s 4dKh3c5c 5dQd3h2c Jh4cQh4h 6dJc8h6h 5h9d6sTd 5s7sJsKs QcAd7dAc Ts9h8d7c"));
  }

  @Test
  public void test_omaha_holdem_4066_2h3c5sAcJc_3sKd8sKh_4s8d4h9c_QcQd5c6c_TcAsAdTh_Jd8hTd7d() {
    assertEquals(
      "4s8d4h9c Jd8hTd7d 3sKd8sKh TcAsAdTh QcQd5c6c",
      Solver.process("omaha-holdem 2h3c5sAcJc 3sKd8sKh 4s8d4h9c QcQd5c6c TcAsAdTh Jd8hTd7d"));
  }

  @Test
  public void test_omaha_holdem_4067_2c3s8s9hJs_Kc3d3cAd_Jc4h2dAs_JdJh4cQc_2h8hQdKs_Tc8c6sTd_2s9c5s9s_QhThQs3h() {
    assertEquals(
      "Tc8c6sTd 2h8hQdKs Jc4h2dAs Kc3d3cAd JdJh4cQc QhThQs3h 2s9c5s9s",
      Solver.process("omaha-holdem 2c3s8s9hJs Kc3d3cAd Jc4h2dAs JdJh4cQc 2h8hQdKs Tc8c6sTd 2s9c5s9s QhThQs3h"));
  }

  @Test
  public void test_omaha_holdem_4068_2s4c7dAhTh_9sJs7s9c_8h6dJh2h_3d4dQs5c_Ks6cQc7h_AcJd8dKc_AsKd6hKh() {
    assertEquals(
      "8h6dJh2h Ks6cQc7h 9sJs7s9c AcJd8dKc=AsKd6hKh 3d4dQs5c",
      Solver.process("omaha-holdem 2s4c7dAhTh 9sJs7s9c 8h6dJh2h 3d4dQs5c Ks6cQc7h AcJd8dKc AsKd6hKh"));
  }

  @Test
  public void test_omaha_holdem_4069_2c4h5hAdTc_2h6cAc7c_Kd4d3s3d_Ks6h5s5d_Ah4s8hJh() {
    assertEquals(
      "2h6cAc7c Ah4s8hJh Ks6h5s5d Kd4d3s3d",
      Solver.process("omaha-holdem 2c4h5hAdTc 2h6cAc7c Kd4d3s3d Ks6h5s5d Ah4s8hJh"));
  }

  @Test
  public void test_omaha_holdem_4070_2s3d5c8h9c_5dKhKc6h_JdJh8d5h_5s7h7c2d_KsTsAc4d_7s9dJc3s() {
    assertEquals(
      "5dKhKc6h 5s7h7c2d JdJh8d5h 7s9dJc3s KsTsAc4d",
      Solver.process("omaha-holdem 2s3d5c8h9c 5dKhKc6h JdJh8d5h 5s7h7c2d KsTsAc4d 7s9dJc3s"));
  }

  @Test
  public void test_omaha_holdem_4071_8sJcQsTcTd_5h3c2hKc_Ac7dKhAh_3hKs4dQc_QdJh9dJs_7h6cAdJd_6hTs7s5c_3d6s3s7c_2sQh4c9h_4hAs9s8c() {
    assertEquals(
      "5h3c2hKc 3d6s3s7c 7h6cAdJd 3hKs4dQc 6hTs7s5c 2sQh4c9h=4hAs9s8c Ac7dKhAh QdJh9dJs",
      Solver.process("omaha-holdem 8sJcQsTcTd 5h3c2hKc Ac7dKhAh 3hKs4dQc QdJh9dJs 7h6cAdJd 6hTs7s5c 3d6s3s7c 2sQh4c9h 4hAs9s8c"));
  }

  @Test
  public void test_omaha_holdem_4072_2h3c8h9cAs_7s9d3sJh_8cAh5c2s_6c2dTh6d_4dKs5dKh_4c8s9s2c_5h4sAcTs_8d3h9h6h() {
    assertEquals(
      "6c2dTh6d 7s9d3sJh 4c8s9s2c=8d3h9h6h 8cAh5c2s 4dKs5dKh=5h4sAcTs",
      Solver.process("omaha-holdem 2h3c8h9cAs 7s9d3sJh 8cAh5c2s 6c2dTh6d 4dKs5dKh 4c8s9s2c 5h4sAcTs 8d3h9h6h"));
  }

  @Test
  public void test_omaha_holdem_4073_5c6c6d8dJd_KdKs4s4h_Kc7s3c3s_2c7hQcAc_Qs7cTh5s_9cAh9sKh_5dAdAsJh() {
    assertEquals(
      "2c7hQcAc Kc7s3c3s Qs7cTh5s 9cAh9sKh KdKs4s4h 5dAdAsJh",
      Solver.process("omaha-holdem 5c6c6d8dJd KdKs4s4h Kc7s3c3s 2c7hQcAc Qs7cTh5s 9cAh9sKh 5dAdAsJh"));
  }

  @Test
  public void test_omaha_holdem_4074_3sAsJcJhKd_2c6hJd6s_8d7cAdQc_4s2hAh5h_9dTh6c5c() {
    assertEquals(
      "9dTh6c5c 4s2hAh5h 8d7cAdQc 2c6hJd6s",
      Solver.process("omaha-holdem 3sAsJcJhKd 2c6hJd6s 8d7cAdQc 4s2hAh5h 9dTh6c5c"));
  }

  @Test
  public void test_omaha_holdem_4075_2c2h5c8cAs_Jc4h9hJh_Ac5s6d6c() {
    assertEquals(
      "Jc4h9hJh Ac5s6d6c",
      Solver.process("omaha-holdem 2c2h5c8cAs Jc4h9hJh Ac5s6d6c"));
  }

  @Test
  public void test_omaha_holdem_4076_5h5s6c6hJs_Th4s3c7d_9dAh9c5c_Kh9hTdAs_Jc9sAdQh_2dKdQsQc() {
    assertEquals(
      "Th4s3c7d Kh9hTdAs Jc9sAdQh 2dKdQsQc 9dAh9c5c",
      Solver.process("omaha-holdem 5h5s6c6hJs Th4s3c7d 9dAh9c5c Kh9hTdAs Jc9sAdQh 2dKdQsQc"));
  }

  @Test
  public void test_omaha_holdem_4077_2h5s7sAcJd_8hJs4dKh_4sTcAh9s_Ks7h9dQs_8sAdKd5d_9h3h2c2d_JcTd3s6h_4cKcJh3d_6s4h6d8c_8dQhQd6c() {
    assertEquals(
      "6s4h6d8c Ks7h9dQs JcTd3s6h 8hJs4dKh 8dQhQd6c 4sTcAh9s 8sAdKd5d 9h3h2c2d 4cKcJh3d",
      Solver.process("omaha-holdem 2h5s7sAcJd 8hJs4dKh 4sTcAh9s Ks7h9dQs 8sAdKd5d 9h3h2c2d JcTd3s6h 4cKcJh3d 6s4h6d8c 8dQhQd6c"));
  }

  @Test
  public void test_omaha_holdem_4078_6h9hJdKcQd_6d7s4c9s_8s7h5c7c_4h4s5h3d_9c3cTcTh_8dAcKd9d_As3sQh5s_5d2h2dQs() {
    assertEquals(
      "4h4s5h3d 8s7h5c7c 5d2h2dQs As3sQh5s 6d7s4c9s 8dAcKd9d 9c3cTcTh",
      Solver.process("omaha-holdem 6h9hJdKcQd 6d7s4c9s 8s7h5c7c 4h4s5h3d 9c3cTcTh 8dAcKd9d As3sQh5s 5d2h2dQs"));
  }

  @Test
  public void test_omaha_holdem_4079_6h9dAcJcQd_4s2d5c7d_4cJdTdQc() {
    assertEquals(
      "4s2d5c7d 4cJdTdQc",
      Solver.process("omaha-holdem 6h9dAcJcQd 4s2d5c7d 4cJdTdQc"));
  }

  @Test
  public void test_omaha_holdem_4080_2h4h6d8dAs_2sKh9s3c_JcKs9c6h_AdTc5cJh_6c5s5hTd_Th4d8s8h_4s7dAcKd_QhQcKc5d_9d9h3hJd() {
    assertEquals(
      "2sKh9s3c 6c5s5hTd JcKs9c6h 9d9h3hJd QhQcKc5d AdTc5cJh 4s7dAcKd Th4d8s8h",
      Solver.process("omaha-holdem 2h4h6d8dAs 2sKh9s3c JcKs9c6h AdTc5cJh 6c5s5hTd Th4d8s8h 4s7dAcKd QhQcKc5d 9d9h3hJd"));
  }

  @Test
  public void test_omaha_holdem_4081_8c8dAhAsJc_Jh7sTc8h_9sKc3h6c_4hJd2s9c_5h4cQs9h_KsKdQd2d() {
    assertEquals(
      "5h4cQs9h 9sKc3h6c 4hJd2s9c KsKdQd2d Jh7sTc8h",
      Solver.process("omaha-holdem 8c8dAhAsJc Jh7sTc8h 9sKc3h6c 4hJd2s9c 5h4cQs9h KsKdQd2d"));
  }

  @Test
  public void test_omaha_holdem_4082_2d6c6h7d8c_3dJh4sAc_KdTc4d3s_Qh4hJs9s_Kh9hTd5c_KsAh9d4c_Jd6sKc5s() {
    assertEquals(
      "Qh4hJs9s KdTc4d3s 3dJh4sAc KsAh9d4c Jd6sKc5s Kh9hTd5c",
      Solver.process("omaha-holdem 2d6c6h7d8c 3dJh4sAc KdTc4d3s Qh4hJs9s Kh9hTd5c KsAh9d4c Jd6sKc5s"));
  }

  @Test
  public void test_omaha_holdem_4083_2c3d7h9hKs_3s7c6hAh_TcQs9c5h_KdAd5cAc_4dTd5s3h_8hKh8dAs_2h7d9s4c_6dJh7sJc_Jd3c4h5d_8c9d6s2s() {
    assertEquals(
      "4dTd5s3h Jd3c4h5d TcQs9c5h 6dJh7sJc 8hKh8dAs KdAd5cAc 3s7c6hAh 8c9d6s2s 2h7d9s4c",
      Solver.process("omaha-holdem 2c3d7h9hKs 3s7c6hAh TcQs9c5h KdAd5cAc 4dTd5s3h 8hKh8dAs 2h7d9s4c 6dJh7sJc Jd3c4h5d 8c9d6s2s"));
  }

  @Test
  public void test_omaha_holdem_4084_4c4dAsKhTh_AcQd8h6h_Kd7sJc3h_2sKc6sQh_5cAh7d5h_7c8s8d4h() {
    assertEquals(
      "Kd7sJc3h 2sKc6sQh 5cAh7d5h AcQd8h6h 7c8s8d4h",
      Solver.process("omaha-holdem 4c4dAsKhTh AcQd8h6h Kd7sJc3h 2sKc6sQh 5cAh7d5h 7c8s8d4h"));
  }

  @Test
  public void test_omaha_holdem_4085_3c3s5hKcTh_8c5c8hJc_8d4dTc6d_Kh7c4c4s_Ad6sQd4h() {
    assertEquals(
      "Ad6sQd4h 8c5c8hJc 8d4dTc6d Kh7c4c4s",
      Solver.process("omaha-holdem 3c3s5hKcTh 8c5c8hJc 8d4dTc6d Kh7c4c4s Ad6sQd4h"));
  }

  @Test
  public void test_omaha_holdem_4086_2c8d8s9cJh_Jd7s3c7h_As5dKc8c_9sAc6s6c() {
    assertEquals(
      "9sAc6s6c Jd7s3c7h As5dKc8c",
      Solver.process("omaha-holdem 2c8d8s9cJh Jd7s3c7h As5dKc8c 9sAc6s6c"));
  }

  @Test
  public void test_omaha_holdem_4087_4cAcAsKcQc_3dKh5h8s_9s4dKsAd_6s3hTd8h_Jh2s5c2h_Th4h9h3s_5d6c7sTc_Qh8c4sJc_9c8d7h2d() {
    assertEquals(
      "9c8d7h2d 6s3hTd8h Jh2s5c2h Th4h9h3s 3dKh5h8s 5d6c7sTc Qh8c4sJc 9s4dKsAd",
      Solver.process("omaha-holdem 4cAcAsKcQc 3dKh5h8s 9s4dKsAd 6s3hTd8h Jh2s5c2h Th4h9h3s 5d6c7sTc Qh8c4sJc 9c8d7h2d"));
  }

  @Test
  public void test_omaha_holdem_4088_3d4d7c9cQs_4sKdAd2d_JdTsKs9h_Ah6hKh5d_AsTh9d4c_7s4h2h6c_8h8c8sKc_3c3s6s5c_Qd9sTc2s_AcJs5h7d() {
    assertEquals(
      "4sKdAd2d AcJs5h7d 8h8c8sKc JdTsKs9h 7s4h2h6c AsTh9d4c Qd9sTc2s 3c3s6s5c=Ah6hKh5d",
      Solver.process("omaha-holdem 3d4d7c9cQs 4sKdAd2d JdTsKs9h Ah6hKh5d AsTh9d4c 7s4h2h6c 8h8c8sKc 3c3s6s5c Qd9sTc2s AcJs5h7d"));
  }

  @Test
  public void test_omaha_holdem_4089_3s5h7h8h8s_3c2s2d6s_9s5d4hQd_KdKcTd7c_TsKh8dTc_Th6d5c3h_Qs7d6hJc_8c7s5sKs() {
    assertEquals(
      "3c2s2d6s 9s5d4hQd Qs7d6hJc KdKcTd7c TsKh8dTc Th6d5c3h 8c7s5sKs",
      Solver.process("omaha-holdem 3s5h7h8h8s 3c2s2d6s 9s5d4hQd KdKcTd7c TsKh8dTc Th6d5c3h Qs7d6hJc 8c7s5sKs"));
  }

  @Test
  public void test_omaha_holdem_4090_3s6sAhQdQs_6c2h9d9s_Th9h2dJs_8dTdJd3h_3cJh4cAd() {
    assertEquals(
      "Th9h2dJs 8dTdJd3h 6c2h9d9s 3cJh4cAd",
      Solver.process("omaha-holdem 3s6sAhQdQs 6c2h9d9s Th9h2dJs 8dTdJd3h 3cJh4cAd"));
  }

  @Test
  public void test_omaha_holdem_4091_2c3c5d8sKd_7hQhQc5c_JcKhAhAd_Ks8dJsTc_Ts2h7dAc_Qd5s3sJh_7s8c3d9h_4s6c6hTh_2d4cJdTd_6s5h9c7c() {
    assertEquals(
      "2d4cJdTd Ts2h7dAc 6s5h9c7c 7hQhQc5c JcKhAhAd Qd5s3sJh 7s8c3d9h Ks8dJsTc 4s6c6hTh",
      Solver.process("omaha-holdem 2c3c5d8sKd 7hQhQc5c JcKhAhAd Ks8dJsTc Ts2h7dAc Qd5s3sJh 7s8c3d9h 4s6c6hTh 2d4cJdTd 6s5h9c7c"));
  }

  @Test
  public void test_omaha_holdem_4092_4h6s8c8sJd_9d5c3cQd_5hKd4s2c_Qc6dAs4d_Jc7d4cAd() {
    assertEquals(
      "9d5c3cQd 5hKd4s2c Qc6dAs4d Jc7d4cAd",
      Solver.process("omaha-holdem 4h6s8c8sJd 9d5c3cQd 5hKd4s2c Qc6dAs4d Jc7d4cAd"));
  }

  @Test
  public void test_omaha_holdem_4093_4s8d9sAdQs_5cJd6h8h_5h2d8c6s_Ac4d9d9h_AsJsTs2s_Ks5dJc6d_8sJhTc2h() {
    assertEquals(
      "Ks5dJc6d 5h2d8c6s 5cJd6h8h Ac4d9d9h 8sJhTc2h AsJsTs2s",
      Solver.process("omaha-holdem 4s8d9sAdQs 5cJd6h8h 5h2d8c6s Ac4d9d9h AsJsTs2s Ks5dJc6d 8sJhTc2h"));
  }

  @Test
  public void test_omaha_holdem_4094_2h4d5hJdQs_Js9d8cAs_5dKsAhJh_2cTd9s4h_7h7dJc7s_5s6h3cAc_Kd9c6s6c_8hQcAdKh_Tc2s5c8d() {
    assertEquals(
      "Kd9c6s6c 7h7dJc7s Js9d8cAs 8hQcAdKh 2cTd9s4h Tc2s5c8d 5dKsAhJh 5s6h3cAc",
      Solver.process("omaha-holdem 2h4d5hJdQs Js9d8cAs 5dKsAhJh 2cTd9s4h 7h7dJc7s 5s6h3cAc Kd9c6s6c 8hQcAdKh Tc2s5c8d"));
  }

  @Test
  public void test_omaha_holdem_4095_2d4s7sAcAh_Kc8sTh7h_2h9c5h6c() {
    assertEquals(
      "2h9c5h6c Kc8sTh7h",
      Solver.process("omaha-holdem 2d4s7sAcAh Kc8sTh7h 2h9c5h6c"));
  }

  @Test
  public void test_omaha_holdem_4096_3d3h4d5d8s_5h3sKd2h_Th6d7d6h_7c4sKc9c() {
    assertEquals(
      "7c4sKc9c 5h3sKd2h Th6d7d6h",
      Solver.process("omaha-holdem 3d3h4d5d8s 5h3sKd2h Th6d7d6h 7c4sKc9c"));
  }

  @Test
  public void test_omaha_holdem_4097_4h4s5s6cJc_8d4cTcTd_8hKh5dAc_9sKs6h6d_8s2dKd6s_Kc3d7d2c_Ts2s4d9c_JdJsTh3h_5c9hQd7s() {
    assertEquals(
      "5c9hQd7s 8hKh5dAc 8s2dKd6s 8d4cTcTd=Ts2s4d9c Kc3d7d2c 9sKs6h6d JdJsTh3h",
      Solver.process("omaha-holdem 4h4s5s6cJc 8d4cTcTd 8hKh5dAc 9sKs6h6d 8s2dKd6s Kc3d7d2c Ts2s4d9c JdJsTh3h 5c9hQd7s"));
  }

  @Test
  public void test_omaha_holdem_4098_2h4d6d7sQd_Jd3dTd5s_6h5c2sKs_Kc9h8cQs() {
    assertEquals(
      "Kc9h8cQs 6h5c2sKs Jd3dTd5s",
      Solver.process("omaha-holdem 2h4d6d7sQd Jd3dTd5s 6h5c2sKs Kc9h8cQs"));
  }

  @Test
  public void test_omaha_holdem_4099_2c4c6sAcJd_AsQdTc8h_3d7hQh2d_9c5c2s6c_Qc8d5hTh() {
    assertEquals(
      "Qc8d5hTh 3d7hQh2d AsQdTc8h 9c5c2s6c",
      Solver.process("omaha-holdem 2c4c6sAcJd AsQdTc8h 3d7hQh2d 9c5c2s6c Qc8d5hTh"));
  }

  @Test
  public void test_omaha_holdem_4100_2d4c6c8dJh_9d5cAh4h_KsAc3dAs_4d4sKd7s_9s6dQs5h_9h2c7c8h_3hTdTcJs_Jd7d6s3s_TsJcTh5d() {
    assertEquals(
      "9d5cAh4h 9s6dQs5h 3hTdTcJs=TsJcTh5d KsAc3dAs 9h2c7c8h Jd7d6s3s 4d4sKd7s",
      Solver.process("omaha-holdem 2d4c6c8dJh 9d5cAh4h KsAc3dAs 4d4sKd7s 9s6dQs5h 9h2c7c8h 3hTdTcJs Jd7d6s3s TsJcTh5d"));
  }

  @Test
  public void test_omaha_holdem_4101_2h6d7h9hJd_6sKdJhJc_5h3hQhTh_TsKhQcTd_QsAs9s5s_3sTc2c5c_8dAcKc8s_2s4hJs3d_8c8hAh9c() {
    assertEquals(
      "3sTc2c5c 8dAcKc8s QsAs9s5s TsKhQcTd 2s4hJs3d 6sKdJhJc 5h3hQhTh 8c8hAh9c",
      Solver.process("omaha-holdem 2h6d7h9hJd 6sKdJhJc 5h3hQhTh TsKhQcTd QsAs9s5s 3sTc2c5c 8dAcKc8s 2s4hJs3d 8c8hAh9c"));
  }

  @Test
  public void test_omaha_holdem_4102_2d3h4s8cKc_Jc8sThJh_3sQs5hTd() {
    assertEquals(
      "3sQs5hTd Jc8sThJh",
      Solver.process("omaha-holdem 2d3h4s8cKc Jc8sThJh 3sQs5hTd"));
  }

  @Test
  public void test_omaha_holdem_4103_5s6c8dJdQh_7h9cJh4c_8s4h2hKh_9h6d6h6s_TcAdQcTs() {
    assertEquals(
      "8s4h2hKh TcAdQcTs 9h6d6h6s 7h9cJh4c",
      Solver.process("omaha-holdem 5s6c8dJdQh 7h9cJh4c 8s4h2hKh 9h6d6h6s TcAdQcTs"));
  }

  @Test
  public void test_omaha_holdem_4104_3s5dJcKsTc_3h9s5c8c_2h6sKdKh_7c7d2c3c_7s6h6cJh_QcQs8s2d_8dJs4d5s_9c4c8h9h_Ac3d7hTd() {
    assertEquals(
      "7c7d2c3c 9c4c8h9h 7s6h6cJh QcQs8s2d 3h9s5c8c Ac3d7hTd 8dJs4d5s 2h6sKdKh",
      Solver.process("omaha-holdem 3s5dJcKsTc 3h9s5c8c 2h6sKdKh 7c7d2c3c 7s6h6cJh QcQs8s2d 8dJs4d5s 9c4c8h9h Ac3d7hTd"));
  }

  @Test
  public void test_omaha_holdem_4105_2c5d6sAsKh_2sKdTs9d_5h3sTd4c_Js8sJd6c_2h5s6d7c() {
    assertEquals(
      "Js8sJd6c 2h5s6d7c 2sKdTs9d 5h3sTd4c",
      Solver.process("omaha-holdem 2c5d6sAsKh 2sKdTs9d 5h3sTd4c Js8sJd6c 2h5s6d7c"));
  }

  @Test
  public void test_omaha_holdem_4106_7d8d9hAsQh_3d5s3h3c_6h4cJs7s() {
    assertEquals(
      "3d5s3h3c 6h4cJs7s",
      Solver.process("omaha-holdem 7d8d9hAsQh 3d5s3h3c 6h4cJs7s"));
  }

  @Test
  public void test_omaha_holdem_4107_2d4c5d8dTd_3c4d6c3h_9cQsJh6h_8s2sJcTh_Kd8c7sQd_KhAsQc6d_5cTc9s3d_Ks3sKc7c() {
    assertEquals(
      "9cQsJh6h KhAsQc6d Ks3sKc7c 5cTc9s3d 8s2sJcTh 3c4d6c3h Kd8c7sQd",
      Solver.process("omaha-holdem 2d4c5d8dTd 3c4d6c3h 9cQsJh6h 8s2sJcTh Kd8c7sQd KhAsQc6d 5cTc9s3d Ks3sKc7c"));
  }

  @Test
  public void test_omaha_holdem_4108_2d2s9cAdAh_8sTdQcTs_2cJh6cKs_3sKd5hTc_Kc7s9s9h_Jc4cQs8d() {
    assertEquals(
      "Jc4cQs8d 3sKd5hTc 8sTdQcTs 2cJh6cKs Kc7s9s9h",
      Solver.process("omaha-holdem 2d2s9cAdAh 8sTdQcTs 2cJh6cKs 3sKd5hTc Kc7s9s9h Jc4cQs8d"));
  }

  @Test
  public void test_omaha_holdem_4109_2s3sKcQhTh_AcTd9h4d_JcTsJsAd() {
    assertEquals(
      "AcTd9h4d JcTsJsAd",
      Solver.process("omaha-holdem 2s3sKcQhTh AcTd9h4d JcTsJsAd"));
  }

  @Test
  public void test_omaha_holdem_4110_2h3c3sJdQc_Ah4d8sQd_5hJh6s6d_Tc8h7c9d_Qs9s4c8c_6cKsKd2d_5d6h9hAc() {
    assertEquals(
      "Tc8h7c9d 5d6h9hAc 5hJh6s6d Qs9s4c8c Ah4d8sQd 6cKsKd2d",
      Solver.process("omaha-holdem 2h3c3sJdQc Ah4d8sQd 5hJh6s6d Tc8h7c9d Qs9s4c8c 6cKsKd2d 5d6h9hAc"));
  }

  @Test
  public void test_omaha_holdem_4111_4h6d9cQcTs_ThKc2h3s_4dQh5c3c_9d6s7s7h_JcJh9h2d_AcKsKh8d_8h8c4sJs() {
    assertEquals(
      "ThKc2h3s JcJh9h2d AcKsKh8d 9d6s7s7h 4dQh5c3c 8h8c4sJs",
      Solver.process("omaha-holdem 4h6d9cQcTs ThKc2h3s 4dQh5c3c 9d6s7s7h JcJh9h2d AcKsKh8d 8h8c4sJs"));
  }

  @Test
  public void test_omaha_holdem_4112_3h5h9sKdTc_QcJdQd5s_4d5c2cAc_Qh6h4c3d_7dThKhTs_7sTd8c2s_2hJsQsJc_Ah5d3c2d() {
    assertEquals(
      "Qh6h4c3d 4d5c2cAc 7sTd8c2s Ah5d3c2d 7dThKhTs 2hJsQsJc=QcJdQd5s",
      Solver.process("omaha-holdem 3h5h9sKdTc QcJdQd5s 4d5c2cAc Qh6h4c3d 7dThKhTs 7sTd8c2s 2hJsQsJc Ah5d3c2d"));
  }

  @Test
  public void test_omaha_holdem_4113_2h2sAhQsTs_TdKs6dJs_3c8c3s6s_5d8sTc9s_9hQdAc9d_Jh7d4cQh_KhJd6h8h() {
    assertEquals(
      "Jh7d4cQh 9hQdAc9d KhJd6h8h 3c8c3s6s 5d8sTc9s TdKs6dJs",
      Solver.process("omaha-holdem 2h2sAhQsTs TdKs6dJs 3c8c3s6s 5d8sTc9s 9hQdAc9d Jh7d4cQh KhJd6h8h"));
  }

  @Test
  public void test_omaha_holdem_4114_5s7s9hQdTh_8s2c4s2s_Qc6hJcAd_2dJs6dKd() {
    assertEquals(
      "8s2c4s2s Qc6hJcAd 2dJs6dKd",
      Solver.process("omaha-holdem 5s7s9hQdTh 8s2c4s2s Qc6hJcAd 2dJs6dKd"));
  }

  @Test
  public void test_omaha_holdem_4115_7h8d9cKcKd_Ts2cQc9s_8c4d5h7s_KsJd4hQh_Ah6d4c9h_Kh4sAs3s_Td8hJc5d() {
    assertEquals(
      "8c4d5h7s Ts2cQc9s Ah6d4c9h KsJd4hQh Kh4sAs3s Td8hJc5d",
      Solver.process("omaha-holdem 7h8d9cKcKd Ts2cQc9s 8c4d5h7s KsJd4hQh Ah6d4c9h Kh4sAs3s Td8hJc5d"));
  }

  @Test
  public void test_omaha_holdem_4116_3h4dJhQdQs_4h4sKc5s_6c6s5dQc_8sKsKh9h() {
    assertEquals(
      "8sKsKh9h 6c6s5dQc 4h4sKc5s",
      Solver.process("omaha-holdem 3h4dJhQdQs 4h4sKc5s 6c6s5dQc 8sKsKh9h"));
  }

  @Test
  public void test_omaha_holdem_4117_7h8d9d9hKh_3h7sTh5s_JcAc8cTd_Ad4s4h7d_2dQdTc6d_As7c3cKd() {
    assertEquals(
      "Ad4s4h7d As7c3cKd 2dQdTc6d JcAc8cTd 3h7sTh5s",
      Solver.process("omaha-holdem 7h8d9d9hKh 3h7sTh5s JcAc8cTd Ad4s4h7d 2dQdTc6d As7c3cKd"));
  }

  @Test
  public void test_omaha_holdem_4118_2d3c3h7hQs_2cKd9dKh_7dAc2sTd() {
    assertEquals(
      "7dAc2sTd 2cKd9dKh",
      Solver.process("omaha-holdem 2d3c3h7hQs 2cKd9dKh 7dAc2sTd"));
  }

  @Test
  public void test_omaha_holdem_4119_2h6s9dAsQc_Jc8s3sJh_Kc3c2d5h() {
    assertEquals(
      "Kc3c2d5h Jc8s3sJh",
      Solver.process("omaha-holdem 2h6s9dAsQc Jc8s3sJh Kc3c2d5h"));
  }

  @Test
  public void test_omaha_holdem_4120_2h3d4s5hTc_7cAdQd5d_8c2s3h5c_6h6c8h6s_Jd8d9sAc_9d7sAs2c() {
    assertEquals(
      "Jd8d9sAc 6h6c8h6s 8c2s3h5c 7cAdQd5d=9d7sAs2c",
      Solver.process("omaha-holdem 2h3d4s5hTc 7cAdQd5d 8c2s3h5c 6h6c8h6s Jd8d9sAc 9d7sAs2c"));
  }

  @Test
  public void test_omaha_holdem_4121_2d4d7hJhQh_7cTd9dKc_Qd8c2h3d_6sAs3cAh_2c7d4c9h_Ts8d8h6d_9c5c4h3s_QsAd5d5h_9s6h4sTc() {
    assertEquals(
      "9c5c4h3s 9s6h4sTc 7cTd9dKc Ts8d8h6d QsAd5d5h 6sAs3cAh 2c7d4c9h Qd8c2h3d",
      Solver.process("omaha-holdem 2d4d7hJhQh 7cTd9dKc Qd8c2h3d 6sAs3cAh 2c7d4c9h Ts8d8h6d 9c5c4h3s QsAd5d5h 9s6h4sTc"));
  }

  @Test
  public void test_omaha_holdem_4122_2d9cKdQcQs_9s8d6d6h_9dAs7sJs_2s8c8hKs_3h6c9hAd_2cKhTcJh_4c7dAhKc_3dTsJd5s_7c5hAcQh() {
    assertEquals(
      "9s8d6d6h 3h6c9hAd=9dAs7sJs 2s8c8hKs 4c7dAhKc 7c5hAcQh 2cKhTcJh=3dTsJd5s",
      Solver.process("omaha-holdem 2d9cKdQcQs 9s8d6d6h 9dAs7sJs 2s8c8hKs 3h6c9hAd 2cKhTcJh 4c7dAhKc 3dTsJd5s 7c5hAcQh"));
  }

  @Test
  public void test_omaha_holdem_4123_4d5c5dKsTc_8d4cQdJh_3hKc7dAc_9dJc3sAh_JdAd4h3d_AsQcJs7c() {
    assertEquals(
      "9dJc3sAh AsQcJs7c 8d4cQdJh JdAd4h3d 3hKc7dAc",
      Solver.process("omaha-holdem 4d5c5dKsTc 8d4cQdJh 3hKc7dAc 9dJc3sAh JdAd4h3d AsQcJs7c"));
  }

  @Test
  public void test_omaha_holdem_4124_2c7cAsKdQd_2h3cKc8h_6cJhTh5h() {
    assertEquals(
      "2h3cKc8h 6cJhTh5h",
      Solver.process("omaha-holdem 2c7cAsKdQd 2h3cKc8h 6cJhTh5h"));
  }

  @Test
  public void test_omaha_holdem_4125_5c7cAdJcQd_KcQc2hKd_2sJs9c5s_Tc6h8h6s_JhQh9s4d_2dAsQs2c() {
    assertEquals(
      "Tc6h8h6s 2sJs9c5s JhQh9s4d 2dAsQs2c KcQc2hKd",
      Solver.process("omaha-holdem 5c7cAdJcQd KcQc2hKd 2sJs9c5s Tc6h8h6s JhQh9s4d 2dAsQs2c"));
  }

  @Test
  public void test_omaha_holdem_4126_2c2h5cAcJh_5sQs6c4d_Kd3c7s6s_4cAh7hTd_8h8s5hAs_Ts6hJd2d() {
    assertEquals(
      "Kd3c7s6s 5sQs6c4d 4cAh7hTd 8h8s5hAs Ts6hJd2d",
      Solver.process("omaha-holdem 2c2h5cAcJh 5sQs6c4d Kd3c7s6s 4cAh7hTd 8h8s5hAs Ts6hJd2d"));
  }

  @Test
  public void test_omaha_holdem_4127_4d6h7cAhTd_3d5d3hTc_4sJhTh4c_AdJs6cJd() {
    assertEquals(
      "AdJs6cJd 4sJhTh4c 3d5d3hTc",
      Solver.process("omaha-holdem 4d6h7cAhTd 3d5d3hTc 4sJhTh4c AdJs6cJd"));
  }

  @Test
  public void test_omaha_holdem_4128_7s8d8hAdQc_4s7h8cKh_2s6s2h3h_6h6d3d4d_5dKsQhKc_Js7dQs8s_Ah5sTcJh_JdTdAc9d_9s7c5h9h_6cQd4cTs() {
    assertEquals(
      "2s6s2h3h 6h6d3d4d 9s7c5h9h 6cQd4cTs 5dKsQhKc Ah5sTcJh=JdTdAc9d 4s7h8cKh Js7dQs8s",
      Solver.process("omaha-holdem 7s8d8hAdQc 4s7h8cKh 2s6s2h3h 6h6d3d4d 5dKsQhKc Js7dQs8s Ah5sTcJh JdTdAc9d 9s7c5h9h 6cQd4cTs"));
  }

  @Test
  public void test_omaha_holdem_4129_2c4cQsTcTd_Qh3s5c9c_Kh6s4dJd_Jh3c2s9s_As3d2h5d_Ts4hKdJs_4s7h9h7c_7dKcQd8c_2d9dTh8s() {
    assertEquals(
      "Jh3c2s9s As3d2h5d Kh6s4dJd 4s7h9h7c Qh3s5c9c 7dKcQd8c 2d9dTh8s Ts4hKdJs",
      Solver.process("omaha-holdem 2c4cQsTcTd Qh3s5c9c Kh6s4dJd Jh3c2s9s As3d2h5d Ts4hKdJs 4s7h9h7c 7dKcQd8c 2d9dTh8s"));
  }

  @Test
  public void test_omaha_holdem_4130_2h3c4c5cJc_5d2c9s3h_6cTdKd2d_Ts7hJs3s_6h6d6sJd_8h3d8s7c() {
    assertEquals(
      "8h3d8s7c 6h6d6sJd 5d2c9s3h Ts7hJs3s 6cTdKd2d",
      Solver.process("omaha-holdem 2h3c4c5cJc 5d2c9s3h 6cTdKd2d Ts7hJs3s 6h6d6sJd 8h3d8s7c"));
  }

  @Test
  public void test_omaha_holdem_4131_5c5dAsJhTs_3hAdKc7d_8cQc8d2h_QsAh3c7c() {
    assertEquals(
      "8cQc8d2h QsAh3c7c 3hAdKc7d",
      Solver.process("omaha-holdem 5c5dAsJhTs 3hAdKc7d 8cQc8d2h QsAh3c7c"));
  }

  @Test
  public void test_omaha_holdem_4132_2d7dAcKsQd_Kd4c4sAd_AsKc8s4h_6c3dJdQs_5s7h9c2h_5d4dTdKh() {
    assertEquals(
      "5s7h9c2h AsKc8s4h 5d4dTdKh 6c3dJdQs Kd4c4sAd",
      Solver.process("omaha-holdem 2d7dAcKsQd Kd4c4sAd AsKc8s4h 6c3dJdQs 5s7h9c2h 5d4dTdKh"));
  }

  @Test
  public void test_omaha_holdem_4133_7c7s8cQdTc_9hAc5sKc_7h3dKd2d_Jh9s6c6s_Kh8hThAd_3c3hJcAs() {
    assertEquals(
      "Kh8hThAd 7h3dKd2d Jh9s6c6s 3c3hJcAs 9hAc5sKc",
      Solver.process("omaha-holdem 7c7s8cQdTc 9hAc5sKc 7h3dKd2d Jh9s6c6s Kh8hThAd 3c3hJcAs"));
  }

  @Test
  public void test_omaha_holdem_4134_5s7d8dTcTh_3d6sKdKc_2d5cKsJs_4c4d4s7s_QdJd3h2h_3cTsAs7c_Ad7h8cQs_9dAcJcTd_5d6c8h3s() {
    assertEquals(
      "QdJd3h2h 2d5cKsJs 4c4d4s7s 5d6c8h3s Ad7h8cQs 3d6sKdKc 9dAcJcTd 3cTsAs7c",
      Solver.process("omaha-holdem 5s7d8dTcTh 3d6sKdKc 2d5cKsJs 4c4d4s7s QdJd3h2h 3cTsAs7c Ad7h8cQs 9dAcJcTd 5d6c8h3s"));
  }

  @Test
  public void test_omaha_holdem_4135_2d8h9dJhJs_6d3sKd5h_Ac9hQs6c_2cAh7d8s() {
    assertEquals(
      "6d3sKd5h 2cAh7d8s Ac9hQs6c",
      Solver.process("omaha-holdem 2d8h9dJhJs 6d3sKd5h Ac9hQs6c 2cAh7d8s"));
  }

  @Test
  public void test_omaha_holdem_4136_3s5d8h9dJs_5s8sKs3h_4hTdAc6d_9cKd7dTh_3c2sAhAs_2hKcKh6s_2c7s5c8c() {
    assertEquals(
      "4hTdAc6d 2hKcKh6s 3c2sAhAs 2c7s5c8c=5s8sKs3h 9cKd7dTh",
      Solver.process("omaha-holdem 3s5d8h9dJs 5s8sKs3h 4hTdAc6d 9cKd7dTh 3c2sAhAs 2hKcKh6s 2c7s5c8c"));
  }

  @Test
  public void test_omaha_holdem_4137_2h4d6sKcQh_AhJc6d7s_3hKs5hTs() {
    assertEquals(
      "AhJc6d7s 3hKs5hTs",
      Solver.process("omaha-holdem 2h4d6sKcQh AhJc6d7s 3hKs5hTs"));
  }

  @Test
  public void test_omaha_holdem_4138_2c2s4s5dJd_9s8d9cKc_Qc3s3dTh_JcQs9d8s_5s3h7d4h_8c6cKdTd_Kh4c7h8h_2hQh3c4d_TsJsAc5c_2dAh6h7c() {
    assertEquals(
      "8c6cKdTd Qc3s3dTh Kh4c7h8h 5s3h7d4h 9s8d9cKc JcQs9d8s TsJsAc5c 2dAh6h7c 2hQh3c4d",
      Solver.process("omaha-holdem 2c2s4s5dJd 9s8d9cKc Qc3s3dTh JcQs9d8s 5s3h7d4h 8c6cKdTd Kh4c7h8h 2hQh3c4d TsJsAc5c 2dAh6h7c"));
  }

  @Test
  public void test_omaha_holdem_4139_3h5d5hAsKs_4h6hTd7s_9s7hAd2d_4s7d4cTh_3s7c4dQd_8h6cAcJc() {
    assertEquals(
      "4h6hTd7s 3s7c4dQd 4s7d4cTh 9s7hAd2d 8h6cAcJc",
      Solver.process("omaha-holdem 3h5d5hAsKs 4h6hTd7s 9s7hAd2d 4s7d4cTh 3s7c4dQd 8h6cAcJc"));
  }

  @Test
  public void test_omaha_holdem_4140_2d2s3c9hAh_3s9c5c9s_JhTc8cJc_3h7cTsJs_5s4cJd2h_8s5d6dKc() {
    assertEquals(
      "8s5d6dKc 3h7cTsJs JhTc8cJc 5s4cJd2h 3s9c5c9s",
      Solver.process("omaha-holdem 2d2s3c9hAh 3s9c5c9s JhTc8cJc 3h7cTsJs 5s4cJd2h 8s5d6dKc"));
  }

  @Test
  public void test_omaha_holdem_4141_3c3h5d9dAd_4h5cKh9c_Kc4cQcQh_2dKd9s3d_7c6dQdJs_Ac4dJh8s_Tc8h8dQs() {
    assertEquals(
      "Tc8h8dQs 4h5cKh9c Kc4cQcQh Ac4dJh8s 7c6dQdJs 2dKd9s3d",
      Solver.process("omaha-holdem 3c3h5d9dAd 4h5cKh9c Kc4cQcQh 2dKd9s3d 7c6dQdJs Ac4dJh8s Tc8h8dQs"));
  }

  @Test
  public void test_omaha_holdem_4142_5h6sAsJsKs_4hQhJc9h_KhQdJhTc_3hQs9c5s_2d8d4c3c_2s4d8sKd_7s4s9s8h_6d2hThAh_3d7cTsAc_Kc7hJd6h() {
    assertEquals(
      "2d8d4c3c 4hQhJc9h 3d7cTsAc Kc7hJd6h 6d2hThAh KhQdJhTc 2s4d8sKd 7s4s9s8h 3hQs9c5s",
      Solver.process("omaha-holdem 5h6sAsJsKs 4hQhJc9h KhQdJhTc 3hQs9c5s 2d8d4c3c 2s4d8sKd 7s4s9s8h 6d2hThAh 3d7cTsAc Kc7hJd6h"));
  }

  @Test
  public void test_omaha_holdem_4143_4h6s7c7dKd_TdTh8sAd_4d4c3hJc_Ah9dKs7s_Qc4sQs6c() {
    assertEquals(
      "TdTh8sAd Qc4sQs6c 4d4c3hJc Ah9dKs7s",
      Solver.process("omaha-holdem 4h6s7c7dKd TdTh8sAd 4d4c3hJc Ah9dKs7s Qc4sQs6c"));
  }

  @Test
  public void test_omaha_holdem_4144_3d6cJcJdJs_5h5d5sTs_7h8h4cQc_KdTdQh8c() {
    assertEquals(
      "7h8h4cQc KdTdQh8c 5h5d5sTs",
      Solver.process("omaha-holdem 3d6cJcJdJs 5h5d5sTs 7h8h4cQc KdTdQh8c"));
  }

  @Test
  public void test_omaha_holdem_4145_3d5h8c8s9s_9h3c7d5s_7sTh2dQc_7cKcAd3h_5c2cQd9c() {
    assertEquals(
      "7sTh2dQc 7cKcAd3h 9h3c7d5s 5c2cQd9c",
      Solver.process("omaha-holdem 3d5h8c8s9s 9h3c7d5s 7sTh2dQc 7cKcAd3h 5c2cQd9c"));
  }

  @Test
  public void test_omaha_holdem_4146_3h5s9dJcKd_8hJs6hQc_As9c4sJd_Qd7hAh4c_Th3d5hKs_7c5d8dQs_Ts8sKh5c_9hQh6s2d_2sKc6c4d() {
    assertEquals(
      "Qd7hAh4c 7c5d8dQs 9hQh6s2d 8hJs6hQc 2sKc6c4d As9c4sJd Th3d5hKs=Ts8sKh5c",
      Solver.process("omaha-holdem 3h5s9dJcKd 8hJs6hQc As9c4sJd Qd7hAh4c Th3d5hKs 7c5d8dQs Ts8sKh5c 9hQh6s2d 2sKc6c4d"));
  }

  @Test
  public void test_omaha_holdem_4147_2c6h7cQsTc_Ks2sTh2h_8cTd8hAd_5sJc8s4h() {
    assertEquals(
      "5sJc8s4h 8cTd8hAd Ks2sTh2h",
      Solver.process("omaha-holdem 2c6h7cQsTc Ks2sTh2h 8cTd8hAd 5sJc8s4h"));
  }

  @Test
  public void test_omaha_holdem_4148_2d4c4h8d9c_Jh5s6cAc_7d8s3d2c_QdTs3cTd() {
    assertEquals(
      "Jh5s6cAc 7d8s3d2c QdTs3cTd",
      Solver.process("omaha-holdem 2d4c4h8d9c Jh5s6cAc 7d8s3d2c QdTs3cTd"));
  }

  @Test
  public void test_omaha_holdem_4149_3s5s8sAhJh_ThQsAd9s_6sTdTcJc_AcQd4h3h_6h2h4dQc() {
    assertEquals(
      "6sTdTcJc AcQd4h3h 6h2h4dQc ThQsAd9s",
      Solver.process("omaha-holdem 3s5s8sAhJh ThQsAd9s 6sTdTcJc AcQd4h3h 6h2h4dQc"));
  }

  @Test
  public void test_omaha_holdem_4150_6h7sKsQcQs_Ac5c8d9h_Th2h8sAh_7dAsJdJh_2sKd8h5h_3c8c4c2c_Kc6sKhAd_Qd3s6c9s() {
    assertEquals(
      "3c8c4c2c Ac5c8d9h Th2h8sAh 7dAsJdJh 2sKd8h5h Qd3s6c9s Kc6sKhAd",
      Solver.process("omaha-holdem 6h7sKsQcQs Ac5c8d9h Th2h8sAh 7dAsJdJh 2sKd8h5h 3c8c4c2c Kc6sKhAd Qd3s6c9s"));
  }

  @Test
  public void test_omaha_holdem_4151_9sKdQcQdQs_3dTh4c2d_JhJd3h9h_6d2cAcTc_TsAs8c3c() {
    assertEquals(
      "3dTh4c2d 6d2cAcTc=TsAs8c3c JhJd3h9h",
      Solver.process("omaha-holdem 9sKdQcQdQs 3dTh4c2d JhJd3h9h 6d2cAcTc TsAs8c3c"));
  }

  @Test
  public void test_omaha_holdem_4152_2h3s5dJhTs_6d8c4h7h_AsQd2s2d_9d9cQcAh_4s5sKsTh_9s6c9hQh() {
    assertEquals(
      "9d9cQcAh=9s6c9hQh 4s5sKsTh AsQd2s2d 6d8c4h7h",
      Solver.process("omaha-holdem 2h3s5dJhTs 6d8c4h7h AsQd2s2d 9d9cQcAh 4s5sKsTh 9s6c9hQh"));
  }

  @Test
  public void test_omaha_holdem_4153_2c6c9d9hJd_8s4sKd4h_2d5cJhTh_9sTs5hQd_JsKhJc9c_Qs3c6d7s_4d2sAcKs() {
    assertEquals(
      "4d2sAcKs 8s4sKd4h Qs3c6d7s 2d5cJhTh 9sTs5hQd JsKhJc9c",
      Solver.process("omaha-holdem 2c6c9d9hJd 8s4sKd4h 2d5cJhTh 9sTs5hQd JsKhJc9c Qs3c6d7s 4d2sAcKs"));
  }

  @Test
  public void test_omaha_holdem_4154_5c5h6c8hAs_Jh7h2hQh_3c3h7c2s_4s8s5s9d() {
    assertEquals(
      "Jh7h2hQh 3c3h7c2s 4s8s5s9d",
      Solver.process("omaha-holdem 5c5h6c8hAs Jh7h2hQh 3c3h7c2s 4s8s5s9d"));
  }

  @Test
  public void test_omaha_holdem_4155_2h3c4d8hKh_JcJh3h8d_AhJd5c2c_Ac9s3d4h_Tc2dKd7h_5dKc4sQc() {
    assertEquals(
      "Ac9s3d4h Tc2dKd7h 5dKc4sQc AhJd5c2c JcJh3h8d",
      Solver.process("omaha-holdem 2h3c4d8hKh JcJh3h8d AhJd5c2c Ac9s3d4h Tc2dKd7h 5dKc4sQc"));
  }

  @Test
  public void test_omaha_holdem_4156_7cKhQsTdTs_9h7d4s3d_5s7s2d8d_8sTc5cAd_2c3s4hQd_Qc9cJs4d_As8hAc2s_3cKc6dJh_9sTh8c9d() {
    assertEquals(
      "5s7s2d8d 9h7d4s3d 2c3s4hQd 3cKc6dJh As8hAc2s 9sTh8c9d 8sTc5cAd Qc9cJs4d",
      Solver.process("omaha-holdem 7cKhQsTdTs 9h7d4s3d 5s7s2d8d 8sTc5cAd 2c3s4hQd Qc9cJs4d As8hAc2s 3cKc6dJh 9sTh8c9d"));
  }

  @Test
  public void test_omaha_holdem_4157_5c7dJcJhTs_As3cKd4h_8c8s9dJd() {
    assertEquals(
      "As3cKd4h 8c8s9dJd",
      Solver.process("omaha-holdem 5c7dJcJhTs As3cKd4h 8c8s9dJd"));
  }

  @Test
  public void test_omaha_holdem_4158_4s5s7c7hTc_6hAdQhTd_3d7s4hJs_6cAs8h5h_Ts2c6s9d_Kd2sKh2h_5d3sTh4d() {
    assertEquals(
      "5d3sTh4d Ts2c6s9d 6hAdQhTd Kd2sKh2h 6cAs8h5h 3d7s4hJs",
      Solver.process("omaha-holdem 4s5s7c7hTc 6hAdQhTd 3d7s4hJs 6cAs8h5h Ts2c6s9d Kd2sKh2h 5d3sTh4d"));
  }

  @Test
  public void test_omaha_holdem_4159_2s7c7h8sKc_2d8h4cJs_3dQd6sKd_9h3s4s6d_9s2c3hAc_5hAdQs8d() {
    assertEquals(
      "9h3s4s6d 9s2c3hAc 2d8h4cJs 5hAdQs8d 3dQd6sKd",
      Solver.process("omaha-holdem 2s7c7h8sKc 2d8h4cJs 3dQd6sKd 9h3s4s6d 9s2c3hAc 5hAdQs8d"));
  }

  @Test
  public void test_omaha_holdem_4160_3s8sAhKhQh_Ts4c8d9c_5cAsQc8c_5d9hTd3c_4dTc2cQd_Th5s7c6s_2s3d8h6d_Jc7d6h2h_Jd4s6cKc_QsJhJsKs() {
    assertEquals(
      "Th5s7c6s 5d9hTd3c Ts4c8d9c 4dTc2cQd Jd4s6cKc 2s3d8h6d QsJhJsKs 5cAsQc8c Jc7d6h2h",
      Solver.process("omaha-holdem 3s8sAhKhQh Ts4c8d9c 5cAsQc8c 5d9hTd3c 4dTc2cQd Th5s7c6s 2s3d8h6d Jc7d6h2h Jd4s6cKc QsJhJsKs"));
  }

  @Test
  public void test_omaha_holdem_4161_6c6s8h8sAs_5cKh9d3h_4sKc8cTd_Kd5d9c5s_5hQc7sJc_6d9sJhAd() {
    assertEquals(
      "5hQc7sJc 5cKh9d3h Kd5d9c5s 4sKc8cTd 6d9sJhAd",
      Solver.process("omaha-holdem 6c6s8h8sAs 5cKh9d3h 4sKc8cTd Kd5d9c5s 5hQc7sJc 6d9sJhAd"));
  }

  @Test
  public void test_omaha_holdem_4162_3d5h6cAcQs_9s9c9h8c_7s5d3h8h_TcTd4s8d_2h7cTs4h_7hKcAd6s() {
    assertEquals(
      "9s9c9h8c TcTd4s8d 7s5d3h8h 7hKcAd6s 2h7cTs4h",
      Solver.process("omaha-holdem 3d5h6cAcQs 9s9c9h8c 7s5d3h8h TcTd4s8d 2h7cTs4h 7hKcAd6s"));
  }

  @Test
  public void test_omaha_holdem_4163_4s8sJhJsQs_8cKsThJc_5dQhAh3d() {
    assertEquals(
      "5dQhAh3d 8cKsThJc",
      Solver.process("omaha-holdem 4s8sJhJsQs 8cKsThJc 5dQhAh3d"));
  }

  @Test
  public void test_omaha_holdem_4164_3h4c5d8cKs_AcTh6dQs_Ts7sTdKc_QcJs9hTc_3dJc9dQd_AhJh2d2s_5hKhAd2h_9s7h3s4h_2c5s7dKd() {
    assertEquals(
      "QcJs9hTc AcTh6dQs 3dJc9dQd Ts7sTdKc 9s7h3s4h 2c5s7dKd 5hKhAd2h=AhJh2d2s",
      Solver.process("omaha-holdem 3h4c5d8cKs AcTh6dQs Ts7sTdKc QcJs9hTc 3dJc9dQd AhJh2d2s 5hKhAd2h 9s7h3s4h 2c5s7dKd"));
  }

  @Test
  public void test_omaha_holdem_4165_4c6s8cAsJh_Ah4hTs4s_8sKd3sQd() {
    assertEquals(
      "8sKd3sQd Ah4hTs4s",
      Solver.process("omaha-holdem 4c6s8cAsJh Ah4hTs4s 8sKd3sQd"));
  }

  @Test
  public void test_omaha_holdem_4166_8hAdQcQhTs_QdKh8d6c_4c9s2h3c() {
    assertEquals(
      "4c9s2h3c QdKh8d6c",
      Solver.process("omaha-holdem 8hAdQcQhTs QdKh8d6c 4c9s2h3c"));
  }

  @Test
  public void test_omaha_holdem_4167_5d6d7sAdTh_JhTs7h9s_4dAcKc8d_4h5cTc9c() {
    assertEquals(
      "4h5cTc9c JhTs7h9s 4dAcKc8d",
      Solver.process("omaha-holdem 5d6d7sAdTh JhTs7h9s 4dAcKc8d 4h5cTc9c"));
  }

  @Test
  public void test_omaha_holdem_4168_5s7hAcAsKs_Js8d6h5h_9d3cQcJh_8c7d4h2h() {
    assertEquals(
      "9d3cQcJh Js8d6h5h 8c7d4h2h",
      Solver.process("omaha-holdem 5s7hAcAsKs Js8d6h5h 9d3cQcJh 8c7d4h2h"));
  }

  @Test
  public void test_omaha_holdem_4169_4h5d5sAsTs_2s3dTh8h_4dAd9s3s_8d8s7d6h_5h6cAcKc_AhJc3c8c_Jd7cKd7s_Td5c3h7h_9cQd4sTc() {
    assertEquals(
      "Jd7cKd7s 8d8s7d6h 9cQd4sTc AhJc3c8c 2s3dTh8h 4dAd9s3s Td5c3h7h 5h6cAcKc",
      Solver.process("omaha-holdem 4h5d5sAsTs 2s3dTh8h 4dAd9s3s 8d8s7d6h 5h6cAcKc AhJc3c8c Jd7cKd7s Td5c3h7h 9cQd4sTc"));
  }

  @Test
  public void test_omaha_holdem_4170_6sKhKsTcTh_3d7s4dTd_9h5c5dQs_3cJd8sAh() {
    assertEquals(
      "3cJd8sAh 9h5c5dQs 3d7s4dTd",
      Solver.process("omaha-holdem 6sKhKsTcTh 3d7s4dTd 9h5c5dQs 3cJd8sAh"));
  }

  @Test
  public void test_omaha_holdem_4171_3c9sAhQdTd_4sTs6c2h_8d7c8sJh() {
    assertEquals(
      "4sTs6c2h 8d7c8sJh",
      Solver.process("omaha-holdem 3c9sAhQdTd 4sTs6c2h 8d7c8sJh"));
  }

  @Test
  public void test_omaha_holdem_4172_3c4c8h9dQc_Qh7c6cTc_8cKhQs6d_5c7d2hKd() {
    assertEquals(
      "5c7d2hKd 8cKhQs6d Qh7c6cTc",
      Solver.process("omaha-holdem 3c4c8h9dQc Qh7c6cTc 8cKhQs6d 5c7d2hKd"));
  }

  @Test
  public void test_omaha_holdem_4173_4c6h9dJcTh_Jd6cJs3d_QcTc5cTd_Kc3cKsQh_Ac9hQs5d_6s8s7hAs_Qd4h2c3h_2s5hAdJh_Ts7d5s4s() {
    assertEquals(
      "Qd4h2c3h Ac9hQs5d 2s5hAdJh Ts7d5s4s QcTc5cTd Jd6cJs3d 6s8s7hAs Kc3cKsQh",
      Solver.process("omaha-holdem 4c6h9dJcTh Jd6cJs3d QcTc5cTd Kc3cKsQh Ac9hQs5d 6s8s7hAs Qd4h2c3h 2s5hAdJh Ts7d5s4s"));
  }

  @Test
  public void test_omaha_holdem_4174_3h6s8dAsJh_Qc9s2hTd_2d6d3sQd_4cJc6c7c() {
    assertEquals(
      "Qc9s2hTd 2d6d3sQd 4cJc6c7c",
      Solver.process("omaha-holdem 3h6s8dAsJh Qc9s2hTd 2d6d3sQd 4cJc6c7c"));
  }

  @Test
  public void test_omaha_holdem_4175_4h4s6s7hKs_5dThQhTd_6cTcJd4c_8s9c2s4d_9dJh2cQc_8d9sKcKd_5s2d9hAd_3hTsJc5h() {
    assertEquals(
      "9dJh2cQc 5s2d9hAd 5dThQhTd 3hTsJc5h 8s9c2s4d 6cTcJd4c 8d9sKcKd",
      Solver.process("omaha-holdem 4h4s6s7hKs 5dThQhTd 6cTcJd4c 8s9c2s4d 9dJh2cQc 8d9sKcKd 5s2d9hAd 3hTsJc5h"));
  }

  @Test
  public void test_omaha_holdem_4176_3c6s7cAcQs_9dKh4cKs_3dJs2sQd_6hKc4sTh_5c8dTc9h() {
    assertEquals(
      "6hKc4sTh 9dKh4cKs 3dJs2sQd 5c8dTc9h",
      Solver.process("omaha-holdem 3c6s7cAcQs 9dKh4cKs 3dJs2sQd 6hKc4sTh 5c8dTc9h"));
  }

  @Test
  public void test_omaha_holdem_4177_7hAdJdQcTs_3c2c7dAh_8h8c6c9d_JsTc2dQs() {
    assertEquals(
      "JsTc2dQs 3c2c7dAh 8h8c6c9d",
      Solver.process("omaha-holdem 7hAdJdQcTs 3c2c7dAh 8h8c6c9d JsTc2dQs"));
  }

  @Test
  public void test_omaha_holdem_4178_2c2s5s8s9h_Tc4h5c2d_Qh9dJhKc() {
    assertEquals(
      "Qh9dJhKc Tc4h5c2d",
      Solver.process("omaha-holdem 2c2s5s8s9h Tc4h5c2d Qh9dJhKc"));
  }

  @Test
  public void test_omaha_holdem_4179_2s3c7c7sQh_2cTs6sAs_6h4s3hTh_Qs4cTd6d_Qc7hJs5c_8sKh4h9s_3d9cQd5s_KcTc9hAd_6c8dJdAc() {
    assertEquals(
      "8sKh4h9s 6c8dJdAc KcTc9hAd 2cTs6sAs 6h4s3hTh 3d9cQd5s Qs4cTd6d Qc7hJs5c",
      Solver.process("omaha-holdem 2s3c7c7sQh 2cTs6sAs 6h4s3hTh Qs4cTd6d Qc7hJs5c 8sKh4h9s 3d9cQd5s KcTc9hAd 6c8dJdAc"));
  }

  @Test
  public void test_omaha_holdem_4180_5c8cJdKcTh_QdKhQc9h_8h4s7d9s_9d8d7s5s_Tc5d6d4h() {
    assertEquals(
      "Tc5d6d4h 8h4s7d9s=9d8d7s5s QdKhQc9h",
      Solver.process("omaha-holdem 5c8cJdKcTh QdKhQc9h 8h4s7d9s 9d8d7s5s Tc5d6d4h"));
  }

  @Test
  public void test_omaha_holdem_4181_4h7d7h7sQd_JhJs5d2c_5s2dTh4s_8c9sQc5h_Ts3cAd8s_KsQsKd8h_7cAs2h4c_3s9dQh3h() {
    assertEquals(
      "5s2dTh4s 8c9sQc5h Ts3cAd8s 3s9dQh3h JhJs5d2c KsQsKd8h 7cAs2h4c",
      Solver.process("omaha-holdem 4h7d7h7sQd JhJs5d2c 5s2dTh4s 8c9sQc5h Ts3cAd8s KsQsKd8h 7cAs2h4c 3s9dQh3h"));
  }

  @Test
  public void test_omaha_holdem_4182_4d5s6sAcTc_6c5dQs2d_Ad9c8dAh_8h7hJs3c_6d7dQcAs_2cKsJcKc_7cQh3sJd_3d5c5hTh_JhTdTs9s() {
    assertEquals(
      "2cKsJcKc 6c5dQs2d 6d7dQcAs 3d5c5hTh JhTdTs9s Ad9c8dAh 7cQh3sJd 8h7hJs3c",
      Solver.process("omaha-holdem 4d5s6sAcTc 6c5dQs2d Ad9c8dAh 8h7hJs3c 6d7dQcAs 2cKsJcKc 7cQh3sJd 3d5c5hTh JhTdTs9s"));
  }

  @Test
  public void test_omaha_holdem_4183_2s4dQdTcTd_Qs6sAc5d_2c9d9c4s_Ad2dTh9h_7c8c8d3d_Jh4h2h6c() {
    assertEquals(
      "Jh4h2h6c 2c9d9c4s Qs6sAc5d 7c8c8d3d Ad2dTh9h",
      Solver.process("omaha-holdem 2s4dQdTcTd Qs6sAc5d 2c9d9c4s Ad2dTh9h 7c8c8d3d Jh4h2h6c"));
  }

  @Test
  public void test_omaha_holdem_4184_5sJsKdQcTd_2sAd8dQd_7d7sKs6s_5d3d8s8c_8hThQh3s_9d2hAhJc() {
    assertEquals(
      "5d3d8s8c 7d7sKs6s 8hThQh3s 2sAd8dQd=9d2hAhJc",
      Solver.process("omaha-holdem 5sJsKdQcTd 2sAd8dQd 7d7sKs6s 5d3d8s8c 8hThQh3s 9d2hAhJc"));
  }

  @Test
  public void test_omaha_holdem_4185_4h8c8dAsKd_Th9dJd6d_6cAh2dJc_JsAc7cKs_3s9c3hTc_5dKh6h5h_9h7d4sJh() {
    assertEquals(
      "Th9dJd6d 3s9c3hTc 9h7d4sJh 5dKh6h5h 6cAh2dJc JsAc7cKs",
      Solver.process("omaha-holdem 4h8c8dAsKd Th9dJd6d 6cAh2dJc JsAc7cKs 3s9c3hTc 5dKh6h5h 9h7d4sJh"));
  }

  @Test
  public void test_omaha_holdem_4186_3s6h9dAdTh_Js2c3d9h_Qs6c5dAs_6dQc4d4s_Jh3cKdJc_Ks9c8c2s_Jd4h7hTd_Ts8s6sQh() {
    assertEquals(
      "6dQc4d4s Ks9c8c2s Jd4h7hTd Jh3cKdJc Js2c3d9h Ts8s6sQh Qs6c5dAs",
      Solver.process("omaha-holdem 3s6h9dAdTh Js2c3d9h Qs6c5dAs 6dQc4d4s Jh3cKdJc Ks9c8c2s Jd4h7hTd Ts8s6sQh"));
  }

  @Test
  public void test_omaha_holdem_4187_3c7hAcJsKh_AsJhKsQs_Jd8dQd9c_4d5h3h3s_3d7c2c2h_9h5c5dJc_8s4sAh6h() {
    assertEquals(
      "9h5c5dJc Jd8dQd9c 8s4sAh6h 3d7c2c2h AsJhKsQs 4d5h3h3s",
      Solver.process("omaha-holdem 3c7hAcJsKh AsJhKsQs Jd8dQd9c 4d5h3h3s 3d7c2c2h 9h5c5dJc 8s4sAh6h"));
  }

  @Test
  public void test_omaha_holdem_4188_6d9d9hAsQs_4s3sTs4h_6sJcKd9c_8h3d6h5h_7h6c8cAh_5sAcThKc() {
    assertEquals(
      "4s3sTs4h 8h3d6h5h 7h6c8cAh 5sAcThKc 6sJcKd9c",
      Solver.process("omaha-holdem 6d9d9hAsQs 4s3sTs4h 6sJcKd9c 8h3d6h5h 7h6c8cAh 5sAcThKc"));
  }

  @Test
  public void test_omaha_holdem_4189_3s8dAcJsQs_KcQd5dAd_9h7d8c6s_4d3c4s4h_3dTh6hTs_As7c7h4c() {
    assertEquals(
      "4d3c4s4h 9h7d8c6s 3dTh6hTs As7c7h4c KcQd5dAd",
      Solver.process("omaha-holdem 3s8dAcJsQs KcQd5dAd 9h7d8c6s 4d3c4s4h 3dTh6hTs As7c7h4c"));
  }

  @Test
  public void test_omaha_holdem_4190_5c8d9dAsKs_Qh9c3d7c_3s8c6sTd_Qd6dAd5d_3h2hQcJs_5s6h7s9h() {
    assertEquals(
      "3h2hQcJs 3s8c6sTd Qh9c3d7c Qd6dAd5d 5s6h7s9h",
      Solver.process("omaha-holdem 5c8d9dAsKs Qh9c3d7c 3s8c6sTd Qd6dAd5d 3h2hQcJs 5s6h7s9h"));
  }

  @Test
  public void test_omaha_holdem_4191_4c5c7dKhQc_2s7cJs3h_4dTsAsKs_3cJhAhTd() {
    assertEquals(
      "3cJhAhTd 2s7cJs3h 4dTsAsKs",
      Solver.process("omaha-holdem 4c5c7dKhQc 2s7cJs3h 4dTsAsKs 3cJhAhTd"));
  }

  @Test
  public void test_omaha_holdem_4192_5h6s7d8cAh_Kd9cKsJd_QsAs5c5d_8d4h2s3c() {
    assertEquals(
      "Kd9cKsJd QsAs5c5d 8d4h2s3c",
      Solver.process("omaha-holdem 5h6s7d8cAh Kd9cKsJd QsAs5c5d 8d4h2s3c"));
  }

  @Test
  public void test_omaha_holdem_4193_2h3s7h7sQc_9c3h3cAd_2d9hJc4h_Td4c5cJs_4sQs5d7c_2cQhKd9d() {
    assertEquals(
      "Td4c5cJs 2d9hJc4h 2cQhKd9d 9c3h3cAd 4sQs5d7c",
      Solver.process("omaha-holdem 2h3s7h7sQc 9c3h3cAd 2d9hJc4h Td4c5cJs 4sQs5d7c 2cQhKd9d"));
  }

  @Test
  public void test_omaha_holdem_4194_3h3s5h6hAs_KhKc8c7s_Ad2s4h6s_9s4sTh2h_Ts7h6cJh_5s8sQc2d_5cTcQhQs_Td9c7c8h_9d3c4cKs() {
    assertEquals(
      "Td9c7c8h 5s8sQc2d 5cTcQhQs KhKc8c7s 9d3c4cKs Ad2s4h6s 9s4sTh2h Ts7h6cJh",
      Solver.process("omaha-holdem 3h3s5h6hAs KhKc8c7s Ad2s4h6s 9s4sTh2h Ts7h6cJh 5s8sQc2d 5cTcQhQs Td9c7c8h 9d3c4cKs"));
  }

  @Test
  public void test_omaha_holdem_4195_5c8c9hJhQc_Ks6hKcAc_AdJc5sQs_5h9c9dQh_9s7h8h5d_JsKhQd6d_4c8dTs6c_Th7c2c4d_Kd7dTdJd_8s3h7s4s() {
    assertEquals(
      "8s3h7s4s 9s7h8h5d AdJc5sQs=JsKhQd6d 5h9c9dQh Kd7dTdJd 4c8dTs6c Th7c2c4d Ks6hKcAc",
      Solver.process("omaha-holdem 5c8c9hJhQc Ks6hKcAc AdJc5sQs 5h9c9dQh 9s7h8h5d JsKhQd6d 4c8dTs6c Th7c2c4d Kd7dTdJd 8s3h7s4s"));
  }

  @Test
  public void test_omaha_holdem_4196_3h5s7s8sTd_4dAs6h7c_4h4sAh2s_2h5d7dKc_JdQhQc6s_8c4c9dKd_9sJhAcTc() {
    assertEquals(
      "8c4c9dKd JdQhQc6s 2h5d7dKc 4dAs6h7c 9sJhAcTc 4h4sAh2s",
      Solver.process("omaha-holdem 3h5s7s8sTd 4dAs6h7c 4h4sAh2s 2h5d7dKc JdQhQc6s 8c4c9dKd 9sJhAcTc"));
  }

  @Test
  public void test_omaha_holdem_4197_2c2dJdKdKh_8s9c4sTc_AhQcKcQd_5c7h6h8c_Jh4d5s9s_3c4c9dKs_Td7cTsQs() {
    assertEquals(
      "5c7h6h8c 8s9c4sTc Td7cTsQs Jh4d5s9s 3c4c9dKs AhQcKcQd",
      Solver.process("omaha-holdem 2c2dJdKdKh 8s9c4sTc AhQcKcQd 5c7h6h8c Jh4d5s9s 3c4c9dKs Td7cTsQs"));
  }

  @Test
  public void test_omaha_holdem_4198_2h3h6h6s8h_7dKh6d7s_AsTc4dTh_6c9c5hAh_Td9d5sJs_9s4sQsKc_3c8d5d2s_JdKsJh3d() {
    assertEquals(
      "Td9d5sJs 9s4sQsKc 3c8d5d2s AsTc4dTh JdKsJh3d 7dKh6d7s 6c9c5hAh",
      Solver.process("omaha-holdem 2h3h6h6s8h 7dKh6d7s AsTc4dTh 6c9c5hAh Td9d5sJs 9s4sQsKc 3c8d5d2s JdKsJh3d"));
  }

  @Test
  public void test_omaha_holdem_4199_3h4hAdJdJs_6hQsKc9h_Th6s5d7h_7d2h9cKd() {
    assertEquals(
      "Th6s5d7h 7d2h9cKd 6hQsKc9h",
      Solver.process("omaha-holdem 3h4hAdJdJs 6hQsKc9h Th6s5d7h 7d2h9cKd"));
  }

  @Test
  public void test_omaha_holdem_4200_4d8s9c9dQh_Kc4hKhTh_Jc2sJdJh_6c4s5h5s_QcQd9h2c_8cQs5cAh_6sAcTs4c_3d2dAd7s() {
    assertEquals(
      "3d2dAd7s 6sAcTs4c 6c4s5h5s Jc2sJdJh 8cQs5cAh Kc4hKhTh QcQd9h2c",
      Solver.process("omaha-holdem 4d8s9c9dQh Kc4hKhTh Jc2sJdJh 6c4s5h5s QcQd9h2c 8cQs5cAh 6sAcTs4c 3d2dAd7s"));
  }

  @Test
  public void test_omaha_holdem_4201_2s3s8hAsQs_9cQhKd9s_Qc8s3d6d() {
    assertEquals(
      "9cQhKd9s Qc8s3d6d",
      Solver.process("omaha-holdem 2s3s8hAsQs 9cQhKd9s Qc8s3d6d"));
  }

  @Test
  public void test_omaha_holdem_4202_2d4hKdTcTs_Jh6c6sAh_9s9dAs3d_2c7c8s6h_3h8h7h5d() {
    assertEquals(
      "3h8h7h5d 2c7c8s6h Jh6c6sAh 9s9dAs3d",
      Solver.process("omaha-holdem 2d4hKdTcTs Jh6c6sAh 9s9dAs3d 2c7c8s6h 3h8h7h5d"));
  }

  @Test
  public void test_omaha_holdem_4203_2s3d7sAsTh_6h3sKcTc_5d4s9cJs_TdQh7h4d() {
    assertEquals(
      "6h3sKcTc TdQh7h4d 5d4s9cJs",
      Solver.process("omaha-holdem 2s3d7sAsTh 6h3sKcTc 5d4s9cJs TdQh7h4d"));
  }

  @Test
  public void test_omaha_holdem_4204_5d6s7hJdQh_3h6hAdJh_Th9hTd4c_Ts4s7c2h_6d8d9cAc_2s9dKd3s_KhQsJs5s_Tc3c9sJc_2d8c4h7s() {
    assertEquals(
      "2s9dKd3s Ts4s7c2h Th9hTd4c Tc3c9sJc 3h6hAdJh KhQsJs5s 2d8c4h7s 6d8d9cAc",
      Solver.process("omaha-holdem 5d6s7hJdQh 3h6hAdJh Th9hTd4c Ts4s7c2h 6d8d9cAc 2s9dKd3s KhQsJs5s Tc3c9sJc 2d8c4h7s"));
  }

  @Test
  public void test_omaha_holdem_4205_3c9sKhQcQd_9h6c3s5h_5sJs9d8h_ThTs9cTc_2d8c2h3h_AcQs6h7s_4d6d7d7c() {
    assertEquals(
      "2d8c2h3h 4d6d7d7c 9h6c3s5h 5sJs9d8h ThTs9cTc AcQs6h7s",
      Solver.process("omaha-holdem 3c9sKhQcQd 9h6c3s5h 5sJs9d8h ThTs9cTc 2d8c2h3h AcQs6h7s 4d6d7d7c"));
  }

  @Test
  public void test_omaha_holdem_4206_3h8h8s9dJd_9c6hTdJc_Js2c9sTh_9h5c6sAs_Qh2sQc3s_TsKd8c6d() {
    assertEquals(
      "9h5c6sAs 9c6hTdJc=Js2c9sTh Qh2sQc3s TsKd8c6d",
      Solver.process("omaha-holdem 3h8h8s9dJd 9c6hTdJc Js2c9sTh 9h5c6sAs Qh2sQc3s TsKd8c6d"));
  }

  @Test
  public void test_omaha_holdem_4207_2h8c8d9cAd_6s7s6d5h_KdAh7dTh_9d8hKhJs_6hTs9sQs_5s4hJcJd_Ac3s7hQd_2d7c9h3c_TdAsQc2c_6c3h4d4s() {
    assertEquals(
      "6c3h4d4s 6s7s6d5h 2d7c9h3c 6hTs9sQs 5s4hJcJd Ac3s7hQd=TdAsQc2c KdAh7dTh 9d8hKhJs",
      Solver.process("omaha-holdem 2h8c8d9cAd 6s7s6d5h KdAh7dTh 9d8hKhJs 6hTs9sQs 5s4hJcJd Ac3s7hQd 2d7c9h3c TdAsQc2c 6c3h4d4s"));
  }

  @Test
  public void test_omaha_holdem_4208_4h5d8hAhKh_8s5c2c8c_JsQh4sAc() {
    assertEquals(
      "JsQh4sAc 8s5c2c8c",
      Solver.process("omaha-holdem 4h5d8hAhKh 8s5c2c8c JsQh4sAc"));
  }

  @Test
  public void test_omaha_holdem_4209_2s5c5h8cKc_Kh4sAsJd_7d3dTd8s_Qh7hAc2c_Jc6d7s9c_6h8d2d6c_Qd3h7cTh() {
    assertEquals(
      "Qd3h7cTh 6h8d2d6c 7d3dTd8s Kh4sAsJd Jc6d7s9c Qh7hAc2c",
      Solver.process("omaha-holdem 2s5c5h8cKc Kh4sAsJd 7d3dTd8s Qh7hAc2c Jc6d7s9c 6h8d2d6c Qd3h7cTh"));
  }

  @Test
  public void test_omaha_holdem_4210_3s6h9c9d9h_Td4dJdJc_4h6sAdAc_Ks8h3hQh_QdKh7hTc_3d8s5c7s_2s6dQc4c_Qs9sTh7d_JhAh2d8c() {
    assertEquals(
      "3d8s5c7s 2s6dQc4c Ks8h3hQh=QdKh7hTc JhAh2d8c Td4dJdJc 4h6sAdAc Qs9sTh7d",
      Solver.process("omaha-holdem 3s6h9c9d9h Td4dJdJc 4h6sAdAc Ks8h3hQh QdKh7hTc 3d8s5c7s 2s6dQc4c Qs9sTh7d JhAh2d8c"));
  }

  @Test
  public void test_omaha_holdem_4211_2c5d6s9dQd_Qh8c9c4c_Jd2dAh6h_Td7dJsJh_TcKd5s5h_7hAcQs3h_7s4s7c3c_JcAdKh3s_8dQcTh8s_9hKs9s5c() {
    assertEquals(
      "JcAdKh3s 8dQcTh8s 7hAcQs3h Qh8c9c4c TcKd5s5h 9hKs9s5c 7s4s7c3c Td7dJsJh Jd2dAh6h",
      Solver.process("omaha-holdem 2c5d6s9dQd Qh8c9c4c Jd2dAh6h Td7dJsJh TcKd5s5h 7hAcQs3h 7s4s7c3c JcAdKh3s 8dQcTh8s 9hKs9s5c"));
  }

  @Test
  public void test_omaha_holdem_4212_5h6cJcQsTd_7sJh9sQc_Kc5s6d7d_Js2sQh4c_3d8hJd4s_Tc5c3s2h() {
    assertEquals(
      "3d8hJd4s Kc5s6d7d Tc5c3s2h 7sJh9sQc=Js2sQh4c",
      Solver.process("omaha-holdem 5h6cJcQsTd 7sJh9sQc Kc5s6d7d Js2sQh4c 3d8hJd4s Tc5c3s2h"));
  }

  @Test
  public void test_omaha_holdem_4213_4d5dAhJdKh_6cTc4c7d_Qh8dJh2d_Jc5h4h8h_2sKc2h6h_5s5cQdQs_8cAd2cKd() {
    assertEquals(
      "6cTc4c7d 2sKc2h6h Jc5h4h8h 5s5cQdQs Qh8dJh2d 8cAd2cKd",
      Solver.process("omaha-holdem 4d5dAhJdKh 6cTc4c7d Qh8dJh2d Jc5h4h8h 2sKc2h6h 5s5cQdQs 8cAd2cKd"));
  }

  @Test
  public void test_omaha_holdem_4214_6c7c8hAhTs_9sJcQdKd_9d8s5d5c_3sThAcTd_KcJh4h7h_TcQsQc2d_As6d4s9h_3h4d2h5h_2sAd8dQh() {
    assertEquals(
      "KcJh4h7h TcQsQc2d 2sAd8dQh 3sThAcTd 3h4d2h5h 9d8s5d5c=As6d4s9h 9sJcQdKd",
      Solver.process("omaha-holdem 6c7c8hAhTs 9sJcQdKd 9d8s5d5c 3sThAcTd KcJh4h7h TcQsQc2d As6d4s9h 3h4d2h5h 2sAd8dQh"));
  }

  @Test
  public void test_omaha_holdem_4215_2d5d5h5sKd_JdQh4dKc_6sKh8s9h_Ac6d7hJh_Ad4c2c3c_9s8d9c4h_AsKsQs3d_4sTc7sTd_Ts6cJc8c_3hJs5c8h() {
    assertEquals(
      "Ts6cJc8c 6sKh8s9h Ad4c2c3c Ac6d7hJh AsKsQs3d JdQh4dKc 9s8d9c4h 4sTc7sTd 3hJs5c8h",
      Solver.process("omaha-holdem 2d5d5h5sKd JdQh4dKc 6sKh8s9h Ac6d7hJh Ad4c2c3c 9s8d9c4h AsKsQs3d 4sTc7sTd Ts6cJc8c 3hJs5c8h"));
  }

  @Test
  public void test_omaha_holdem_4216_2cAhJhKdKs_4dQsAd2h_7sKh4h7c_3s9cJs7d_3hJdKcQh_8s2d4cTs_Qd6s2s9s() {
    assertEquals(
      "8s2d4cTs Qd6s2s9s 3s9cJs7d 4dQsAd2h 7sKh4h7c 3hJdKcQh",
      Solver.process("omaha-holdem 2cAhJhKdKs 4dQsAd2h 7sKh4h7c 3s9cJs7d 3hJdKcQh 8s2d4cTs Qd6s2s9s"));
  }

  @Test
  public void test_omaha_holdem_4217_2d2h8dKhQh_Td7hQc4s_6sTc6d4h() {
    assertEquals(
      "6sTc6d4h Td7hQc4s",
      Solver.process("omaha-holdem 2d2h8dKhQh Td7hQc4s 6sTc6d4h"));
  }

  @Test
  public void test_omaha_holdem_4218_3h5c7hKsTd_7c8sQhKc_JcJdJhKd_2dQs6s4c_ThQcAd8d_8cAh8hTc_Js6d4h9s() {
    assertEquals(
      "8cAh8hTc=ThQcAd8d JcJdJhKd 7c8sQhKc 2dQs6s4c=Js6d4h9s",
      Solver.process("omaha-holdem 3h5c7hKsTd 7c8sQhKc JcJdJhKd 2dQs6s4c ThQcAd8d 8cAh8hTc Js6d4h9s"));
  }

  @Test
  public void test_omaha_holdem_4219_6d7cAcAdKd_2s9s8c5h_2hJc2c5d_4s3hKsAh() {
    assertEquals(
      "2s9s8c5h 2hJc2c5d 4s3hKsAh",
      Solver.process("omaha-holdem 6d7cAcAdKd 2s9s8c5h 2hJc2c5d 4s3hKsAh"));
  }

  @Test
  public void test_omaha_holdem_4220_3h7s9cJcJh_7c4dJd8h_Ah6hQh4c_9sTd3c9h_8d4hQc4s_3d8sAs7d_2sAdKcKs() {
    assertEquals(
      "Ah6hQh4c 8d4hQc4s 3d8sAs7d 2sAdKcKs 9sTd3c9h 7c4dJd8h",
      Solver.process("omaha-holdem 3h7s9cJcJh 7c4dJd8h Ah6hQh4c 9sTd3c9h 8d4hQc4s 3d8sAs7d 2sAdKcKs"));
  }

  @Test
  public void test_omaha_holdem_4221_5s6s8d9hTs_6dThAdQh_Ac9s4c6c_7d9cJd6h_Kh4dKc2h_7cJs7sQc_8c5hAs5d_2cKs4s3s() {
    assertEquals(
      "Kh4dKc2h Ac9s4c6c 6dThAdQh 8c5hAs5d 7d9cJd6h 7cJs7sQc 2cKs4s3s",
      Solver.process("omaha-holdem 5s6s8d9hTs 6dThAdQh Ac9s4c6c 7d9cJd6h Kh4dKc2h 7cJs7sQc 8c5hAs5d 2cKs4s3s"));
  }

  @Test
  public void test_omaha_holdem_4222_2c3s5d6h7s_Td3h9d2h_5hKdTc2s_Kh7hQh8h_As6c8sAd() {
    assertEquals(
      "Kh7hQh8h As6c8sAd Td3h9d2h 5hKdTc2s",
      Solver.process("omaha-holdem 2c3s5d6h7s Td3h9d2h 5hKdTc2s Kh7hQh8h As6c8sAd"));
  }

  @Test
  public void test_omaha_holdem_4223_2c3d3h5hAd_7c7dKh8c_3c9h8s4s_5c4c3sJd_4d2dQsKc_Qh2s4hQd_KsAs6d9d_JsTsAh9s() {
    assertEquals(
      "7c7dKh8c JsTsAh9s KsAs6d9d 3c9h8s4s=4d2dQsKc=Qh2s4hQd 5c4c3sJd",
      Solver.process("omaha-holdem 2c3d3h5hAd 7c7dKh8c 3c9h8s4s 5c4c3sJd 4d2dQsKc Qh2s4hQd KsAs6d9d JsTsAh9s"));
  }

  @Test
  public void test_omaha_holdem_4224_2c9sJcKcQd_Qh4sKs7c_5c2dTd5d_2sKd4d3s_9c6h3c6d_5s8dTcAh_2h3d7sJs_3h9hKhTs_7d9dAsAd() {
    assertEquals(
      "5c2dTd5d 7d9dAsAd 2h3d7sJs 2sKd4d3s Qh4sKs7c 3h9hKhTs 5s8dTcAh 9c6h3c6d",
      Solver.process("omaha-holdem 2c9sJcKcQd Qh4sKs7c 5c2dTd5d 2sKd4d3s 9c6h3c6d 5s8dTcAh 2h3d7sJs 3h9hKhTs 7d9dAsAd"));
  }

  @Test
  public void test_omaha_holdem_4225_2s7h7sQcTd_7cJh8h9s_Kh6hQh8s_3c6sKc3d_Jc3sAhAd_9hTsJdAs_6d6cKs4c_2h3h9dKd() {
    assertEquals(
      "2h3h9dKd 3c6sKc3d 6d6cKs4c 9hTsJdAs Kh6hQh8s Jc3sAhAd 7cJh8h9s",
      Solver.process("omaha-holdem 2s7h7sQcTd 7cJh8h9s Kh6hQh8s 3c6sKc3d Jc3sAhAd 9hTsJdAs 6d6cKs4c 2h3h9dKd"));
  }

  @Test
  public void test_omaha_holdem_4226_2c2h5h7hTs_Jd9s2d9h_Jh5s7sAh() {
    assertEquals(
      "Jd9s2d9h Jh5s7sAh",
      Solver.process("omaha-holdem 2c2h5h7hTs Jd9s2d9h Jh5s7sAh"));
  }

  @Test
  public void test_omaha_holdem_4227_3s4h6h7hQc_5s3c5dKs_Js8sTd6s_9s4sJhKh_4cKc8h7c_AsAh9cAc_AdJdJcQh_2s4dKd3h_9h2h7s2c() {
    assertEquals(
      "Js8sTd6s AdJdJcQh AsAh9cAc 2s4dKd3h 4cKc8h7c 5s3c5dKs 9h2h7s2c 9s4sJhKh",
      Solver.process("omaha-holdem 3s4h6h7hQc 5s3c5dKs Js8sTd6s 9s4sJhKh 4cKc8h7c AsAh9cAc AdJdJcQh 2s4dKd3h 9h2h7s2c"));
  }

  @Test
  public void test_omaha_holdem_4228_2c3d7d9sJh_2hQd4sAd_6d9c5h2s_9hKhTh2d() {
    assertEquals(
      "2hQd4sAd 6d9c5h2s=9hKhTh2d",
      Solver.process("omaha-holdem 2c3d7d9sJh 2hQd4sAd 6d9c5h2s 9hKhTh2d"));
  }

  @Test
  public void test_omaha_holdem_4229_4s6d6s7d9s_QsAdAc5h_7hQcQhQd_8d8c4dKs_5cThJdAh() {
    assertEquals(
      "5cThJdAh 8d8c4dKs 7hQcQhQd QsAdAc5h",
      Solver.process("omaha-holdem 4s6d6s7d9s QsAdAc5h 7hQcQhQd 8d8c4dKs 5cThJdAh"));
  }

  @Test
  public void test_omaha_holdem_4230_6c6sAsJdQc_Ad4c3h2s_4sKcKh2c_5cTd9dAc_Ah7d5hJh_7h2dQhTc_4hJcQdTh_Ts5d9sKs_5s7c8h3s_8dJs6hKd() {
    assertEquals(
      "5s7c8h3s 7h2dQhTc 4hJcQdTh 4sKcKh2c Ad4c3h2s 5cTd9dAc Ah7d5hJh Ts5d9sKs 8dJs6hKd",
      Solver.process("omaha-holdem 6c6sAsJdQc Ad4c3h2s 4sKcKh2c 5cTd9dAc Ah7d5hJh 7h2dQhTc 4hJcQdTh Ts5d9sKs 5s7c8h3s 8dJs6hKd"));
  }

  @Test
  public void test_omaha_holdem_4231_2d3c5s7cKs_2h3hAhQc_Tc6s6h6d_9c8hKc4d_9s4sAs2s_9d5hThJh_7s9h7d3s() {
    assertEquals(
      "9d5hThJh Tc6s6h6d 9c8hKc4d 2h3hAhQc 7s9h7d3s 9s4sAs2s",
      Solver.process("omaha-holdem 2d3c5s7cKs 2h3hAhQc Tc6s6h6d 9c8hKc4d 9s4sAs2s 9d5hThJh 7s9h7d3s"));
  }

  @Test
  public void test_omaha_holdem_4232_2c5h7s9cTh_Jd9h6d4d_2sTdAs6h_3dKh7dAh() {
    assertEquals(
      "3dKh7dAh Jd9h6d4d 2sTdAs6h",
      Solver.process("omaha-holdem 2c5h7s9cTh Jd9h6d4d 2sTdAs6h 3dKh7dAh"));
  }

  @Test
  public void test_omaha_holdem_4233_6d9c9sAhJd_4d5d3cQs_5s6sAc7c_3d3h3sAs_8sJhQd5c_8d7h7s6h() {
    assertEquals(
      "4d5d3cQs 8d7h7s6h 8sJhQd5c 3d3h3sAs 5s6sAc7c",
      Solver.process("omaha-holdem 6d9c9sAhJd 4d5d3cQs 5s6sAc7c 3d3h3sAs 8sJhQd5c 8d7h7s6h"));
  }

  @Test
  public void test_omaha_holdem_4234_3s4dAhJdTh_Td7c7s3c_8h8c9c8s() {
    assertEquals(
      "8h8c9c8s Td7c7s3c",
      Solver.process("omaha-holdem 3s4dAhJdTh Td7c7s3c 8h8c9c8s"));
  }

  @Test
  public void test_omaha_holdem_4235_3h6s7cQhTs_QcAdQdAc_3dQsKh9d_2h8h9h9c_5cJs8s8c_4dKs2cJd_Td3s4h6c_AhJcAs5s() {
    assertEquals(
      "4dKs2cJd 5cJs8s8c AhJcAs5s Td3s4h6c 3dQsKh9d QcAdQdAc 2h8h9h9c",
      Solver.process("omaha-holdem 3h6s7cQhTs QcAdQdAc 3dQsKh9d 2h8h9h9c 5cJs8s8c 4dKs2cJd Td3s4h6c AhJcAs5s"));
  }

  @Test
  public void test_omaha_holdem_4236_8h8sAsJdQc_6sKc4dTh_4s3cKd5h_Ad3h7dJc_4cQdTc4h_JhAc9dTd() {
    assertEquals(
      "4s3cKd5h 4cQdTc4h Ad3h7dJc JhAc9dTd 6sKc4dTh",
      Solver.process("omaha-holdem 8h8sAsJdQc 6sKc4dTh 4s3cKd5h Ad3h7dJc 4cQdTc4h JhAc9dTd"));
  }

  @Test
  public void test_omaha_holdem_4237_3d4c9sJdKc_JhAh6hAc_9hTd2hQd_5s2cTs2s_8cTh7s5c_6c2dJs7h_JcQsTc3h_4dAdKdQh_4s9d7d6s() {
    assertEquals(
      "8cTh7s5c 5s2cTs2s 6c2dJs7h JhAh6hAc 4s9d7d6s 4dAdKdQh 9hTd2hQd=JcQsTc3h",
      Solver.process("omaha-holdem 3d4c9sJdKc JhAh6hAc 9hTd2hQd 5s2cTs2s 8cTh7s5c 6c2dJs7h JcQsTc3h 4dAdKdQh 4s9d7d6s"));
  }

  @Test
  public void test_omaha_holdem_4238_2d2sJsQcTh_QdJc7c8c_As9dAd7s_Ks2c3c8h_Kh3s6c3h_6d6s7dTc_7h5cJd6h_4d8s5d2h_8dAhJhTs() {
    assertEquals(
      "Kh3s6c3h 6d6s7dTc 7h5cJd6h 8dAhJhTs QdJc7c8c As9dAd7s 4d8s5d2h Ks2c3c8h",
      Solver.process("omaha-holdem 2d2sJsQcTh QdJc7c8c As9dAd7s Ks2c3c8h Kh3s6c3h 6d6s7dTc 7h5cJd6h 4d8s5d2h 8dAhJhTs"));
  }

  @Test
  public void test_omaha_holdem_4239_6h6s7hJcJh_AhKc3hQh_Qs2h5d9s_9d2sJd7c_Tc8c4c4h_3cQc6cAc_3d8h9cKd_8dQd7d2c_Ad5s4s2d() {
    assertEquals(
      "Qs2h5d9s 3d8h9cKd Ad5s4s2d Tc8c4c4h 8dQd7d2c 3cQc6cAc AhKc3hQh 9d2sJd7c",
      Solver.process("omaha-holdem 6h6s7hJcJh AhKc3hQh Qs2h5d9s 9d2sJd7c Tc8c4c4h 3cQc6cAc 3d8h9cKd 8dQd7d2c Ad5s4s2d"));
  }

  @Test
  public void test_omaha_holdem_4240_2c2s3h4h7c_6h5c4d4c_Jd3s5s8s_8c7dTc5h_JhKdQd4s_As9cAdKc() {
    assertEquals(
      "Jd3s5s8s JhKdQd4s 8c7dTc5h As9cAdKc 6h5c4d4c",
      Solver.process("omaha-holdem 2c2s3h4h7c 6h5c4d4c Jd3s5s8s 8c7dTc5h JhKdQd4s As9cAdKc"));
  }

  @Test
  public void test_omaha_holdem_4241_3d8cKcKdQs_6h3hQc5h_QhJc7s5c_8h6d3sTd_AdQd4dJd_7h4s7d2c_AhKs6s9h_2hAc8dTh_3c5d2dTc_2s9cAs9d() {
    assertEquals(
      "3c5d2dTc 7h4s7d2c 8h6d3sTd 2hAc8dTh 2s9cAs9d 6h3hQc5h QhJc7s5c AdQd4dJd AhKs6s9h",
      Solver.process("omaha-holdem 3d8cKcKdQs 6h3hQc5h QhJc7s5c 8h6d3sTd AdQd4dJd 7h4s7d2c AhKs6s9h 2hAc8dTh 3c5d2dTc 2s9cAs9d"));
  }

  @Test
  public void test_omaha_holdem_4242_3s4h7d9dKc_2h4s4c5c_9h7h2c8h_9cJsJc7s_Ks3cAd3h_Jd7c3dQs_8cQhJh6d_2s5s8dAs_9sThAhKh_TsKd6s5d() {
    assertEquals(
      "8cQhJh6d 2s5s8dAs Jd7c3dQs 9cJsJc7s=9h7h2c8h 9sThAhKh Ks3cAd3h 2h4s4c5c TsKd6s5d",
      Solver.process("omaha-holdem 3s4h7d9dKc 2h4s4c5c 9h7h2c8h 9cJsJc7s Ks3cAd3h Jd7c3dQs 8cQhJh6d 2s5s8dAs 9sThAhKh TsKd6s5d"));
  }

  @Test
  public void test_omaha_holdem_4243_2c5c6h7cQd_Kh9d3c7h_Td4d5hTc_Jd6s9s9h() {
    assertEquals(
      "Kh9d3c7h Jd6s9s9h Td4d5hTc",
      Solver.process("omaha-holdem 2c5c6h7cQd Kh9d3c7h Td4d5hTc Jd6s9s9h"));
  }

  @Test
  public void test_omaha_holdem_4244_8d8s9dKcQd_7sTc9c4s_Kh6dJhTd_2s4h2d3s_Qs4dJd8h_2c7c8cAs_KsQh3h6c() {
    assertEquals(
      "2s4h2d3s 7sTc9c4s KsQh3h6c 2c7c8cAs Kh6dJhTd Qs4dJd8h",
      Solver.process("omaha-holdem 8d8s9dKcQd 7sTc9c4s Kh6dJhTd 2s4h2d3s Qs4dJd8h 2c7c8cAs KsQh3h6c"));
  }

  @Test
  public void test_omaha_holdem_4245_5c7c8cAsKd_Jc4c9h4d_5hQs4s7d_2hTsJd2d_Ks2sQh8d_7s9d3dTh_8h9cTc6s_Jh6hQd5s_Ad3c6c7h_2c3hQcAh() {
    assertEquals(
      "2hTsJd2d Jh6hQd5s 7s9d3dTh 5hQs4s7d Ks2sQh8d Ad3c6c7h 8h9cTc6s Jc4c9h4d 2c3hQcAh",
      Solver.process("omaha-holdem 5c7c8cAsKd Jc4c9h4d 5hQs4s7d 2hTsJd2d Ks2sQh8d 7s9d3dTh 8h9cTc6s Jh6hQd5s Ad3c6c7h 2c3hQcAh"));
  }

  @Test
  public void test_omaha_holdem_4246_2c3s7s9sAc_3h6h4hKd_Js8c7h5d_4d6c5cTs() {
    assertEquals(
      "3h6h4hKd Js8c7h5d 4d6c5cTs",
      Solver.process("omaha-holdem 2c3s7s9sAc 3h6h4hKd Js8c7h5d 4d6c5cTs"));
  }

  @Test
  public void test_omaha_holdem_4247_2d7h9hAcAh_Jd7s8hQs_9sKd3dTs_4d3h6d6c_7c4cThTd_QhKs9cJc_Kh5h4s8c_As2cQcQd() {
    assertEquals(
      "4d3h6d6c Jd7s8hQs 9sKd3dTs=QhKs9cJc 7c4cThTd Kh5h4s8c As2cQcQd",
      Solver.process("omaha-holdem 2d7h9hAcAh Jd7s8hQs 9sKd3dTs 4d3h6d6c 7c4cThTd QhKs9cJc Kh5h4s8c As2cQcQd"));
  }

  @Test
  public void test_omaha_holdem_4248_2d3s4d4s9s_Kh3c7cQd_5s2h9cQc_7s8d6cAs_TcAh2sQh() {
    assertEquals(
      "TcAh2sQh Kh3c7cQd 5s2h9cQc 7s8d6cAs",
      Solver.process("omaha-holdem 2d3s4d4s9s Kh3c7cQd 5s2h9cQc 7s8d6cAs TcAh2sQh"));
  }

  @Test
  public void test_omaha_holdem_4249_3d7d9d9sKc_8c8d7cAh_8s3c7sTs() {
    assertEquals(
      "8s3c7sTs 8c8d7cAh",
      Solver.process("omaha-holdem 3d7d9d9sKc 8c8d7cAh 8s3c7sTs"));
  }

}
