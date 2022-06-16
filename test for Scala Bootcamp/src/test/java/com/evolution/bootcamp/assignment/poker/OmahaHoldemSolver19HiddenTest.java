
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OmahaHoldemSolver19HiddenTest {


  @Test
  public void test_omaha_holdem_4750_2cJcTcTdTh_Ac4c5s6c_3c2s7d8d_Ks6h5h8h_Qs9h5d3h_Qh3d6d4s_8cKd7h2h_4d6s4hAd() {
    assertEquals(
      "3c2s7d8d Qh3d6d4s Qs9h5d3h 8cKd7h2h=Ks6h5h8h Ac4c5s6c 4d6s4hAd",
      Solver.process("omaha-holdem 2cJcTcTdTh Ac4c5s6c 3c2s7d8d Ks6h5h8h Qs9h5d3h Qh3d6d4s 8cKd7h2h 4d6s4hAd"));
  }

  @Test
  public void test_omaha_holdem_4751_2s5hJhJsQs_9dAc9h4c_Ks2c3s4d_Th7dQd9c_5dAhKd5c_6cTdQhJc_6dAd8sJd() {
    assertEquals(
      "9dAc9h4c Th7dQd9c 6dAd8sJd Ks2c3s4d 5dAhKd5c 6cTdQhJc",
      Solver.process("omaha-holdem 2s5hJhJsQs 9dAc9h4c Ks2c3s4d Th7dQd9c 5dAhKd5c 6cTdQhJc 6dAd8sJd"));
  }

  @Test
  public void test_omaha_holdem_4752_5d5h8c9hAs_Ah7c6c9s_2cQdThQh_4cJh7h2h() {
    assertEquals(
      "4cJh7h2h 2cQdThQh Ah7c6c9s",
      Solver.process("omaha-holdem 5d5h8c9hAs Ah7c6c9s 2cQdThQh 4cJh7h2h"));
  }

  @Test
  public void test_omaha_holdem_4753_2c2d2h3c6h_Ts5h9sKc_8dJd5sJs_4dQdTc5c_8c7s5d3s() {
    assertEquals(
      "8c7s5d3s Ts5h9sKc 4dQdTc5c 8dJd5sJs",
      Solver.process("omaha-holdem 2c2d2h3c6h Ts5h9sKc 8dJd5sJs 4dQdTc5c 8c7s5d3s"));
  }

  @Test
  public void test_omaha_holdem_4754_5s6c7sAsJc_8sAd9dQs_6sKhTd4d_7h3c9cKd_7cKcTs2h_7d2s3s2c_8d5dKsJs_Ac8hTh2d_3dQdAh4s_6h9sJd3h() {
    assertEquals(
      "6sKhTd4d 7cKcTs2h=7h3c9cKd Ac8hTh2d 6h9sJd3h 3dQdAh4s 7d2s3s2c 8sAd9dQs 8d5dKsJs",
      Solver.process("omaha-holdem 5s6c7sAsJc 8sAd9dQs 6sKhTd4d 7h3c9cKd 7cKcTs2h 7d2s3s2c 8d5dKsJs Ac8hTh2d 3dQdAh4s 6h9sJd3h"));
  }

  @Test
  public void test_omaha_holdem_4755_2c5s6c9sJh_6d5d4c4d_Td7h4s7s_6h8h5hKc() {
    assertEquals(
      "Td7h4s7s 6d5d4c4d=6h8h5hKc",
      Solver.process("omaha-holdem 2c5s6c9sJh 6d5d4c4d Td7h4s7s 6h8h5hKc"));
  }

  @Test
  public void test_omaha_holdem_4756_6c6h7dJdQh_6d5cQc3s_8c8s5h8h_7c3dQd2h_TcKc6sKh_4hTsAhJh() {
    assertEquals(
      "8c8s5h8h 4hTsAhJh 7c3dQd2h TcKc6sKh 6d5cQc3s",
      Solver.process("omaha-holdem 6c6h7dJdQh 6d5cQc3s 8c8s5h8h 7c3dQd2h TcKc6sKh 4hTsAhJh"));
  }

  @Test
  public void test_omaha_holdem_4757_2h4h9c9dTc_2cTsKh8c_8d2sAc6d_QdQs7c3c_2d5dKdAh_6h8s3s5s_3h7s5cQc_Jc9sTd4c_9h5hJsKc() {
    assertEquals(
      "6h8s3s5s 3h7s5cQc 2d5dKdAh=8d2sAc6d 2cTsKh8c QdQs7c3c 9h5hJsKc Jc9sTd4c",
      Solver.process("omaha-holdem 2h4h9c9dTc 2cTsKh8c 8d2sAc6d QdQs7c3c 2d5dKdAh 6h8s3s5s 3h7s5cQc Jc9sTd4c 9h5hJsKc"));
  }

  @Test
  public void test_omaha_holdem_4758_2s7s8d9hKh_QhQd4s3d_9sQcJhJs_3c5s2c6h_5cAd7h6c() {
    assertEquals(
      "9sQcJhJs QhQd4s3d 3c5s2c6h=5cAd7h6c",
      Solver.process("omaha-holdem 2s7s8d9hKh QhQd4s3d 9sQcJhJs 3c5s2c6h 5cAd7h6c"));
  }

  @Test
  public void test_omaha_holdem_4759_4c6c6s7c9s_3h6dAsJs_5s7hQsAd_Jd8c7dJh_QdKc5d3c_4d4s3s2c_9cTc2hKs_AhQc9hQh_6h7sJc5c_8hAc5hKd() {
    assertEquals(
      "5s7hQsAd Jd8c7dJh AhQc9hQh 3h6dAsJs 8hAc5hKd 9cTc2hKs QdKc5d3c 4d4s3s2c 6h7sJc5c",
      Solver.process("omaha-holdem 4c6c6s7c9s 3h6dAsJs 5s7hQsAd Jd8c7dJh QdKc5d3c 4d4s3s2c 9cTc2hKs AhQc9hQh 6h7sJc5c 8hAc5hKd"));
  }

  @Test
  public void test_omaha_holdem_4760_2s4h8sKhQc_5c4sQdJc_7c2c4c6h_ThKc3dQh() {
    assertEquals(
      "7c2c4c6h 5c4sQdJc ThKc3dQh",
      Solver.process("omaha-holdem 2s4h8sKhQc 5c4sQdJc 7c2c4c6h ThKc3dQh"));
  }

  @Test
  public void test_omaha_holdem_4761_3c4d8s9sQh_JsAcAh6c_2hQd3h3s_8cAs5c6s_Kd6hJhKc_4c9cAd4s_4h2d7dTd() {
    assertEquals(
      "4h2d7dTd 8cAs5c6s Kd6hJhKc JsAcAh6c 2hQd3h3s 4c9cAd4s",
      Solver.process("omaha-holdem 3c4d8s9sQh JsAcAh6c 2hQd3h3s 8cAs5c6s Kd6hJhKc 4c9cAd4s 4h2d7dTd"));
  }

  @Test
  public void test_omaha_holdem_4762_6h8h8s9dQc_KsJc2d2c_Ad7cThTs_8dTcJd5d_Jh9h3c5c_Qs7s4d5s() {
    assertEquals(
      "KsJc2d2c Jh9h3c5c Qs7s4d5s Ad7cThTs 8dTcJd5d",
      Solver.process("omaha-holdem 6h8h8s9dQc KsJc2d2c Ad7cThTs 8dTcJd5d Jh9h3c5c Qs7s4d5s"));
  }

  @Test
  public void test_omaha_holdem_4763_2d3h3s7sQc_4c9h7cTh_2c3c5h7d_6d4dJdQs_Kd2h9c7h_Kh8s6hAh_8dKc8h4h() {
    assertEquals(
      "Kh8s6hAh 4c9h7cTh Kd2h9c7h 8dKc8h4h 6d4dJdQs 2c3c5h7d",
      Solver.process("omaha-holdem 2d3h3s7sQc 4c9h7cTh 2c3c5h7d 6d4dJdQs Kd2h9c7h Kh8s6hAh 8dKc8h4h"));
  }

  @Test
  public void test_omaha_holdem_4764_3d6h8cJcQs_Th4hTd5h_AdKh5d4d_6d9sAs7d_KdJd4cAh_3s2hQc3c_9dQd9c8s_6cJs8dTs_2d2sKsQh_7c5s9h7s() {
    assertEquals(
      "AdKh5d4d 6d9sAs7d 7c5s9h7s Th4hTd5h KdJd4cAh 2d2sKsQh 6cJs8dTs 9dQd9c8s 3s2hQc3c",
      Solver.process("omaha-holdem 3d6h8cJcQs Th4hTd5h AdKh5d4d 6d9sAs7d KdJd4cAh 3s2hQc3c 9dQd9c8s 6cJs8dTs 2d2sKsQh 7c5s9h7s"));
  }

  @Test
  public void test_omaha_holdem_4765_2h6s9cAdKs_3hAsQh4s_8c9h3d5s_Ah2sQc7s_Jd5cKd6h_JsTdKhJh_2c4cQd6c_Ts8d8h9d_3s6d7h5d_2d7d5h4d() {
    assertEquals(
      "2d7d5h4d 3s6d7h5d 8c9h3d5s Ts8d8h9d JsTdKhJh 3hAsQh4s 2c4cQd6c Jd5cKd6h Ah2sQc7s",
      Solver.process("omaha-holdem 2h6s9cAdKs 3hAsQh4s 8c9h3d5s Ah2sQc7s Jd5cKd6h JsTdKhJh 2c4cQd6c Ts8d8h9d 3s6d7h5d 2d7d5h4d"));
  }

  @Test
  public void test_omaha_holdem_4766_2d3s4s7hQc_9h8d5h8c_AcAs7d3c_KdQhKc3h_Js8h5s3d_KhTd7c8s_Ks9s6h4c_7sTs6d6s() {
    assertEquals(
      "Js8h5s3d Ks9s6h4c 7sTs6d6s KhTd7c8s 9h8d5h8c AcAs7d3c KdQhKc3h",
      Solver.process("omaha-holdem 2d3s4s7hQc 9h8d5h8c AcAs7d3c KdQhKc3h Js8h5s3d KhTd7c8s Ks9s6h4c 7sTs6d6s"));
  }

  @Test
  public void test_omaha_holdem_4767_2h8hAsJhKc_8sQs3d8c_2c9h6sJc_Ad7h7c9d_5s9sQhTd_JsTs4hJd() {
    assertEquals(
      "Ad7h7c9d 2c9h6sJc 8sQs3d8c JsTs4hJd 5s9sQhTd",
      Solver.process("omaha-holdem 2h8hAsJhKc 8sQs3d8c 2c9h6sJc Ad7h7c9d 5s9sQhTd JsTs4hJd"));
  }

  @Test
  public void test_omaha_holdem_4768_3s6s9hAsQh_5c6d2d4h_AcKh2sKd_2c7s2h8s_5sJh9c3c_4sJs3h6c_Jd5hQsKc_8h7d8dTd_9dAd9sTh_Ts7cAh3d() {
    assertEquals(
      "5c6d2d4h 8h7d8dTd Jd5hQsKc AcKh2sKd 5sJh9c3c Ts7cAh3d 9dAd9sTh 2c7s2h8s 4sJs3h6c",
      Solver.process("omaha-holdem 3s6s9hAsQh 5c6d2d4h AcKh2sKd 2c7s2h8s 5sJh9c3c 4sJs3h6c Jd5hQsKc 8h7d8dTd 9dAd9sTh Ts7cAh3d"));
  }

  @Test
  public void test_omaha_holdem_4769_5h6hAhAsQc_Kc9dJdQh_9s7s2c6d_Ad3c6cKh_4dAc8c9c_7cQs2dTd_4cJc7hKs_Jh3s8s9h() {
    assertEquals(
      "4cJc7hKs 9s7s2c6d 7cQs2dTd Kc9dJdQh 4dAc8c9c Jh3s8s9h Ad3c6cKh",
      Solver.process("omaha-holdem 5h6hAhAsQc Kc9dJdQh 9s7s2c6d Ad3c6cKh 4dAc8c9c 7cQs2dTd 4cJc7hKs Jh3s8s9h"));
  }

  @Test
  public void test_omaha_holdem_4770_2h5d6s7s8c_Ks3d5cAd_Jh4c6c3s_9dQd3cQc_Ac4hTcKc() {
    assertEquals(
      "Ac4hTcKc Ks3d5cAd 9dQd3cQc Jh4c6c3s",
      Solver.process("omaha-holdem 2h5d6s7s8c Ks3d5cAd Jh4c6c3s 9dQd3cQc Ac4hTcKc"));
  }

  @Test
  public void test_omaha_holdem_4771_4d8cAsKhTh_5c2hTdQd_Js4sTc9c_2c8s3s9s() {
    assertEquals(
      "2c8s3s9s 5c2hTdQd Js4sTc9c",
      Solver.process("omaha-holdem 4d8cAsKhTh 5c2hTdQd Js4sTc9c 2c8s3s9s"));
  }

  @Test
  public void test_omaha_holdem_4772_4d6d7s8hQs_5cQd6cAs_2sTsAc5d_Tc7c3sJs_Ah3c9c2h() {
    assertEquals(
      "Ah3c9c2h 2sTsAc5d Tc7c3sJs 5cQd6cAs",
      Solver.process("omaha-holdem 4d6d7s8hQs 5cQd6cAs 2sTsAc5d Tc7c3sJs Ah3c9c2h"));
  }

  @Test
  public void test_omaha_holdem_4773_4s6s9sAhTd_Qh7c8c2d_7h9cAc6c_Qd6d6h4h_Th7dQs3d() {
    assertEquals(
      "Th7dQs3d 7h9cAc6c Qd6d6h4h Qh7c8c2d",
      Solver.process("omaha-holdem 4s6s9sAhTd Qh7c8c2d 7h9cAc6c Qd6d6h4h Th7dQs3d"));
  }

  @Test
  public void test_omaha_holdem_4774_4h6hJhJsTc_9cQc5cTh_7sJd4c8s_2h5s6sAs_3sKc2c4d_9h7hKh2s_Ad6d7d5h_Ts8d3d3h() {
    assertEquals(
      "3sKc2c4d 2h5s6sAs=Ad6d7d5h Ts8d3d3h 9cQc5cTh 9h7hKh2s 7sJd4c8s",
      Solver.process("omaha-holdem 4h6hJhJsTc 9cQc5cTh 7sJd4c8s 2h5s6sAs 3sKc2c4d 9h7hKh2s Ad6d7d5h Ts8d3d3h"));
  }

  @Test
  public void test_omaha_holdem_4775_2d3h6c8hTs_7s7hAhKs_QcKc9d5d_3cKhJdTc_Kd7c4s4d_6dAc2h8c_9c9sQd2s_4h5c5sQs() {
    assertEquals(
      "QcKc9d5d Kd7c4s4d 7s7hAhKs 9c9sQd2s 6dAc2h8c 3cKhJdTc 4h5c5sQs",
      Solver.process("omaha-holdem 2d3h6c8hTs 7s7hAhKs QcKc9d5d 3cKhJdTc Kd7c4s4d 6dAc2h8c 9c9sQd2s 4h5c5sQs"));
  }

  @Test
  public void test_omaha_holdem_4776_3c4h6s8hAd_2cQc8d4c_Ah7c3d9h_5c5hJh3h_4s9sQd9d_3sKsTs6d_8cKd7hAs_9cQs7d2s() {
    assertEquals(
      "9cQs7d2s 5c5hJh3h 4s9sQd9d 3sKsTs6d 2cQc8d4c Ah7c3d9h 8cKd7hAs",
      Solver.process("omaha-holdem 3c4h6s8hAd 2cQc8d4c Ah7c3d9h 5c5hJh3h 4s9sQd9d 3sKsTs6d 8cKd7hAs 9cQs7d2s"));
  }

  @Test
  public void test_omaha_holdem_4777_2d3d4s6d7c_8s4h4cQh_5sAs2h7s_3s6h5dJd_8cKdAc5h() {
    assertEquals(
      "8s4h4cQh 5sAs2h7s 8cKdAc5h 3s6h5dJd",
      Solver.process("omaha-holdem 2d3d4s6d7c 8s4h4cQh 5sAs2h7s 3s6h5dJd 8cKdAc5h"));
  }

  @Test
  public void test_omaha_holdem_4778_4d6cKsThTs_7s6s5sAc_Qs7h9sTc_3dJcTdKc_8d7cAsQc_3sAhQd6h_9d4h4c5c_KdKh3c9h_4sQhJhJd_2s8c9c8s() {
    assertEquals(
      "8d7cAsQc 3sAhQd6h=7s6s5sAc 2s8c9c8s 4sQhJhJd Qs7h9sTc 9d4h4c5c 3dJcTdKc KdKh3c9h",
      Solver.process("omaha-holdem 4d6cKsThTs 7s6s5sAc Qs7h9sTc 3dJcTdKc 8d7cAsQc 3sAhQd6h 9d4h4c5c KdKh3c9h 4sQhJhJd 2s8c9c8s"));
  }

  @Test
  public void test_omaha_holdem_4779_5s8hAhJdTs_7c2d5dAd_7h5cTd4h_5hThJs4s_9d6h2hQh_KcJc8c8d() {
    assertEquals(
      "7h5cTd4h 5hThJs4s 7c2d5dAd KcJc8c8d 9d6h2hQh",
      Solver.process("omaha-holdem 5s8hAhJdTs 7c2d5dAd 7h5cTd4h 5hThJs4s 9d6h2hQh KcJc8c8d"));
  }

  @Test
  public void test_omaha_holdem_4780_3c3hJsKsTs_Ad8d4dKc_2d3sTcTh_JcTd2c2h_QhKhAc2s_8c4cQc9d_7dAs4s4h() {
    assertEquals(
      "JcTd2c2h Ad8d4dKc 8c4cQc9d QhKhAc2s 7dAs4s4h 2d3sTcTh",
      Solver.process("omaha-holdem 3c3hJsKsTs Ad8d4dKc 2d3sTcTh JcTd2c2h QhKhAc2s 8c4cQc9d 7dAs4s4h"));
  }

  @Test
  public void test_omaha_holdem_4781_3d8d9dKhQd_Qs9s4hTd_2dJs8h2s_4s9c3c6d_Kd2cAd7h_As9h6cJh_AcQh5d7c_4c5s7dKc() {
    assertEquals(
      "2dJs8h2s As9h6cJh AcQh5d7c 4c5s7dKc 4s9c3c6d Qs9s4hTd Kd2cAd7h",
      Solver.process("omaha-holdem 3d8d9dKhQd Qs9s4hTd 2dJs8h2s 4s9c3c6d Kd2cAd7h As9h6cJh AcQh5d7c 4c5s7dKc"));
  }

  @Test
  public void test_omaha_holdem_4782_2h5h6hKsQs_AcQcTd3s_4s2dTh8d_Js7s4h2s() {
    assertEquals(
      "4s2dTh8d Js7s4h2s AcQcTd3s",
      Solver.process("omaha-holdem 2h5h6hKsQs AcQcTd3s 4s2dTh8d Js7s4h2s"));
  }

  @Test
  public void test_omaha_holdem_4783_2d2s8d9dJd_JsQc3c9c_AcTh3sQh_3h9sTd7c_4h6h4sTs_6cKd9h8h_QdJcAs5d() {
    assertEquals(
      "4h6h4sTs 6cKd9h8h JsQc3c9c 3h9sTd7c AcTh3sQh QdJcAs5d",
      Solver.process("omaha-holdem 2d2s8d9dJd JsQc3c9c AcTh3sQh 3h9sTd7c 4h6h4sTs 6cKd9h8h QdJcAs5d"));
  }

  @Test
  public void test_omaha_holdem_4784_8cJcKcQcTh_6c7c3d8s_4dJd9s5d_Ac4hAh7h() {
    assertEquals(
      "Ac4hAh7h 4dJd9s5d 6c7c3d8s",
      Solver.process("omaha-holdem 8cJcKcQcTh 6c7c3d8s 4dJd9s5d Ac4hAh7h"));
  }

  @Test
  public void test_omaha_holdem_4785_4c6h7sJdQc_5c2dTs6s_8sJs5d2h() {
    assertEquals(
      "5c2dTs6s 8sJs5d2h",
      Solver.process("omaha-holdem 4c6h7sJdQc 5c2dTs6s 8sJs5d2h"));
  }

  @Test
  public void test_omaha_holdem_4786_4sJdKdQdQh_6c3sAs6h_Kh8d4h5h_9h7sAhJh_8s9d2s9s_TsQs9c2d_5d8c5s7c_7dQcThJs_TdKc3h3c() {
    assertEquals(
      "5d8c5s7c 6c3sAs6h 8s9d2s9s 9h7sAhJh Kh8d4h5h TdKc3h3c TsQs9c2d 7dQcThJs",
      Solver.process("omaha-holdem 4sJdKdQdQh 6c3sAs6h Kh8d4h5h 9h7sAhJh 8s9d2s9s TsQs9c2d 5d8c5s7c 7dQcThJs TdKc3h3c"));
  }

  @Test
  public void test_omaha_holdem_4787_2s8hQdQhTd_7dTc8c3c_4d9d5cKh_5d6h5hQs_9hAsKs5s_6sAdThJs_Qc8d3s6d() {
    assertEquals(
      "4d9d5cKh 9hAsKs5s 7dTc8c3c 6sAdThJs 5d6h5hQs Qc8d3s6d",
      Solver.process("omaha-holdem 2s8hQdQhTd 7dTc8c3c 4d9d5cKh 5d6h5hQs 9hAsKs5s 6sAdThJs Qc8d3s6d"));
  }

  @Test
  public void test_omaha_holdem_4788_5s6d8h9h9s_AdTsAc2h_KsQd7h8s_4cKh7c2c() {
    assertEquals(
      "AdTsAc2h 4cKh7c2c KsQd7h8s",
      Solver.process("omaha-holdem 5s6d8h9h9s AdTsAc2h KsQd7h8s 4cKh7c2c"));
  }

  @Test
  public void test_omaha_holdem_4789_3c7sAcKhQd_QcKc6s9d_8dAhQhAd_JdTd4d4h_7c3sJhKs_JsTs8h3h_5s2cTh6c() {
    assertEquals(
      "5s2cTh6c 7c3sJhKs QcKc6s9d 8dAhQhAd JdTd4d4h=JsTs8h3h",
      Solver.process("omaha-holdem 3c7sAcKhQd QcKc6s9d 8dAhQhAd JdTd4d4h 7c3sJhKs JsTs8h3h 5s2cTh6c"));
  }

  @Test
  public void test_omaha_holdem_4790_5d7sAsKhTh_Js2h3cQh_Qd7h9sTc_9c6d9d8s_3sKdJh4s_6h3dTs4d_8hQcJdAd_Td9h8c5c_5s6cAcKs() {
    assertEquals(
      "9c6d9d8s 6h3dTs4d 3sKdJh4s Td9h8c5c Qd7h9sTc 5s6cAcKs 8hQcJdAd=Js2h3cQh",
      Solver.process("omaha-holdem 5d7sAsKhTh Js2h3cQh Qd7h9sTc 9c6d9d8s 3sKdJh4s 6h3dTs4d 8hQcJdAd Td9h8c5c 5s6cAcKs"));
  }

  @Test
  public void test_omaha_holdem_4791_5c5d5hAdJc_7cTs2s2h_JdTh8d7h_9s5s4s8h_3cJh6hQd_Td8s6cJs_4h6s9h2d() {
    assertEquals(
      "4h6s9h2d JdTh8d7h=Td8s6cJs 3cJh6hQd 7cTs2s2h 9s5s4s8h",
      Solver.process("omaha-holdem 5c5d5hAdJc 7cTs2s2h JdTh8d7h 9s5s4s8h 3cJh6hQd Td8s6cJs 4h6s9h2d"));
  }

  @Test
  public void test_omaha_holdem_4792_2d4c5cKsTc_9hTh9c3d_Ac8d9sKd_3s5sKhJc_As5dAd8h() {
    assertEquals(
      "9hTh9c3d Ac8d9sKd As5dAd8h 3s5sKhJc",
      Solver.process("omaha-holdem 2d4c5cKsTc 9hTh9c3d Ac8d9sKd 3s5sKhJc As5dAd8h"));
  }

  @Test
  public void test_omaha_holdem_4793_5h5s8sJsTd_6d4cQhAs_7s3h5cTh_2cJc2sAh() {
    assertEquals(
      "6d4cQhAs 2cJc2sAh 7s3h5cTh",
      Solver.process("omaha-holdem 5h5s8sJsTd 6d4cQhAs 7s3h5cTh 2cJc2sAh"));
  }

  @Test
  public void test_omaha_holdem_4794_4h7d8s9cQs_2hKcAs3s_6s5cTs3c_JcQc8c7s_9hJdAhQh_Kh7cAcQd() {
    assertEquals(
      "2hKcAs3s Kh7cAcQd JcQc8c7s 9hJdAhQh 6s5cTs3c",
      Solver.process("omaha-holdem 4h7d8s9cQs 2hKcAs3s 6s5cTs3c JcQc8c7s 9hJdAhQh Kh7cAcQd"));
  }

  @Test
  public void test_omaha_holdem_4795_2d2sAdAhTd_8s3cQc4d_Tc7c6c6s_6d9sQsAs_2h7d4s8c_4c5h3sQh_Th7s9dJs() {
    assertEquals(
      "4c5h3sQh 8s3cQc4d Tc7c6c6s Th7s9dJs 2h7d4s8c 6d9sQsAs",
      Solver.process("omaha-holdem 2d2sAdAhTd 8s3cQc4d Tc7c6c6s 6d9sQsAs 2h7d4s8c 4c5h3sQh Th7s9dJs"));
  }

  @Test
  public void test_omaha_holdem_4796_2d4h6d8hAs_5h5sJd4c_Th2c9c6h_7s7cTdAc() {
    assertEquals(
      "5h5sJd4c 7s7cTdAc Th2c9c6h",
      Solver.process("omaha-holdem 2d4h6d8hAs 5h5sJd4c Th2c9c6h 7s7cTdAc"));
  }

  @Test
  public void test_omaha_holdem_4797_2c4h5d9dQs_5cQd5sAs_3c7c5hKs_9cAc6cAd_6d4cJhQc_8s8h7h4d_Ah2sTdJd_7s6sKh3s() {
    assertEquals(
      "Ah2sTdJd 3c7c5hKs 8s8h7h4d 9cAc6cAd 6d4cJhQc 5cQd5sAs 7s6sKh3s",
      Solver.process("omaha-holdem 2c4h5d9dQs 5cQd5sAs 3c7c5hKs 9cAc6cAd 6d4cJhQc 8s8h7h4d Ah2sTdJd 7s6sKh3s"));
  }

  @Test
  public void test_omaha_holdem_4798_4c4h7s8dAh_3c6hQsJh_5h9hQd4s_2h7h8cTs_3h6s7c6d_8sJd8hKs_9c2sQcKd_Tc3s9s2c_Th5c5sQh() {
    assertEquals(
      "Tc3s9s2c 3c6hQsJh 9c2sQcKd Th5c5sQh 3h6s7c6d 2h7h8cTs 5h9hQd4s 8sJd8hKs",
      Solver.process("omaha-holdem 4c4h7s8dAh 3c6hQsJh 5h9hQd4s 2h7h8cTs 3h6s7c6d 8sJd8hKs 9c2sQcKd Tc3s9s2c Th5c5sQh"));
  }

  @Test
  public void test_omaha_holdem_4799_6d8s9dAdTc_Jc7h5c4h_KdTd2h8d_5h9c2sKs_As2d3sQh_6h4cAh4s() {
    assertEquals(
      "5h9c2sKs As2d3sQh 6h4cAh4s Jc7h5c4h KdTd2h8d",
      Solver.process("omaha-holdem 6d8s9dAdTc Jc7h5c4h KdTd2h8d 5h9c2sKs As2d3sQh 6h4cAh4s"));
  }

  @Test
  public void test_omaha_holdem_4800_2d5s8dKhTh_9dKsQd8h_3cQsAc3h_6s4h8cTc_4sJcKc8s_Td6d7h9h_TsJd5dQc_2cJsKd5h_6h7d5c9c() {
    assertEquals(
      "3cQsAc3h 6h7d5c9c Td6d7h9h TsJd5dQc 6s4h8cTc 2cJsKd5h 4sJcKc8s=9dKsQd8h",
      Solver.process("omaha-holdem 2d5s8dKhTh 9dKsQd8h 3cQsAc3h 6s4h8cTc 4sJcKc8s Td6d7h9h TsJd5dQc 2cJsKd5h 6h7d5c9c"));
  }

  @Test
  public void test_omaha_holdem_4801_5c5d6cQcQs_8sAcJh9h_Kc5s5h9s_2sAhTh6s_4s6h3dQh_Td4c7d2c_7c8c3c2d_Jd7sKd8d_3sJs4hJc() {
    assertEquals(
      "Jd7sKd8d 8sAcJh9h 2sAhTh6s 3sJs4hJc Td4c7d2c 7c8c3c2d 4s6h3dQh Kc5s5h9s",
      Solver.process("omaha-holdem 5c5d6cQcQs 8sAcJh9h Kc5s5h9s 2sAhTh6s 4s6h3dQh Td4c7d2c 7c8c3c2d Jd7sKd8d 3sJs4hJc"));
  }

  @Test
  public void test_omaha_holdem_4802_2c2h4h4sKs_Kh2d2s9d_AsJs5h7d_5d5cQd7s_3h4d3cTc_Kd3s4c9h_8s9cAhJc_6hQsAc3d() {
    assertEquals(
      "8s9cAhJc=AsJs5h7d 6hQsAc3d 5d5cQd7s 3h4d3cTc Kd3s4c9h Kh2d2s9d",
      Solver.process("omaha-holdem 2c2h4h4sKs Kh2d2s9d AsJs5h7d 5d5cQd7s 3h4d3cTc Kd3s4c9h 8s9cAhJc 6hQsAc3d"));
  }

  @Test
  public void test_omaha_holdem_4803_4s7c9hJsQs_5s3d2h9s_9cTcTd8h_ThKdQc3c_Qd7d8s6d() {
    assertEquals(
      "Qd7d8s6d 9cTcTd8h ThKdQc3c 5s3d2h9s",
      Solver.process("omaha-holdem 4s7c9hJsQs 5s3d2h9s 9cTcTd8h ThKdQc3c Qd7d8s6d"));
  }

  @Test
  public void test_omaha_holdem_4804_2c3h5c6c8d_2dTc7d4d_4hJhKh6d_Qh6h9cQs_7sAh3s8s_8cTsTdJd_3cAsJcQd_4s2s6s7h() {
    assertEquals(
      "8cTsTdJd Qh6h9cQs 7sAh3s8s 4hJhKh6d 2dTc7d4d=4s2s6s7h 3cAsJcQd",
      Solver.process("omaha-holdem 2c3h5c6c8d 2dTc7d4d 4hJhKh6d Qh6h9cQs 7sAh3s8s 8cTsTdJd 3cAsJcQd 4s2s6s7h"));
  }

  @Test
  public void test_omaha_holdem_4805_2s3s5c5sJc_Th6hQc9s_5dKc2h3h_8s4dKd5h_8dTdAcKs_6c8h7h6d() {
    assertEquals(
      "Th6hQc9s 8dTdAcKs 6c8h7h6d 8s4dKd5h 5dKc2h3h",
      Solver.process("omaha-holdem 2s3s5c5sJc Th6hQc9s 5dKc2h3h 8s4dKd5h 8dTdAcKs 6c8h7h6d"));
  }

  @Test
  public void test_omaha_holdem_4806_4c6cAdAhTc_5h3c9h2s_Jc8s3h7h_Td3d2c8d_6d7cJd4s_Jh3s7dQd_KsKdQh5s_2d9sQs8h_Ac6s2h4h_Kc6h9cTh() {
    assertEquals(
      "5h3c9h2s Jc8s3h7h 2d9sQs8h Jh3s7dQd 6d7cJd4s Td3d2c8d KsKdQh5s Kc6h9cTh Ac6s2h4h",
      Solver.process("omaha-holdem 4c6cAdAhTc 5h3c9h2s Jc8s3h7h Td3d2c8d 6d7cJd4s Jh3s7dQd KsKdQh5s 2d9sQs8h Ac6s2h4h Kc6h9cTh"));
  }

  @Test
  public void test_omaha_holdem_4807_5h6c8cQcTh_AhTs3s4s_Jh7s2d2c_2s4cAd9c_8sKs7c3h() {
    assertEquals(
      "Jh7s2d2c 8sKs7c3h AhTs3s4s 2s4cAd9c",
      Solver.process("omaha-holdem 5h6c8cQcTh AhTs3s4s Jh7s2d2c 2s4cAd9c 8sKs7c3h"));
  }

  @Test
  public void test_omaha_holdem_4808_2c3sKdKhQs_Qd7h3dKs_4d9d8dTh_3hJh7s5s_Kc7dAhTc_Jd5c4hQc() {
    assertEquals(
      "4d9d8dTh 3hJh7s5s Jd5c4hQc Kc7dAhTc Qd7h3dKs",
      Solver.process("omaha-holdem 2c3sKdKhQs Qd7h3dKs 4d9d8dTh 3hJh7s5s Kc7dAhTc Jd5c4hQc"));
  }

  @Test
  public void test_omaha_holdem_4809_2s4s7h8c9h_Kh3d3s4c_Qh6hTd6s_2dJhJc9c_5h7sKs4d_3hTc7c9d_5d6cAdKd_7dAc4h9s_5c2cQdQs_QcJd8d6d() {
    assertEquals(
      "Kh3d3s4c QcJd8d6d 5c2cQdQs 5h7sKs4d 2dJhJc9c 3hTc7c9d=7dAc4h9s 5d6cAdKd Qh6hTd6s",
      Solver.process("omaha-holdem 2s4s7h8c9h Kh3d3s4c Qh6hTd6s 2dJhJc9c 5h7sKs4d 3hTc7c9d 5d6cAdKd 7dAc4h9s 5c2cQdQs QcJd8d6d"));
  }

  @Test
  public void test_omaha_holdem_4810_2d5s9cJsKh_Qd4s6s5d_8sKs5c8c_3s8hJh8d_5hTcJcQc_9d2sJdTd() {
    assertEquals(
      "Qd4s6s5d 3s8hJh8d 9d2sJdTd 8sKs5c8c 5hTcJcQc",
      Solver.process("omaha-holdem 2d5s9cJsKh Qd4s6s5d 8sKs5c8c 3s8hJh8d 5hTcJcQc 9d2sJdTd"));
  }

  @Test
  public void test_omaha_holdem_4811_3h9dAhKcQh_AdTs6dKd_5d9c4h2c_Jc5cAcQd() {
    assertEquals(
      "5d9c4h2c Jc5cAcQd AdTs6dKd",
      Solver.process("omaha-holdem 3h9dAhKcQh AdTs6dKd 5d9c4h2c Jc5cAcQd"));
  }

  @Test
  public void test_omaha_holdem_4812_3s6hAcKcQh_2d7c7s8c_TcAh6d5h_5c4d8dJs() {
    assertEquals(
      "5c4d8dJs 2d7c7s8c TcAh6d5h",
      Solver.process("omaha-holdem 3s6hAcKcQh 2d7c7s8c TcAh6d5h 5c4d8dJs"));
  }

  @Test
  public void test_omaha_holdem_4813_3d3s7dAhQh_6d9cJd5h_QdKs2dJs_Ts8h8s6h() {
    assertEquals(
      "6d9cJd5h Ts8h8s6h QdKs2dJs",
      Solver.process("omaha-holdem 3d3s7dAhQh 6d9cJd5h QdKs2dJs Ts8h8s6h"));
  }

  @Test
  public void test_omaha_holdem_4814_3c5sJdQsTc_7d9c6c8h_4dJs6hQc_9h3d5d4s_QdAsQh7s_7h2d4h8s_Kc8dKh5h() {
    assertEquals(
      "7h2d4h8s Kc8dKh5h 9h3d5d4s 4dJs6hQc QdAsQh7s 7d9c6c8h",
      Solver.process("omaha-holdem 3c5sJdQsTc 7d9c6c8h 4dJs6hQc 9h3d5d4s QdAsQh7s 7h2d4h8s Kc8dKh5h"));
  }

  @Test
  public void test_omaha_holdem_4815_4c7d7sJdKc_8h4s6h8d_6cQd5s8c_Qs6s9h4d() {
    assertEquals(
      "6cQd5s8c Qs6s9h4d 8h4s6h8d",
      Solver.process("omaha-holdem 4c7d7sJdKc 8h4s6h8d 6cQd5s8c Qs6s9h4d"));
  }

  @Test
  public void test_omaha_holdem_4816_6h6s8d9sKh_Ks9dTcKc_4s2h9cAs() {
    assertEquals(
      "4s2h9cAs Ks9dTcKc",
      Solver.process("omaha-holdem 6h6s8d9sKh Ks9dTcKc 4s2h9cAs"));
  }

  @Test
  public void test_omaha_holdem_4817_3sAhAsJsQc_AcTd6d9h_Jd2c4h4d_Qh7hQs8c_3dKsThJc_JhKhKd7c() {
    assertEquals(
      "Jd2c4h4d JhKhKd7c AcTd6d9h 3dKsThJc Qh7hQs8c",
      Solver.process("omaha-holdem 3sAhAsJsQc AcTd6d9h Jd2c4h4d Qh7hQs8c 3dKsThJc JhKhKd7c"));
  }

  @Test
  public void test_omaha_holdem_4818_4d7cKdKhKs_2sAhTd8c_6h5c2c6c_7sAdJcKc_3sJdQcQh_As5s4hTh_9s8h8d9h_7dTsQs5d_3hJs5h9d() {
    assertEquals(
      "3hJs5h9d 7dTsQs5d 2sAhTd8c=As5s4hTh 6h5c2c6c 9s8h8d9h 3sJdQcQh 7sAdJcKc",
      Solver.process("omaha-holdem 4d7cKdKhKs 2sAhTd8c 6h5c2c6c 7sAdJcKc 3sJdQcQh As5s4hTh 9s8h8d9h 7dTsQs5d 3hJs5h9d"));
  }

  @Test
  public void test_omaha_holdem_4819_5s7s8c8sKc_Td8h3s2h_AcTh3hKh_Js6c2dQs_9hQcQd5h_9sAh4cJd_5c8dKs2c_AdTsKdAs_7h6s6hTc() {
    assertEquals(
      "9sAh4cJd 7h6s6hTc 9hQcQd5h AcTh3hKh Td8h3s2h Js6c2dQs AdTsKdAs 5c8dKs2c",
      Solver.process("omaha-holdem 5s7s8c8sKc Td8h3s2h AcTh3hKh Js6c2dQs 9hQcQd5h 9sAh4cJd 5c8dKs2c AdTsKdAs 7h6s6hTc"));
  }

  @Test
  public void test_omaha_holdem_4820_3c5d7s9hKh_TsAh9sQh_JdAc2c6s_KsQcTd8c_9cQd8hJh_As5c4s5s_2dJc4d8d_5hQsKd3d() {
    assertEquals(
      "2dJc4d8d JdAc2c6s 9cQd8hJh TsAh9sQh KsQcTd8c 5hQsKd3d As5c4s5s",
      Solver.process("omaha-holdem 3c5d7s9hKh TsAh9sQh JdAc2c6s KsQcTd8c 9cQd8hJh As5c4s5s 2dJc4d8d 5hQsKd3d"));
  }

  @Test
  public void test_omaha_holdem_4821_4s5dAcKhQs_KcTc4d7h_Jh3c4hKd_3dJsQdTd_2d5s8dAd() {
    assertEquals(
      "Jh3c4hKd=KcTc4d7h 2d5s8dAd 3dJsQdTd",
      Solver.process("omaha-holdem 4s5dAcKhQs KcTc4d7h Jh3c4hKd 3dJsQdTd 2d5s8dAd"));
  }

  @Test
  public void test_omaha_holdem_4822_2s8d9sTcTd_2dAhTsJd_5sKdQd3c() {
    assertEquals(
      "5sKdQd3c 2dAhTsJd",
      Solver.process("omaha-holdem 2s8d9sTcTd 2dAhTsJd 5sKdQd3c"));
  }

  @Test
  public void test_omaha_holdem_4823_2d3h5d7dTc_7sAdKdJh_As8sAc7h_2cKcQsJc_3c4h2h8c_6sTh9cJs_5s9hQc6d_5h3d9d3s() {
    assertEquals(
      "2cKcQsJc 5s9hQc6d 6sTh9cJs As8sAc7h 3c4h2h8c 5h3d9d3s 7sAdKdJh",
      Solver.process("omaha-holdem 2d3h5d7dTc 7sAdKdJh As8sAc7h 2cKcQsJc 3c4h2h8c 6sTh9cJs 5s9hQc6d 5h3d9d3s"));
  }

  @Test
  public void test_omaha_holdem_4824_3c5h7c9dQc_3dQd9s5d_9h4d9cAd_TdJs8d5c_6s8cAs2s_AcThKd8s() {
    assertEquals(
      "AcThKd8s TdJs8d5c 3dQd9s5d 9h4d9cAd 6s8cAs2s",
      Solver.process("omaha-holdem 3c5h7c9dQc 3dQd9s5d 9h4d9cAd TdJs8d5c 6s8cAs2s AcThKd8s"));
  }

  @Test
  public void test_omaha_holdem_4825_2h8d8sAsJd_7c8cAd3s_9sAc6dKc_4dKs5h7h_3d9d7s9c() {
    assertEquals(
      "4dKs5h7h 3d9d7s9c 9sAc6dKc 7c8cAd3s",
      Solver.process("omaha-holdem 2h8d8sAsJd 7c8cAd3s 9sAc6dKc 4dKs5h7h 3d9d7s9c"));
  }

  @Test
  public void test_omaha_holdem_4826_6h8dAcKdTh_4hQh5d5h_7s9h3h6s() {
    assertEquals(
      "4hQh5d5h 7s9h3h6s",
      Solver.process("omaha-holdem 6h8dAcKdTh 4hQh5d5h 7s9h3h6s"));
  }

  @Test
  public void test_omaha_holdem_4827_2h5d6sQcTh_8s5sQh7h_8cAd4s9s_9cAc4hJh_4cAs2c6h_TsTcQdJc_Jd9h3d5h_7d6cTd7s_7cKcQs3c_8dJs2dAh() {
    assertEquals(
      "8cAd4s9s 9cAc4hJh 8dJs2dAh Jd9h3d5h 7cKcQs3c 4cAs2c6h 7d6cTd7s 8s5sQh7h TsTcQdJc",
      Solver.process("omaha-holdem 2h5d6sQcTh 8s5sQh7h 8cAd4s9s 9cAc4hJh 4cAs2c6h TsTcQdJc Jd9h3d5h 7d6cTd7s 7cKcQs3c 8dJs2dAh"));
  }

  @Test
  public void test_omaha_holdem_4828_5s7hKdQcQd_5dAs4c7c_3d4d8hTd_Kh9sJcAc_4s6sAd5c_Jd6h5hQs_6cKc7d8s_3h2c7sQh_4h3sKs9c_2sTh8dAh() {
    assertEquals(
      "3d4d8hTd 2sTh8dAh 4s6sAd5c 5dAs4c7c 6cKc7d8s 4h3sKs9c Kh9sJcAc Jd6h5hQs 3h2c7sQh",
      Solver.process("omaha-holdem 5s7hKdQcQd 5dAs4c7c 3d4d8hTd Kh9sJcAc 4s6sAd5c Jd6h5hQs 6cKc7d8s 3h2c7sQh 4h3sKs9c 2sTh8dAh"));
  }

  @Test
  public void test_omaha_holdem_4829_7dJhKdKsTs_Tc9d5c4h_Th6s7cKc() {
    assertEquals(
      "Tc9d5c4h Th6s7cKc",
      Solver.process("omaha-holdem 7dJhKdKsTs Tc9d5c4h Th6s7cKc"));
  }

  @Test
  public void test_omaha_holdem_4830_5s8dAdJdKs_6sJsQc5c_3d4h4d6h_2c3sJh6c() {
    assertEquals(
      "2c3sJh6c 6sJsQc5c 3d4h4d6h",
      Solver.process("omaha-holdem 5s8dAdJdKs 6sJsQc5c 3d4h4d6h 2c3sJh6c"));
  }

  @Test
  public void test_omaha_holdem_4831_2h6d9dJsKd_7dQs5d4h_JcKcTd3d_Ac5sAh8d_Th6c9s5h_9hQdQc5c_2d4d6h4c_3cJdAdKs_JhTcAs6s_8h7c8s7s() {
    assertEquals(
      "8h7c8s7s 9hQdQc5c Ac5sAh8d Th6c9s5h JhTcAs6s 2d4d6h4c 7dQs5d4h JcKcTd3d 3cJdAdKs",
      Solver.process("omaha-holdem 2h6d9dJsKd 7dQs5d4h JcKcTd3d Ac5sAh8d Th6c9s5h 9hQdQc5c 2d4d6h4c 3cJdAdKs JhTcAs6s 8h7c8s7s"));
  }

  @Test
  public void test_omaha_holdem_4832_4d6h8hQsTs_Qc9c6d5s_3c9d2c6c_3h3sAcTd_8dKs5h7h_As8s9sJc_7s5d4cAd_2h9h2sKh_Tc7cQdKc_4h3dJsAh() {
    assertEquals(
      "2h9h2sKh 4h3dJsAh 3c9d2c6c 3h3sAcTd Qc9c6d5s Tc7cQdKc 7s5d4cAd=8dKs5h7h As8s9sJc",
      Solver.process("omaha-holdem 4d6h8hQsTs Qc9c6d5s 3c9d2c6c 3h3sAcTd 8dKs5h7h As8s9sJc 7s5d4cAd 2h9h2sKh Tc7cQdKc 4h3dJsAh"));
  }

  @Test
  public void test_omaha_holdem_4833_3d3s7s9hAc_Th7hTsKs_8sKd9cAs_6h3c6cTc_Js6d4s5c() {
    assertEquals(
      "Js6d4s5c Th7hTsKs 8sKd9cAs 6h3c6cTc",
      Solver.process("omaha-holdem 3d3s7s9hAc Th7hTsKs 8sKd9cAs 6h3c6cTc Js6d4s5c"));
  }

  @Test
  public void test_omaha_holdem_4834_2d3d6h8cKs_Ac5d6cAh_2sQs4h8d_9h6dTd7h_Kc5h5c3c() {
    assertEquals(
      "9h6dTd7h Ac5d6cAh 2sQs4h8d Kc5h5c3c",
      Solver.process("omaha-holdem 2d3d6h8cKs Ac5d6cAh 2sQs4h8d 9h6dTd7h Kc5h5c3c"));
  }

  @Test
  public void test_omaha_holdem_4835_4c6cJdKcKs_9c6hTh4s_3cKd3d5s_2cAc7h2s_JcAh2hJh_7dKhQsTd_Tc6d6s7s() {
    assertEquals(
      "9c6hTh4s 3cKd3d5s 7dKhQsTd 2cAc7h2s Tc6d6s7s JcAh2hJh",
      Solver.process("omaha-holdem 4c6cJdKcKs 9c6hTh4s 3cKd3d5s 2cAc7h2s JcAh2hJh 7dKhQsTd Tc6d6s7s"));
  }

  @Test
  public void test_omaha_holdem_4836_4h4s8sKsQh_5d5c9d4d_JsJcJd2c_Qs6cKh6h_Kc4c7dTh() {
    assertEquals(
      "JsJcJd2c Qs6cKh6h 5d5c9d4d Kc4c7dTh",
      Solver.process("omaha-holdem 4h4s8sKsQh 5d5c9d4d JsJcJd2c Qs6cKh6h Kc4c7dTh"));
  }

  @Test
  public void test_omaha_holdem_4837_AhJhKsTdTh_8c4hKd6h_JdQcKh2s_3d7c6s8h_Jc8d7d9s_QsAs5d4c_5c3s7s3h_5s9d6d6c() {
    assertEquals(
      "3d7c6s8h 5c3s7s3h 5s9d6d6c Jc8d7d9s JdQcKh2s=QsAs5d4c 8c4hKd6h",
      Solver.process("omaha-holdem AhJhKsTdTh 8c4hKd6h JdQcKh2s 3d7c6s8h Jc8d7d9s QsAs5d4c 5c3s7s3h 5s9d6d6c"));
  }

  @Test
  public void test_omaha_holdem_4838_4h8dAhAsKs_6sQc6cAc_9d7hJs9s_2dKd2h9h_JhKcTd6d_Qs3dTs2c() {
    assertEquals(
      "Qs3dTs2c 9d7hJs9s 2dKd2h9h JhKcTd6d 6sQc6cAc",
      Solver.process("omaha-holdem 4h8dAhAsKs 6sQc6cAc 9d7hJs9s 2dKd2h9h JhKcTd6d Qs3dTs2c"));
  }

  @Test
  public void test_omaha_holdem_4839_2c4h9sKhTs_7h8dKsJc_Tc6c8s3h_7d8cJh5h_5c2s9hTd_8h4d9c7s() {
    assertEquals(
      "7d8cJh5h Tc6c8s3h 7h8dKsJc 8h4d9c7s 5c2s9hTd",
      Solver.process("omaha-holdem 2c4h9sKhTs 7h8dKsJc Tc6c8s3h 7d8cJh5h 5c2s9hTd 8h4d9c7s"));
  }

  @Test
  public void test_omaha_holdem_4840_2h3s9d9hKd_JhJdQdAd_3c9c3h9s_7d2s5s3d_7cQc8dQs_6hAsTsKh_Tc7h2c6s_5c5h6d7s() {
    assertEquals(
      "Tc7h2c6s 7d2s5s3d 5c5h6d7s JhJdQdAd 7cQc8dQs 6hAsTsKh 3c9c3h9s",
      Solver.process("omaha-holdem 2h3s9d9hKd JhJdQdAd 3c9c3h9s 7d2s5s3d 7cQc8dQs 6hAsTsKh Tc7h2c6s 5c5h6d7s"));
  }

  @Test
  public void test_omaha_holdem_4841_2c4c5s6s7d_6c2s9s5c_9d8s5h7s_3s9cQh4h_Ac4d6hQd_7h4sQcKh_8d2h2d9h_TcAhTd8h_Kc5d3dAd() {
    assertEquals(
      "TcAhTd8h Ac4d6hQd 6c2s9s5c 7h4sQcKh 3s9cQh4h=Kc5d3dAd 8d2h2d9h=9d8s5h7s",
      Solver.process("omaha-holdem 2c4c5s6s7d 6c2s9s5c 9d8s5h7s 3s9cQh4h Ac4d6hQd 7h4sQcKh 8d2h2d9h TcAhTd8h Kc5d3dAd"));
  }

  @Test
  public void test_omaha_holdem_4842_5c9sJdJsKc_9d8h2dTd_Ac6h4h7d_Ad6d5s3h_4cJcQsTs_7cKd2cKh_5hTcAh6s_8d2s2hTh_5d7sQh6c() {
    assertEquals(
      "Ac6h4h7d 8d2s2hTh 5d7sQh6c 5hTcAh6s=Ad6d5s3h 9d8h2dTd 4cJcQsTs 7cKd2cKh",
      Solver.process("omaha-holdem 5c9sJdJsKc 9d8h2dTd Ac6h4h7d Ad6d5s3h 4cJcQsTs 7cKd2cKh 5hTcAh6s 8d2s2hTh 5d7sQh6c"));
  }

  @Test
  public void test_omaha_holdem_4843_2d5cAsThTs_Qs9s7s7h_5sKh9hKd_2hJc3cKc_QcAd7dJs_2s5dQh4c_Qd9c7cJd_9dKsAcJh_Tc3h2c8d() {
    assertEquals(
      "Qd9c7cJd 2hJc3cKc 2s5dQh4c Qs9s7s7h 5sKh9hKd QcAd7dJs 9dKsAcJh Tc3h2c8d",
      Solver.process("omaha-holdem 2d5cAsThTs Qs9s7s7h 5sKh9hKd 2hJc3cKc QcAd7dJs 2s5dQh4c Qd9c7cJd 9dKsAcJh Tc3h2c8d"));
  }

  @Test
  public void test_omaha_holdem_4844_2s3h8cTcTh_KhAh3sAd_7s4s7dQs_9d5c3d3c_4h7h4dAc_2h6c8sQd_5dKsKc5h_6h7c8hJd_5s6s6d8d() {
    assertEquals(
      "4h7h4dAc 7s4s7dQs 5s6s6d8d 6h7c8hJd 2h6c8sQd 5dKsKc5h KhAh3sAd 9d5c3d3c",
      Solver.process("omaha-holdem 2s3h8cTcTh KhAh3sAd 7s4s7dQs 9d5c3d3c 4h7h4dAc 2h6c8sQd 5dKsKc5h 6h7c8hJd 5s6s6d8d"));
  }

  @Test
  public void test_omaha_holdem_4845_4d7d8d8sTs_6h3dKh5s_JsTd5d7s_Th6s4s5h() {
    assertEquals(
      "6h3dKh5s=Th6s4s5h JsTd5d7s",
      Solver.process("omaha-holdem 4d7d8d8sTs 6h3dKh5s JsTd5d7s Th6s4s5h"));
  }

  @Test
  public void test_omaha_holdem_4846_3s6h7cJsKc_AdKh2d7d_4sQc8sTs() {
    assertEquals(
      "4sQc8sTs AdKh2d7d",
      Solver.process("omaha-holdem 3s6h7cJsKc AdKh2d7d 4sQc8sTs"));
  }

  @Test
  public void test_omaha_holdem_4847_4h6c7hKhTs_3s3cAhTc_2c2h6d4d_9sTd4cKs() {
    assertEquals(
      "3s3cAhTc 2c2h6d4d 9sTd4cKs",
      Solver.process("omaha-holdem 4h6c7hKhTs 3s3cAhTc 2c2h6d4d 9sTd4cKs"));
  }

  @Test
  public void test_omaha_holdem_4848_4h6s7c9dAd_6d3sQsTs_Jd3c5dJc_Td4sKcJh_4dQhQdAc_2c7dTh6c() {
    assertEquals(
      "Td4sKcJh 6d3sQsTs 2c7dTh6c 4dQhQdAc Jd3c5dJc",
      Solver.process("omaha-holdem 4h6s7c9dAd 6d3sQsTs Jd3c5dJc Td4sKcJh 4dQhQdAc 2c7dTh6c"));
  }

  @Test
  public void test_omaha_holdem_4849_8h9dJdKhKs_7sAcQcTs_6c4sQsJh_Td6dTc6s_4cQd2hTh() {
    assertEquals(
      "Td6dTc6s 6c4sQsJh 4cQd2hTh=7sAcQcTs",
      Solver.process("omaha-holdem 8h9dJdKhKs 7sAcQcTs 6c4sQsJh Td6dTc6s 4cQd2hTh"));
  }

  @Test
  public void test_omaha_holdem_4850_3d4cAsTcTd_Ac8d6h5d_Jh2cKcAd_2d7d5c9s_7c2sJc4d_9hQcQs2h() {
    assertEquals(
      "7c2sJc4d 9hQcQs2h Ac8d6h5d Jh2cKcAd 2d7d5c9s",
      Solver.process("omaha-holdem 3d4cAsTcTd Ac8d6h5d Jh2cKcAd 2d7d5c9s 7c2sJc4d 9hQcQs2h"));
  }

  @Test
  public void test_omaha_holdem_4851_2h4h4s9dJc_6hAdAc9s_8s3dQdKd() {
    assertEquals(
      "8s3dQdKd 6hAdAc9s",
      Solver.process("omaha-holdem 2h4h4s9dJc 6hAdAc9s 8s3dQdKd"));
  }

  @Test
  public void test_omaha_holdem_4852_2c6c7hJhQc_7s4hTs3c_2dAsAdJs_KhKd4dQs_6h5h9hJd_3s5dAh3d_Qd8cTd6s_6dKc8h2s() {
    assertEquals(
      "3s5dAh3d 7s4hTs3c KhKd4dQs 6dKc8h2s 2dAsAdJs 6h5h9hJd Qd8cTd6s",
      Solver.process("omaha-holdem 2c6c7hJhQc 7s4hTs3c 2dAsAdJs KhKd4dQs 6h5h9hJd 3s5dAh3d Qd8cTd6s 6dKc8h2s"));
  }

  @Test
  public void test_omaha_holdem_4853_4s5c7d8sKd_Qc2h3cAs_4h9d7s6h_Jh6dJcKs_5d8hJs6c_QhQd2s6s_5hTh4dTc_Ts3d5sQs_2d3hAcAd() {
    assertEquals(
      "Qc2h3cAs Ts3d5sQs QhQd2s6s Jh6dJcKs 2d3hAcAd 5hTh4dTc 5d8hJs6c 4h9d7s6h",
      Solver.process("omaha-holdem 4s5c7d8sKd Qc2h3cAs 4h9d7s6h Jh6dJcKs 5d8hJs6c QhQd2s6s 5hTh4dTc Ts3d5sQs 2d3hAcAd"));
  }

  @Test
  public void test_omaha_holdem_4854_3c5d6d7dTs_QdTcAh3h_2c4c2s3d_6sThQc5h_4h4sQh9s_5s9dQs7s_Jh7cKhJs_2d8c2h4d_TdKc3sKd_Jc8hAcKs() {
    assertEquals(
      "Jc8hAcKs 4h4sQh9s Jh7cKhJs 5s9dQs7s QdTcAh3h 6sThQc5h 2c4c2s3d 2d8c2h4d TdKc3sKd",
      Solver.process("omaha-holdem 3c5d6d7dTs QdTcAh3h 2c4c2s3d 6sThQc5h 4h4sQh9s 5s9dQs7s Jh7cKhJs 2d8c2h4d TdKc3sKd Jc8hAcKs"));
  }

  @Test
  public void test_omaha_holdem_4855_8hAhJhQdQs_5c7s7h5h_Th6cKsJd_7cJsAs3d_9h9c3h4d_2h6dQc8c_4sTd4hKd_8sTc6s9s_7d5dTsAc() {
    assertEquals(
      "7d5dTsAc 7cJsAs3d 8sTc6s9s 4sTd4hKd=Th6cKsJd 5c7s7h5h 9h9c3h4d 2h6dQc8c",
      Solver.process("omaha-holdem 8hAhJhQdQs 5c7s7h5h Th6cKsJd 7cJsAs3d 9h9c3h4d 2h6dQc8c 4sTd4hKd 8sTc6s9s 7d5dTsAc"));
  }

  @Test
  public void test_omaha_holdem_4856_2c6c6hKhKs_9c8h2hQh_TsJh7h9d_7sJdTh9h() {
    assertEquals(
      "7sJdTh9h=TsJh7h9d 9c8h2hQh",
      Solver.process("omaha-holdem 2c6c6hKhKs 9c8h2hQh TsJh7h9d 7sJdTh9h"));
  }

  @Test
  public void test_omaha_holdem_4857_5s7c7sJhJs_JdKd8dTc_3d8c6s5d_KsKh9d2s_2c7d9c6d_8h6c3s6h_4s7hQs2d_TdAdAcQc() {
    assertEquals(
      "3d8c6s5d 8h6c3s6h TdAdAcQc 2c7d9c6d JdKd8dTc 4s7hQs2d KsKh9d2s",
      Solver.process("omaha-holdem 5s7c7sJhJs JdKd8dTc 3d8c6s5d KsKh9d2s 2c7d9c6d 8h6c3s6h 4s7hQs2d TdAdAcQc"));
  }

  @Test
  public void test_omaha_holdem_4858_3d3hJdJhTd_Qs2s6dQh_TcAh5cQc_Kc5s6h4c_7cTs4dJs_8sTh4hKs_7d4s7hAc_3c9s9h6c_9c2h5d8d_8c5hKh2d() {
    assertEquals(
      "Kc5s6h4c 8c5hKh2d 7d4s7hAc 8sTh4hKs TcAh5cQc Qs2s6dQh 3c9s9h6c 9c2h5d8d 7cTs4dJs",
      Solver.process("omaha-holdem 3d3hJdJhTd Qs2s6dQh TcAh5cQc Kc5s6h4c 7cTs4dJs 8sTh4hKs 7d4s7hAc 3c9s9h6c 9c2h5d8d 8c5hKh2d"));
  }

  @Test
  public void test_omaha_holdem_4859_4c9hAcKsTh_7sKcAh2c_8d3dTd8h_4h7c9sJc_3h5s9d8s_7hAdKdKh_Qh5cAs2h() {
    assertEquals(
      "3h5s9d8s 8d3dTd8h Qh5cAs2h 4h7c9sJc 7sKcAh2c 7hAdKdKh",
      Solver.process("omaha-holdem 4c9hAcKsTh 7sKcAh2c 8d3dTd8h 4h7c9sJc 3h5s9d8s 7hAdKdKh Qh5cAs2h"));
  }

  @Test
  public void test_omaha_holdem_4860_7s9h9sKhQc_2s5sJc7c_8c3s9dKc_4sJd6h5d_Kd4dAsJs_Ah5cThTc_2d3d3c5h_8dTdAd6s_6d7h2hQd() {
    assertEquals(
      "4sJd6h5d 8dTdAd6s 2d3d3c5h 2s5sJc7c Ah5cThTc 6d7h2hQd Kd4dAsJs 8c3s9dKc",
      Solver.process("omaha-holdem 7s9h9sKhQc 2s5sJc7c 8c3s9dKc 4sJd6h5d Kd4dAsJs Ah5cThTc 2d3d3c5h 8dTdAd6s 6d7h2hQd"));
  }

  @Test
  public void test_omaha_holdem_4861_2c2h4sAdJc_7c4c3cQc_6d5h7sTd_9dJs6cKc() {
    assertEquals(
      "6d5h7sTd 7c4c3cQc 9dJs6cKc",
      Solver.process("omaha-holdem 2c2h4sAdJc 7c4c3cQc 6d5h7sTd 9dJs6cKc"));
  }

  @Test
  public void test_omaha_holdem_4862_2h4d8cKsQc_AdAs6h5s_Ah3cTc6d_8s5h6sAc_8hTsTh7c_3s7h8dJd_5c2s7dJh_2d3d4h7s_Kc6c2cTd() {
    assertEquals(
      "Ah3cTc6d 5c2s7dJh 3s7h8dJd 8s5h6sAc 8hTsTh7c AdAs6h5s 2d3d4h7s Kc6c2cTd",
      Solver.process("omaha-holdem 2h4d8cKsQc AdAs6h5s Ah3cTc6d 8s5h6sAc 8hTsTh7c 3s7h8dJd 5c2s7dJh 2d3d4h7s Kc6c2cTd"));
  }

  @Test
  public void test_omaha_holdem_4863_7d8s9cKhQc_Jd2d3s7c_Th3d9s8d_5d9h6s4h_TcKcQhQs_2sJs5h4s_5cJh6cTd_AhQd2h7s() {
    assertEquals(
      "2sJs5h4s Jd2d3s7c Th3d9s8d AhQd2h7s TcKcQhQs 5d9h6s4h 5cJh6cTd",
      Solver.process("omaha-holdem 7d8s9cKhQc Jd2d3s7c Th3d9s8d 5d9h6s4h TcKcQhQs 2sJs5h4s 5cJh6cTd AhQd2h7s"));
  }

  @Test
  public void test_omaha_holdem_4864_4h5c8cAhQh_2h9h6h6s_8dAc8sKc_3c7cJsKs_7h2d3sQs_3h2cJdQc_9cQdKhKd() {
    assertEquals(
      "3c7cJsKs 9cQdKhKd 8dAc8sKc 3h2cJdQc=7h2d3sQs 2h9h6h6s",
      Solver.process("omaha-holdem 4h5c8cAhQh 2h9h6h6s 8dAc8sKc 3c7cJsKs 7h2d3sQs 3h2cJdQc 9cQdKhKd"));
  }

  @Test
  public void test_omaha_holdem_4865_2s3s6h7hAc_8sQcQd6s_4c4d2d8d_5hJh2h8c() {
    assertEquals(
      "5hJh2h8c 4c4d2d8d 8sQcQd6s",
      Solver.process("omaha-holdem 2s3s6h7hAc 8sQcQd6s 4c4d2d8d 5hJh2h8c"));
  }

  @Test
  public void test_omaha_holdem_4866_3s8s9d9sTd_9c6dTs4d_AdKs5c5h_8hTcAc2s() {
    assertEquals(
      "AdKs5c5h 8hTcAc2s 9c6dTs4d",
      Solver.process("omaha-holdem 3s8s9d9sTd 9c6dTs4d AdKs5c5h 8hTcAc2s"));
  }

  @Test
  public void test_omaha_holdem_4867_9cJdKsQcQh_8dTs2dJs_5c2h3s2s_2c8sKc5h_6d6c4dJh_Ah9h6hTc_KhQs3h5d_4s7s9d6s_3dTdAdTh() {
    assertEquals(
      "5c2h3s2s 4s7s9d6s 6d6c4dJh 2c8sKc5h 8dTs2dJs 3dTdAdTh=Ah9h6hTc KhQs3h5d",
      Solver.process("omaha-holdem 9cJdKsQcQh 8dTs2dJs 5c2h3s2s 2c8sKc5h 6d6c4dJh Ah9h6hTc KhQs3h5d 4s7s9d6s 3dTdAdTh"));
  }

  @Test
  public void test_omaha_holdem_4868_3h3s8sQsTd_6c6sJd8h_2sJcQh5d_2cTcQdAc_5h7c4cAd_6h4hTsQc_2dKh8d9s_Ah5c5s9c_2h9hAs3c() {
    assertEquals(
      "5h7c4cAd Ah5c5s9c 6c6sJd8h 2dKh8d9s 2sJcQh5d 2cTcQdAc=6h4hTsQc 2h9hAs3c",
      Solver.process("omaha-holdem 3h3s8sQsTd 6c6sJd8h 2sJcQh5d 2cTcQdAc 5h7c4cAd 6h4hTsQc 2dKh8d9s Ah5c5s9c 2h9hAs3c"));
  }

  @Test
  public void test_omaha_holdem_4869_7h9cKhKsTd_7s5hQc6c_4cQdTcJh_Th9h7d6d_9s8s5s3d() {
    assertEquals(
      "7s5hQc6c 9s8s5s3d Th9h7d6d 4cQdTcJh",
      Solver.process("omaha-holdem 7h9cKhKsTd 7s5hQc6c 4cQdTcJh Th9h7d6d 9s8s5s3d"));
  }

  @Test
  public void test_omaha_holdem_4870_2h3h8dQsTd_9sAh4d3s_6dKsQdKd_6c4c8s2s_2d9d6sKh() {
    assertEquals(
      "2d9d6sKh 9sAh4d3s 6dKsQdKd 6c4c8s2s",
      Solver.process("omaha-holdem 2h3h8dQsTd 9sAh4d3s 6dKsQdKd 6c4c8s2s 2d9d6sKh"));
  }

  @Test
  public void test_omaha_holdem_4871_3d7c8dAsJc_Kh3s9s4h_AhJd6dKd_4cAd8c6s_3c2h2sTh_7hKcJs5h_QdTc6c6h_7dQs4s9c_2d9hQh5s() {
    assertEquals(
      "2d9hQh5s 3c2h2sTh Kh3s9s4h QdTc6c6h 7dQs4s9c 7hKcJs5h 4cAd8c6s AhJd6dKd",
      Solver.process("omaha-holdem 3d7c8dAsJc Kh3s9s4h AhJd6dKd 4cAd8c6s 3c2h2sTh 7hKcJs5h QdTc6c6h 7dQs4s9c 2d9hQh5s"));
  }

  @Test
  public void test_omaha_holdem_4872_2h5h5s6d9d_Kd2d3h9h_AcJc8dKc_9cAh7s4d_Qs3sQc7h_2sQdKhJd_Jh6h5d5c() {
    assertEquals(
      "AcJc8dKc 2sQdKhJd Kd2d3h9h 9cAh7s4d Qs3sQc7h Jh6h5d5c",
      Solver.process("omaha-holdem 2h5h5s6d9d Kd2d3h9h AcJc8dKc 9cAh7s4d Qs3sQc7h 2sQdKhJd Jh6h5d5c"));
  }

  @Test
  public void test_omaha_holdem_4873_4d5d7hJdKd_6hKc9cQh_8h8s4s9d_Js4cTh2h_2c7s9sTc_Jc3sTsQc_AhKsAd6c_7cJh3d8c_4hQd7d8d() {
    assertEquals(
      "2c7s9sTc 8h8s4s9d Jc3sTsQc 6hKc9cQh AhKsAd6c Js4cTh2h 7cJh3d8c 4hQd7d8d",
      Solver.process("omaha-holdem 4d5d7hJdKd 6hKc9cQh 8h8s4s9d Js4cTh2h 2c7s9sTc Jc3sTsQc AhKsAd6c 7cJh3d8c 4hQd7d8d"));
  }

  @Test
  public void test_omaha_holdem_4874_2c5d7dJcTh_4s4h9sAd_7s9c5h6c_3s6h2sJs_AhJd6sAc_Qd8cAs5c_Jh8h8sQc_9d4c7h3c_TsQh9hKh_KdKc5s8d() {
    assertEquals(
      "4s4h9sAd Qd8cAs5c 9d4c7h3c TsQh9hKh Jh8h8sQc KdKc5s8d AhJd6sAc 7s9c5h6c 3s6h2sJs",
      Solver.process("omaha-holdem 2c5d7dJcTh 4s4h9sAd 7s9c5h6c 3s6h2sJs AhJd6sAc Qd8cAs5c Jh8h8sQc 9d4c7h3c TsQh9hKh KdKc5s8d"));
  }

  @Test
  public void test_omaha_holdem_4875_2s4c8cAcAd_Jc9dAhJh_6sKhQh7s_Ts3h7d8s_Th9sQd7c_Kd9c3cKs_3d2c8dTd_As8h6cTc_5cKc2h9h_Qs3s2d6d() {
    assertEquals(
      "Th9sQd7c 6sKhQh7s Qs3s2d6d 3d2c8dTd=Ts3h7d8s Jc9dAhJh Kd9c3cKs 5cKc2h9h As8h6cTc",
      Solver.process("omaha-holdem 2s4c8cAcAd Jc9dAhJh 6sKhQh7s Ts3h7d8s Th9sQd7c Kd9c3cKs 3d2c8dTd As8h6cTc 5cKc2h9h Qs3s2d6d"));
  }

  @Test
  public void test_omaha_holdem_4876_3c6s9d9sKh_Qc6h6d9c_Qs2h2c5h_JsKcAd8h_3hAcAs7s_4h3s8s7d_AhTs6cKs_Qh7h2s2d_8cJd8dJc_Jh5s5dTd() {
    assertEquals(
      "Qh7h2s2d=Qs2h2c5h 4h3s8s7d Jh5s5dTd 8cJd8dJc AhTs6cKs=JsKcAd8h 3hAcAs7s Qc6h6d9c",
      Solver.process("omaha-holdem 3c6s9d9sKh Qc6h6d9c Qs2h2c5h JsKcAd8h 3hAcAs7s 4h3s8s7d AhTs6cKs Qh7h2s2d 8cJd8dJc Jh5s5dTd"));
  }

  @Test
  public void test_omaha_holdem_4877_3h5h7dAhTs_9s9dKcAc_JhJsKdAd_8d2c9h8s_6c5s4d3d() {
    assertEquals(
      "8d2c9h8s 9s9dKcAc=JhJsKdAd 6c5s4d3d",
      Solver.process("omaha-holdem 3h5h7dAhTs 9s9dKcAc JhJsKdAd 8d2c9h8s 6c5s4d3d"));
  }

  @Test
  public void test_omaha_holdem_4878_4d6d8c9d9s_QsAcAd4c_4sJhTh4h_KsJcQdAs_3d2s6s7s_7hJs5h5s_8sJd6c8h_KhTdTcKc_Kd2c7d5d_8d7c2h3c() {
    assertEquals(
      "KsJcQdAs 3d2s6s7s 8d7c2h3c KhTdTcKc QsAcAd4c 7hJs5h5s Kd2c7d5d 4sJhTh4h 8sJd6c8h",
      Solver.process("omaha-holdem 4d6d8c9d9s QsAcAd4c 4sJhTh4h KsJcQdAs 3d2s6s7s 7hJs5h5s 8sJd6c8h KhTdTcKc Kd2c7d5d 8d7c2h3c"));
  }

  @Test
  public void test_omaha_holdem_4879_3d5d6sJcKh_Ad9h8cQh_5h2c5c8d_2d2h7d6h_KcKdTs9d() {
    assertEquals(
      "Ad9h8cQh 2d2h7d6h 5h2c5c8d KcKdTs9d",
      Solver.process("omaha-holdem 3d5d6sJcKh Ad9h8cQh 5h2c5c8d 2d2h7d6h KcKdTs9d"));
  }

  @Test
  public void test_omaha_holdem_4880_2dAdQsTcTh_5hKdAs3c_6d5s9dQd_KhJc5cTd_3hKs5d8s_AcJs9c7d_Ts8d2s6s_JdKc4s6c_9h7c8c3d_8h7h3s4c() {
    assertEquals(
      "8h7h3s4c 9h7c8c3d 3hKs5d8s 6d5s9dQd AcJs9c7d 5hKdAs3c JdKc4s6c=KhJc5cTd Ts8d2s6s",
      Solver.process("omaha-holdem 2dAdQsTcTh 5hKdAs3c 6d5s9dQd KhJc5cTd 3hKs5d8s AcJs9c7d Ts8d2s6s JdKc4s6c 9h7c8c3d 8h7h3s4c"));
  }

  @Test
  public void test_omaha_holdem_4881_3c3h4cJdKh_Ks6d9c9h_7s9s7hJh_Js6h2c4h_8dAcKdTd() {
    assertEquals(
      "7s9s7hJh Js6h2c4h Ks6d9c9h 8dAcKdTd",
      Solver.process("omaha-holdem 3c3h4cJdKh Ks6d9c9h 7s9s7hJh Js6h2c4h 8dAcKdTd"));
  }

  @Test
  public void test_omaha_holdem_4882_3c5s9dJcQh_Ac8s6cJh_4d9s2d6s_9c3hQcTs_Qs8c5c2h_Js4s8hAh_Jd2cKsKh_AdQd3d7h() {
    assertEquals(
      "4d9s2d6s Ac8s6cJh=Js4s8hAh Jd2cKsKh AdQd3d7h Qs8c5c2h 9c3hQcTs",
      Solver.process("omaha-holdem 3c5s9dJcQh Ac8s6cJh 4d9s2d6s 9c3hQcTs Qs8c5c2h Js4s8hAh Jd2cKsKh AdQd3d7h"));
  }

  @Test
  public void test_omaha_holdem_4883_5d6sAhJhJs_Jd2dAd7d_4d9dAs2s_Qd2cAcQh_9cThKdKc_7s7hKh3h_4c3s8cQs_6d3c4s7c_2h8sTcTd_6c5cTs6h() {
    assertEquals(
      "4c3s8cQs 6d3c4s7c 7s7hKh3h 2h8sTcTd 9cThKdKc 4d9dAs2s Qd2cAcQh 6c5cTs6h Jd2dAd7d",
      Solver.process("omaha-holdem 5d6sAhJhJs Jd2dAd7d 4d9dAs2s Qd2cAcQh 9cThKdKc 7s7hKh3h 4c3s8cQs 6d3c4s7c 2h8sTcTd 6c5cTs6h"));
  }

  @Test
  public void test_omaha_holdem_4884_2h4d8sJcJd_Ac6h8h3s_TcKdThKs_5s2cTs5h() {
    assertEquals(
      "5s2cTs5h Ac6h8h3s TcKdThKs",
      Solver.process("omaha-holdem 2h4d8sJcJd Ac6h8h3s TcKdThKs 5s2cTs5h"));
  }

  @Test
  public void test_omaha_holdem_4885_4c8cAdAsQh_2hQd9c9h_3h6c5hKs_KcJc7hJs_AhTsKhTc_3c5sQc9s_8h7c4sTh_8d3d2s6h_QsTd6d7d_8s4d4h5c() {
    assertEquals(
      "3h6c5hKs 8d3d2s6h 8h7c4sTh KcJc7hJs 2hQd9c9h=3c5sQc9s QsTd6d7d AhTsKhTc 8s4d4h5c",
      Solver.process("omaha-holdem 4c8cAdAsQh 2hQd9c9h 3h6c5hKs KcJc7hJs AhTsKhTc 3c5sQc9s 8h7c4sTh 8d3d2s6h QsTd6d7d 8s4d4h5c"));
  }

  @Test
  public void test_omaha_holdem_4886_2c6c7hKcKd_9c4sKh9h_Jc4d6d3h_Qc9s7sQh_5h5d4h3c_Ad6hTcQd_Jh5cTsAh_8h8sAs9d_Js3dAcKs() {
    assertEquals(
      "Jh5cTsAh 5h5d4h3c Jc4d6d3h Ad6hTcQd 8h8sAs9d Qc9s7sQh 9c4sKh9h Js3dAcKs",
      Solver.process("omaha-holdem 2c6c7hKcKd 9c4sKh9h Jc4d6d3h Qc9s7sQh 5h5d4h3c Ad6hTcQd Jh5cTsAh 8h8sAs9d Js3dAcKs"));
  }

  @Test
  public void test_omaha_holdem_4887_2c3d3s6hJh_8c8s6c7c_5h3hKdJc() {
    assertEquals(
      "8c8s6c7c 5h3hKdJc",
      Solver.process("omaha-holdem 2c3d3s6hJh 8c8s6c7c 5h3hKdJc"));
  }

  @Test
  public void test_omaha_holdem_4888_3h4s6c9hQh_Jd6s2sJc_3c8h4d4h() {
    assertEquals(
      "Jd6s2sJc 3c8h4d4h",
      Solver.process("omaha-holdem 3h4s6c9hQh Jd6s2sJc 3c8h4d4h"));
  }

  @Test
  public void test_omaha_holdem_4889_2s5c7sJhQc_Jc4cJd4d_7hQh5h9c() {
    assertEquals(
      "7hQh5h9c Jc4cJd4d",
      Solver.process("omaha-holdem 2s5c7sJhQc Jc4cJd4d 7hQh5h9c"));
  }

  @Test
  public void test_omaha_holdem_4890_8h8sAsTcTs_4hQd6c5c_Qh9cTh4s_7h5dQsKh_9dTd5h8c_Kd2sQcJd_8d2c7c9h_7d3sKs2h() {
    assertEquals(
      "4hQd6c5c 7h5dQsKh=Kd2sQcJd 8d2c7c9h Qh9cTh4s 7d3sKs2h 9dTd5h8c",
      Solver.process("omaha-holdem 8h8sAsTcTs 4hQd6c5c Qh9cTh4s 7h5dQsKh 9dTd5h8c Kd2sQcJd 8d2c7c9h 7d3sKs2h"));
  }

  @Test
  public void test_omaha_holdem_4891_4c7hAsQcTd_5s3sKc5d_8hKsJc5h_3cAcTs4s() {
    assertEquals(
      "5s3sKc5d 3cAcTs4s 8hKsJc5h",
      Solver.process("omaha-holdem 4c7hAsQcTd 5s3sKc5d 8hKsJc5h 3cAcTs4s"));
  }

  @Test
  public void test_omaha_holdem_4892_2s5h6h9cTh_9d3d8s3h_8d5c6dQc_Jh2dAc9h() {
    assertEquals(
      "9d3d8s3h 8d5c6dQc Jh2dAc9h",
      Solver.process("omaha-holdem 2s5h6h9cTh 9d3d8s3h 8d5c6dQc Jh2dAc9h"));
  }

  @Test
  public void test_omaha_holdem_4893_3s5c7h9dQs_5d4dTd6d_JdQd4sJh_QcKh8dAs_4h6h9c2d() {
    assertEquals(
      "JdQd4sJh QcKh8dAs 4h6h9c2d=5d4dTd6d",
      Solver.process("omaha-holdem 3s5c7h9dQs 5d4dTd6d JdQd4sJh QcKh8dAs 4h6h9c2d"));
  }

  @Test
  public void test_omaha_holdem_4894_2d2s3c9dTs_6s4c7cJc_8s5s4dJh_2c4sAs6c_Qh5cKcAd_Qc7hTd3h_QdAh5dAc_5h8d3sKh_4hTh8cQs() {
    assertEquals(
      "6s4c7cJc 8s5s4dJh Qh5cKcAd 5h8d3sKh 4hTh8cQs Qc7hTd3h QdAh5dAc 2c4sAs6c",
      Solver.process("omaha-holdem 2d2s3c9dTs 6s4c7cJc 8s5s4dJh 2c4sAs6c Qh5cKcAd Qc7hTd3h QdAh5dAc 5h8d3sKh 4hTh8cQs"));
  }

  @Test
  public void test_omaha_holdem_4895_4s6d7c8dJc_JhAc5hQs_3s5cAd6h_3d7s6cQc_Kc2h3c8s_Ah2sKd8c_2dQhTcAs_ThTs4d4c() {
    assertEquals(
      "2dQhTcAs Kc2h3c8s Ah2sKd8c JhAc5hQs 3d7s6cQc ThTs4d4c 3s5cAd6h",
      Solver.process("omaha-holdem 4s6d7c8dJc JhAc5hQs 3s5cAd6h 3d7s6cQc Kc2h3c8s Ah2sKd8c 2dQhTcAs ThTs4d4c"));
  }

  @Test
  public void test_omaha_holdem_4896_7dQhQsTcTh_3sAc4h6d_9h8d9d4c_JsJhAd9c_TdQc7h9s_2c8s5d7c() {
    assertEquals(
      "3sAc4h6d 2c8s5d7c 9h8d9d4c JsJhAd9c TdQc7h9s",
      Solver.process("omaha-holdem 7dQhQsTcTh 3sAc4h6d 9h8d9d4c JsJhAd9c TdQc7h9s 2c8s5d7c"));
  }

  @Test
  public void test_omaha_holdem_4897_2d6h7c7d9s_2cQcKh8d_KdTh4c6d_JdJs3d8s_QdKc3s7s() {
    assertEquals(
      "2cQcKh8d KdTh4c6d JdJs3d8s QdKc3s7s",
      Solver.process("omaha-holdem 2d6h7c7d9s 2cQcKh8d KdTh4c6d JdJs3d8s QdKc3s7s"));
  }

  @Test
  public void test_omaha_holdem_4898_6c6dJcKcTd_Jh5cQhJs_5d8h9d3c() {
    assertEquals(
      "5d8h9d3c Jh5cQhJs",
      Solver.process("omaha-holdem 6c6dJcKcTd Jh5cQhJs 5d8h9d3c"));
  }

  @Test
  public void test_omaha_holdem_4899_3s6s7h8sKs_6d5hAs3h_8cTh7cJh_Qh9h2d8h_4sJc2s4h_6h5sQsTd_KdQc3dJd_2hTs4dKc_QdJs2cAc() {
    assertEquals(
      "QdJs2cAc Qh9h2d8h 2hTs4dKc 6d5hAs3h 8cTh7cJh KdQc3dJd 4sJc2s4h 6h5sQsTd",
      Solver.process("omaha-holdem 3s6s7h8sKs 6d5hAs3h 8cTh7cJh Qh9h2d8h 4sJc2s4h 6h5sQsTd KdQc3dJd 2hTs4dKc QdJs2cAc"));
  }

  @Test
  public void test_omaha_holdem_4900_6s8sAcQdQh_3sJhJc2s_Kd9c3h4d_Ah6d8d6h_TsJs3c4h_Jd7cTc6c_QsKc5h8h_7s5c8cAd_4s7h9h5d() {
    assertEquals(
      "4s7h9h5d TsJs3c4h Kd9c3h4d Jd7cTc6c 3sJhJc2s 7s5c8cAd Ah6d8d6h QsKc5h8h",
      Solver.process("omaha-holdem 6s8sAcQdQh 3sJhJc2s Kd9c3h4d Ah6d8d6h TsJs3c4h Jd7cTc6c QsKc5h8h 7s5c8cAd 4s7h9h5d"));
  }

  @Test
  public void test_omaha_holdem_4901_2d5c5d5sQc_JsAs6sJc_QhTc9h2s_KcKhAd4c_Ts6dTdQs_5h4d8s4h_Ah8cAc2h() {
    assertEquals(
      "QhTc9h2s Ts6dTdQs JsAs6sJc KcKhAd4c Ah8cAc2h 5h4d8s4h",
      Solver.process("omaha-holdem 2d5c5d5sQc JsAs6sJc QhTc9h2s KcKhAd4c Ts6dTdQs 5h4d8s4h Ah8cAc2h"));
  }

  @Test
  public void test_omaha_holdem_4902_4cKdKsQcQs_3d6sKc7s_Qh3sQdAs_Js9sAcTh_2sKh8h4s_JcJh3cTc_Td9d7h6d_9h8d4d4h() {
    assertEquals(
      "Td9d7h6d Js9sAcTh JcJh3cTc 3d6sKc7s 9h8d4d4h 2sKh8h4s Qh3sQdAs",
      Solver.process("omaha-holdem 4cKdKsQcQs 3d6sKc7s Qh3sQdAs Js9sAcTh 2sKh8h4s JcJh3cTc Td9d7h6d 9h8d4d4h"));
  }

  @Test
  public void test_omaha_holdem_4903_8d9hKsTcTs_7s3sKd6s_Ac4c2c5s_JcQc9c5c() {
    assertEquals(
      "Ac4c2c5s 7s3sKd6s JcQc9c5c",
      Solver.process("omaha-holdem 8d9hKsTcTs 7s3sKd6s Ac4c2c5s JcQc9c5c"));
  }

  @Test
  public void test_omaha_holdem_4904_2d7cAhKhTd_8d3d6cTs_8c8hJdQs_Jc6dQc6s_4c3s3h2h_Qh7dAs9h_Qd5d6h8s_ThAd4s5c_4d5sTc4h() {
    assertEquals(
      "Qd5d6h8s 4c3s3h2h 4d5sTc4h 8d3d6cTs Qh7dAs9h ThAd4s5c 8c8hJdQs=Jc6dQc6s",
      Solver.process("omaha-holdem 2d7cAhKhTd 8d3d6cTs 8c8hJdQs Jc6dQc6s 4c3s3h2h Qh7dAs9h Qd5d6h8s ThAd4s5c 4d5sTc4h"));
  }

  @Test
  public void test_omaha_holdem_4905_3d5c9dJcQd_3hTcQc3c_6dQhTs6s_ThKh9c2d_2c3s6h5h_Kd2h9hJd_5s7hAcQs_2s7dAh8c_5d4hKsJs_8d9sJh8h() {
    assertEquals(
      "2s7dAh8c 6dQhTs6s 2c3s6h5h 5d4hKsJs 8d9sJh8h 5s7hAcQs 3hTcQc3c ThKh9c2d Kd2h9hJd",
      Solver.process("omaha-holdem 3d5c9dJcQd 3hTcQc3c 6dQhTs6s ThKh9c2d 2c3s6h5h Kd2h9hJd 5s7hAcQs 2s7dAh8c 5d4hKsJs 8d9sJh8h"));
  }

  @Test
  public void test_omaha_holdem_4906_3h5d5s8hAs_4cTh6hQh_7dTcKc5h_2d8s6s4s_6dTs3c4h_2h8dAdQc_AcKh9dKd() {
    assertEquals(
      "4cTh6hQh 6dTs3c4h AcKh9dKd 2h8dAdQc 7dTcKc5h 2d8s6s4s",
      Solver.process("omaha-holdem 3h5d5s8hAs 4cTh6hQh 7dTcKc5h 2d8s6s4s 6dTs3c4h 2h8dAdQc AcKh9dKd"));
  }

  @Test
  public void test_omaha_holdem_4907_2c4d5d9hTd_KhJs8h4s_Jc6h9c2d_8s5h9dTs_2h3sThJd_8dAd3c5s_6s5c6d6c_JhKsQs7h_3hAs3dTc() {
    assertEquals(
      "JhKsQs7h KhJs8h4s 6s5c6d6c Jc6h9c2d 2h3sThJd 8s5h9dTs 3hAs3dTc 8dAd3c5s",
      Solver.process("omaha-holdem 2c4d5d9hTd KhJs8h4s Jc6h9c2d 8s5h9dTs 2h3sThJd 8dAd3c5s 6s5c6d6c JhKsQs7h 3hAs3dTc"));
  }

  @Test
  public void test_omaha_holdem_4908_4c6d7s9dQh_5s9sKhQs_2s3c8dKd_QdAs3h9h_5d7h6c7c_2cTd2hTh() {
    assertEquals(
      "2s3c8dKd 2cTd2hTh 5s9sKhQs=QdAs3h9h 5d7h6c7c",
      Solver.process("omaha-holdem 4c6d7s9dQh 5s9sKhQs 2s3c8dKd QdAs3h9h 5d7h6c7c 2cTd2hTh"));
  }

  @Test
  public void test_omaha_holdem_4909_2c3c6d8dQs_9dQhKhAd_Jh5cJsKc_Kd7sTh8h_QdTcJdKs_9s6s4h3h_7h8cJc2s() {
    assertEquals(
      "Kd7sTh8h Jh5cJsKc QdTcJdKs 9dQhKhAd 9s6s4h3h 7h8cJc2s",
      Solver.process("omaha-holdem 2c3c6d8dQs 9dQhKhAd Jh5cJsKc Kd7sTh8h QdTcJdKs 9s6s4h3h 7h8cJc2s"));
  }

  @Test
  public void test_omaha_holdem_4910_6s7d9c9sTc_2hTs2s8h_3c4d5d2c_5s6hJh4c_5h7hKd7c_3s8sQd6d() {
    assertEquals(
      "3c4d5d2c 5s6hJh4c 2hTs2s8h=3s8sQd6d 5h7hKd7c",
      Solver.process("omaha-holdem 6s7d9c9sTc 2hTs2s8h 3c4d5d2c 5s6hJh4c 5h7hKd7c 3s8sQd6d"));
  }

  @Test
  public void test_omaha_holdem_4911_3c5h6dJdKh_3sQc5cAc_Td8sTcKd_JsQdJh6c_Ts8hAh8c_Ad4d5d6h_9hJc3d6s_7c7s9d9c_8dKs7d2h() {
    assertEquals(
      "Ts8hAh8c 7c7s9d9c 8dKs7d2h Td8sTcKd 3sQc5cAc Ad4d5d6h 9hJc3d6s JsQdJh6c",
      Solver.process("omaha-holdem 3c5h6dJdKh 3sQc5cAc Td8sTcKd JsQdJh6c Ts8hAh8c Ad4d5d6h 9hJc3d6s 7c7s9d9c 8dKs7d2h"));
  }

  @Test
  public void test_omaha_holdem_4912_6d6s9sTdTh_Qs5d8sTs_Qd5cAs3s_JhKh4dQh_Jc7h2s6c() {
    assertEquals(
      "JhKh4dQh Qd5cAs3s Jc7h2s6c Qs5d8sTs",
      Solver.process("omaha-holdem 6d6s9sTdTh Qs5d8sTs Qd5cAs3s JhKh4dQh Jc7h2s6c"));
  }

  @Test
  public void test_omaha_holdem_4913_4s5s7cJsTs_3h3s4c5h_9s7s8s8h_6cQhAs2s_QcKhJdQd_9d5dAc4h_2hJh2c4d_6sKc2dJc_7dAh6h8d() {
    assertEquals(
      "6sKc2dJc QcKhJdQd 3h3s4c5h=9d5dAc4h 2hJh2c4d 7dAh6h8d 9s7s8s8h 6cQhAs2s",
      Solver.process("omaha-holdem 4s5s7cJsTs 3h3s4c5h 9s7s8s8h 6cQhAs2s QcKhJdQd 9d5dAc4h 2hJh2c4d 6sKc2dJc 7dAh6h8d"));
  }

  @Test
  public void test_omaha_holdem_4914_2c3c7s9hAc_3s4sTc6s_8sQcAd5h_Kd3hTdJs_QdKh9c8h_Ts9dQh8c_3d4d7c4h_6hKc6dJd() {
    assertEquals(
      "3s4sTc6s Kd3hTdJs 6hKc6dJd Ts9dQh8c QdKh9c8h 8sQcAd5h 3d4d7c4h",
      Solver.process("omaha-holdem 2c3c7s9hAc 3s4sTc6s 8sQcAd5h Kd3hTdJs QdKh9c8h Ts9dQh8c 3d4d7c4h 6hKc6dJd"));
  }

  @Test
  public void test_omaha_holdem_4915_9c9hAsKhQd_2d3sKd7h_Ah2h4d5c_Td3d7d3c_TsQs8c4s_6sJd2s6c_Tc5sJs7c_JhJc9s8s_9d3h5dAd_6dQh6hKs() {
    assertEquals(
      "Td3d7d3c 6sJd2s6c TsQs8c4s 2d3sKd7h 6dQh6hKs Ah2h4d5c JhJc9s8s Tc5sJs7c 9d3h5dAd",
      Solver.process("omaha-holdem 9c9hAsKhQd 2d3sKd7h Ah2h4d5c Td3d7d3c TsQs8c4s 6sJd2s6c Tc5sJs7c JhJc9s8s 9d3h5dAd 6dQh6hKs"));
  }

  @Test
  public void test_omaha_holdem_4916_6s9cKcKdTd_JhJdKh4s_6cAc2d7d_7c5cJc3c_8dTh3sTs_3dQd5d4h_9h8s9s6h_8c2sAsQc_5h8hAdQs_7s4c2hKs() {
    assertEquals(
      "7c5cJc3c 3dQd5d4h 5h8hAdQs=8c2sAsQc 6cAc2d7d 7s4c2hKs JhJdKh4s 9h8s9s6h 8dTh3sTs",
      Solver.process("omaha-holdem 6s9cKcKdTd JhJdKh4s 6cAc2d7d 7c5cJc3c 8dTh3sTs 3dQd5d4h 9h8s9s6h 8c2sAsQc 5h8hAdQs 7s4c2hKs"));
  }

  @Test
  public void test_omaha_holdem_4917_3h3s5sAhQd_6h5dAd6s_Qc2d7hQs_8hTc5hJs_4hJh8dJd_6cKd5c4d() {
    assertEquals(
      "8hTc5hJs 6cKd5c4d 4hJh8dJd 6h5dAd6s Qc2d7hQs",
      Solver.process("omaha-holdem 3h3s5sAhQd 6h5dAd6s Qc2d7hQs 8hTc5hJs 4hJh8dJd 6cKd5c4d"));
  }

  @Test
  public void test_omaha_holdem_4918_2s7c9h9sTs_6sKhTdKs_3h4sAdQd_9d2hAs6c_Qs5cAcJd_8s8h3c6h_Kc8cJh4d_7s4c4h2d_Jc6dQh7h_5dJs5s2c() {
    assertEquals(
      "3h4sAdQd=Qs5cAcJd 7s4c4h2d Jc6dQh7h 8s8h3c6h Kc8cJh4d 5dJs5s2c 6sKhTdKs 9d2hAs6c",
      Solver.process("omaha-holdem 2s7c9h9sTs 6sKhTdKs 3h4sAdQd 9d2hAs6c Qs5cAcJd 8s8h3c6h Kc8cJh4d 7s4c4h2d Jc6dQh7h 5dJs5s2c"));
  }

  @Test
  public void test_omaha_holdem_4919_7d7h8cKsTc_5c5s9dAd_6cQdJc6s_5h4h2c7c_6h2dJd3d_Ts4dQc9h_Kd9cQhJh_4s3hAh9s() {
    assertEquals(
      "6h2dJd3d 4s3hAh9s 5c5s9dAd 6cQdJc6s Ts4dQc9h 5h4h2c7c Kd9cQhJh",
      Solver.process("omaha-holdem 7d7h8cKsTc 5c5s9dAd 6cQdJc6s 5h4h2c7c 6h2dJd3d Ts4dQc9h Kd9cQhJh 4s3hAh9s"));
  }

  @Test
  public void test_omaha_holdem_4920_6c7h9d9hKh_Jc6sJd4d_4h7dTcAs_6h2sKsQc_3sJh2hKd_8d4s3c2c_QhTh5s7s_Kc9s8c8h_QsJs9cTd() {
    assertEquals(
      "8d4s3c2c 4h7dTcAs Jc6sJd4d 6h2sKsQc QsJs9cTd 3sJh2hKd QhTh5s7s Kc9s8c8h",
      Solver.process("omaha-holdem 6c7h9d9hKh Jc6sJd4d 4h7dTcAs 6h2sKsQc 3sJh2hKd 8d4s3c2c QhTh5s7s Kc9s8c8h QsJs9cTd"));
  }

  @Test
  public void test_omaha_holdem_4921_2c3c5dAcQd_As8dJs3d_9sTdQsQc_6c7d2d5h_2sKs6sTc_4dAhJcKd_Ad4hKh7s_Ts9d8h5c() {
    assertEquals(
      "2sKs6sTc Ts9d8h5c 6c7d2d5h As8dJs3d 9sTdQsQc 4dAhJcKd=Ad4hKh7s",
      Solver.process("omaha-holdem 2c3c5dAcQd As8dJs3d 9sTdQsQc 6c7d2d5h 2sKs6sTc 4dAhJcKd Ad4hKh7s Ts9d8h5c"));
  }

  @Test
  public void test_omaha_holdem_4922_3d4s7dJdTh_2hTd5hQd_9d6h6sQs() {
    assertEquals(
      "9d6h6sQs 2hTd5hQd",
      Solver.process("omaha-holdem 3d4s7dJdTh 2hTd5hQd 9d6h6sQs"));
  }

  @Test
  public void test_omaha_holdem_4923_2s7dJsKsQc_9c5sQsTd_4h6hThKd_2cKh4d6c_2hJhQh8s_8c3cJcAs() {
    assertEquals(
      "8c3cJcAs 4h6hThKd 2hJhQh8s 2cKh4d6c 9c5sQsTd",
      Solver.process("omaha-holdem 2s7dJsKsQc 9c5sQsTd 4h6hThKd 2cKh4d6c 2hJhQh8s 8c3cJcAs"));
  }

  @Test
  public void test_omaha_holdem_4924_7s8dJsKhKs_2d4h7cAd_5hQs9s2s_Qd7dAc7h_Tc3d9d4c_AhQh9cJd() {
    assertEquals(
      "2d4h7cAd AhQh9cJd Tc3d9d4c 5hQs9s2s Qd7dAc7h",
      Solver.process("omaha-holdem 7s8dJsKhKs 2d4h7cAd 5hQs9s2s Qd7dAc7h Tc3d9d4c AhQh9cJd"));
  }

  @Test
  public void test_omaha_holdem_4925_3d3s6c8sQd_Ad2sJcKs_AsQc7s5c_4cQs2d2h() {
    assertEquals(
      "Ad2sJcKs 4cQs2d2h AsQc7s5c",
      Solver.process("omaha-holdem 3d3s6c8sQd Ad2sJcKs AsQc7s5c 4cQs2d2h"));
  }

  @Test
  public void test_omaha_holdem_4926_3sAdKdQsTc_5s6cJc7s_9s6d9c4c() {
    assertEquals(
      "5s6cJc7s 9s6d9c4c",
      Solver.process("omaha-holdem 3sAdKdQsTc 5s6cJc7s 9s6d9c4c"));
  }

  @Test
  public void test_omaha_holdem_4927_2d3s5s7h7s_7d8hQdJs_KsAs8c6h_KhTsTc9c_Ah9h9s8d_3cKd5h2s() {
    assertEquals(
      "3cKd5h2s Ah9h9s8d KhTsTc9c 7d8hQdJs KsAs8c6h",
      Solver.process("omaha-holdem 2d3s5s7h7s 7d8hQdJs KsAs8c6h KhTsTc9c Ah9h9s8d 3cKd5h2s"));
  }

  @Test
  public void test_omaha_holdem_4928_6d6sAhKhTh_TcAs4h4s_9d2h3s9h_2s8c7dKs_5h5dKc7h_4dTs7s4c_2cQsJd3c() {
    assertEquals(
      "4dTs7s4c 2s8c7dKs TcAs4h4s 2cQsJd3c 5h5dKc7h 9d2h3s9h",
      Solver.process("omaha-holdem 6d6sAhKhTh TcAs4h4s 9d2h3s9h 2s8c7dKs 5h5dKc7h 4dTs7s4c 2cQsJd3c"));
  }

  @Test
  public void test_omaha_holdem_4929_AcAhJsKhQc_3sJc4sKs_2sJhTc8d_4h9s4cKd_6hAsTdQh_Ts8hQs6c_Th5d7d3c_9h7c6d8s() {
    assertEquals(
      "9h7c6d8s Th5d7d3c 4h9s4cKd 3sJc4sKs 2sJhTc8d=Ts8hQs6c 6hAsTdQh",
      Solver.process("omaha-holdem AcAhJsKhQc 3sJc4sKs 2sJhTc8d 4h9s4cKd 6hAsTdQh Ts8hQs6c Th5d7d3c 9h7c6d8s"));
  }

  @Test
  public void test_omaha_holdem_4930_5d5s6dJcJh_Qc6sTc8s_8hJdTs8c_7c2c9d7s_2h2d6hAh_Kc9cQsAd_8d3c4hQd_KsKh5h3d() {
    assertEquals(
      "8d3c4hQd Kc9cQsAd Qc6sTc8s 2h2d6hAh 7c2c9d7s KsKh5h3d 8hJdTs8c",
      Solver.process("omaha-holdem 5d5s6dJcJh Qc6sTc8s 8hJdTs8c 7c2c9d7s 2h2d6hAh Kc9cQsAd 8d3c4hQd KsKh5h3d"));
  }

  @Test
  public void test_omaha_holdem_4931_2d3h5h8h8s_2c9c7hQs_Jc4sThAh_7s3c9s2h_8dKs3dAd_Qd5d4d9h_7c6d6c6h() {
    assertEquals(
      "2c9c7hQs 7s3c9s2h Qd5d4d9h 7c6d6c6h Jc4sThAh 8dKs3dAd",
      Solver.process("omaha-holdem 2d3h5h8h8s 2c9c7hQs Jc4sThAh 7s3c9s2h 8dKs3dAd Qd5d4d9h 7c6d6c6h"));
  }

  @Test
  public void test_omaha_holdem_4932_4s8d9hAdTs_9dQc5hTh_8sQh4d6d_2c4h9c2d_5d7hKs3h_Kh6sQs7d_5s2hKd5c_Td4c2sJs_7sJh8hJd() {
    assertEquals(
      "5d7hKs3h 5s2hKd5c 8sQh4d6d 2c4h9c2d Td4c2sJs 9dQc5hTh Kh6sQs7d 7sJh8hJd",
      Solver.process("omaha-holdem 4s8d9hAdTs 9dQc5hTh 8sQh4d6d 2c4h9c2d 5d7hKs3h Kh6sQs7d 5s2hKd5c Td4c2sJs 7sJh8hJd"));
  }

  @Test
  public void test_omaha_holdem_4933_4c4d9hKcKd_3cTcAd4h_2d3hAh8h_7hQsTsQc() {
    assertEquals(
      "2d3hAh8h 7hQsTsQc 3cTcAd4h",
      Solver.process("omaha-holdem 4c4d9hKcKd 3cTcAd4h 2d3hAh8h 7hQsTsQc"));
  }

  @Test
  public void test_omaha_holdem_4934_2d8c8sAdTh_3sKd6h5c_Ac9sJdAh_JhKc8hQd_As6s7h8d_4c4sQh5s_Tc7d4hTs_Qs7c3hQc() {
    assertEquals(
      "3sKd6h5c 4c4sQh5s Qs7c3hQc JhKc8hQd As6s7h8d Tc7d4hTs Ac9sJdAh",
      Solver.process("omaha-holdem 2d8c8sAdTh 3sKd6h5c Ac9sJdAh JhKc8hQd As6s7h8d 4c4sQh5s Tc7d4hTs Qs7c3hQc"));
  }

  @Test
  public void test_omaha_holdem_4935_2h4c4d4hAh_JsKs6h2c_2sAs5sQd_7hAc7sTs_3d4s3h6d_8hTdJd7c_5dAdKhTc_6c8d5c3s_9c9dQc8s() {
    assertEquals(
      "8hTdJd7c JsKs6h2c 2sAs5sQd 5dAdKhTc 6c8d5c3s 7hAc7sTs 9c9dQc8s 3d4s3h6d",
      Solver.process("omaha-holdem 2h4c4d4hAh JsKs6h2c 2sAs5sQd 7hAc7sTs 3d4s3h6d 8hTdJd7c 5dAdKhTc 6c8d5c3s 9c9dQc8s"));
  }

  @Test
  public void test_omaha_holdem_4936_5c5s6s7s8s_6dAs3s6c_6h7hQc9s_QdJh8hKh_4d9dTd2c_4sAd7d8c_9h7c3cQh() {
    assertEquals(
      "QdJh8hKh 4sAd7d8c 6h7hQc9s=9h7c3cQh 4d9dTd2c 6dAs3s6c",
      Solver.process("omaha-holdem 5c5s6s7s8s 6dAs3s6c 6h7hQc9s QdJh8hKh 4d9dTd2c 4sAd7d8c 9h7c3cQh"));
  }

  @Test
  public void test_omaha_holdem_4937_2h2s4d5dAd_4sTs5sAs_7cAh6s9d_3sTd6d2c_JsJcQh5c_4c7d7sKc_3d4hQs9h_9s9cAc6c_8h8dJd3c() {
    assertEquals(
      "4c7d7sKc JsJcQh5c 7cAh6s9d=9s9cAc6c 4sTs5sAs 3d4hQs9h 3sTd6d2c 8h8dJd3c",
      Solver.process("omaha-holdem 2h2s4d5dAd 4sTs5sAs 7cAh6s9d 3sTd6d2c JsJcQh5c 4c7d7sKc 3d4hQs9h 9s9cAc6c 8h8dJd3c"));
  }

  @Test
  public void test_omaha_holdem_4938_4s7c8hJcKd_5h4h7d3s_2h9c6h5s_9d2dAs3d_6cTc2sKs_Ac9hAhJs_6dQhThKc_8s9s8d5d_KhQc3c2c() {
    assertEquals(
      "9d2dAs3d 6cTc2sKs 6dQhThKc=KhQc3c2c Ac9hAhJs 5h4h7d3s 8s9s8d5d 2h9c6h5s",
      Solver.process("omaha-holdem 4s7c8hJcKd 5h4h7d3s 2h9c6h5s 9d2dAs3d 6cTc2sKs Ac9hAhJs 6dQhThKc 8s9s8d5d KhQc3c2c"));
  }

  @Test
  public void test_omaha_holdem_4939_2d5d6c7c8s_3s6h8dQh_2c2sJsTs_Jd9sKc7h_7s6s4d9d() {
    assertEquals(
      "3s6h8dQh 2c2sJsTs 7s6s4d9d=Jd9sKc7h",
      Solver.process("omaha-holdem 2d5d6c7c8s 3s6h8dQh 2c2sJsTs Jd9sKc7h 7s6s4d9d"));
  }

  @Test
  public void test_omaha_holdem_4940_2hAsJhTcTd_AcJsAh4d_5s8dAd7s_5c9hThQd_Kd9c9sQh_2s3d4cQs_3c6cTs6h_7d6s8hKc_3h2c5hKh() {
    assertEquals(
      "7d6s8hKc 2s3d4cQs 3h2c5hKh 5s8dAd7s 3c6cTs6h 5c9hThQd Kd9c9sQh AcJsAh4d",
      Solver.process("omaha-holdem 2hAsJhTcTd AcJsAh4d 5s8dAd7s 5c9hThQd Kd9c9sQh 2s3d4cQs 3c6cTs6h 7d6s8hKc 3h2c5hKh"));
  }

  @Test
  public void test_omaha_holdem_4941_5s6c7dAsQd_3s8h5c2h_3c8s6sKs() {
    assertEquals(
      "3s8h5c2h 3c8s6sKs",
      Solver.process("omaha-holdem 5s6c7dAsQd 3s8h5c2h 3c8s6sKs"));
  }

  @Test
  public void test_omaha_holdem_4942_2s8c8hQhQs_Ah2h7c9c_9h4h3h5s() {
    assertEquals(
      "9h4h3h5s Ah2h7c9c",
      Solver.process("omaha-holdem 2s8c8hQhQs Ah2h7c9c 9h4h3h5s"));
  }

  @Test
  public void test_omaha_holdem_4943_3h4s7s9dJh_Tc3d7cQs_ThAc8d7d_6h7hQc4h_JdAhKc5h_Kd6d4c3c() {
    assertEquals(
      "JdAhKc5h Kd6d4c3c Tc3d7cQs 6h7hQc4h ThAc8d7d",
      Solver.process("omaha-holdem 3h4s7s9dJh Tc3d7cQs ThAc8d7d 6h7hQc4h JdAhKc5h Kd6d4c3c"));
  }

  @Test
  public void test_omaha_holdem_4944_3s7d9cAcQd_8dJc6hKs_7h3d2s9h_9s3c4d5s_Js2dAdTd() {
    assertEquals(
      "8dJc6hKs Js2dAdTd 9s3c4d5s 7h3d2s9h",
      Solver.process("omaha-holdem 3s7d9cAcQd 8dJc6hKs 7h3d2s9h 9s3c4d5s Js2dAdTd"));
  }

  @Test
  public void test_omaha_holdem_4945_AhJcJdQcQd_9dAs8hJh_Td2s3hJs_8c9h6cAd_Th5c6s4c_5d6h7c5s() {
    assertEquals(
      "Th5c6s4c 5d6h7c5s 8c9h6cAd Td2s3hJs 9dAs8hJh",
      Solver.process("omaha-holdem AhJcJdQcQd 9dAs8hJh Td2s3hJs 8c9h6cAd Th5c6s4c 5d6h7c5s"));
  }

  @Test
  public void test_omaha_holdem_4946_2d8hAhJcTd_6hTc5cTs_Ad7h8s9c_5h6s3hJd_Th5s9h3s_QcJh2s2c() {
    assertEquals(
      "Th5s9h3s 5h6s3hJd QcJh2s2c 6hTc5cTs Ad7h8s9c",
      Solver.process("omaha-holdem 2d8hAhJcTd 6hTc5cTs Ad7h8s9c 5h6s3hJd Th5s9h3s QcJh2s2c"));
  }

  @Test
  public void test_omaha_holdem_4947_5c6s8hJcKs_Js5d5s8s_AcQs9s6c() {
    assertEquals(
      "AcQs9s6c Js5d5s8s",
      Solver.process("omaha-holdem 5c6s8hJcKs Js5d5s8s AcQs9s6c"));
  }

  @Test
  public void test_omaha_holdem_4948_3h8hJhJsTs_2h8c3c2s_6sQdQc9h() {
    assertEquals(
      "2h8c3c2s 6sQdQc9h",
      Solver.process("omaha-holdem 3h8hJhJsTs 2h8c3c2s 6sQdQc9h"));
  }

  @Test
  public void test_omaha_holdem_4949_3c4c8cJcTs_7d6sKd7c_AcAs9s9d_4sQdQs9c_7hKc5h8d_7s5d2sJh_Ks6c9h5c_8h2d4hAd_2c3d5sTd() {
    assertEquals(
      "7d6sKd7c 7hKc5h8d 7s5d2sJh AcAs9s9d 8h2d4hAd 2c3d5sTd 4sQdQs9c Ks6c9h5c",
      Solver.process("omaha-holdem 3c4c8cJcTs 7d6sKd7c AcAs9s9d 4sQdQs9c 7hKc5h8d 7s5d2sJh Ks6c9h5c 8h2d4hAd 2c3d5sTd"));
  }

  @Test
  public void test_omaha_holdem_4950_2s3s8cJdKh_Ad4s4h5s_7h4dKdQd_8d3h6s3d_6d9hTcTd_9c4c6hJs_AcKsQsAh() {
    assertEquals(
      "Ad4s4h5s 6d9hTcTd 9c4c6hJs 7h4dKdQd AcKsQsAh 8d3h6s3d",
      Solver.process("omaha-holdem 2s3s8cJdKh Ad4s4h5s 7h4dKdQd 8d3h6s3d 6d9hTcTd 9c4c6hJs AcKsQsAh"));
  }

  @Test
  public void test_omaha_holdem_4951_4d8sAcAsKs_KdAh7s2d_8c4sTdQc_2h5s5c9h_JsJc4h7d_9s2sKh3h_Jd6s3s9d() {
    assertEquals(
      "2h5s5c9h 8c4sTdQc JsJc4h7d Jd6s3s9d 9s2sKh3h KdAh7s2d",
      Solver.process("omaha-holdem 4d8sAcAsKs KdAh7s2d 8c4sTdQc 2h5s5c9h JsJc4h7d 9s2sKh3h Jd6s3s9d"));
  }

  @Test
  public void test_omaha_holdem_4952_2s5d7c7dAc_2dKd8cQs_5sKh4s3c_TdJsQh5c_6c6sJd4h_9d8hQd8s_9cKc7h6h_JhJc3hAd_Th7s4c9s_Ts8d2c3d() {
    assertEquals(
      "Ts8d2c3d 2dKd8cQs TdJsQh5c 6c6sJd4h 9d8hQd8s JhJc3hAd Th7s4c9s 9cKc7h6h 5sKh4s3c",
      Solver.process("omaha-holdem 2s5d7c7dAc 2dKd8cQs 5sKh4s3c TdJsQh5c 6c6sJd4h 9d8hQd8s 9cKc7h6h JhJc3hAd Th7s4c9s Ts8d2c3d"));
  }

  @Test
  public void test_omaha_holdem_4953_2s4h5h8sTc_6h7dTh4c_JdTd3d5s_KdQcAhQd_3s9h2dAs() {
    assertEquals(
      "KdQcAhQd JdTd3d5s 3s9h2dAs 6h7dTh4c",
      Solver.process("omaha-holdem 2s4h5h8sTc 6h7dTh4c JdTd3d5s KdQcAhQd 3s9h2dAs"));
  }

  @Test
  public void test_omaha_holdem_4954_4h5c6hAsKh_8h7d6s8c_JdJc4s2h_Kd4cJs3h() {
    assertEquals(
      "JdJc4s2h Kd4cJs3h 8h7d6s8c",
      Solver.process("omaha-holdem 4h5c6hAsKh 8h7d6s8c JdJc4s2h Kd4cJs3h"));
  }

  @Test
  public void test_omaha_holdem_4955_4h9cAcKdTs_Jc2c8h6c_Kc7c9d4s_3dAhAs7d_QsKh2sQh_Ks6h2d5h() {
    assertEquals(
      "Jc2c8h6c Ks6h2d5h QsKh2sQh Kc7c9d4s 3dAhAs7d",
      Solver.process("omaha-holdem 4h9cAcKdTs Jc2c8h6c Kc7c9d4s 3dAhAs7d QsKh2sQh Ks6h2d5h"));
  }

  @Test
  public void test_omaha_holdem_4956_4d8d9cAhQh_2c7h8sKs_AsThQsKh_4cJcJhQd_3s7s2s2d_3c4s3h6d_3dTd9h5c_Ac8c2h9d_9sJsQc7d_5h6hTsAd() {
    assertEquals(
      "3s7s2s2d 3c4s3h6d 2c7h8sKs 3dTd9h5c 5h6hTsAd 4cJcJhQd 9sJsQc7d Ac8c2h9d AsThQsKh",
      Solver.process("omaha-holdem 4d8d9cAhQh 2c7h8sKs AsThQsKh 4cJcJhQd 3s7s2s2d 3c4s3h6d 3dTd9h5c Ac8c2h9d 9sJsQc7d 5h6hTsAd"));
  }

  @Test
  public void test_omaha_holdem_4957_5s8h9hJdTh_TcAs3d2c_6d8cJs7h_5d6h4c4d_Jc8s4s7c_7d7sTs3h_9sQsQd6s_8d3c3sQc_5hKdAh4h_2h6cKsKc() {
    assertEquals(
      "5d6h4c4d TcAs3d2c 2h6cKsKc 6d8cJs7h=7d7sTs3h=Jc8s4s7c 8d3c3sQc=9sQsQd6s 5hKdAh4h",
      Solver.process("omaha-holdem 5s8h9hJdTh TcAs3d2c 6d8cJs7h 5d6h4c4d Jc8s4s7c 7d7sTs3h 9sQsQd6s 8d3c3sQc 5hKdAh4h 2h6cKsKc"));
  }

  @Test
  public void test_omaha_holdem_4958_4c6c6hJsTd_4hTs5c8d_As2d2h8s_5hQs3sKc_3d2s4dQh_Kd7dKhJd_6s9s7cTc_AhJcJh2c_8c5sAd3h() {
    assertEquals(
      "5hQs3sKc 8c5sAd3h As2d2h8s 3d2s4dQh 4hTs5c8d Kd7dKhJd 6s9s7cTc AhJcJh2c",
      Solver.process("omaha-holdem 4c6c6hJsTd 4hTs5c8d As2d2h8s 5hQs3sKc 3d2s4dQh Kd7dKhJd 6s9s7cTc AhJcJh2c 8c5sAd3h"));
  }

  @Test
  public void test_omaha_holdem_4959_2d7c8cQdQh_Kd7sAh3c_9dAcJs9c_3hJcTd2s_2c8hJh5d_Qc4s6d6s_KsKc6c8s() {
    assertEquals(
      "3hJcTd2s Kd7sAh3c 2c8hJh5d 9dAcJs9c KsKc6c8s Qc4s6d6s",
      Solver.process("omaha-holdem 2d7c8cQdQh Kd7sAh3c 9dAcJs9c 3hJcTd2s 2c8hJh5d Qc4s6d6s KsKc6c8s"));
  }

  @Test
  public void test_omaha_holdem_4960_2d5d6sKsTs_ThTcAhJs_2c6d8s6c_3d7cJhAs_7d4cQh8d_5c7h4hTd_7s9sAc3c_KcKh4sAd_8c2h6h9c_4dQcJdQs() {
    assertEquals(
      "7d4cQh8d 3d7cJhAs 4dQcJdQs 8c2h6h9c 5c7h4hTd 2c6d8s6c ThTcAhJs KcKh4sAd 7s9sAc3c",
      Solver.process("omaha-holdem 2d5d6sKsTs ThTcAhJs 2c6d8s6c 3d7cJhAs 7d4cQh8d 5c7h4hTd 7s9sAc3c KcKh4sAd 8c2h6h9c 4dQcJdQs"));
  }

  @Test
  public void test_omaha_holdem_4961_3s7cKcQsTs_8sAs5d8h_7d6h5cAd_Jh3h7h4h_9d8cJd3c_Kh6s5h8d_QcAhKd2d_JcTc4c2h() {
    assertEquals(
      "7d6h5cAd JcTc4c2h Kh6s5h8d Jh3h7h4h QcAhKd2d 9d8cJd3c 8sAs5d8h",
      Solver.process("omaha-holdem 3s7cKcQsTs 8sAs5d8h 7d6h5cAd Jh3h7h4h 9d8cJd3c Kh6s5h8d QcAhKd2d JcTc4c2h"));
  }

  @Test
  public void test_omaha_holdem_4962_5c5d8sJcQh_2h6s7sJh_ThQs3s9d_5h7c4cKd_TsTdTcKs_Qd3h4d6d_2c5sAc6c_Jd9c3d2s_9hAsKhQc() {
    assertEquals(
      "TsTdTcKs 2h6s7sJh Jd9c3d2s Qd3h4d6d 9hAsKhQc 5h7c4cKd 2c5sAc6c ThQs3s9d",
      Solver.process("omaha-holdem 5c5d8sJcQh 2h6s7sJh ThQs3s9d 5h7c4cKd TsTdTcKs Qd3h4d6d 2c5sAc6c Jd9c3d2s 9hAsKhQc"));
  }

  @Test
  public void test_omaha_holdem_4963_2h3c5d7cQc_3hAd3d9d_6s4h3s7s_4s8cTh5c_8h2dAs7h_6d6hJcKs_8d7dJsTd_Qh2s5s2c_9c9s4d9h_8sAhJdJh() {
    assertEquals(
      "6d6hJcKs 8d7dJsTd 9c9s4d9h 8sAhJdJh 8h2dAs7h Qh2s5s2c 3hAd3d9d 6s4h3s7s 4s8cTh5c",
      Solver.process("omaha-holdem 2h3c5d7cQc 3hAd3d9d 6s4h3s7s 4s8cTh5c 8h2dAs7h 6d6hJcKs 8d7dJsTd Qh2s5s2c 9c9s4d9h 8sAhJdJh"));
  }

  @Test
  public void test_omaha_holdem_4964_3h5s7d9dKd_9hQd8sAd_3s7h6dAc_TcKsJcTh_2h9cQsTs_9s7cJh2c_2s5h4d8c() {
    assertEquals(
      "2s5h4d8c 2h9cQsTs TcKsJcTh 3s7h6dAc 9s7cJh2c 9hQd8sAd",
      Solver.process("omaha-holdem 3h5s7d9dKd 9hQd8sAd 3s7h6dAc TcKsJcTh 2h9cQsTs 9s7cJh2c 2s5h4d8c"));
  }

  @Test
  public void test_omaha_holdem_4965_3h6hAcAsKc_7sQs7dTs_Th2h3s4d_9c4s4hTd_5hKsAdQd_5d3d9s6s_2d8h4c6d_Kh7c2cJs_5sJh8d5c_Qh2s9h8s() {
    assertEquals(
      "Qh2s9h8s Th2h3s4d 9c4s4hTd 5sJh8d5c 2d8h4c6d 5d3d9s6s 7sQs7dTs Kh7c2cJs 5hKsAdQd",
      Solver.process("omaha-holdem 3h6hAcAsKc 7sQs7dTs Th2h3s4d 9c4s4hTd 5hKsAdQd 5d3d9s6s 2d8h4c6d Kh7c2cJs 5sJh8d5c Qh2s9h8s"));
  }

  @Test
  public void test_omaha_holdem_4966_7c8s9cAsKc_3s9hQh4c_3hQs2c9d() {
    assertEquals(
      "3hQs2c9d=3s9hQh4c",
      Solver.process("omaha-holdem 7c8s9cAsKc 3s9hQh4c 3hQs2c9d"));
  }

  @Test
  public void test_omaha_holdem_4967_5h8dAhQdTd_8h2d8cKh_3c9c3d8s() {
    assertEquals(
      "3c9c3d8s 8h2d8cKh",
      Solver.process("omaha-holdem 5h8dAhQdTd 8h2d8cKh 3c9c3d8s"));
  }

  @Test
  public void test_omaha_holdem_4968_2c4sKcKhQc_2d3cJcQs_8dJs3sAh_8c7cTc9c_Ad9d5d8s_6h3dKdJd() {
    assertEquals(
      "Ad9d5d8s 8dJs3sAh 6h3dKdJd 8c7cTc9c 2d3cJcQs",
      Solver.process("omaha-holdem 2c4sKcKhQc 2d3cJcQs 8dJs3sAh 8c7cTc9c Ad9d5d8s 6h3dKdJd"));
  }

  @Test
  public void test_omaha_holdem_4969_4c8sAdThTs_JsQc7cKs_7s3h7h3d_6cKhJcKc_TcQhAc5h_5s8d8h8c_5c4sTdKd_Ah4dJd2c() {
    assertEquals(
      "JsQc7cKs 7s3h7h3d 6cKhJcKc Ah4dJd2c 5s8d8h8c 5c4sTdKd TcQhAc5h",
      Solver.process("omaha-holdem 4c8sAdThTs JsQc7cKs 7s3h7h3d 6cKhJcKc TcQhAc5h 5s8d8h8c 5c4sTdKd Ah4dJd2c"));
  }

  @Test
  public void test_omaha_holdem_4970_4d6s9c9dKc_KdTd6dJs_7dQh2sQc_Jd6h9s3h_Jc2dThQd_5sJh9h7c_4c7h6c8d_Tc5c8sAh_2cAc4h2h() {
    assertEquals(
      "Jc2dThQd Tc5c8sAh 2cAc4h2h 4c7h6c8d 7dQh2sQc KdTd6dJs 5sJh9h7c Jd6h9s3h",
      Solver.process("omaha-holdem 4d6s9c9dKc KdTd6dJs 7dQh2sQc Jd6h9s3h Jc2dThQd 5sJh9h7c 4c7h6c8d Tc5c8sAh 2cAc4h2h"));
  }

  @Test
  public void test_omaha_holdem_4971_4c4s5s7d8c_2h9s5cQc_TdJs2d8d_QsTcTsJh_2c7h6c4d_3sQdKh3d_JcKdJdKs() {
    assertEquals(
      "3sQdKh3d 2h9s5cQc TdJs2d8d QsTcTsJh JcKdJdKs 2c7h6c4d",
      Solver.process("omaha-holdem 4c4s5s7d8c 2h9s5cQc TdJs2d8d QsTcTsJh 2c7h6c4d 3sQdKh3d JcKdJdKs"));
  }

  @Test
  public void test_omaha_holdem_4972_2c4hAdJdKh_7dKc2h5s_AcTh6c9d_Tc6sKs4s_5h3d7s3c_8cQd6h3s_8s9c2s8d_8hAs5cAh_2dTd9sJh() {
    assertEquals(
      "8cQd6h3s 8s9c2s8d AcTh6c9d 2dTd9sJh 7dKc2h5s Tc6sKs4s 8hAs5cAh 5h3d7s3c",
      Solver.process("omaha-holdem 2c4hAdJdKh 7dKc2h5s AcTh6c9d Tc6sKs4s 5h3d7s3c 8cQd6h3s 8s9c2s8d 8hAs5cAh 2dTd9sJh"));
  }

  @Test
  public void test_omaha_holdem_4973_2d6h9cJsTh_4c3d8sKs_Jc5d3h7h_8dTc3cAd_5c7sKc7d_9h9sAsAh_Qh8c4hKh_5s6s4sTs_7c3sTd8h_6d4dJhKd() {
    assertEquals(
      "4c3d8sKs 5c7sKc7d 8dTc3cAd Jc5d3h7h 5s6s4sTs 6d4dJhKd 9h9sAsAh 7c3sTd8h Qh8c4hKh",
      Solver.process("omaha-holdem 2d6h9cJsTh 4c3d8sKs Jc5d3h7h 8dTc3cAd 5c7sKc7d 9h9sAsAh Qh8c4hKh 5s6s4sTs 7c3sTd8h 6d4dJhKd"));
  }

  @Test
  public void test_omaha_holdem_4974_2h3d7d9dQs_6s8d3s9c_6cAcAhKs() {
    assertEquals(
      "6cAcAhKs 6s8d3s9c",
      Solver.process("omaha-holdem 2h3d7d9dQs 6s8d3s9c 6cAcAhKs"));
  }

  @Test
  public void test_omaha_holdem_4975_2d3h5dJhJs_5s6sKhAd_JcQcKc9c_As8d4d6d_3c7d9h5h_5cAc8h9s_3s2hTsQh() {
    assertEquals(
      "3s2hTsQh 3c7d9h5h 5cAc8h9s=5s6sKhAd JcQcKc9c As8d4d6d",
      Solver.process("omaha-holdem 2d3h5dJhJs 5s6sKhAd JcQcKc9c As8d4d6d 3c7d9h5h 5cAc8h9s 3s2hTsQh"));
  }

  @Test
  public void test_omaha_holdem_4976_2c5h5s6sAd_Ac8cJc7d_3s2h3h3d_Qh8d6c7c_QcTd6h4d_4sQs9c5c_2dAsKd8h_3cJdAhKs_7h4h2sKh() {
    assertEquals(
      "7h4h2sKh 3s2h3h3d QcTd6h4d=Qh8d6c7c Ac8cJc7d 2dAsKd8h=3cJdAhKs 4sQs9c5c",
      Solver.process("omaha-holdem 2c5h5s6sAd Ac8cJc7d 3s2h3h3d Qh8d6c7c QcTd6h4d 4sQs9c5c 2dAsKd8h 3cJdAhKs 7h4h2sKh"));
  }

  @Test
  public void test_omaha_holdem_4977_3s5c6c9hKc_9c2dJd5s_Ts3h9s5d_Ks4hTd7s_6hTcQd8h_Qc4c5hAh_Jc2s9dAc_6d8dJs4s() {
    assertEquals(
      "6d8dJs4s 6hTcQd8h 9c2dJd5s=Ts3h9s5d Ks4hTd7s Qc4c5hAh Jc2s9dAc",
      Solver.process("omaha-holdem 3s5c6c9hKc 9c2dJd5s Ts3h9s5d Ks4hTd7s 6hTcQd8h Qc4c5hAh Jc2s9dAc 6d8dJs4s"));
  }

  @Test
  public void test_omaha_holdem_4978_3s7hAdJcKh_6c4hQs6d_Ah5h2h8s_2cTd3cAs_7s4c6hJh_AcKcKs9s() {
    assertEquals(
      "6c4hQs6d Ah5h2h8s 7s4c6hJh 2cTd3cAs AcKcKs9s",
      Solver.process("omaha-holdem 3s7hAdJcKh 6c4hQs6d Ah5h2h8s 2cTd3cAs 7s4c6hJh AcKcKs9s"));
  }

  @Test
  public void test_omaha_holdem_4979_4s5d8sJcQh_AdAsAh3h_6cTh8cKc_8d6sTd7d_JsTs6d2d_Ks2c9c3d_Qc3sKd5h_6h4hAc7c_Qd5c5sQs() {
    assertEquals(
      "Ks2c9c3d 6cTh8cKc JsTs6d2d AdAsAh3h Qc3sKd5h Qd5c5sQs 6h4hAc7c=8d6sTd7d",
      Solver.process("omaha-holdem 4s5d8sJcQh AdAsAh3h 6cTh8cKc 8d6sTd7d JsTs6d2d Ks2c9c3d Qc3sKd5h 6h4hAc7c Qd5c5sQs"));
  }

  @Test
  public void test_omaha_holdem_4980_7c7h8sKdTs_5h4dQs9h_8d7d2sKc_As6h3cTc_5c3s5d3h() {
    assertEquals(
      "5h4dQs9h 5c3s5d3h As6h3cTc 8d7d2sKc",
      Solver.process("omaha-holdem 7c7h8sKdTs 5h4dQs9h 8d7d2sKc As6h3cTc 5c3s5d3h"));
  }

  @Test
  public void test_omaha_holdem_4981_3h3s6sAsTd_Kh6d4hAh_Ks2d7s6h_7dJdKcJc_Th3cTs6c_Ad3dJh7h_Qs9s2s5c_Ac4s5hQc() {
    assertEquals(
      "7dJdKcJc Ac4s5hQc Kh6d4hAh Qs9s2s5c Ks2d7s6h Ad3dJh7h Th3cTs6c",
      Solver.process("omaha-holdem 3h3s6sAsTd Kh6d4hAh Ks2d7s6h 7dJdKcJc Th3cTs6c Ad3dJh7h Qs9s2s5c Ac4s5hQc"));
  }

  @Test
  public void test_omaha_holdem_4982_4s7c9hAdQd_4hTh3sTs_Kh3c4d6c_4cQs9d5c_5hAhTc8d_8c5s9c8h_Js6sQc7d_3dQh2d7s() {
    assertEquals(
      "Kh3c4d6c 8c5s9c8h 4hTh3sTs 5hAhTc8d 3dQh2d7s=Js6sQc7d 4cQs9d5c",
      Solver.process("omaha-holdem 4s7c9hAdQd 4hTh3sTs Kh3c4d6c 4cQs9d5c 5hAhTc8d 8c5s9c8h Js6sQc7d 3dQh2d7s"));
  }

  @Test
  public void test_omaha_holdem_4983_3d3h7s8dJd_Qd6hKh7h_QsQc9h8h_4d5hTsKd() {
    assertEquals(
      "Qd6hKh7h QsQc9h8h 4d5hTsKd",
      Solver.process("omaha-holdem 3d3h7s8dJd Qd6hKh7h QsQc9h8h 4d5hTsKd"));
  }

  @Test
  public void test_omaha_holdem_4984_3s7h9hAhKd_2cJsJd3h_As6sAcJc_5h4h3c8h_7sTdJh4c() {
    assertEquals(
      "7sTdJh4c 2cJsJd3h As6sAcJc 5h4h3c8h",
      Solver.process("omaha-holdem 3s7h9hAhKd 2cJsJd3h As6sAcJc 5h4h3c8h 7sTdJh4c"));
  }

  @Test
  public void test_omaha_holdem_4985_4c4h5d6d7s_TcJc9h6h_QhQs7h6c_7dQd5s9d_AsKh4s3d_2cTh8hKd_9sAc5c6s() {
    assertEquals(
      "2cTh8hKd TcJc9h6h 9sAc5c6s 7dQd5s9d QhQs7h6c AsKh4s3d",
      Solver.process("omaha-holdem 4c4h5d6d7s TcJc9h6h QhQs7h6c 7dQd5s9d AsKh4s3d 2cTh8hKd 9sAc5c6s"));
  }

  @Test
  public void test_omaha_holdem_4986_2c3c8sQsTd_Js7c5sQh_7d6h3hAd_9h4dAh9d_2h9c8cAc_7hJc8h6c_KsKh3s4h_Kc5c5dJh_3d6dTh4s() {
    assertEquals(
      "7d6h3hAd Kc5c5dJh 7hJc8h6c 9h4dAh9d Js7c5sQh KsKh3s4h 2h9c8cAc 3d6dTh4s",
      Solver.process("omaha-holdem 2c3c8sQsTd Js7c5sQh 7d6h3hAd 9h4dAh9d 2h9c8cAc 7hJc8h6c KsKh3s4h Kc5c5dJh 3d6dTh4s"));
  }

  @Test
  public void test_omaha_holdem_4987_2s3d5d6h7h_6d6s4hAc_Kh5hQs8h_7d4sKd7c_9hThAhTc() {
    assertEquals(
      "Kh5hQs8h 9hThAhTc 6d6s4hAc=7d4sKd7c",
      Solver.process("omaha-holdem 2s3d5d6h7h 6d6s4hAc Kh5hQs8h 7d4sKd7c 9hThAhTc"));
  }

  @Test
  public void test_omaha_holdem_4988_3h5d9hJcTc_4hAs7d6d_8dAc8s3s_JdJsQc7s_Qh5s2c6s() {
    assertEquals(
      "4hAs7d6d Qh5s2c6s 8dAc8s3s JdJsQc7s",
      Solver.process("omaha-holdem 3h5d9hJcTc 4hAs7d6d 8dAc8s3s JdJsQc7s Qh5s2c6s"));
  }

  @Test
  public void test_omaha_holdem_4989_4c5c5dJsKc_9dTcQs8s_JhKh6d3d_7d2c3c6h_4s4h7sTd_4d2d7h8d_3s7cAc9s_5sJcQhKd_6s9hQdTh() {
    assertEquals(
      "6s9hQdTh=9dTcQs8s 4d2d7h8d JhKh6d3d 7d2c3c6h 3s7cAc9s 4s4h7sTd 5sJcQhKd",
      Solver.process("omaha-holdem 4c5c5dJsKc 9dTcQs8s JhKh6d3d 7d2c3c6h 4s4h7sTd 4d2d7h8d 3s7cAc9s 5sJcQhKd 6s9hQdTh"));
  }

  @Test
  public void test_omaha_holdem_4990_2h4s8cKhQs_JcQd5s7d_4d9s8h3d_TcQcKsTs_JsAhQh5h_2c3cAc7s_9c8dKd2d() {
    assertEquals(
      "2c3cAc7s JcQd5s7d JsAhQh5h 4d9s8h3d 9c8dKd2d TcQcKsTs",
      Solver.process("omaha-holdem 2h4s8cKhQs JcQd5s7d 4d9s8h3d TcQcKsTs JsAhQh5h 2c3cAc7s 9c8dKd2d"));
  }

  @Test
  public void test_omaha_holdem_4991_2c4h5s9cAc_4s6sKsAh_5cQh8c8d_Kh9sQc7c_3cTs7dTd_Jc2sAs5h_4d2d5d7s() {
    assertEquals(
      "3cTs7dTd 4d2d5d7s 4s6sKsAh Jc2sAs5h 5cQh8c8d Kh9sQc7c",
      Solver.process("omaha-holdem 2c4h5s9cAc 4s6sKsAh 5cQh8c8d Kh9sQc7c 3cTs7dTd Jc2sAs5h 4d2d5d7s"));
  }

  @Test
  public void test_omaha_holdem_4992_5c5d5h8c9h_7c8s9c2d_KhTsQh9s_Js3dKdAd_3sTd3cTh_QdAh5s8h_9dJc4hQs() {
    assertEquals(
      "7c8s9c2d 9dJc4hQs KhTsQh9s Js3dKdAd 3sTd3cTh QdAh5s8h",
      Solver.process("omaha-holdem 5c5d5h8c9h 7c8s9c2d KhTsQh9s Js3dKdAd 3sTd3cTh QdAh5s8h 9dJc4hQs"));
  }

  @Test
  public void test_omaha_holdem_4993_2c6c7c8cJs_3s2h8s2d_Ac7h4h7d_Qd5cQsKh_JcKc5sKs_Jh6h6dQc_6s8h7sTd_QhAh5hJd_9c3dAs3h_8dKd4c4s() {
    assertEquals(
      "9c3dAs3h 8dKd4c4s QhAh5hJd Qd5cQsKh 6s8h7sTd 3s2h8s2d Jh6h6dQc Ac7h4h7d JcKc5sKs",
      Solver.process("omaha-holdem 2c6c7c8cJs 3s2h8s2d Ac7h4h7d Qd5cQsKh JcKc5sKs Jh6h6dQc 6s8h7sTd QhAh5hJd 9c3dAs3h 8dKd4c4s"));
  }

  @Test
  public void test_omaha_holdem_4994_3c3d3s8d8s_7s7dJc4s_Ad9s9dKh_Qh4dQcJd_Qs2h9cAc_2d4hTd6d_8c3h6h7c_5c9h5hJh_KdTc4c8h() {
    assertEquals(
      "2d4hTd6d Qs2h9cAc KdTc4c8h 5c9h5hJh 7s7dJc4s Ad9s9dKh Qh4dQcJd 8c3h6h7c",
      Solver.process("omaha-holdem 3c3d3s8d8s 7s7dJc4s Ad9s9dKh Qh4dQcJd Qs2h9cAc 2d4hTd6d 8c3h6h7c 5c9h5hJh KdTc4c8h"));
  }

  @Test
  public void test_omaha_holdem_4995_8h8sAsTcTs_Qc2h3c2d_QsKh7s7c_2s4s8c9c_6cAdJc6d_5hQhJd6h_9hQd4c3d_Jh3h7hAc() {
    assertEquals(
      "9hQd4c3d 5hQhJd6h Qc2h3c2d 6cAdJc6d=Jh3h7hAc 2s4s8c9c QsKh7s7c",
      Solver.process("omaha-holdem 8h8sAsTcTs Qc2h3c2d QsKh7s7c 2s4s8c9c 6cAdJc6d 5hQhJd6h 9hQd4c3d Jh3h7hAc"));
  }

  @Test
  public void test_omaha_holdem_4996_6h7h7sKsQd_7cKh2s6c_Jc9dJh2h_TsAs4hKc_Js6s7dTc_4d5c2d3h_3c3s9c2c() {
    assertEquals(
      "4d5c2d3h 3c3s9c2c Jc9dJh2h TsAs4hKc Js6s7dTc 7cKh2s6c",
      Solver.process("omaha-holdem 6h7h7sKsQd 7cKh2s6c Jc9dJh2h TsAs4hKc Js6s7dTc 4d5c2d3h 3c3s9c2c"));
  }

  @Test
  public void test_omaha_holdem_4997_2s3h3sJsTc_6sJd7s7h_KdTdAd4c_7cQh6dTs_2c8c5dQc() {
    assertEquals(
      "2c8c5dQc 7cQh6dTs KdTdAd4c 6sJd7s7h",
      Solver.process("omaha-holdem 2s3h3sJsTc 6sJd7s7h KdTdAd4c 7cQh6dTs 2c8c5dQc"));
  }

  @Test
  public void test_omaha_holdem_4998_4d7sKsTdTh_2h9c4c7c_AsJsQdAc_9h2dQhKc_6h8hQcKd_6sKh8d3c_4h8c3hQs() {
    assertEquals(
      "4h8c3hQs 2h9c4c7c 6sKh8d3c 6h8hQcKd=9h2dQhKc AsJsQdAc",
      Solver.process("omaha-holdem 4d7sKsTdTh 2h9c4c7c AsJsQdAc 9h2dQhKc 6h8hQcKd 6sKh8d3c 4h8c3hQs"));
  }

  @Test
  public void test_omaha_holdem_4999_9sJdJsKdQs_8h5sQd7s_TcJc7cKc_Th2dQhAc_5d4dQc4h() {
    assertEquals(
      "5d4dQc4h Th2dQhAc 8h5sQd7s TcJc7cKc",
      Solver.process("omaha-holdem 9sJdJsKdQs 8h5sQd7s TcJc7cKc Th2dQhAc 5d4dQc4h"));
  }

}
