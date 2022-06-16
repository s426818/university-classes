
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TexasHoldemSolver13HiddenTest {


  @Test
  public void test_texas_holdem_3250_6c9dJdJhTd_9s3s_3dAc_JsKd_8d7h_2c3h_4s4h_7sAh_6hQs_2d5h() {
    assertEquals(
      "2c3h=2d5h 3dAc=7sAh 4s4h 6hQs 9s3s JsKd 8d7h",
      Solver.process("texas-holdem 6c9dJdJhTd 9s3s 3dAc JsKd 8d7h 2c3h 4s4h 7sAh 6hQs 2d5h"));
  }

  @Test
  public void test_texas_holdem_3251_2s7h9c9hQc_7s5c_5d3h_Kd9s_9d8d_KsAh_QdQs() {
    assertEquals(
      "5d3h KsAh 7s5c 9d8d Kd9s QdQs",
      Solver.process("texas-holdem 2s7h9c9hQc 7s5c 5d3h Kd9s 9d8d KsAh QdQs"));
  }

  @Test
  public void test_texas_holdem_3252_2hJhJsQcTs_4s8s_8c8h() {
    assertEquals(
      "4s8s 8c8h",
      Solver.process("texas-holdem 2hJhJsQcTs 4s8s 8c8h"));
  }

  @Test
  public void test_texas_holdem_3253_2d4d5cKcKd_Js3s_4cJc_6h2c_9c9h_7sAc_2sAh_7c6d() {
    assertEquals(
      "7c6d Js3s 7sAc 6h2c 2sAh 4cJc 9c9h",
      Solver.process("texas-holdem 2d4d5cKcKd Js3s 4cJc 6h2c 9c9h 7sAc 2sAh 7c6d"));
  }

  @Test
  public void test_texas_holdem_3254_2c5s9dQhTs_7s3h_Td9c_6d9h_Qd5c_5d6s() {
    assertEquals(
      "7s3h 5d6s 6d9h Td9c Qd5c",
      Solver.process("texas-holdem 2c5s9dQhTs 7s3h Td9c 6d9h Qd5c 5d6s"));
  }

  @Test
  public void test_texas_holdem_3255_3c3h6s7s8c_4s5s_3s4c_9d8d() {
    assertEquals(
      "9d8d 3s4c 4s5s",
      Solver.process("texas-holdem 3c3h6s7s8c 4s5s 3s4c 9d8d"));
  }

  @Test
  public void test_texas_holdem_3256_3c8c9c9dJd_Kh4s_Jc2d_2cKs_Tc5c_6sQd_8sTd_2s3d() {
    assertEquals(
      "6sQd 2cKs=Kh4s 2s3d 8sTd Jc2d Tc5c",
      Solver.process("texas-holdem 3c8c9c9dJd Kh4s Jc2d 2cKs Tc5c 6sQd 8sTd 2s3d"));
  }

  @Test
  public void test_texas_holdem_3257_5d5h6s8dTc_9c5c_9d9s_8cAh() {
    assertEquals(
      "8cAh 9d9s 9c5c",
      Solver.process("texas-holdem 5d5h6s8dTc 9c5c 9d9s 8cAh"));
  }

  @Test
  public void test_texas_holdem_3258_7c8c8h9hJh_KdQh_4hTc() {
    assertEquals(
      "KdQh 4hTc",
      Solver.process("texas-holdem 7c8c8h9hJh KdQh 4hTc"));
  }

  @Test
  public void test_texas_holdem_3259_3s5s9dJsTc_Jd2c_TdTh_9hAh() {
    assertEquals(
      "9hAh Jd2c TdTh",
      Solver.process("texas-holdem 3s5s9dJsTc Jd2c TdTh 9hAh"));
  }

  @Test
  public void test_texas_holdem_3260_3sJsKsQcQd_9c4d_KhTh_TdKd_4c5c_2c2d_Ah5s_3h8d_8cTc_9s7d() {
    assertEquals(
      "4c5c 9c4d=9s7d 8cTc Ah5s 2c2d 3h8d KhTh=TdKd",
      Solver.process("texas-holdem 3sJsKsQcQd 9c4d KhTh TdKd 4c5c 2c2d Ah5s 3h8d 8cTc 9s7d"));
  }

  @Test
  public void test_texas_holdem_3261_2s3s7c7hJc_Ah4d_5dTh_9h5s_2h4h_8c5h_6c6h_4c3h_QsQd() {
    assertEquals(
      "8c5h 9h5s 5dTh Ah4d 2h4h 4c3h 6c6h QsQd",
      Solver.process("texas-holdem 2s3s7c7hJc Ah4d 5dTh 9h5s 2h4h 8c5h 6c6h 4c3h QsQd"));
  }

  @Test
  public void test_texas_holdem_3262_2d2hJhQsTd_Qh8s_6c5d_Js9c_6h9h_Ad5s_4sKs() {
    assertEquals(
      "6c5d=6h9h 4sKs Ad5s Js9c Qh8s",
      Solver.process("texas-holdem 2d2hJhQsTd Qh8s 6c5d Js9c 6h9h Ad5s 4sKs"));
  }

  @Test
  public void test_texas_holdem_3263_3c7c8cAsQh_7h5d_JsAh_9s5c_8sQd_6s8d() {
    assertEquals(
      "9s5c 7h5d 6s8d JsAh 8sQd",
      Solver.process("texas-holdem 3c7c8cAsQh 7h5d JsAh 9s5c 8sQd 6s8d"));
  }

  @Test
  public void test_texas_holdem_3264_4c6hKdTdTs_7sJh_AsJs_Ad2d_5cKc_3h8s() {
    assertEquals(
      "3h8s 7sJh Ad2d AsJs 5cKc",
      Solver.process("texas-holdem 4c6hKdTdTs 7sJh AsJs Ad2d 5cKc 3h8s"));
  }

  @Test
  public void test_texas_holdem_3265_6d8cJcJdTh_4d9d_3c2h() {
    assertEquals(
      "3c2h 4d9d",
      Solver.process("texas-holdem 6d8cJcJdTh 4d9d 3c2h"));
  }

  @Test
  public void test_texas_holdem_3266_3c5d6cKdQd_Jd4h_Qc2s_KhAs_QsTc_4c9d_3sJc_8s3d_3h8h_4s9c() {
    assertEquals(
      "4c9d=4s9c Jd4h 3h8h=8s3d 3sJc Qc2s QsTc KhAs",
      Solver.process("texas-holdem 3c5d6cKdQd Jd4h Qc2s KhAs QsTc 4c9d 3sJc 8s3d 3h8h 4s9c"));
  }

  @Test
  public void test_texas_holdem_3267_3cJdKcQcTd_QsQd_3sKs() {
    assertEquals(
      "3sKs QsQd",
      Solver.process("texas-holdem 3cJdKcQcTd QsQd 3sKs"));
  }

  @Test
  public void test_texas_holdem_3268_2d5h7d9dQd_6c8d_7c3d_Th3s_Tc4s_Kd7h_8c8h_AsTs_9hAh_6sTd() {
    assertEquals(
      "Tc4s=Th3s AsTs 8c8h 9hAh 7c3d 6c8d 6sTd Kd7h",
      Solver.process("texas-holdem 2d5h7d9dQd 6c8d 7c3d Th3s Tc4s Kd7h 8c8h AsTs 9hAh 6sTd"));
  }

  @Test
  public void test_texas_holdem_3269_5d7cJsKdQh_2h4d_QcJc() {
    assertEquals(
      "2h4d QcJc",
      Solver.process("texas-holdem 5d7cJsKdQh 2h4d QcJc"));
  }

  @Test
  public void test_texas_holdem_3270_5h5sJcJdKd_Jh5d_9c6h_8s2c_6d2d_9s6s_2h4h_9h8h_Tc4s() {
    assertEquals(
      "2h4h=6d2d=8s2c=9c6h=9h8h=9s6s=Tc4s Jh5d",
      Solver.process("texas-holdem 5h5sJcJdKd Jh5d 9c6h 8s2c 6d2d 9s6s 2h4h 9h8h Tc4s"));
  }

  @Test
  public void test_texas_holdem_3271_3s7h8cAdJs_Kh3d_Jh8h_8dTd_5h7d_AcKs_Jd9c_3h4c() {
    assertEquals(
      "3h4c Kh3d 5h7d 8dTd Jd9c AcKs Jh8h",
      Solver.process("texas-holdem 3s7h8cAdJs Kh3d Jh8h 8dTd 5h7d AcKs Jd9c 3h4c"));
  }

  @Test
  public void test_texas_holdem_3272_3s4dJdTcTs_8dTd_Qd8h_Qc2d_QhJh_8s6s_7c5h_6c3h_Kh5c_AdAc() {
    assertEquals(
      "7c5h 8s6s Qc2d Qd8h Kh5c 6c3h QhJh AdAc 8dTd",
      Solver.process("texas-holdem 3s4dJdTcTs 8dTd Qd8h Qc2d QhJh 8s6s 7c5h 6c3h Kh5c AdAc"));
  }

  @Test
  public void test_texas_holdem_3273_2c3d7c8d9s_2h4d_TdJh() {
    assertEquals(
      "2h4d TdJh",
      Solver.process("texas-holdem 2c3d7c8d9s 2h4d TdJh"));
  }

  @Test
  public void test_texas_holdem_3274_8h9sJcKcQc_2c5c_Qh2d_9c7c_2hKh_AsAd_2s6d_Ah7s() {
    assertEquals(
      "2s6d Ah7s Qh2d 2hKh AsAd 2c5c 9c7c",
      Solver.process("texas-holdem 8h9sJcKcQc 2c5c Qh2d 9c7c 2hKh AsAd 2s6d Ah7s"));
  }

  @Test
  public void test_texas_holdem_3275_2h3h7hKdQc_Kh6h_9s8d_8s4c() {
    assertEquals(
      "8s4c 9s8d Kh6h",
      Solver.process("texas-holdem 2h3h7hKdQc Kh6h 9s8d 8s4c"));
  }

  @Test
  public void test_texas_holdem_3276_4h5s7s8sAc_2s5d_Jc5c_Td8h_Qh7h_2cAh() {
    assertEquals(
      "2s5d Jc5c Qh7h Td8h 2cAh",
      Solver.process("texas-holdem 4h5s7s8sAc 2s5d Jc5c Td8h Qh7h 2cAh"));
  }

  @Test
  public void test_texas_holdem_3277_3d4s7c8dQs_3cJd_Th2d() {
    assertEquals(
      "Th2d 3cJd",
      Solver.process("texas-holdem 3d4s7c8dQs 3cJd Th2d"));
  }

  @Test
  public void test_texas_holdem_3278_3s4h5s6d8s_KdTh_3d8d_8h9s_Js2d() {
    assertEquals(
      "KdTh 8h9s 3d8d Js2d",
      Solver.process("texas-holdem 3s4h5s6d8s KdTh 3d8d 8h9s Js2d"));
  }

  @Test
  public void test_texas_holdem_3279_2h2s4c8cQd_Th3d_8s3h_5dAs_Jc9c_5s9h_4sAc_Qc5h_4h2d_Ah7h() {
    assertEquals(
      "5s9h Th3d Jc9c 5dAs=Ah7h 4sAc 8s3h Qc5h 4h2d",
      Solver.process("texas-holdem 2h2s4c8cQd Th3d 8s3h 5dAs Jc9c 5s9h 4sAc Qc5h 4h2d Ah7h"));
  }

  @Test
  public void test_texas_holdem_3280_6cAcAdJcKs_7s5h_5s4h() {
    assertEquals(
      "5s4h 7s5h",
      Solver.process("texas-holdem 6cAcAdJcKs 7s5h 5s4h"));
  }

  @Test
  public void test_texas_holdem_3281_2d2s3d3sTh_9c8d_7d6c_8c6h_3h5s() {
    assertEquals(
      "7d6c=8c6h=9c8d 3h5s",
      Solver.process("texas-holdem 2d2s3d3sTh 9c8d 7d6c 8c6h 3h5s"));
  }

  @Test
  public void test_texas_holdem_3282_3d7h9d9hAh_Kh6h_6sJc() {
    assertEquals(
      "6sJc Kh6h",
      Solver.process("texas-holdem 3d7h9d9hAh Kh6h 6sJc"));
  }

  @Test
  public void test_texas_holdem_3283_2d4c4h5hQd_4d8h_Kc6h_Qc9d_Qs7s_9c8d_7h4s_5dQh() {
    assertEquals(
      "9c8d Kc6h Qs7s Qc9d 5dQh 7h4s 4d8h",
      Solver.process("texas-holdem 2d4c4h5hQd 4d8h Kc6h Qc9d Qs7s 9c8d 7h4s 5dQh"));
  }

  @Test
  public void test_texas_holdem_3284_2c5c6s9sQh_2d9h_4d4s() {
    assertEquals(
      "4d4s 2d9h",
      Solver.process("texas-holdem 2c5c6s9sQh 2d9h 4d4s"));
  }

  @Test
  public void test_texas_holdem_3285_4c8s9sAdKc_AcQh_7c8h() {
    assertEquals(
      "7c8h AcQh",
      Solver.process("texas-holdem 4c8s9sAdKc AcQh 7c8h"));
  }

  @Test
  public void test_texas_holdem_3286_5c8sAhKsQh_As3d_3h4h_Tc9s() {
    assertEquals(
      "3h4h Tc9s As3d",
      Solver.process("texas-holdem 5c8sAhKsQh As3d 3h4h Tc9s"));
  }

  @Test
  public void test_texas_holdem_3287_2c2d3cAcJd_9s3s_KhAd_6hAs() {
    assertEquals(
      "9s3s 6hAs KhAd",
      Solver.process("texas-holdem 2c2d3cAcJd 9s3s KhAd 6hAs"));
  }

  @Test
  public void test_texas_holdem_3288_2c4s9cJcKh_Jh4c_Qc4d_JsAd_3c6h_Kd8h_QsAc_2h8c_5s9h() {
    assertEquals(
      "3c6h QsAc 2h8c Qc4d 5s9h JsAd Kd8h Jh4c",
      Solver.process("texas-holdem 2c4s9cJcKh Jh4c Qc4d JsAd 3c6h Kd8h QsAc 2h8c 5s9h"));
  }

  @Test
  public void test_texas_holdem_3289_5h5s9cAdQh_AhQc_3s7d_Kh8h_9h2s_TdKd() {
    assertEquals(
      "3s7d Kh8h=TdKd 9h2s AhQc",
      Solver.process("texas-holdem 5h5s9cAdQh AhQc 3s7d Kh8h 9h2s TdKd"));
  }

  @Test
  public void test_texas_holdem_3290_3d3s4s7hQh_Kd6d_Js2d_2s3h_Kh5c_Ks5d_8s7s_JhAs() {
    assertEquals(
      "Js2d Kd6d=Kh5c=Ks5d JhAs 8s7s 2s3h",
      Solver.process("texas-holdem 3d3s4s7hQh Kd6d Js2d 2s3h Kh5c Ks5d 8s7s JhAs"));
  }

  @Test
  public void test_texas_holdem_3291_2s4c5h6dQc_TcAs_Qh3h_6s9h_JcKs_5s9s_Ts4h_9dTd_2hTh_8sJd() {
    assertEquals(
      "9dTd 8sJd JcKs TcAs 2hTh Ts4h 5s9s 6s9h Qh3h",
      Solver.process("texas-holdem 2s4c5h6dQc TcAs Qh3h 6s9h JcKs 5s9s Ts4h 9dTd 2hTh 8sJd"));
  }

  @Test
  public void test_texas_holdem_3292_4d6sKdKhQs_6hAc_Jc6d_8sJs_Td9c() {
    assertEquals(
      "Td9c 8sJs Jc6d 6hAc",
      Solver.process("texas-holdem 4d6sKdKhQs 6hAc Jc6d 8sJs Td9c"));
  }

  @Test
  public void test_texas_holdem_3293_2h5c6c8sKh_7hTd_7sKd_2sTc_Ts9d() {
    assertEquals(
      "7hTd Ts9d 2sTc 7sKd",
      Solver.process("texas-holdem 2h5c6c8sKh 7hTd 7sKd 2sTc Ts9d"));
  }

  @Test
  public void test_texas_holdem_3294_2s4sKcTcTs_JdAc_6s8h_Jc9d() {
    assertEquals(
      "6s8h Jc9d JdAc",
      Solver.process("texas-holdem 2s4sKcTcTs JdAc 6s8h Jc9d"));
  }

  @Test
  public void test_texas_holdem_3295_2d4c5dKdTh_4hQd_7c9c_6sQc_Ad6d_5cTs_9sAh_8d5h() {
    assertEquals(
      "7c9c 6sQc 9sAh 4hQd 8d5h 5cTs Ad6d",
      Solver.process("texas-holdem 2d4c5dKdTh 4hQd 7c9c 6sQc Ad6d 5cTs 9sAh 8d5h"));
  }

  @Test
  public void test_texas_holdem_3296_4s6cJcQdQh_AsQs_Ac8c() {
    assertEquals(
      "Ac8c AsQs",
      Solver.process("texas-holdem 4s6cJcQdQh AsQs Ac8c"));
  }

  @Test
  public void test_texas_holdem_3297_4cAsQhQsTc_8cAh_2dQc() {
    assertEquals(
      "8cAh 2dQc",
      Solver.process("texas-holdem 4cAsQhQsTc 8cAh 2dQc"));
  }

  @Test
  public void test_texas_holdem_3298_3s8h9cAsTd_4h8d_7c6s_Qc2d() {
    assertEquals(
      "Qc2d 4h8d 7c6s",
      Solver.process("texas-holdem 3s8h9cAsTd 4h8d 7c6s Qc2d"));
  }

  @Test
  public void test_texas_holdem_3299_2d3c6s9cTh_QdAs_2c6c_Jc9h_3h7c_5sTs_7s5c_TcKh_4c8d_Ad9s() {
    assertEquals(
      "7s5c 4c8d QdAs 3h7c Jc9h Ad9s 5sTs TcKh 2c6c",
      Solver.process("texas-holdem 2d3c6s9cTh QdAs 2c6c Jc9h 3h7c 5sTs 7s5c TcKh 4c8d Ad9s"));
  }

  @Test
  public void test_texas_holdem_3300_2c5c5s9dKc_4d9c_8hTh_Td7d_8dKs() {
    assertEquals(
      "8hTh=Td7d 4d9c 8dKs",
      Solver.process("texas-holdem 2c5c5s9dKc 4d9c 8hTh Td7d 8dKs"));
  }

  @Test
  public void test_texas_holdem_3301_4d4s8dAdKh_ThKc_Js9d_3s4c_5s7h_5cAh() {
    assertEquals(
      "5s7h Js9d ThKc 5cAh 3s4c",
      Solver.process("texas-holdem 4d4s8dAdKh ThKc Js9d 3s4c 5s7h 5cAh"));
  }

  @Test
  public void test_texas_holdem_3302_2d4s6cKhTd_9dJh_JdAc_Qc6d_8c3s_6s5d_9c2h_Kc8d_4h2s() {
    assertEquals(
      "8c3s 9dJh JdAc 9c2h 6s5d Qc6d Kc8d 4h2s",
      Solver.process("texas-holdem 2d4s6cKhTd 9dJh JdAc Qc6d 8c3s 6s5d 9c2h Kc8d 4h2s"));
  }

  @Test
  public void test_texas_holdem_3303_2s5h6d6hKc_Kd9c_9s6c_5dTs_2c8c() {
    assertEquals(
      "2c8c 5dTs Kd9c 9s6c",
      Solver.process("texas-holdem 2s5h6d6hKc Kd9c 9s6c 5dTs 2c8c"));
  }

  @Test
  public void test_texas_holdem_3304_2d5s9cJsQd_8cTd_4dAs_5d6h_Ks3c() {
    assertEquals(
      "Ks3c 4dAs 5d6h 8cTd",
      Solver.process("texas-holdem 2d5s9cJsQd 8cTd 4dAs 5d6h Ks3c"));
  }

  @Test
  public void test_texas_holdem_3305_5h8c8hAdJs_4h5s_4cQh_6c5d() {
    assertEquals(
      "4cQh 4h5s=6c5d",
      Solver.process("texas-holdem 5h8c8hAdJs 4h5s 4cQh 6c5d"));
  }

  @Test
  public void test_texas_holdem_3306_2s5sAhKdTc_3s2d_6d8c_9sTd_Qh9h_4h8s_KcTh_Ac7d_4d7s() {
    assertEquals(
      "4d7s 4h8s 6d8c Qh9h 3s2d 9sTd Ac7d KcTh",
      Solver.process("texas-holdem 2s5sAhKdTc 3s2d 6d8c 9sTd Qh9h 4h8s KcTh Ac7d 4d7s"));
  }

  @Test
  public void test_texas_holdem_3307_2s3d4c8sTh_9s7d_4d4h_5sJc_7cAc_3hKh() {
    assertEquals(
      "9s7d 5sJc 7cAc 3hKh 4d4h",
      Solver.process("texas-holdem 2s3d4c8sTh 9s7d 4d4h 5sJc 7cAc 3hKh"));
  }

  @Test
  public void test_texas_holdem_3308_2d4s5s7dQc_9dTc_Qs7c() {
    assertEquals(
      "9dTc Qs7c",
      Solver.process("texas-holdem 2d4s5s7dQc 9dTc Qs7c"));
  }

  @Test
  public void test_texas_holdem_3309_3c3h8s9hJd_2d2s_Ah7s_8h9d_TcAc_7c8c_TsKd_Qc9s() {
    assertEquals(
      "TsKd Ah7s TcAc 2d2s 7c8c Qc9s 8h9d",
      Solver.process("texas-holdem 3c3h8s9hJd 2d2s Ah7s 8h9d TcAc 7c8c TsKd Qc9s"));
  }

  @Test
  public void test_texas_holdem_3310_3h4cJsKcKs_4d2s_5c4s_Qc5s_KhTd_Ad7d_As6h_AcTc() {
    assertEquals(
      "Qc5s As6h Ad7d AcTc 4d2s=5c4s KhTd",
      Solver.process("texas-holdem 3h4cJsKcKs 4d2s 5c4s Qc5s KhTd Ad7d As6h AcTc"));
  }

  @Test
  public void test_texas_holdem_3311_2s6sJhQcQs_ThJs_7c8s_Qh5h_7h5c_As9s() {
    assertEquals(
      "7h5c 7c8s ThJs Qh5h As9s",
      Solver.process("texas-holdem 2s6sJhQcQs ThJs 7c8s Qh5h 7h5c As9s"));
  }

  @Test
  public void test_texas_holdem_3312_2h3h8dJcQd_5c8c_As3c_Th3d_6h4s_5sQc_Qh6d_Js2c_6s7s_7d9h() {
    assertEquals(
      "6h4s 6s7s 7d9h Th3d As3c 5c8c 5sQc Qh6d Js2c",
      Solver.process("texas-holdem 2h3h8dJcQd 5c8c As3c Th3d 6h4s 5sQc Qh6d Js2c 6s7s 7d9h"));
  }

  @Test
  public void test_texas_holdem_3313_3c3s7c7sKh_2c5s_Ad6h_Th7h_5c2d_TdQs() {
    assertEquals(
      "2c5s=5c2d=TdQs Ad6h Th7h",
      Solver.process("texas-holdem 3c3s7c7sKh 2c5s Ad6h Th7h 5c2d TdQs"));
  }

  @Test
  public void test_texas_holdem_3314_6h8h9sKhTs_5dQh_4d2d_Th4c_2sJh_Qd8c_6s5h_3d2h_Ad5s() {
    assertEquals(
      "3d2h=4d2d 2sJh 5dQh Ad5s 6s5h Qd8c Th4c",
      Solver.process("texas-holdem 6h8h9sKhTs 5dQh 4d2d Th4c 2sJh Qd8c 6s5h 3d2h Ad5s"));
  }

  @Test
  public void test_texas_holdem_3315_3cAcJdKhQc_Qh4c_Kc8c_9h5s_Ks4h_8dAs_4s8s() {
    assertEquals(
      "4s8s 9h5s Qh4c Ks4h 8dAs Kc8c",
      Solver.process("texas-holdem 3cAcJdKhQc Qh4c Kc8c 9h5s Ks4h 8dAs 4s8s"));
  }

  @Test
  public void test_texas_holdem_3316_2d4d6h7h8h_5hJc_4c5c_AhTs_KhQs_2sAs() {
    assertEquals(
      "KhQs AhTs 2sAs 4c5c=5hJc",
      Solver.process("texas-holdem 2d4d6h7h8h 5hJc 4c5c AhTs KhQs 2sAs"));
  }

  @Test
  public void test_texas_holdem_3317_2s3s6dKhTs_8dAc_6h7s_Qs9h_Td3h_6s4s_8cAh_4h7c_5cQc_7dJc() {
    assertEquals(
      "4h7c 7dJc 5cQc Qs9h 8cAh=8dAc 6h7s Td3h 6s4s",
      Solver.process("texas-holdem 2s3s6dKhTs 8dAc 6h7s Qs9h Td3h 6s4s 8cAh 4h7c 5cQc 7dJc"));
  }

  @Test
  public void test_texas_holdem_3318_4d7sJsKcTh_2hQc_4cTd_Jh9s_3d5c() {
    assertEquals(
      "3d5c 2hQc Jh9s 4cTd",
      Solver.process("texas-holdem 4d7sJsKcTh 2hQc 4cTd Jh9s 3d5c"));
  }

  @Test
  public void test_texas_holdem_3319_5c5d6c8sTc_3c8d_Qc2s_6s6h_2d9s_9d7c() {
    assertEquals(
      "2d9s Qc2s 3c8d 9d7c 6s6h",
      Solver.process("texas-holdem 5c5d6c8sTc 3c8d Qc2s 6s6h 2d9s 9d7c"));
  }

  @Test
  public void test_texas_holdem_3320_3d9d9hJsTh_Jc9s_3cJd_5s7c_5c2s_Kh2c() {
    assertEquals(
      "5c2s 5s7c Kh2c 3cJd Jc9s",
      Solver.process("texas-holdem 3d9d9hJsTh Jc9s 3cJd 5s7c 5c2s Kh2c"));
  }

  @Test
  public void test_texas_holdem_3321_6h8h9hAhTc_Jc2c_Kh8c_Ac7s_9d6c_KdKc() {
    assertEquals(
      "Jc2c KdKc 9d6c Ac7s Kh8c",
      Solver.process("texas-holdem 6h8h9hAhTc Jc2c Kh8c Ac7s 9d6c KdKc"));
  }

  @Test
  public void test_texas_holdem_3322_2c2s4hKdTh_6d6c_3dAs() {
    assertEquals(
      "3dAs 6d6c",
      Solver.process("texas-holdem 2c2s4hKdTh 6d6c 3dAs"));
  }

  @Test
  public void test_texas_holdem_3323_3h9sKcKdKh_8h8c_Ah2d_AsTh_9d8s_Ks9h() {
    assertEquals(
      "Ah2d AsTh 8h8c 9d8s Ks9h",
      Solver.process("texas-holdem 3h9sKcKdKh 8h8c Ah2d AsTh 9d8s Ks9h"));
  }

  @Test
  public void test_texas_holdem_3324_3d3s4d6dAd_5sKh_Jh7h_7c4h_Jd5d_Ts6c() {
    assertEquals(
      "Jh7h 5sKh 7c4h Ts6c Jd5d",
      Solver.process("texas-holdem 3d3s4d6dAd 5sKh Jh7h 7c4h Jd5d Ts6c"));
  }

  @Test
  public void test_texas_holdem_3325_6s7dAcQsTd_Tc2s_8h3s_4h5h_2cJs_5s9h_Kh7c_6c4d_5cTs_7h4c() {
    assertEquals(
      "4h5h 8h3s 5s9h 2cJs 6c4d 7h4c Kh7c 5cTs=Tc2s",
      Solver.process("texas-holdem 6s7dAcQsTd Tc2s 8h3s 4h5h 2cJs 5s9h Kh7c 6c4d 5cTs 7h4c"));
  }

  @Test
  public void test_texas_holdem_3326_3h4h8s9hTd_6d3s_KcAd_9s5c_4dJc_Kh7d_3cAs_Qs7c_4sJs_6cQh() {
    assertEquals(
      "6cQh Qs7c Kh7d KcAd 6d3s 3cAs 4dJc=4sJs 9s5c",
      Solver.process("texas-holdem 3h4h8s9hTd 6d3s KcAd 9s5c 4dJc Kh7d 3cAs Qs7c 4sJs 6cQh"));
  }

  @Test
  public void test_texas_holdem_3327_3c6s7cQcQs_4h7h_8c3s_5d2c_Js2h_2d8h_Jc3d() {
    assertEquals(
      "5d2c 2d8h Js2h 8c3s Jc3d 4h7h",
      Solver.process("texas-holdem 3c6s7cQcQs 4h7h 8c3s 5d2c Js2h 2d8h Jc3d"));
  }

  @Test
  public void test_texas_holdem_3328_2c2d6s8d9d_9s9c_3sAh_3hAs_8cJd_4d3d_9h7s_2s5d() {
    assertEquals(
      "3hAs=3sAh 8cJd 9h7s 2s5d 4d3d 9s9c",
      Solver.process("texas-holdem 2c2d6s8d9d 9s9c 3sAh 3hAs 8cJd 4d3d 9h7s 2s5d"));
  }

  @Test
  public void test_texas_holdem_3329_2s3sKsQdQs_6s3c_TsQc() {
    assertEquals(
      "6s3c TsQc",
      Solver.process("texas-holdem 2s3sKsQdQs 6s3c TsQc"));
  }

  @Test
  public void test_texas_holdem_3330_2d3d4dAcKc_7s8h_4c4h_3c5h_Qh8d_QcJd() {
    assertEquals(
      "7s8h Qh8d QcJd 4c4h 3c5h",
      Solver.process("texas-holdem 2d3d4dAcKc 7s8h 4c4h 3c5h Qh8d QcJd"));
  }

  @Test
  public void test_texas_holdem_3331_4s7c8h9sJh_KhAs_2hAc_4c2d() {
    assertEquals(
      "2hAc KhAs 4c2d",
      Solver.process("texas-holdem 4s7c8h9sJh KhAs 2hAc 4c2d"));
  }

  @Test
  public void test_texas_holdem_3332_3s8d8hJsTh_3d5c_4dKs_2cQh_As2d() {
    assertEquals(
      "2cQh 4dKs As2d 3d5c",
      Solver.process("texas-holdem 3s8d8hJsTh 3d5c 4dKs 2cQh As2d"));
  }

  @Test
  public void test_texas_holdem_3333_2c3dAsKsTc_9d7h_QdTs() {
    assertEquals(
      "9d7h QdTs",
      Solver.process("texas-holdem 2c3dAsKsTc 9d7h QdTs"));
  }

  @Test
  public void test_texas_holdem_3334_5h6d8c8hJh_6h9s_TcTd() {
    assertEquals(
      "6h9s TcTd",
      Solver.process("texas-holdem 5h6d8c8hJh 6h9s TcTd"));
  }

  @Test
  public void test_texas_holdem_3335_6d7c7d8cAh_AcQs_JsTd_Ks5d_4d5h_3cAd_2h8s_JhJc_AsQd() {
    assertEquals(
      "JsTd Ks5d 2h8s JhJc 3cAd AcQs=AsQd 4d5h",
      Solver.process("texas-holdem 6d7c7d8cAh AcQs JsTd Ks5d 4d5h 3cAd 2h8s JhJc AsQd"));
  }

  @Test
  public void test_texas_holdem_3336_3h4h7sQhTs_5c3d_Jh5d_QdAd_7dTc() {
    assertEquals(
      "Jh5d 5c3d QdAd 7dTc",
      Solver.process("texas-holdem 3h4h7sQhTs 5c3d Jh5d QdAd 7dTc"));
  }

  @Test
  public void test_texas_holdem_3337_3d4s9cAsKd_Td9s_2h7d_QdQc_3cTs_5hKs_6s2c_Th5s_8d4d_3s2d() {
    assertEquals(
      "6s2c 2h7d Th5s 3s2d 3cTs 8d4d Td9s QdQc 5hKs",
      Solver.process("texas-holdem 3d4s9cAsKd Td9s 2h7d QdQc 3cTs 5hKs 6s2c Th5s 8d4d 3s2d"));
  }

  @Test
  public void test_texas_holdem_3338_4h6d8dJcTh_8h2c_Kc9s_8c9d() {
    assertEquals(
      "Kc9s 8h2c 8c9d",
      Solver.process("texas-holdem 4h6d8dJcTh 8h2c Kc9s 8c9d"));
  }

  @Test
  public void test_texas_holdem_3339_4s6h7s9hKd_6s3h_Qs8d_JdQc_8h4c_3cTh_TcKc_Td9s() {
    assertEquals(
      "3cTh Qs8d JdQc 8h4c 6s3h Td9s TcKc",
      Solver.process("texas-holdem 4s6h7s9hKd 6s3h Qs8d JdQc 8h4c 3cTh TcKc Td9s"));
  }

  @Test
  public void test_texas_holdem_3340_4s5h5sKcKs_Qs3s_AcJh_2d7d_2h4h_Kh7c_9hJc_9c4c() {
    assertEquals(
      "2h4h 2d7d 9c4c 9hJc AcJh Qs3s Kh7c",
      Solver.process("texas-holdem 4s5h5sKcKs Qs3s AcJh 2d7d 2h4h Kh7c 9hJc 9c4c"));
  }

  @Test
  public void test_texas_holdem_3341_2c5s6h7cKd_6c9d_8hJh_Qh6s_KcKh() {
    assertEquals(
      "8hJh 6c9d Qh6s KcKh",
      Solver.process("texas-holdem 2c5s6h7cKd 6c9d 8hJh Qh6s KcKh"));
  }

  @Test
  public void test_texas_holdem_3342_4h8c8h9dJc_6d5c_8s6c() {
    assertEquals(
      "6d5c 8s6c",
      Solver.process("texas-holdem 4h8c8h9dJc 6d5c 8s6c"));
  }

  @Test
  public void test_texas_holdem_3343_3s7c8c9sAc_QsKc_4dKs() {
    assertEquals(
      "4dKs QsKc",
      Solver.process("texas-holdem 3s7c8c9sAc QsKc 4dKs"));
  }

  @Test
  public void test_texas_holdem_3344_2h6c7cAsTh_9s5c_5d5h() {
    assertEquals(
      "9s5c 5d5h",
      Solver.process("texas-holdem 2h6c7cAsTh 9s5c 5d5h"));
  }

  @Test
  public void test_texas_holdem_3345_4d4s5h5sJs_Jc8c_Kc7h_6s3c_Jd2d() {
    assertEquals(
      "6s3c Kc7h Jd2d Jc8c",
      Solver.process("texas-holdem 4d4s5h5sJs Jc8c Kc7h 6s3c Jd2d"));
  }

  @Test
  public void test_texas_holdem_3346_4hAsKsQdQs_QcKh_4s7h_Jh6d_Td6c_9c5s_2h8d_Kd5d() {
    assertEquals(
      "2h8d 9c5s Td6c Jh6d 4s7h Kd5d QcKh",
      Solver.process("texas-holdem 4hAsKsQdQs QcKh 4s7h Jh6d Td6c 9c5s 2h8d Kd5d"));
  }

  @Test
  public void test_texas_holdem_3347_4h9cJcKhQc_3c3h_Kd8s_5hQd_2c6d() {
    assertEquals(
      "2c6d 3c3h 5hQd Kd8s",
      Solver.process("texas-holdem 4h9cJcKhQc 3c3h Kd8s 5hQd 2c6d"));
  }

  @Test
  public void test_texas_holdem_3348_2s3c8d9sJh_2d6d_Ah4h() {
    assertEquals(
      "Ah4h 2d6d",
      Solver.process("texas-holdem 2s3c8d9sJh 2d6d Ah4h"));
  }

  @Test
  public void test_texas_holdem_3349_3c3s6s9dKc_8dJc_Ac7c_3hQc_TdQh_4dJd_7h2h() {
    assertEquals(
      "7h2h 4dJd=8dJc TdQh Ac7c 3hQc",
      Solver.process("texas-holdem 3c3s6s9dKc 8dJc Ac7c 3hQc TdQh 4dJd 7h2h"));
  }

  @Test
  public void test_texas_holdem_3350_2s3c7dJhTs_Th7s_5h9c_JcJs_6c3s_4c5s() {
    assertEquals(
      "4c5s 5h9c 6c3s Th7s JcJs",
      Solver.process("texas-holdem 2s3c7dJhTs Th7s 5h9c JcJs 6c3s 4c5s"));
  }

  @Test
  public void test_texas_holdem_3351_2h5h8cJhJs_QdAh_Ad2s_9d4h_3d8d_AcQc() {
    assertEquals(
      "9d4h AcQc=QdAh Ad2s 3d8d",
      Solver.process("texas-holdem 2h5h8cJhJs QdAh Ad2s 9d4h 3d8d AcQc"));
  }

  @Test
  public void test_texas_holdem_3352_2d2h6sAdQd_Ts7c_9c4d_Tc6c_Kc5c_5dTd_8h8d_Ks9s_8s2c_JsTh() {
    assertEquals(
      "9c4d Ts7c JsTh Kc5c=Ks9s Tc6c 8h8d 8s2c 5dTd",
      Solver.process("texas-holdem 2d2h6sAdQd Ts7c 9c4d Tc6c Kc5c 5dTd 8h8d Ks9s 8s2c JsTh"));
  }

  @Test
  public void test_texas_holdem_3353_2h8s9sQdTs_3h3s_9cKs() {
    assertEquals(
      "3h3s 9cKs",
      Solver.process("texas-holdem 2h8s9sQdTs 3h3s 9cKs"));
  }

  @Test
  public void test_texas_holdem_3354_5h8sJcKcQs_2c7c_Td3c_TcAh_Th8h_JsKd() {
    assertEquals(
      "2c7c Td3c Th8h JsKd TcAh",
      Solver.process("texas-holdem 5h8sJcKcQs 2c7c Td3c TcAh Th8h JsKd"));
  }

  @Test
  public void test_texas_holdem_3355_5s7d8dAsQc_6d3s_5cKs() {
    assertEquals(
      "6d3s 5cKs",
      Solver.process("texas-holdem 5s7d8dAsQc 6d3s 5cKs"));
  }

  @Test
  public void test_texas_holdem_3356_2s4h9dAcTh_8hJd_JsKc_6c5d_2hQc_Ts3c() {
    assertEquals(
      "6c5d 8hJd JsKc 2hQc Ts3c",
      Solver.process("texas-holdem 2s4h9dAcTh 8hJd JsKc 6c5d 2hQc Ts3c"));
  }

  @Test
  public void test_texas_holdem_3357_3h4c4d5dJd_Kd6h_Qh3c_8d7s_5hQc_ThAs_QsQd_6c9s_7c9c_7dKs() {
    assertEquals(
      "8d7s 6c9s 7c9c Kd6h 7dKs ThAs Qh3c 5hQc QsQd",
      Solver.process("texas-holdem 3h4c4d5dJd Kd6h Qh3c 8d7s 5hQc ThAs QsQd 6c9s 7c9c 7dKs"));
  }

  @Test
  public void test_texas_holdem_3358_6d7dJhKhTs_9cTd_4sAd_As8c_2c7h_5cKs_9s4c() {
    assertEquals(
      "9s4c 4sAd As8c 2c7h 9cTd 5cKs",
      Solver.process("texas-holdem 6d7dJhKhTs 9cTd 4sAd As8c 2c7h 5cKs 9s4c"));
  }

  @Test
  public void test_texas_holdem_3359_5c5sAdJcTd_3d6s_2h8h_Ac9c_Jh4d_Qc9s_9dTs() {
    assertEquals(
      "2h8h=3d6s Qc9s 9dTs Jh4d Ac9c",
      Solver.process("texas-holdem 5c5sAdJcTd 3d6s 2h8h Ac9c Jh4d Qc9s 9dTs"));
  }

  @Test
  public void test_texas_holdem_3360_2c2d5dAcTc_3h7d_KsAh_7s5s_3sKd_7hTd_Kh8h_Jc6d_Ad3d_2h9d() {
    assertEquals(
      "3h7d Jc6d 3sKd=Kh8h 7s5s 7hTd Ad3d KsAh 2h9d",
      Solver.process("texas-holdem 2c2d5dAcTc 3h7d KsAh 7s5s 3sKd 7hTd Kh8h Jc6d Ad3d 2h9d"));
  }

  @Test
  public void test_texas_holdem_3361_2c2h2s3cAc_TcQs_QhJc_6s5s_7c9s_Kh4s_6h8h_Ts3d() {
    assertEquals(
      "6s5s 6h8h 7c9s QhJc=TcQs Kh4s Ts3d",
      Solver.process("texas-holdem 2c2h2s3cAc TcQs QhJc 6s5s 7c9s Kh4s 6h8h Ts3d"));
  }

  @Test
  public void test_texas_holdem_3362_2s4d5c9dTs_KcJs_2dJc_Qs3s() {
    assertEquals(
      "Qs3s KcJs 2dJc",
      Solver.process("texas-holdem 2s4d5c9dTs KcJs 2dJc Qs3s"));
  }

  @Test
  public void test_texas_holdem_3363_2c2h9dJhTc_5d2s_6dAh_3cAc_4dKs_5h7d_3dQc_QhKh_9s8d_AsJs() {
    assertEquals(
      "5h7d 3dQc 4dKs 3cAc=6dAh 9s8d AsJs 5d2s QhKh",
      Solver.process("texas-holdem 2c2h9dJhTc 5d2s 6dAh 3cAc 4dKs 5h7d 3dQc QhKh 9s8d AsJs"));
  }

  @Test
  public void test_texas_holdem_3364_2h5hAsJsKs_9dJd_KhTs_Jc9c_8cAc_4h6c_7c7h_Ad8d() {
    assertEquals(
      "4h6c 7c7h 9dJd=Jc9c KhTs 8cAc=Ad8d",
      Solver.process("texas-holdem 2h5hAsJsKs 9dJd KhTs Jc9c 8cAc 4h6c 7c7h Ad8d"));
  }

  @Test
  public void test_texas_holdem_3365_9dKhKsThTs_Ad9h_4dKd_7s8d_Qs8c_Jc6h_As2h_7d3h() {
    assertEquals(
      "7d3h=7s8d Jc6h Qs8c Ad9h=As2h 4dKd",
      Solver.process("texas-holdem 9dKhKsThTs Ad9h 4dKd 7s8d Qs8c Jc6h As2h 7d3h"));
  }

  @Test
  public void test_texas_holdem_3366_8hJhQsTdTh_7d2s_Js7s_4s9c_KsAd() {
    assertEquals(
      "7d2s Js7s 4s9c KsAd",
      Solver.process("texas-holdem 8hJhQsTdTh 7d2s Js7s 4s9c KsAd"));
  }

  @Test
  public void test_texas_holdem_3367_3h5sKhQhTc_Js3c_Ks9h_6h9d_2dQd_7sAh_2sKd_9cJh_5h4h() {
    assertEquals(
      "6h9d 7sAh Js3c 2dQd 2sKd Ks9h 9cJh 5h4h",
      Solver.process("texas-holdem 3h5sKhQhTc Js3c Ks9h 6h9d 2dQd 7sAh 2sKd 9cJh 5h4h"));
  }

  @Test
  public void test_texas_holdem_3368_2s4s5s8h9h_ThQc_3dTc_9sKd_7d5h_6cQd_JsQh_TsTd() {
    assertEquals(
      "3dTc 6cQd ThQc JsQh 7d5h 9sKd TsTd",
      Solver.process("texas-holdem 2s4s5s8h9h ThQc 3dTc 9sKd 7d5h 6cQd JsQh TsTd"));
  }

  @Test
  public void test_texas_holdem_3369_5s6s7hAdTd_JcKh_9c3s_7d4s_2sKd_8c7c_8dKc_4c4h_3h6c() {
    assertEquals(
      "9c3s 2sKd 8dKc JcKh 4c4h 3h6c 7d4s 8c7c",
      Solver.process("texas-holdem 5s6s7hAdTd JcKh 9c3s 7d4s 2sKd 8c7c 8dKc 4c4h 3h6c"));
  }

  @Test
  public void test_texas_holdem_3370_7d9sJcKhTc_Th7h_Jd8d() {
    assertEquals(
      "Th7h Jd8d",
      Solver.process("texas-holdem 7d9sJcKhTc Th7h Jd8d"));
  }

  @Test
  public void test_texas_holdem_3371_5c7s9sAdTs_JhTc_3c2s_Jd4d_4h5h_AcAh_6h9h_9d6s() {
    assertEquals(
      "3c2s Jd4d 4h5h 6h9h=9d6s JhTc AcAh",
      Solver.process("texas-holdem 5c7s9sAdTs JhTc 3c2s Jd4d 4h5h AcAh 6h9h 9d6s"));
  }

  @Test
  public void test_texas_holdem_3372_2c2d5c8cQs_3sJd_Kc7d_TcQd_7h2h_Td9h_Qc4h_Ks3d() {
    assertEquals(
      "Td9h 3sJd Kc7d=Ks3d Qc4h TcQd 7h2h",
      Solver.process("texas-holdem 2c2d5c8cQs 3sJd Kc7d TcQd 7h2h Td9h Qc4h Ks3d"));
  }

  @Test
  public void test_texas_holdem_3373_2s3h5d9sJd_Kh2h_3dJc_Qd8c_4dTd() {
    assertEquals(
      "4dTd Qd8c Kh2h 3dJc",
      Solver.process("texas-holdem 2s3h5d9sJd Kh2h 3dJc Qd8c 4dTd"));
  }

  @Test
  public void test_texas_holdem_3374_3h5c8cJhTs_Jc7s_Ad9d_6h6c() {
    assertEquals(
      "Ad9d 6h6c Jc7s",
      Solver.process("texas-holdem 3h5c8cJhTs Jc7s Ad9d 6h6c"));
  }

  @Test
  public void test_texas_holdem_3375_3d3h5d6sKd_2hAc_7d5s_4h4c() {
    assertEquals(
      "2hAc 4h4c 7d5s",
      Solver.process("texas-holdem 3d3h5d6sKd 2hAc 7d5s 4h4c"));
  }

  @Test
  public void test_texas_holdem_3376_4h5h6sJcTd_Qh3d_Ad6c_2d8c_JsQs_Kc7c() {
    assertEquals(
      "2d8c Qh3d Kc7c Ad6c JsQs",
      Solver.process("texas-holdem 4h5h6sJcTd Qh3d Ad6c 2d8c JsQs Kc7c"));
  }

  @Test
  public void test_texas_holdem_3377_4d5dKdKhQh_5c8c_Jh5s_7s3d_4c2c() {
    assertEquals(
      "7s3d 4c2c 5c8c=Jh5s",
      Solver.process("texas-holdem 4d5dKdKhQh 5c8c Jh5s 7s3d 4c2c"));
  }

  @Test
  public void test_texas_holdem_3378_6c8h9dAhTd_8sJs_Kd7d_9c8c_2c6h_Jc6d_9h5s_4cAs() {
    assertEquals(
      "2c6h Jc6d 8sJs 9h5s 4cAs 9c8c Kd7d",
      Solver.process("texas-holdem 6c8h9dAhTd 8sJs Kd7d 9c8c 2c6h Jc6d 9h5s 4cAs"));
  }

  @Test
  public void test_texas_holdem_3379_2d3c3h4h8c_Ks8d_9h9d_7c5s_5dKc_3d3s_2c5c_AhTs_QhTd_Js2h() {
    assertEquals(
      "7c5s QhTd 5dKc AhTs 2c5c Js2h Ks8d 9h9d 3d3s",
      Solver.process("texas-holdem 2d3c3h4h8c Ks8d 9h9d 7c5s 5dKc 3d3s 2c5c AhTs QhTd Js2h"));
  }

  @Test
  public void test_texas_holdem_3380_2h4sAsJdJh_6c5d_Qs2d_KdJs_6sQd_8h6h() {
    assertEquals(
      "6c5d 8h6h 6sQd Qs2d KdJs",
      Solver.process("texas-holdem 2h4sAsJdJh 6c5d Qs2d KdJs 6sQd 8h6h"));
  }

  @Test
  public void test_texas_holdem_3381_3c4s6d9dJd_Ah4d_5sJh() {
    assertEquals(
      "Ah4d 5sJh",
      Solver.process("texas-holdem 3c4s6d9dJd Ah4d 5sJh"));
  }

  @Test
  public void test_texas_holdem_3382_7s9dKdQcTd_2c8h_5d4c_6sAd_4hAh_Jc7d_3sJd_6hQs_9h8c() {
    assertEquals(
      "5d4c 2c8h 4hAh=6sAd 9h8c 6hQs 3sJd=Jc7d",
      Solver.process("texas-holdem 7s9dKdQcTd 2c8h 5d4c 6sAd 4hAh Jc7d 3sJd 6hQs 9h8c"));
  }

  @Test
  public void test_texas_holdem_3383_3d5d8cAcQd_9cKc_3c2c_QhKh_2s7c_8s6s_4cJd_4s2d() {
    assertEquals(
      "2s7c 4cJd 9cKc 3c2c 8s6s QhKh 4s2d",
      Solver.process("texas-holdem 3d5d8cAcQd 9cKc 3c2c QhKh 2s7c 8s6s 4cJd 4s2d"));
  }

  @Test
  public void test_texas_holdem_3384_9sAcKdKhTh_TsKc_JcQh_7dAs_5h9h_Qs2d_5c8c() {
    assertEquals(
      "5c8c Qs2d 5h9h 7dAs JcQh TsKc",
      Solver.process("texas-holdem 9sAcKdKhTh TsKc JcQh 7dAs 5h9h Qs2d 5c8c"));
  }

  @Test
  public void test_texas_holdem_3385_4s9hJdKdKh_7d5h_TcJc_Ts2h_JsQh_Td2s() {
    assertEquals(
      "7d5h Td2s=Ts2h TcJc JsQh",
      Solver.process("texas-holdem 4s9hJdKdKh 7d5h TcJc Ts2h JsQh Td2s"));
  }

  @Test
  public void test_texas_holdem_3386_5d9sJhKhKs_8s4c_Qs2d() {
    assertEquals(
      "8s4c Qs2d",
      Solver.process("texas-holdem 5d9sJhKhKs 8s4c Qs2d"));
  }

  @Test
  public void test_texas_holdem_3387_2c5h6h8d9c_5sQs_QcKc_Ad2d_4d8s() {
    assertEquals(
      "QcKc Ad2d 5sQs 4d8s",
      Solver.process("texas-holdem 2c5h6h8d9c 5sQs QcKc Ad2d 4d8s"));
  }

  @Test
  public void test_texas_holdem_3388_6c9sKcKsTd_Ah4c_4s2s() {
    assertEquals(
      "4s2s Ah4c",
      Solver.process("texas-holdem 6c9sKcKsTd Ah4c 4s2s"));
  }

  @Test
  public void test_texas_holdem_3389_6c7s9sJhQc_KsTs_4h7c_Jc2s_6h4d() {
    assertEquals(
      "6h4d 4h7c Jc2s KsTs",
      Solver.process("texas-holdem 6c7s9sJhQc KsTs 4h7c Jc2s 6h4d"));
  }

  @Test
  public void test_texas_holdem_3390_2d6s8s9sTs_8dKd_Ks9d_Ac5h() {
    assertEquals(
      "Ac5h 8dKd Ks9d",
      Solver.process("texas-holdem 2d6s8s9sTs 8dKd Ks9d Ac5h"));
  }

  @Test
  public void test_texas_holdem_3391_7h9c9hKdKh_Ks5d_TdJh() {
    assertEquals(
      "TdJh Ks5d",
      Solver.process("texas-holdem 7h9c9hKdKh Ks5d TdJh"));
  }

  @Test
  public void test_texas_holdem_3392_6h8sKhKsQd_9cKc_Tc3d() {
    assertEquals(
      "Tc3d 9cKc",
      Solver.process("texas-holdem 6h8sKhKsQd 9cKc Tc3d"));
  }

  @Test
  public void test_texas_holdem_3393_2d2s3s8s9c_5cJc_Th6h_2h6d_QdKd_7s4s_5s6s_QcAc() {
    assertEquals(
      "Th6h 5cJc QdKd QcAc 2h6d 5s6s 7s4s",
      Solver.process("texas-holdem 2d2s3s8s9c 5cJc Th6h 2h6d QdKd 7s4s 5s6s QcAc"));
  }

  @Test
  public void test_texas_holdem_3394_2h5c8dJhQh_Tc4d_Ts6s_AhAc_2cQs_8c6d_6c7c_KhQc_8h9d() {
    assertEquals(
      "6c7c Tc4d Ts6s 8c6d 8h9d KhQc AhAc 2cQs",
      Solver.process("texas-holdem 2h5c8dJhQh Tc4d Ts6s AhAc 2cQs 8c6d 6c7c KhQc 8h9d"));
  }

  @Test
  public void test_texas_holdem_3395_3c4h5c9c9s_AhAd_8c2c_5h4s_4d8s_7hJc_2h3s() {
    assertEquals(
      "7hJc 2h3s 4d8s 5h4s AhAd 8c2c",
      Solver.process("texas-holdem 3c4h5c9c9s AhAd 8c2c 5h4s 4d8s 7hJc 2h3s"));
  }

  @Test
  public void test_texas_holdem_3396_2d3h6d7dQs_Td5c_4s4c_Ts8c_5d9c_7h7s() {
    assertEquals(
      "5d9c Td5c Ts8c 4s4c 7h7s",
      Solver.process("texas-holdem 2d3h6d7dQs Td5c 4s4c Ts8c 5d9c 7h7s"));
  }

  @Test
  public void test_texas_holdem_3397_3c5d9d9sQs_Kc5s_6s4c() {
    assertEquals(
      "6s4c Kc5s",
      Solver.process("texas-holdem 3c5d9d9sQs Kc5s 6s4c"));
  }

  @Test
  public void test_texas_holdem_3398_3h4d5c9hJs_AdQh_9s7d_2c6c() {
    assertEquals(
      "AdQh 9s7d 2c6c",
      Solver.process("texas-holdem 3h4d5c9hJs AdQh 9s7d 2c6c"));
  }

  @Test
  public void test_texas_holdem_3399_4h5c9c9sAh_8hKs_4sQc_3s5s_4d7c_Jc8s() {
    assertEquals(
      "Jc8s 8hKs 4d7c=4sQc 3s5s",
      Solver.process("texas-holdem 4h5c9c9sAh 8hKs 4sQc 3s5s 4d7c Jc8s"));
  }

  @Test
  public void test_texas_holdem_3400_3s5d9dQsTd_JhJs_As8c_2s7c_3hJd() {
    assertEquals(
      "2s7c As8c 3hJd JhJs",
      Solver.process("texas-holdem 3s5d9dQsTd JhJs As8c 2s7c 3hJd"));
  }

  @Test
  public void test_texas_holdem_3401_4d8sAsQcTd_2h3s_7c8c_9sTs() {
    assertEquals(
      "2h3s 7c8c 9sTs",
      Solver.process("texas-holdem 4d8sAsQcTd 2h3s 7c8c 9sTs"));
  }

  @Test
  public void test_texas_holdem_3402_2d3s7dKcKs_5dJd_Qd8s_9hJs_2h4d_7cAd() {
    assertEquals(
      "5dJd 9hJs Qd8s 2h4d 7cAd",
      Solver.process("texas-holdem 2d3s7dKcKs 5dJd Qd8s 9hJs 2h4d 7cAd"));
  }

  @Test
  public void test_texas_holdem_3403_3c4s7h8dQh_ThQc_Kh9d() {
    assertEquals(
      "Kh9d ThQc",
      Solver.process("texas-holdem 3c4s7h8dQh ThQc Kh9d"));
  }

  @Test
  public void test_texas_holdem_3404_7h8h9dJdJs_TdTh_4sQs_8s3h_4dKh_Jh2c_8dAs_7c7s_TsAc() {
    assertEquals(
      "4sQs 4dKh 8s3h 8dAs Jh2c TdTh=TsAc 7c7s",
      Solver.process("texas-holdem 7h8h9dJdJs TdTh 4sQs 8s3h 4dKh Jh2c 8dAs 7c7s TsAc"));
  }

  @Test
  public void test_texas_holdem_3405_4d6d7c9sAh_Js2h_6sTh_3hTc() {
    assertEquals(
      "3hTc Js2h 6sTh",
      Solver.process("texas-holdem 4d6d7c9sAh Js2h 6sTh 3hTc"));
  }

  @Test
  public void test_texas_holdem_3406_3d8s9hKhTs_4cAh_3c9c_Kd9s_Jh8c_6sTd_Ac3s_Jc2h() {
    assertEquals(
      "Jc2h 4cAh Ac3s Jh8c 6sTd 3c9c Kd9s",
      Solver.process("texas-holdem 3d8s9hKhTs 4cAh 3c9c Kd9s Jh8c 6sTd Ac3s Jc2h"));
  }

  @Test
  public void test_texas_holdem_3407_3d4s7sKhTs_2h3c_6c3s_6s4d_Ac8s_8d8h_5d7h() {
    assertEquals(
      "Ac8s 2h3c=6c3s 6s4d 5d7h 8d8h",
      Solver.process("texas-holdem 3d4s7sKhTs 2h3c 6c3s 6s4d Ac8s 8d8h 5d7h"));
  }

  @Test
  public void test_texas_holdem_3408_7d8s9cJdQd_TsTc_4sTh_9sKs_3dTd() {
    assertEquals(
      "9sKs 4sTh=TsTc 3dTd",
      Solver.process("texas-holdem 7d8s9cJdQd TsTc 4sTh 9sKs 3dTd"));
  }

  @Test
  public void test_texas_holdem_3409_3h7s9sJcKc_8s5d_Qc4c_6h3c_7d4d_6cAh_TdAd() {
    assertEquals(
      "8s5d Qc4c 6cAh TdAd 6h3c 7d4d",
      Solver.process("texas-holdem 3h7s9sJcKc 8s5d Qc4c 6h3c 7d4d 6cAh TdAd"));
  }

  @Test
  public void test_texas_holdem_3410_3c5c6c6sJs_4cJh_9d7d_Ts7s_8sKh_Ac7h_8cTd() {
    assertEquals(
      "9d7d Ts7s 8cTd 8sKh Ac7h 4cJh",
      Solver.process("texas-holdem 3c5c6c6sJs 4cJh 9d7d Ts7s 8sKh Ac7h 8cTd"));
  }

  @Test
  public void test_texas_holdem_3411_2s5c5h7s9h_6d7d_4dQs_3s6h() {
    assertEquals(
      "3s6h 4dQs 6d7d",
      Solver.process("texas-holdem 2s5c5h7s9h 6d7d 4dQs 3s6h"));
  }

  @Test
  public void test_texas_holdem_3412_2d4c5d8dKh_JsTc_KdAs_AhJh() {
    assertEquals(
      "JsTc AhJh KdAs",
      Solver.process("texas-holdem 2d4c5d8dKh JsTc KdAs AhJh"));
  }

  @Test
  public void test_texas_holdem_3413_5h6h8sJhTc_9h9s_As7d_8d2h_2d5c_3hTh_5d6d_TsQd_AhAc_5sKc() {
    assertEquals(
      "As7d 2d5c 5sKc 8d2h 9h9s TsQd AhAc 5d6d 3hTh",
      Solver.process("texas-holdem 5h6h8sJhTc 9h9s As7d 8d2h 2d5c 3hTh 5d6d TsQd AhAc 5sKc"));
  }

  @Test
  public void test_texas_holdem_3414_2d2h3c4c9c_5s9s_7dQd_2sAc_6hAd_Jh8d_6s6c_8sTd_Tc8h_5h7h() {
    assertEquals(
      "5h7h 8sTd=Tc8h Jh8d 7dQd 6hAd 6s6c 5s9s 2sAc",
      Solver.process("texas-holdem 2d2h3c4c9c 5s9s 7dQd 2sAc 6hAd Jh8d 6s6c 8sTd Tc8h 5h7h"));
  }

  @Test
  public void test_texas_holdem_3415_4d5d9c9hJs_3sJc_8dJh_6d3d_7d8s_QdQc_7cTs() {
    assertEquals(
      "6d3d 7d8s 7cTs 3sJc 8dJh QdQc",
      Solver.process("texas-holdem 4d5d9c9hJs 3sJc 8dJh 6d3d 7d8s QdQc 7cTs"));
  }

  @Test
  public void test_texas_holdem_3416_3c5c6c6dQc_5h2d_7d7s() {
    assertEquals(
      "5h2d 7d7s",
      Solver.process("texas-holdem 3c5c6c6dQc 5h2d 7d7s"));
  }

  @Test
  public void test_texas_holdem_3417_5dAsJcTdTs_Jd6h_8h2h_ThQh_6d7s_8s4c_Kh5s_4s4d() {
    assertEquals(
      "6d7s 8h2h=8s4c 4s4d Kh5s Jd6h ThQh",
      Solver.process("texas-holdem 5dAsJcTdTs Jd6h 8h2h ThQh 6d7s 8s4c Kh5s 4s4d"));
  }

  @Test
  public void test_texas_holdem_3418_3s8s9dKcQh_6hKs_9c4s_Ac2h_5c3d() {
    assertEquals(
      "Ac2h 5c3d 9c4s 6hKs",
      Solver.process("texas-holdem 3s8s9dKcQh 6hKs 9c4s Ac2h 5c3d"));
  }

  @Test
  public void test_texas_holdem_3419_6d7dAcAsJh_2d4d_2h4s_Jc8h_2cJs_KhKs_9s6c_3d7s() {
    assertEquals(
      "2d4d=2h4s 9s6c 3d7s 2cJs Jc8h KhKs",
      Solver.process("texas-holdem 6d7dAcAsJh 2d4d 2h4s Jc8h 2cJs KhKs 9s6c 3d7s"));
  }

  @Test
  public void test_texas_holdem_3420_5c6c8sAcTd_7c6d_5sQc_TsAd_5h2d_3d7h_4cAs_4h5d_2sKc_Kh6s() {
    assertEquals(
      "3d7h 2sKc 4h5d=5h2d 5sQc 7c6d Kh6s 4cAs TsAd",
      Solver.process("texas-holdem 5c6c8sAcTd 7c6d 5sQc TsAd 5h2d 3d7h 4cAs 4h5d 2sKc Kh6s"));
  }

  @Test
  public void test_texas_holdem_3421_3d4c6hAdKh_AcJc_Qd5c_6dTc_6s5s() {
    assertEquals(
      "Qd5c 6s5s 6dTc AcJc",
      Solver.process("texas-holdem 3d4c6hAdKh AcJc Qd5c 6dTc 6s5s"));
  }

  @Test
  public void test_texas_holdem_3422_4c5s6c7hKh_9h4d_9s8s_KsJs() {
    assertEquals(
      "9h4d KsJs 9s8s",
      Solver.process("texas-holdem 4c5s6c7hKh 9h4d 9s8s KsJs"));
  }

  @Test
  public void test_texas_holdem_3423_5sAdJhKcTh_Jc6c_Qh9h_6d7s_4h2c_Qs3h_8d7c_4s6s_QdTd() {
    assertEquals(
      "4h2c 4s6s 6d7s 8d7c Jc6c QdTd=Qh9h=Qs3h",
      Solver.process("texas-holdem 5sAdJhKcTh Jc6c Qh9h 6d7s 4h2c Qs3h 8d7c 4s6s QdTd"));
  }

  @Test
  public void test_texas_holdem_3424_3d9hAhKdQh_4h8c_8hJh() {
    assertEquals(
      "4h8c 8hJh",
      Solver.process("texas-holdem 3d9hAhKdQh 4h8c 8hJh"));
  }

  @Test
  public void test_texas_holdem_3425_5s9h9sAhQs_2hKc_3d8s_7c2c_5cJh() {
    assertEquals(
      "7c2c 3d8s 2hKc 5cJh",
      Solver.process("texas-holdem 5s9h9sAhQs 2hKc 3d8s 7c2c 5cJh"));
  }

  @Test
  public void test_texas_holdem_3426_3c4c4s9d9s_5h2s_AhQh_Kc5c_7sTc_Jh9c_8dKh_6cAd_7d4h_9hQc() {
    assertEquals(
      "5h2s 7sTc 8dKh=Kc5c 6cAd=AhQh 7d4h 9hQc=Jh9c",
      Solver.process("texas-holdem 3c4c4s9d9s 5h2s AhQh Kc5c 7sTc Jh9c 8dKh 6cAd 7d4h 9hQc"));
  }

  @Test
  public void test_texas_holdem_3427_5d6s8d8sQd_7hQh_9h3c_KcQs_KsAs_6h8c_Kd7d_AcAd_4h3d_2h6d() {
    assertEquals(
      "4h3d 9h3c KsAs 2h6d 7hQh KcQs AcAd Kd7d 6h8c",
      Solver.process("texas-holdem 5d6s8d8sQd 7hQh 9h3c KcQs KsAs 6h8c Kd7d AcAd 4h3d 2h6d"));
  }

  @Test
  public void test_texas_holdem_3428_3c6hKcQhTs_Ad5d_2hAc_Td7c_2d4s_Qs5c_3s5h_8c8h() {
    assertEquals(
      "2d4s 2hAc=Ad5d 3s5h 8c8h Td7c Qs5c",
      Solver.process("texas-holdem 3c6hKcQhTs Ad5d 2hAc Td7c 2d4s Qs5c 3s5h 8c8h"));
  }

  @Test
  public void test_texas_holdem_3429_5h8hJsQhTs_Qs6d_3hJd_7s7c() {
    assertEquals(
      "7s7c 3hJd Qs6d",
      Solver.process("texas-holdem 5h8hJsQhTs Qs6d 3hJd 7s7c"));
  }

  @Test
  public void test_texas_holdem_3430_2d3s4c4hTd_8hTh_QcJs_Ac2s_2h7d_6c6d() {
    assertEquals(
      "QcJs 2h7d Ac2s 6c6d 8hTh",
      Solver.process("texas-holdem 2d3s4c4hTd 8hTh QcJs Ac2s 2h7d 6c6d"));
  }

  @Test
  public void test_texas_holdem_3431_5d9hQcTcTs_QhKs_2dAs() {
    assertEquals(
      "2dAs QhKs",
      Solver.process("texas-holdem 5d9hQcTcTs QhKs 2dAs"));
  }

  @Test
  public void test_texas_holdem_3432_2d4hQdTdTh_8s3h_9hJd() {
    assertEquals(
      "8s3h 9hJd",
      Solver.process("texas-holdem 2d4hQdTdTh 8s3h 9hJd"));
  }

  @Test
  public void test_texas_holdem_3433_4d8s9cTcTs_3hAh_Jh2d_Qd8c_2c9h_2sQs_Kh5d() {
    assertEquals(
      "Jh2d 2sQs Kh5d 3hAh Qd8c 2c9h",
      Solver.process("texas-holdem 4d8s9cTcTs 3hAh Jh2d Qd8c 2c9h 2sQs Kh5d"));
  }

  @Test
  public void test_texas_holdem_3434_2d4sAcJhQc_QdKd_7s2h() {
    assertEquals(
      "7s2h QdKd",
      Solver.process("texas-holdem 2d4sAcJhQc QdKd 7s2h"));
  }

  @Test
  public void test_texas_holdem_3435_3c6s8s9cKc_8dAs_8h3h_2s7h_6hQc_5cJc_Qd7s_6c7d_4d5s_KsTc() {
    assertEquals(
      "4d5s 2s7h Qd7s 6c7d 6hQc 8dAs KsTc 8h3h 5cJc",
      Solver.process("texas-holdem 3c6s8s9cKc 8dAs 8h3h 2s7h 6hQc 5cJc Qd7s 6c7d 4d5s KsTc"));
  }

  @Test
  public void test_texas_holdem_3436_5d5sJcKhQc_6h6d_2h2s() {
    assertEquals(
      "2h2s 6h6d",
      Solver.process("texas-holdem 5d5sJcKhQc 6h6d 2h2s"));
  }

  @Test
  public void test_texas_holdem_3437_2d6d8c8sKc_9cKh_3c8d_7s5s_Ac4d_2s4c_Qs7c_9dQc_8h7d_3sTh() {
    assertEquals(
      "7s5s 3sTh Qs7c 9dQc Ac4d 2s4c 9cKh 3c8d 8h7d",
      Solver.process("texas-holdem 2d6d8c8sKc 9cKh 3c8d 7s5s Ac4d 2s4c Qs7c 9dQc 8h7d 3sTh"));
  }

  @Test
  public void test_texas_holdem_3438_3d4dJhQcTh_Ad5h_6cJd_4sAc_Qd9h_Tc3h_7sTd_JcKc_5c6s() {
    assertEquals(
      "5c6s Ad5h 4sAc 7sTd 6cJd JcKc Qd9h Tc3h",
      Solver.process("texas-holdem 3d4dJhQcTh Ad5h 6cJd 4sAc Qd9h Tc3h 7sTd JcKc 5c6s"));
  }

  @Test
  public void test_texas_holdem_3439_3s9hAdAsJh_KdJs_Tc9s() {
    assertEquals(
      "Tc9s KdJs",
      Solver.process("texas-holdem 3s9hAdAsJh KdJs Tc9s"));
  }

  @Test
  public void test_texas_holdem_3440_6c9c9dAsKs_Tc8s_5hTd_2h7c_Js6s() {
    assertEquals(
      "2h7c 5hTd=Tc8s Js6s",
      Solver.process("texas-holdem 6c9c9dAsKs Tc8s 5hTd 2h7c Js6s"));
  }

  @Test
  public void test_texas_holdem_3441_4d5d8h9cJh_TdKd_5s2h_2d3h() {
    assertEquals(
      "2d3h TdKd 5s2h",
      Solver.process("texas-holdem 4d5d8h9cJh TdKd 5s2h 2d3h"));
  }

  @Test
  public void test_texas_holdem_3442_4h5h6d7d9c_6s9h_Ts8s_Tc4d_3d7h_5c6h_6c8c() {
    assertEquals(
      "Tc4d 5c6h 6s9h 3d7h 6c8c Ts8s",
      Solver.process("texas-holdem 4h5h6d7d9c 6s9h Ts8s Tc4d 3d7h 5c6h 6c8c"));
  }

  @Test
  public void test_texas_holdem_3443_2h3c5s7sJh_6sKc_Js6d_Ks8h_TcQh() {
    assertEquals(
      "TcQh 6sKc Ks8h Js6d",
      Solver.process("texas-holdem 2h3c5s7sJh 6sKc Js6d Ks8h TcQh"));
  }

  @Test
  public void test_texas_holdem_3444_2h5d7dQdQh_QsAd_2sTh_6s9d_Tc3c_2d7c_8s4s_Kh3s_Ac6c_3d9c() {
    assertEquals(
      "8s4s 3d9c 6s9d Tc3c Kh3s Ac6c 2sTh 2d7c QsAd",
      Solver.process("texas-holdem 2h5d7dQdQh QsAd 2sTh 6s9d Tc3c 2d7c 8s4s Kh3s Ac6c 3d9c"));
  }

  @Test
  public void test_texas_holdem_3445_3d4h5dAhQs_7d2d_2c4c_Kc7s_3cJh_Ad7h_Td4s_Js9c_KdQc() {
    assertEquals(
      "Js9c Kc7s 3cJh Td4s KdQc Ad7h 2c4c=7d2d",
      Solver.process("texas-holdem 3d4h5dAhQs 7d2d 2c4c Kc7s 3cJh Ad7h Td4s Js9c KdQc"));
  }

  @Test
  public void test_texas_holdem_3446_3cJhKsQdTs_Th5h_Ac4c_8h7c_8c7h() {
    assertEquals(
      "8c7h=8h7c Th5h Ac4c",
      Solver.process("texas-holdem 3cJhKsQdTs Th5h Ac4c 8h7c 8c7h"));
  }

  @Test
  public void test_texas_holdem_3447_2c2s6d8sKs_5h9c_6c8d_AcKd_2h7c_3s8c_Qs4c_Jd3c_Ah4d() {
    assertEquals(
      "5h9c Jd3c Qs4c Ah4d 3s8c 6c8d AcKd 2h7c",
      Solver.process("texas-holdem 2c2s6d8sKs 5h9c 6c8d AcKd 2h7c 3s8c Qs4c Jd3c Ah4d"));
  }

  @Test
  public void test_texas_holdem_3448_2h3c4d5dTs_2cKs_9d8c_Jh6d_5sJd_QdKd() {
    assertEquals(
      "9d8c QdKd 2cKs 5sJd Jh6d",
      Solver.process("texas-holdem 2h3c4d5dTs 2cKs 9d8c Jh6d 5sJd QdKd"));
  }

  @Test
  public void test_texas_holdem_3449_2c4sAdAhTs_3c3s_AsAc_5d2d_5s5c_6s7c_ThQc() {
    assertEquals(
      "6s7c 5d2d 3c3s 5s5c ThQc AsAc",
      Solver.process("texas-holdem 2c4sAdAhTs 3c3s AsAc 5d2d 5s5c 6s7c ThQc"));
  }

  @Test
  public void test_texas_holdem_3450_2s4h8h9dKh_QdKd_AsJh_2d6d_3c2h() {
    assertEquals(
      "AsJh 2d6d=3c2h QdKd",
      Solver.process("texas-holdem 2s4h8h9dKh QdKd AsJh 2d6d 3c2h"));
  }

  @Test
  public void test_texas_holdem_3451_3c7hQdQsTs_4d2h_8h9d_9sAs_6s5d_JsKd_3d4s_5h8c() {
    assertEquals(
      "4d2h 6s5d 5h8c 8h9d JsKd 9sAs 3d4s",
      Solver.process("texas-holdem 3c7hQdQsTs 4d2h 8h9d 9sAs 6s5d JsKd 3d4s 5h8c"));
  }

  @Test
  public void test_texas_holdem_3452_4c6s7hQcTd_7dQh_9d8d_9h6h_Ad8c() {
    assertEquals(
      "Ad8c 9h6h 7dQh 9d8d",
      Solver.process("texas-holdem 4c6s7hQcTd 7dQh 9d8d 9h6h Ad8c"));
  }

  @Test
  public void test_texas_holdem_3453_4c6c7sJsQc_8sTd_7cAs() {
    assertEquals(
      "8sTd 7cAs",
      Solver.process("texas-holdem 4c6c7sJsQc 8sTd 7cAs"));
  }

  @Test
  public void test_texas_holdem_3454_5c6h7c8h9c_6dTh_Td8c_2dJd_2cQs_6sKc() {
    assertEquals(
      "2cQs=2dJd=6sKc 6dTh=Td8c",
      Solver.process("texas-holdem 5c6h7c8h9c 6dTh Td8c 2dJd 2cQs 6sKc"));
  }

  @Test
  public void test_texas_holdem_3455_4c7cAsKcKd_7s6d_5c3h_Td8s_9s2c_4s5d_Qs2d_4hTs_6sJs_Ks2s() {
    assertEquals(
      "5c3h 9s2c Td8s 6sJs Qs2d 4hTs=4s5d 7s6d Ks2s",
      Solver.process("texas-holdem 4c7cAsKcKd 7s6d 5c3h Td8s 9s2c 4s5d Qs2d 4hTs 6sJs Ks2s"));
  }

  @Test
  public void test_texas_holdem_3456_2d9c9hQhTd_5c7d_9dQs_6h5s_Kh8d_8c3s_ThTc() {
    assertEquals(
      "6h5s 5c7d 8c3s Kh8d 9dQs ThTc",
      Solver.process("texas-holdem 2d9c9hQhTd 5c7d 9dQs 6h5s Kh8d 8c3s ThTc"));
  }

  @Test
  public void test_texas_holdem_3457_4d6c6d6hQc_2sTc_4sJc_Th5s_QhAh_8c8s() {
    assertEquals(
      "2sTc=Th5s 4sJc 8c8s QhAh",
      Solver.process("texas-holdem 4d6c6d6hQc 2sTc 4sJc Th5s QhAh 8c8s"));
  }

  @Test
  public void test_texas_holdem_3458_2c7s9hQcQd_6dKs_3s3h_AsKc_KdJh() {
    assertEquals(
      "6dKs KdJh AsKc 3s3h",
      Solver.process("texas-holdem 2c7s9hQcQd 6dKs 3s3h AsKc KdJh"));
  }

  @Test
  public void test_texas_holdem_3459_5h7sAdJdQc_AsTd_9c8h_Kc8s_Kh3h_3s8c_4h2d_Jc9s_Ks9h_5c9d() {
    assertEquals(
      "4h2d 3s8c 9c8h Kh3h Kc8s Ks9h 5c9d Jc9s AsTd",
      Solver.process("texas-holdem 5h7sAdJdQc AsTd 9c8h Kc8s Kh3h 3s8c 4h2d Jc9s Ks9h 5c9d"));
  }

  @Test
  public void test_texas_holdem_3460_7h9d9hQhTs_As5s_2hJs_6d7d_6hKh_7sQd_Ah7c_TdQs_8d4h() {
    assertEquals(
      "8d4h 2hJs As5s 6d7d Ah7c 7sQd TdQs 6hKh",
      Solver.process("texas-holdem 7h9d9hQhTs As5s 2hJs 6d7d 6hKh 7sQd Ah7c TdQs 8d4h"));
  }

  @Test
  public void test_texas_holdem_3461_5h7dJdQdTc_AhQs_As7s_QcJc_3s9s_2h6d_9cTh_Td3c() {
    assertEquals(
      "2h6d 3s9s As7s Td3c 9cTh AhQs QcJc",
      Solver.process("texas-holdem 5h7dJdQdTc AhQs As7s QcJc 3s9s 2h6d 9cTh Td3c"));
  }

  @Test
  public void test_texas_holdem_3462_4h7dJsQhTd_4sJh_7hKs() {
    assertEquals(
      "7hKs 4sJh",
      Solver.process("texas-holdem 4h7dJsQhTd 4sJh 7hKs"));
  }

  @Test
  public void test_texas_holdem_3463_4c9sAsJdJh_2c3s_4h3h_QhTh_TdTs_4sAd_8h6c_7cKd() {
    assertEquals(
      "2c3s 8h6c QhTh 7cKd 4h3h TdTs 4sAd",
      Solver.process("texas-holdem 4c9sAsJdJh 2c3s 4h3h QhTh TdTs 4sAd 8h6c 7cKd"));
  }

  @Test
  public void test_texas_holdem_3464_7h9dJcKdTc_4d4h_9sAs_7c3s_2cKh_5s6d_8h8d_JdAc_9cAh_Qc5c() {
    assertEquals(
      "5s6d 4d4h 7c3s 9cAh=9sAs JdAc 2cKh 8h8d Qc5c",
      Solver.process("texas-holdem 7h9dJcKdTc 4d4h 9sAs 7c3s 2cKh 5s6d 8h8d JdAc 9cAh Qc5c"));
  }

  @Test
  public void test_texas_holdem_3465_2h6h6s7cJs_7dTd_Ac8h() {
    assertEquals(
      "Ac8h 7dTd",
      Solver.process("texas-holdem 2h6h6s7cJs 7dTd Ac8h"));
  }

  @Test
  public void test_texas_holdem_3466_2d4d9dQcTs_As4c_5c8d_JcKs() {
    assertEquals(
      "5c8d As4c JcKs",
      Solver.process("texas-holdem 2d4d9dQcTs As4c 5c8d JcKs"));
  }

  @Test
  public void test_texas_holdem_3467_4h9hAcAdKc_5sQs_5d2c_6hQc_AhKh_9s4c_Ks3s_Jc2d_7c4d() {
    assertEquals(
      "5d2c Jc2d 5sQs=6hQc 7c4d 9s4c Ks3s AhKh",
      Solver.process("texas-holdem 4h9hAcAdKc 5sQs 5d2c 6hQc AhKh 9s4c Ks3s Jc2d 7c4d"));
  }

  @Test
  public void test_texas_holdem_3468_7s8h9dAcJd_TdKh_6hQc_4h8c_2d2h_4sAh() {
    assertEquals(
      "6hQc 2d2h 4h8c 4sAh TdKh",
      Solver.process("texas-holdem 7s8h9dAcJd TdKh 6hQc 4h8c 2d2h 4sAh"));
  }

  @Test
  public void test_texas_holdem_3469_4c4d7d7sQs_2sJd_AdQd_QhKs_6cKd_7h5s_QcTs_5c9s_Jh8h() {
    assertEquals(
      "2sJd=5c9s=Jh8h 6cKd QcTs QhKs AdQd 7h5s",
      Solver.process("texas-holdem 4c4d7d7sQs 2sJd AdQd QhKs 6cKd 7h5s QcTs 5c9s Jh8h"));
  }

  @Test
  public void test_texas_holdem_3470_2h5c5dAcTs_3h8s_Th4s_4dJh_8dAh_Qh5h_JcJd_6d2c() {
    assertEquals(
      "3h8s 4dJh 6d2c Th4s JcJd 8dAh Qh5h",
      Solver.process("texas-holdem 2h5c5dAcTs 3h8s Th4s 4dJh 8dAh Qh5h JcJd 6d2c"));
  }

  @Test
  public void test_texas_holdem_3471_3c5d7cAcKh_7d8h_3dAs_Td2s() {
    assertEquals(
      "Td2s 7d8h 3dAs",
      Solver.process("texas-holdem 3c5d7cAcKh 7d8h 3dAs Td2s"));
  }

  @Test
  public void test_texas_holdem_3472_2s4s8hKcTc_5s4h_9d9h_Qd6d_5h7h_4c6h_Qs6c_2dKs() {
    assertEquals(
      "5h7h Qd6d=Qs6c 4c6h=5s4h 9d9h 2dKs",
      Solver.process("texas-holdem 2s4s8hKcTc 5s4h 9d9h Qd6d 5h7h 4c6h Qs6c 2dKs"));
  }

  @Test
  public void test_texas_holdem_3473_4s6s7sQdQh_KcJs_4h4d_7dTh_Jc3d_6h8h_Kd7c() {
    assertEquals(
      "Jc3d KcJs 6h8h 7dTh Kd7c 4h4d",
      Solver.process("texas-holdem 4s6s7sQdQh KcJs 4h4d 7dTh Jc3d 6h8h Kd7c"));
  }

  @Test
  public void test_texas_holdem_3474_3h6c6hAcAh_Ts5c_5sQd_9s4c_3s3d_Qs2h_2d6s_6d9d_2cJc_7h5d() {
    assertEquals(
      "7h5d 9s4c Ts5c 2cJc 5sQd=Qs2h 3s3d 2d6s=6d9d",
      Solver.process("texas-holdem 3h6c6hAcAh Ts5c 5sQd 9s4c 3s3d Qs2h 2d6s 6d9d 2cJc 7h5d"));
  }

  @Test
  public void test_texas_holdem_3475_2c7s9dAhJh_7d5d_7c6c_Jc3d_6d7h() {
    assertEquals(
      "6d7h=7c6c=7d5d Jc3d",
      Solver.process("texas-holdem 2c7s9dAhJh 7d5d 7c6c Jc3d 6d7h"));
  }

  @Test
  public void test_texas_holdem_3476_4s6hJcKdTh_2s4d_7h2c_Qh8s_Ac5s_Ks3c() {
    assertEquals(
      "7h2c Qh8s Ac5s 2s4d Ks3c",
      Solver.process("texas-holdem 4s6hJcKdTh 2s4d 7h2c Qh8s Ac5s Ks3c"));
  }

  @Test
  public void test_texas_holdem_3477_3c5d6d6sKd_2cTc_7cQc_9d4c_QsAd() {
    assertEquals(
      "9d4c 2cTc 7cQc QsAd",
      Solver.process("texas-holdem 3c5d6d6sKd 2cTc 7cQc 9d4c QsAd"));
  }

  @Test
  public void test_texas_holdem_3478_2sAcAdAhJd_Qd6h_Js4c_8c7h_9sTc_5s3c_7d5c_2c6d_3d9d() {
    assertEquals(
      "5s3c 7d5c 8c7h 3d9d 9sTc Qd6h 2c6d Js4c",
      Solver.process("texas-holdem 2sAcAdAhJd Qd6h Js4c 8c7h 9sTc 5s3c 7d5c 2c6d 3d9d"));
  }

  @Test
  public void test_texas_holdem_3479_4c6c6hKhKs_AcTc_Jc7s_JdKd_9d2s_9s5h_2h8c_4dAd_3c6s_Js2d() {
    assertEquals(
      "2h8c 9d2s=9s5h Jc7s=Js2d 4dAd=AcTc 3c6s JdKd",
      Solver.process("texas-holdem 4c6c6hKhKs AcTc Jc7s JdKd 9d2s 9s5h 2h8c 4dAd 3c6s Js2d"));
  }

  @Test
  public void test_texas_holdem_3480_3d6s7d7hKh_6c9h_QhTh_Qs5s() {
    assertEquals(
      "Qs5s QhTh 6c9h",
      Solver.process("texas-holdem 3d6s7d7hKh 6c9h QhTh Qs5s"));
  }

  @Test
  public void test_texas_holdem_3481_3h6c7hAsJc_4s6d_QhJs_7cAh_Ts3s_Qd8c_2s5h_4c4d_TdTh() {
    assertEquals(
      "2s5h Qd8c Ts3s 4c4d 4s6d TdTh QhJs 7cAh",
      Solver.process("texas-holdem 3h6c7hAsJc 4s6d QhJs 7cAh Ts3s Qd8c 2s5h 4c4d TdTh"));
  }

  @Test
  public void test_texas_holdem_3482_3d3s5c8cJh_Kd4h_Jd2s_TdAs_QdQh_6s9c_5sTs_Ks5h() {
    assertEquals(
      "6s9c Kd4h TdAs 5sTs Ks5h Jd2s QdQh",
      Solver.process("texas-holdem 3d3s5c8cJh Kd4h Jd2s TdAs QdQh 6s9c 5sTs Ks5h"));
  }

  @Test
  public void test_texas_holdem_3483_6dAcJsQdQh_7c9h_QsKs_Ad7h_2c4c_8cJd_5h4h() {
    assertEquals(
      "2c4c=5h4h 7c9h 8cJd Ad7h QsKs",
      Solver.process("texas-holdem 6dAcJsQdQh 7c9h QsKs Ad7h 2c4c 8cJd 5h4h"));
  }

  @Test
  public void test_texas_holdem_3484_4c7h8h8s9h_As5c_4d2c_QdQh_KdKc_3h7s() {
    assertEquals(
      "As5c 4d2c 3h7s QdQh KdKc",
      Solver.process("texas-holdem 4c7h8h8s9h As5c 4d2c QdQh KdKc 3h7s"));
  }

  @Test
  public void test_texas_holdem_3485_3s6c6d9dJc_AcKc_5d8c_2hKh_6h7s_7cJh_5h9s_TcAh_Qs8h_QdQh() {
    assertEquals(
      "5d8c Qs8h 2hKh TcAh AcKc 5h9s 7cJh QdQh 6h7s",
      Solver.process("texas-holdem 3s6c6d9dJc AcKc 5d8c 2hKh 6h7s 7cJh 5h9s TcAh Qs8h QdQh"));
  }

  @Test
  public void test_texas_holdem_3486_6d7c7hQhTd_4s8s_9hTs_Ad8d_9sQc_Qd3h_Qs3s() {
    assertEquals(
      "4s8s Ad8d 9hTs 9sQc=Qd3h=Qs3s",
      Solver.process("texas-holdem 6d7c7hQhTd 4s8s 9hTs Ad8d 9sQc Qd3h Qs3s"));
  }

  @Test
  public void test_texas_holdem_3487_4h5c7cQhTc_AcJs_TsJh_KhTh() {
    assertEquals(
      "AcJs TsJh KhTh",
      Solver.process("texas-holdem 4h5c7cQhTc AcJs TsJh KhTh"));
  }

  @Test
  public void test_texas_holdem_3488_4c5s9dTdTs_Ah3d_2s7d_QdAc_9s2d() {
    assertEquals(
      "2s7d Ah3d QdAc 9s2d",
      Solver.process("texas-holdem 4c5s9dTdTs Ah3d 2s7d QdAc 9s2d"));
  }

  @Test
  public void test_texas_holdem_3489_2h4c6s9sQs_5c2c_AcJs_3dQh_TcKs_8d5h() {
    assertEquals(
      "8d5h TcKs AcJs 5c2c 3dQh",
      Solver.process("texas-holdem 2h4c6s9sQs 5c2c AcJs 3dQh TcKs 8d5h"));
  }

  @Test
  public void test_texas_holdem_3490_2c2h3cJdKs_Ts5d_3d9c_9h7d_AhQd_Qs8d() {
    assertEquals(
      "9h7d Ts5d Qs8d AhQd 3d9c",
      Solver.process("texas-holdem 2c2h3cJdKs Ts5d 3d9c 9h7d AhQd Qs8d"));
  }

  @Test
  public void test_texas_holdem_3491_2h7h9hTcTd_5c5d_3c2s() {
    assertEquals(
      "3c2s 5c5d",
      Solver.process("texas-holdem 2h7h9hTcTd 5c5d 3c2s"));
  }

  @Test
  public void test_texas_holdem_3492_4h8sAcKcTc_6cJh_4c3d_Qc9s_Kd8c_3hQs_Td5d_JcJs_4sTh_Qh6h() {
    assertEquals(
      "6cJh 3hQs=Qh6h Qc9s 4c3d Td5d JcJs 4sTh Kd8c",
      Solver.process("texas-holdem 4h8sAcKcTc 6cJh 4c3d Qc9s Kd8c 3hQs Td5d JcJs 4sTh Qh6h"));
  }

  @Test
  public void test_texas_holdem_3493_2c3dJdQhTs_TdJs_3h6c_9sAs_7cTh() {
    assertEquals(
      "9sAs 3h6c 7cTh TdJs",
      Solver.process("texas-holdem 2c3dJdQhTs TdJs 3h6c 9sAs 7cTh"));
  }

  @Test
  public void test_texas_holdem_3494_5s6cAcKdTh_9hJc_4h3d_2d3c_9sTs_4d8s() {
    assertEquals(
      "2d3c=4h3d 4d8s 9hJc 9sTs",
      Solver.process("texas-holdem 5s6cAcKdTh 9hJc 4h3d 2d3c 9sTs 4d8s"));
  }

  @Test
  public void test_texas_holdem_3495_2c5d8h8sKs_Tc7c_7d9c_2d4c_9h6s_2hTh_JhJc_KcQs() {
    assertEquals(
      "9h6s 7d9c Tc7c 2d4c=2hTh JhJc KcQs",
      Solver.process("texas-holdem 2c5d8h8sKs Tc7c 7d9c 2d4c 9h6s 2hTh JhJc KcQs"));
  }

  @Test
  public void test_texas_holdem_3496_2d2h3d4c8d_8cKc_AdTd_AcJc() {
    assertEquals(
      "AcJc 8cKc AdTd",
      Solver.process("texas-holdem 2d2h3d4c8d 8cKc AdTd AcJc"));
  }

  @Test
  public void test_texas_holdem_3497_2s5d5s8c9s_Th4d_3d7s_7h4c_Qc8s_7cAd_AhJc_4sTc_5h6d() {
    assertEquals(
      "3d7s=7h4c 4sTc=Th4d 7cAd AhJc Qc8s 5h6d",
      Solver.process("texas-holdem 2s5d5s8c9s Th4d 3d7s 7h4c Qc8s 7cAd AhJc 4sTc 5h6d"));
  }

  @Test
  public void test_texas_holdem_3498_3c7c9cJdJh_Qh8s_4sTc_Kd2s_QcKh_9d7s_9h5h() {
    assertEquals(
      "4sTc Qh8s Kd2s QcKh 9d7s=9h5h",
      Solver.process("texas-holdem 3c7c9cJdJh Qh8s 4sTc Kd2s QcKh 9d7s 9h5h"));
  }

  @Test
  public void test_texas_holdem_3499_2h5h7cJcTd_6hQh_5dQs_AdJh_2sAh_6s4c_Ac5s_7h2c_ThJs() {
    assertEquals(
      "6s4c 6hQh 2sAh 5dQs Ac5s AdJh 7h2c ThJs",
      Solver.process("texas-holdem 2h5h7cJcTd 6hQh 5dQs AdJh 2sAh 6s4c Ac5s 7h2c ThJs"));
  }

}
