
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OmahaHoldemSolver13HiddenTest {


  @Test
  public void test_omaha_holdem_3250_8s9sJcJsTh_Kh7dQc5d_5s9h4hTd_4sKd6d8h_6s9dQdQh_7hQsAdAs_JhAhTs3d() {
    assertEquals(
      "4sKd6d8h 5s9h4hTd 6s9dQdQh Kh7dQc5d 7hQsAdAs JhAhTs3d",
      Solver.process("omaha-holdem 8s9sJcJsTh Kh7dQc5d 5s9h4hTd 4sKd6d8h 6s9dQdQh 7hQsAdAs JhAhTs3d"));
  }

  @Test
  public void test_omaha_holdem_3251_3s8s9h9sTh_3c3h4s2h_Jc5dQsJs_7hQhKd5c_Ac4cKhAh_3d9d6hKs() {
    assertEquals(
      "7hQhKd5c Ac4cKhAh Jc5dQsJs 3c3h4s2h 3d9d6hKs",
      Solver.process("omaha-holdem 3s8s9h9sTh 3c3h4s2h Jc5dQsJs 7hQhKd5c Ac4cKhAh 3d9d6hKs"));
  }

  @Test
  public void test_omaha_holdem_3252_4c5s6sJdTd_9c7dKsKd_8hQc3c9h_7s8dAcQh_Qs3h5c5d_6cAdKcAs() {
    assertEquals(
      "8hQc3c9h 9c7dKsKd 6cAdKcAs Qs3h5c5d 7s8dAcQh",
      Solver.process("omaha-holdem 4c5s6sJdTd 9c7dKsKd 8hQc3c9h 7s8dAcQh Qs3h5c5d 6cAdKcAs"));
  }

  @Test
  public void test_omaha_holdem_3253_5sAsQcQhQs_Ad8hJcJs_5c6d4sTs_Ks5hTc8s_6hQdAc8c() {
    assertEquals(
      "5c6d4sTs Ks5hTc8s Ad8hJcJs 6hQdAc8c",
      Solver.process("omaha-holdem 5sAsQcQhQs Ad8hJcJs 5c6d4sTs Ks5hTc8s 6hQdAc8c"));
  }

  @Test
  public void test_omaha_holdem_3254_2c9d9sTdTs_8d6cAs8c_9cAh6dAd_4hJc8s5h_4c3s5s9h_KdQsJd3d_KhAcTh3h() {
    assertEquals(
      "4hJc8s5h KdQsJd3d 8d6cAs8c 4c3s5s9h 9cAh6dAd KhAcTh3h",
      Solver.process("omaha-holdem 2c9d9sTdTs 8d6cAs8c 9cAh6dAd 4hJc8s5h 4c3s5s9h KdQsJd3d KhAcTh3h"));
  }

  @Test
  public void test_omaha_holdem_3255_7sAdAsJsQc_9hAc8s6d_Qd2hJd3h_3c2d4h5h_2cKdTh4d_Kc3s8h7h_Ah5sQs4c_Jh5c9d4s_TdJc6h8c() {
    assertEquals(
      "3c2d4h5h Kc3s8h7h Jh5c9d4s TdJc6h8c Qd2hJd3h 9hAc8s6d 2cKdTh4d Ah5sQs4c",
      Solver.process("omaha-holdem 7sAdAsJsQc 9hAc8s6d Qd2hJd3h 3c2d4h5h 2cKdTh4d Kc3s8h7h Ah5sQs4c Jh5c9d4s TdJc6h8c"));
  }

  @Test
  public void test_omaha_holdem_3256_9hJcKsQcTd_6d6s3cJs_8s7d4d4s_8c2sAdKd_3s8d2c6c_5dQhQs3h() {
    assertEquals(
      "3s8d2c6c 6d6s3cJs 5dQhQs3h 8s7d4d4s 8c2sAdKd",
      Solver.process("omaha-holdem 9hJcKsQcTd 6d6s3cJs 8s7d4d4s 8c2sAdKd 3s8d2c6c 5dQhQs3h"));
  }

  @Test
  public void test_omaha_holdem_3257_7c8s9cJsKh_Ah2h6sKs_AdTc4c5c() {
    assertEquals(
      "AdTc4c5c Ah2h6sKs",
      Solver.process("omaha-holdem 7c8s9cJsKh Ah2h6sKs AdTc4c5c"));
  }

  @Test
  public void test_omaha_holdem_3258_4d9d9hAdAs_Th8h8sQh_Js3s2h7s_TcKhKs5s_6s9c3c4s_2cQs6c6d_5cAcKdTd_Jd3hTs8d() {
    assertEquals(
      "Js3s2h7s 2cQs6c6d Th8h8sQh TcKhKs5s Jd3hTs8d 5cAcKdTd 6s9c3c4s",
      Solver.process("omaha-holdem 4d9d9hAdAs Th8h8sQh Js3s2h7s TcKhKs5s 6s9c3c4s 2cQs6c6d 5cAcKdTd Jd3hTs8d"));
  }

  @Test
  public void test_omaha_holdem_3259_3h6d8dJdTc_6hJsJh7c_8sKs8hTs_3c7s7d2d_Kh2sKd9c() {
    assertEquals(
      "Kh2sKd9c 8sKs8hTs 6hJsJh7c 3c7s7d2d",
      Solver.process("omaha-holdem 3h6d8dJdTc 6hJsJh7c 8sKs8hTs 3c7s7d2d Kh2sKd9c"));
  }

  @Test
  public void test_omaha_holdem_3260_5d7sJcKdQc_3dKc8c6d_Ts3s4h5c_5s7c2cQd_AsJd2d4d_Tc4s6h5h_8dQh9hJs_Ac7hAhKs() {
    assertEquals(
      "Tc4s6h5h=Ts3s4h5c AsJd2d4d 3dKc8c6d 5s7c2cQd 8dQh9hJs Ac7hAhKs",
      Solver.process("omaha-holdem 5d7sJcKdQc 3dKc8c6d Ts3s4h5c 5s7c2cQd AsJd2d4d Tc4s6h5h 8dQh9hJs Ac7hAhKs"));
  }

  @Test
  public void test_omaha_holdem_3261_3d3h4dJsQc_KcKh4h8d_TdAdThQh_7s9s9c2c_Jd6sQsTc_5cQd6c6h_KsAh3cKd_7h8cAs5s() {
    assertEquals(
      "7h8cAs5s 7s9s9c2c 5cQd6c6h TdAdThQh Jd6sQsTc KcKh4h8d KsAh3cKd",
      Solver.process("omaha-holdem 3d3h4dJsQc KcKh4h8d TdAdThQh 7s9s9c2c Jd6sQsTc 5cQd6c6h KsAh3cKd 7h8cAs5s"));
  }

  @Test
  public void test_omaha_holdem_3262_4s5s8d9dTc_2hJd6d3s_Ah7s3hTd() {
    assertEquals(
      "2hJd6d3s Ah7s3hTd",
      Solver.process("omaha-holdem 4s5s8d9dTc 2hJd6d3s Ah7s3hTd"));
  }

  @Test
  public void test_omaha_holdem_3263_3d6s7sQdTh_4s3hAc3c_3sAdJsAh_2h4d8s7h_Qh7c2s2d_5d9h8dQc_5hJh9c5c() {
    assertEquals(
      "5hJh9c5c 2h4d8s7h 3sAdJsAh Qh7c2s2d 4s3hAc3c 5d9h8dQc",
      Solver.process("omaha-holdem 3d6s7sQdTh 4s3hAc3c 3sAdJsAh 2h4d8s7h Qh7c2s2d 5d9h8dQc 5hJh9c5c"));
  }

  @Test
  public void test_omaha_holdem_3264_9cJcJdKsQs_Td7hAsAc_Kh7dQc6h() {
    assertEquals(
      "Kh7dQc6h Td7hAsAc",
      Solver.process("omaha-holdem 9cJcJdKsQs Td7hAsAc Kh7dQc6h"));
  }

  @Test
  public void test_omaha_holdem_3265_5cJsKcTcTh_5s8c5d4h_2h6cQdKh_TdJhAh8d_KsAc7h3c_9sQs9c3d_2dQc7sJc_9dAs4cKd_7d3h6dTs() {
    assertEquals(
      "2h6cQdKh 9dAs4cKd 7d3h6dTs 9sQs9c3d 2dQc7sJc KsAc7h3c 5s8c5d4h TdJhAh8d",
      Solver.process("omaha-holdem 5cJsKcTcTh 5s8c5d4h 2h6cQdKh TdJhAh8d KsAc7h3c 9sQs9c3d 2dQc7sJc 9dAs4cKd 7d3h6dTs"));
  }

  @Test
  public void test_omaha_holdem_3266_3s9hKhKsTs_2cJd8d3c_KcAh5h9c_4sThJs5c_7sQh8sQd_Td6h3d4h() {
    assertEquals(
      "2cJd8d3c Td6h3d4h 7sQh8sQd 4sThJs5c KcAh5h9c",
      Solver.process("omaha-holdem 3s9hKhKsTs 2cJd8d3c KcAh5h9c 4sThJs5c 7sQh8sQd Td6h3d4h"));
  }

  @Test
  public void test_omaha_holdem_3267_2s4c6s7hTd_7sAd6hTs_Kh9dAc5s_Ks7dKc8d_3sQd9hAh() {
    assertEquals(
      "3sQd9hAh Kh9dAc5s Ks7dKc8d 7sAd6hTs",
      Solver.process("omaha-holdem 2s4c6s7hTd 7sAd6hTs Kh9dAc5s Ks7dKc8d 3sQd9hAh"));
  }

  @Test
  public void test_omaha_holdem_3268_3c6s8hJsKc_2c7sTdAc_Qh7h8dJd_9c7c2d5s_9hKd3h5d_3dKs6hAs() {
    assertEquals(
      "9c7c2d5s 2c7sTdAc Qh7h8dJd 9hKd3h5d 3dKs6hAs",
      Solver.process("omaha-holdem 3c6s8hJsKc 2c7sTdAc Qh7h8dJd 9c7c2d5s 9hKd3h5d 3dKs6hAs"));
  }

  @Test
  public void test_omaha_holdem_3269_2c4h9hJdTc_AdKdKhKc_9d8d8c4c_5d4d6s8s_3hQh9cTs_Qc7d9s3s_Ah8h5hQd_6dQs2dKs() {
    assertEquals(
      "5d4d6s8s Qc7d9s3s AdKdKhKc 9d8d8c4c 3hQh9cTs Ah8h5hQd 6dQs2dKs",
      Solver.process("omaha-holdem 2c4h9hJdTc AdKdKhKc 9d8d8c4c 5d4d6s8s 3hQh9cTs Qc7d9s3s Ah8h5hQd 6dQs2dKs"));
  }

  @Test
  public void test_omaha_holdem_3270_2c8dAdJsTs_Qd9h5d2s_Qh7c2d4h_Kd4cTh2h_3hAsJh7h() {
    assertEquals(
      "Qh7c2d4h Kd4cTh2h 3hAsJh7h Qd9h5d2s",
      Solver.process("omaha-holdem 2c8dAdJsTs Qd9h5d2s Qh7c2d4h Kd4cTh2h 3hAsJh7h"));
  }

  @Test
  public void test_omaha_holdem_3271_3d7d8cJhKc_8d3c7c4c_5s5cTs9d_Qc3h5h2c_Td4d6d7s_9h2d6sAs() {
    assertEquals(
      "9h2d6sAs Qc3h5h2c Td4d6d7s 8d3c7c4c 5s5cTs9d",
      Solver.process("omaha-holdem 3d7d8cJhKc 8d3c7c4c 5s5cTs9d Qc3h5h2c Td4d6d7s 9h2d6sAs"));
  }

  @Test
  public void test_omaha_holdem_3272_3c7d8d9dKs_5d3dJc6s_AdQdAh5c_QcQh4h6d_2sTs4d8c_JsKd9h2c_4cTc5sQs_5hJh2d9c() {
    assertEquals(
      "4cTc5sQs 2sTs4d8c 5hJh2d9c QcQh4h6d JsKd9h2c 5d3dJc6s AdQdAh5c",
      Solver.process("omaha-holdem 3c7d8d9dKs 5d3dJc6s AdQdAh5c QcQh4h6d 2sTs4d8c JsKd9h2c 4cTc5sQs 5hJh2d9c"));
  }

  @Test
  public void test_omaha_holdem_3273_2s7dJdQdQh_9cKd3s7s_5hQcJhJc_Js8cTs6d_Tc2hAc7c_Td3c4d8s() {
    assertEquals(
      "9cKd3s7s Tc2hAc7c Js8cTs6d Td3c4d8s 5hQcJhJc",
      Solver.process("omaha-holdem 2s7dJdQdQh 9cKd3s7s 5hQcJhJc Js8cTs6d Tc2hAc7c Td3c4d8s"));
  }

  @Test
  public void test_omaha_holdem_3274_2h8hAhJdTc_7dKh3sJh_8s5cTh2s_5h4cTsKc_QcTd9h9s_8d9cAdQs_3d4s9dAc() {
    assertEquals(
      "5h4cTsKc 3d4s9dAc 8s5cTh2s 8d9cAdQs=QcTd9h9s 7dKh3sJh",
      Solver.process("omaha-holdem 2h8hAhJdTc 7dKh3sJh 8s5cTh2s 5h4cTsKc QcTd9h9s 8d9cAdQs 3d4s9dAc"));
  }

  @Test
  public void test_omaha_holdem_3275_3h5s8d9dKc_Qd5h2cJh_Qh7cAs4c_Ks7s6dTs_5cAdTdKd_6c3c8cQc_8s4sAc6s_2hQs2s4h_Jc3d9s7h_Kh9cJs9h() {
    assertEquals(
      "Qh7cAs4c 2hQs2s4h Qd5h2cJh 8s4sAc6s 6c3c8cQc Jc3d9s7h 5cAdTdKd Kh9cJs9h Ks7s6dTs",
      Solver.process("omaha-holdem 3h5s8d9dKc Qd5h2cJh Qh7cAs4c Ks7s6dTs 5cAdTdKd 6c3c8cQc 8s4sAc6s 2hQs2s4h Jc3d9s7h Kh9cJs9h"));
  }

  @Test
  public void test_omaha_holdem_3276_3c3h9dJcKs_Ac9h3s4h_ThQdTs7s() {
    assertEquals(
      "ThQdTs7s Ac9h3s4h",
      Solver.process("omaha-holdem 3c3h9dJcKs Ac9h3s4h ThQdTs7s"));
  }

  @Test
  public void test_omaha_holdem_3277_2c4h6d7hTh_TcJd5d6h_JcKc8hAc_4sJs9sKs_3dTs9hTd_7s6c9c8d_7c5s9d8s_5hQsAs3h_6s8cAdQh() {
    assertEquals(
      "JcKc8hAc 4sJs9sKs 6s8cAdQh TcJd5d6h 3dTs9hTd 7c5s9d8s=7s6c9c8d 5hQsAs3h",
      Solver.process("omaha-holdem 2c4h6d7hTh TcJd5d6h JcKc8hAc 4sJs9sKs 3dTs9hTd 7s6c9c8d 7c5s9d8s 5hQsAs3h 6s8cAdQh"));
  }

  @Test
  public void test_omaha_holdem_3278_3d5s6c8hJh_5dQs5c8d_9h9cQcTd_8s4cJdAd_3hKc2s9s_4sJsKh7c_6s2d4hTh_8cQh7d7s_9dTsAsAh_QdKd6d2c() {
    assertEquals(
      "3hKc2s9s QdKd6d2c 8cQh7d7s 9h9cQcTd 9dTsAsAh 8s4cJdAd 5dQs5c8d 6s2d4hTh 4sJsKh7c",
      Solver.process("omaha-holdem 3d5s6c8hJh 5dQs5c8d 9h9cQcTd 8s4cJdAd 3hKc2s9s 4sJsKh7c 6s2d4hTh 8cQh7d7s 9dTsAsAh QdKd6d2c"));
  }

  @Test
  public void test_omaha_holdem_3279_5c5d7sKsQc_8c3s9s4h_Qs6s7dKh_6hKc8h3d_6dAs2s9c_Jh2hQh2c_KdAh8d4s_Jc3cTsTh_7cTd2d6c_Tc3h9h5s() {
    assertEquals(
      "8c3s9s4h 6dAs2s9c 7cTd2d6c Jc3cTsTh Jh2hQh2c 6hKc8h3d KdAh8d4s Qs6s7dKh Tc3h9h5s",
      Solver.process("omaha-holdem 5c5d7sKsQc 8c3s9s4h Qs6s7dKh 6hKc8h3d 6dAs2s9c Jh2hQh2c KdAh8d4s Jc3cTsTh 7cTd2d6c Tc3h9h5s"));
  }

  @Test
  public void test_omaha_holdem_3280_2h3dAdAsKh_Kd2sTs3h_2d5c7s8s_6d3c7d4s_Qc6cTdQd_9sJdJh8c_5h9d2cQh_Ac7c6s8h() {
    assertEquals(
      "2d5c7s8s 5h9d2cQh 6d3c7d4s 9sJdJh8c Qc6cTdQd Kd2sTs3h Ac7c6s8h",
      Solver.process("omaha-holdem 2h3dAdAsKh Kd2sTs3h 2d5c7s8s 6d3c7d4s Qc6cTdQd 9sJdJh8c 5h9d2cQh Ac7c6s8h"));
  }

  @Test
  public void test_omaha_holdem_3281_2c6d6s7h8s_7s3cAsQd_4c4s9h7d_5h2hKd9c_Th5d5cAc_Qs9d3s4h_QcTd8dJs_2s8hJd6c() {
    assertEquals(
      "Qs9d3s4h Th5d5cAc 4c4s9h7d 7s3cAsQd QcTd8dJs 5h2hKd9c 2s8hJd6c",
      Solver.process("omaha-holdem 2c6d6s7h8s 7s3cAsQd 4c4s9h7d 5h2hKd9c Th5d5cAc Qs9d3s4h QcTd8dJs 2s8hJd6c"));
  }

  @Test
  public void test_omaha_holdem_3282_5c7s9hQcTd_2cAhQs5d_Kc3hKhJh() {
    assertEquals(
      "2cAhQs5d Kc3hKhJh",
      Solver.process("omaha-holdem 5c7s9hQcTd 2cAhQs5d Kc3hKhJh"));
  }

  @Test
  public void test_omaha_holdem_3283_6h9cAdJsQc_JhAcTs2c_7d5cAs3d_AhQh3sKh_Th5d2s8h() {
    assertEquals(
      "7d5cAs3d JhAcTs2c AhQh3sKh Th5d2s8h",
      Solver.process("omaha-holdem 6h9cAdJsQc JhAcTs2c 7d5cAs3d AhQh3sKh Th5d2s8h"));
  }

  @Test
  public void test_omaha_holdem_3284_2c5d7cJsQd_2dQh3sKd_8d5cKs7s() {
    assertEquals(
      "8d5cKs7s 2dQh3sKd",
      Solver.process("omaha-holdem 2c5d7cJsQd 2dQh3sKd 8d5cKs7s"));
  }

  @Test
  public void test_omaha_holdem_3285_3h5dQcQdTd_3d2d9d6h_Kc8d7s4d_8hJdKdKs() {
    assertEquals(
      "Kc8d7s4d 3d2d9d6h 8hJdKdKs",
      Solver.process("omaha-holdem 3h5dQcQdTd 3d2d9d6h Kc8d7s4d 8hJdKdKs"));
  }

  @Test
  public void test_omaha_holdem_3286_2s3d4dKcQd_4c8s7sKs_9c3sKhQh_6s6d7d4s_Qc5d9sQs_Jd8cTs8h_2hTd9h2d_Tc6h2c7h_7c3c8dTh() {
    assertEquals(
      "Tc6h2c7h 7c3c8dTh Jd8cTs8h 4c8s7sKs 9c3sKhQh Qc5d9sQs 6s6d7d4s 2hTd9h2d",
      Solver.process("omaha-holdem 2s3d4dKcQd 4c8s7sKs 9c3sKhQh 6s6d7d4s Qc5d9sQs Jd8cTs8h 2hTd9h2d Tc6h2c7h 7c3c8dTh"));
  }

  @Test
  public void test_omaha_holdem_3287_5c6d8h9sQh_AdAc8s6h_7c7sJd5h_QcTdTs5s_3sJs2c8c_Qd6s4cQs() {
    assertEquals(
      "3sJs2c8c AdAc8s6h QcTdTs5s Qd6s4cQs 7c7sJd5h",
      Solver.process("omaha-holdem 5c6d8h9sQh AdAc8s6h 7c7sJd5h QcTdTs5s 3sJs2c8c Qd6s4cQs"));
  }

  @Test
  public void test_omaha_holdem_3288_3d4c6d7sQh_9s2d3h5d_2h8d7d3s_Js8sTc9d() {
    assertEquals(
      "Js8sTc9d 2h8d7d3s 9s2d3h5d",
      Solver.process("omaha-holdem 3d4c6d7sQh 9s2d3h5d 2h8d7d3s Js8sTc9d"));
  }

  @Test
  public void test_omaha_holdem_3289_7c7s9dKdQc_Qs2h2c8c_QhAsJd6d_2d3hJcAh_2s4sKcAd_6cKh7h4d() {
    assertEquals(
      "2d3hJcAh Qs2h2c8c QhAsJd6d 2s4sKcAd 6cKh7h4d",
      Solver.process("omaha-holdem 7c7s9dKdQc Qs2h2c8c QhAsJd6d 2d3hJcAh 2s4sKcAd 6cKh7h4d"));
  }

  @Test
  public void test_omaha_holdem_3290_2h3c3s5dJd_6s4sKcKd_Qd7h9c6h_8d7c4dJs_AsTsAdQh_9s4c5h5c_6d2s8hAh_3h5sQs2d_7dAc6cKh_Th8c2c9d() {
    assertEquals(
      "Qd7h9c6h 7dAc6cKh Th8c2c9d 6d2s8hAh 8d7c4dJs AsTsAdQh 6s4sKcKd 3h5sQs2d 9s4c5h5c",
      Solver.process("omaha-holdem 2h3c3s5dJd 6s4sKcKd Qd7h9c6h 8d7c4dJs AsTsAdQh 9s4c5h5c 6d2s8hAh 3h5sQs2d 7dAc6cKh Th8c2c9d"));
  }

  @Test
  public void test_omaha_holdem_3291_2c4c9dJhKs_KhAdTcTh_Qh8s4s4d_Qd7h2s2h_6c5s2d3s() {
    assertEquals(
      "6c5s2d3s KhAdTcTh Qd7h2s2h Qh8s4s4d",
      Solver.process("omaha-holdem 2c4c9dJhKs KhAdTcTh Qh8s4s4d Qd7h2s2h 6c5s2d3s"));
  }

  @Test
  public void test_omaha_holdem_3292_5d7d7hAdJd_3cTcQd9d_Qs4h9c9s_TdJcJh3h() {
    assertEquals(
      "Qs4h9c9s 3cTcQd9d TdJcJh3h",
      Solver.process("omaha-holdem 5d7d7hAdJd 3cTcQd9d Qs4h9c9s TdJcJh3h"));
  }

  @Test
  public void test_omaha_holdem_3293_4h5d5h6dJd_2sAd6sKs_8c8d9c9h_QdKd9dQh_3d4s3h8s_2c8h2dJs_6c7h7d3c() {
    assertEquals(
      "3d4s3h8s 2sAd6sKs 8c8d9c9h 2c8h2dJs 6c7h7d3c QdKd9dQh",
      Solver.process("omaha-holdem 4h5d5h6dJd 2sAd6sKs 8c8d9c9h QdKd9dQh 3d4s3h8s 2c8h2dJs 6c7h7d3c"));
  }

  @Test
  public void test_omaha_holdem_3294_4d6h7h8d8s_Kd7c2h6c_TcQd5s9h_Th4c3s5c_Jc3hQs2c_5dAdQhJh_Kc7s6d2s_Td9s2d7d() {
    assertEquals(
      "Jc3hQs2c 5dAdQhJh Kc7s6d2s=Kd7c2h6c Th4c3s5c TcQd5s9h=Td9s2d7d",
      Solver.process("omaha-holdem 4d6h7h8d8s Kd7c2h6c TcQd5s9h Th4c3s5c Jc3hQs2c 5dAdQhJh Kc7s6d2s Td9s2d7d"));
  }

  @Test
  public void test_omaha_holdem_3295_2d6s8cAcQc_JcKh6h2h_3dAs9h7d_ThQh4d5s() {
    assertEquals(
      "ThQh4d5s 3dAs9h7d JcKh6h2h",
      Solver.process("omaha-holdem 2d6s8cAcQc JcKh6h2h 3dAs9h7d ThQh4d5s"));
  }

  @Test
  public void test_omaha_holdem_3296_2c4h5c7dQd_Jc4s5s7s_TcKh3d8d_3h6d3c6c_TdJd8h9h() {
    assertEquals(
      "TdJd8h9h TcKh3d8d Jc4s5s7s 3h6d3c6c",
      Solver.process("omaha-holdem 2c4h5c7dQd Jc4s5s7s TcKh3d8d 3h6d3c6c TdJd8h9h"));
  }

  @Test
  public void test_omaha_holdem_3297_6c8s9sJdTh_5cKc2s2h_6sJhKdJc_AdQd8d7c_Tc5h4h6d_Ac8h3h5d_6h3dKh4s_Qc9d2d9c() {
    assertEquals(
      "5cKc2s2h 6h3dKh4s Ac8h3h5d Tc5h4h6d 6sJhKdJc AdQd8d7c=Qc9d2d9c",
      Solver.process("omaha-holdem 6c8s9sJdTh 5cKc2s2h 6sJhKdJc AdQd8d7c Tc5h4h6d Ac8h3h5d 6h3dKh4s Qc9d2d9c"));
  }

  @Test
  public void test_omaha_holdem_3298_3h4d9hAcTc_8sKdKh7h_Th4s7d6s_9dAsQh4c_KcJc2c7c_Td5s2h3s_QdQs6d3d_4h7s9sAd_Ah5c8c2d() {
    assertEquals(
      "KcJc2c7c QdQs6d3d 8sKdKh7h Th4s7d6s 4h7s9sAd=9dAsQh4c Ah5c8c2d=Td5s2h3s",
      Solver.process("omaha-holdem 3h4d9hAcTc 8sKdKh7h Th4s7d6s 9dAsQh4c KcJc2c7c Td5s2h3s QdQs6d3d 4h7s9sAd Ah5c8c2d"));
  }

  @Test
  public void test_omaha_holdem_3299_2d5sAhTcTd_QhQc3d6d_7dKh7h3h_8cAcAs8h_4c5h4sKc_8sKd4d2h_Jh6cQd3s() {
    assertEquals(
      "Jh6cQd3s 8sKd4d2h 4c5h4sKc 7dKh7h3h QhQc3d6d 8cAcAs8h",
      Solver.process("omaha-holdem 2d5sAhTcTd QhQc3d6d 7dKh7h3h 8cAcAs8h 4c5h4sKc 8sKd4d2h Jh6cQd3s"));
  }

  @Test
  public void test_omaha_holdem_3300_2d3d4h8sKc_5cJsAs7c_Ks7h2c3h_5dAd9d8h_6d3sQs8d() {
    assertEquals(
      "6d3sQs8d Ks7h2c3h 5cJsAs7c=5dAd9d8h",
      Solver.process("omaha-holdem 2d3d4h8sKc 5cJsAs7c Ks7h2c3h 5dAd9d8h 6d3sQs8d"));
  }

  @Test
  public void test_omaha_holdem_3301_2s3d4s5cKc_6h9sQcTh_7d6cQsJc_Ts3c2d4h_Qh7cJs2c_5d8s4d5s_6s8d7sJd_8cAsAdJh_3h5hKs7h() {
    assertEquals(
      "6h9sQcTh Qh7cJs2c 8cAsAdJh Ts3c2d4h 3h5hKs7h 5d8s4d5s 6s8d7sJd=7d6cQsJc",
      Solver.process("omaha-holdem 2s3d4s5cKc 6h9sQcTh 7d6cQsJc Ts3c2d4h Qh7cJs2c 5d8s4d5s 6s8d7sJd 8cAsAdJh 3h5hKs7h"));
  }

  @Test
  public void test_omaha_holdem_3302_2s3c6sJdJh_Kc3s9d7h_5sAs4hKs_9hTcTd4c_5d2hAhJc_6d8d7sAd_6c4sQc8h_4d7d7cAc_Th9cQhKd() {
    assertEquals(
      "Th9cQhKd Kc3s9d7h 6c4sQc8h 6d8d7sAd 4d7d7cAc 9hTcTd4c 5sAs4hKs 5d2hAhJc",
      Solver.process("omaha-holdem 2s3c6sJdJh Kc3s9d7h 5sAs4hKs 9hTcTd4c 5d2hAhJc 6d8d7sAd 6c4sQc8h 4d7d7cAc Th9cQhKd"));
  }

  @Test
  public void test_omaha_holdem_3303_2d7c7sAhTs_8dKs5c2h_ThAs7d5h_Js4s8sQs() {
    assertEquals(
      "Js4s8sQs 8dKs5c2h ThAs7d5h",
      Solver.process("omaha-holdem 2d7c7sAhTs 8dKs5c2h ThAs7d5h Js4s8sQs"));
  }

  @Test
  public void test_omaha_holdem_3304_2s4cJsKcTh_JdAc9h2h_5sTs3hQc_Qd9c7c4s_7h6hTd2c_6cJc9s4h_2d8dAdQh_Kh3dJh3s() {
    assertEquals(
      "5sTs3hQc 7h6hTd2c JdAc9h2h 6cJc9s4h Kh3dJh3s Qd9c7c4s 2d8dAdQh",
      Solver.process("omaha-holdem 2s4cJsKcTh JdAc9h2h 5sTs3hQc Qd9c7c4s 7h6hTd2c 6cJc9s4h 2d8dAdQh Kh3dJh3s"));
  }

  @Test
  public void test_omaha_holdem_3305_6c6d7cQdQs_9dKcQc4c_3c8c5c8s_7s6sTsTc_9cJd7h5d_5s3dKhAh_AdJh9hJs() {
    assertEquals(
      "5s3dKhAh 9cJd7h5d 3c8c5c8s AdJh9hJs 9dKcQc4c 7s6sTsTc",
      Solver.process("omaha-holdem 6c6d7cQdQs 9dKcQc4c 3c8c5c8s 7s6sTsTc 9cJd7h5d 5s3dKhAh AdJh9hJs"));
  }

  @Test
  public void test_omaha_holdem_3306_2c5d5hQcQs_8d6sQh7h_Tc6h6cKd_8c5cJcKh_3s6d2sAh_2d7cTs3h_As5s8sAc_3d9cTdJd_Ad7s2h9d_Js4h7dTh() {
    assertEquals(
      "3d9cTdJd=Js4h7dTh 2d7cTs3h 3s6d2sAh=Ad7s2h9d Tc6h6cKd 8c5cJcKh As5s8sAc 8d6sQh7h",
      Solver.process("omaha-holdem 2c5d5hQcQs 8d6sQh7h Tc6h6cKd 8c5cJcKh 3s6d2sAh 2d7cTs3h As5s8sAc 3d9cTdJd Ad7s2h9d Js4h7dTh"));
  }

  @Test
  public void test_omaha_holdem_3307_4s5h6s8sQh_2hTc7cJh_2s9c2d9d_3c6dKcAd_QdJc7hAs_3h8dKs2c_6c9s4cKh_Qs6h3sJd() {
    assertEquals(
      "2hTc7cJh 3c6dKcAd 2s9c2d9d QdJc7hAs 6c9s4cKh 3h8dKs2c Qs6h3sJd",
      Solver.process("omaha-holdem 4s5h6s8sQh 2hTc7cJh 2s9c2d9d 3c6dKcAd QdJc7hAs 3h8dKs2c 6c9s4cKh Qs6h3sJd"));
  }

  @Test
  public void test_omaha_holdem_3308_6sKcQdThTs_Jh9s8h2s_5hJs8c4c() {
    assertEquals(
      "5hJs8c4c Jh9s8h2s",
      Solver.process("omaha-holdem 6sKcQdThTs Jh9s8h2s 5hJs8c4c"));
  }

  @Test
  public void test_omaha_holdem_3309_2h3h5h5s7h_5d4hKsQd_6s8c2d7c_9cAsJsAd_Jd7dTh8d_5cTs9h8s_4cQcKh7s_4sJhQh3s() {
    assertEquals(
      "6s8c2d7c Jd7dTh8d 4cQcKh7s 9cAsJsAd 5cTs9h8s 5d4hKsQd 4sJhQh3s",
      Solver.process("omaha-holdem 2h3h5h5s7h 5d4hKsQd 6s8c2d7c 9cAsJsAd Jd7dTh8d 5cTs9h8s 4cQcKh7s 4sJhQh3s"));
  }

  @Test
  public void test_omaha_holdem_3310_7h8c9cKhTs_4h2sJdQc_3d8h3h6s_Jh2c2dJc_AdAc9s8s_9hTd5h4d_5d7d5cAs_Ks7c4sQh() {
    assertEquals(
      "5d7d5cAs Jh2c2dJc AdAc9s8s 9hTd5h4d Ks7c4sQh 3d8h3h6s 4h2sJdQc",
      Solver.process("omaha-holdem 7h8c9cKhTs 4h2sJdQc 3d8h3h6s Jh2c2dJc AdAc9s8s 9hTd5h4d 5d7d5cAs Ks7c4sQh"));
  }

  @Test
  public void test_omaha_holdem_3311_5d8h9hJsQc_4s2c9s2h_8s7h4cKc_8dAhQhJc_6c3s2s5c_6d7d2d3d_6h4dKhQs_As5sTc5h_9cQdTdKd() {
    assertEquals(
      "6c3s2s5c 8s7h4cKc 4s2c9s2h 6h4dKhQs 8dAhQhJc As5sTc5h 6d7d2d3d 9cQdTdKd",
      Solver.process("omaha-holdem 5d8h9hJsQc 4s2c9s2h 8s7h4cKc 8dAhQhJc 6c3s2s5c 6d7d2d3d 6h4dKhQs As5sTc5h 9cQdTdKd"));
  }

  @Test
  public void test_omaha_holdem_3312_2c3c8cAcQd_KdTh7c5c_Tc8h7hJs_Ah3d2s4s_Kh2hQs7s_2d4d6dJc_9c5dKcQc_4h3h5h9s() {
    assertEquals(
      "2d4d6dJc Tc8h7hJs Kh2hQs7s Ah3d2s4s 4h3h5h9s KdTh7c5c 9c5dKcQc",
      Solver.process("omaha-holdem 2c3c8cAcQd KdTh7c5c Tc8h7hJs Ah3d2s4s Kh2hQs7s 2d4d6dJc 9c5dKcQc 4h3h5h9s"));
  }

  @Test
  public void test_omaha_holdem_3313_4d8hKhThTs_TcJd7c5h_8c2h3sQh_5d3d7h7d() {
    assertEquals(
      "5d3d7h7d TcJd7c5h 8c2h3sQh",
      Solver.process("omaha-holdem 4d8hKhThTs TcJd7c5h 8c2h3sQh 5d3d7h7d"));
  }

  @Test
  public void test_omaha_holdem_3314_2h9dJdKdQd_KcQc5cAc_7sQh7d4d_2cJc5dTs_TcJhQs3s_8cKh9h4h_2s2d5s8h_9c8dAdJs() {
    assertEquals(
      "8cKh9h4h KcQc5cAc 2s2d5s8h 2cJc5dTs=TcJhQs3s 7sQh7d4d 9c8dAdJs",
      Solver.process("omaha-holdem 2h9dJdKdQd KcQc5cAc 7sQh7d4d 2cJc5dTs TcJhQs3s 8cKh9h4h 2s2d5s8h 9c8dAdJs"));
  }

  @Test
  public void test_omaha_holdem_3315_3c5c8s9hQc_8dJcKh9d_Ac7hTh3s_9s7d3h2s_Ad5sKd6s() {
    assertEquals(
      "Ac7hTh3s Ad5sKd6s 9s7d3h2s 8dJcKh9d",
      Solver.process("omaha-holdem 3c5c8s9hQc 8dJcKh9d Ac7hTh3s 9s7d3h2s Ad5sKd6s"));
  }

  @Test
  public void test_omaha_holdem_3316_4c4d6d8dQh_Jd2dTsAh_9s5c8c7h_8h3sJs7c_ThKd6c2h_TcAsAc5h_QcQs2sKh() {
    assertEquals(
      "ThKd6c2h 8h3sJs7c TcAsAc5h 9s5c8c7h Jd2dTsAh QcQs2sKh",
      Solver.process("omaha-holdem 4c4d6d8dQh Jd2dTsAh 9s5c8c7h 8h3sJs7c ThKd6c2h TcAsAc5h QcQs2sKh"));
  }

  @Test
  public void test_omaha_holdem_3317_2d4d8d9hTh_Kh4h9sJh_7cAsKcTc_AcQc7dQd_6d2hAdQs_3d5h6c3s_9cQh2c7s_6h2sKd9d_4cAhJsJc() {
    assertEquals(
      "3d5h6c3s 7cAsKcTc 4cAhJsJc 9cQh2c7s Kh4h9sJh AcQc7dQd 6h2sKd9d 6d2hAdQs",
      Solver.process("omaha-holdem 2d4d8d9hTh Kh4h9sJh 7cAsKcTc AcQc7dQd 6d2hAdQs 3d5h6c3s 9cQh2c7s 6h2sKd9d 4cAhJsJc"));
  }

  @Test
  public void test_omaha_holdem_3318_3s8c8hJdKh_8sAc2sJc_2cAh7h4s() {
    assertEquals(
      "2cAh7h4s 8sAc2sJc",
      Solver.process("omaha-holdem 3s8c8hJdKh 8sAc2sJc 2cAh7h4s"));
  }

  @Test
  public void test_omaha_holdem_3319_2h7h8s9dQc_3c4d6cAh_Tc6d3hJh_8hKhAcKs() {
    assertEquals(
      "3c4d6cAh 8hKhAcKs Tc6d3hJh",
      Solver.process("omaha-holdem 2h7h8s9dQc 3c4d6cAh Tc6d3hJh 8hKhAcKs"));
  }

  @Test
  public void test_omaha_holdem_3320_2s5c6hKdQh_7c2dQd6s_2c4dTcJc_Ac6c5sKh() {
    assertEquals(
      "2c4dTcJc 7c2dQd6s Ac6c5sKh",
      Solver.process("omaha-holdem 2s5c6hKdQh 7c2dQd6s 2c4dTcJc Ac6c5sKh"));
  }

  @Test
  public void test_omaha_holdem_3321_2h5d7c9sAh_JhQh7h9h_QsTs4s2d_KhJsKcQd_Ks9dQc8c_AsTh6c3h_Kd7d8dAc_3s4hJd9c_5h5c4c2s_Td6sJc6h() {
    assertEquals(
      "QsTs4s2d Td6sJc6h Ks9dQc8c KhJsKcQd AsTh6c3h JhQh7h9h Kd7d8dAc 5h5c4c2s 3s4hJd9c",
      Solver.process("omaha-holdem 2h5d7c9sAh JhQh7h9h QsTs4s2d KhJsKcQd Ks9dQc8c AsTh6c3h Kd7d8dAc 3s4hJd9c 5h5c4c2s Td6sJc6h"));
  }

  @Test
  public void test_omaha_holdem_3322_3c4c6sAsQs_2s8hJhTh_3dQh8s2d_4h9c2h4d_8cKc6dKs_5dTd8d3h_4sAd7s6h_9dJd5c2c() {
    assertEquals(
      "2s8hJhTh 5dTd8d3h 8cKc6dKs 3dQh8s2d 4h9c2h4d 9dJd5c2c 4sAd7s6h",
      Solver.process("omaha-holdem 3c4c6sAsQs 2s8hJhTh 3dQh8s2d 4h9c2h4d 8cKc6dKs 5dTd8d3h 4sAd7s6h 9dJd5c2c"));
  }

  @Test
  public void test_omaha_holdem_3323_2h3s6d7s8c_6hJsTs4c_9cTcQsKh() {
    assertEquals(
      "6hJsTs4c 9cTcQsKh",
      Solver.process("omaha-holdem 2h3s6d7s8c 6hJsTs4c 9cTcQsKh"));
  }

  @Test
  public void test_omaha_holdem_3324_5d8d8hAcKh_JdKd6s8s_3d9hTs4s_9d4d9cJc() {
    assertEquals(
      "3d9hTs4s 9d4d9cJc JdKd6s8s",
      Solver.process("omaha-holdem 5d8d8hAcKh JdKd6s8s 3d9hTs4s 9d4d9cJc"));
  }

  @Test
  public void test_omaha_holdem_3325_2c2h3d4sTc_6d4cAh8h_Th9h2s2d_6hTs8sJh_As7cJc3s_8cTd3cQd_9c9dQc5d_9sJdKc4h_5cJs5h7h_KsQh6sQs() {
    assertEquals(
      "As7cJc3s 9sJdKc4h 6d4cAh8h 5cJs5h7h 9c9dQc5d 6hTs8sJh 8cTd3cQd KsQh6sQs Th9h2s2d",
      Solver.process("omaha-holdem 2c2h3d4sTc 6d4cAh8h Th9h2s2d 6hTs8sJh As7cJc3s 8cTd3cQd 9c9dQc5d 9sJdKc4h 5cJs5h7h KsQh6sQs"));
  }

  @Test
  public void test_omaha_holdem_3326_2c3s9cJcTc_8c5sKd3c_9hQh6cQc_Ac5d8d6s_8hJs3d7s_5hQsAs7h_9d4sTdJd_Kc4c8s6d_9s6h2sQd_7cJh2d5c() {
    assertEquals(
      "Ac5d8d6s 5hQsAs7h 9s6h2sQd 9d4sTdJd 8hJs3d7s 7cJh2d5c 8c5sKd3c 9hQh6cQc Kc4c8s6d",
      Solver.process("omaha-holdem 2c3s9cJcTc 8c5sKd3c 9hQh6cQc Ac5d8d6s 8hJs3d7s 5hQsAs7h 9d4sTdJd Kc4c8s6d 9s6h2sQd 7cJh2d5c"));
  }

  @Test
  public void test_omaha_holdem_3327_3s5c5d6sQc_4hJh3h8s_5sKc8c2h_QdAh7cTs_Ad8h9c4s_Qs2sJd9s() {
    assertEquals(
      "Ad8h9c4s 4hJh3h8s Qs2sJd9s QdAh7cTs 5sKc8c2h",
      Solver.process("omaha-holdem 3s5c5d6sQc 4hJh3h8s 5sKc8c2h QdAh7cTs Ad8h9c4s Qs2sJd9s"));
  }

  @Test
  public void test_omaha_holdem_3328_2d5c6hKsTd_3dThQc2h_KhAcAs6s_4dKd8c5d() {
    assertEquals(
      "3dThQc2h 4dKd8c5d KhAcAs6s",
      Solver.process("omaha-holdem 2d5c6hKsTd 3dThQc2h KhAcAs6s 4dKd8c5d"));
  }

  @Test
  public void test_omaha_holdem_3329_2c3c3hJcKs_2sKd6c4s_AhQcAdQh_Qd7sAc7h_2hAs6sJd_4dTdKhTh() {
    assertEquals(
      "Qd7sAc7h 2hAs6sJd 2sKd6c4s 4dTdKhTh AhQcAdQh",
      Solver.process("omaha-holdem 2c3c3hJcKs 2sKd6c4s AhQcAdQh Qd7sAc7h 2hAs6sJd 4dTdKhTh"));
  }

  @Test
  public void test_omaha_holdem_3330_2s4s7dAdJd_5sQcTs7s_Kh6d5c5d_4hQs9s3s_TdTc2d2c() {
    assertEquals(
      "4hQs9s3s 5sQcTs7s Kh6d5c5d TdTc2d2c",
      Solver.process("omaha-holdem 2s4s7dAdJd 5sQcTs7s Kh6d5c5d 4hQs9s3s TdTc2d2c"));
  }

  @Test
  public void test_omaha_holdem_3331_3d7hAcQhTs_Qd5cJh6c_6hJc6d2c_9cQsKc4c_4h3cQc4d_2dAh9d7s() {
    assertEquals(
      "6hJc6d2c Qd5cJh6c 9cQsKc4c 4h3cQc4d 2dAh9d7s",
      Solver.process("omaha-holdem 3d7hAcQhTs Qd5cJh6c 6hJc6d2c 9cQsKc4c 4h3cQc4d 2dAh9d7s"));
  }

  @Test
  public void test_omaha_holdem_3332_4hKdQhTcTd_As3h7hKc_7c5s4d6c_5dTs9c2d_4s3s9dQd_3d6s8s2c_AhAdKs8h_8d9sJh7d_QcTh5cQs() {
    assertEquals(
      "3d6s8s2c 7c5s4d6c 4s3s9dQd As3h7hKc AhAdKs8h 5dTs9c2d 8d9sJh7d QcTh5cQs",
      Solver.process("omaha-holdem 4hKdQhTcTd As3h7hKc 7c5s4d6c 5dTs9c2d 4s3s9dQd 3d6s8s2c AhAdKs8h 8d9sJh7d QcTh5cQs"));
  }

  @Test
  public void test_omaha_holdem_3333_2c7d8d8sAc_4h3d3s8c_6cTdAh5c_TcQd6hKh_5d2hAs7h_7c4dJdKs() {
    assertEquals(
      "TcQd6hKh 7c4dJdKs 5d2hAs7h 6cTdAh5c 4h3d3s8c",
      Solver.process("omaha-holdem 2c7d8d8sAc 4h3d3s8c 6cTdAh5c TcQd6hKh 5d2hAs7h 7c4dJdKs"));
  }

  @Test
  public void test_omaha_holdem_3334_2c6c7d9dJc_ThQsKs7s_Jh9s4d3c() {
    assertEquals(
      "ThQsKs7s Jh9s4d3c",
      Solver.process("omaha-holdem 2c6c7d9dJc ThQsKs7s Jh9s4d3c"));
  }

  @Test
  public void test_omaha_holdem_3335_4s6s7c8dAc_3s4h8s8h_TdKd4cQc_3dJhKs5c() {
    assertEquals(
      "TdKd4cQc 3s4h8s8h 3dJhKs5c",
      Solver.process("omaha-holdem 4s6s7c8dAc 3s4h8s8h TdKd4cQc 3dJhKs5c"));
  }

  @Test
  public void test_omaha_holdem_3336_3d5h9cJsKs_Qh6d4s4d_JcKhQd3s_Th6c7d2d() {
    assertEquals(
      "Th6c7d2d Qh6d4s4d JcKhQd3s",
      Solver.process("omaha-holdem 3d5h9cJsKs Qh6d4s4d JcKhQd3s Th6c7d2d"));
  }

  @Test
  public void test_omaha_holdem_3337_3c4c5h6d9h_Kh3dKc6h_2c7dAs7c_QdTc8s4h() {
    assertEquals(
      "QdTc8s4h Kh3dKc6h 2c7dAs7c",
      Solver.process("omaha-holdem 3c4c5h6d9h Kh3dKc6h 2c7dAs7c QdTc8s4h"));
  }

  @Test
  public void test_omaha_holdem_3338_2h4h6cAdQd_4s8dTdAs_JsQhTs3d_5s4c5c8s_3s4d8c6h_2d6dAcQc() {
    assertEquals(
      "5s4c5c8s JsQhTs3d 3s4d8c6h 4s8dTdAs 2d6dAcQc",
      Solver.process("omaha-holdem 2h4h6cAdQd 4s8dTdAs JsQhTs3d 5s4c5c8s 3s4d8c6h 2d6dAcQc"));
  }

  @Test
  public void test_omaha_holdem_3339_4s9cAhJhTd_QsQdAs7h_8dAd3dTc_Ac8s7s4h_2h5sJd4c_3c9hQhQc_9d5cTh2d() {
    assertEquals(
      "3c9hQhQc QsQdAs7h 9d5cTh2d 2h5sJd4c 8dAd3dTc Ac8s7s4h",
      Solver.process("omaha-holdem 4s9cAhJhTd QsQdAs7h 8dAd3dTc Ac8s7s4h 2h5sJd4c 3c9hQhQc 9d5cTh2d"));
  }

  @Test
  public void test_omaha_holdem_3340_4h7d9hAdTc_8c5h7cTd_4dJdQs8s_6dKd9cJh() {
    assertEquals(
      "6dKd9cJh 8c5h7cTd 4dJdQs8s",
      Solver.process("omaha-holdem 4h7d9hAdTc 8c5h7cTd 4dJdQs8s 6dKd9cJh"));
  }

  @Test
  public void test_omaha_holdem_3341_5dAhJdJhTh_4c4s8sTd_Ad7d2c9h_TcAc3s4d_5s5hQd4h_2s7h2h3c_8d3hQcKh() {
    assertEquals(
      "4c4s8sTd Ad7d2c9h TcAc3s4d 2s7h2h3c 8d3hQcKh 5s5hQd4h",
      Solver.process("omaha-holdem 5dAhJdJhTh 4c4s8sTd Ad7d2c9h TcAc3s4d 5s5hQd4h 2s7h2h3c 8d3hQcKh"));
  }

  @Test
  public void test_omaha_holdem_3342_4c8cKhQcQs_9s6sQhKc_9cAc8s2d_7sJsTc6h_Th6d4s4h_5c7c3hJh_7d9h2hTd_7h6c5dAd_AhQd2s8h_JdKd3dTs() {
    assertEquals(
      "7d9h2hTd 7sJsTc6h 7h6c5dAd JdKd3dTs 5c7c3hJh 9cAc8s2d Th6d4s4h AhQd2s8h 9s6sQhKc",
      Solver.process("omaha-holdem 4c8cKhQcQs 9s6sQhKc 9cAc8s2d 7sJsTc6h Th6d4s4h 5c7c3hJh 7d9h2hTd 7h6c5dAd AhQd2s8h JdKd3dTs"));
  }

  @Test
  public void test_omaha_holdem_3343_3c5hJcJsQh_TsKs3dKh_8d4d7hQc_9sKdAh4s_TcTh2dJh_8s2s2h6c_Jd4c8h7c_2c6s3hAs_7s9d4hTd_9h5dQd3s() {
    assertEquals(
      "7s9d4hTd 9sKdAh4s 8s2s2h6c 2c6s3hAs 8d4d7hQc 9h5dQd3s TsKs3dKh Jd4c8h7c TcTh2dJh",
      Solver.process("omaha-holdem 3c5hJcJsQh TsKs3dKh 8d4d7hQc 9sKdAh4s TcTh2dJh 8s2s2h6c Jd4c8h7c 2c6s3hAs 7s9d4hTd 9h5dQd3s"));
  }

  @Test
  public void test_omaha_holdem_3344_3d9sAsJdKs_3h8c6d4h_5d7dQdTs_7c2c8h3c_Jc3sQc2s_Ah4dJs9h_8dQs6s5c_4c2hQh4s_AcKcKhTd() {
    assertEquals(
      "3h8c6d4h=7c2c8h3c 4c2hQh4s Ah4dJs9h AcKcKhTd 5d7dQdTs Jc3sQc2s 8dQs6s5c",
      Solver.process("omaha-holdem 3d9sAsJdKs 3h8c6d4h 5d7dQdTs 7c2c8h3c Jc3sQc2s Ah4dJs9h 8dQs6s5c 4c2hQh4s AcKcKhTd"));
  }

  @Test
  public void test_omaha_holdem_3345_2c8cAcQhTh_Jc9cTd3h_7h6d8s7d_4dAdKc4s_5d6s3s5c_7sQdKs9h_As3d2dTc_5h9sJsKh_AhQc7c6c_8d6h3c5s() {
    assertEquals(
      "5d6s3s5c 8d6h3c5s 7h6d8s7d 7sQdKs9h 4dAdKc4s As3d2dTc 5h9sJsKh Jc9cTd3h AhQc7c6c",
      Solver.process("omaha-holdem 2c8cAcQhTh Jc9cTd3h 7h6d8s7d 4dAdKc4s 5d6s3s5c 7sQdKs9h As3d2dTc 5h9sJsKh AhQc7c6c 8d6h3c5s"));
  }

  @Test
  public void test_omaha_holdem_3346_2d3s5cKdTd_Js3d9dAc_Ad3h5s9s_Kh3cQcKc_Qs7h7d6d_4hJh6s8h_JcThAs2h_Ah8dQd9c_2c7s4sJd() {
    assertEquals(
      "2c7s4sJd Ad3h5s9s JcThAs2h Kh3cQcKc 4hJh6s8h Qs7h7d6d Js3d9dAc Ah8dQd9c",
      Solver.process("omaha-holdem 2d3s5cKdTd Js3d9dAc Ad3h5s9s Kh3cQcKc Qs7h7d6d 4hJh6s8h JcThAs2h Ah8dQd9c 2c7s4sJd"));
  }

  @Test
  public void test_omaha_holdem_3347_4d5d6hKcQd_9d2c5hAh_Qc9h5s6s_8cThQh4h() {
    assertEquals(
      "9d2c5hAh 8cThQh4h Qc9h5s6s",
      Solver.process("omaha-holdem 4d5d6hKcQd 9d2c5hAh Qc9h5s6s 8cThQh4h"));
  }

  @Test
  public void test_omaha_holdem_3348_5h5s6s9hTs_4sJc7cKc_Jd9dKh4h_Js7s2s8s_6h4d8c7d_3sKsQs9c() {
    assertEquals(
      "4sJc7cKc Jd9dKh4h 6h4d8c7d Js7s2s8s 3sKsQs9c",
      Solver.process("omaha-holdem 5h5s6s9hTs 4sJc7cKc Jd9dKh4h Js7s2s8s 6h4d8c7d 3sKsQs9c"));
  }

  @Test
  public void test_omaha_holdem_3349_2c7c9sAsQd_2dKd3dKs_7h4cQcTd_Jc3s8c8h() {
    assertEquals(
      "Jc3s8c8h 2dKd3dKs 7h4cQcTd",
      Solver.process("omaha-holdem 2c7c9sAsQd 2dKd3dKs 7h4cQcTd Jc3s8c8h"));
  }

  @Test
  public void test_omaha_holdem_3350_3d4h7cJcKd_6dQd8h2d_4sAcJs3h() {
    assertEquals(
      "6dQd8h2d 4sAcJs3h",
      Solver.process("omaha-holdem 3d4h7cJcKd 6dQd8h2d 4sAcJs3h"));
  }

  @Test
  public void test_omaha_holdem_3351_3d6cAdJsTs_7cKc5cQh_5h5sTcJd_JhJc7d8d_2s9d3s6d_2d5d3c9s_8h3h4d4c_Qs2hQcTd_8c7hKs7s() {
    assertEquals(
      "2d5d3c9s 8h3h4d4c 8c7hKs7s Qs2hQcTd 2s9d3s6d 5h5sTcJd JhJc7d8d 7cKc5cQh",
      Solver.process("omaha-holdem 3d6cAdJsTs 7cKc5cQh 5h5sTcJd JhJc7d8d 2s9d3s6d 2d5d3c9s 8h3h4d4c Qs2hQcTd 8c7hKs7s"));
  }

  @Test
  public void test_omaha_holdem_3352_2c2h9dAsTs_Js3sQcQd_8s5d6dTc_8c7h2dJc_Kd4cQh4s_6h7c7s5s_Jh2sQsKh_ThTd4dKc() {
    assertEquals(
      "Kd4cQh4s 6h7c7s5s 8s5d6dTc Js3sQcQd 8c7h2dJc Jh2sQsKh ThTd4dKc",
      Solver.process("omaha-holdem 2c2h9dAsTs Js3sQcQd 8s5d6dTc 8c7h2dJc Kd4cQh4s 6h7c7s5s Jh2sQsKh ThTd4dKc"));
  }

  @Test
  public void test_omaha_holdem_3353_2c6c8hJcKd_5c4c6d3h_AcQd9c6h_9sKs7dAs_5d5h7c4h_TcKc5sAh_8d2dTd3c_2s9h3d8s_2hJs7hTh() {
    assertEquals(
      "5d5h7c4h 9sKs7dAs 2s9h3d8s=8d2dTd3c 2hJs7hTh 5c4c6d3h TcKc5sAh AcQd9c6h",
      Solver.process("omaha-holdem 2c6c8hJcKd 5c4c6d3h AcQd9c6h 9sKs7dAs 5d5h7c4h TcKc5sAh 8d2dTd3c 2s9h3d8s 2hJs7hTh"));
  }

  @Test
  public void test_omaha_holdem_3354_2d2s3s8sKh_2c4cAh3c_Ts7h5s9s_7s8d9dAc_4h6h5hKd_3hThQcKs_5c4sTdAs_7c8hKc3d_Js7dJd9h_6c6s8c9c() {
    assertEquals(
      "6c6s8c9c 7s8d9dAc Js7dJd9h 4h6h5hKd 3hThQcKs 7c8hKc3d Ts7h5s9s 5c4sTdAs 2c4cAh3c",
      Solver.process("omaha-holdem 2d2s3s8sKh 2c4cAh3c Ts7h5s9s 7s8d9dAc 4h6h5hKd 3hThQcKs 5c4sTdAs 7c8hKc3d Js7dJd9h 6c6s8c9c"));
  }

  @Test
  public void test_omaha_holdem_3355_9sJdKcQdTc_4d8cQs7d_5c2dThAs_2c5s4hTd() {
    assertEquals(
      "2c5s4hTd 4d8cQs7d 5c2dThAs",
      Solver.process("omaha-holdem 9sJdKcQdTc 4d8cQs7d 5c2dThAs 2c5s4hTd"));
  }

  @Test
  public void test_omaha_holdem_3356_3s4d4s6cQd_6s5sKdAs_9cAd6hTd_2sQh6d2d_Qs4c9s8c_Ac5h9d9h_2h8hKc3d() {
    assertEquals(
      "2h8hKc3d 6s5sKdAs=9cAd6hTd Ac5h9d9h 2sQh6d2d Qs4c9s8c",
      Solver.process("omaha-holdem 3s4d4s6cQd 6s5sKdAs 9cAd6hTd 2sQh6d2d Qs4c9s8c Ac5h9d9h 2h8hKc3d"));
  }

  @Test
  public void test_omaha_holdem_3357_2s5hAdQdQs_Td3c7dAc_2h4cAsKd_Jc8h6d4h_5c6c4dQc_Jd3hThAh_8d3d8s7h_9d7c9hKs() {
    assertEquals(
      "Jc8h6d4h 8d3d8s7h 9d7c9hKs Td3c7dAc Jd3hThAh 2h4cAsKd 5c6c4dQc",
      Solver.process("omaha-holdem 2s5hAdQdQs Td3c7dAc 2h4cAsKd Jc8h6d4h 5c6c4dQc Jd3hThAh 8d3d8s7h 9d7c9hKs"));
  }

  @Test
  public void test_omaha_holdem_3358_6d8sKcQhTs_7c3d7d5d_2dJh9c8d_AsTh8hQs_6hQc6c6s_Ks5hJc3h_3sKd9s7h_Js2cQdAc_AdJdKh2h_4s5s4h8c() {
    assertEquals(
      "7c3d7d5d 4s5s4h8c Ks5hJc3h AsTh8hQs 6hQc6c6s 3sKd9s7h 2dJh9c8d AdJdKh2h=Js2cQdAc",
      Solver.process("omaha-holdem 6d8sKcQhTs 7c3d7d5d 2dJh9c8d AsTh8hQs 6hQc6c6s Ks5hJc3h 3sKd9s7h Js2cQdAc AdJdKh2h 4s5s4h8c"));
  }

  @Test
  public void test_omaha_holdem_3359_7d7hAhKdQh_2sTh6hJs_AcTc4c6d() {
    assertEquals(
      "AcTc4c6d 2sTh6hJs",
      Solver.process("omaha-holdem 7d7hAhKdQh 2sTh6hJs AcTc4c6d"));
  }

  @Test
  public void test_omaha_holdem_3360_2d6c8hAdQs_4s7d5dQh_Qc5c2c7c_3sJh4h6d_4c3dTc9c_3hTs6sKd() {
    assertEquals(
      "4c3dTc9c 3sJh4h6d 3hTs6sKd 4s7d5dQh Qc5c2c7c",
      Solver.process("omaha-holdem 2d6c8hAdQs 4s7d5dQh Qc5c2c7c 3sJh4h6d 4c3dTc9c 3hTs6sKd"));
  }

  @Test
  public void test_omaha_holdem_3361_5h8d8hKhTd_4hQdKc9s_5d6c7sJc_7h4sAcTs_3h9c2s2d() {
    assertEquals(
      "3h9c2s2d 5d6c7sJc 7h4sAcTs 4hQdKc9s",
      Solver.process("omaha-holdem 5h8d8hKhTd 4hQdKc9s 5d6c7sJc 7h4sAcTs 3h9c2s2d"));
  }

  @Test
  public void test_omaha_holdem_3362_4c4d6sAhAs_Kd4h2cQd_7s2s5hKc_QhKhQcTh_9s9h7c3s_8c4s6c2d_AdAcTd5d_9c3hTsTc_3d3c6hJs_8dQs7d2h() {
    assertEquals(
      "8dQs7d2h 7s2s5hKc 3d3c6hJs 9s9h7c3s 9c3hTsTc QhKhQcTh Kd4h2cQd 8c4s6c2d AdAcTd5d",
      Solver.process("omaha-holdem 4c4d6sAhAs Kd4h2cQd 7s2s5hKc QhKhQcTh 9s9h7c3s 8c4s6c2d AdAcTd5d 9c3hTsTc 3d3c6hJs 8dQs7d2h"));
  }

  @Test
  public void test_omaha_holdem_3363_3s4s6h7cAc_8sJh6cTd_QcJs5h8c_7hQs9h4d_JcQd3hAs() {
    assertEquals(
      "8sJh6cTd 7hQs9h4d JcQd3hAs QcJs5h8c",
      Solver.process("omaha-holdem 3s4s6h7cAc 8sJh6cTd QcJs5h8c 7hQs9h4d JcQd3hAs"));
  }

  @Test
  public void test_omaha_holdem_3364_2d7d7hJhKc_4sAs4c6h_6s5s3c3h_8d9c4h5d_5c4dKdQc_8hJdTs2s_9sTh9hJs_8s5h6c2h_Ks8c7sTd_Jc3dQhQd() {
    assertEquals(
      "8d9c4h5d 8s5h6c2h 6s5s3c3h 4sAs4c6h 8hJdTs2s=9sTh9hJs Jc3dQhQd 5c4dKdQc Ks8c7sTd",
      Solver.process("omaha-holdem 2d7d7hJhKc 4sAs4c6h 6s5s3c3h 8d9c4h5d 5c4dKdQc 8hJdTs2s 9sTh9hJs 8s5h6c2h Ks8c7sTd Jc3dQhQd"));
  }

  @Test
  public void test_omaha_holdem_3365_4c5h8s9dQd_7h7d9s5s_6cQsJs4s_Ah3sTh4h_KcQh6sAc() {
    assertEquals(
      "Ah3sTh4h KcQh6sAc 7h7d9s5s 6cQsJs4s",
      Solver.process("omaha-holdem 4c5h8s9dQd 7h7d9s5s 6cQsJs4s Ah3sTh4h KcQh6sAc"));
  }

  @Test
  public void test_omaha_holdem_3366_5h5s6sKsQh_JcTd7c5d_8s4d8dTh_3s4s8h7s_2hTsJh3h() {
    assertEquals(
      "2hTsJh3h 8s4d8dTh JcTd7c5d 3s4s8h7s",
      Solver.process("omaha-holdem 5h5s6sKsQh JcTd7c5d 8s4d8dTh 3s4s8h7s 2hTsJh3h"));
  }

  @Test
  public void test_omaha_holdem_3367_2d8h8s9sKs_4d4c5d3h_9hTdJsAc_6c4hQc9d_JhKhAsJd_Tc7s2hTs_ThJc3s3c() {
    assertEquals(
      "ThJc3s3c 4d4c5d3h 6c4hQc9d 9hTdJsAc JhKhAsJd Tc7s2hTs",
      Solver.process("omaha-holdem 2d8h8s9sKs 4d4c5d3h 9hTdJsAc 6c4hQc9d JhKhAsJd Tc7s2hTs ThJc3s3c"));
  }

  @Test
  public void test_omaha_holdem_3368_6d8cAdKhTs_KdQh4h5c_Jc2h3c9d_Ks9cQdAc_9h5d3h7s_Jh2cJsTc_7d4d2d6c() {
    assertEquals(
      "Jc2h3c9d 7d4d2d6c Jh2cJsTc KdQh4h5c Ks9cQdAc 9h5d3h7s",
      Solver.process("omaha-holdem 6d8cAdKhTs KdQh4h5c Jc2h3c9d Ks9cQdAc 9h5d3h7s Jh2cJsTc 7d4d2d6c"));
  }

  @Test
  public void test_omaha_holdem_3369_2d5s6c6dAd_3d3sKh8c_7hQs5hJc_4sAs9s5d_Ts6s2h7c_Js2s4c6h_8h9hJh3c_8d4dTcAc_Ks5c4h8s() {
    assertEquals(
      "8h9hJh3c 3d3sKh8c 7hQs5hJc Ks5c4h8s 4sAs9s5d 8d4dTcAc Js2s4c6h=Ts6s2h7c",
      Solver.process("omaha-holdem 2d5s6c6dAd 3d3sKh8c 7hQs5hJc 4sAs9s5d Ts6s2h7c Js2s4c6h 8h9hJh3c 8d4dTcAc Ks5c4h8s"));
  }

  @Test
  public void test_omaha_holdem_3370_7hJdKsQhQs_3d2c4sAc_Kh3c7dTh() {
    assertEquals(
      "3d2c4sAc Kh3c7dTh",
      Solver.process("omaha-holdem 7hJdKsQhQs 3d2c4sAc Kh3c7dTh"));
  }

  @Test
  public void test_omaha_holdem_3371_4d4h6h7c7s_TcAd2cAs_5c2dTs9d_6c8cTdQc_2hJcKc5h() {
    assertEquals(
      "5c2dTs9d 2hJcKc5h 6c8cTdQc TcAd2cAs",
      Solver.process("omaha-holdem 4d4h6h7c7s TcAd2cAs 5c2dTs9d 6c8cTdQc 2hJcKc5h"));
  }

  @Test
  public void test_omaha_holdem_3372_3h7s8dKcQs_8s6h2dTh_Jc7h5hQd_Jh6sAc4h_9dJd6d5s_3s2hKd4d_Qc8c5dAs_4s9c7cAd_7d3cTc5c_Js2c9s3d() {
    assertEquals(
      "9dJd6d5s Jh6sAc4h Js2c9s3d 4s9c7cAd 8s6h2dTh 7d3cTc5c Jc7h5hQd Qc8c5dAs 3s2hKd4d",
      Solver.process("omaha-holdem 3h7s8dKcQs 8s6h2dTh Jc7h5hQd Jh6sAc4h 9dJd6d5s 3s2hKd4d Qc8c5dAs 4s9c7cAd 7d3cTc5c Js2c9s3d"));
  }

  @Test
  public void test_omaha_holdem_3373_3d7dAcAhAs_Ts9s6sQs_Th9hJs6c() {
    assertEquals(
      "Th9hJs6c Ts9s6sQs",
      Solver.process("omaha-holdem 3d7dAcAhAs Ts9s6sQs Th9hJs6c"));
  }

  @Test
  public void test_omaha_holdem_3374_3s4h6cAdAs_5h8cJs7c_TsJc8d7d() {
    assertEquals(
      "TsJc8d7d 5h8cJs7c",
      Solver.process("omaha-holdem 3s4h6cAdAs 5h8cJs7c TsJc8d7d"));
  }

  @Test
  public void test_omaha_holdem_3375_7h8d8hJhTc_9c5d7c4c_Th9d5s6h_4dKh4sTs_6dKd3d9s_QdAd8sTd() {
    assertEquals(
      "4dKh4sTs 6dKd3d9s 9c5d7c4c Th9d5s6h QdAd8sTd",
      Solver.process("omaha-holdem 7h8d8hJhTc 9c5d7c4c Th9d5s6h 4dKh4sTs 6dKd3d9s QdAd8sTd"));
  }

  @Test
  public void test_omaha_holdem_3376_2d4s6c7sTh_4d8c3sAc_8d3hQdKc() {
    assertEquals(
      "8d3hQdKc 4d8c3sAc",
      Solver.process("omaha-holdem 2d4s6c7sTh 4d8c3sAc 8d3hQdKc"));
  }

  @Test
  public void test_omaha_holdem_3377_6h7hAcJsKc_Jh6dQsQc_Kh4dAdAs_4s5dTd3c_2d8s4hQh() {
    assertEquals(
      "4s5dTd3c 2d8s4hQh Jh6dQsQc Kh4dAdAs",
      Solver.process("omaha-holdem 6h7hAcJsKc Jh6dQsQc Kh4dAdAs 4s5dTd3c 2d8s4hQh"));
  }

  @Test
  public void test_omaha_holdem_3378_4c6s9hKsQh_8h7d5h7c_Js9s7s7h_3dTs8d4d_5sQdKc2h_Tc2c9cAd_QsAc3h8s_Jd6d5c2s() {
    assertEquals(
      "3dTs8d4d Jd6d5c2s 8h7d5h7c Js9s7s7h Tc2c9cAd QsAc3h8s 5sQdKc2h",
      Solver.process("omaha-holdem 4c6s9hKsQh 8h7d5h7c Js9s7s7h 3dTs8d4d 5sQdKc2h Tc2c9cAd QsAc3h8s Jd6d5c2s"));
  }

  @Test
  public void test_omaha_holdem_3379_3d9dTcTdTs_5d8c7c4s_5sAd3sQh_8sKd6c7d_2h2dJh4h_KsQdQsAc() {
    assertEquals(
      "5d8c7c4s 5sAd3sQh 8sKd6c7d 2h2dJh4h KsQdQsAc",
      Solver.process("omaha-holdem 3d9dTcTdTs 5d8c7c4s 5sAd3sQh 8sKd6c7d 2h2dJh4h KsQdQsAc"));
  }

  @Test
  public void test_omaha_holdem_3380_5c7d8dAsTd_5sAd4cJd_8h3dAc9c_4s6c5hQs_4d7c8s2h_6sKs2c7h_7s9h3s3h_Jh6d2sKh_4hQh6hKc_QdTsJsJc() {
    assertEquals(
      "Jh6d2sKh 7s9h3s3h 6sKs2c7h QdTsJsJc 4d7c8s2h 8h3dAc9c 4hQh6hKc=4s6c5hQs 5sAd4cJd",
      Solver.process("omaha-holdem 5c7d8dAsTd 5sAd4cJd 8h3dAc9c 4s6c5hQs 4d7c8s2h 6sKs2c7h 7s9h3s3h Jh6d2sKh 4hQh6hKc QdTsJsJc"));
  }

  @Test
  public void test_omaha_holdem_3381_2s6h8hAcTd_Qd4h7h6s_2hKc6c3s_Js5d9s4s_AdQhQs8d_8c7sTc5s_9dJdKd9c_4cJc2d3c() {
    assertEquals(
      "Js5d9s4s 4cJc2d3c Qd4h7h6s 9dJdKd9c 2hKc6c3s 8c7sTc5s AdQhQs8d",
      Solver.process("omaha-holdem 2s6h8hAcTd Qd4h7h6s 2hKc6c3s Js5d9s4s AdQhQs8d 8c7sTc5s 9dJdKd9c 4cJc2d3c"));
  }

  @Test
  public void test_omaha_holdem_3382_7c9cAsKhQd_TsJh2c7s_4c9hJd3h_6cThTd5c_6h7hKdKc() {
    assertEquals(
      "4c9hJd3h 6cThTd5c 6h7hKdKc TsJh2c7s",
      Solver.process("omaha-holdem 7c9cAsKhQd TsJh2c7s 4c9hJd3h 6cThTd5c 6h7hKdKc"));
  }

  @Test
  public void test_omaha_holdem_3383_3c6s9hJhJs_7c3dAh3s_6d5hKhKc_9d4h5c2s_QdQs7s6h_7h3hQc2d_JcTc4cAc_4d8dQh8h() {
    assertEquals(
      "7h3hQc2d 4d8dQh8h 9d4h5c2s QdQs7s6h 6d5hKhKc JcTc4cAc 7c3dAh3s",
      Solver.process("omaha-holdem 3c6s9hJhJs 7c3dAh3s 6d5hKhKc 9d4h5c2s QdQs7s6h 7h3hQc2d JcTc4cAc 4d8dQh8h"));
  }

  @Test
  public void test_omaha_holdem_3384_4c4s8sKdQs_9h3h7dAh_7cKc6s6c_QhKs6dKh() {
    assertEquals(
      "9h3h7dAh 7cKc6s6c QhKs6dKh",
      Solver.process("omaha-holdem 4c4s8sKdQs 9h3h7dAh 7cKc6s6c QhKs6dKh"));
  }

  @Test
  public void test_omaha_holdem_3385_2s6h8s9sKh_7c4h3h9c_5dQs4sKs_7dJcTcJh_2d3sAcKd_Jd9d2cAs_6cAh5hKc_Td9h5c8c() {
    assertEquals(
      "7c4h3h9c Jd9d2cAs Td9h5c8c 2d3sAcKd 6cAh5hKc 7dJcTcJh 5dQs4sKs",
      Solver.process("omaha-holdem 2s6h8s9sKh 7c4h3h9c 5dQs4sKs 7dJcTcJh 2d3sAcKd Jd9d2cAs 6cAh5hKc Td9h5c8c"));
  }

  @Test
  public void test_omaha_holdem_3386_3d7d8hJdKd_5h9hAcTs_2d4sJsAh_4h6d8c2c_6h8s4d5d_Th3c5s9c_Qd2hQcJh_Ks2s4c8d_TcJcTdQh_6c3hKc6s() {
    assertEquals(
      "4h6d8c2c TcJcTdQh 2d4sJsAh Qd2hQcJh 6c3hKc6s Ks2s4c8d 5h9hAcTs=Th3c5s9c 6h8s4d5d",
      Solver.process("omaha-holdem 3d7d8hJdKd 5h9hAcTs 2d4sJsAh 4h6d8c2c 6h8s4d5d Th3c5s9c Qd2hQcJh Ks2s4c8d TcJcTdQh 6c3hKc6s"));
  }

  @Test
  public void test_omaha_holdem_3387_4d4h6s7c8s_3s3h2c5h_5s2h6c6h_5c3cJhTh() {
    assertEquals(
      "3s3h2c5h=5c3cJhTh 5s2h6c6h",
      Solver.process("omaha-holdem 4d4h6s7c8s 3s3h2c5h 5s2h6c6h 5c3cJhTh"));
  }

  @Test
  public void test_omaha_holdem_3388_2d4s5hKhTh_7d3sAh9c_Jh7hJd4c() {
    assertEquals(
      "7d3sAh9c Jh7hJd4c",
      Solver.process("omaha-holdem 2d4s5hKhTh 7d3sAh9c Jh7hJd4c"));
  }

  @Test
  public void test_omaha_holdem_3389_6c9hQhQsTc_QcTd9d5h_Js8s7h6h() {
    assertEquals(
      "Js8s7h6h QcTd9d5h",
      Solver.process("omaha-holdem 6c9hQhQsTc QcTd9d5h Js8s7h6h"));
  }

  @Test
  public void test_omaha_holdem_3390_2h4s5c9hJs_Kh8sKcAs_5hAd2c9s_JcJh4h9c_8d3dAc7s_6d4d4c3s_KdKs2dQh_8c7hAhQc() {
    assertEquals(
      "8c7hAhQc KdKs2dQh=Kh8sKcAs 5hAd2c9s JcJh4h9c 8d3dAc7s 6d4d4c3s",
      Solver.process("omaha-holdem 2h4s5c9hJs Kh8sKcAs 5hAd2c9s JcJh4h9c 8d3dAc7s 6d4d4c3s KdKs2dQh 8c7hAhQc"));
  }

  @Test
  public void test_omaha_holdem_3391_6c6s7dAcKd_Jd9cJh9h_JsQcTsAs_3s7s4sQd_9s9d2d3h_QsTc3d8c_5c6h2c3c_8d2hKs8s_5h4cTd7c() {
    assertEquals(
      "QsTc3d8c 5h4cTd7c 3s7s4sQd 9s9d2d3h Jd9cJh9h 8d2hKs8s JsQcTsAs 5c6h2c3c",
      Solver.process("omaha-holdem 6c6s7dAcKd Jd9cJh9h JsQcTsAs 3s7s4sQd 9s9d2d3h QsTc3d8c 5c6h2c3c 8d2hKs8s 5h4cTd7c"));
  }

  @Test
  public void test_omaha_holdem_3392_3c4s5sAsJs_3h6sKcJc_3sQd2d6h_9hAhThJh_8d4c5hAc_Ts9cQs6c_Kd7s9s4d_KhAd3dJd() {
    assertEquals(
      "3h6sKcJc 8d4c5hAc 9hAhThJh=KhAd3dJd 3sQd2d6h Kd7s9s4d Ts9cQs6c",
      Solver.process("omaha-holdem 3c4s5sAsJs 3h6sKcJc 3sQd2d6h 9hAhThJh 8d4c5hAc Ts9cQs6c Kd7s9s4d KhAd3dJd"));
  }

  @Test
  public void test_omaha_holdem_3393_2dAsKdKhQh_3c5d7cJc_3h4s6d4h_6hKsJdAh_8hJs7dTc_6sTd9d4c_7h8c5hKc_5s9cAd2c() {
    assertEquals(
      "6sTd9d4c 3c5d7cJc 3h4s6d4h 5s9cAd2c 7h8c5hKc 8hJs7dTc 6hKsJdAh",
      Solver.process("omaha-holdem 2dAsKdKhQh 3c5d7cJc 3h4s6d4h 6hKsJdAh 8hJs7dTc 6sTd9d4c 7h8c5hKc 5s9cAd2c"));
  }

  @Test
  public void test_omaha_holdem_3394_4s8d8sAsKd_3hKhTc8c_Js4c2h8h_TdJcTs3c_Kc3s6h9d_Qc7c3d7h_6c2d5hTh_5c7sQs6d() {
    assertEquals(
      "6c2d5hTh Qc7c3d7h TdJcTs3c Kc3s6h9d 5c7sQs6d Js4c2h8h 3hKhTc8c",
      Solver.process("omaha-holdem 4s8d8sAsKd 3hKhTc8c Js4c2h8h TdJcTs3c Kc3s6h9d Qc7c3d7h 6c2d5hTh 5c7sQs6d"));
  }

  @Test
  public void test_omaha_holdem_3395_3c6sJdQdTc_Ad7d5s4d_Kd8c2h4s_6h7cJc7h_Ac8d3dAs_Ks9sJh2d_3s4h7sKc_8h5h5d8s() {
    assertEquals(
      "Kd8c2h4s Ad7d5s4d 3s4h7sKc 8h5h5d8s Ac8d3dAs 6h7cJc7h Ks9sJh2d",
      Solver.process("omaha-holdem 3c6sJdQdTc Ad7d5s4d Kd8c2h4s 6h7cJc7h Ac8d3dAs Ks9sJh2d 3s4h7sKc 8h5h5d8s"));
  }

  @Test
  public void test_omaha_holdem_3396_8dAsKsQhQs_9c3sTc6h_7d3h8cKh_Ad2h4hAh_Qc6sTh6c() {
    assertEquals(
      "9c3sTc6h 7d3h8cKh Qc6sTh6c Ad2h4hAh",
      Solver.process("omaha-holdem 8dAsKsQhQs 9c3sTc6h 7d3h8cKh Ad2h4hAh Qc6sTh6c"));
  }

  @Test
  public void test_omaha_holdem_3397_2c4h5h6hQs_Ac6s8d5s_7cJc3dQc_Tc2dKd4s_9d6cQh4d_KhKc5c8c_JdTs7s6d() {
    assertEquals(
      "JdTs7s6d KhKc5c8c Tc2dKd4s Ac6s8d5s 9d6cQh4d 7cJc3dQc",
      Solver.process("omaha-holdem 2c4h5h6hQs Ac6s8d5s 7cJc3dQc Tc2dKd4s 9d6cQh4d KhKc5c8c JdTs7s6d"));
  }

  @Test
  public void test_omaha_holdem_3398_2s7c8h8sTh_7d2c4sQs_9dTsQcKh() {
    assertEquals(
      "7d2c4sQs 9dTsQcKh",
      Solver.process("omaha-holdem 2s7c8h8sTh 7d2c4sQs 9dTsQcKh"));
  }

  @Test
  public void test_omaha_holdem_3399_4h6c8c8hTh_5dAs7h9h_7s2h8d3d_2d8s2s9d_AcTdKdJc_4dTsAhQd_JdKsJhTc_Qs7c5s5h() {
    assertEquals(
      "4dTsAhQd=AcTdKdJc JdKsJhTc 7s2h8d3d 2d8s2s9d Qs7c5s5h 5dAs7h9h",
      Solver.process("omaha-holdem 4h6c8c8hTh 5dAs7h9h 7s2h8d3d 2d8s2s9d AcTdKdJc 4dTsAhQd JdKsJhTc Qs7c5s5h"));
  }

  @Test
  public void test_omaha_holdem_3400_2c3s8hJhTc_Ks4h7s5h_9dAdTdKd_Th6sAs6h_6d5d2d3c_QhQd9sQs() {
    assertEquals(
      "Ks4h7s5h 9dAdTdKd=Th6sAs6h 6d5d2d3c QhQd9sQs",
      Solver.process("omaha-holdem 2c3s8hJhTc Ks4h7s5h 9dAdTdKd Th6sAs6h 6d5d2d3c QhQd9sQs"));
  }

  @Test
  public void test_omaha_holdem_3401_2d3h9cQhQs_5s3dKs8c_8d9d7sKc_Qc8h3cTs_Qd4h2sAh_Jh4sKdTc_2cAs2h6h() {
    assertEquals(
      "Jh4sKdTc 5s3dKs8c 8d9d7sKc 2cAs2h6h Qd4h2sAh Qc8h3cTs",
      Solver.process("omaha-holdem 2d3h9cQhQs 5s3dKs8c 8d9d7sKc Qc8h3cTs Qd4h2sAh Jh4sKdTc 2cAs2h6h"));
  }

  @Test
  public void test_omaha_holdem_3402_3d6c9h9sQh_TdQsAd6d_Js6sKs2c_4sKc2dJc_4d9d8s7s_3s7hJdKd_7d5h8h7c() {
    assertEquals(
      "4sKc2dJc 3s7hJdKd Js6sKs2c 7d5h8h7c TdQsAd6d 4d9d8s7s",
      Solver.process("omaha-holdem 3d6c9h9sQh TdQsAd6d Js6sKs2c 4sKc2dJc 4d9d8s7s 3s7hJdKd 7d5h8h7c"));
  }

  @Test
  public void test_omaha_holdem_3403_8dAhKcKhQd_7sAs2c3c_9hJd6d4h_7h4s6s9c_9d5d8h2s() {
    assertEquals(
      "7h4s6s9c 9hJd6d4h 9d5d8h2s 7sAs2c3c",
      Solver.process("omaha-holdem 8dAhKcKhQd 7sAs2c3c 9hJd6d4h 7h4s6s9c 9d5d8h2s"));
  }

  @Test
  public void test_omaha_holdem_3404_3d4d9c9h9s_Qh4c3sAd_7cKs3c3h_QcJh2dJc_JdTh4s7h_8cAh7s7d_6d8hJs8s() {
    assertEquals(
      "JdTh4s7h Qh4c3sAd 7cKs3c3h 8cAh7s7d 6d8hJs8s QcJh2dJc",
      Solver.process("omaha-holdem 3d4d9c9h9s Qh4c3sAd 7cKs3c3h QcJh2dJc JdTh4s7h 8cAh7s7d 6d8hJs8s"));
  }

  @Test
  public void test_omaha_holdem_3405_2d9hKhQcTh_2hQd4d7s_8dKsJdAd() {
    assertEquals(
      "2hQd4d7s 8dKsJdAd",
      Solver.process("omaha-holdem 2d9hKhQcTh 2hQd4d7s 8dKsJdAd"));
  }

  @Test
  public void test_omaha_holdem_3406_2s5sQdQhTc_Ad5dAh4s_Js4hTdAs() {
    assertEquals(
      "Js4hTdAs Ad5dAh4s",
      Solver.process("omaha-holdem 2s5sQdQhTc Ad5dAh4s Js4hTdAs"));
  }

  @Test
  public void test_omaha_holdem_3407_3d8cAsKdTh_6c9h8dQs_Qh3s2d5h_Ts2c6d7s_7h9cKs5s_JsAdJh5c() {
    assertEquals(
      "Qh3s2d5h 6c9h8dQs Ts2c6d7s 7h9cKs5s JsAdJh5c",
      Solver.process("omaha-holdem 3d8cAsKdTh 6c9h8dQs Qh3s2d5h Ts2c6d7s 7h9cKs5s JsAdJh5c"));
  }

  @Test
  public void test_omaha_holdem_3408_5c7cAsKcKd_5d8s6s2s_Js9sQdAc_5h3cQsJc_Ad6c3sQh_5sThTd7d_Qc4dAhKs_2d3d2cKh_4cJh2h8d() {
    assertEquals(
      "4cJh2h8d 5d8s6s2s 5sThTd7d Ad6c3sQh=Js9sQdAc 2d3d2cKh 5h3cQsJc Qc4dAhKs",
      Solver.process("omaha-holdem 5c7cAsKcKd 5d8s6s2s Js9sQdAc 5h3cQsJc Ad6c3sQh 5sThTd7d Qc4dAhKs 2d3d2cKh 4cJh2h8d"));
  }

  @Test
  public void test_omaha_holdem_3409_4s6c8hQsTc_Ah2d2cAd_4dJdAsQd_9c5sTs7d_7hAc7c4c_6hKh4hJh_5d2h3cTh_Ks8c2sKc() {
    assertEquals(
      "7hAc7c4c 5d2h3cTh Ks8c2sKc Ah2d2cAd 6hKh4hJh 4dJdAsQd 9c5sTs7d",
      Solver.process("omaha-holdem 4s6c8hQsTc Ah2d2cAd 4dJdAsQd 9c5sTs7d 7hAc7c4c 6hKh4hJh 5d2h3cTh Ks8c2sKc"));
  }

  @Test
  public void test_omaha_holdem_3410_3c7hJdJhKh_7s8hAc9h_KsJc8sQd_4c6c3dAd_Kd5h9s5c() {
    assertEquals(
      "4c6c3dAd Kd5h9s5c 7s8hAc9h KsJc8sQd",
      Solver.process("omaha-holdem 3c7hJdJhKh 7s8hAc9h KsJc8sQd 4c6c3dAd Kd5h9s5c"));
  }

  @Test
  public void test_omaha_holdem_3411_4c9dJcKsQs_QdKc3hTh_2c8cQcAh_Td3d4s9s_Ts9c5cTc_8d5d4d7h_Ac2sKhAs_9hJh6d6h_4h3cJd8s_Qh7d7cJs() {
    assertEquals(
      "8d5d4d7h 2c8cQcAh Ac2sKhAs 4h3cJd8s 9hJh6d6h Qh7d7cJs QdKc3hTh=Td3d4s9s=Ts9c5cTc",
      Solver.process("omaha-holdem 4c9dJcKsQs QdKc3hTh 2c8cQcAh Td3d4s9s Ts9c5cTc 8d5d4d7h Ac2sKhAs 9hJh6d6h 4h3cJd8s Qh7d7cJs"));
  }

  @Test
  public void test_omaha_holdem_3412_2dJsQdTdTh_Qs9cTc2c_QcTs2s7d_5sKh5dKs_4d6d4s5c_2h8s9dKc_As8hJd4h_9s7sAdJh() {
    assertEquals(
      "9s7sAdJh=As8hJd4h 5sKh5dKs 2h8s9dKc 4d6d4s5c QcTs2s7d=Qs9cTc2c",
      Solver.process("omaha-holdem 2dJsQdTdTh Qs9cTc2c QcTs2s7d 5sKh5dKs 4d6d4s5c 2h8s9dKc As8hJd4h 9s7sAdJh"));
  }

  @Test
  public void test_omaha_holdem_3413_2d4d8dQsTs_As7c7s2h_6hKdKsQh_2s4sAcTd() {
    assertEquals(
      "As7c7s2h 6hKdKsQh 2s4sAcTd",
      Solver.process("omaha-holdem 2d4d8dQsTs As7c7s2h 6hKdKsQh 2s4sAcTd"));
  }

  @Test
  public void test_omaha_holdem_3414_7c7dAdJsTs_4s5cAcKh_Td6h5h3c() {
    assertEquals(
      "Td6h5h3c 4s5cAcKh",
      Solver.process("omaha-holdem 7c7dAdJsTs 4s5cAcKh Td6h5h3c"));
  }

  @Test
  public void test_omaha_holdem_3415_2d5s8h9hAc_7c3s8d4s_7hKc2h6c_8s4d9cJd_5dQdAhJs_KsQc7d3c_6s4cQsTd_Tc8cAs7s() {
    assertEquals(
      "6s4cQsTd KsQc7d3c 8s4d9cJd 5dQdAhJs Tc8cAs7s 7c3s8d4s 7hKc2h6c",
      Solver.process("omaha-holdem 2d5s8h9hAc 7c3s8d4s 7hKc2h6c 8s4d9cJd 5dQdAhJs KsQc7d3c 6s4cQsTd Tc8cAs7s"));
  }

  @Test
  public void test_omaha_holdem_3416_3s5c8h9hTc_2dTh8cKd_Kh4d6cTd_9s9c6h2c_JsAdQc7c_3hQd2h7s_9d8dQhAs_QsAc6d5h() {
    assertEquals(
      "3hQd2h7s QsAc6d5h Kh4d6cTd 9d8dQhAs 2dTh8cKd 9s9c6h2c JsAdQc7c",
      Solver.process("omaha-holdem 3s5c8h9hTc 2dTh8cKd Kh4d6cTd 9s9c6h2c JsAdQc7c 3hQd2h7s 9d8dQhAs QsAc6d5h"));
  }

  @Test
  public void test_omaha_holdem_3417_2c9sAcKsTc_6h4cQc2s_4d8h8d8c_Qh3hTh9d_QdKc7d9h_QsAdJd2h_7cAsKd7s() {
    assertEquals(
      "4d8h8d8c Qh3hTh9d QdKc7d9h 7cAsKd7s QsAdJd2h 6h4cQc2s",
      Solver.process("omaha-holdem 2c9sAcKsTc 6h4cQc2s 4d8h8d8c Qh3hTh9d QdKc7d9h QsAdJd2h 7cAsKd7s"));
  }

  @Test
  public void test_omaha_holdem_3418_2sJhQhQsTs_As6dJd7s_Th2d6cAh_9d4dQdAd_Kc2c6sJs() {
    assertEquals(
      "Th2d6cAh 9d4dQdAd Kc2c6sJs As6dJd7s",
      Solver.process("omaha-holdem 2sJhQhQsTs As6dJd7s Th2d6cAh 9d4dQdAd Kc2c6sJs"));
  }

  @Test
  public void test_omaha_holdem_3419_4d7c7hKhQh_Jd8c3sKs_QdJs2sAc_9hAd9sTd_6h5h3h2h() {
    assertEquals(
      "9hAd9sTd QdJs2sAc Jd8c3sKs 6h5h3h2h",
      Solver.process("omaha-holdem 4d7c7hKhQh Jd8c3sKs QdJs2sAc 9hAd9sTd 6h5h3h2h"));
  }

  @Test
  public void test_omaha_holdem_3420_8h9c9sKsQh_Qd4h9d5c_Jc3s4c6h_7d6s8cTs_2cTdAd6c_6d5dJs2s_AsKd4s8d_9hKcQc2h_Jh3dAhQs() {
    assertEquals(
      "6d5dJs2s=Jc3s4c6h 2cTdAd6c 7d6s8cTs Jh3dAhQs AsKd4s8d Qd4h9d5c 9hKcQc2h",
      Solver.process("omaha-holdem 8h9c9sKsQh Qd4h9d5c Jc3s4c6h 7d6s8cTs 2cTdAd6c 6d5dJs2s AsKd4s8d 9hKcQc2h Jh3dAhQs"));
  }

  @Test
  public void test_omaha_holdem_3421_3d4d6dJcKs_7d8h2cAh_8c3s2d5d_7h6sAs4h() {
    assertEquals(
      "7d8h2cAh 7h6sAs4h 8c3s2d5d",
      Solver.process("omaha-holdem 3d4d6dJcKs 7d8h2cAh 8c3s2d5d 7h6sAs4h"));
  }

  @Test
  public void test_omaha_holdem_3422_2sKdKhTcTh_Ah2dTs7s_8d3h9c7c_9s8cJd7d_Qd3s5c2c_9h8s4s4c_7hQhJh9d_5dQs5hKs() {
    assertEquals(
      "8d3h9c7c 9s8cJd7d 7hQhJh9d Qd3s5c2c 9h8s4s4c 5dQs5hKs Ah2dTs7s",
      Solver.process("omaha-holdem 2sKdKhTcTh Ah2dTs7s 8d3h9c7c 9s8cJd7d Qd3s5c2c 9h8s4s4c 7hQhJh9d 5dQs5hKs"));
  }

  @Test
  public void test_omaha_holdem_3423_2d3h5h6dQs_6sKd7dAs_8h7h2sTs_Th4c8c2h_Js9c2cJd_Ks8d3d3s_4sTc8sQc_KcKh4dJc_9hTd5cAd_6cAc7s5s() {
    assertEquals(
      "8h7h2sTs 9hTd5cAd 6sKd7dAs Js9c2cJd 4sTc8sQc KcKh4dJc 6cAc7s5s Ks8d3d3s Th4c8c2h",
      Solver.process("omaha-holdem 2d3h5h6dQs 6sKd7dAs 8h7h2sTs Th4c8c2h Js9c2cJd Ks8d3d3s 4sTc8sQc KcKh4dJc 9hTd5cAd 6cAc7s5s"));
  }

  @Test
  public void test_omaha_holdem_3424_4d6c6hJdJh_ThQh9cJs_7d3s3h3c_5d2c2s8h_Ad7h8dAc_AhKhAsJc_Ts7sKsQs_9h7c6s8s_4s5c8cQc_4c2dTc3d() {
    assertEquals(
      "Ts7sKsQs 5d2c2s8h 7d3s3h3c 4c2dTc3d 4s5c8cQc Ad7h8dAc 9h7c6s8s ThQh9cJs AhKhAsJc",
      Solver.process("omaha-holdem 4d6c6hJdJh ThQh9cJs 7d3s3h3c 5d2c2s8h Ad7h8dAc AhKhAsJc Ts7sKsQs 9h7c6s8s 4s5c8cQc 4c2dTc3d"));
  }

  @Test
  public void test_omaha_holdem_3425_2h5hAhKsTc_5d3c2sAc_QsQc4c6d_4h7dKdTd_8c9d3s8d_Jh7c8sAs() {
    assertEquals(
      "8c9d3s8d QsQc4c6d Jh7c8sAs 4h7dKdTd 5d3c2sAc",
      Solver.process("omaha-holdem 2h5hAhKsTc 5d3c2sAc QsQc4c6d 4h7dKdTd 8c9d3s8d Jh7c8sAs"));
  }

  @Test
  public void test_omaha_holdem_3426_5d6hJhQcTd_4d9sQd8h_3c4h3hTc_9h8dJdAd_9dKsJc2c() {
    assertEquals(
      "3c4h3hTc 4d9sQd8h=9h8dJdAd 9dKsJc2c",
      Solver.process("omaha-holdem 5d6hJhQcTd 4d9sQd8h 3c4h3hTc 9h8dJdAd 9dKsJc2c"));
  }

  @Test
  public void test_omaha_holdem_3427_6c7d7s8dTh_JcKsTc9s_Qd9hKdAs_8s6s3s3d_5d4d5sAc_4cKc5c6d_6hAh3h3c_KhJd9d2h_9c4hQhTd_Ad8h4sTs() {
    assertEquals(
      "Qd9hKdAs 6hAh3h3c 8s6s3s3d Ad8h4sTs 4cKc5c6d=5d4d5sAc 9c4hQhTd JcKsTc9s=KhJd9d2h",
      Solver.process("omaha-holdem 6c7d7s8dTh JcKsTc9s Qd9hKdAs 8s6s3s3d 5d4d5sAc 4cKc5c6d 6hAh3h3c KhJd9d2h 9c4hQhTd Ad8h4sTs"));
  }

  @Test
  public void test_omaha_holdem_3428_2c2d7s9cAd_7c6s6c4h_8s9h3dTd_4dAh5s3c_6hAc9s3h() {
    assertEquals(
      "7c6s6c4h 8s9h3dTd 4dAh5s3c 6hAc9s3h",
      Solver.process("omaha-holdem 2c2d7s9cAd 7c6s6c4h 8s9h3dTd 4dAh5s3c 6hAc9s3h"));
  }

  @Test
  public void test_omaha_holdem_3429_2c3s5c6c8d_TcAs8c9c_Js7c8hQd_Ad4cAcJd_3d9sJhTd_Qc3cQhKs_4s7s9dQs_3hThKd9h() {
    assertEquals(
      "3d9sJhTd 3hThKd9h Js7c8hQd 4s7s9dQs TcAs8c9c Qc3cQhKs Ad4cAcJd",
      Solver.process("omaha-holdem 2c3s5c6c8d TcAs8c9c Js7c8hQd Ad4cAcJd 3d9sJhTd Qc3cQhKs 4s7s9dQs 3hThKd9h"));
  }

  @Test
  public void test_omaha_holdem_3430_2s7c8dKhQc_7hQd6cTh_4s2d9d2h() {
    assertEquals(
      "7hQd6cTh 4s2d9d2h",
      Solver.process("omaha-holdem 2s7c8dKhQc 7hQd6cTh 4s2d9d2h"));
  }

  @Test
  public void test_omaha_holdem_3431_4d4h5h6dTh_5sTdAc8c_Qc3h6c9d_4c7h9h8s_2cAd8d2d_5d8hAhKs() {
    assertEquals(
      "2cAd8d2d Qc3h6c9d 5sTdAc8c 4c7h9h8s 5d8hAhKs",
      Solver.process("omaha-holdem 4d4h5h6dTh 5sTdAc8c Qc3h6c9d 4c7h9h8s 2cAd8d2d 5d8hAhKs"));
  }

  @Test
  public void test_omaha_holdem_3432_3dAhJhKsTc_6d8h4s2c_4h3s8c5s_8d3hKcKh_4c7h5cQs_6h9d6c2s_7s2dTs4d_2h7dJd3c() {
    assertEquals(
      "6d8h4s2c 4c7h5cQs 4h3s8c5s 6h9d6c2s 7s2dTs4d 2h7dJd3c 8d3hKcKh",
      Solver.process("omaha-holdem 3dAhJhKsTc 6d8h4s2c 4h3s8c5s 8d3hKcKh 4c7h5cQs 6h9d6c2s 7s2dTs4d 2h7dJd3c"));
  }

  @Test
  public void test_omaha_holdem_3433_2d7s9cAdKh_6s3dAhJh_Qd2cKsJs_Ac3h8s7d_3s9dQc8d_Ts9h4h8c_JdQh6dTh_8hAs2hKc() {
    assertEquals(
      "JdQh6dTh Ts9h4h8c 3s9dQc8d 6s3dAhJh Qd2cKsJs Ac3h8s7d 8hAs2hKc",
      Solver.process("omaha-holdem 2d7s9cAdKh 6s3dAhJh Qd2cKsJs Ac3h8s7d 3s9dQc8d Ts9h4h8c JdQh6dTh 8hAs2hKc"));
  }

  @Test
  public void test_omaha_holdem_3434_4dKdKhQcTd_2sAh5dQd_3dJs8d9h_4s7hQh4c_5c7sQsTh_7c4hJd8s() {
    assertEquals(
      "7c4hJd8s 5c7sQsTh 3dJs8d9h 2sAh5dQd 4s7hQh4c",
      Solver.process("omaha-holdem 4dKdKhQcTd 2sAh5dQd 3dJs8d9h 4s7hQh4c 5c7sQsTh 7c4hJd8s"));
  }

  @Test
  public void test_omaha_holdem_3435_3s4d6cAhTs_4hJh2c9s_8h2h2s9c_QsTd5sTc_7h6hThJd_3c7cAdKs_QhQc8s9h_8c3d7d5c() {
    assertEquals(
      "8h2h2s9c 4hJh2c9s QhQc8s9h 7h6hThJd 3c7cAdKs QsTd5sTc 8c3d7d5c",
      Solver.process("omaha-holdem 3s4d6cAhTs 4hJh2c9s 8h2h2s9c QsTd5sTc 7h6hThJd 3c7cAdKs QhQc8s9h 8c3d7d5c"));
  }

  @Test
  public void test_omaha_holdem_3436_3h4d4s5cAc_4cKsAdQc_JhTd5hJs_JdAh6s2d_Qs7dQdTc_KdQh6c2c_6dAs3c8s_Kc3d3sTs() {
    assertEquals(
      "JhTd5hJs Qs7dQdTc 6dAs3c8s JdAh6s2d=KdQh6c2c Kc3d3sTs 4cKsAdQc",
      Solver.process("omaha-holdem 3h4d4s5cAc 4cKsAdQc JhTd5hJs JdAh6s2d Qs7dQdTc KdQh6c2c 6dAs3c8s Kc3d3sTs"));
  }

  @Test
  public void test_omaha_holdem_3437_2c4h7sQsTc_2hJs5s9s_2dKh3sQc_3dTdTs8h_Kd3h9d7d_6dThKs6h_4d5d2sAc_4cQhAsAd_Jh6cAh7h_7c6s8cKc() {
    assertEquals(
      "2hJs5s9s 7c6s8cKc=Kd3h9d7d Jh6cAh7h 6dThKs6h 4d5d2sAc 2dKh3sQc 4cQhAsAd 3dTdTs8h",
      Solver.process("omaha-holdem 2c4h7sQsTc 2hJs5s9s 2dKh3sQc 3dTdTs8h Kd3h9d7d 6dThKs6h 4d5d2sAc 4cQhAsAd Jh6cAh7h 7c6s8cKc"));
  }

  @Test
  public void test_omaha_holdem_3438_5c5h9c9dQc_5d2s5sJs_Jc8sKd8h() {
    assertEquals(
      "Jc8sKd8h 5d2s5sJs",
      Solver.process("omaha-holdem 5c5h9c9dQc 5d2s5sJs Jc8sKd8h"));
  }

  @Test
  public void test_omaha_holdem_3439_9d9hJcKhQh_7s2c2s9c_AdTcTs8h_7d8d3d5d_9sJs6cQs_As6h7c3s_7h2hQdKd() {
    assertEquals(
      "7d8d3d5d As6h7c3s 7s2c2s9c AdTcTs8h 7h2hQdKd 9sJs6cQs",
      Solver.process("omaha-holdem 9d9hJcKhQh 7s2c2s9c AdTcTs8h 7d8d3d5d 9sJs6cQs As6h7c3s 7h2hQdKd"));
  }

  @Test
  public void test_omaha_holdem_3440_4d4h9c9hKh_5c9d7sAs_5s6c8c7c_8s3d9s2c_JdTdJs7d_Kd3sJh5h() {
    assertEquals(
      "5s6c8c7c JdTdJs7d 8s3d9s2c 5c9d7sAs Kd3sJh5h",
      Solver.process("omaha-holdem 4d4h9c9hKh 5c9d7sAs 5s6c8c7c 8s3d9s2c JdTdJs7d Kd3sJh5h"));
  }

  @Test
  public void test_omaha_holdem_3441_3d6cAhAsTc_KdJs5c7c_Ks2h4h5s_7sAc3h9c_QdTh8c2d_3c6s6hKh_4sQs5h9h_9sTs2s9d_TdJh7d4d() {
    assertEquals(
      "4sQs5h9h Ks2h4h5s KdJs5c7c 9sTs2s9d TdJh7d4d QdTh8c2d 3c6s6hKh 7sAc3h9c",
      Solver.process("omaha-holdem 3d6cAhAsTc KdJs5c7c Ks2h4h5s 7sAc3h9c QdTh8c2d 3c6s6hKh 4sQs5h9h 9sTs2s9d TdJh7d4d"));
  }

  @Test
  public void test_omaha_holdem_3442_2s4h9sAdJd_Kh5dTcTh_AcKdQh4d_6dJh5c9c_Qs7d6hQc_4s3d5h3s_3h8s3c8d_7cTdKc9h() {
    assertEquals(
      "3h8s3c8d 7cTdKc9h Kh5dTcTh Qs7d6hQc 6dJh5c9c AcKdQh4d 4s3d5h3s",
      Solver.process("omaha-holdem 2s4h9sAdJd Kh5dTcTh AcKdQh4d 6dJh5c9c Qs7d6hQc 4s3d5h3s 3h8s3c8d 7cTdKc9h"));
  }

  @Test
  public void test_omaha_holdem_3443_7c7h9cKhTc_8cAhQc4s_6dKdTd9s_2c8d6c4c() {
    assertEquals(
      "6dKdTd9s 2c8d6c4c 8cAhQc4s",
      Solver.process("omaha-holdem 7c7h9cKhTc 8cAhQc4s 6dKdTd9s 2c8d6c4c"));
  }

  @Test
  public void test_omaha_holdem_3444_4d7cAhKsQh_AsQd6h8c_5h7dJd2h_Js3cQcKh_Kd3hAd5s_7s9c4hQs() {
    assertEquals(
      "5h7dJd2h 7s9c4hQs Js3cQcKh AsQd6h8c Kd3hAd5s",
      Solver.process("omaha-holdem 4d7cAhKsQh AsQd6h8c 5h7dJd2h Js3cQcKh Kd3hAd5s 7s9c4hQs"));
  }

  @Test
  public void test_omaha_holdem_3445_3h4sAsKdTs_ThJc4d3d_5c2h7s8h_QsAd2s8c_Kh5h6cTd_5dAc3c7d_2d3sQh7c_4h6s9s7h_Tc5s6h8d_2c9cKs4c() {
    assertEquals(
      "2d3sQh7c Tc5s6h8d ThJc4d3d 2c9cKs4c Kh5h6cTd 5dAc3c7d 5c2h7s8h 4h6s9s7h QsAd2s8c",
      Solver.process("omaha-holdem 3h4sAsKdTs ThJc4d3d 5c2h7s8h QsAd2s8c Kh5h6cTd 5dAc3c7d 2d3sQh7c 4h6s9s7h Tc5s6h8d 2c9cKs4c"));
  }

  @Test
  public void test_omaha_holdem_3446_2c3d5hJhQc_3c5c7s6c_AcJdKs3h_KcKhTs4c_Ad6s8dTc_8c9s4h2h_6dQh4d7d_ThJc2s7h_5d2dQsKd_5s8h3sAh() {
    assertEquals(
      "Ad6s8dTc 8c9s4h2h KcKhTs4c 3c5c7s6c=5s8h3sAh ThJc2s7h AcJdKs3h 5d2dQsKd 6dQh4d7d",
      Solver.process("omaha-holdem 2c3d5hJhQc 3c5c7s6c AcJdKs3h KcKhTs4c Ad6s8dTc 8c9s4h2h 6dQh4d7d ThJc2s7h 5d2dQsKd 5s8h3sAh"));
  }

  @Test
  public void test_omaha_holdem_3447_3s4c4s5hTc_As8d5c8s_8h3dTdAd_5dTs9hJd() {
    assertEquals(
      "As8d5c8s 8h3dTdAd 5dTs9hJd",
      Solver.process("omaha-holdem 3s4c4s5hTc As8d5c8s 8h3dTdAd 5dTs9hJd"));
  }

  @Test
  public void test_omaha_holdem_3448_3s4c9c9sAc_QcQhAh8d_4hAd5c7s_Js6d8s6h_2hAsTh6c_TcKh9h2d_QsKsKd5h() {
    assertEquals(
      "Js6d8s6h QsKsKd5h 4hAd5c7s 2hAsTh6c QcQhAh8d TcKh9h2d",
      Solver.process("omaha-holdem 3s4c9c9sAc QcQhAh8d 4hAd5c7s Js6d8s6h 2hAsTh6c TcKh9h2d QsKsKd5h"));
  }

  @Test
  public void test_omaha_holdem_3449_4s5c7h9cJd_KhJcTs3c_8h4c8d3d_Qc3h9d8c_Kd6h9s6c_Ad2c7sJs_2s2d2hTh_Qd8s9h4d_KsTcKcAs_6s5d3sJh() {
    assertEquals(
      "2s2d2hTh 8h4c8d3d Qc3h9d8c Kd6h9s6c KhJcTs3c KsTcKcAs Qd8s9h4d Ad2c7sJs 6s5d3sJh",
      Solver.process("omaha-holdem 4s5c7h9cJd KhJcTs3c 8h4c8d3d Qc3h9d8c Kd6h9s6c Ad2c7sJs 2s2d2hTh Qd8s9h4d KsTcKcAs 6s5d3sJh"));
  }

  @Test
  public void test_omaha_holdem_3450_2h6d9dJcKh_8sTdJh7c_5d9hJd8c_5cQcTcKd_7h9c6s9s_5s8d3s3h_4h2dQh5h_6cTsAh3c_6h4dAc8h_2s7d4cKs() {
    assertEquals(
      "4h2dQh5h 5s8d3s3h 6cTsAh3c=6h4dAc8h 8sTdJh7c 5d9hJd8c 2s7d4cKs 7h9c6s9s 5cQcTcKd",
      Solver.process("omaha-holdem 2h6d9dJcKh 8sTdJh7c 5d9hJd8c 5cQcTcKd 7h9c6s9s 5s8d3s3h 4h2dQh5h 6cTsAh3c 6h4dAc8h 2s7d4cKs"));
  }

  @Test
  public void test_omaha_holdem_3451_4d7c7s8cAh_9dAc2h2c_3hQcKs3s_Kh3c9h2d_7hTcTd4c_6h6sJs8d_Jc8h8s6d_Th3d9cTs_5d4h6cJd() {
    assertEquals(
      "Kh3c9h2d 3hQcKs3s 6h6sJs8d Th3d9cTs 9dAc2h2c 5d4h6cJd 7hTcTd4c Jc8h8s6d",
      Solver.process("omaha-holdem 4d7c7s8cAh 9dAc2h2c 3hQcKs3s Kh3c9h2d 7hTcTd4c 6h6sJs8d Jc8h8s6d Th3d9cTs 5d4h6cJd"));
  }

  @Test
  public void test_omaha_holdem_3452_5d5h9h9sTd_QhJs2h7d_8sTs4d5c_3cQc8hKc_AhKs6cJh_4sQs2d7s_7c9cAs5s_3s2s3dJc_3hAcTc9d_Kd4hJdKh() {
    assertEquals(
      "4sQs2d7s QhJs2h7d 3cQc8hKc AhKs6cJh 3s2s3dJc Kd4hJdKh 8sTs4d5c 7c9cAs5s 3hAcTc9d",
      Solver.process("omaha-holdem 5d5h9h9sTd QhJs2h7d 8sTs4d5c 3cQc8hKc AhKs6cJh 4sQs2d7s 7c9cAs5s 3s2s3dJc 3hAcTc9d Kd4hJdKh"));
  }

  @Test
  public void test_omaha_holdem_3453_4d6s7hJhKh_AcTdTc3s_As7s7c9s_4hTsTh6c_Qd4c3hJs_AdQcKcQs_2h5cAh9h_Jd6h5s7d() {
    assertEquals(
      "AcTdTc3s AdQcKcQs Qd4c3hJs Jd6h5s7d As7s7c9s 4hTsTh6c 2h5cAh9h",
      Solver.process("omaha-holdem 4d6s7hJhKh AcTdTc3s As7s7c9s 4hTsTh6c Qd4c3hJs AdQcKcQs 2h5cAh9h Jd6h5s7d"));
  }

  @Test
  public void test_omaha_holdem_3454_4d6h8s9cKh_JcJd2h3d_3cAs8h3s_9d7cKd6c_3hQsThAh_KsJs7dKc_JhTc4h9h_5dTd4sQc() {
    assertEquals(
      "3hQsThAh 5dTd4sQc 3cAs8h3s JcJd2h3d JhTc4h9h 9d7cKd6c KsJs7dKc",
      Solver.process("omaha-holdem 4d6h8s9cKh JcJd2h3d 3cAs8h3s 9d7cKd6c 3hQsThAh KsJs7dKc JhTc4h9h 5dTd4sQc"));
  }

  @Test
  public void test_omaha_holdem_3455_2cAhJsTcTs_Ad3c4d2s_QcAcKd6c_8c3d9h5s_7h5h2dQs_Td9sAs7s_5d4h7d5c() {
    assertEquals(
      "8c3d9h5s 7h5h2dQs 5d4h7d5c Ad3c4d2s QcAcKd6c Td9sAs7s",
      Solver.process("omaha-holdem 2cAhJsTcTs Ad3c4d2s QcAcKd6c 8c3d9h5s 7h5h2dQs Td9sAs7s 5d4h7d5c"));
  }

  @Test
  public void test_omaha_holdem_3456_4h5d7h7sAh_QsTc6hAc_2c2hJc3h_Jd5s7cKd_9dKc9hKh() {
    assertEquals(
      "QsTc6hAc 2c2hJc3h 9dKc9hKh Jd5s7cKd",
      Solver.process("omaha-holdem 4h5d7h7sAh QsTc6hAc 2c2hJc3h Jd5s7cKd 9dKc9hKh"));
  }

  @Test
  public void test_omaha_holdem_3457_2h3c3d9cJh_9sQc8d4s_3hJcKs6c_8sQh4c3s_5d7c4h5s() {
    assertEquals(
      "5d7c4h5s 9sQc8d4s 8sQh4c3s 3hJcKs6c",
      Solver.process("omaha-holdem 2h3c3d9cJh 9sQc8d4s 3hJcKs6c 8sQh4c3s 5d7c4h5s"));
  }

  @Test
  public void test_omaha_holdem_3458_5c5s7c9c9h_2cJc3c6c_Qd8hTs7s_Td6sJh9d_4c9sKc3s_7h5d2hTc_AdJdQc6h_4hKd3h8s() {
    assertEquals(
      "4hKd3h8s AdJdQc6h Qd8hTs7s Td6sJh9d 2cJc3c6c 4c9sKc3s 7h5d2hTc",
      Solver.process("omaha-holdem 5c5s7c9c9h 2cJc3c6c Qd8hTs7s Td6sJh9d 4c9sKc3s 7h5d2hTc AdJdQc6h 4hKd3h8s"));
  }

  @Test
  public void test_omaha_holdem_3459_2h4h4sThTs_JsQc7s8h_Qh8d9sKd_9dTc3hAs() {
    assertEquals(
      "JsQc7s8h Qh8d9sKd 9dTc3hAs",
      Solver.process("omaha-holdem 2h4h4sThTs JsQc7s8h Qh8d9sKd 9dTc3hAs"));
  }

  @Test
  public void test_omaha_holdem_3460_2h4d5c7sAd_Kc9sQdAc_9dJsTd8s_6h4h2d7h_4s9c6c2s_8c3s7c3c_Qc9hTcTs() {
    assertEquals(
      "9dJsTd8s 8c3s7c3c Qc9hTcTs Kc9sQdAc 4s9c6c2s 6h4h2d7h",
      Solver.process("omaha-holdem 2h4d5c7sAd Kc9sQdAc 9dJsTd8s 6h4h2d7h 4s9c6c2s 8c3s7c3c Qc9hTcTs"));
  }

  @Test
  public void test_omaha_holdem_3461_4c6s7h9hQd_Kd9d8s8d_TdQs4h9c_Ad3s3hTc_Kh8c6cTs_2c7c5sJc_5c3c5d2d_Kc7sJh7d_3d5h9s2s_6d6hQc4d() {
    assertEquals(
      "Ad3s3hTc 2c7c5sJc Kd9d8s8d TdQs4h9c 6d6hQc4d Kc7sJh7d 3d5h9s2s=5c3c5d2d Kh8c6cTs",
      Solver.process("omaha-holdem 4c6s7h9hQd Kd9d8s8d TdQs4h9c Ad3s3hTc Kh8c6cTs 2c7c5sJc 5c3c5d2d Kc7sJh7d 3d5h9s2s 6d6hQc4d"));
  }

  @Test
  public void test_omaha_holdem_3462_3s7h9hAdQs_JhQhTd2h_As3hTcKh_6h7d5d7c_5c4h8d8h_4s8s9c6s() {
    assertEquals(
      "5c4h8d8h 4s8s9c6s JhQhTd2h As3hTcKh 6h7d5d7c",
      Solver.process("omaha-holdem 3s7h9hAdQs JhQhTd2h As3hTcKh 6h7d5d7c 5c4h8d8h 4s8s9c6s"));
  }

  @Test
  public void test_omaha_holdem_3463_3d4s5hJhTc_Ks3sJc9h_5cAcQc2s_2h4d9sQs_8d3c7s4h_Ts7h9d5d_8h6dAd6h() {
    assertEquals(
      "2h4d9sQs 8h6dAd6h 8d3c7s4h Ts7h9d5d Ks3sJc9h 5cAcQc2s",
      Solver.process("omaha-holdem 3d4s5hJhTc Ks3sJc9h 5cAcQc2s 2h4d9sQs 8d3c7s4h Ts7h9d5d 8h6dAd6h"));
  }

  @Test
  public void test_omaha_holdem_3464_2s5cJsKsQc_Ah2c3cAs_8d8cKh8s_7hTs4c6h_Kc5d7c3s_2h3dJdQs_2d4d4hQd_9s6sAd5h_Tc9h7dTd_9d8h6dJc() {
    assertEquals(
      "7hTs4c6h 9d8h6dJc 8d8cKh8s Ah2c3cAs 2d4d4hQd 2h3dJdQs Kc5d7c3s Tc9h7dTd 9s6sAd5h",
      Solver.process("omaha-holdem 2s5cJsKsQc Ah2c3cAs 8d8cKh8s 7hTs4c6h Kc5d7c3s 2h3dJdQs 2d4d4hQd 9s6sAd5h Tc9h7dTd 9d8h6dJc"));
  }

  @Test
  public void test_omaha_holdem_3465_4d9dAsJhQc_JcThQh7s_Kc2dKh2c_Ks6c7h9h() {
    assertEquals(
      "Ks6c7h9h Kc2dKh2c JcThQh7s",
      Solver.process("omaha-holdem 4d9dAsJhQc JcThQh7s Kc2dKh2c Ks6c7h9h"));
  }

  @Test
  public void test_omaha_holdem_3466_2s4d8c9d9s_Jd8s6h7s_QhAcKhAs_Tc5sQs4s_Qc7d6dTh() {
    assertEquals(
      "Qc7d6dTh Tc5sQs4s Jd8s6h7s QhAcKhAs",
      Solver.process("omaha-holdem 2s4d8c9d9s Jd8s6h7s QhAcKhAs Tc5sQs4s Qc7d6dTh"));
  }

  @Test
  public void test_omaha_holdem_3467_4h7c7hAsTc_Qc4d3d3s_Ts5c9c6s() {
    assertEquals(
      "Qc4d3d3s Ts5c9c6s",
      Solver.process("omaha-holdem 4h7c7hAsTc Qc4d3d3s Ts5c9c6s"));
  }

  @Test
  public void test_omaha_holdem_3468_5h7d9cAcTc_8c9s6s4h_2s3h2dJd_9h7c5d4c_2hKhKdKs() {
    assertEquals(
      "2s3h2dJd 2hKhKdKs 8c9s6s4h 9h7c5d4c",
      Solver.process("omaha-holdem 5h7d9cAcTc 8c9s6s4h 2s3h2dJd 9h7c5d4c 2hKhKdKs"));
  }

  @Test
  public void test_omaha_holdem_3469_3h4h4s9hAs_Qs3c4cAh_8cAc5sJd_7s7h6hTs_5hQd8h8s_2sAd9d4d_8dQhKhJc_3dKcTd2d_6d6cKd2h() {
    assertEquals(
      "3dKcTd2d 6d6cKd2h 8cAc5sJd 7s7h6hTs 5hQd8h8s 8dQhKhJc 2sAd9d4d=Qs3c4cAh",
      Solver.process("omaha-holdem 3h4h4s9hAs Qs3c4cAh 8cAc5sJd 7s7h6hTs 5hQd8h8s 2sAd9d4d 8dQhKhJc 3dKcTd2d 6d6cKd2h"));
  }

  @Test
  public void test_omaha_holdem_3470_7h9dJcKsQd_ThAd5s6c_Kc7c5c5d_QcTd4s3c_QhAs8d3h_9c4c5h8h_JdAcQsJh_2s4d9s6h_6s2h2d9h() {
    assertEquals(
      "2s4d9s6h=6s2h2d9h 9c4c5h8h QhAs8d3h Kc7c5c5d JdAcQsJh QcTd4s3c ThAd5s6c",
      Solver.process("omaha-holdem 7h9dJcKsQd ThAd5s6c Kc7c5c5d QcTd4s3c QhAs8d3h 9c4c5h8h JdAcQsJh 2s4d9s6h 6s2h2d9h"));
  }

  @Test
  public void test_omaha_holdem_3471_2c3h6d8dKd_Qh9s8s4h_3c4cAc9c_6sJhAhJs_7h7d5h9h_6hQs2dKc() {
    assertEquals(
      "3c4cAc9c 7h7d5h9h Qh9s8s4h 6sJhAhJs 6hQs2dKc",
      Solver.process("omaha-holdem 2c3h6d8dKd Qh9s8s4h 3c4cAc9c 6sJhAhJs 7h7d5h9h 6hQs2dKc"));
  }

  @Test
  public void test_omaha_holdem_3472_3s5s6cJcKd_2dTsAc4d_7h5cKh9d_Qd4sJh8h_9cQh7sJd_Kc6h2hTc() {
    assertEquals(
      "9cQh7sJd=Qd4sJh8h 7h5cKh9d Kc6h2hTc 2dTsAc4d",
      Solver.process("omaha-holdem 3s5s6cJcKd 2dTsAc4d 7h5cKh9d Qd4sJh8h 9cQh7sJd Kc6h2hTc"));
  }

  @Test
  public void test_omaha_holdem_3473_3h5s6dAdJs_Kd7sAcTc_8s5h4c8h_QcAs7h4d() {
    assertEquals(
      "8s5h4c8h Kd7sAcTc QcAs7h4d",
      Solver.process("omaha-holdem 3h5s6dAdJs Kd7sAcTc 8s5h4c8h QcAs7h4d"));
  }

  @Test
  public void test_omaha_holdem_3474_2c6c6s7s9c_8d9sJdQc_3c3h5sKh_JsQdQsKs_6h7c4hAc_3s4d2d8h_4c2s9hQh_7hJh3dTh_2h8sAs5c_9dJcKdTd() {
    assertEquals(
      "3s4d2d8h 3c3h5sKh 7hJh3dTh 4c2s9hQh=8d9sJdQc 9dJcKdTd JsQdQsKs 2h8sAs5c 6h7c4hAc",
      Solver.process("omaha-holdem 2c6c6s7s9c 8d9sJdQc 3c3h5sKh JsQdQsKs 6h7c4hAc 3s4d2d8h 4c2s9hQh 7hJh3dTh 2h8sAs5c 9dJcKdTd"));
  }

  @Test
  public void test_omaha_holdem_3475_7cJcKhQdQh_QcTcTdKc_4h6cJd2d_AsAh9hTh() {
    assertEquals(
      "4h6cJd2d AsAh9hTh QcTcTdKc",
      Solver.process("omaha-holdem 7cJcKhQdQh QcTcTdKc 4h6cJd2d AsAh9hTh"));
  }

  @Test
  public void test_omaha_holdem_3476_2h3s6s9cKd_4h6h3c5d_Ts5h6dAs_5s7hKc7c() {
    assertEquals(
      "Ts5h6dAs 5s7hKc7c 4h6h3c5d",
      Solver.process("omaha-holdem 2h3s6s9cKd 4h6h3c5d Ts5h6dAs 5s7hKc7c"));
  }

  @Test
  public void test_omaha_holdem_3477_2d2h2s6sKh_Th6d7c4h_7d8dKsKd_Ah4sQc6c_AcJh7s4c() {
    assertEquals(
      "Th6d7c4h AcJh7s4c Ah4sQc6c 7d8dKsKd",
      Solver.process("omaha-holdem 2d2h2s6sKh Th6d7c4h 7d8dKsKd Ah4sQc6c AcJh7s4c"));
  }

  @Test
  public void test_omaha_holdem_3478_6d7h8cAhQd_TdTsTc8h_9c5c5d3c_4s7d9s4c_Jc2dQh7s_9dKh2c5s_Jh5hKs4h_4d8s6cAd_JdAcKdJs() {
    assertEquals(
      "4s7d9s4c TdTsTc8h JdAcKdJs Jc2dQh7s 4d8s6cAd Jh5hKs4h 9c5c5d3c=9dKh2c5s",
      Solver.process("omaha-holdem 6d7h8cAhQd TdTsTc8h 9c5c5d3c 4s7d9s4c Jc2dQh7s 9dKh2c5s Jh5hKs4h 4d8s6cAd JdAcKdJs"));
  }

  @Test
  public void test_omaha_holdem_3479_4s5h9h9sQc_Jc2c2s8h_3hKh4hJd_3sAc7hAh_Kc8d2dAd_7c7sQdQh_Kd5c3dTs_5d7d4cAs() {
    assertEquals(
      "Kc8d2dAd Jc2c2s8h 3hKh4hJd Kd5c3dTs 5d7d4cAs 3sAc7hAh 7c7sQdQh",
      Solver.process("omaha-holdem 4s5h9h9sQc Jc2c2s8h 3hKh4hJd 3sAc7hAh Kc8d2dAd 7c7sQdQh Kd5c3dTs 5d7d4cAs"));
  }

  @Test
  public void test_omaha_holdem_3480_4h7hJcJdKc_7c9cTdJs_2s5d9dAc_QhAd8hTh_4d6cAh7s_Qs9hKh3d() {
    assertEquals(
      "2s5d9dAc QhAd8hTh 4d6cAh7s Qs9hKh3d 7c9cTdJs",
      Solver.process("omaha-holdem 4h7hJcJdKc 7c9cTdJs 2s5d9dAc QhAd8hTh 4d6cAh7s Qs9hKh3d"));
  }

  @Test
  public void test_omaha_holdem_3481_6c6s8hJdJh_8dJcQs2d_Js9sTc3h() {
    assertEquals(
      "Js9sTc3h 8dJcQs2d",
      Solver.process("omaha-holdem 6c6s8hJdJh 8dJcQs2d Js9sTc3h"));
  }

  @Test
  public void test_omaha_holdem_3482_4d6c7c8c8h_4cTc4hQh_2h2c8sQc_Kd3h7hKc_AcTh5c7s_QdQs9h7d_3d9s5h2d() {
    assertEquals(
      "QdQs9h7d Kd3h7hKc 3d9s5h2d 2h2c8sQc AcTh5c7s 4cTc4hQh",
      Solver.process("omaha-holdem 4d6c7c8c8h 4cTc4hQh 2h2c8sQc Kd3h7hKc AcTh5c7s QdQs9h7d 3d9s5h2d"));
  }

  @Test
  public void test_omaha_holdem_3483_9c9hAhKdTc_4sAd2d4c_ThTd5hQd_AsQhJs8d_Jc6c9d7d() {
    assertEquals(
      "4sAd2d4c Jc6c9d7d AsQhJs8d ThTd5hQd",
      Solver.process("omaha-holdem 9c9hAhKdTc 4sAd2d4c ThTd5hQd AsQhJs8d Jc6c9d7d"));
  }

  @Test
  public void test_omaha_holdem_3484_4d8s9cAhTs_2c2s7s4c_JdJhTd8d_As2h6h6c_4sQc2dKc_8h5c4hAc_JsJc5sQs_Kd3sAdTh() {
    assertEquals(
      "2c2s7s4c 4sQc2dKc As2h6h6c JdJhTd8d 8h5c4hAc Kd3sAdTh JsJc5sQs",
      Solver.process("omaha-holdem 4d8s9cAhTs 2c2s7s4c JdJhTd8d As2h6h6c 4sQc2dKc 8h5c4hAc JsJc5sQs Kd3sAdTh"));
  }

  @Test
  public void test_omaha_holdem_3485_3s5c6h7dAc_Ad3d9d9c_As8hQc5d() {
    assertEquals(
      "Ad3d9d9c As8hQc5d",
      Solver.process("omaha-holdem 3s5c6h7dAc Ad3d9d9c As8hQc5d"));
  }

  @Test
  public void test_omaha_holdem_3486_4d6c6sAsKh_7dQh9dJh_4s6h5dAd_7s8sTc2d_8c5cKs5s_Th7h4h2s_2h3h9s3c_KdAhJd7c_AcKcTsTd_Qs8d6d9h() {
    assertEquals(
      "7s8sTc2d 7dQh9dJh 2h3h9s3c Th7h4h2s 8c5cKs5s AcKcTsTd=KdAhJd7c Qs8d6d9h 4s6h5dAd",
      Solver.process("omaha-holdem 4d6c6sAsKh 7dQh9dJh 4s6h5dAd 7s8sTc2d 8c5cKs5s Th7h4h2s 2h3h9s3c KdAhJd7c AcKcTsTd Qs8d6d9h"));
  }

  @Test
  public void test_omaha_holdem_3487_3h6d6hAcQd_Ts8d6s4c_Kc4d8cKd_7d5s2cTd_Jd9c9dTh_7h9h3dAs_8s7s3cTc() {
    assertEquals(
      "7d5s2cTd 8s7s3cTc Jd9c9dTh Kc4d8cKd 7h9h3dAs Ts8d6s4c",
      Solver.process("omaha-holdem 3h6d6hAcQd Ts8d6s4c Kc4d8cKd 7d5s2cTd Jd9c9dTh 7h9h3dAs 8s7s3cTc"));
  }

  @Test
  public void test_omaha_holdem_3488_9sJcJdKdTd_3dTcQc4s_8dAh5d5c() {
    assertEquals(
      "3dTcQc4s 8dAh5d5c",
      Solver.process("omaha-holdem 9sJcJdKdTd 3dTcQc4s 8dAh5d5c"));
  }

  @Test
  public void test_omaha_holdem_3489_2h4d8dAsQc_Jh3dKd4c_3hTc6c7h_4s6d9sAd_7s9d9h8s_Jc4h5cAh() {
    assertEquals(
      "3hTc6c7h Jh3dKd4c 7s9d9h8s 4s6d9sAd=Jc4h5cAh",
      Solver.process("omaha-holdem 2h4d8dAsQc Jh3dKd4c 3hTc6c7h 4s6d9sAd 7s9d9h8s Jc4h5cAh"));
  }

  @Test
  public void test_omaha_holdem_3490_2c7dAhQcTc_3d8dJsKd_Td4hQs2h_9s3c3hKc() {
    assertEquals(
      "Td4hQs2h 3d8dJsKd 9s3c3hKc",
      Solver.process("omaha-holdem 2c7dAhQcTc 3d8dJsKd Td4hQs2h 9s3c3hKc"));
  }

  @Test
  public void test_omaha_holdem_3491_7d7sAdJdJs_8h3h7c9d_TsQsTc8c_4h5d4c2h_6d9s6h5h() {
    assertEquals(
      "4h5d4c2h 6d9s6h5h TsQsTc8c 8h3h7c9d",
      Solver.process("omaha-holdem 7d7sAdJdJs 8h3h7c9d TsQsTc8c 4h5d4c2h 6d9s6h5h"));
  }

  @Test
  public void test_omaha_holdem_3492_2d4d5c9sTs_Ad7sTd4h_9c7hJc2h_8d7d8s6h_Tc5d6s6c() {
    assertEquals(
      "8d7d8s6h 9c7hJc2h Ad7sTd4h Tc5d6s6c",
      Solver.process("omaha-holdem 2d4d5c9sTs Ad7sTd4h 9c7hJc2h 8d7d8s6h Tc5d6s6c"));
  }

  @Test
  public void test_omaha_holdem_3493_4c5d5h6c7h_KdQs4d3d_3cAc9hTc_8sAs2s7s() {
    assertEquals(
      "3cAc9hTc KdQs4d3d 8sAs2s7s",
      Solver.process("omaha-holdem 4c5d5h6c7h KdQs4d3d 3cAc9hTc 8sAs2s7s"));
  }

  @Test
  public void test_omaha_holdem_3494_3d3s6dKcQd_Ks7sKh4c_5sQh5cQc_ThAsJsJc_9sQs3hAh_4d2c6h2h_4hAd9d4s_6c3c9cJd() {
    assertEquals(
      "4d2c6h2h ThAsJsJc 4hAd9d4s 6c3c9cJd 9sQs3hAh 5sQh5cQc Ks7sKh4c",
      Solver.process("omaha-holdem 3d3s6dKcQd Ks7sKh4c 5sQh5cQc ThAsJsJc 9sQs3hAh 4d2c6h2h 4hAd9d4s 6c3c9cJd"));
  }

  @Test
  public void test_omaha_holdem_3495_2d6h6s8cKh_As5h5sTs_9h2h8h2c_Ah6d7dTc_3cJsQcQd() {
    assertEquals(
      "As5h5sTs 3cJsQcQd Ah6d7dTc 9h2h8h2c",
      Solver.process("omaha-holdem 2d6h6s8cKh As5h5sTs 9h2h8h2c Ah6d7dTc 3cJsQcQd"));
  }

  @Test
  public void test_omaha_holdem_3496_3s4s5s9hTs_9dJd8s9s_5c6cQh2h_Jh8d3hKh_KdTcQdAh_Kc4d3d4c_5d4h7cKs_6sJc7hTh_Qc2cQs7s() {
    assertEquals(
      "Jh8d3hKh KdTcQdAh 5d4h7cKs Kc4d3d4c 5c6cQh2h 6sJc7hTh 9dJd8s9s Qc2cQs7s",
      Solver.process("omaha-holdem 3s4s5s9hTs 9dJd8s9s 5c6cQh2h Jh8d3hKh KdTcQdAh Kc4d3d4c 5d4h7cKs 6sJc7hTh Qc2cQs7s"));
  }

  @Test
  public void test_omaha_holdem_3497_9sJdJhJsKh_2sKc5cAc_QhTcTs8s_7c5h7s3d_Th9c3s3c() {
    assertEquals(
      "2sKc5cAc Th9c3s3c 7c5h7s3d QhTcTs8s",
      Solver.process("omaha-holdem 9sJdJhJsKh 2sKc5cAc QhTcTs8s 7c5h7s3d Th9c3s3c"));
  }

  @Test
  public void test_omaha_holdem_3498_4d9cKcQsTh_3hAsJc5d_Ah5hJdTc_Ac4c8h2s_3s6cKdKh_6h9s6d5c() {
    assertEquals(
      "Ac4c8h2s 6h9s6d5c 3s6cKdKh 3hAsJc5d=Ah5hJdTc",
      Solver.process("omaha-holdem 4d9cKcQsTh 3hAsJc5d Ah5hJdTc Ac4c8h2s 3s6cKdKh 6h9s6d5c"));
  }

  @Test
  public void test_omaha_holdem_3499_3s6d7sAdQh_2c9c9hTh_8h8s5c5s_3d4dJc6s_TsJs6hAh_2dQd5hKs_2s4c9sAs_Jd6c7d8d() {
    assertEquals(
      "8h8s5c5s 2c9c9hTh 2dQd5hKs 2s4c9sAs 3d4dJc6s Jd6c7d8d TsJs6hAh",
      Solver.process("omaha-holdem 3s6d7sAdQh 2c9c9hTh 8h8s5c5s 3d4dJc6s TsJs6hAh 2dQd5hKs 2s4c9sAs Jd6c7d8d"));
  }

}
