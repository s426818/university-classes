
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OmahaHoldemSolver21HiddenTest {


  @Test
  public void test_omaha_holdem_5250_5s6c9dJdJs_3hJh4hTs_KcJcAh3c_8s2hQdTc_6d7s7c2c_5c5h7hAs_6sQcKh5d_8c8hQh8d_Qs4c6hTh() {
    assertEquals(
      "8s2hQdTc Qs4c6hTh 6sQcKh5d 6d7s7c2c 8c8hQh8d 3hJh4hTs KcJcAh3c 5c5h7hAs",
      Solver.process("omaha-holdem 5s6c9dJdJs 3hJh4hTs KcJcAh3c 8s2hQdTc 6d7s7c2c 5c5h7hAs 6sQcKh5d 8c8hQh8d Qs4c6hTh"));
  }

  @Test
  public void test_omaha_holdem_5251_4h4s5cKsTh_QsKc5s7c_2s7sKdJd_3c9d2h8h_6c8c9sKh_2d8sJcAs_6dQh6hQd() {
    assertEquals(
      "3c9d2h8h 2d8sJcAs 6dQh6hQd 6c8c9sKh 2s7sKdJd QsKc5s7c",
      Solver.process("omaha-holdem 4h4s5cKsTh QsKc5s7c 2s7sKdJd 3c9d2h8h 6c8c9sKh 2d8sJcAs 6dQh6hQd"));
  }

  @Test
  public void test_omaha_holdem_5252_5c8s9cAdKh_9hQs3s8h_JcTs6d2h_7s7dAs9s_Th6sQdTd() {
    assertEquals(
      "JcTs6d2h Th6sQdTd 9hQs3s8h 7s7dAs9s",
      Solver.process("omaha-holdem 5c8s9cAdKh 9hQs3s8h JcTs6d2h 7s7dAs9s Th6sQdTd"));
  }

  @Test
  public void test_omaha_holdem_5253_3s5c5h7cJs_Ah8c2cKd_Jd9dKh3d_7hKc6d9c_2h6s4d8d_8h9sKsQc_Ad4s3hJc_9h5s2dAc_6c8sQsQd_Td6hJh7s() {
    assertEquals(
      "8h9sKsQc Ah8c2cKd 7hKc6d9c Jd9dKh3d Ad4s3hJc Td6hJh7s 6c8sQsQd 9h5s2dAc 2h6s4d8d",
      Solver.process("omaha-holdem 3s5c5h7cJs Ah8c2cKd Jd9dKh3d 7hKc6d9c 2h6s4d8d 8h9sKsQc Ad4s3hJc 9h5s2dAc 6c8sQsQd Td6hJh7s"));
  }

  @Test
  public void test_omaha_holdem_5254_4d7d8s9hKd_Qh2s8d5d_Kh8cJs9d() {
    assertEquals(
      "Kh8cJs9d Qh2s8d5d",
      Solver.process("omaha-holdem 4d7d8s9hKd Qh2s8d5d Kh8cJs9d"));
  }

  @Test
  public void test_omaha_holdem_5255_3c4h8cKdTh_9d8sTsJd_7hQh5sTd_7dJs4dAc_8d9s3h2s_3sQs5cAh_8h9c5d6h_6sQcAsJc() {
    assertEquals(
      "6sQcAsJc 3sQs5cAh 7dJs4dAc 8h9c5d6h 7hQh5sTd 8d9s3h2s 9d8sTsJd",
      Solver.process("omaha-holdem 3c4h8cKdTh 9d8sTsJd 7hQh5sTd 7dJs4dAc 8d9s3h2s 3sQs5cAh 8h9c5d6h 6sQcAsJc"));
  }

  @Test
  public void test_omaha_holdem_5256_2h5c6s9cKs_5sQs7h7c_7sJh3s8d_4hTd6d9s_6c3d8sQh() {
    assertEquals(
      "6c3d8sQh 5sQs7h7c 4hTd6d9s 7sJh3s8d",
      Solver.process("omaha-holdem 2h5c6s9cKs 5sQs7h7c 7sJh3s8d 4hTd6d9s 6c3d8sQh"));
  }

  @Test
  public void test_omaha_holdem_5257_3d6c8cAsQs_6sTs5s5c_5d7s9hJh_8s9sKh5h_9dKs3s8d_2h7h4c4d_Ah6d9c7d_Td4h3h2d_TcQc6h8h_7c2cJs3c() {
    assertEquals(
      "5d7s9hJh Td4h3h2d 7c2cJs3c 2h7h4c4d 6sTs5s5c 8s9sKh5h 9dKs3s8d TcQc6h8h Ah6d9c7d",
      Solver.process("omaha-holdem 3d6c8cAsQs 6sTs5s5c 5d7s9hJh 8s9sKh5h 9dKs3s8d 2h7h4c4d Ah6d9c7d Td4h3h2d TcQc6h8h 7c2cJs3c"));
  }

  @Test
  public void test_omaha_holdem_5258_2h5d7h9cTd_3hJdTcKh_QcQdKs6h_3sThJs6d_9h7s7cQh_Ac5c8hKc_TsAh2sAs_2c8cJcJh_9d8dQs6c_Kd5sAd9s() {
    assertEquals(
      "Ac5c8hKc 3sThJs6d 3hJdTcKh QcQdKs6h Kd5sAd9s TsAh2sAs 9h7s7cQh 9d8dQs6c 2c8cJcJh",
      Solver.process("omaha-holdem 2h5d7h9cTd 3hJdTcKh QcQdKs6h 3sThJs6d 9h7s7cQh Ac5c8hKc TsAh2sAs 2c8cJcJh 9d8dQs6c Kd5sAd9s"));
  }

  @Test
  public void test_omaha_holdem_5259_3c8s9dJdTc_8d3sAd6c_Qh6s4c2d_2sQcAs8h_5sJhJs9h_2hThKd9s_JcAcKc8c_3h7hTd2c_6d4hQs5c_4d5h5d6h() {
    assertEquals(
      "6d4hQs5c=Qh6s4c2d 4d5h5d6h 8d3sAd6c 2hThKd9s JcAcKc8c 5sJhJs9h 3h7hTd2c 2sQcAs8h",
      Solver.process("omaha-holdem 3c8s9dJdTc 8d3sAd6c Qh6s4c2d 2sQcAs8h 5sJhJs9h 2hThKd9s JcAcKc8c 3h7hTd2c 6d4hQs5c 4d5h5d6h"));
  }

  @Test
  public void test_omaha_holdem_5260_2s3s7hAdJh_6dJsQc4s_Kc2cTd7d_Ah3h6hQd_Kh2d7sTc_2h8d3d9h_5d6c5c4d_4cAc8hQh() {
    assertEquals(
      "6dJsQc4s 4cAc8hQh 2h8d3d9h Kc2cTd7d=Kh2d7sTc Ah3h6hQd 5d6c5c4d",
      Solver.process("omaha-holdem 2s3s7hAdJh 6dJsQc4s Kc2cTd7d Ah3h6hQd Kh2d7sTc 2h8d3d9h 5d6c5c4d 4cAc8hQh"));
  }

  @Test
  public void test_omaha_holdem_5261_2h3d4h7c7s_8d8cJh3h_Qd3c9dAs_2cQh9sTs() {
    assertEquals(
      "2cQh9sTs Qd3c9dAs 8d8cJh3h",
      Solver.process("omaha-holdem 2h3d4h7c7s 8d8cJh3h Qd3c9dAs 2cQh9sTs"));
  }

  @Test
  public void test_omaha_holdem_5262_2s3s7c8hJs_4s9dQs9h_Ac3hKs9s_9c3d5sJh_Kc3cKdJc_8d7s4hQc_As5d2c2h_5hAh2dAd_6s6dTc6c_JdTh7hTd() {
    assertEquals(
      "6s6dTc6c 5hAh2dAd 8d7s4hQc 9c3d5sJh=Kc3cKdJc JdTh7hTd As5d2c2h 4s9dQs9h Ac3hKs9s",
      Solver.process("omaha-holdem 2s3s7c8hJs 4s9dQs9h Ac3hKs9s 9c3d5sJh Kc3cKdJc 8d7s4hQc As5d2c2h 5hAh2dAd 6s6dTc6c JdTh7hTd"));
  }

  @Test
  public void test_omaha_holdem_5263_3d3h5c6dKc_8hQh7c7d_6sTdAh3s_2c4d8d8c_5hAc9sKd_Ad8s2hAs_7s2sJcTh() {
    assertEquals(
      "7s2sJcTh 8hQh7c7d 5hAc9sKd Ad8s2hAs 2c4d8d8c 6sTdAh3s",
      Solver.process("omaha-holdem 3d3h5c6dKc 8hQh7c7d 6sTdAh3s 2c4d8d8c 5hAc9sKd Ad8s2hAs 7s2sJcTh"));
  }

  @Test
  public void test_omaha_holdem_5264_4s7h7s9cJh_4dJdQh3c_QcThAs7d_Tc5d2hAc_5hKc7c3s_8sAhQd9d() {
    assertEquals(
      "Tc5d2hAc 8sAhQd9d 4dJdQh3c 5hKc7c3s QcThAs7d",
      Solver.process("omaha-holdem 4s7h7s9cJh 4dJdQh3c QcThAs7d Tc5d2hAc 5hKc7c3s 8sAhQd9d"));
  }

  @Test
  public void test_omaha_holdem_5265_2d3c4c5cJd_9s6dQh7s_7cAc4dJh_Kc8dJs4s_Tc7dQs5s_9c6s3dKd() {
    assertEquals(
      "Tc7dQs5s Kc8dJs4s 9c6s3dKd 9s6dQh7s 7cAc4dJh",
      Solver.process("omaha-holdem 2d3c4c5cJd 9s6dQh7s 7cAc4dJh Kc8dJs4s Tc7dQs5s 9c6s3dKd"));
  }

  @Test
  public void test_omaha_holdem_5266_2c7sAdKsTc_Jh6s6h8s_Qd3c7c9d_As5d7h4s_3sKc6d2h_9sQc2dTs() {
    assertEquals(
      "Jh6s6h8s Qd3c7c9d 9sQc2dTs 3sKc6d2h As5d7h4s",
      Solver.process("omaha-holdem 2c7sAdKsTc Jh6s6h8s Qd3c7c9d As5d7h4s 3sKc6d2h 9sQc2dTs"));
  }

  @Test
  public void test_omaha_holdem_5267_5h7h8dAdKh_Qc2s6cKd_9sTs6s4d_8s3h4h8c_7c5c2h7d() {
    assertEquals(
      "Qc2s6cKd 7c5c2h7d 9sTs6s4d 8s3h4h8c",
      Solver.process("omaha-holdem 5h7h8dAdKh Qc2s6cKd 9sTs6s4d 8s3h4h8c 7c5c2h7d"));
  }

  @Test
  public void test_omaha_holdem_5268_5h8d9sKcTd_6d7h7dTs_7s2h5d2d_9c9h3c3d_JcQd6sQs_6c3s3h4d_AhAc4cTh_Jd5sKhKd_KsQhAd4h_AsTc4s2c() {
    assertEquals(
      "6c3s3h4d 7s2h5d2d AsTc4s2c KsQhAd4h AhAc4cTh 9c9h3c3d Jd5sKhKd 6d7h7dTs JcQd6sQs",
      Solver.process("omaha-holdem 5h8d9sKcTd 6d7h7dTs 7s2h5d2d 9c9h3c3d JcQd6sQs 6c3s3h4d AhAc4cTh Jd5sKhKd KsQhAd4h AsTc4s2c"));
  }

  @Test
  public void test_omaha_holdem_5269_3d7d8dQhTc_6c5c2dTd_Th2c4d3s_7hJsQdKc_3c4c9c8c_Jd2s8s6d() {
    assertEquals(
      "3c4c9c8c Th2c4d3s 7hJsQdKc 6c5c2dTd Jd2s8s6d",
      Solver.process("omaha-holdem 3d7d8dQhTc 6c5c2dTd Th2c4d3s 7hJsQdKc 3c4c9c8c Jd2s8s6d"));
  }

  @Test
  public void test_omaha_holdem_5270_2c3d5dKhQs_7c8c5sQc_Th4c9hJh_4sKdAh8h_8s3sKs5h() {
    assertEquals(
      "Th4c9hJh 7c8c5sQc 8s3sKs5h 4sKdAh8h",
      Solver.process("omaha-holdem 2c3d5dKhQs 7c8c5sQc Th4c9hJh 4sKdAh8h 8s3sKs5h"));
  }

  @Test
  public void test_omaha_holdem_5271_2s6h8dJhTd_Kd3c8s2c_5d5h9s7h_3d9dQd8h_Ks2h4h4s() {
    assertEquals(
      "Ks2h4h4s Kd3c8s2c 5d5h9s7h 3d9dQd8h",
      Solver.process("omaha-holdem 2s6h8dJhTd Kd3c8s2c 5d5h9s7h 3d9dQd8h Ks2h4h4s"));
  }

  @Test
  public void test_omaha_holdem_5272_3d5h7c8s9c_QsKs4d9s_Tc7hAh6h_5cAc8h6s_6c2h6d4h_Js3cJh7d_TsKh5s2c() {
    assertEquals(
      "TsKh5s2c QsKs4d9s Js3cJh7d 6c2h6d4h 5cAc8h6s Tc7hAh6h",
      Solver.process("omaha-holdem 3d5h7c8s9c QsKs4d9s Tc7hAh6h 5cAc8h6s 6c2h6d4h Js3cJh7d TsKh5s2c"));
  }

  @Test
  public void test_omaha_holdem_5273_3c4d7hJdJs_Qd7c7d9h_8dQs4s6s_3s8sAd5h_3hTs2dQc() {
    assertEquals(
      "3hTs2dQc 3s8sAd5h 8dQs4s6s Qd7c7d9h",
      Solver.process("omaha-holdem 3c4d7hJdJs Qd7c7d9h 8dQs4s6s 3s8sAd5h 3hTs2dQc"));
  }

  @Test
  public void test_omaha_holdem_5274_2h3d7s8hAh_7h2sQc2d_Ks6c7cTs_4c6d9d4d_5sJc9sQd_Ad7dQhJh_3s3h8cKd() {
    assertEquals(
      "5sJc9sQd 4c6d9d4d Ks6c7cTs 7h2sQc2d 3s3h8cKd Ad7dQhJh",
      Solver.process("omaha-holdem 2h3d7s8hAh 7h2sQc2d Ks6c7cTs 4c6d9d4d 5sJc9sQd Ad7dQhJh 3s3h8cKd"));
  }

  @Test
  public void test_omaha_holdem_5275_7d7s9hAsTs_Kc4s8sQs_8cJs6dQd_2dJh4c5d_3d4hTdKs_5cTc7c6s_3s3c2s9d() {
    assertEquals(
      "2dJh4c5d 3d4hTdKs 8cJs6dQd 3s3c2s9d Kc4s8sQs 5cTc7c6s",
      Solver.process("omaha-holdem 7d7s9hAsTs Kc4s8sQs 8cJs6dQd 2dJh4c5d 3d4hTdKs 5cTc7c6s 3s3c2s9d"));
  }

  @Test
  public void test_omaha_holdem_5276_3cAhAsKhKs_7dAcJh3h_2cKdQs5h_6dTh8s2d_5d4cQdQh_3dTc9sTd_2s7cJc4h_Jd8h8d2h_7hJs9h5s() {
    assertEquals(
      "6dTh8s2d 2s7cJc4h 7hJs9h5s Jd8h8d2h 3dTc9sTd 5d4cQdQh 2cKdQs5h 7dAcJh3h",
      Solver.process("omaha-holdem 3cAhAsKhKs 7dAcJh3h 2cKdQs5h 6dTh8s2d 5d4cQdQh 3dTc9sTd 2s7cJc4h Jd8h8d2h 7hJs9h5s"));
  }

  @Test
  public void test_omaha_holdem_5277_4d5c6s8hJd_8s7s9cKh_Ad8d4hTc_QhQcAhJc_4sTd7hQd_AsKd6hJs_4cJh5s2d_Th7dKc6d_7c3h3s3c() {
    assertEquals(
      "QhQcAhJc Ad8d4hTc 4cJh5s2d AsKd6hJs 7c3h3s3c 4sTd7hQd=Th7dKc6d 8s7s9cKh",
      Solver.process("omaha-holdem 4d5c6s8hJd 8s7s9cKh Ad8d4hTc QhQcAhJc 4sTd7hQd AsKd6hJs 4cJh5s2d Th7dKc6d 7c3h3s3c"));
  }

  @Test
  public void test_omaha_holdem_5278_4c4s5h8sAd_7c2hKs3c_KhKcQdAs_8d9h9c2d_3d3h9dKd_6h7h3s2c_QhTdTcAc_5cQc6s9s_6dJdJcTh_4dQs7s5d() {
    assertEquals(
      "3d3h9dKd 5cQc6s9s 8d9h9c2d 6dJdJcTh QhTdTcAc KhKcQdAs 7c2hKs3c 6h7h3s2c 4dQs7s5d",
      Solver.process("omaha-holdem 4c4s5h8sAd 7c2hKs3c KhKcQdAs 8d9h9c2d 3d3h9dKd 6h7h3s2c QhTdTcAc 5cQc6s9s 6dJdJcTh 4dQs7s5d"));
  }

  @Test
  public void test_omaha_holdem_5279_4hJsKsQcQh_3h2sJdTc_Ts9s3cAc() {
    assertEquals(
      "3h2sJdTc Ts9s3cAc",
      Solver.process("omaha-holdem 4hJsKsQcQh 3h2sJdTc Ts9s3cAc"));
  }

  @Test
  public void test_omaha_holdem_5280_5d6s7s8dAc_Qd4cQs3h_Tc2s3d8h_8sJc9dJh_6cJsQc4d_Kd7d5s3c_5cAh9s3s() {
    assertEquals(
      "Tc2s3d8h Kd7d5s3c Qd4cQs3h 6cJsQc4d 5cAh9s3s=8sJc9dJh",
      Solver.process("omaha-holdem 5d6s7s8dAc Qd4cQs3h Tc2s3d8h 8sJc9dJh 6cJsQc4d Kd7d5s3c 5cAh9s3s"));
  }

  @Test
  public void test_omaha_holdem_5281_2cAdAhJdKs_8c2d9c7s_6d3d3hKc_Ac8s6cQc_Js4dQhQs() {
    assertEquals(
      "8c2d9c7s Js4dQhQs 6d3d3hKc Ac8s6cQc",
      Solver.process("omaha-holdem 2cAdAhJdKs 8c2d9c7s 6d3d3hKc Ac8s6cQc Js4dQhQs"));
  }

  @Test
  public void test_omaha_holdem_5282_8cAhKcKhTc_4cQdJcAd_5hQc2h5d_4hKs9s7s_4s3hTd6h_4d9hJs7c_Kd2c2s8h_5s3d8sQh() {
    assertEquals(
      "4d9hJs7c 5hQc2h5d 5s3d8sQh 4s3hTd6h 4hKs9s7s 4cQdJcAd Kd2c2s8h",
      Solver.process("omaha-holdem 8cAhKcKhTc 4cQdJcAd 5hQc2h5d 4hKs9s7s 4s3hTd6h 4d9hJs7c Kd2c2s8h 5s3d8sQh"));
  }

  @Test
  public void test_omaha_holdem_5283_2h4s6s8cKc_6d7d2dJd_Kd4cAs3h_8h3d6hQh() {
    assertEquals(
      "6d7d2dJd 8h3d6hQh Kd4cAs3h",
      Solver.process("omaha-holdem 2h4s6s8cKc 6d7d2dJd Kd4cAs3h 8h3d6hQh"));
  }

  @Test
  public void test_omaha_holdem_5284_5c5h7c7sJd_8sTc3cTs_As6dKc2c_5d4h3dQc_8hKh5sQs() {
    assertEquals(
      "As6dKc2c 8sTc3cTs 5d4h3dQc 8hKh5sQs",
      Solver.process("omaha-holdem 5c5h7c7sJd 8sTc3cTs As6dKc2c 5d4h3dQc 8hKh5sQs"));
  }

  @Test
  public void test_omaha_holdem_5285_2d6h9sAdKd_9cJsQd2c_5s6dQc8c_4sJhTs7c_6s7hQs8s_9d9h5d5h() {
    assertEquals(
      "4sJhTs7c 5s6dQc8c=6s7hQs8s 9cJsQd2c 9d9h5d5h",
      Solver.process("omaha-holdem 2d6h9sAdKd 9cJsQd2c 5s6dQc8c 4sJhTs7c 6s7hQs8s 9d9h5d5h"));
  }

  @Test
  public void test_omaha_holdem_5286_3h7sAcJhTs_8hQsKh4s_3sAs8d5d_4hJd4d3d_8c6d5c7d_TcKc6c4c() {
    assertEquals(
      "8c6d5c7d TcKc6c4c 4hJd4d3d 3sAs8d5d 8hQsKh4s",
      Solver.process("omaha-holdem 3h7sAcJhTs 8hQsKh4s 3sAs8d5d 4hJd4d3d 8c6d5c7d TcKc6c4c"));
  }

  @Test
  public void test_omaha_holdem_5287_2d3c6h7dQs_5sJc5h2h_TsKsJh4d() {
    assertEquals(
      "TsKsJh4d 5sJc5h2h",
      Solver.process("omaha-holdem 2d3c6h7dQs 5sJc5h2h TsKsJh4d"));
  }

  @Test
  public void test_omaha_holdem_5288_5c6c7dQdTd_As9h4hAc_Qc3d9s2h_6dJh8c2d() {
    assertEquals(
      "Qc3d9s2h As9h4hAc 6dJh8c2d",
      Solver.process("omaha-holdem 5c6c7dQdTd As9h4hAc Qc3d9s2h 6dJh8c2d"));
  }

  @Test
  public void test_omaha_holdem_5289_2s4c4d5s7c_5h4sKdAs_Js7d3hQc_2hQsTc9c_JhKcTs8s_Jc7s4hQh_6sKsAc2d_AhTh8h2c_Kh9sTdAd() {
    assertEquals(
      "JhKcTs8s Kh9sTdAd 2hQsTc9c 6sKsAc2d=AhTh8h2c Js7d3hQc 5h4sKdAs Jc7s4hQh",
      Solver.process("omaha-holdem 2s4c4d5s7c 5h4sKdAs Js7d3hQc 2hQsTc9c JhKcTs8s Jc7s4hQh 6sKsAc2d AhTh8h2c Kh9sTdAd"));
  }

  @Test
  public void test_omaha_holdem_5290_7c7d7hAdJd_9sKcAcJh_KhThJc3h_2d6hKs8s_QcAhTdQs_7s3c4h6s_8dTs5h6c() {
    assertEquals(
      "8dTs5h6c 2d6hKs8s KhThJc3h 9sKcAcJh QcAhTdQs 7s3c4h6s",
      Solver.process("omaha-holdem 7c7d7hAdJd 9sKcAcJh KhThJc3h 2d6hKs8s QcAhTdQs 7s3c4h6s 8dTs5h6c"));
  }

  @Test
  public void test_omaha_holdem_5291_2d4d5h6sTs_4hAcTd5c_7sKcQc8h_9d2sJhAs_6d3sTcJs_2c5sQd2h() {
    assertEquals(
      "9d2sJhAs 4hAcTd5c 2c5sQd2h 6d3sTcJs 7sKcQc8h",
      Solver.process("omaha-holdem 2d4d5h6sTs 4hAcTd5c 7sKcQc8h 9d2sJhAs 6d3sTcJs 2c5sQd2h"));
  }

  @Test
  public void test_omaha_holdem_5292_3s7hJcKcKd_Ad3h5d2d_4c8c5c4h_9sJhAcAh() {
    assertEquals(
      "Ad3h5d2d 4c8c5c4h 9sJhAcAh",
      Solver.process("omaha-holdem 3s7hJcKcKd Ad3h5d2d 4c8c5c4h 9sJhAcAh"));
  }

  @Test
  public void test_omaha_holdem_5293_5c5d5s9sQh_3c4s8cAc_6s6hTh3s_QsAh4d6c_4c3d7d7h_2c8dQc4h() {
    assertEquals(
      "2c8dQc4h 3c4s8cAc QsAh4d6c 6s6hTh3s 4c3d7d7h",
      Solver.process("omaha-holdem 5c5d5s9sQh 3c4s8cAc 6s6hTh3s QsAh4d6c 4c3d7d7h 2c8dQc4h"));
  }

  @Test
  public void test_omaha_holdem_5294_3c5s6d7hJd_4hJh5d7c_7d4d5cAh_2h9sKs5h_3sQcJsTc_6s4c6hAd_Th9h8s8h_8cKd7sJc() {
    assertEquals(
      "2h9sKs5h 3sQcJsTc 8cKd7sJc 4hJh5d7c=6s4c6hAd=7d4d5cAh Th9h8s8h",
      Solver.process("omaha-holdem 3c5s6d7hJd 4hJh5d7c 7d4d5cAh 2h9sKs5h 3sQcJsTc 6s4c6hAd Th9h8s8h 8cKd7sJc"));
  }

  @Test
  public void test_omaha_holdem_5295_4h9h9sQdQh_7s5h4sKd_Ah2c4d8h_TdThAsJs_Ks3h6cTc() {
    assertEquals(
      "Ks3h6cTc 7s5h4sKd TdThAsJs Ah2c4d8h",
      Solver.process("omaha-holdem 4h9h9sQdQh 7s5h4sKd Ah2c4d8h TdThAsJs Ks3h6cTc"));
  }

  @Test
  public void test_omaha_holdem_5296_3c4d4s6c8h_2d5dAd2c_Qd7d8s4c_Jc9hKdQh_Jh3hTs3s_Ks6s8c7h() {
    assertEquals(
      "Jc9hKdQh Ks6s8c7h 2d5dAd2c Jh3hTs3s Qd7d8s4c",
      Solver.process("omaha-holdem 3c4d4s6c8h 2d5dAd2c Qd7d8s4c Jc9hKdQh Jh3hTs3s Ks6s8c7h"));
  }

  @Test
  public void test_omaha_holdem_5297_4h5s7dAdJh_3s8h5h4d_As6dTd4s_8s8c8dKh_JsQc3d7s_Qh4cTsTc_9s9cThKs_9dQs6sAh_2cAc5d2s() {
    assertEquals(
      "8s8c8dKh 9s9cThKs Qh4cTsTc 9dQs6sAh 3s8h5h4d JsQc3d7s As6dTd4s 2cAc5d2s",
      Solver.process("omaha-holdem 4h5s7dAdJh 3s8h5h4d As6dTd4s 8s8c8dKh JsQc3d7s Qh4cTsTc 9s9cThKs 9dQs6sAh 2cAc5d2s"));
  }

  @Test
  public void test_omaha_holdem_5298_6sJcJhQdTc_9d2s5d9s_Qs5c8h4d_2cTd3s2d_Kc3d3c5h_ThTs9c8c_5s4c2h6d_6h7hKs4h_Ah7sJd8d() {
    assertEquals(
      "Kc3d3c5h 5s4c2h6d 6h7hKs4h 9d2s5d9s 2cTd3s2d Qs5c8h4d Ah7sJd8d ThTs9c8c",
      Solver.process("omaha-holdem 6sJcJhQdTc 9d2s5d9s Qs5c8h4d 2cTd3s2d Kc3d3c5h ThTs9c8c 5s4c2h6d 6h7hKs4h Ah7sJd8d"));
  }

  @Test
  public void test_omaha_holdem_5299_3h4d8dAcQh_KcJdAs5c_Qc4c9cAd_7s9s7c3s_TdTc7h2d() {
    assertEquals(
      "7s9s7c3s TdTc7h2d KcJdAs5c Qc4c9cAd",
      Solver.process("omaha-holdem 3h4d8dAcQh KcJdAs5c Qc4c9cAd 7s9s7c3s TdTc7h2d"));
  }

  @Test
  public void test_omaha_holdem_5300_2c3d3s7c9h_KdAc8cJs_Jc4hQs6d() {
    assertEquals(
      "Jc4hQs6d KdAc8cJs",
      Solver.process("omaha-holdem 2c3d3s7c9h KdAc8cJs Jc4hQs6d"));
  }

  @Test
  public void test_omaha_holdem_5301_6d8dAcQdTh_8s5c5h9h_JhQc9dTs_7hKs4sKh_9s3hJc7c_Kc7dJd8c_2dAs2s2c_Td3c4c7s_Ah6s4d3d_9c3sJsAd() {
    assertEquals(
      "8s5c5h9h Td3c4c7s 7hKs4sKh 2dAs2s2c 9c3sJsAd=9s3hJc7c=JhQc9dTs Ah6s4d3d Kc7dJd8c",
      Solver.process("omaha-holdem 6d8dAcQdTh 8s5c5h9h JhQc9dTs 7hKs4sKh 9s3hJc7c Kc7dJd8c 2dAs2s2c Td3c4c7s Ah6s4d3d 9c3sJsAd"));
  }

  @Test
  public void test_omaha_holdem_5302_2d3dAdJdKd_7s6s2c5s_9dTd9s5d() {
    assertEquals(
      "7s6s2c5s 9dTd9s5d",
      Solver.process("omaha-holdem 2d3dAdJdKd 7s6s2c5s 9dTd9s5d"));
  }

  @Test
  public void test_omaha_holdem_5303_4d4s8dAhQh_7cKc2dQs_9s2sJs9c_3cKsAd6h_Jh3d3h4h_Th8c4cTd_5s7hKdTc_7d9dAs6d_JdKh3s2h() {
    assertEquals(
      "5s7hKdTc JdKh3s2h 9s2sJs9c 7cKc2dQs 7d9dAs6d 3cKsAd6h Jh3d3h4h Th8c4cTd",
      Solver.process("omaha-holdem 4d4s8dAhQh 7cKc2dQs 9s2sJs9c 3cKsAd6h Jh3d3h4h Th8c4cTd 5s7hKdTc 7d9dAs6d JdKh3s2h"));
  }

  @Test
  public void test_omaha_holdem_5304_7s8cAcJsTc_4c6s4sJd_Td3sKcAh_5sQc2sQs() {
    assertEquals(
      "4c6s4sJd 5sQc2sQs Td3sKcAh",
      Solver.process("omaha-holdem 7s8cAcJsTc 4c6s4sJd Td3sKcAh 5sQc2sQs"));
  }

  @Test
  public void test_omaha_holdem_5305_4d4s6c6h8d_3h3sTs9c_9sKsQd2c() {
    assertEquals(
      "9sKsQd2c 3h3sTs9c",
      Solver.process("omaha-holdem 4d4s6c6h8d 3h3sTs9c 9sKsQd2c"));
  }

  @Test
  public void test_omaha_holdem_5306_2d6c6sAhJh_8c8sKh2s_2h3dKs7h_Tc3c9c9h_5s9dJc3h_Td5h4dQh_4c6h4h5d() {
    assertEquals(
      "Td5h4dQh 2h3dKs7h 8c8sKh2s Tc3c9c9h 5s9dJc3h 4c6h4h5d",
      Solver.process("omaha-holdem 2d6c6sAhJh 8c8sKh2s 2h3dKs7h Tc3c9c9h 5s9dJc3h Td5h4dQh 4c6h4h5d"));
  }

  @Test
  public void test_omaha_holdem_5307_5c6cKhKsTh_7sTs5dKc_6sAs2cAh_Qc6dTc3h_4s7c9s2d() {
    assertEquals(
      "4s7c9s2d Qc6dTc3h 6sAs2cAh 7sTs5dKc",
      Solver.process("omaha-holdem 5c6cKhKsTh 7sTs5dKc 6sAs2cAh Qc6dTc3h 4s7c9s2d"));
  }

  @Test
  public void test_omaha_holdem_5308_4s7hAcJhQs_7cQc5d9s_8h6c8dKd_6h7d3sKs_Js3dAdTc_Qd7sKh9h() {
    assertEquals(
      "6h7d3sKs 8h6c8dKd 7cQc5d9s=Qd7sKh9h Js3dAdTc",
      Solver.process("omaha-holdem 4s7hAcJhQs 7cQc5d9s 8h6c8dKd 6h7d3sKs Js3dAdTc Qd7sKh9h"));
  }

  @Test
  public void test_omaha_holdem_5309_9h9sJdKhKs_8sTd7sAs_6cQh8h8d_3cQsJsAd_7c2d5s4c_9d2s4d3d_5cAc7h6s_Kc4s7d2c_2h6dAhTh_8c3h4hQc() {
    assertEquals(
      "7c2d5s4c 8c3h4hQc 5cAc7h6s 2h6dAhTh=8sTd7sAs 6cQh8h8d 3cQsJsAd 9d2s4d3d Kc4s7d2c",
      Solver.process("omaha-holdem 9h9sJdKhKs 8sTd7sAs 6cQh8h8d 3cQsJsAd 7c2d5s4c 9d2s4d3d 5cAc7h6s Kc4s7d2c 2h6dAhTh 8c3h4hQc"));
  }

  @Test
  public void test_omaha_holdem_5310_4c8dJcJdTc_4h7c2sQd_Ts9hTh3d_8s6sKsJs_3c6h5s8c_Kc7h5c2h() {
    assertEquals(
      "4h7c2sQd 3c6h5s8c Kc7h5c2h Ts9hTh3d 8s6sKsJs",
      Solver.process("omaha-holdem 4c8dJcJdTc 4h7c2sQd Ts9hTh3d 8s6sKsJs 3c6h5s8c Kc7h5c2h"));
  }

  @Test
  public void test_omaha_holdem_5311_2d9d9hJcKd_2cTs5h7h_8h2sTh5c_Qh6cQsKc_As9s5dJd_7c3d4h4d_Kh5s3s6d_Qd6s8dJs_6h7d3h8c_Jh4sAcTc() {
    assertEquals(
      "6h7d3h8c 2cTs5h7h=8h2sTh5c Jh4sAcTc Kh5s3s6d Qh6cQsKc 7c3d4h4d Qd6s8dJs As9s5dJd",
      Solver.process("omaha-holdem 2d9d9hJcKd 2cTs5h7h 8h2sTh5c Qh6cQsKc As9s5dJd 7c3d4h4d Kh5s3s6d Qd6s8dJs 6h7d3h8c Jh4sAcTc"));
  }

  @Test
  public void test_omaha_holdem_5312_5h7d9hAhJh_Qs3dAc6h_Qd6c2d4d_Jd6s8hKd_Js7sAs6d_8dQh3s5d_5s7hAdTh() {
    assertEquals(
      "Qd6c2d4d 8dQh3s5d Qs3dAc6h Js7sAs6d Jd6s8hKd 5s7hAdTh",
      Solver.process("omaha-holdem 5h7d9hAhJh Qs3dAc6h Qd6c2d4d Jd6s8hKd Js7sAs6d 8dQh3s5d 5s7hAdTh"));
  }

  @Test
  public void test_omaha_holdem_5313_6h8h9sAhJh_6d8sJdKs_8dQhAc8c_2cAs5s3h_4cQs7cKd_7h9cQcQd_TsTh4d7d_Tc3d3sJc_9h6c5c2h_Kh2sKcTd() {
    assertEquals(
      "4cQs7cKd Tc3d3sJc 7h9cQcQd Kh2sKcTd 2cAs5s3h 6d8sJdKs 8dQhAc8c TsTh4d7d 9h6c5c2h",
      Solver.process("omaha-holdem 6h8h9sAhJh 6d8sJdKs 8dQhAc8c 2cAs5s3h 4cQs7cKd 7h9cQcQd TsTh4d7d Tc3d3sJc 9h6c5c2h Kh2sKcTd"));
  }

  @Test
  public void test_omaha_holdem_5314_4hJdJsKcQh_2s7h6c7c_8cKs5s5d_4sTs9h2d_6hKh9cQc() {
    assertEquals(
      "2s7h6c7c 8cKs5s5d 6hKh9cQc 4sTs9h2d",
      Solver.process("omaha-holdem 4hJdJsKcQh 2s7h6c7c 8cKs5s5d 4sTs9h2d 6hKh9cQc"));
  }

  @Test
  public void test_omaha_holdem_5315_3c3d4dKcKh_Kd5h7sAc_Td8c3hQc_ThTcKs4c_As9s6h2h_8s9d6dTs_Ah7d8dJc() {
    assertEquals(
      "8s9d6dTs As9s6h2h Ah7d8dJc Td8c3hQc Kd5h7sAc ThTcKs4c",
      Solver.process("omaha-holdem 3c3d4dKcKh Kd5h7sAc Td8c3hQc ThTcKs4c As9s6h2h 8s9d6dTs Ah7d8dJc"));
  }

  @Test
  public void test_omaha_holdem_5316_2h5c8dJsQh_4c7hQdJc_7d8s7c4h_KsQs9s6d_5d6cKc8c_KdAs2sJh() {
    assertEquals(
      "7d8s7c4h KsQs9s6d 5d6cKc8c KdAs2sJh 4c7hQdJc",
      Solver.process("omaha-holdem 2h5c8dJsQh 4c7hQdJc 7d8s7c4h KsQs9s6d 5d6cKc8c KdAs2sJh"));
  }

  @Test
  public void test_omaha_holdem_5317_4s5s6d7hJc_6c4c7s9c_Qh2cTsTh_9dTc7d4d_Kc6s8h3h_9hJs2d2h_5h5c3c7c() {
    assertEquals(
      "Qh2cTsTh 9hJs2d2h 9dTc7d4d 6c4c7s9c 5h5c3c7c Kc6s8h3h",
      Solver.process("omaha-holdem 4s5s6d7hJc 6c4c7s9c Qh2cTsTh 9dTc7d4d Kc6s8h3h 9hJs2d2h 5h5c3c7c"));
  }

  @Test
  public void test_omaha_holdem_5318_2s3s5s9cAd_Jh9d7cQd_Qh8c6d5h_2cKc4s4c_6s8s5d7s_5c2hQcAh_QsTs6c7h_9sKs3hKh() {
    assertEquals(
      "Qh8c6d5h Jh9d7cQd 5c2hQcAh 2cKc4s4c 6s8s5d7s QsTs6c7h 9sKs3hKh",
      Solver.process("omaha-holdem 2s3s5s9cAd Jh9d7cQd Qh8c6d5h 2cKc4s4c 6s8s5d7s 5c2hQcAh QsTs6c7h 9sKs3hKh"));
  }

  @Test
  public void test_omaha_holdem_5319_2d9hAsJdKs_4d8s9c6d_Ah5cKcQc_Tc4c7d4s_7sQsKd8c_9d2h3h6c_8d3s7c6s_3dQd3c5d_Ts7h8h5h_ThQh2cJc() {
    assertEquals(
      "8d3s7c6s Ts7h8h5h 3dQd3c5d Tc4c7d4s 4d8s9c6d 7sQsKd8c 9d2h3h6c Ah5cKcQc ThQh2cJc",
      Solver.process("omaha-holdem 2d9hAsJdKs 4d8s9c6d Ah5cKcQc Tc4c7d4s 7sQsKd8c 9d2h3h6c 8d3s7c6s 3dQd3c5d Ts7h8h5h ThQh2cJc"));
  }

  @Test
  public void test_omaha_holdem_5320_4c6h7c7hAd_As5cAh8d_2sKdKsJh_5sQs4hJd_Th3h2dQd_Js7dKc3s_8c3cJcQh_9h9c5d6d_4s9s6s6c() {
    assertEquals(
      "Th3h2dQd 8c3cJcQh 5sQs4hJd 9h9c5d6d 2sKdKsJh Js7dKc3s 4s9s6s6c As5cAh8d",
      Solver.process("omaha-holdem 4c6h7c7hAd As5cAh8d 2sKdKsJh 5sQs4hJd Th3h2dQd Js7dKc3s 8c3cJcQh 9h9c5d6d 4s9s6s6c"));
  }

  @Test
  public void test_omaha_holdem_5321_2hKhKsQhTd_2dJh5d2s_7c9s3cQd() {
    assertEquals(
      "7c9s3cQd 2dJh5d2s",
      Solver.process("omaha-holdem 2hKhKsQhTd 2dJh5d2s 7c9s3cQd"));
  }

  @Test
  public void test_omaha_holdem_5322_3c6cAcQdQs_7s7c9sTd_3sAd2c2d_5d5hAsQh_4h9cJc2s() {
    assertEquals(
      "7s7c9sTd 3sAd2c2d 4h9cJc2s 5d5hAsQh",
      Solver.process("omaha-holdem 3c6cAcQdQs 7s7c9sTd 3sAd2c2d 5d5hAsQh 4h9cJc2s"));
  }

  @Test
  public void test_omaha_holdem_5323_8hAhJdQdTc_7hQs5c4s_8s5d8cJs_Qh9s5sTh_Ks5h9c6d_3sAc6cAs_Td2c2s7d() {
    assertEquals(
      "Td2c2s7d 7hQs5c4s 8s5d8cJs 3sAc6cAs Qh9s5sTh Ks5h9c6d",
      Solver.process("omaha-holdem 8hAhJdQdTc 7hQs5c4s 8s5d8cJs Qh9s5sTh Ks5h9c6d 3sAc6cAs Td2c2s7d"));
  }

  @Test
  public void test_omaha_holdem_5324_2d2s3d5c7h_KcJhQc6s_Ah5hTd4c_Th4hJc9d_3s8d2c7c_3c6cKdAd_4dKh2hQd_8c9s7s6d() {
    assertEquals(
      "Th4hJc9d KcJhQc6s 3c6cKdAd 8c9s7s6d 4dKh2hQd Ah5hTd4c 3s8d2c7c",
      Solver.process("omaha-holdem 2d2s3d5c7h KcJhQc6s Ah5hTd4c Th4hJc9d 3s8d2c7c 3c6cKdAd 4dKh2hQd 8c9s7s6d"));
  }

  @Test
  public void test_omaha_holdem_5325_3d4d4s7cJc_TcKc5cQh_Td3h2c3s_7h5hJsKh_6c6dQc5s_6hJhAsQd() {
    assertEquals(
      "TcKc5cQh 6hJhAsQd 7h5hJsKh 6c6dQc5s Td3h2c3s",
      Solver.process("omaha-holdem 3d4d4s7cJc TcKc5cQh Td3h2c3s 7h5hJsKh 6c6dQc5s 6hJhAsQd"));
  }

  @Test
  public void test_omaha_holdem_5326_6s9hJcJdKh_3d6cQs2c_8h8s5cKd_4c6hTd6d_Ah5dQdQh() {
    assertEquals(
      "3d6cQs2c Ah5dQdQh 8h8s5cKd 4c6hTd6d",
      Solver.process("omaha-holdem 6s9hJcJdKh 3d6cQs2c 8h8s5cKd 4c6hTd6d Ah5dQdQh"));
  }

  @Test
  public void test_omaha_holdem_5327_2h4h7h9hAc_QsJs5cTd_Ks8dKcAs_4d7c7d9d_Tc6c6dTh() {
    assertEquals(
      "QsJs5cTd Tc6c6dTh Ks8dKcAs 4d7c7d9d",
      Solver.process("omaha-holdem 2h4h7h9hAc QsJs5cTd Ks8dKcAs 4d7c7d9d Tc6c6dTh"));
  }

  @Test
  public void test_omaha_holdem_5328_2c3c3d3h6c_6d4h5c4c_JsKsTd9c_Qd6h2dAh_Tc8hQh4s_QcKd3s7d_6sKcAs9h() {
    assertEquals(
      "Tc8hQh4s JsKsTd9c Qd6h2dAh 6sKcAs9h QcKd3s7d 6d4h5c4c",
      Solver.process("omaha-holdem 2c3c3d3h6c 6d4h5c4c JsKsTd9c Qd6h2dAh Tc8hQh4s QcKd3s7d 6sKcAs9h"));
  }

  @Test
  public void test_omaha_holdem_5329_3s5s7d9d9s_Kh2s5dQc_4c3h8cJh_6d3c4dQd_Kd8hKcTd_ThAsJd2h() {
    assertEquals(
      "ThAsJd2h 4c3h8cJh Kh2s5dQc Kd8hKcTd 6d3c4dQd",
      Solver.process("omaha-holdem 3s5s7d9d9s Kh2s5dQc 4c3h8cJh 6d3c4dQd Kd8hKcTd ThAsJd2h"));
  }

  @Test
  public void test_omaha_holdem_5330_2h5hAcJcTs_3sJh7d9d_5d3hKcQd_4h8c6d4s() {
    assertEquals(
      "4h8c6d4s 3sJh7d9d 5d3hKcQd",
      Solver.process("omaha-holdem 2h5hAcJcTs 3sJh7d9d 5d3hKcQd 4h8c6d4s"));
  }

  @Test
  public void test_omaha_holdem_5331_7s8s9sAcAs_2c8c6d9h_3sKh8dJh_3hAhQd3d_Qs2d7d5d_JsTc9cTh_Kc5c7cAd_4h7h4c2s() {
    assertEquals(
      "4h7h4c2s Qs2d7d5d 3sKh8dJh 2c8c6d9h 3hAhQd3d JsTc9cTh Kc5c7cAd",
      Solver.process("omaha-holdem 7s8s9sAcAs 2c8c6d9h 3sKh8dJh 3hAhQd3d Qs2d7d5d JsTc9cTh Kc5c7cAd 4h7h4c2s"));
  }

  @Test
  public void test_omaha_holdem_5332_2d9dJsKhQd_4h8h5d6d_8c2c4cTs_9cQhJhKs_3c5cAs7c_3d7s3h2s() {
    assertEquals(
      "3c5cAs7c 3d7s3h2s 9cQhJhKs 8c2c4cTs 4h8h5d6d",
      Solver.process("omaha-holdem 2d9dJsKhQd 4h8h5d6d 8c2c4cTs 9cQhJhKs 3c5cAs7c 3d7s3h2s"));
  }

  @Test
  public void test_omaha_holdem_5333_7h8c9cJsKs_AhQh4s2h_Jh6s6h8d_QcTd9d3d_3h6c8s3s_AsTs8h4d_5hAd9hKd() {
    assertEquals(
      "AhQh4s2h 3h6c8s3s Jh6s6h8d 5hAd9hKd AsTs8h4d QcTd9d3d",
      Solver.process("omaha-holdem 7h8c9cJsKs AhQh4s2h Jh6s6h8d QcTd9d3d 3h6c8s3s AsTs8h4d 5hAd9hKd"));
  }

  @Test
  public void test_omaha_holdem_5334_4d8c8dJdTs_2s6s4h7c_5d5cQc7s_6c7hQdJs_3d6h2h2d() {
    assertEquals(
      "2s6s4h7c 5d5cQc7s 6c7hQdJs 3d6h2h2d",
      Solver.process("omaha-holdem 4d8c8dJdTs 2s6s4h7c 5d5cQc7s 6c7hQdJs 3d6h2h2d"));
  }

  @Test
  public void test_omaha_holdem_5335_2s3c8hKdQh_6dAcKh7d_Ad8sAsKc_6cQcJh3s_4hJcTh8c_TsAh6sQs_4s2h8d4d_7s5c2d7c_JdTd4c5h() {
    assertEquals(
      "JdTd4c5h 7s5c2d7c 4hJcTh8c TsAh6sQs 6dAcKh7d 4s2h8d4d 6cQcJh3s Ad8sAsKc",
      Solver.process("omaha-holdem 2s3c8hKdQh 6dAcKh7d Ad8sAsKc 6cQcJh3s 4hJcTh8c TsAh6sQs 4s2h8d4d 7s5c2d7c JdTd4c5h"));
  }

  @Test
  public void test_omaha_holdem_5336_3d5s7h9cAd_2c7s8hTc_6hAhQhQd_8c4hQs3h_Qc6sJs3c_9h6d2s4c_JcKdJh5d_4sKh2d9d_Td5hKs9s() {
    assertEquals(
      "8c4hQs3h=Qc6sJs3c 2c7s8hTc JcKdJh5d 6hAhQhQd Td5hKs9s 4sKh2d9d 9h6d2s4c",
      Solver.process("omaha-holdem 3d5s7h9cAd 2c7s8hTc 6hAhQhQd 8c4hQs3h Qc6sJs3c 9h6d2s4c JcKdJh5d 4sKh2d9d Td5hKs9s"));
  }

  @Test
  public void test_omaha_holdem_5337_2c3c4dQdQh_9hKc3s4c_7h2d7d5c_8sJs6hJh_KhAd7c8h_ThTd9s3h_5h8d9c6c_QcAs4h5s() {
    assertEquals(
      "KhAd7c8h 9hKc3s4c 7h2d7d5c ThTd9s3h 8sJs6hJh 5h8d9c6c QcAs4h5s",
      Solver.process("omaha-holdem 2c3c4dQdQh 9hKc3s4c 7h2d7d5c 8sJs6hJh KhAd7c8h ThTd9s3h 5h8d9c6c QcAs4h5s"));
  }

  @Test
  public void test_omaha_holdem_5338_4d8s9cJcJh_Ad5d8c6h_3d2d4s6c_6dQs4hTd_2sTsJd8h() {
    assertEquals(
      "3d2d4s6c Ad5d8c6h 6dQs4hTd 2sTsJd8h",
      Solver.process("omaha-holdem 4d8s9cJcJh Ad5d8c6h 3d2d4s6c 6dQs4hTd 2sTsJd8h"));
  }

  @Test
  public void test_omaha_holdem_5339_4c4s5s7cJs_3c2s3h6s_9cQsQhKc_AhTc8s5c_QcAd4dKs_9h8hJd3s() {
    assertEquals(
      "AhTc8s5c 9h8hJd3s 9cQsQhKc QcAd4dKs 3c2s3h6s",
      Solver.process("omaha-holdem 4c4s5s7cJs 3c2s3h6s 9cQsQhKc AhTc8s5c QcAd4dKs 9h8hJd3s"));
  }

  @Test
  public void test_omaha_holdem_5340_4c5s6c7dQc_ThAdQs3c_9c8hKc4s() {
    assertEquals(
      "ThAdQs3c 9c8hKc4s",
      Solver.process("omaha-holdem 4c5s6c7dQc ThAdQs3c 9c8hKc4s"));
  }

  @Test
  public void test_omaha_holdem_5341_2c2s4s5h9d_4d9h2h2d_9s3cQh6h_Jd6c6dTd_4c5d7cAd_5c5s3d4h_Tc7hKcQc() {
    assertEquals(
      "Tc7hKcQc 4c5d7cAd Jd6c6dTd 9s3cQh6h 5c5s3d4h 4d9h2h2d",
      Solver.process("omaha-holdem 2c2s4s5h9d 4d9h2h2d 9s3cQh6h Jd6c6dTd 4c5d7cAd 5c5s3d4h Tc7hKcQc"));
  }

  @Test
  public void test_omaha_holdem_5342_4c5s6cAhTs_Kh4h3h7c_6h6s8d5d() {
    assertEquals(
      "6h6s8d5d Kh4h3h7c",
      Solver.process("omaha-holdem 4c5s6cAhTs Kh4h3h7c 6h6s8d5d"));
  }

  @Test
  public void test_omaha_holdem_5343_2c2h8c9cKc_JsKd7dJd_7c4sKh2s_5d4h4c8h() {
    assertEquals(
      "5d4h4c8h JsKd7dJd 7c4sKh2s",
      Solver.process("omaha-holdem 2c2h8c9cKc JsKd7dJd 7c4sKh2s 5d4h4c8h"));
  }

  @Test
  public void test_omaha_holdem_5344_2d4s6d7hJd_5cJc4h3c_Kd7d3sQh_Kh4c6h7c_5h8cJhQd_2cAh5dTd_Qc9hAsKc_6c8d8h9s_9cAd4d6s_Qs8sJs3d() {
    assertEquals(
      "Qc9hAsKc 6c8d8h9s Qs8sJs3d Kh4c6h7c 5cJc4h3c 5h8cJhQd 2cAh5dTd Kd7d3sQh 9cAd4d6s",
      Solver.process("omaha-holdem 2d4s6d7hJd 5cJc4h3c Kd7d3sQh Kh4c6h7c 5h8cJhQd 2cAh5dTd Qc9hAsKc 6c8d8h9s 9cAd4d6s Qs8sJs3d"));
  }

  @Test
  public void test_omaha_holdem_5345_2h6c6h7dJd_9c8c5sAh_QdJhKd5c_AsQh2d6s_TsJs4h4d_Th6d2c2s_3sAd5dQc_KsQs8d8h_TdAc5hTc() {
    assertEquals(
      "9c8c5sAh 3sAd5dQc KsQs8d8h TdAc5hTc TsJs4h4d QdJhKd5c AsQh2d6s=Th6d2c2s",
      Solver.process("omaha-holdem 2h6c6h7dJd 9c8c5sAh QdJhKd5c AsQh2d6s TsJs4h4d Th6d2c2s 3sAd5dQc KsQs8d8h TdAc5hTc"));
  }

  @Test
  public void test_omaha_holdem_5346_4c4h7c8cJs_6sJc9d6h_Ad2s5dKh_3s5h8s4s_9s3dAhKs_JhJd7h8d_8hQsAsAc() {
    assertEquals(
      "9s3dAhKs=Ad2s5dKh 6sJc9d6h 8hQsAsAc 3s5h8s4s JhJd7h8d",
      Solver.process("omaha-holdem 4c4h7c8cJs 6sJc9d6h Ad2s5dKh 3s5h8s4s 9s3dAhKs JhJd7h8d 8hQsAsAc"));
  }

  @Test
  public void test_omaha_holdem_5347_3s5d5h6dKc_Qs8s9c9d_8dAdThQd_Jc3hAc7s_5sTs4c4h() {
    assertEquals(
      "8dAdThQd Jc3hAc7s Qs8s9c9d 5sTs4c4h",
      Solver.process("omaha-holdem 3s5d5h6dKc Qs8s9c9d 8dAdThQd Jc3hAc7s 5sTs4c4h"));
  }

  @Test
  public void test_omaha_holdem_5348_2d9dAsKcTc_3d7c5s6c_Js2h7s7h_5h7dAc5c_Ah6s2c8d_Jc9s3h3c_Kh4sJd8h_QcTh9c9h() {
    assertEquals(
      "3d7c5s6c Js2h7s7h Jc9s3h3c Kh4sJd8h 5h7dAc5c Ah6s2c8d QcTh9c9h",
      Solver.process("omaha-holdem 2d9dAsKcTc 3d7c5s6c Js2h7s7h 5h7dAc5c Ah6s2c8d Jc9s3h3c Kh4sJd8h QcTh9c9h"));
  }

  @Test
  public void test_omaha_holdem_5349_6cAcAhJdKh_8sTcQd8h_4dQh2s7c_Qs8d3h7s() {
    assertEquals(
      "4dQh2s7c Qs8d3h7s 8sTcQd8h",
      Solver.process("omaha-holdem 6cAcAhJdKh 8sTcQd8h 4dQh2s7c Qs8d3h7s"));
  }

  @Test
  public void test_omaha_holdem_5350_4c4h5dJdQc_AdQdTsKh_2hQh6s6c_8sTh9cTc_3hKd4d6d_8hTdAh7d_5h6h8d3c_8cJcJs7s_4sKc5sQs() {
    assertEquals(
      "8hTdAh7d 5h6h8d3c 8sTh9cTc 2hQh6s6c AdQdTsKh 3hKd4d6d 4sKc5sQs 8cJcJs7s",
      Solver.process("omaha-holdem 4c4h5dJdQc AdQdTsKh 2hQh6s6c 8sTh9cTc 3hKd4d6d 8hTdAh7d 5h6h8d3c 8cJcJs7s 4sKc5sQs"));
  }

  @Test
  public void test_omaha_holdem_5351_2s3h5hJcQc_7sQd5c2d_6c3dAs4s_Jd9d4hKd_Js6h6sAc_5sQs9s3s_7c8sTh2c_4d8d2hQh() {
    assertEquals(
      "7c8sTh2c Jd9d4hKd Js6h6sAc 4d8d2hQh 5sQs9s3s=7sQd5c2d 6c3dAs4s",
      Solver.process("omaha-holdem 2s3h5hJcQc 7sQd5c2d 6c3dAs4s Jd9d4hKd Js6h6sAc 5sQs9s3s 7c8sTh2c 4d8d2hQh"));
  }

  @Test
  public void test_omaha_holdem_5352_2h6h8cAcJd_2s7c3dJh_5d2cQsQd() {
    assertEquals(
      "5d2cQsQd 2s7c3dJh",
      Solver.process("omaha-holdem 2h6h8cAcJd 2s7c3dJh 5d2cQsQd"));
  }

  @Test
  public void test_omaha_holdem_5353_6d6sKdKhKs_Jh7h4s2d_9hJs8s2s_QdThJc9c_3hJd2cAc_Qh3s4dTd_8cAh4c3c_8d9d5d9s() {
    assertEquals(
      "Jh7h4s2d 9hJs8s2s Qh3s4dTd QdThJc9c 8cAh4c3c 3hJd2cAc 8d9d5d9s",
      Solver.process("omaha-holdem 6d6sKdKhKs Jh7h4s2d 9hJs8s2s QdThJc9c 3hJd2cAc Qh3s4dTd 8cAh4c3c 8d9d5d9s"));
  }

  @Test
  public void test_omaha_holdem_5354_6d9hAcJsQd_9cTh6c8d_KhQs3d2c_2hTs4c3h() {
    assertEquals(
      "2hTs4c3h KhQs3d2c 9cTh6c8d",
      Solver.process("omaha-holdem 6d9hAcJsQd 9cTh6c8d KhQs3d2c 2hTs4c3h"));
  }

  @Test
  public void test_omaha_holdem_5355_3d5h6d9hJd_4h7hJsQs_3h2dAcQc_2sJc6c8s_4cKcAs2c_3s7sKh7d_8h8d4dQd_AhTdTh4s() {
    assertEquals(
      "3h2dAcQc 3s7sKh7d AhTdTh4s 2sJc6c8s 4cKcAs2c 4h7hJsQs 8h8d4dQd",
      Solver.process("omaha-holdem 3d5h6d9hJd 4h7hJsQs 3h2dAcQc 2sJc6c8s 4cKcAs2c 3s7sKh7d 8h8d4dQd AhTdTh4s"));
  }

  @Test
  public void test_omaha_holdem_5356_2d3d4sAhJs_6hJdTs9s_JcThKh6d_7h7c4c3s() {
    assertEquals(
      "6hJdTs9s JcThKh6d 7h7c4c3s",
      Solver.process("omaha-holdem 2d3d4sAhJs 6hJdTs9s JcThKh6d 7h7c4c3s"));
  }

  @Test
  public void test_omaha_holdem_5357_2c2d7sAdQc_7dKdJhJc_3h4s8hTs_Qh3sQsTd_9c5cQd3d_6h2h2sJd_Ac6s4dKc() {
    assertEquals(
      "3h4s8hTs 7dKdJhJc 9c5cQd3d Ac6s4dKc Qh3sQsTd 6h2h2sJd",
      Solver.process("omaha-holdem 2c2d7sAdQc 7dKdJhJc 3h4s8hTs Qh3sQsTd 9c5cQd3d 6h2h2sJd Ac6s4dKc"));
  }

  @Test
  public void test_omaha_holdem_5358_2h2s5sJhQh_Ks3s3cTh_5hAc9c8d_As6sQs6h() {
    assertEquals(
      "Ks3s3cTh 5hAc9c8d As6sQs6h",
      Solver.process("omaha-holdem 2h2s5sJhQh Ks3s3cTh 5hAc9c8d As6sQs6h"));
  }

  @Test
  public void test_omaha_holdem_5359_5s6h8cAcJh_9c9h7hQh_5c8s7c2d_Tc4s3cTd_5d3h6c7d() {
    assertEquals(
      "Tc4s3cTd 5d3h6c7d 5c8s7c2d 9c9h7hQh",
      Solver.process("omaha-holdem 5s6h8cAcJh 9c9h7hQh 5c8s7c2d Tc4s3cTd 5d3h6c7d"));
  }

  @Test
  public void test_omaha_holdem_5360_2s7d7s8dAd_2c5hTc5c_9c6dTd3d_6h5d7hQd_4hQc9dAh_Qs4cKcTh_8cKdJc3h_3cJhQh3s() {
    assertEquals(
      "Qs4cKcTh 3cJhQh3s 2c5hTc5c 8cKdJc3h 4hQc9dAh 9c6dTd3d 6h5d7hQd",
      Solver.process("omaha-holdem 2s7d7s8dAd 2c5hTc5c 9c6dTd3d 6h5d7hQd 4hQc9dAh Qs4cKcTh 8cKdJc3h 3cJhQh3s"));
  }

  @Test
  public void test_omaha_holdem_5361_3d3s5h6d7h_4h5d4dAs_JhJsAc6h_QcJdKc7c_3hKs7s6c_5s2hTdTh() {
    assertEquals(
      "QcJdKc7c 5s2hTdTh JhJsAc6h 4h5d4dAs 3hKs7s6c",
      Solver.process("omaha-holdem 3d3s5h6d7h 4h5d4dAs JhJsAc6h QcJdKc7c 3hKs7s6c 5s2hTdTh"));
  }

  @Test
  public void test_omaha_holdem_5362_2d7hJsKdTd_Qd3cJcKh_8c3h7c2c_Ah9hKs4c_Ts5h6h8s_5cJh6sQh_3s5s2s6c_Tc3d4sQs_Th8dAc9d() {
    assertEquals(
      "3s5s2s6c Ts5h6h8s Tc3d4sQs 5cJh6sQh Ah9hKs4c 8c3h7c2c Qd3cJcKh Th8dAc9d",
      Solver.process("omaha-holdem 2d7hJsKdTd Qd3cJcKh 8c3h7c2c Ah9hKs4c Ts5h6h8s 5cJh6sQh 3s5s2s6c Tc3d4sQs Th8dAc9d"));
  }

  @Test
  public void test_omaha_holdem_5363_3d7c7hKcKs_Qc5d4c8h_5hQd9hJc_2dQh2cKh_2hKdJs4d_7sTcJd6s_9d6h7d4h_3h9cAsQs_Td4s5s8s() {
    assertEquals(
      "Td4s5s8s Qc5d4c8h 5hQd9hJc 3h9cAsQs 9d6h7d4h 7sTcJd6s 2hKdJs4d 2dQh2cKh",
      Solver.process("omaha-holdem 3d7c7hKcKs Qc5d4c8h 5hQd9hJc 2dQh2cKh 2hKdJs4d 7sTcJd6s 9d6h7d4h 3h9cAsQs Td4s5s8s"));
  }

  @Test
  public void test_omaha_holdem_5364_3c7s9hJcTd_AhKdTsJs_6cAs8s7h_5d9c6h7c() {
    assertEquals(
      "5d9c6h7c AhKdTsJs 6cAs8s7h",
      Solver.process("omaha-holdem 3c7s9hJcTd AhKdTsJs 6cAs8s7h 5d9c6h7c"));
  }

  @Test
  public void test_omaha_holdem_5365_6c6h7d8dTh_Qd3dJhAs_Ks8hQc3h_4hAc5h7h_2c8s2hQh_9h5dJdAd() {
    assertEquals(
      "Qd3dJhAs 2c8s2hQh Ks8hQc3h 4hAc5h7h 9h5dJdAd",
      Solver.process("omaha-holdem 6c6h7d8dTh Qd3dJhAs Ks8hQc3h 4hAc5h7h 2c8s2hQh 9h5dJdAd"));
  }

  @Test
  public void test_omaha_holdem_5366_3s7s9dAcQc_4dQsJcTs_5hKsQh4c_Kd8d4sTh_AdKh7c9c_8h5c8s2h_6c3d9sTd_Ah7d2d2c_9hJs6s5s_6h3h4hTc() {
    assertEquals(
      "Kd8d4sTh 6h3h4hTc 8h5c8s2h 9hJs6s5s 4dQsJcTs 5hKsQh4c 6c3d9sTd Ah7d2d2c AdKh7c9c",
      Solver.process("omaha-holdem 3s7s9dAcQc 4dQsJcTs 5hKsQh4c Kd8d4sTh AdKh7c9c 8h5c8s2h 6c3d9sTd Ah7d2d2c 9hJs6s5s 6h3h4hTc"));
  }

  @Test
  public void test_omaha_holdem_5367_5s7c7sKdQc_QhAh5h7h_6d2dTd2c() {
    assertEquals(
      "6d2dTd2c QhAh5h7h",
      Solver.process("omaha-holdem 5s7c7sKdQc QhAh5h7h 6d2dTd2c"));
  }

  @Test
  public void test_omaha_holdem_5368_2s8sAsKdQh_9d7s3c6h_Td5c7hAc_Qs2h4d8d_9s5s7d6d_JhAhTh5d_3hQcTsKh_8cJs2d5h_Qd9h2cAd_4sJd7c4c() {
    assertEquals(
      "9d7s3c6h 4sJd7c4c Td5c7hAc 8cJs2d5h Qs2h4d8d 3hQcTsKh Qd9h2cAd JhAhTh5d 9s5s7d6d",
      Solver.process("omaha-holdem 2s8sAsKdQh 9d7s3c6h Td5c7hAc Qs2h4d8d 9s5s7d6d JhAhTh5d 3hQcTsKh 8cJs2d5h Qd9h2cAd 4sJd7c4c"));
  }

  @Test
  public void test_omaha_holdem_5369_4c4d9sJhTs_QsQhKd9h_7s3d3hAh_Td7h5cKh_7d2c3c5s_2sAc8c6c_7cJsQcJc_3s2dJd8h_Th9d4s5h_9cAd6d8s() {
    assertEquals(
      "7d2c3c5s 2sAc8c6c 7s3d3hAh 9cAd6d8s Td7h5cKh 3s2dJd8h QsQhKd9h Th9d4s5h 7cJsQcJc",
      Solver.process("omaha-holdem 4c4d9sJhTs QsQhKd9h 7s3d3hAh Td7h5cKh 7d2c3c5s 2sAc8c6c 7cJsQcJc 3s2dJd8h Th9d4s5h 9cAd6d8s"));
  }

  @Test
  public void test_omaha_holdem_5370_3h4c4d6hKs_Jh8s6s6d_JdTd6cTh_7h9c2c4s_TsQs9sKc_Ah5s3s7c() {
    assertEquals(
      "JdTd6cTh TsQs9sKc 7h9c2c4s Ah5s3s7c Jh8s6s6d",
      Solver.process("omaha-holdem 3h4c4d6hKs Jh8s6s6d JdTd6cTh 7h9c2c4s TsQs9sKc Ah5s3s7c"));
  }

  @Test
  public void test_omaha_holdem_5371_4c8c9cAhQc_2cJhKdJd_3c3sKhAc_2s7dTs8d_9s8s6sQs() {
    assertEquals(
      "2s7dTs8d 2cJhKdJd 9s8s6sQs 3c3sKhAc",
      Solver.process("omaha-holdem 4c8c9cAhQc 2cJhKdJd 3c3sKhAc 2s7dTs8d 9s8s6sQs"));
  }

  @Test
  public void test_omaha_holdem_5372_3s5h6d8cTs_9cAhJhKs_Js3d4h2h_9sQsQc2d_As7h3h3c_4sJd7d4c_7c5s8hTh_QhKhKd6c() {
    assertEquals(
      "9cAhJhKs 9sQsQc2d QhKhKd6c 7c5s8hTh As7h3h3c Js3d4h2h 4sJd7d4c",
      Solver.process("omaha-holdem 3s5h6d8cTs 9cAhJhKs Js3d4h2h 9sQsQc2d As7h3h3c 4sJd7d4c 7c5s8hTh QhKhKd6c"));
  }

  @Test
  public void test_omaha_holdem_5373_3s4c6hJdQs_TdKs2c9h_AcJs6s4h_7d8d5h8h_6dAd3h3c_QhJh7c7h_9dAs5dTc_8sKc2hKh_5c3dTh8c() {
    assertEquals(
      "TdKs2c9h 9dAs5dTc 5c3dTh8c 8sKc2hKh AcJs6s4h QhJh7c7h 6dAd3h3c 7d8d5h8h",
      Solver.process("omaha-holdem 3s4c6hJdQs TdKs2c9h AcJs6s4h 7d8d5h8h 6dAd3h3c QhJh7c7h 9dAs5dTc 8sKc2hKh 5c3dTh8c"));
  }

  @Test
  public void test_omaha_holdem_5374_5h6hAsJdKd_7c6c4s6d_Ad6s8c3c_QsJc8s3h_TcQh4d2h() {
    assertEquals(
      "QsJc8s3h Ad6s8c3c 7c6c4s6d TcQh4d2h",
      Solver.process("omaha-holdem 5h6hAsJdKd 7c6c4s6d Ad6s8c3c QsJc8s3h TcQh4d2h"));
  }

  @Test
  public void test_omaha_holdem_5375_3h5s7s9dJs_Qd3c5cAc_3dThJd4c_Ah7c9h3s_Qh6cJc8c_6dQsTdKc_5hKh6s4h_8dTs4dJh_2d6hAdAs() {
    assertEquals(
      "6dQsTdKc 2d6hAdAs Qd3c5cAc Ah7c9h3s 3dThJd4c 5hKh6s4h Qh6cJc8c 8dTs4dJh",
      Solver.process("omaha-holdem 3h5s7s9dJs Qd3c5cAc 3dThJd4c Ah7c9h3s Qh6cJc8c 6dQsTdKc 5hKh6s4h 8dTs4dJh 2d6hAdAs"));
  }

  @Test
  public void test_omaha_holdem_5376_2s6h6s8dAs_9cTs8h8c_Th4h2h3c_Jh3d5cTc_9d9h7dAd_4dQdAhJs() {
    assertEquals(
      "Jh3d5cTc Th4h2h3c 9d9h7dAd 4dQdAhJs 9cTs8h8c",
      Solver.process("omaha-holdem 2s6h6s8dAs 9cTs8h8c Th4h2h3c Jh3d5cTc 9d9h7dAd 4dQdAhJs"));
  }

  @Test
  public void test_omaha_holdem_5377_4c4s7cAcQd_QcAs6h6c_9h2s7h5h_8s2d7d4h_Jh3d9cTs() {
    assertEquals(
      "Jh3d9cTs 9h2s7h5h QcAs6h6c 8s2d7d4h",
      Solver.process("omaha-holdem 4c4s7cAcQd QcAs6h6c 9h2s7h5h 8s2d7d4h Jh3d9cTs"));
  }

  @Test
  public void test_omaha_holdem_5378_3s4s5h8cQs_8h2s9hKs_TsQd2d9s_7d9cTdQh_8s6hTh7h() {
    assertEquals(
      "7d9cTdQh 8s6hTh7h TsQd2d9s 8h2s9hKs",
      Solver.process("omaha-holdem 3s4s5h8cQs 8h2s9hKs TsQd2d9s 7d9cTdQh 8s6hTh7h"));
  }

  @Test
  public void test_omaha_holdem_5379_6h7h9sAhTd_2sJcQh3h_3sTh8c5h_Jh9cQd3d_2d7s9hKh_6d2c8hJd() {
    assertEquals(
      "Jh9cQd3d 6d2c8hJd 3sTh8c5h 2sJcQh3h 2d7s9hKh",
      Solver.process("omaha-holdem 6h7h9sAhTd 2sJcQh3h 3sTh8c5h Jh9cQd3d 2d7s9hKh 6d2c8hJd"));
  }

  @Test
  public void test_omaha_holdem_5380_4c5c6cJsTs_AdAh9sKc_QdJhKd3c_5d6sAs3h_3sQc7h5h_Jc4sQs9c() {
    assertEquals(
      "QdJhKd3c AdAh9sKc 5d6sAs3h 3sQc7h5h Jc4sQs9c",
      Solver.process("omaha-holdem 4c5c6cJsTs AdAh9sKc QdJhKd3c 5d6sAs3h 3sQc7h5h Jc4sQs9c"));
  }

  @Test
  public void test_omaha_holdem_5381_8c8d9hJcTs_8h6sThQh_Qd3h5cQc_9s3cJsKh_9dAc4d4s_TdKsJh7d_3d7c7h2d() {
    assertEquals(
      "3d7c7h2d 9dAc4d4s 9s3cJsKh Qd3h5cQc TdKsJh7d 8h6sThQh",
      Solver.process("omaha-holdem 8c8d9hJcTs 8h6sThQh Qd3h5cQc 9s3cJsKh 9dAc4d4s TdKsJh7d 3d7c7h2d"));
  }

  @Test
  public void test_omaha_holdem_5382_3c3d4d6hAh_8c2d8h4s_QdAcKhJs_QcKd7hQs_4c5d2hJd_Jh5c9c3s() {
    assertEquals(
      "8c2d8h4s QcKd7hQs QdAcKhJs Jh5c9c3s 4c5d2hJd",
      Solver.process("omaha-holdem 3c3d4d6hAh 8c2d8h4s QdAcKhJs QcKd7hQs 4c5d2hJd Jh5c9c3s"));
  }

  @Test
  public void test_omaha_holdem_5383_2h8d9hQcTd_8h5d7hJd_QhJh2d4h_4dTs4s3s_9d5sTc9s_2c3hJc6s_5h7sAs5c_3d7c8cKh() {
    assertEquals(
      "2c3hJc6s 5h7sAs5c 3d7c8cKh 4dTs4s3s 9d5sTc9s 8h5d7hJd=QhJh2d4h",
      Solver.process("omaha-holdem 2h8d9hQcTd 8h5d7hJd QhJh2d4h 4dTs4s3s 9d5sTc9s 2c3hJc6s 5h7sAs5c 3d7c8cKh"));
  }

  @Test
  public void test_omaha_holdem_5384_3s5s6hKsTh_Kh6s7h4s_Kc8cQh3c_Qc7d7s4d_9hJhAsAh_Js6c5h3h_JcKd7c9s_Ac6d8hTc_8d8s4cTd() {
    assertEquals(
      "8d8s4cTd JcKd7c9s 9hJhAsAh Js6c5h3h Ac6d8hTc Kc8cQh3c Qc7d7s4d Kh6s7h4s",
      Solver.process("omaha-holdem 3s5s6hKsTh Kh6s7h4s Kc8cQh3c Qc7d7s4d 9hJhAsAh Js6c5h3h JcKd7c9s Ac6d8hTc 8d8s4cTd"));
  }

  @Test
  public void test_omaha_holdem_5385_2s5h7c8sAd_8hQsJd7d_4d2cTs4h_QdJs5s3c_8d2dAc5c_TcQc7sKh() {
    assertEquals(
      "4d2cTs4h QdJs5s3c TcQc7sKh 8hQsJd7d 8d2dAc5c",
      Solver.process("omaha-holdem 2s5h7c8sAd 8hQsJd7d 4d2cTs4h QdJs5s3c 8d2dAc5c TcQc7sKh"));
  }

  @Test
  public void test_omaha_holdem_5386_4d7d7sAsQd_QhQc5cAc_Jd7c6d5d() {
    assertEquals(
      "Jd7c6d5d QhQc5cAc",
      Solver.process("omaha-holdem 4d7d7sAsQd QhQc5cAc Jd7c6d5d"));
  }

  @Test
  public void test_omaha_holdem_5387_2h8sKcKhQh_KsTc2s4s_TsAh2d5s_JcAsKd6s_Qd6dTd3d_9d5c8d4h_7sQsJd3c_Ad2c3s3h_9hJhTh8c_7d4c7hQc() {
    assertEquals(
      "TsAh2d5s Ad2c3s3h 9d5c8d4h 7d4c7hQc Qd6dTd3d 7sQsJd3c JcAsKd6s 9hJhTh8c KsTc2s4s",
      Solver.process("omaha-holdem 2h8sKcKhQh KsTc2s4s TsAh2d5s JcAsKd6s Qd6dTd3d 9d5c8d4h 7sQsJd3c Ad2c3s3h 9hJhTh8c 7d4c7hQc"));
  }

  @Test
  public void test_omaha_holdem_5388_2d5c7sKcTd_6hKd7d3d_4dJcAhAc_2sKhQcQs_Ad4sJs5d() {
    assertEquals(
      "Ad4sJs5d 4dJcAhAc 2sKhQcQs 6hKd7d3d",
      Solver.process("omaha-holdem 2d5c7sKcTd 6hKd7d3d 4dJcAhAc 2sKhQcQs Ad4sJs5d"));
  }

  @Test
  public void test_omaha_holdem_5389_6c8d9sAdQc_4cQd7s6h_Jd9dQh4h_Jh8s5sKs_3cTsTd9c_2c6sTcKd_3sKh7d2h() {
    assertEquals(
      "3sKh7d2h 2c6sTcKd Jh8s5sKs 3cTsTd9c 4cQd7s6h Jd9dQh4h",
      Solver.process("omaha-holdem 6c8d9sAdQc 4cQd7s6h Jd9dQh4h Jh8s5sKs 3cTsTd9c 2c6sTcKd 3sKh7d2h"));
  }

  @Test
  public void test_omaha_holdem_5390_4h7d9hAhJh_7s2hKd3s_KsQdTsKh_AcQh4s3h_9d3c9c5d_Tc6hAs7c() {
    assertEquals(
      "7s2hKd3s KsQdTsKh Tc6hAs7c 9d3c9c5d AcQh4s3h",
      Solver.process("omaha-holdem 4h7d9hAhJh 7s2hKd3s KsQdTsKh AcQh4s3h 9d3c9c5d Tc6hAs7c"));
  }

  @Test
  public void test_omaha_holdem_5391_5d8dAdKcQs_2d7c9h6d_7d3cTd6c_JhQcKsKd_3d2sQd4h_6s7hAsTs() {
    assertEquals(
      "6s7hAsTs JhQcKsKd 2d7c9h6d 7d3cTd6c 3d2sQd4h",
      Solver.process("omaha-holdem 5d8dAdKcQs 2d7c9h6d 7d3cTd6c JhQcKsKd 3d2sQd4h 6s7hAsTs"));
  }

  @Test
  public void test_omaha_holdem_5392_5h8cKhQdTh_9d8s4c4h_7dJs8dAc_3d2c9c9h_6c6dAhQh_2hTc7s7h_5s5d7cJd_Qs9s2dKd() {
    assertEquals(
      "9d8s4c4h 3d2c9c9h Qs9s2dKd 5s5d7cJd 7dJs8dAc 2hTc7s7h 6c6dAhQh",
      Solver.process("omaha-holdem 5h8cKhQdTh 9d8s4c4h 7dJs8dAc 3d2c9c9h 6c6dAhQh 2hTc7s7h 5s5d7cJd Qs9s2dKd"));
  }

  @Test
  public void test_omaha_holdem_5393_3c3s4h8hTs_7c5dJdAc_5cKs2sQs_7hJh2cKh_9h6dQc4c() {
    assertEquals(
      "7hJh2cKh 5cKs2sQs 7c5dJdAc 9h6dQc4c",
      Solver.process("omaha-holdem 3c3s4h8hTs 7c5dJdAc 5cKs2sQs 7hJh2cKh 9h6dQc4c"));
  }

  @Test
  public void test_omaha_holdem_5394_3c4h9sTcTh_Ks8sKdTs_7d9cTd3s_6c4dKhJs_Kc8c4c9d() {
    assertEquals(
      "6c4dKhJs Kc8c4c9d Ks8sKdTs 7d9cTd3s",
      Solver.process("omaha-holdem 3c4h9sTcTh Ks8sKdTs 7d9cTd3s 6c4dKhJs Kc8c4c9d"));
  }

  @Test
  public void test_omaha_holdem_5395_5sAdAsQcTc_6s2s3c7s_Js3d5cJc_TsJh2cTh_4c3sAc4d_4hKs9c5d_4sJdKh6c_2h9d5h6d_8hQd3h7h_Kd8sQh9s() {
    assertEquals(
      "6s2s3c7s 2h9d5h6d 4hKs9c5d Js3d5cJc 8hQd3h7h Kd8sQh9s 4c3sAc4d 4sJdKh6c TsJh2cTh",
      Solver.process("omaha-holdem 5sAdAsQcTc 6s2s3c7s Js3d5cJc TsJh2cTh 4c3sAc4d 4hKs9c5d 4sJdKh6c 2h9d5h6d 8hQd3h7h Kd8sQh9s"));
  }

  @Test
  public void test_omaha_holdem_5396_2c2h5c5s9d_8c9h7hKc_8d4s3sKd_As4hJcQh_AcQcJhQd() {
    assertEquals(
      "8d4s3sKd As4hJcQh 8c9h7hKc AcQcJhQd",
      Solver.process("omaha-holdem 2c2h5c5s9d 8c9h7hKc 8d4s3sKd As4hJcQh AcQcJhQd"));
  }

  @Test
  public void test_omaha_holdem_5397_6h9hAcJcQc_7d4d3dKh_Td7c8c6c_6d4c8s2h_Ts2dKcJs_2c8d7s3h_Tc9s3s5h_2s3c4s5d_Qh5sJhTh_8hQd5cJd() {
    assertEquals(
      "2s3c4s5d 2c8d7s3h 7d4d3dKh 6d4c8s2h Tc9s3s5h 8hQd5cJd=Qh5sJhTh Ts2dKcJs Td7c8c6c",
      Solver.process("omaha-holdem 6h9hAcJcQc 7d4d3dKh Td7c8c6c 6d4c8s2h Ts2dKcJs 2c8d7s3h Tc9s3s5h 2s3c4s5d Qh5sJhTh 8hQd5cJd"));
  }

  @Test
  public void test_omaha_holdem_5398_3s7c8sAsKs_8c6h2hKc_9sAh8h2s_TdTsTcTh_4s6c7d8d_9h2dJsAd_Jh5h4c4d_7s5dQcKd_QhQs6dJc() {
    assertEquals(
      "Jh5h4c4d TdTsTcTh QhQs6dJc 9h2dJsAd 4s6c7d8d 7s5dQcKd 8c6h2hKc 9sAh8h2s",
      Solver.process("omaha-holdem 3s7c8sAsKs 8c6h2hKc 9sAh8h2s TdTsTcTh 4s6c7d8d 9h2dJsAd Jh5h4c4d 7s5dQcKd QhQs6dJc"));
  }

  @Test
  public void test_omaha_holdem_5399_6c7hKhQhQs_8sKd6dAc_3sJdTs3h_4dQc2cKc_7s3c8c2d_5h4s9d7c_9hJhThJc_Td4cAs6h_5cTcQd4h() {
    assertEquals(
      "3sJdTs3h Td4cAs6h 7s3c8c2d 5h4s9d7c 8sKd6dAc 5cTcQd4h 9hJhThJc 4dQc2cKc",
      Solver.process("omaha-holdem 6c7hKhQhQs 8sKd6dAc 3sJdTs3h 4dQc2cKc 7s3c8c2d 5h4s9d7c 9hJhThJc Td4cAs6h 5cTcQd4h"));
  }

  @Test
  public void test_omaha_holdem_5400_4h5sAcJdQc_8cJh6s3c_As5cAh9h_2dKhTs3s() {
    assertEquals(
      "8cJh6s3c As5cAh9h 2dKhTs3s",
      Solver.process("omaha-holdem 4h5sAcJdQc 8cJh6s3c As5cAh9h 2dKhTs3s"));
  }

  @Test
  public void test_omaha_holdem_5401_4h9sAhJdKh_Ad6c5d9h_Kc3d5s6h_6dTs2cQc_AsJc7cJs_7s4s2hTh() {
    assertEquals(
      "Kc3d5s6h Ad6c5d9h AsJc7cJs 6dTs2cQc 7s4s2hTh",
      Solver.process("omaha-holdem 4h9sAhJdKh Ad6c5d9h Kc3d5s6h 6dTs2cQc AsJc7cJs 7s4s2hTh"));
  }

  @Test
  public void test_omaha_holdem_5402_5h6c9hQsTh_Qd7d6d8c_Ks9c9s3d() {
    assertEquals(
      "Ks9c9s3d Qd7d6d8c",
      Solver.process("omaha-holdem 5h6c9hQsTh Qd7d6d8c Ks9c9s3d"));
  }

  @Test
  public void test_omaha_holdem_5403_2h4c4d8h9d_Th8s7d4h_3s3h6dJh_Ks2c6sKh() {
    assertEquals(
      "3s3h6dJh Ks2c6sKh Th8s7d4h",
      Solver.process("omaha-holdem 2h4c4d8h9d Th8s7d4h 3s3h6dJh Ks2c6sKh"));
  }

  @Test
  public void test_omaha_holdem_5404_4h7h8d8hAc_4s5c3c4c_JdKc8s9c() {
    assertEquals(
      "JdKc8s9c 4s5c3c4c",
      Solver.process("omaha-holdem 4h7h8d8hAc 4s5c3c4c JdKc8s9c"));
  }

  @Test
  public void test_omaha_holdem_5405_3s8hAhJdKs_3d4sTd9c_ThTs6dKh_2c6hJc5s() {
    assertEquals(
      "3d4sTd9c 2c6hJc5s ThTs6dKh",
      Solver.process("omaha-holdem 3s8hAhJdKs 3d4sTd9c ThTs6dKh 2c6hJc5s"));
  }

  @Test
  public void test_omaha_holdem_5406_2s4cJcJsKc_Kh2c9c6s_QsKd7s9h_Ad2h6cQd_7cTd7d9s_5hTs4dKs_3c5c2d8c_4s3dJh8d_Ah7h5sTc() {
    assertEquals(
      "Ah7h5sTc Ad2h6cQd 7cTd7d9s 5hTs4dKs QsKd7s9h 3c5c2d8c Kh2c9c6s 4s3dJh8d",
      Solver.process("omaha-holdem 2s4cJcJsKc Kh2c9c6s QsKd7s9h Ad2h6cQd 7cTd7d9s 5hTs4dKs 3c5c2d8c 4s3dJh8d Ah7h5sTc"));
  }

  @Test
  public void test_omaha_holdem_5407_3s8sJcKdTs_Td2d6dKc_9s7sKs8d_Jh9c3cAs_2s7h5dJd_Tc6s9h8c() {
    assertEquals(
      "2s7h5dJd Tc6s9h8c Jh9c3cAs Td2d6dKc 9s7sKs8d",
      Solver.process("omaha-holdem 3s8sJcKdTs Td2d6dKc 9s7sKs8d Jh9c3cAs 2s7h5dJd Tc6s9h8c"));
  }

  @Test
  public void test_omaha_holdem_5408_2s3c3sJdQc_Ac3h9sTh_Jc9dKdAs_8dKh2d9h() {
    assertEquals(
      "8dKh2d9h Jc9dKdAs Ac3h9sTh",
      Solver.process("omaha-holdem 2s3c3sJdQc Ac3h9sTh Jc9dKdAs 8dKh2d9h"));
  }

  @Test
  public void test_omaha_holdem_5409_5c6h7sQhTc_Kd9s3h4c_6d8d7d7c_Ah9dTsAc_Jc2cJdQs_9h9cKc8h() {
    assertEquals(
      "Jc2cJdQs Ah9dTsAc 6d8d7d7c Kd9s3h4c 9h9cKc8h",
      Solver.process("omaha-holdem 5c6h7sQhTc Kd9s3h4c 6d8d7d7c Ah9dTsAc Jc2cJdQs 9h9cKc8h"));
  }

  @Test
  public void test_omaha_holdem_5410_6h7h7s8c8s_8dAd4cQc_3c9s6d3h_9dKh4dJh() {
    assertEquals(
      "9dKh4dJh 3c9s6d3h 8dAd4cQc",
      Solver.process("omaha-holdem 6h7h7s8c8s 8dAd4cQc 3c9s6d3h 9dKh4dJh"));
  }

  @Test
  public void test_omaha_holdem_5411_2h3sAcJhTs_4hKh8s8d_4sQh6hQd_JsKs5d7d_5sTdAh4d_AsQsKdJc_6d5c9d2d() {
    assertEquals(
      "6d5c9d2d 4hKh8s8d JsKs5d7d 4sQh6hQd 5sTdAh4d AsQsKdJc",
      Solver.process("omaha-holdem 2h3sAcJhTs 4hKh8s8d 4sQh6hQd JsKs5d7d 5sTdAh4d AsQsKdJc 6d5c9d2d"));
  }

  @Test
  public void test_omaha_holdem_5412_5s8h8sJcTs_3d6s3sKh_2h7d4dQc_2cKd8cQs() {
    assertEquals(
      "2h7d4dQc 2cKd8cQs 3d6s3sKh",
      Solver.process("omaha-holdem 5s8h8sJcTs 3d6s3sKh 2h7d4dQc 2cKd8cQs"));
  }

  @Test
  public void test_omaha_holdem_5413_3h3s7s8dTh_7hKcKsTd_8s2c5h2s() {
    assertEquals(
      "8s2c5h2s 7hKcKsTd",
      Solver.process("omaha-holdem 3h3s7s8dTh 7hKcKsTd 8s2c5h2s"));
  }

  @Test
  public void test_omaha_holdem_5414_2s6d9sKcTc_5h5s8d3s_9hQcAc4s() {
    assertEquals(
      "5h5s8d3s 9hQcAc4s",
      Solver.process("omaha-holdem 2s6d9sKcTc 5h5s8d3s 9hQcAc4s"));
  }

  @Test
  public void test_omaha_holdem_5415_2h3h9dKhTs_3c7h3dKc_Qs4s8h2c_8s6sAd9c() {
    assertEquals(
      "Qs4s8h2c 8s6sAd9c 3c7h3dKc",
      Solver.process("omaha-holdem 2h3h9dKhTs 3c7h3dKc Qs4s8h2c 8s6sAd9c"));
  }

  @Test
  public void test_omaha_holdem_5416_2d6s7dAhQd_Kh6dKs4h_4dTd5h2c_KdAd4s2h_8s4c6c3c() {
    assertEquals(
      "8s4c6c3c Kh6dKs4h 4dTd5h2c KdAd4s2h",
      Solver.process("omaha-holdem 2d6s7dAhQd Kh6dKs4h 4dTd5h2c KdAd4s2h 8s4c6c3c"));
  }

  @Test
  public void test_omaha_holdem_5417_3s5s6d8cAs_TcTsJh5h_7dKhAd3d_7sTdQd3c_Ac4c6c9d_Qc8s2s3h_7h6h7cQh_9h5c2d4h_4s9sKc6s_JcJd2hKs() {
    assertEquals(
      "7sTdQd3c 7h6h7cQh TcTsJh5h JcJd2hKs 7dKhAd3d Ac4c6c9d 9h5c2d4h Qc8s2s3h 4s9sKc6s",
      Solver.process("omaha-holdem 3s5s6d8cAs TcTsJh5h 7dKhAd3d 7sTdQd3c Ac4c6c9d Qc8s2s3h 7h6h7cQh 9h5c2d4h 4s9sKc6s JcJd2hKs"));
  }

  @Test
  public void test_omaha_holdem_5418_7s8hKsQhTs_Th5c7c9s_Kc5s6dKd_3h5hJh9d_7dTc2c6s() {
    assertEquals(
      "7dTc2c6s=Th5c7c9s Kc5s6dKd 3h5hJh9d",
      Solver.process("omaha-holdem 7s8hKsQhTs Th5c7c9s Kc5s6dKd 3h5hJh9d 7dTc2c6s"));
  }

  @Test
  public void test_omaha_holdem_5419_3d7h8hJcQc_Ks3hAd9h_Ts2sKhQh_2h4s8cQd_5s6cTd7d_5d6h7cAs_3s8s4cAc_Th7sKc4h_2dJdTcKd() {
    assertEquals(
      "Ks3hAd9h 5s6cTd7d Th7sKc4h 5d6h7cAs 2dJdTcKd Ts2sKhQh 3s8s4cAc 2h4s8cQd",
      Solver.process("omaha-holdem 3d7h8hJcQc Ks3hAd9h Ts2sKhQh 2h4s8cQd 5s6cTd7d 5d6h7cAs 3s8s4cAc Th7sKc4h 2dJdTcKd"));
  }

  @Test
  public void test_omaha_holdem_5420_5s8dAhAsTc_JcTh6h9s_3d7c3cJs_8cTdKc2s_6d5h8sAc_QcQs5cKh_3s6c2h3h_KsKd9d2d() {
    assertEquals(
      "3d7c3cJs=3s6c2h3h JcTh6h9s 8cTdKc2s QcQs5cKh KsKd9d2d 6d5h8sAc",
      Solver.process("omaha-holdem 5s8dAhAsTc JcTh6h9s 3d7c3cJs 8cTdKc2s 6d5h8sAc QcQs5cKh 3s6c2h3h KsKd9d2d"));
  }

  @Test
  public void test_omaha_holdem_5421_2d3h4s9dQd_9h8d6d7c_8h4dKh4c_3sQc3cTd_7sAd2s3d_8c5d7h7d_Jh5h4hTh() {
    assertEquals(
      "Jh5h4hTh 3sQc3cTd 8h4dKh4c 8c5d7h7d 9h8d6d7c 7sAd2s3d",
      Solver.process("omaha-holdem 2d3h4s9dQd 9h8d6d7c 8h4dKh4c 3sQc3cTd 7sAd2s3d 8c5d7h7d Jh5h4hTh"));
  }

  @Test
  public void test_omaha_holdem_5422_6sAhKdQsTc_3h7hJc8h_5cQc2hAs_QhJh8c3s_Kh4s9h4h_Jd9dQdTh_Js7c9cTs_3cTd8dKs_4d8s9s6h_7d5s2cKc() {
    assertEquals(
      "3h7hJc8h 4d8s9s6h 7d5s2cKc Kh4s9h4h 3cTd8dKs 5cQc2hAs Jd9dQdTh=Js7c9cTs=QhJh8c3s",
      Solver.process("omaha-holdem 6sAhKdQsTc 3h7hJc8h 5cQc2hAs QhJh8c3s Kh4s9h4h Jd9dQdTh Js7c9cTs 3cTd8dKs 4d8s9s6h 7d5s2cKc"));
  }

  @Test
  public void test_omaha_holdem_5423_2c5cAcJcKh_7s4c6c6d_QcTcQh7d() {
    assertEquals(
      "7s4c6c6d QcTcQh7d",
      Solver.process("omaha-holdem 2c5cAcJcKh 7s4c6c6d QcTcQh7d"));
  }

  @Test
  public void test_omaha_holdem_5424_3c4s5c5sAh_8c7s6cAc_3dQc8dQh() {
    assertEquals(
      "3dQc8dQh 8c7s6cAc",
      Solver.process("omaha-holdem 3c4s5c5sAh 8c7s6cAc 3dQc8dQh"));
  }

  @Test
  public void test_omaha_holdem_5425_3s7h7s9dQd_As2s8d9h_Jd6h6s8s_KhAhJh3c_2d3d4cKd_6d7c5c5d_JsQsJc9s_Ac5h2c2h_5sTh8cKc_Td4sTcAd() {
    assertEquals(
      "5sTh8cKc Ac5h2c2h 2d3d4cKd KhAhJh3c Jd6h6s8s As2s8d9h Td4sTcAd JsQsJc9s 6d7c5c5d",
      Solver.process("omaha-holdem 3s7h7s9dQd As2s8d9h Jd6h6s8s KhAhJh3c 2d3d4cKd 6d7c5c5d JsQsJc9s Ac5h2c2h 5sTh8cKc Td4sTcAd"));
  }

  @Test
  public void test_omaha_holdem_5426_2hJhKdQcQh_Kc8h9hJd_Th7h3c9s_5c2dQd2s_8dTsKs7d() {
    assertEquals(
      "8dTsKs7d Kc8h9hJd Th7h3c9s 5c2dQd2s",
      Solver.process("omaha-holdem 2hJhKdQcQh Kc8h9hJd Th7h3c9s 5c2dQd2s 8dTsKs7d"));
  }

  @Test
  public void test_omaha_holdem_5427_4c5c9dJhQh_Qd5dAc9s_Kh8d4h2s_6h5h9cKc_8sJs4s4d_Tc3s6s8h_Ks7h3c2d_2hQcThTs_Td5s7c2c_3hAs7d3d() {
    assertEquals(
      "Ks7h3c2d 3hAs7d3d Kh8d4h2s Td5s7c2c 2hQcThTs 6h5h9cKc Qd5dAc9s 8sJs4s4d Tc3s6s8h",
      Solver.process("omaha-holdem 4c5c9dJhQh Qd5dAc9s Kh8d4h2s 6h5h9cKc 8sJs4s4d Tc3s6s8h Ks7h3c2d 2hQcThTs Td5s7c2c 3hAs7d3d"));
  }

  @Test
  public void test_omaha_holdem_5428_2s3h8sJhKs_6d8hJc2h_5d4s7dTc_Qc4hTh9s() {
    assertEquals(
      "5d4s7dTc Qc4hTh9s 6d8hJc2h",
      Solver.process("omaha-holdem 2s3h8sJhKs 6d8hJc2h 5d4s7dTc Qc4hTh9s"));
  }

  @Test
  public void test_omaha_holdem_5429_3c3h8c9cAs_Js5s6sKd_5h2d7dQh_6dJd4cJc() {
    assertEquals(
      "5h2d7dQh Js5s6sKd 6dJd4cJc",
      Solver.process("omaha-holdem 3c3h8c9cAs Js5s6sKd 5h2d7dQh 6dJd4cJc"));
  }

  @Test
  public void test_omaha_holdem_5430_3c4c4s7cQc_QhQd6sJc_KdAhTsQs() {
    assertEquals(
      "KdAhTsQs QhQd6sJc",
      Solver.process("omaha-holdem 3c4c4s7cQc QhQd6sJc KdAhTsQs"));
  }

  @Test
  public void test_omaha_holdem_5431_2h5c7c7dTc_9s8dQcAc_AhJsTs2s_4d5sQh3h_8h6c9c2d_7s6sKh3d_Jd4s9d4c_QdKs3c5h_4h9hJc8c_6hJhAdQs() {
    assertEquals(
      "6hJhAdQs Jd4s9d4c 4d5sQh3h QdKs3c5h AhJsTs2s 7s6sKh3d 8h6c9c2d 4h9hJc8c 9s8dQcAc",
      Solver.process("omaha-holdem 2h5c7c7dTc 9s8dQcAc AhJsTs2s 4d5sQh3h 8h6c9c2d 7s6sKh3d Jd4s9d4c QdKs3c5h 4h9hJc8c 6hJhAdQs"));
  }

  @Test
  public void test_omaha_holdem_5432_3h6c8s9hJc_8dQhThJd_2c8hJs8c_TsKh5cAc_4hAh5sKc_4d2s4s2h_4cAs5h2d() {
    assertEquals(
      "4cAs5h2d 4hAh5sKc=TsKh5cAc 4d2s4s2h 2c8hJs8c 8dQhThJd",
      Solver.process("omaha-holdem 3h6c8s9hJc 8dQhThJd 2c8hJs8c TsKh5cAc 4hAh5sKc 4d2s4s2h 4cAs5h2d"));
  }

  @Test
  public void test_omaha_holdem_5433_5d5s6c7s9s_8d4s4dJs_Ah3d4h3s_7c7d2hKd_8cJhAd5c() {
    assertEquals(
      "Ah3d4h3s 8cJhAd5c 8d4s4dJs 7c7d2hKd",
      Solver.process("omaha-holdem 5d5s6c7s9s 8d4s4dJs Ah3d4h3s 7c7d2hKd 8cJhAd5c"));
  }

  @Test
  public void test_omaha_holdem_5434_5d6s9hKsQs_Jd4c3d9s_7hTdAsJs_7sQd3cAh_3h4sKd8h_4dQhAc7d_JhKh2d5s_6d5c4h6c_8dKc8s6h_ThTs2s7c() {
    assertEquals(
      "Jd4c3d9s 4dQhAc7d=7sQd3cAh 3h4sKd8h JhKh2d5s 8dKc8s6h 6d5c4h6c ThTs2s7c 7hTdAsJs",
      Solver.process("omaha-holdem 5d6s9hKsQs Jd4c3d9s 7hTdAsJs 7sQd3cAh 3h4sKd8h 4dQhAc7d JhKh2d5s 6d5c4h6c 8dKc8s6h ThTs2s7c"));
  }

  @Test
  public void test_omaha_holdem_5435_3h6s7s9hKd_2d5cTsQd_Jc2cAdTd_Jh7cAhTc_3d4sAc8h_Qh9d9cQs_Kc9sJs7d_8d8s5s5d_4c2h5hKs_Kh8c3c3s() {
    assertEquals(
      "2d5cTsQd Jc2cAdTd 3d4sAc8h Jh7cAhTc Kc9sJs7d Kh8c3c3s Qh9d9cQs 4c2h5hKs 8d8s5s5d",
      Solver.process("omaha-holdem 3h6s7s9hKd 2d5cTsQd Jc2cAdTd Jh7cAhTc 3d4sAc8h Qh9d9cQs Kc9sJs7d 8d8s5s5d 4c2h5hKs Kh8c3c3s"));
  }

  @Test
  public void test_omaha_holdem_5436_4c5d8cKhTh_2c5cTc7c_3h6s6h9s_8dTsQs2h_Qh4d3d2d() {
    assertEquals(
      "Qh4d3d2d 3h6s6h9s 2c5cTc7c 8dTsQs2h",
      Solver.process("omaha-holdem 4c5d8cKhTh 2c5cTc7c 3h6s6h9s 8dTsQs2h Qh4d3d2d"));
  }

  @Test
  public void test_omaha_holdem_5437_3s5d7h8hAd_3d5s7d8d_2h3cJdKc_2d4c8cAs_Kd6h5cAh() {
    assertEquals(
      "2h3cJdKc 3d5s7d8d Kd6h5cAh 2d4c8cAs",
      Solver.process("omaha-holdem 3s5d7h8hAd 3d5s7d8d 2h3cJdKc 2d4c8cAs Kd6h5cAh"));
  }

  @Test
  public void test_omaha_holdem_5438_2h4c7sAcKc_Kh4s8c3d_Ah4hTcKs_8dJs6h5d() {
    assertEquals(
      "8dJs6h5d Kh4s8c3d Ah4hTcKs",
      Solver.process("omaha-holdem 2h4c7sAcKc Kh4s8c3d Ah4hTcKs 8dJs6h5d"));
  }

  @Test
  public void test_omaha_holdem_5439_2h8d9dAsQh_Ad2dJsAh_8s7h9c4c_6d5c3c7c_4d4s7sTs_9hKcQs8c_Ks3h6h5d() {
    assertEquals(
      "6d5c3c7c Ks3h6h5d 4d4s7sTs 8s7h9c4c 9hKcQs8c Ad2dJsAh",
      Solver.process("omaha-holdem 2h8d9dAsQh Ad2dJsAh 8s7h9c4c 6d5c3c7c 4d4s7sTs 9hKcQs8c Ks3h6h5d"));
  }

  @Test
  public void test_omaha_holdem_5440_2s7c8dAhJh_2dKs7sKh_3d4hTc6d_AcJc8c6h_3cJd4dQs_AsQd7d6c_9sAd9h9c() {
    assertEquals(
      "3d4hTc6d 3cJd4dQs 9sAd9h9c 2dKs7sKh AsQd7d6c AcJc8c6h",
      Solver.process("omaha-holdem 2s7c8dAhJh 2dKs7sKh 3d4hTc6d AcJc8c6h 3cJd4dQs AsQd7d6c 9sAd9h9c"));
  }

  @Test
  public void test_omaha_holdem_5441_4c4d6dKdKs_2c2d3hJs_7d7c8dTs_9s3s2s2h_4h5h6s8c_AcTcJdTd_4s3c5cAd_Jh7s9hTh() {
    assertEquals(
      "Jh7s9hTh 2c2d3hJs=9s3s2s2h 4s3c5cAd 7d7c8dTs AcTcJdTd 4h5h6s8c",
      Solver.process("omaha-holdem 4c4d6dKdKs 2c2d3hJs 7d7c8dTs 9s3s2s2h 4h5h6s8c AcTcJdTd 4s3c5cAd Jh7s9hTh"));
  }

  @Test
  public void test_omaha_holdem_5442_2h4h9cTcTh_6cQdTsQs_3h3s8c6h() {
    assertEquals(
      "6cQdTsQs 3h3s8c6h",
      Solver.process("omaha-holdem 2h4h9cTcTh 6cQdTsQs 3h3s8c6h"));
  }

  @Test
  public void test_omaha_holdem_5443_4c8h9hQcTc_KdJs8d3c_7s2d4h6h() {
    assertEquals(
      "7s2d4h6h KdJs8d3c",
      Solver.process("omaha-holdem 4c8h9hQcTc KdJs8d3c 7s2d4h6h"));
  }

  @Test
  public void test_omaha_holdem_5444_4c6s7c9cJd_5hKc6c4h_KdThAc2s_2c3d3h8s_4d9h7d2d() {
    assertEquals(
      "KdThAc2s 2c3d3h8s 4d9h7d2d 5hKc6c4h",
      Solver.process("omaha-holdem 4c6s7c9cJd 5hKc6c4h KdThAc2s 2c3d3h8s 4d9h7d2d"));
  }

  @Test
  public void test_omaha_holdem_5445_2h3c6hKdQd_6s4s9s4h_5h6c4dQh() {
    assertEquals(
      "6s4s9s4h 5h6c4dQh",
      Solver.process("omaha-holdem 2h3c6hKdQd 6s4s9s4h 5h6c4dQh"));
  }

  @Test
  public void test_omaha_holdem_5446_6c6s7d8sKs_8d9s2cJc_Qc7h8c4c_7cKd3hJd() {
    assertEquals(
      "8d9s2cJc Qc7h8c4c 7cKd3hJd",
      Solver.process("omaha-holdem 6c6s7d8sKs 8d9s2cJc Qc7h8c4c 7cKd3hJd"));
  }

  @Test
  public void test_omaha_holdem_5447_3c4h5cKcKh_4cAh5d7c_JcAdTdTh_Jd9s6dQd_4s8s8h6c_5sTcTs6h_QhJs7d9h() {
    assertEquals(
      "Jd9s6dQd=QhJs7d9h 4s8s8h6c 5sTcTs6h=JcAdTdTh 4cAh5d7c",
      Solver.process("omaha-holdem 3c4h5cKcKh 4cAh5d7c JcAdTdTh Jd9s6dQd 4s8s8h6c 5sTcTs6h QhJs7d9h"));
  }

  @Test
  public void test_omaha_holdem_5448_2s7dAdJhKh_QdAs4dQs_Ah8c7c8s_5c8d5hTs_2cKdTd5s_Ac8h9h4s_Qc5d7h6h_Ks9s9dJc() {
    assertEquals(
      "5c8d5hTs Qc5d7h6h Ac8h9h4s QdAs4dQs 2cKdTd5s Ks9s9dJc Ah8c7c8s",
      Solver.process("omaha-holdem 2s7dAdJhKh QdAs4dQs Ah8c7c8s 5c8d5hTs 2cKdTd5s Ac8h9h4s Qc5d7h6h Ks9s9dJc"));
  }

  @Test
  public void test_omaha_holdem_5449_2c4c5hQcQs_6s5s5d3d_2s5cAsTh_4d7hQdAh_Ks8h6c7s_QhKdTcAd_JsJd9cKh_KcJh2h9d() {
    assertEquals(
      "Ks8h6c7s KcJh2h9d 2s5cAsTh JsJd9cKh QhKdTcAd 6s5s5d3d 4d7hQdAh",
      Solver.process("omaha-holdem 2c4c5hQcQs 6s5s5d3d 2s5cAsTh 4d7hQdAh Ks8h6c7s QhKdTcAd JsJd9cKh KcJh2h9d"));
  }

  @Test
  public void test_omaha_holdem_5450_4cAhKdQcTh_6cQd2h8s_7h2cQh9d_JsJhAc8h_5c4hTs8c_3d8dTd5d_6sJd9hKh_AdQs9c4s_Tc6d3h4d() {
    assertEquals(
      "3d8dTd5d 6cQd2h8s 7h2cQh9d 5c4hTs8c=Tc6d3h4d AdQs9c4s 6sJd9hKh=JsJhAc8h",
      Solver.process("omaha-holdem 4cAhKdQcTh 6cQd2h8s 7h2cQh9d JsJhAc8h 5c4hTs8c 3d8dTd5d 6sJd9hKh AdQs9c4s Tc6d3h4d"));
  }

  @Test
  public void test_omaha_holdem_5451_6c7d8c9sTc_Th3d7cKs_Qd2dJd2h_8hJcQh6s_4d3h9c9h_Qc7hQs4c_Kc6h8s2c_As5cTd4s_7sAhJhAd_Ts5hAc9d() {
    assertEquals(
      "4d3h9c9h As5cTd4s Th3d7cKs=Ts5hAc9d 7sAhJhAd 8hJcQh6s=Qd2dJd2h Qc7hQs4c Kc6h8s2c",
      Solver.process("omaha-holdem 6c7d8c9sTc Th3d7cKs Qd2dJd2h 8hJcQh6s 4d3h9c9h Qc7hQs4c Kc6h8s2c As5cTd4s 7sAhJhAd Ts5hAc9d"));
  }

  @Test
  public void test_omaha_holdem_5452_4c4h7c8hKs_Th9h9cTd_JsKh6h5s_Ah3s9s9d_6cKdTcKc_4sJd3d8s_5dJhQh5c_5h6sQd4d() {
    assertEquals(
      "5dJhQh5c Ah3s9s9d Th9h9cTd 5h6sQd4d=JsKh6h5s 4sJd3d8s 6cKdTcKc",
      Solver.process("omaha-holdem 4c4h7c8hKs Th9h9cTd JsKh6h5s Ah3s9s9d 6cKdTcKc 4sJd3d8s 5dJhQh5c 5h6sQd4d"));
  }

  @Test
  public void test_omaha_holdem_5453_4dAcQdTcTs_4s3s3h5s_Th5c6hJd_2h9c6d9s_4c7hJsKc_7s9d5dQc_8sJhJc6c_9hTd7d5h_AsKsKhKd() {
    assertEquals(
      "4s3s3h5s 2h9c6d9s 8sJhJc6c 7s9d5dQc AsKsKhKd 9hTd7d5h Th5c6hJd 4c7hJsKc",
      Solver.process("omaha-holdem 4dAcQdTcTs 4s3s3h5s Th5c6hJd 2h9c6d9s 4c7hJsKc 7s9d5dQc 8sJhJc6c 9hTd7d5h AsKsKhKd"));
  }

  @Test
  public void test_omaha_holdem_5454_2d4cAcAhKh_Ts5hJs5c_Jh8dQsQd_6c5dQc9c_Tc2h7hKc_8h2c4sKd_Qh4d7s6h_7c6sTd3c_9h2sTh3s() {
    assertEquals(
      "7c6sTd3c 6c5dQc9c 9h2sTh3s Qh4d7s6h Ts5hJs5c Jh8dQsQd 8h2c4sKd Tc2h7hKc",
      Solver.process("omaha-holdem 2d4cAcAhKh Ts5hJs5c Jh8dQsQd 6c5dQc9c Tc2h7hKc 8h2c4sKd Qh4d7s6h 7c6sTd3c 9h2sTh3s"));
  }

  @Test
  public void test_omaha_holdem_5455_2h7h9sKcQh_5c7s7cTs_KsAcTc2d_5d4c8sKh_3cJh6sQc_9dJs8c6h() {
    assertEquals(
      "9dJs8c6h 3cJh6sQc 5d4c8sKh KsAcTc2d 5c7s7cTs",
      Solver.process("omaha-holdem 2h7h9sKcQh 5c7s7cTs KsAcTc2d 5d4c8sKh 3cJh6sQc 9dJs8c6h"));
  }

  @Test
  public void test_omaha_holdem_5456_6d6s9hTdTs_KhQcJs9d_Qd5c2d3s_2s9s7cQs_7s8c2h3d_Qh4c6c4s_7h9c5sJh_JcKc5h8s() {
    assertEquals(
      "Qd5c2d3s JcKc5h8s 7h9c5sJh 2s9s7cQs KhQcJs9d Qh4c6c4s 7s8c2h3d",
      Solver.process("omaha-holdem 6d6s9hTdTs KhQcJs9d Qd5c2d3s 2s9s7cQs 7s8c2h3d Qh4c6c4s 7h9c5sJh JcKc5h8s"));
  }

  @Test
  public void test_omaha_holdem_5457_5s7c8d8sJh_9s2d4c8c_3dAcQc3c_KsKdJsTs_6hThQh6d_2c9d6c2h_8h4h9c7h_AhKh5hAs_3sTc7s9h_6s7d4dJd() {
    assertEquals(
      "3dAcQc3c 6hThQh6d KsKdJsTs AhKh5hAs 9s2d4c8c 6s7d4dJd 2c9d6c2h 3sTc7s9h 8h4h9c7h",
      Solver.process("omaha-holdem 5s7c8d8sJh 9s2d4c8c 3dAcQc3c KsKdJsTs 6hThQh6d 2c9d6c2h 8h4h9c7h AhKh5hAs 3sTc7s9h 6s7d4dJd"));
  }

  @Test
  public void test_omaha_holdem_5458_2c6d9d9sQh_7d3c2s5s_AhTcTs3d_7h4d6sKc_Jh6c8s8d() {
    assertEquals(
      "7d3c2s5s 7h4d6sKc Jh6c8s8d AhTcTs3d",
      Solver.process("omaha-holdem 2c6d9d9sQh 7d3c2s5s AhTcTs3d 7h4d6sKc Jh6c8s8d"));
  }

  @Test
  public void test_omaha_holdem_5459_2s6cJhQdTc_Td3h8d3s_7c4sAh6d_5d2c9h7h_3dAcAd8s() {
    assertEquals(
      "5d2c9h7h 7c4sAh6d Td3h8d3s 3dAcAd8s",
      Solver.process("omaha-holdem 2s6cJhQdTc Td3h8d3s 7c4sAh6d 5d2c9h7h 3dAcAd8s"));
  }

  @Test
  public void test_omaha_holdem_5460_3h4h8hJhKs_7d2h5c6s_7h8sKdJd_5sTc8dTd_8cAsAh3s_9dQcJcAd_ThQd4c6d_2d9c9sKh_5d6cJs6h() {
    assertEquals(
      "7d2h5c6s ThQd4c6d 5sTc8dTd 5d6cJs6h 9dQcJcAd 2d9c9sKh 8cAsAh3s 7h8sKdJd",
      Solver.process("omaha-holdem 3h4h8hJhKs 7d2h5c6s 7h8sKdJd 5sTc8dTd 8cAsAh3s 9dQcJcAd ThQd4c6d 2d9c9sKh 5d6cJs6h"));
  }

  @Test
  public void test_omaha_holdem_5461_6d8s9sThTs_8hAs3s5h_Jh2d9c3h() {
    assertEquals(
      "Jh2d9c3h 8hAs3s5h",
      Solver.process("omaha-holdem 6d8s9sThTs 8hAs3s5h Jh2d9c3h"));
  }

  @Test
  public void test_omaha_holdem_5462_8c8hAcJcJd_9s6dAd6s_TsQh3d5d_4c8dThJs_9h4d5s2s_KhQs3hAh_7hKs9dTc_5h6c3sJh_4hKc8s7c_Td9c4s7s() {
    assertEquals(
      "9h4d5s2s Td9c4s7s TsQh3d5d 7hKs9dTc 9s6dAd6s KhQs3hAh 5h6c3sJh 4hKc8s7c 4c8dThJs",
      Solver.process("omaha-holdem 8c8hAcJcJd 9s6dAd6s TsQh3d5d 4c8dThJs 9h4d5s2s KhQs3hAh 7hKs9dTc 5h6c3sJh 4hKc8s7c Td9c4s7s"));
  }

  @Test
  public void test_omaha_holdem_5463_2c4c7s8cAh_2h5hJsKh_6dJh9d3s_Th4dAdAs_6s3h5d9h_JcQd7cJd_3d6c4hTd_Tc9s8s7d_2sKd5s6h() {
    assertEquals(
      "6dJh9d3s 2h5hJsKh 3d6c4hTd Tc9s8s7d Th4dAdAs 2sKd5s6h=6s3h5d9h JcQd7cJd",
      Solver.process("omaha-holdem 2c4c7s8cAh 2h5hJsKh 6dJh9d3s Th4dAdAs 6s3h5d9h JcQd7cJd 3d6c4hTd Tc9s8s7d 2sKd5s6h"));
  }

  @Test
  public void test_omaha_holdem_5464_2h6h7hJhQc_7d9dKc8s_Td9h4dJs_5h3c4cQs() {
    assertEquals(
      "7d9dKc8s Td9h4dJs 5h3c4cQs",
      Solver.process("omaha-holdem 2h6h7hJhQc 7d9dKc8s Td9h4dJs 5h3c4cQs"));
  }

  @Test
  public void test_omaha_holdem_5465_3c5s6cJcJh_4sKs2d6d_AcAsAh9s_2s4c5c9d() {
    assertEquals(
      "AcAsAh9s 4sKs2d6d 2s4c5c9d",
      Solver.process("omaha-holdem 3c5s6cJcJh 4sKs2d6d AcAsAh9s 2s4c5c9d"));
  }

  @Test
  public void test_omaha_holdem_5466_6c7cAdJcQd_2cTh4d3d_AhJh3cAs_Qc5sKs9d_6dAcQsKc_8s7d5d2h() {
    assertEquals(
      "2cTh4d3d 8s7d5d2h Qc5sKs9d AhJh3cAs 6dAcQsKc",
      Solver.process("omaha-holdem 6c7cAdJcQd 2cTh4d3d AhJh3cAs Qc5sKs9d 6dAcQsKc 8s7d5d2h"));
  }

  @Test
  public void test_omaha_holdem_5467_2h7cJhQsTd_8sThTc5d_6h9hQh4d_8cAc6d9s_4h3h9d2c_4cJd8d5s_QcJsTs3s_3c5h7hKc() {
    assertEquals(
      "4h3h9d2c 3c5h7hKc 4cJd8d5s 6h9hQh4d QcJsTs3s 8sThTc5d 8cAc6d9s",
      Solver.process("omaha-holdem 2h7cJhQsTd 8sThTc5d 6h9hQh4d 8cAc6d9s 4h3h9d2c 4cJd8d5s QcJsTs3s 3c5h7hKc"));
  }

  @Test
  public void test_omaha_holdem_5468_2d2h3s5h9h_6sJd8cKc_7hTc3c4h_9sJh4dTd() {
    assertEquals(
      "6sJd8cKc 9sJh4dTd 7hTc3c4h",
      Solver.process("omaha-holdem 2d2h3s5h9h 6sJd8cKc 7hTc3c4h 9sJh4dTd"));
  }

  @Test
  public void test_omaha_holdem_5469_3c3d4h7dAh_7sTdQc6s_QsJh5c9s() {
    assertEquals(
      "QsJh5c9s 7sTdQc6s",
      Solver.process("omaha-holdem 3c3d4h7dAh 7sTdQc6s QsJh5c9s"));
  }

  @Test
  public void test_omaha_holdem_5470_4dJcKcTdTs_5d3dJdQc_6d2dQs9h_Ah4cAd5c_Tc3sAc6h_9c9d4s8h_Th5h7d8c_KdKh8d7c() {
    assertEquals(
      "9c9d4s8h 5d3dJdQc Ah4cAd5c Th5h7d8c Tc3sAc6h 6d2dQs9h KdKh8d7c",
      Solver.process("omaha-holdem 4dJcKcTdTs 5d3dJdQc 6d2dQs9h Ah4cAd5c Tc3sAc6h 9c9d4s8h Th5h7d8c KdKh8d7c"));
  }

  @Test
  public void test_omaha_holdem_5471_2d6h9cAsKd_6cAh5d2s_AcTcQs8d_8s4h4s5c_KhQh6s7d_5h7s8h3s_2c3d3c5s_9sThKsJh() {
    assertEquals(
      "5h7s8h3s 2c3d3c5s 8s4h4s5c AcTcQs8d KhQh6s7d 9sThKsJh 6cAh5d2s",
      Solver.process("omaha-holdem 2d6h9cAsKd 6cAh5d2s AcTcQs8d 8s4h4s5c KhQh6s7d 5h7s8h3s 2c3d3c5s 9sThKsJh"));
  }

  @Test
  public void test_omaha_holdem_5472_5s7s9dAhQd_QhQcKhAs_2d5h8hKs_9c6h2sTs_8s2c4d4s_TdJc7cTc_9s6d9hJd_3hAc2hKc() {
    assertEquals(
      "8s2c4d4s 2d5h8hKs 9c6h2sTs TdJc7cTc 3hAc2hKc 9s6d9hJd QhQcKhAs",
      Solver.process("omaha-holdem 5s7s9dAhQd QhQcKhAs 2d5h8hKs 9c6h2sTs 8s2c4d4s TdJc7cTc 9s6d9hJd 3hAc2hKc"));
  }

  @Test
  public void test_omaha_holdem_5473_8cJcKcTcTs_7c2c6h9c_Qc3c4d8h_5sAdAs4h_7hKd4c8d_7d2dKsQs() {
    assertEquals(
      "7hKd4c8d 7d2dKsQs 5sAdAs4h Qc3c4d8h 7c2c6h9c",
      Solver.process("omaha-holdem 8cJcKcTcTs 7c2c6h9c Qc3c4d8h 5sAdAs4h 7hKd4c8d 7d2dKsQs"));
  }

  @Test
  public void test_omaha_holdem_5474_2d4c7sAsTs_Ks4d9s6c_AhJh8dJd_5s9cQcKh() {
    assertEquals(
      "5s9cQcKh AhJh8dJd Ks4d9s6c",
      Solver.process("omaha-holdem 2d4c7sAsTs Ks4d9s6c AhJh8dJd 5s9cQcKh"));
  }

  @Test
  public void test_omaha_holdem_5475_9cAsJsTdTs_2hQs3s8c_8sJcAcJh() {
    assertEquals(
      "2hQs3s8c 8sJcAcJh",
      Solver.process("omaha-holdem 9cAsJsTdTs 2hQs3s8c 8sJcAcJh"));
  }

  @Test
  public void test_omaha_holdem_5476_6h8hAdKhQs_ThQhJdAs_Ks4cQd9d_4s8c9c5d_TcAc3s5h_3c2c7sJs_9s4d3d6s_2s5c3h5s_Td8dKdAh() {
    assertEquals(
      "3c2c7sJs 2s5c3h5s 9s4d3d6s 4s8c9c5d TcAc3s5h Ks4cQd9d Td8dKdAh ThQhJdAs",
      Solver.process("omaha-holdem 6h8hAdKhQs ThQhJdAs Ks4cQd9d 4s8c9c5d TcAc3s5h 3c2c7sJs 9s4d3d6s 2s5c3h5s Td8dKdAh"));
  }

  @Test
  public void test_omaha_holdem_5477_2h3h3s6s8c_9h9c2d4s_7h8hThQs() {
    assertEquals(
      "7h8hThQs 9h9c2d4s",
      Solver.process("omaha-holdem 2h3h3s6s8c 9h9c2d4s 7h8hThQs"));
  }

  @Test
  public void test_omaha_holdem_5478_4h6d7c7d7h_Jd5sAhQd_QsQcJs9s_JcTcQh5h() {
    assertEquals(
      "JcTcQh5h Jd5sAhQd QsQcJs9s",
      Solver.process("omaha-holdem 4h6d7c7d7h Jd5sAhQd QsQcJs9s JcTcQh5h"));
  }

  @Test
  public void test_omaha_holdem_5479_2h9dJdJhQd_Ks2dThQh_3c2c5hKh_3d4h4d8s() {
    assertEquals(
      "3c2c5hKh Ks2dThQh 3d4h4d8s",
      Solver.process("omaha-holdem 2h9dJdJhQd Ks2dThQh 3c2c5hKh 3d4h4d8s"));
  }

  @Test
  public void test_omaha_holdem_5480_2h3h7h8c9s_5d6c5s7s_2dJc4sAd_KsQd6dJs() {
    assertEquals(
      "KsQd6dJs 2dJc4sAd 5d6c5s7s",
      Solver.process("omaha-holdem 2h3h7h8c9s 5d6c5s7s 2dJc4sAd KsQd6dJs"));
  }

  @Test
  public void test_omaha_holdem_5481_2h5s9sKcTd_Kd5c6hQd_Ac3hThQc_Kh4c6s7c() {
    assertEquals(
      "Ac3hThQc Kh4c6s7c Kd5c6hQd",
      Solver.process("omaha-holdem 2h5s9sKcTd Kd5c6hQd Ac3hThQc Kh4c6s7c"));
  }

  @Test
  public void test_omaha_holdem_5482_3s4h9dAsQc_4dJc6c7c_4c6s7d8d_7h7s3d6h_QdTcTsJs_3h9s9cAd_8sJd2c2s() {
    assertEquals(
      "8sJd2c2s 4c6s7d8d 4dJc6c7c 7h7s3d6h QdTcTsJs 3h9s9cAd",
      Solver.process("omaha-holdem 3s4h9dAsQc 4dJc6c7c 4c6s7d8d 7h7s3d6h QdTcTsJs 3h9s9cAd 8sJd2c2s"));
  }

  @Test
  public void test_omaha_holdem_5483_3d5c7d8sTd_4s2hKsQh_Ts7h6s7s_5h4d3sTc_9s5sAcJc_8h5dJsQs_KhKc8d2c() {
    assertEquals(
      "4s2hKsQh KhKc8d2c 8h5dJsQs 5h4d3sTc Ts7h6s7s 9s5sAcJc",
      Solver.process("omaha-holdem 3d5c7d8sTd 4s2hKsQh Ts7h6s7s 5h4d3sTc 9s5sAcJc 8h5dJsQs KhKc8d2c"));
  }

  @Test
  public void test_omaha_holdem_5484_2c9hQdTcTh_5d6h2d6c_7cQsKdQc_9c6sTsQh_AsJs7h5s_3d4sJd3h_4cKh8d4h_5cJh8s3c() {
    assertEquals(
      "AsJs7h5s 3d4sJd3h 4cKh8d4h 5d6h2d6c 5cJh8s3c 9c6sTsQh 7cQsKdQc",
      Solver.process("omaha-holdem 2c9hQdTcTh 5d6h2d6c 7cQsKdQc 9c6sTsQh AsJs7h5s 3d4sJd3h 4cKh8d4h 5cJh8s3c"));
  }

  @Test
  public void test_omaha_holdem_5485_4h7s9hAsKc_Jc3h5hAc_QdTd3s6h_2h8d7c2s_4s2d3c8c_JsKh6sJh_Qh9d9s9c_6d5s5d7h_Kd3dQs4d() {
    assertEquals(
      "QdTd3s6h 4s2d3c8c 6d5s5d7h 2h8d7c2s JsKh6sJh Jc3h5hAc Kd3dQs4d Qh9d9s9c",
      Solver.process("omaha-holdem 4h7s9hAsKc Jc3h5hAc QdTd3s6h 2h8d7c2s 4s2d3c8c JsKh6sJh Qh9d9s9c 6d5s5d7h Kd3dQs4d"));
  }

  @Test
  public void test_omaha_holdem_5486_6h6s7dKhKs_Kc3h9dJh_Qc7sJdJc_TdTcQd4d_2s4c3d2h_Ts6d9s8d() {
    assertEquals(
      "2s4c3d2h TdTcQd4d Qc7sJdJc Ts6d9s8d Kc3h9dJh",
      Solver.process("omaha-holdem 6h6s7dKhKs Kc3h9dJh Qc7sJdJc TdTcQd4d 2s4c3d2h Ts6d9s8d"));
  }

  @Test
  public void test_omaha_holdem_5487_4d9c9hJcTh_JsQs7c8d_As9d4sKc_TdTsQhQc_8s4c7s5h() {
    assertEquals(
      "8s4c7s5h JsQs7c8d As9d4sKc TdTsQhQc",
      Solver.process("omaha-holdem 4d9c9hJcTh JsQs7c8d As9d4sKc TdTsQhQc 8s4c7s5h"));
  }

  @Test
  public void test_omaha_holdem_5488_4s6c8dJhKs_Qs4c7cTh_Td7d9s2c_4dKc6dKh_KdTc9dAh() {
    assertEquals(
      "Td7d9s2c Qs4c7cTh KdTc9dAh 4dKc6dKh",
      Solver.process("omaha-holdem 4s6c8dJhKs Qs4c7cTh Td7d9s2c 4dKc6dKh KdTc9dAh"));
  }

  @Test
  public void test_omaha_holdem_5489_6h7sJdQcTc_6c4hKh2c_5d5cTs5h_2hKs5s6s_Qh3c7c7d_3d8s9c8d_3sKd8hTd_7h9d3hAc_2d4sAd4d_Qd2s4cJh() {
    assertEquals(
      "2d4sAd4d 2hKs5s6s=6c4hKh2c 7h9d3hAc 5d5cTs5h 3sKd8hTd Qd2s4cJh Qh3c7c7d 3d8s9c8d",
      Solver.process("omaha-holdem 6h7sJdQcTc 6c4hKh2c 5d5cTs5h 2hKs5s6s Qh3c7c7d 3d8s9c8d 3sKd8hTd 7h9d3hAc 2d4sAd4d Qd2s4cJh"));
  }

  @Test
  public void test_omaha_holdem_5490_4s7d9sKsTd_Tc2c4c6c_6sKcJcQs_8dQdAd8c_8hJhQh5s_3h9h4hAs_5d5hThTs_3c3d7c7s_9cKd2s5c() {
    assertEquals(
      "8dQdAd8c 3h9h4hAs Tc2c4c6c 9cKd2s5c 3c3d7c7s 5d5hThTs 8hJhQh5s 6sKcJcQs",
      Solver.process("omaha-holdem 4s7d9sKsTd Tc2c4c6c 6sKcJcQs 8dQdAd8c 8hJhQh5s 3h9h4hAs 5d5hThTs 3c3d7c7s 9cKd2s5c"));
  }

  @Test
  public void test_omaha_holdem_5491_4h4s5c8sAd_6s2h9h6d_8h3hQd3d() {
    assertEquals(
      "6s2h9h6d 8h3hQd3d",
      Solver.process("omaha-holdem 4h4s5c8sAd 6s2h9h6d 8h3hQd3d"));
  }

  @Test
  public void test_omaha_holdem_5492_2c4s6d8d9s_5d2h6hTd_7d9cAc3c_2d7s5h4c_3dTc5sQh_KdJh8c9h_Js9dJd6s_JcAd4hAh_5c8s3s7c_QcAsQs4d() {
    assertEquals(
      "7d9cAc3c QcAsQs4d JcAd4hAh 5d2h6hTd Js9dJd6s KdJh8c9h 3dTc5sQh 2d7s5h4c=5c8s3s7c",
      Solver.process("omaha-holdem 2c4s6d8d9s 5d2h6hTd 7d9cAc3c 2d7s5h4c 3dTc5sQh KdJh8c9h Js9dJd6s JcAd4hAh 5c8s3s7c QcAsQs4d"));
  }

  @Test
  public void test_omaha_holdem_5493_2c6cJcJhKh_2hQs8dTc_7cQcJs7h_Td7s8cKs_5d2d4h3h_Th2s5cJd_9h9c5s3c_8s4c6hKc_7d3d4dTs() {
    assertEquals(
      "7d3d4dTs 5d2d4h3h 2hQs8dTc Td7s8cKs 9h9c5s3c 7cQcJs7h 8s4c6hKc Th2s5cJd",
      Solver.process("omaha-holdem 2c6cJcJhKh 2hQs8dTc 7cQcJs7h Td7s8cKs 5d2d4h3h Th2s5cJd 9h9c5s3c 8s4c6hKc 7d3d4dTs"));
  }

  @Test
  public void test_omaha_holdem_5494_4d5d5sJcKc_Ad3s3c8d_As6c5h7s_9h6h9cJs_6s4s8cKs_Kh7dJd7c_3hTd4c8s_Jh4h9s3d_ThTsAh2s_6d2c9dQd() {
    assertEquals(
      "6d2c9dQd Ad3s3c8d 3hTd4c8s ThTsAh2s 9h6h9cJs=Jh4h9s3d 6s4s8cKs Kh7dJd7c As6c5h7s",
      Solver.process("omaha-holdem 4d5d5sJcKc Ad3s3c8d As6c5h7s 9h6h9cJs 6s4s8cKs Kh7dJd7c 3hTd4c8s Jh4h9s3d ThTsAh2s 6d2c9dQd"));
  }

  @Test
  public void test_omaha_holdem_5495_2d3d4h5d5h_6c9h3s4d_Ah9s7h7c_2s7d4sKc_AcJs9dTd_Qc6sQh8d_6h3h8s5s_8cAs6dTh_QsKh7s5c() {
    assertEquals(
      "8cAs6dTh 2s7d4sKc Ah9s7h7c Qc6sQh8d QsKh7s5c 6c9h3s4d AcJs9dTd 6h3h8s5s",
      Solver.process("omaha-holdem 2d3d4h5d5h 6c9h3s4d Ah9s7h7c 2s7d4sKc AcJs9dTd Qc6sQh8d 6h3h8s5s 8cAs6dTh QsKh7s5c"));
  }

  @Test
  public void test_omaha_holdem_5496_9dAdJdKhQc_8dTh5cKc_3s7h3d7s_TdKsJhTs_8sAs5s2h_Tc8h6hAh_2d4c5d2s() {
    assertEquals(
      "3s7h3d7s 8sAs5s2h 8dTh5cKc=Tc8h6hAh=TdKsJhTs 2d4c5d2s",
      Solver.process("omaha-holdem 9dAdJdKhQc 8dTh5cKc 3s7h3d7s TdKsJhTs 8sAs5s2h Tc8h6hAh 2d4c5d2s"));
  }

  @Test
  public void test_omaha_holdem_5497_2s4cAdJcKh_6c5h3s5d_KsQsTc8c_ThTsQc9c_4d5cJs6h_9dAs3c8d() {
    assertEquals(
      "9dAs3c8d 4d5cJs6h 6c5h3s5d KsQsTc8c=ThTsQc9c",
      Solver.process("omaha-holdem 2s4cAdJcKh 6c5h3s5d KsQsTc8c ThTsQc9c 4d5cJs6h 9dAs3c8d"));
  }

  @Test
  public void test_omaha_holdem_5498_2c3dQcQhTs_5hKd8c5d_5c2s7sQs_Jh3h8dJc_6s6d8h9c_4sKhQd4c_Ac8sTcAd_Kc7dAh9d() {
    assertEquals(
      "Kc7dAh9d 5hKd8c5d 6s6d8h9c Jh3h8dJc Ac8sTcAd 4sKhQd4c 5c2s7sQs",
      Solver.process("omaha-holdem 2c3dQcQhTs 5hKd8c5d 5c2s7sQs Jh3h8dJc 6s6d8h9c 4sKhQd4c Ac8sTcAd Kc7dAh9d"));
  }

  @Test
  public void test_omaha_holdem_5499_2d4d9dJhTh_Ts6c4h2s_JdJs9sQh_7c2c4c8c_Tc5c6s3d_KsQd2h7s_Qc3sKc6d_JcKd6h5s_9cAh3h9h_Kh3c8h8d() {
    assertEquals(
      "Kh3c8h8d Tc5c6s3d JcKd6h5s Ts6c4h2s 9cAh3h9h JdJs9sQh 7c2c4c8c KsQd2h7s=Qc3sKc6d",
      Solver.process("omaha-holdem 2d4d9dJhTh Ts6c4h2s JdJs9sQh 7c2c4c8c Tc5c6s3d KsQd2h7s Qc3sKc6d JcKd6h5s 9cAh3h9h Kh3c8h8d"));
  }

}
