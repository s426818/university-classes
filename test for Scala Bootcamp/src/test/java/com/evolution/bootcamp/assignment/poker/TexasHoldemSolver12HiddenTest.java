
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TexasHoldemSolver12HiddenTest {


  @Test
  public void test_texas_holdem_3000_4c9cAcKdKh_8sJs_8c2c() {
    assertEquals(
      "8sJs 8c2c",
      Solver.process("texas-holdem 4c9cAcKdKh 8sJs 8c2c"));
  }

  @Test
  public void test_texas_holdem_3001_4c4s5d5sKd_TdTh_9d2c_4h5c_Qc6s_8c8h_Ks9h_7d3c_QsJd() {
    assertEquals(
      "7d3c=9d2c=Qc6s=QsJd 8c8h TdTh Ks9h 4h5c",
      Solver.process("texas-holdem 4c4s5d5sKd TdTh 9d2c 4h5c Qc6s 8c8h Ks9h 7d3c QsJd"));
  }

  @Test
  public void test_texas_holdem_3002_6h6sJhJsTs_3s4d_Th7c_2cQc_4hQh_Qs2s_8c5d_5s4c_Kh3h_Qd3c() {
    assertEquals(
      "3s4d=5s4c=8c5d 2cQc=4hQh=Qd3c Kh3h Th7c Qs2s",
      Solver.process("texas-holdem 6h6sJhJsTs 3s4d Th7c 2cQc 4hQh Qs2s 8c5d 5s4c Kh3h Qd3c"));
  }

  @Test
  public void test_texas_holdem_3003_2c3h3s5d8c_4c6c_8h3d_8sKh_7s2d_8d6s_2sAh_3cJs_TcAc_7d6h() {
    assertEquals(
      "7d6h TcAc 7s2d 2sAh 8d6s 8sKh 3cJs 4c6c 8h3d",
      Solver.process("texas-holdem 2c3h3s5d8c 4c6c 8h3d 8sKh 7s2d 8d6s 2sAh 3cJs TcAc 7d6h"));
  }

  @Test
  public void test_texas_holdem_3004_6d7hAcKhQh_Ah5d_3h6s() {
    assertEquals(
      "3h6s Ah5d",
      Solver.process("texas-holdem 6d7hAcKhQh Ah5d 3h6s"));
  }

  @Test
  public void test_texas_holdem_3005_4c4h7hJhQc_KsTs_5cAs_3c6d_Qh3d_5d2h_2d9c_4d8c_8d6h() {
    assertEquals(
      "3c6d=5d2h 8d6h 2d9c KsTs 5cAs Qh3d 4d8c",
      Solver.process("texas-holdem 4c4h7hJhQc KsTs 5cAs 3c6d Qh3d 5d2h 2d9c 4d8c 8d6h"));
  }

  @Test
  public void test_texas_holdem_3006_2s9sAcKhQh_Jd4d_8s2d_TdJh_3s2h_Jc7h_8c9c_8hQs() {
    assertEquals(
      "Jc7h=Jd4d 3s2h=8s2d 8c9c 8hQs TdJh",
      Solver.process("texas-holdem 2s9sAcKhQh Jd4d 8s2d TdJh 3s2h Jc7h 8c9c 8hQs"));
  }

  @Test
  public void test_texas_holdem_3007_4s5s7dQdQh_6sAd_QsKc() {
    assertEquals(
      "6sAd QsKc",
      Solver.process("texas-holdem 4s5s7dQdQh 6sAd QsKc"));
  }

  @Test
  public void test_texas_holdem_3008_5d5s6hKsQs_Tc6s_2hAh_9s7h() {
    assertEquals(
      "9s7h 2hAh Tc6s",
      Solver.process("texas-holdem 5d5s6hKsQs Tc6s 2hAh 9s7h"));
  }

  @Test
  public void test_texas_holdem_3009_2d5h7hJhTs_5c6c_2cJd_Qc9h_Kh2h() {
    assertEquals(
      "Qc9h 5c6c 2cJd Kh2h",
      Solver.process("texas-holdem 2d5h7hJhTs 5c6c 2cJd Qc9h Kh2h"));
  }

  @Test
  public void test_texas_holdem_3010_2h5hAsKdQd_8dJd_QhJc_9s3c_6d7d_Qs2c() {
    assertEquals(
      "6d7d 9s3c 8dJd QhJc Qs2c",
      Solver.process("texas-holdem 2h5hAsKdQd 8dJd QhJc 9s3c 6d7d Qs2c"));
  }

  @Test
  public void test_texas_holdem_3011_5h7d8d9dQc_8c4h_9cJs_4d6d_8s3d_AsJc_Ah2h() {
    assertEquals(
      "Ah2h AsJc 8c4h=8s3d 9cJs 4d6d",
      Solver.process("texas-holdem 5h7d8d9dQc 8c4h 9cJs 4d6d 8s3d AsJc Ah2h"));
  }

  @Test
  public void test_texas_holdem_3012_4s6c9cJsTc_Kd5d_8c2s_QhTs_Jh8s_5c5s_KhQs_AcAh_9d8h() {
    assertEquals(
      "8c2s Kd5d 5c5s 9d8h QhTs Jh8s AcAh KhQs",
      Solver.process("texas-holdem 4s6c9cJsTc Kd5d 8c2s QhTs Jh8s 5c5s KhQs AcAh 9d8h"));
  }

  @Test
  public void test_texas_holdem_3013_2d2sAcKhTs_7sKd_5cTc_AdJd_Jh9d_Qs6h_3s6s_9c3d() {
    assertEquals(
      "3s6s=9c3d Jh9d Qs6h 5cTc 7sKd AdJd",
      Solver.process("texas-holdem 2d2sAcKhTs 7sKd 5cTc AdJd Jh9d Qs6h 3s6s 9c3d"));
  }

  @Test
  public void test_texas_holdem_3014_3h6h6s9sJs_Ad4c_2cKc_8h5d_5c3s_Ac3d_Tc9d() {
    assertEquals(
      "8h5d 2cKc Ad4c 5c3s Ac3d Tc9d",
      Solver.process("texas-holdem 3h6h6s9sJs Ad4c 2cKc 8h5d 5c3s Ac3d Tc9d"));
  }

  @Test
  public void test_texas_holdem_3015_2d7d8s9cAs_7s9h_6s5d_ThQd_Ad8d_6hJd_4sTd() {
    assertEquals(
      "4sTd 6hJd ThQd 7s9h Ad8d 6s5d",
      Solver.process("texas-holdem 2d7d8s9cAs 7s9h 6s5d ThQd Ad8d 6hJd 4sTd"));
  }

  @Test
  public void test_texas_holdem_3016_4d4h5h7cTc_2d5d_4sQh_8h2c_QcAd_4c3d_7d2h() {
    assertEquals(
      "8h2c QcAd 2d5d 7d2h 4c3d 4sQh",
      Solver.process("texas-holdem 4d4h5h7cTc 2d5d 4sQh 8h2c QcAd 4c3d 7d2h"));
  }

  @Test
  public void test_texas_holdem_3017_2h3c9sQhTh_5s2s_Jh3h() {
    assertEquals(
      "5s2s Jh3h",
      Solver.process("texas-holdem 2h3c9sQhTh 5s2s Jh3h"));
  }

  @Test
  public void test_texas_holdem_3018_5d6hAdAhJs_3cTh_Qh2c_3h4d_QcKh_5s7h_KdQd_4cTc_6c4h_AcJh() {
    assertEquals(
      "3h4d 3cTh=4cTc Qh2c KdQd=QcKh 5s7h 6c4h AcJh",
      Solver.process("texas-holdem 5d6hAdAhJs 3cTh Qh2c 3h4d QcKh 5s7h KdQd 4cTc 6c4h AcJh"));
  }

  @Test
  public void test_texas_holdem_3019_7c7d8s9d9s_3cQc_3d4s_TcTs_9h6c_QhKc() {
    assertEquals(
      "3d4s 3cQc QhKc TcTs 9h6c",
      Solver.process("texas-holdem 7c7d8s9d9s 3cQc 3d4s TcTs 9h6c QhKc"));
  }

  @Test
  public void test_texas_holdem_3020_6s7d7s8hQh_5d5s_3hTc_Js8s_2h7h_4s7c_Ah6d_Qs4c() {
    assertEquals(
      "3hTc 5d5s Ah6d Js8s Qs4c 2h7h=4s7c",
      Solver.process("texas-holdem 6s7d7s8hQh 5d5s 3hTc Js8s 2h7h 4s7c Ah6d Qs4c"));
  }

  @Test
  public void test_texas_holdem_3021_9sKsQsTdTs_4h5c_Qd7c_KdQc_6d8c_2dJc_5s5h_8s4s_AsJd() {
    assertEquals(
      "4h5c=6d8c Qd7c KdQc 2dJc 5s5h 8s4s AsJd",
      Solver.process("texas-holdem 9sKsQsTdTs 4h5c Qd7c KdQc 6d8c 2dJc 5s5h 8s4s AsJd"));
  }

  @Test
  public void test_texas_holdem_3022_2h4h7sKcQd_3dJc_QhTd_4d8c() {
    assertEquals(
      "3dJc 4d8c QhTd",
      Solver.process("texas-holdem 2h4h7sKcQd 3dJc QhTd 4d8c"));
  }

  @Test
  public void test_texas_holdem_3023_2s9sJcJdKc_KsKh_Jh9d_7cKd_8s4c_3c6d_6c2h_Ac6h_Ah2d() {
    assertEquals(
      "3c6d 8s4c Ac6h 6c2h Ah2d 7cKd Jh9d KsKh",
      Solver.process("texas-holdem 2s9sJcJdKc KsKh Jh9d 7cKd 8s4c 3c6d 6c2h Ac6h Ah2d"));
  }

  @Test
  public void test_texas_holdem_3024_3c5s6hAcQd_4hJs_9c2h_Tc3s_5d4d_Td9d() {
    assertEquals(
      "9c2h Td9d 4hJs Tc3s 5d4d",
      Solver.process("texas-holdem 3c5s6hAcQd 4hJs 9c2h Tc3s 5d4d Td9d"));
  }

  @Test
  public void test_texas_holdem_3025_2hAcJdQcQd_7d5h_Ts2s_8h2c_Ks2d_9hKc_Ah4h_JhTh_8d3d() {
    assertEquals(
      "7d5h 8d3d 9hKc 8h2c=Ks2d=Ts2s JhTh Ah4h",
      Solver.process("texas-holdem 2hAcJdQcQd 7d5h Ts2s 8h2c Ks2d 9hKc Ah4h JhTh 8d3d"));
  }

  @Test
  public void test_texas_holdem_3026_8s9hAcKhTs_Ad9d_5s7d_3dQc_2h4h_Jd2d_3s3h_QdJh_5h4c() {
    assertEquals(
      "2h4h=5h4c=5s7d Jd2d 3dQc 3s3h Ad9d QdJh",
      Solver.process("texas-holdem 8s9hAcKhTs Ad9d 5s7d 3dQc 2h4h Jd2d 3s3h QdJh 5h4c"));
  }

  @Test
  public void test_texas_holdem_3027_2c6d9c9sQc_3hTd_4d4s_4h5d_7d9h_JsJh_TsTc_Ah2s_AsAc() {
    assertEquals(
      "4h5d 3hTd Ah2s 4d4s TsTc JsJh AsAc 7d9h",
      Solver.process("texas-holdem 2c6d9c9sQc 3hTd 4d4s 4h5d 7d9h JsJh TsTc Ah2s AsAc"));
  }

  @Test
  public void test_texas_holdem_3028_2s3s8h9sQh_AsQs_AhQd_9d4d_Kd7c() {
    assertEquals(
      "Kd7c 9d4d AhQd AsQs",
      Solver.process("texas-holdem 2s3s8h9sQh AsQs AhQd 9d4d Kd7c"));
  }

  @Test
  public void test_texas_holdem_3029_2c2s8dAsJs_8h2d_6c9h_4d7c_Jh5d_Kd8c_3h9c_3d2h() {
    assertEquals(
      "4d7c 3h9c=6c9h Kd8c Jh5d 3d2h 8h2d",
      Solver.process("texas-holdem 2c2s8dAsJs 8h2d 6c9h 4d7c Jh5d Kd8c 3h9c 3d2h"));
  }

  @Test
  public void test_texas_holdem_3030_4h5s7c8dAd_9c6h_2dTd_Jd9d_3c8s() {
    assertEquals(
      "2dTd Jd9d 3c8s 9c6h",
      Solver.process("texas-holdem 4h5s7c8dAd 9c6h 2dTd Jd9d 3c8s"));
  }

  @Test
  public void test_texas_holdem_3031_3h6s9dAcTc_Ks9s_AdJs_Kd4d_Qd7h_7s4h_9cJh_QhTh_5c7d_Ah8s() {
    assertEquals(
      "5c7d=7s4h Qd7h Kd4d 9cJh Ks9s QhTh Ah8s AdJs",
      Solver.process("texas-holdem 3h6s9dAcTc Ks9s AdJs Kd4d Qd7h 7s4h 9cJh QhTh 5c7d Ah8s"));
  }

  @Test
  public void test_texas_holdem_3032_2h3c4s8sQc_KsJs_2s9s_3s7c_Ts8h_2c5s_7d7s_9dTc() {
    assertEquals(
      "9dTc KsJs 2c5s 2s9s 3s7c 7d7s Ts8h",
      Solver.process("texas-holdem 2h3c4s8sQc KsJs 2s9s 3s7c Ts8h 2c5s 7d7s 9dTc"));
  }

  @Test
  public void test_texas_holdem_3033_5c8hAcQhTd_4d7d_9sJd_Jh2c_Qc8s() {
    assertEquals(
      "4d7d Jh2c Qc8s 9sJd",
      Solver.process("texas-holdem 5c8hAcQhTd 4d7d 9sJd Jh2c Qc8s"));
  }

  @Test
  public void test_texas_holdem_3034_3d9hKsQdQh_3h2s_JcJh_6h8h_7s5s_3s4c_9d6s() {
    assertEquals(
      "7s5s 6h8h 3h2s=3s4c 9d6s JcJh",
      Solver.process("texas-holdem 3d9hKsQdQh 3h2s JcJh 6h8h 7s5s 3s4c 9d6s"));
  }

  @Test
  public void test_texas_holdem_3035_2d7d7s8c9s_JcKh_9cAd_6s4d_Qd5c() {
    assertEquals(
      "6s4d Qd5c JcKh 9cAd",
      Solver.process("texas-holdem 2d7d7s8c9s JcKh 9cAd 6s4d Qd5c"));
  }

  @Test
  public void test_texas_holdem_3036_7h8cJhQhTh_4cJd_6c8s_Kd8d_2h3d_Kc9c_4d3h_Tc6s() {
    assertEquals(
      "6c8s Kd8d Tc6s 4cJd Kc9c 2h3d 4d3h",
      Solver.process("texas-holdem 7h8cJhQhTh 4cJd 6c8s Kd8d 2h3d Kc9c 4d3h Tc6s"));
  }

  @Test
  public void test_texas_holdem_3037_2c2h3hJsQd_Ts3c_7s5s() {
    assertEquals(
      "7s5s Ts3c",
      Solver.process("texas-holdem 2c2h3hJsQd Ts3c 7s5s"));
  }

  @Test
  public void test_texas_holdem_3038_2h5s7cKcTh_2cAc_8c4s_2sAs_8h2d_Tc3d_3s4c_3c9s_6h4d() {
    assertEquals(
      "3s4c 6h4d 8c4s 3c9s 8h2d 2cAc=2sAs Tc3d",
      Solver.process("texas-holdem 2h5s7cKcTh 2cAc 8c4s 2sAs 8h2d Tc3d 3s4c 3c9s 6h4d"));
  }

  @Test
  public void test_texas_holdem_3039_2c4d5hJcQd_5s5c_8h6c() {
    assertEquals(
      "8h6c 5s5c",
      Solver.process("texas-holdem 2c4d5hJcQd 5s5c 8h6c"));
  }

  @Test
  public void test_texas_holdem_3040_5d8c9sQcTh_4c7c_6d3d_Qh3h_9c5h_4s2h() {
    assertEquals(
      "4s2h 6d3d 4c7c Qh3h 9c5h",
      Solver.process("texas-holdem 5d8c9sQcTh 4c7c 6d3d Qh3h 9c5h 4s2h"));
  }

  @Test
  public void test_texas_holdem_3041_3c3h5d7cQd_Ad6s_5sQc_2c3s() {
    assertEquals(
      "Ad6s 5sQc 2c3s",
      Solver.process("texas-holdem 3c3h5d7cQd Ad6s 5sQc 2c3s"));
  }

  @Test
  public void test_texas_holdem_3042_4h6s7dAdKc_7h5d_Ks5s_JsJd_6c2h_8s8d() {
    assertEquals(
      "6c2h 7h5d 8s8d JsJd Ks5s",
      Solver.process("texas-holdem 4h6s7dAdKc 7h5d Ks5s JsJd 6c2h 8s8d"));
  }

  @Test
  public void test_texas_holdem_3043_2h5h8c9dKc_6d9h_QdJh_8hKh_AdQs_3d7h_KdAs_5dJd_Ts6c_7s2s() {
    assertEquals(
      "3d7h Ts6c QdJh AdQs 7s2s 5dJd 6d9h KdAs 8hKh",
      Solver.process("texas-holdem 2h5h8c9dKc 6d9h QdJh 8hKh AdQs 3d7h KdAs 5dJd Ts6c 7s2s"));
  }

  @Test
  public void test_texas_holdem_3044_6h6s9cAcKs_AdAs_9h7d_2h5d_2sJd_4cQh_8c9d_Js2c_Qc3d() {
    assertEquals(
      "2h5d 2sJd=Js2c 4cQh=Qc3d 8c9d=9h7d AdAs",
      Solver.process("texas-holdem 6h6s9cAcKs AdAs 9h7d 2h5d 2sJd 4cQh 8c9d Js2c Qc3d"));
  }

  @Test
  public void test_texas_holdem_3045_2d4cAsKsTc_6c3c_Ad2s_Ah8h_QhKh_QdQc_Th2h_6d5h_Kc9h_4d7c() {
    assertEquals(
      "6c3c 6d5h 4d7c QdQc Kc9h QhKh Ah8h Th2h Ad2s",
      Solver.process("texas-holdem 2d4cAsKsTc 6c3c Ad2s Ah8h QhKh QdQc Th2h 6d5h Kc9h 4d7c"));
  }

  @Test
  public void test_texas_holdem_3046_2c5d7hJcKh_Qs5h_4cTh_AdTd_2hAh_4d6d_5s6c_9c9d_Ac4s() {
    assertEquals(
      "4d6d 4cTh Ac4s AdTd 2hAh 5s6c Qs5h 9c9d",
      Solver.process("texas-holdem 2c5d7hJcKh Qs5h 4cTh AdTd 2hAh 4d6d 5s6c 9c9d Ac4s"));
  }

  @Test
  public void test_texas_holdem_3047_2h3c8cJhTh_9h4d_KdAh_2d3d_9dKs() {
    assertEquals(
      "9h4d 9dKs KdAh 2d3d",
      Solver.process("texas-holdem 2h3c8cJhTh 9h4d KdAh 2d3d 9dKs"));
  }

  @Test
  public void test_texas_holdem_3048_4h6d7cAsJs_3sQh_2hJc_Kh7h_QcKc_3cJd() {
    assertEquals(
      "3sQh QcKc Kh7h 2hJc=3cJd",
      Solver.process("texas-holdem 4h6d7cAsJs 3sQh 2hJc Kh7h QcKc 3cJd"));
  }

  @Test
  public void test_texas_holdem_3049_2h2s5s7d7s_2dJh_JdKh_3s9d_3c9c_8c4c_6c6s_7c6h_KsQc_Qh5h() {
    assertEquals(
      "8c4c 3c9c=3s9d JdKh=KsQc Qh5h 6c6s 2dJh 7c6h",
      Solver.process("texas-holdem 2h2s5s7d7s 2dJh JdKh 3s9d 3c9c 8c4c 6c6s 7c6h KsQc Qh5h"));
  }

  @Test
  public void test_texas_holdem_3050_2d5sAsJdJs_7h7s_3hTc_Qh9d_4s5h_Ts8d_Kd5d_9h3d_3s6d() {
    assertEquals(
      "3s6d 9h3d 3hTc Ts8d Qh9d 4s5h=Kd5d 7h7s",
      Solver.process("texas-holdem 2d5sAsJdJs 7h7s 3hTc Qh9d 4s5h Ts8d Kd5d 9h3d 3s6d"));
  }

  @Test
  public void test_texas_holdem_3051_2d5c7hAcTd_5s6h_3c4d_7d8s_Ts9s_9d6d_KsQc_6sKh_4h8h() {
    assertEquals(
      "4h8h 9d6d 6sKh KsQc 5s6h 7d8s Ts9s 3c4d",
      Solver.process("texas-holdem 2d5c7hAcTd 5s6h 3c4d 7d8s Ts9s 9d6d KsQc 6sKh 4h8h"));
  }

  @Test
  public void test_texas_holdem_3052_2s4c6sJdJs_5d8h_4d8d_3dAd_7d3s_Td5h_7hKs_KcAc() {
    assertEquals(
      "7d3s 5d8h Td5h 7hKs 3dAd KcAc 4d8d",
      Solver.process("texas-holdem 2s4c6sJdJs 5d8h 4d8d 3dAd 7d3s Td5h 7hKs KcAc"));
  }

  @Test
  public void test_texas_holdem_3053_2s3d6s9dTd_6c2c_4h4d_Jd8d_Kc5h_3h9s() {
    assertEquals(
      "Kc5h 4h4d 6c2c 3h9s Jd8d",
      Solver.process("texas-holdem 2s3d6s9dTd 6c2c 4h4d Jd8d Kc5h 3h9s"));
  }

  @Test
  public void test_texas_holdem_3054_2c5c6hJhKc_Ts5h_6dJc_JdTd_KhAd() {
    assertEquals(
      "Ts5h JdTd KhAd 6dJc",
      Solver.process("texas-holdem 2c5c6hJhKc Ts5h 6dJc JdTd KhAd"));
  }

  @Test
  public void test_texas_holdem_3055_6d7d9sAsTs_9d9h_Jd3s_8dKh_Kd6s_Td5h_8h6c_9c6h() {
    assertEquals(
      "Jd3s Kd6s Td5h 9c6h 9d9h 8dKh=8h6c",
      Solver.process("texas-holdem 6d7d9sAsTs 9d9h Jd3s 8dKh Kd6s Td5h 8h6c 9c6h"));
  }

  @Test
  public void test_texas_holdem_3056_2h5c6c6h7h_4d2c_2sJc_KhQh() {
    assertEquals(
      "4d2c 2sJc KhQh",
      Solver.process("texas-holdem 2h5c6c6h7h 4d2c 2sJc KhQh"));
  }

  @Test
  public void test_texas_holdem_3057_5d9dAcQsTd_9hKd_4sTs_2h6c() {
    assertEquals(
      "2h6c 9hKd 4sTs",
      Solver.process("texas-holdem 5d9dAcQsTd 9hKd 4sTs 2h6c"));
  }

  @Test
  public void test_texas_holdem_3058_6d7c8hQdQh_KcTh_8dTc_5s2c_5h9c_6c8c_9d2h_5cJd() {
    assertEquals(
      "5s2c 9d2h 5cJd KcTh 6c8c 8dTc 5h9c",
      Solver.process("texas-holdem 6d7c8hQdQh KcTh 8dTc 5s2c 5h9c 6c8c 9d2h 5cJd"));
  }

  @Test
  public void test_texas_holdem_3059_2h4c5hJcKd_Qd2c_Jh7h_2d6c_3s4h_QsJs() {
    assertEquals(
      "2d6c Qd2c 3s4h Jh7h QsJs",
      Solver.process("texas-holdem 2h4c5hJcKd Qd2c Jh7h 2d6c 3s4h QsJs"));
  }

  @Test
  public void test_texas_holdem_3060_2s4d4s6hKc_6c9h_Jd5c_QsKd_8h2d_Ad6s_4hTh_3sAs_7cKs_2h5h() {
    assertEquals(
      "Jd5c 3sAs 2h5h=8h2d 6c9h Ad6s 7cKs QsKd 4hTh",
      Solver.process("texas-holdem 2s4d4s6hKc 6c9h Jd5c QsKd 8h2d Ad6s 4hTh 3sAs 7cKs 2h5h"));
  }

  @Test
  public void test_texas_holdem_3061_8c8dJcJdJs_2c9c_QcKd() {
    assertEquals(
      "2c9c=QcKd",
      Solver.process("texas-holdem 8c8dJcJdJs 2c9c QcKd"));
  }

  @Test
  public void test_texas_holdem_3062_7cAdJdQcTd_8s3c_4h7s_KsTc_JsTs_2c8d_9c5c() {
    assertEquals(
      "2c8d=8s3c 9c5c 4h7s JsTs KsTc",
      Solver.process("texas-holdem 7cAdJdQcTd 8s3c 4h7s KsTc JsTs 2c8d 9c5c"));
  }

  @Test
  public void test_texas_holdem_3063_2d5h8cTdTs_Ad6s_JhJd_Kd6h_Ah9s_3hKh_QhQs() {
    assertEquals(
      "3hKh Kd6h Ad6s Ah9s JhJd QhQs",
      Solver.process("texas-holdem 2d5h8cTdTs Ad6s JhJd Kd6h Ah9s 3hKh QhQs"));
  }

  @Test
  public void test_texas_holdem_3064_7s9cKcQdQh_Ac5d_3c2d_KdJd_Th5s_4d3s_9s2h() {
    assertEquals(
      "3c2d=4d3s Th5s Ac5d 9s2h KdJd",
      Solver.process("texas-holdem 7s9cKcQdQh Ac5d 3c2d KdJd Th5s 4d3s 9s2h"));
  }

  @Test
  public void test_texas_holdem_3065_7h9h9sJsKh_9d4c_8dAc_2c3h_JdQc() {
    assertEquals(
      "2c3h 8dAc JdQc 9d4c",
      Solver.process("texas-holdem 7h9h9sJsKh 9d4c 8dAc 2c3h JdQc"));
  }

  @Test
  public void test_texas_holdem_3066_3h6dQdQhTc_5dJs_4s9d() {
    assertEquals(
      "4s9d 5dJs",
      Solver.process("texas-holdem 3h6dQdQhTc 5dJs 4s9d"));
  }

  @Test
  public void test_texas_holdem_3067_2h4c6h7h9h_Qc8s_5s4s_Kh8d_QhKs_6d2c() {
    assertEquals(
      "Qc8s 5s4s 6d2c QhKs Kh8d",
      Solver.process("texas-holdem 2h4c6h7h9h Qc8s 5s4s Kh8d QhKs 6d2c"));
  }

  @Test
  public void test_texas_holdem_3068_4h6d9dAdQc_Ah3d_6sTd_2sKh_5dJh_7s8s_8c2d_ThJc() {
    assertEquals(
      "8c2d 7s8s 5dJh ThJc 2sKh 6sTd Ah3d",
      Solver.process("texas-holdem 4h6d9dAdQc Ah3d 6sTd 2sKh 5dJh 7s8s 8c2d ThJc"));
  }

  @Test
  public void test_texas_holdem_3069_5h6c8cJcKs_2s7s_Qh6s_9cJd() {
    assertEquals(
      "2s7s Qh6s 9cJd",
      Solver.process("texas-holdem 5h6c8cJcKs 2s7s Qh6s 9cJd"));
  }

  @Test
  public void test_texas_holdem_3070_3d5h6dAdAs_4h7s_Qs8c_9s4s_5cAh_Qc7c_9c8h() {
    assertEquals(
      "9s4s 9c8h Qc7c Qs8c 4h7s 5cAh",
      Solver.process("texas-holdem 3d5h6dAdAs 4h7s Qs8c 9s4s 5cAh Qc7c 9c8h"));
  }

  @Test
  public void test_texas_holdem_3071_4c5hJcJsKd_5d3d_Ks7d_4hAc_Jd6c_Qh3h_9d5c_2s3c_Qs2c() {
    assertEquals(
      "2s3c Qh3h=Qs2c 4hAc 5d3d=9d5c Ks7d Jd6c",
      Solver.process("texas-holdem 4c5hJcJsKd 5d3d Ks7d 4hAc Jd6c Qh3h 9d5c 2s3c Qs2c"));
  }

  @Test
  public void test_texas_holdem_3072_2c2s5c6dJs_Td7d_KcAd_Qs3c_ThTs_Jc3h_6c7s_7h4d() {
    assertEquals(
      "7h4d Td7d Qs3c KcAd 6c7s ThTs Jc3h",
      Solver.process("texas-holdem 2c2s5c6dJs Td7d KcAd Qs3c ThTs Jc3h 6c7s 7h4d"));
  }

  @Test
  public void test_texas_holdem_3073_6hJcJdJhKd_Qs2d_3c9h_2sQc() {
    assertEquals(
      "3c9h 2sQc=Qs2d",
      Solver.process("texas-holdem 6hJcJdJhKd Qs2d 3c9h 2sQc"));
  }

  @Test
  public void test_texas_holdem_3074_2h5c5h6h8s_Jc3s_7d5d_QhJd_Ac4c_4d9h_6sTs() {
    assertEquals(
      "4d9h Jc3s QhJd Ac4c 6sTs 7d5d",
      Solver.process("texas-holdem 2h5c5h6h8s Jc3s 7d5d QhJd Ac4c 4d9h 6sTs"));
  }

  @Test
  public void test_texas_holdem_3075_3h6s7cJdKh_4hJc_7s3c_QhAd_5cQd_3dKc_6d2h() {
    assertEquals(
      "5cQd QhAd 6d2h 4hJc 7s3c 3dKc",
      Solver.process("texas-holdem 3h6s7cJdKh 4hJc 7s3c QhAd 5cQd 3dKc 6d2h"));
  }

  @Test
  public void test_texas_holdem_3076_8sAsJhKcKd_2s4h_AdAc_KhTc_Th9h_Ah5h_7d5s_Td4s_Qd5c() {
    assertEquals(
      "2s4h=7d5s Td4s=Th9h Qd5c Ah5h KhTc AdAc",
      Solver.process("texas-holdem 8sAsJhKcKd 2s4h AdAc KhTc Th9h Ah5h 7d5s Td4s Qd5c"));
  }

  @Test
  public void test_texas_holdem_3077_2s7h7sAsQh_9s8c_5h6c() {
    assertEquals(
      "5h6c 9s8c",
      Solver.process("texas-holdem 2s7h7sAsQh 9s8c 5h6c"));
  }

  @Test
  public void test_texas_holdem_3078_4c8s9dKdKh_Th3s_Jc8c_Kc7h() {
    assertEquals(
      "Th3s Jc8c Kc7h",
      Solver.process("texas-holdem 4c8s9dKdKh Th3s Jc8c Kc7h"));
  }

  @Test
  public void test_texas_holdem_3079_3c6s8c8sTd_4h5c_3d4s_3s4c_AcAs() {
    assertEquals(
      "4h5c 3d4s=3s4c AcAs",
      Solver.process("texas-holdem 3c6s8c8sTd 4h5c 3d4s 3s4c AcAs"));
  }

  @Test
  public void test_texas_holdem_3080_3d7dKhQcTc_TsAc_2c6s_As4c_4s5d_ThJs_7c3h_QdQh_5h3s() {
    assertEquals(
      "4s5d 2c6s As4c 5h3s ThJs TsAc 7c3h QdQh",
      Solver.process("texas-holdem 3d7dKhQcTc TsAc 2c6s As4c 4s5d ThJs 7c3h QdQh 5h3s"));
  }

  @Test
  public void test_texas_holdem_3081_4c8hAcAdJs_7dQc_6s6h_Kd7c() {
    assertEquals(
      "7dQc Kd7c 6s6h",
      Solver.process("texas-holdem 4c8hAcAdJs 7dQc 6s6h Kd7c"));
  }

  @Test
  public void test_texas_holdem_3082_2d5c6cAdQs_Tc6s_4d7s() {
    assertEquals(
      "4d7s Tc6s",
      Solver.process("texas-holdem 2d5c6cAdQs Tc6s 4d7s"));
  }

  @Test
  public void test_texas_holdem_3083_6h7sKhTdTs_4h6d_5d7h_8c9h_Qc5c_3s3h_7c4c_6sJc() {
    assertEquals(
      "Qc5c 3s3h 4h6d=6sJc 5d7h=7c4c 8c9h",
      Solver.process("texas-holdem 6h7sKhTdTs 4h6d 5d7h 8c9h Qc5c 3s3h 7c4c 6sJc"));
  }

  @Test
  public void test_texas_holdem_3084_4s5h8c9cQh_8hKc_2cKd_Ad2d_3dQc() {
    assertEquals(
      "2cKd Ad2d 8hKc 3dQc",
      Solver.process("texas-holdem 4s5h8c9cQh 8hKc 2cKd Ad2d 3dQc"));
  }

  @Test
  public void test_texas_holdem_3085_6c6h8cAhTs_4d4h_Kc8h_2d3s_4cKd_As4s_AdQh_6s9d_2h7h_8sQc() {
    assertEquals(
      "2d3s=2h7h 4cKd 4d4h 8sQc=Kc8h As4s AdQh 6s9d",
      Solver.process("texas-holdem 6c6h8cAhTs 4d4h Kc8h 2d3s 4cKd As4s AdQh 6s9d 2h7h 8sQc"));
  }

  @Test
  public void test_texas_holdem_3086_6d8s9cQdTd_5s6s_Qs2c() {
    assertEquals(
      "5s6s Qs2c",
      Solver.process("texas-holdem 6d8s9cQdTd 5s6s Qs2c"));
  }

  @Test
  public void test_texas_holdem_3087_2s7d9d9sKc_4sJh_6d6c_5hTd_7sTc() {
    assertEquals(
      "5hTd 4sJh 6d6c 7sTc",
      Solver.process("texas-holdem 2s7d9d9sKc 4sJh 6d6c 5hTd 7sTc"));
  }

  @Test
  public void test_texas_holdem_3088_3s6h9dQdQh_AsTc_3hTh_2s8c_Kc5s_4d5d_7d9s() {
    assertEquals(
      "4d5d 2s8c Kc5s AsTc 3hTh 7d9s",
      Solver.process("texas-holdem 3s6h9dQdQh AsTc 3hTh 2s8c Kc5s 4d5d 7d9s"));
  }

  @Test
  public void test_texas_holdem_3089_4c5s7dJdQc_Qs9h_2d4d_7sAc() {
    assertEquals(
      "2d4d 7sAc Qs9h",
      Solver.process("texas-holdem 4c5s7dJdQc Qs9h 2d4d 7sAc"));
  }

  @Test
  public void test_texas_holdem_3090_2d4c4d5d8s_9hTd_6h6d_6cKh() {
    assertEquals(
      "9hTd 6cKh 6h6d",
      Solver.process("texas-holdem 2d4c4d5d8s 9hTd 6h6d 6cKh"));
  }

  @Test
  public void test_texas_holdem_3091_2h4h9hAhKc_2s5d_6s6h_3c6d_5sTh_Qh9c_Jc4d_9d4s_4c8s_Ac3s() {
    assertEquals(
      "3c6d 2s5d 4c8s Jc4d Ac3s 9d4s 6s6h 5sTh Qh9c",
      Solver.process("texas-holdem 2h4h9hAhKc 2s5d 6s6h 3c6d 5sTh Qh9c Jc4d 9d4s 4c8s Ac3s"));
  }

  @Test
  public void test_texas_holdem_3092_4h6d8c9sAs_7c3c_7d6h_9dKs_Ac5c_5s8d_4d6s_Js4c_KcTs_AdJd() {
    assertEquals(
      "7c3c KcTs Js4c 7d6h 5s8d 9dKs Ac5c AdJd 4d6s",
      Solver.process("texas-holdem 4h6d8c9sAs 7c3c 7d6h 9dKs Ac5c 5s8d 4d6s Js4c KcTs AdJd"));
  }

  @Test
  public void test_texas_holdem_3093_2s7c7d9hKc_Ts4c_KsKh_3dAd_Qh9d_Qc5c() {
    assertEquals(
      "Ts4c Qc5c 3dAd Qh9d KsKh",
      Solver.process("texas-holdem 2s7c7d9hKc Ts4c KsKh 3dAd Qh9d Qc5c"));
  }

  @Test
  public void test_texas_holdem_3094_2h3c4h4sQd_Ks2d_4dJc() {
    assertEquals(
      "Ks2d 4dJc",
      Solver.process("texas-holdem 2h3c4h4sQd Ks2d 4dJc"));
  }

  @Test
  public void test_texas_holdem_3095_4d5c6s8c9c_Ac9d_7hTs() {
    assertEquals(
      "Ac9d 7hTs",
      Solver.process("texas-holdem 4d5c6s8c9c Ac9d 7hTs"));
  }

  @Test
  public void test_texas_holdem_3096_2c2h4h5dAd_4c6c_KhKs_Ts7d_JcTh_9d9h_9c8h_5c8d() {
    assertEquals(
      "9c8h Ts7d JcTh 4c6c 5c8d 9d9h KhKs",
      Solver.process("texas-holdem 2c2h4h5dAd 4c6c KhKs Ts7d JcTh 9d9h 9c8h 5c8d"));
  }

  @Test
  public void test_texas_holdem_3097_3d4h7h7sKs_3c5c_QhKh() {
    assertEquals(
      "3c5c QhKh",
      Solver.process("texas-holdem 3d4h7h7sKs 3c5c QhKh"));
  }

  @Test
  public void test_texas_holdem_3098_2c2s5dJdKs_4s7s_4dAc_JsTs() {
    assertEquals(
      "4s7s 4dAc JsTs",
      Solver.process("texas-holdem 2c2s5dJdKs 4s7s 4dAc JsTs"));
  }

  @Test
  public void test_texas_holdem_3099_2h4s6sAcQs_Th7d_9s6d_Jh5h() {
    assertEquals(
      "Th7d Jh5h 9s6d",
      Solver.process("texas-holdem 2h4s6sAcQs Th7d 9s6d Jh5h"));
  }

  @Test
  public void test_texas_holdem_3100_2d5d6d7hKc_8sTd_KsQh_TcJd_Kh9s_ThQd_7d7c() {
    assertEquals(
      "8sTd TcJd ThQd Kh9s KsQh 7d7c",
      Solver.process("texas-holdem 2d5d6d7hKc 8sTd KsQh TcJd Kh9s ThQd 7d7c"));
  }

  @Test
  public void test_texas_holdem_3101_4c5sKhKsTh_5d8h_7h6c_Jd9s_7s4d_4hQs_9c7d() {
    assertEquals(
      "7h6c 9c7d Jd9s 7s4d 4hQs 5d8h",
      Solver.process("texas-holdem 4c5sKhKsTh 5d8h 7h6c Jd9s 7s4d 4hQs 9c7d"));
  }

  @Test
  public void test_texas_holdem_3102_2c5hAcKsQc_4h5s_4dKc_9h6s_AsQh() {
    assertEquals(
      "9h6s 4h5s 4dKc AsQh",
      Solver.process("texas-holdem 2c5hAcKsQc 4h5s 4dKc 9h6s AsQh"));
  }

  @Test
  public void test_texas_holdem_3103_4c5h7d7sAd_9c5d_QdAs_8d8c() {
    assertEquals(
      "9c5d 8d8c QdAs",
      Solver.process("texas-holdem 4c5h7d7sAd 9c5d QdAs 8d8c"));
  }

  @Test
  public void test_texas_holdem_3104_2h3c4hQhTc_Js4c_2d3d_QdKc_9cJd_7d2c_6s7s_Ac3s_8sKs_AhTs() {
    assertEquals(
      "6s7s 9cJd 8sKs 7d2c Ac3s Js4c AhTs QdKc 2d3d",
      Solver.process("texas-holdem 2h3c4hQhTc Js4c 2d3d QdKc 9cJd 7d2c 6s7s Ac3s 8sKs AhTs"));
  }

  @Test
  public void test_texas_holdem_3105_3hJsKhQcQd_5h6h_7h4h_2h7c() {
    assertEquals(
      "5h6h 2h7c=7h4h",
      Solver.process("texas-holdem 3hJsKhQcQd 5h6h 7h4h 2h7c"));
  }

  @Test
  public void test_texas_holdem_3106_2d4h5s8cJh_AsTc_7h6s() {
    assertEquals(
      "AsTc 7h6s",
      Solver.process("texas-holdem 2d4h5s8cJh AsTc 7h6s"));
  }

  @Test
  public void test_texas_holdem_3107_5d8sQdQsTh_5s6c_2d4s() {
    assertEquals(
      "2d4s 5s6c",
      Solver.process("texas-holdem 5d8sQdQsTh 5s6c 2d4s"));
  }

  @Test
  public void test_texas_holdem_3108_4h8c8sJdTc_3s5h_Js5s_3d3h_4dJh_8h2h_5cKd_Qc4c_Jc6d() {
    assertEquals(
      "3s5h 5cKd 3d3h Qc4c 4dJh=Jc6d=Js5s 8h2h",
      Solver.process("texas-holdem 4h8c8sJdTc 3s5h Js5s 3d3h 4dJh 8h2h 5cKd Qc4c Jc6d"));
  }

  @Test
  public void test_texas_holdem_3109_2c3c3d6cQh_KsTh_Kd7c_7h9h_Qd6s_Js4s_3sTd_9sJh_9c8d_6h3h() {
    assertEquals(
      "7h9h 9c8d Js4s 9sJh Kd7c KsTh Qd6s 3sTd 6h3h",
      Solver.process("texas-holdem 2c3c3d6cQh KsTh Kd7c 7h9h Qd6s Js4s 3sTd 9sJh 9c8d 6h3h"));
  }

  @Test
  public void test_texas_holdem_3110_2h6h7sKdQd_4h5h_4d3h() {
    assertEquals(
      "4d3h 4h5h",
      Solver.process("texas-holdem 2h6h7sKdQd 4h5h 4d3h"));
  }

  @Test
  public void test_texas_holdem_3111_3c6hAsKcQd_KsAh_2s3h_8cJh_7s5c_Td7h_3sJd_3dAd() {
    assertEquals(
      "7s5c Td7h 8cJh 2s3h=3sJd 3dAd KsAh",
      Solver.process("texas-holdem 3c6hAsKcQd KsAh 2s3h 8cJh 7s5c Td7h 3sJd 3dAd"));
  }

  @Test
  public void test_texas_holdem_3112_5sAdJsQcTd_6s3d_9d9h_Kh8s_9s2c_7d7c_5c8d_Jd8c() {
    assertEquals(
      "6s3d 9s2c 5c8d 7d7c 9d9h Jd8c Kh8s",
      Solver.process("texas-holdem 5sAdJsQcTd 6s3d 9d9h Kh8s 9s2c 7d7c 5c8d Jd8c"));
  }

  @Test
  public void test_texas_holdem_3113_AhJcKcQcTh_5dTs_3c2s_7d4c_9d6h_JdAc_5h5s_6cTd_3dKs_7s4h() {
    assertEquals(
      "3c2s=3dKs=5dTs=5h5s=6cTd=7d4c=7s4h=9d6h=JdAc",
      Solver.process("texas-holdem AhJcKcQcTh 5dTs 3c2s 7d4c 9d6h JdAc 5h5s 6cTd 3dKs 7s4h"));
  }

  @Test
  public void test_texas_holdem_3114_2d4h7sAdQh_Ts3s_3c5d_8c8h_5s9c_Jd7h() {
    assertEquals(
      "5s9c Ts3s Jd7h 8c8h 3c5d",
      Solver.process("texas-holdem 2d4h7sAdQh Ts3s 3c5d 8c8h 5s9c Jd7h"));
  }

  @Test
  public void test_texas_holdem_3115_4hAhKcKdTd_JsQh_6h2s_Ks9h_2c8d_6s3c_JdKh_3h9d_9c4s() {
    assertEquals(
      "6h2s=6s3c 2c8d 3h9d 9c4s Ks9h JdKh JsQh",
      Solver.process("texas-holdem 4hAhKcKdTd JsQh 6h2s Ks9h 2c8d 6s3c JdKh 3h9d 9c4s"));
  }

  @Test
  public void test_texas_holdem_3116_4s6d7hJsQs_6c4h_3dJh_Kd9s_5c7c() {
    assertEquals(
      "Kd9s 5c7c 3dJh 6c4h",
      Solver.process("texas-holdem 4s6d7hJsQs 6c4h 3dJh Kd9s 5c7c"));
  }

  @Test
  public void test_texas_holdem_3117_4s5d5sJhQh_3h2s_7sAh_Js9s() {
    assertEquals(
      "3h2s 7sAh Js9s",
      Solver.process("texas-holdem 4s5d5sJhQh 3h2s 7sAh Js9s"));
  }

  @Test
  public void test_texas_holdem_3118_5h7d7h8hJh_As2s_3hAc_8c6s_JsKd_AdQs_Qh5d_2dQc_4dKh_Qd3s() {
    assertEquals(
      "2dQc=Qd3s As2s AdQs 8c6s JsKd 3hAc Qh5d 4dKh",
      Solver.process("texas-holdem 5h7d7h8hJh As2s 3hAc 8c6s JsKd AdQs Qh5d 2dQc 4dKh Qd3s"));
  }

  @Test
  public void test_texas_holdem_3119_5c7sQcQdTd_JdKs_3c2h_Tc6c_4d9h() {
    assertEquals(
      "3c2h 4d9h JdKs Tc6c",
      Solver.process("texas-holdem 5c7sQcQdTd JdKs 3c2h Tc6c 4d9h"));
  }

  @Test
  public void test_texas_holdem_3120_3d6s9sAcTh_7d4s_3c4d() {
    assertEquals(
      "7d4s 3c4d",
      Solver.process("texas-holdem 3d6s9sAcTh 7d4s 3c4d"));
  }

  @Test
  public void test_texas_holdem_3121_3s6d9dQsTs_Kc2d_2s3c_2h4d_Qh7h_Qd8h_4c9s() {
    assertEquals(
      "2h4d Kc2d 2s3c 4c9s Qh7h Qd8h",
      Solver.process("texas-holdem 3s6d9dQsTs Kc2d 2s3c 2h4d Qh7h Qd8h 4c9s"));
  }

  @Test
  public void test_texas_holdem_3122_4d5h9dAcAh_Js9h_6sQs_Qc2h_AdKh_As9c_Kd7d() {
    assertEquals(
      "Qc2h 6sQs Kd7d Js9h AdKh As9c",
      Solver.process("texas-holdem 4d5h9dAcAh Js9h 6sQs Qc2h AdKh As9c Kd7d"));
  }

  @Test
  public void test_texas_holdem_3123_2s5c5h6cQd_7cJh_Kh9s_3dKd_9h8h() {
    assertEquals(
      "9h8h 7cJh 3dKd Kh9s",
      Solver.process("texas-holdem 2s5c5h6cQd 7cJh Kh9s 3dKd 9h8h"));
  }

  @Test
  public void test_texas_holdem_3124_3c4hJcKdQs_KcAh_9c3h_2h2d_Qd3s_Th3d_7c9s_4dQh_Ad8s_Jd6d() {
    assertEquals(
      "7c9s Ad8s 2h2d 9c3h=Th3d Jd6d KcAh Qd3s 4dQh",
      Solver.process("texas-holdem 3c4hJcKdQs KcAh 9c3h 2h2d Qd3s Th3d 7c9s 4dQh Ad8s Jd6d"));
  }

  @Test
  public void test_texas_holdem_3125_6h6s9hQdTd_As3s_4c4d_2dQs() {
    assertEquals(
      "As3s 4c4d 2dQs",
      Solver.process("texas-holdem 6h6s9hQdTd As3s 4c4d 2dQs"));
  }

  @Test
  public void test_texas_holdem_3126_4c4h5dJdJh_2s4d_3cTh_Qd3d_4s6h() {
    assertEquals(
      "3cTh Qd3d 2s4d=4s6h",
      Solver.process("texas-holdem 4c4h5dJdJh 2s4d 3cTh Qd3d 4s6h"));
  }

  @Test
  public void test_texas_holdem_3127_2h5d6c8sAd_Tc6s_JhKs_Qd7c_Ac3s_9hQc_3dJs_5s3h() {
    assertEquals(
      "3dJs Qd7c 9hQc JhKs 5s3h Tc6s Ac3s",
      Solver.process("texas-holdem 2h5d6c8sAd Tc6s JhKs Qd7c Ac3s 9hQc 3dJs 5s3h"));
  }

  @Test
  public void test_texas_holdem_3128_5d7d9hAhKh_7cTh_2hKs_2d3c_TsQh_6h7h_Tc4d_Qc6d_5cJc_AsAc() {
    assertEquals(
      "2d3c Tc4d Qc6d TsQh 5cJc 7cTh 2hKs AsAc 6h7h",
      Solver.process("texas-holdem 5d7d9hAhKh 7cTh 2hKs 2d3c TsQh 6h7h Tc4d Qc6d 5cJc AsAc"));
  }

  @Test
  public void test_texas_holdem_3129_2c5d6d9sAs_8sAh_Qh7d_9c3h_8d4c_4h6s_3s3d_JdTd() {
    assertEquals(
      "8d4c JdTd Qh7d 3s3d 4h6s 9c3h 8sAh",
      Solver.process("texas-holdem 2c5d6d9sAs 8sAh Qh7d 9c3h 8d4c 4h6s 3s3d JdTd"));
  }

  @Test
  public void test_texas_holdem_3130_6s7d8sAsTc_TdQs_3d5c_7c7s_Ks5d_Kc9s_4c6h_5hKd() {
    assertEquals(
      "3d5c 5hKd=Ks5d 4c6h TdQs 7c7s Kc9s",
      Solver.process("texas-holdem 6s7d8sAsTc TdQs 3d5c 7c7s Ks5d Kc9s 4c6h 5hKd"));
  }

  @Test
  public void test_texas_holdem_3131_4h5d9dAsQd_2dAc_8d4d_Ks6d_7h8s_KdJh_4c8c_4s5s_7sTc_3dJd() {
    assertEquals(
      "7h8s 7sTc Ks6d KdJh 4c8c 2dAc 4s5s 8d4d 3dJd",
      Solver.process("texas-holdem 4h5d9dAsQd 2dAc 8d4d Ks6d 7h8s KdJh 4c8c 4s5s 7sTc 3dJd"));
  }

  @Test
  public void test_texas_holdem_3132_3c5h7d7hJd_6s6h_8cTs_7s8s_4sAd() {
    assertEquals(
      "8cTs 4sAd 6s6h 7s8s",
      Solver.process("texas-holdem 3c5h7d7hJd 6s6h 8cTs 7s8s 4sAd"));
  }

  @Test
  public void test_texas_holdem_3133_2s8h9sKhTd_TsQc_9c3s_8d3h() {
    assertEquals(
      "8d3h 9c3s TsQc",
      Solver.process("texas-holdem 2s8h9sKhTd TsQc 9c3s 8d3h"));
  }

  @Test
  public void test_texas_holdem_3134_5c6h8sKdTs_7d6s_JcAc_9s5h_9h6c() {
    assertEquals(
      "JcAc 9s5h 7d6s 9h6c",
      Solver.process("texas-holdem 5c6h8sKdTs 7d6s JcAc 9s5h 9h6c"));
  }

  @Test
  public void test_texas_holdem_3135_2d2s4d9dTd_3dAh_4s7d_8cJs_Kc7c() {
    assertEquals(
      "8cJs Kc7c 3dAh 4s7d",
      Solver.process("texas-holdem 2d2s4d9dTd 3dAh 4s7d 8cJs Kc7c"));
  }

  @Test
  public void test_texas_holdem_3136_2c5d8h9cQd_Ah8c_3dQh_Ts3s_2d7h_4d2s() {
    assertEquals(
      "Ts3s 2d7h=4d2s Ah8c 3dQh",
      Solver.process("texas-holdem 2c5d8h9cQd Ah8c 3dQh Ts3s 2d7h 4d2s"));
  }

  @Test
  public void test_texas_holdem_3137_4cJhJsKsTd_6s6d_7s3s_5c3c_AcTc_7hQh_6c5s_Qd8d_Ts2s_3h4s() {
    assertEquals(
      "5c3c 6c5s 7s3s 7hQh=Qd8d 3h4s 6s6d Ts2s AcTc",
      Solver.process("texas-holdem 4cJhJsKsTd 6s6d 7s3s 5c3c AcTc 7hQh 6c5s Qd8d Ts2s 3h4s"));
  }

  @Test
  public void test_texas_holdem_3138_2d4h5s6cKs_Qs7s_Js6s_3h4d_7h2s_3dJh_Kc5c_Kd8c_Jc5d_9dKh() {
    assertEquals(
      "Qs7s 7h2s Jc5d Js6s Kd8c 9dKh Kc5c 3dJh=3h4d",
      Solver.process("texas-holdem 2d4h5s6cKs Qs7s Js6s 3h4d 7h2s 3dJh Kc5c Kd8c Jc5d 9dKh"));
  }

  @Test
  public void test_texas_holdem_3139_2h6d6hJsKd_5hTh_Jh3h_6s4s_Kc7s() {
    assertEquals(
      "5hTh Jh3h Kc7s 6s4s",
      Solver.process("texas-holdem 2h6d6hJsKd 5hTh Jh3h 6s4s Kc7s"));
  }

  @Test
  public void test_texas_holdem_3140_2h4d9sTdTs_6sQc_9d7d() {
    assertEquals(
      "6sQc 9d7d",
      Solver.process("texas-holdem 2h4d9sTdTs 6sQc 9d7d"));
  }

  @Test
  public void test_texas_holdem_3141_3d8d9hJhTd_QhAh_6d9d_Kh6s_Ts2s_Jc4d_JsQs_Tc5s_7sQc_Kc7h() {
    assertEquals(
      "Kh6s Tc5s=Ts2s Jc4d Kc7h 7sQc=JsQs=QhAh 6d9d",
      Solver.process("texas-holdem 3d8d9hJhTd QhAh 6d9d Kh6s Ts2s Jc4d JsQs Tc5s 7sQc Kc7h"));
  }

  @Test
  public void test_texas_holdem_3142_3h6s7c8hJs_3cKh_2d5d_TcQc_3dTs_KcAc_3sAd_6h5h_7dJc() {
    assertEquals(
      "2d5d TcQc KcAc 3dTs 3cKh 3sAd 6h5h 7dJc",
      Solver.process("texas-holdem 3h6s7c8hJs 3cKh 2d5d TcQc 3dTs KcAc 3sAd 6h5h 7dJc"));
  }

  @Test
  public void test_texas_holdem_3143_4d5d5h8h9d_9h7s_4s6h_QcKd_5sTc_2sTh_2dJs_4cAd() {
    assertEquals(
      "2sTh 2dJs QcKd 4s6h 4cAd 9h7s 5sTc",
      Solver.process("texas-holdem 4d5d5h8h9d 9h7s 4s6h QcKd 5sTc 2sTh 2dJs 4cAd"));
  }

  @Test
  public void test_texas_holdem_3144_3d3sKdKhTc_9cTh_Td4d_As9s_4s2h() {
    assertEquals(
      "4s2h As9s Td4d 9cTh",
      Solver.process("texas-holdem 3d3sKdKhTc 9cTh Td4d As9s 4s2h"));
  }

  @Test
  public void test_texas_holdem_3145_2h4h9sKhTd_AdTs_Kc4s_Kd6d_8c7c_5d7d() {
    assertEquals(
      "5d7d 8c7c AdTs Kd6d Kc4s",
      Solver.process("texas-holdem 2h4h9sKhTd AdTs Kc4s Kd6d 8c7c 5d7d"));
  }

  @Test
  public void test_texas_holdem_3146_5d7s8d8s9d_JhTh_AsQs_3c8c_9s4h_3h4c_3s6d_Ad6c_8h2h_5hTd() {
    assertEquals(
      "3h4c AsQs 5hTd 9s4h 3c8c=8h2h 3s6d=Ad6c JhTh",
      Solver.process("texas-holdem 5d7s8d8s9d JhTh AsQs 3c8c 9s4h 3h4c 3s6d Ad6c 8h2h 5hTd"));
  }

  @Test
  public void test_texas_holdem_3147_8h9c9dQdTd_2cQs_3h6h_KcKs_7dAs_JdAd_Qh5h() {
    assertEquals(
      "3h6h 7dAs 2cQs=Qh5h KcKs JdAd",
      Solver.process("texas-holdem 8h9c9dQdTd 2cQs 3h6h KcKs 7dAs JdAd Qh5h"));
  }

  @Test
  public void test_texas_holdem_3148_3h4c8s9dQs_4hJd_3s7c() {
    assertEquals(
      "3s7c 4hJd",
      Solver.process("texas-holdem 3h4c8s9dQs 4hJd 3s7c"));
  }

  @Test
  public void test_texas_holdem_3149_2s3sJcJsTs_6s8c_KhAh() {
    assertEquals(
      "KhAh 6s8c",
      Solver.process("texas-holdem 2s3sJcJsTs 6s8c KhAh"));
  }

  @Test
  public void test_texas_holdem_3150_3h5c7d7s8d_QdTd_4h9c_Kd5h_KhJc_Th6d_Ks4s_Kc6h_3cQs() {
    assertEquals(
      "4h9c Th6d QdTd Ks4s Kc6h KhJc 3cQs Kd5h",
      Solver.process("texas-holdem 3h5c7d7s8d QdTd 4h9c Kd5h KhJc Th6d Ks4s Kc6h 3cQs"));
  }

  @Test
  public void test_texas_holdem_3151_3d7hAhJdTd_Qh6d_8hAc_Jc7d_Qs4d_5d8c() {
    assertEquals(
      "5d8c Qh6d=Qs4d 8hAc Jc7d",
      Solver.process("texas-holdem 3d7hAhJdTd Qh6d 8hAc Jc7d Qs4d 5d8c"));
  }

  @Test
  public void test_texas_holdem_3152_3s4d8cJdQc_KsTh_4c5d_2dTd_8d3d_QhAc_3h9h_KcTs_6h2s() {
    assertEquals(
      "6h2s 2dTd KcTs=KsTh 3h9h 4c5d QhAc 8d3d",
      Solver.process("texas-holdem 3s4d8cJdQc KsTh 4c5d 2dTd 8d3d QhAc 3h9h KcTs 6h2s"));
  }

  @Test
  public void test_texas_holdem_3153_4d5d6sQdTs_6h8h_3cJs() {
    assertEquals(
      "3cJs 6h8h",
      Solver.process("texas-holdem 4d5d6sQdTs 6h8h 3cJs"));
  }

  @Test
  public void test_texas_holdem_3154_8s9dAhKhTs_KsQs_5hTh_7c8d() {
    assertEquals(
      "7c8d 5hTh KsQs",
      Solver.process("texas-holdem 8s9dAhKhTs KsQs 5hTh 7c8d"));
  }

  @Test
  public void test_texas_holdem_3155_4s7c9d9sTc_7h6s_6cJh_6d8d_4d8c_Kh6h() {
    assertEquals(
      "6cJh Kh6h 4d8c 7h6s 6d8d",
      Solver.process("texas-holdem 4s7c9d9sTc 7h6s 6cJh 6d8d 4d8c Kh6h"));
  }

  @Test
  public void test_texas_holdem_3156_3h5c9cAhJs_4hJh_Ts9d() {
    assertEquals(
      "Ts9d 4hJh",
      Solver.process("texas-holdem 3h5c9cAhJs 4hJh Ts9d"));
  }

  @Test
  public void test_texas_holdem_3157_3s5h5s9hAd_9c3c_9d8s_Ac2h_QdQs_2s6c_6h4h_7d5c() {
    assertEquals(
      "2s6c=6h4h 9c3c=9d8s QdQs Ac2h 7d5c",
      Solver.process("texas-holdem 3s5h5s9hAd 9c3c 9d8s Ac2h QdQs 2s6c 6h4h 7d5c"));
  }

  @Test
  public void test_texas_holdem_3158_3c3d6c6h8d_7hAs_7cTs_2sTh_9hQh_KsTc() {
    assertEquals(
      "2sTh=7cTs 9hQh KsTc 7hAs",
      Solver.process("texas-holdem 3c3d6c6h8d 7hAs 7cTs 2sTh 9hQh KsTc"));
  }

  @Test
  public void test_texas_holdem_3159_5c7hAdAsJh_JdJc_4cKd_3c8s() {
    assertEquals(
      "3c8s 4cKd JdJc",
      Solver.process("texas-holdem 5c7hAdAsJh JdJc 4cKd 3c8s"));
  }

  @Test
  public void test_texas_holdem_3160_2h3s4h6s7h_JdAh_JcQs_Qh6h_7dKh_9c8d_7s3d_6c5d() {
    assertEquals(
      "9c8d JcQs JdAh 7dKh 7s3d 6c5d Qh6h",
      Solver.process("texas-holdem 2h3s4h6s7h JdAh JcQs Qh6h 7dKh 9c8d 7s3d 6c5d"));
  }

  @Test
  public void test_texas_holdem_3161_7s8h9dJhKc_Ah4c_AcJc_Th5s() {
    assertEquals(
      "Ah4c AcJc Th5s",
      Solver.process("texas-holdem 7s8h9dJhKc Ah4c AcJc Th5s"));
  }

  @Test
  public void test_texas_holdem_3162_3s5d7d7h9h_As8c_8s6c_Tc6s_4hKh_5s7c_AhTh_TsAc_JsJd() {
    assertEquals(
      "Tc6s 4hKh As8c AhTh=TsAc JsJd 8s6c 5s7c",
      Solver.process("texas-holdem 3s5d7d7h9h As8c 8s6c Tc6s 4hKh 5s7c AhTh TsAc JsJd"));
  }

  @Test
  public void test_texas_holdem_3163_3d6c7cAdJh_QsAs_TdTh_7s4h_9cKd_Ts3s_Jc3c() {
    assertEquals(
      "9cKd Ts3s 7s4h TdTh QsAs Jc3c",
      Solver.process("texas-holdem 3d6c7cAdJh QsAs TdTh 7s4h 9cKd Ts3s Jc3c"));
  }

  @Test
  public void test_texas_holdem_3164_5c5s7d7s9c_6cTs_Kh3c_8sQh_3s2s_Qc7h() {
    assertEquals(
      "3s2s 6cTs 8sQh Kh3c Qc7h",
      Solver.process("texas-holdem 5c5s7d7s9c 6cTs Kh3c 8sQh 3s2s Qc7h"));
  }

  @Test
  public void test_texas_holdem_3165_2c9d9sAhKs_Ac7h_5hQh_6d3c_4cAs_7d2s_3s4d_2hQd_JcKd() {
    assertEquals(
      "3s4d 6d3c 5hQh 2hQd=7d2s JcKd 4cAs=Ac7h",
      Solver.process("texas-holdem 2c9d9sAhKs Ac7h 5hQh 6d3c 4cAs 7d2s 3s4d 2hQd JcKd"));
  }

  @Test
  public void test_texas_holdem_3166_3s4d5h7dQh_QdTd_JhKh_3dAc_3h9c_KcTc_7s5s_7hAd_9s9h_QcKs() {
    assertEquals(
      "KcTc JhKh 3h9c 3dAc 7hAd 9s9h QdTd QcKs 7s5s",
      Solver.process("texas-holdem 3s4d5h7dQh QdTd JhKh 3dAc 3h9c KcTc 7s5s 7hAd 9s9h QcKs"));
  }

  @Test
  public void test_texas_holdem_3167_3h5c8c8hQd_Jh7c_2c5d_4d8s_7d9s_JcKh_Js9c_4cAc_5sKd_3cQc() {
    assertEquals(
      "7d9s Jh7c Js9c JcKh 4cAc 2c5d 5sKd 3cQc 4d8s",
      Solver.process("texas-holdem 3h5c8c8hQd Jh7c 2c5d 4d8s 7d9s JcKh Js9c 4cAc 5sKd 3cQc"));
  }

  @Test
  public void test_texas_holdem_3168_3s4s8hJsKh_8dJd_Ad4d_Jh3d_Tc8s_2s5h_7d5d_9c9d_2dKc_2h3h() {
    assertEquals(
      "2s5h 7d5d 2h3h Ad4d Tc8s 9c9d 2dKc Jh3d 8dJd",
      Solver.process("texas-holdem 3s4s8hJsKh 8dJd Ad4d Jh3d Tc8s 2s5h 7d5d 9c9d 2dKc 2h3h"));
  }

  @Test
  public void test_texas_holdem_3169_3d5s9sJcTs_7d3s_As2c_4c7s_7c6d_6c5d_QcQh_Kc5h_KhJh_9d6h() {
    assertEquals(
      "4c7s 7c6d As2c 7d3s 6c5d Kc5h 9d6h KhJh QcQh",
      Solver.process("texas-holdem 3d5s9sJcTs 7d3s As2c 4c7s 7c6d 6c5d QcQh Kc5h KhJh 9d6h"));
  }

  @Test
  public void test_texas_holdem_3170_5c7sAsJsTh_Qc4h_8s6d_4c2s_5s7d() {
    assertEquals(
      "4c2s 8s6d Qc4h 5s7d",
      Solver.process("texas-holdem 5c7sAsJsTh Qc4h 8s6d 4c2s 5s7d"));
  }

  @Test
  public void test_texas_holdem_3171_2c4h6cAhTc_4c8c_9hAd_TsKd_8hJd_Qd9s_QcKh_2s3c_ThQh() {
    assertEquals(
      "8hJd Qd9s QcKh 2s3c ThQh TsKd 9hAd 4c8c",
      Solver.process("texas-holdem 2c4h6cAhTc 4c8c 9hAd TsKd 8hJd Qd9s QcKh 2s3c ThQh"));
  }

  @Test
  public void test_texas_holdem_3172_3d5s6sJdTs_2h5c_7hJh_9hKh() {
    assertEquals(
      "9hKh 2h5c 7hJh",
      Solver.process("texas-holdem 3d5s6sJdTs 2h5c 7hJh 9hKh"));
  }

  @Test
  public void test_texas_holdem_3173_2d3d9cAcJs_5cAh_4c2c_9dJc_7s5d_9hQd_AsAd_5s8h_JhQc_TcKd() {
    assertEquals(
      "7s5d 5s8h TcKd 4c2c 9hQd JhQc 5cAh 9dJc AsAd",
      Solver.process("texas-holdem 2d3d9cAcJs 5cAh 4c2c 9dJc 7s5d 9hQd AsAd 5s8h JhQc TcKd"));
  }

  @Test
  public void test_texas_holdem_3174_2s3d5cAhKh_4h5s_5h9d_7s4d() {
    assertEquals(
      "5h9d 4h5s=7s4d",
      Solver.process("texas-holdem 2s3d5cAhKh 4h5s 5h9d 7s4d"));
  }

  @Test
  public void test_texas_holdem_3175_8hJhKsThTs_Qc2c_Jc5c_AhKd_9hQd_Jd6h_AsTc_4h3s_2h8s_Td7d() {
    assertEquals(
      "4h3s Qc2c 2h8s Jc5c=Jd6h AhKd Td7d AsTc 9hQd",
      Solver.process("texas-holdem 8hJhKsThTs Qc2c Jc5c AhKd 9hQd Jd6h AsTc 4h3s 2h8s Td7d"));
  }

  @Test
  public void test_texas_holdem_3176_2d7c8c8hJc_2sKs_JsQs_TdKh_3dKd_Jd6d_As4s_5h3h() {
    assertEquals(
      "5h3h 3dKd TdKh As4s 2sKs Jd6d JsQs",
      Solver.process("texas-holdem 2d7c8c8hJc 2sKs JsQs TdKh 3dKd Jd6d As4s 5h3h"));
  }

  @Test
  public void test_texas_holdem_3177_7s9c9sAsQh_ThKs_AcKc_4sJc() {
    assertEquals(
      "4sJc ThKs AcKc",
      Solver.process("texas-holdem 7s9c9sAsQh ThKs AcKc 4sJc"));
  }

  @Test
  public void test_texas_holdem_3178_2s5cKhKsTh_6d9h_8c9c() {
    assertEquals(
      "6d9h 8c9c",
      Solver.process("texas-holdem 2s5cKhKsTh 6d9h 8c9c"));
  }

  @Test
  public void test_texas_holdem_3179_3h4d6s7d8c_Ad8d_4h2s_7cAh_2dQs_6c5s() {
    assertEquals(
      "2dQs 4h2s 7cAh Ad8d 6c5s",
      Solver.process("texas-holdem 3h4d6s7d8c Ad8d 4h2s 7cAh 2dQs 6c5s"));
  }

  @Test
  public void test_texas_holdem_3180_6h6s7dAsTh_3s4h_Ts8c_Qs9c_7s4d_4sKc() {
    assertEquals(
      "3s4h Qs9c 4sKc 7s4d Ts8c",
      Solver.process("texas-holdem 6h6s7dAsTh 3s4h Ts8c Qs9c 7s4d 4sKc"));
  }

  @Test
  public void test_texas_holdem_3181_6d7d8cJcJs_Qd5h_3c3h_2h5d_Qh4s_4d4c() {
    assertEquals(
      "2h5d Qd5h=Qh4s 3c3h 4d4c",
      Solver.process("texas-holdem 6d7d8cJcJs Qd5h 3c3h 2h5d Qh4s 4d4c"));
  }

  @Test
  public void test_texas_holdem_3182_5h8sAsJsTh_7s8d_6d3s_2dKc_4s9h_4c4h() {
    assertEquals(
      "6d3s 4s9h 2dKc 4c4h 7s8d",
      Solver.process("texas-holdem 5h8sAsJsTh 7s8d 6d3s 2dKc 4s9h 4c4h"));
  }

  @Test
  public void test_texas_holdem_3183_4d6sKhQcQd_8cTs_AhKc_Jc7d_9c3h() {
    assertEquals(
      "9c3h 8cTs Jc7d AhKc",
      Solver.process("texas-holdem 4d6sKhQcQd 8cTs AhKc Jc7d 9c3h"));
  }

  @Test
  public void test_texas_holdem_3184_2h4d5sJcJd_4sAh_6d3d_Qd9d() {
    assertEquals(
      "Qd9d 4sAh 6d3d",
      Solver.process("texas-holdem 2h4d5sJcJd 4sAh 6d3d Qd9d"));
  }

  @Test
  public void test_texas_holdem_3185_6c6sJsKdQh_Jd5s_4cKs_2hTc_3d6d_9dTh_TdTs_As3c_9sKc() {
    assertEquals(
      "2hTc As3c TdTs Jd5s 4cKs=9sKc 3d6d 9dTh",
      Solver.process("texas-holdem 6c6sJsKdQh Jd5s 4cKs 2hTc 3d6d 9dTh TdTs As3c 9sKc"));
  }

  @Test
  public void test_texas_holdem_3186_2s6s8s9cJc_8cJd_7d3d_9s6c_3sQs() {
    assertEquals(
      "7d3d 9s6c 8cJd 3sQs",
      Solver.process("texas-holdem 2s6s8s9cJc 8cJd 7d3d 9s6c 3sQs"));
  }

  @Test
  public void test_texas_holdem_3187_2h3d4c8hAc_2c3c_5h7h_4dAh_QsTc_3hKd_9dTd_2d7s_JhTs() {
    assertEquals(
      "9dTd JhTs QsTc 2d7s 3hKd 2c3c 4dAh 5h7h",
      Solver.process("texas-holdem 2h3d4c8hAc 2c3c 5h7h 4dAh QsTc 3hKd 9dTd 2d7s JhTs"));
  }

  @Test
  public void test_texas_holdem_3188_2s9dAsKhQh_JhTs_Kc5d_4dAd_3cJc_Tc3h_Qc3s_3d9h() {
    assertEquals(
      "Tc3h 3cJc 3d9h Qc3s Kc5d 4dAd JhTs",
      Solver.process("texas-holdem 2s9dAsKhQh JhTs Kc5d 4dAd 3cJc Tc3h Qc3s 3d9h"));
  }

  @Test
  public void test_texas_holdem_3189_7c7d8cAhQs_As2s_6d5h_9h9c_Jc8h_JsKd_Td6s_3d4s_Qh2h() {
    assertEquals(
      "3d4s=6d5h Td6s JsKd Jc8h 9h9c Qh2h As2s",
      Solver.process("texas-holdem 7c7d8cAhQs As2s 6d5h 9h9c Jc8h JsKd Td6s 3d4s Qh2h"));
  }

  @Test
  public void test_texas_holdem_3190_3h4c9sJsQh_Ac2d_8s2c_Kd8d_Qd5s_JdQc_Td7c_7hAh_6hJc_3s9h() {
    assertEquals(
      "8s2c Td7c Kd8d Ac2d 7hAh 6hJc Qd5s 3s9h JdQc",
      Solver.process("texas-holdem 3h4c9sJsQh Ac2d 8s2c Kd8d Qd5s JdQc Td7c 7hAh 6hJc 3s9h"));
  }

  @Test
  public void test_texas_holdem_3191_7d7hKcKhTh_2dAs_5dTc_6s3c_Ts8d_3sQd_Ks8c_JsQs() {
    assertEquals(
      "6s3c 3sQd=JsQs 2dAs 5dTc Ts8d Ks8c",
      Solver.process("texas-holdem 7d7hKcKhTh 2dAs 5dTc 6s3c Ts8d 3sQd Ks8c JsQs"));
  }

  @Test
  public void test_texas_holdem_3192_2h5s7c8dTc_Qs5h_2s4s_KsJs_Ac7s_4hTs_KcJh_8sQd() {
    assertEquals(
      "KcJh=KsJs 2s4s Qs5h Ac7s 8sQd 4hTs",
      Solver.process("texas-holdem 2h5s7c8dTc Qs5h 2s4s KsJs Ac7s 4hTs KcJh 8sQd"));
  }

  @Test
  public void test_texas_holdem_3193_3c7h9dAhKc_Th4h_5c7s_TsAd_4s2c_3d8h_JcTc_8c4d() {
    assertEquals(
      "4s2c 8c4d Th4h JcTc 3d8h 5c7s TsAd",
      Solver.process("texas-holdem 3c7h9dAhKc Th4h 5c7s TsAd 4s2c 3d8h JcTc 8c4d"));
  }

  @Test
  public void test_texas_holdem_3194_2s4c5d9h9s_Qc3s_Ah2d_4d3h_Qh5s_Qd6c_JdQs_Js2c_7dTh() {
    assertEquals(
      "7dTh Qc3s Qd6c JdQs Js2c Ah2d 4d3h Qh5s",
      Solver.process("texas-holdem 2s4c5d9h9s Qc3s Ah2d 4d3h Qh5s Qd6c JdQs Js2c 7dTh"));
  }

  @Test
  public void test_texas_holdem_3195_7d9cAsJdTs_Kd6d_7sKh_3d3h_4d9s() {
    assertEquals(
      "Kd6d 3d3h 7sKh 4d9s",
      Solver.process("texas-holdem 7d9cAsJdTs Kd6d 7sKh 3d3h 4d9s"));
  }

  @Test
  public void test_texas_holdem_3196_2s5dJhJsKd_8h2d_4s7s_9cQc_4c8s() {
    assertEquals(
      "4s7s 4c8s 9cQc 8h2d",
      Solver.process("texas-holdem 2s5dJhJsKd 8h2d 4s7s 9cQc 4c8s"));
  }

  @Test
  public void test_texas_holdem_3197_3c4h7sTcTs_2c3d_Jc6h_8c9s_AcQd_2sQh_3s7h_7cKd_4sJh() {
    assertEquals(
      "8c9s Jc6h 2sQh AcQd 2c3d 4sJh 3s7h 7cKd",
      Solver.process("texas-holdem 3c4h7sTcTs 2c3d Jc6h 8c9s AcQd 2sQh 3s7h 7cKd 4sJh"));
  }

  @Test
  public void test_texas_holdem_3198_5c6h7d7hQc_4s4h_7s3s_7cAc() {
    assertEquals(
      "4s4h 7s3s 7cAc",
      Solver.process("texas-holdem 5c6h7d7hQc 4s4h 7s3s 7cAc"));
  }

  @Test
  public void test_texas_holdem_3199_2h4h4s7d9c_Jc5h_9dKh_QhJh_2d8d_8cKs_6d3h_Ah3c_8hJs_5sJd() {
    assertEquals(
      "6d3h 5sJd=Jc5h 8hJs QhJh 8cKs Ah3c 2d8d 9dKh",
      Solver.process("texas-holdem 2h4h4s7d9c Jc5h 9dKh QhJh 2d8d 8cKs 6d3h Ah3c 8hJs 5sJd"));
  }

  @Test
  public void test_texas_holdem_3200_3h5h8s9cJc_Jh6d_QcJd_ThKc_KdQs_6s8d_As7d_TsAc_7h3s() {
    assertEquals(
      "ThKc KdQs As7d TsAc 7h3s 6s8d Jh6d QcJd",
      Solver.process("texas-holdem 3h5h8s9cJc Jh6d QcJd ThKc KdQs 6s8d As7d TsAc 7h3s"));
  }

  @Test
  public void test_texas_holdem_3201_2s4c6c7cAs_KhJc_Kd8c_5h8s_5s8h_7s7h_Qc6d_Qd7d() {
    assertEquals(
      "Kd8c KhJc Qc6d Qd7d 7s7h 5h8s=5s8h",
      Solver.process("texas-holdem 2s4c6c7cAs KhJc Kd8c 5h8s 5s8h 7s7h Qc6d Qd7d"));
  }

  @Test
  public void test_texas_holdem_3202_3h8d9dAsTs_5cJh_7sKc_7c8s_ThAh_6cQs_Ac9c_5hAd() {
    assertEquals(
      "5cJh 6cQs 7sKc 7c8s 5hAd Ac9c ThAh",
      Solver.process("texas-holdem 3h8d9dAsTs 5cJh 7sKc 7c8s ThAh 6cQs Ac9c 5hAd"));
  }

  @Test
  public void test_texas_holdem_3203_3h5c5s7sAh_JdQc_Kd8h_Kh2h_3sTd_JsQs() {
    assertEquals(
      "JdQc=JsQs Kh2h Kd8h 3sTd",
      Solver.process("texas-holdem 3h5c5s7sAh JdQc Kd8h Kh2h 3sTd JsQs"));
  }

  @Test
  public void test_texas_holdem_3204_5d8h8sAdQs_JcKh_7c9d_6h7s() {
    assertEquals(
      "6h7s 7c9d JcKh",
      Solver.process("texas-holdem 5d8h8sAdQs JcKh 7c9d 6h7s"));
  }

  @Test
  public void test_texas_holdem_3205_7d8sAhKdKs_3sKc_3hAs_5h5s_2cJc_Jh7s_6c9c() {
    assertEquals(
      "6c9c 2cJc 5h5s Jh7s 3hAs 3sKc",
      Solver.process("texas-holdem 7d8sAhKdKs 3sKc 3hAs 5h5s 2cJc Jh7s 6c9c"));
  }

  @Test
  public void test_texas_holdem_3206_3h5c5d6sKh_5h7c_8hTs_Jh4h_Ad6d_5s7d_JdTc_KdJs_7hQs() {
    assertEquals(
      "8hTs Jh4h JdTc 7hQs Ad6d KdJs 5h7c=5s7d",
      Solver.process("texas-holdem 3h5c5d6sKh 5h7c 8hTs Jh4h Ad6d 5s7d JdTc KdJs 7hQs"));
  }

  @Test
  public void test_texas_holdem_3207_2s4d8dKdTh_2dTs_6sQc_9c3d_Kh2c_KsAh() {
    assertEquals(
      "9c3d 6sQc KsAh 2dTs Kh2c",
      Solver.process("texas-holdem 2s4d8dKdTh 2dTs 6sQc 9c3d Kh2c KsAh"));
  }

  @Test
  public void test_texas_holdem_3208_4c5h9cKcTs_6sAd_3hTd_9s2h_5cJh_4dQc_6c3s_8s4h_Th5s_9h3c() {
    assertEquals(
      "6c3s 6sAd 8s4h 4dQc 5cJh 9h3c=9s2h 3hTd Th5s",
      Solver.process("texas-holdem 4c5h9cKcTs 6sAd 3hTd 9s2h 5cJh 4dQc 6c3s 8s4h Th5s 9h3c"));
  }

  @Test
  public void test_texas_holdem_3209_3c5h8cJsKd_QcKh_Jh5d_Qs6s_8d7d_Qd8h_6d8s_7sAs_2dQh_3s5s() {
    assertEquals(
      "2dQh Qs6s 7sAs 6d8s 8d7d Qd8h QcKh 3s5s Jh5d",
      Solver.process("texas-holdem 3c5h8cJsKd QcKh Jh5d Qs6s 8d7d Qd8h 6d8s 7sAs 2dQh 3s5s"));
  }

  @Test
  public void test_texas_holdem_3210_3c4s5hQcQd_Td3d_3h5d_8s6h_6sAs_2hKh_3s9c_6c2c_Jh4h() {
    assertEquals(
      "8s6h 2hKh 6sAs 3s9c Td3d Jh4h 3h5d 6c2c",
      Solver.process("texas-holdem 3c4s5hQcQd Td3d 3h5d 8s6h 6sAs 2hKh 3s9c 6c2c Jh4h"));
  }

  @Test
  public void test_texas_holdem_3211_5d7s9d9hQd_8s5h_3hQh() {
    assertEquals(
      "8s5h 3hQh",
      Solver.process("texas-holdem 5d7s9d9hQd 8s5h 3hQh"));
  }

  @Test
  public void test_texas_holdem_3212_5d5s7cAsJh_3c2h_Jd4c_ThTc_3d3h_8h9s_Kd8c_4d5c_Ks9c() {
    assertEquals(
      "3c2h 8h9s Kd8c=Ks9c 3d3h ThTc Jd4c 4d5c",
      Solver.process("texas-holdem 5d5s7cAsJh 3c2h Jd4c ThTc 3d3h 8h9s Kd8c 4d5c Ks9c"));
  }

  @Test
  public void test_texas_holdem_3213_5s9c9hAhTd_KsTh_5h2h_8s3h_2sKc_3c7h_Tc3d() {
    assertEquals(
      "3c7h 8s3h 2sKc 5h2h KsTh=Tc3d",
      Solver.process("texas-holdem 5s9c9hAhTd KsTh 5h2h 8s3h 2sKc 3c7h Tc3d"));
  }

  @Test
  public void test_texas_holdem_3214_5h6h7c9dKc_KhJs_2s6c_Qh7d_2cTc_5d3h_Jc6d_5c8h_8sAc() {
    assertEquals(
      "2cTc 5d3h 2s6c Jc6d Qh7d KhJs 5c8h=8sAc",
      Solver.process("texas-holdem 5h6h7c9dKc KhJs 2s6c Qh7d 2cTc 5d3h Jc6d 5c8h 8sAc"));
  }

  @Test
  public void test_texas_holdem_3215_5hAcJdKdTc_5c3c_AhJs_Jh8d() {
    assertEquals(
      "5c3c Jh8d AhJs",
      Solver.process("texas-holdem 5hAcJdKdTc 5c3c AhJs Jh8d"));
  }

  @Test
  public void test_texas_holdem_3216_5d7s9cAsQc_2cQh_8dKh_7c7h() {
    assertEquals(
      "8dKh 2cQh 7c7h",
      Solver.process("texas-holdem 5d7s9cAsQc 2cQh 8dKh 7c7h"));
  }

  @Test
  public void test_texas_holdem_3217_6c7hAhKhQc_Qs4c_8h2h_5hJh_4sJd_5c9h_3d2s_Ac3h() {
    assertEquals(
      "3d2s 5c9h 4sJd Qs4c Ac3h 8h2h 5hJh",
      Solver.process("texas-holdem 6c7hAhKhQc Qs4c 8h2h 5hJh 4sJd 5c9h 3d2s Ac3h"));
  }

  @Test
  public void test_texas_holdem_3218_4s6h6s9cQs_9h9d_TcTd_6cAs() {
    assertEquals(
      "TcTd 6cAs 9h9d",
      Solver.process("texas-holdem 4s6h6s9cQs 9h9d TcTd 6cAs"));
  }

  @Test
  public void test_texas_holdem_3219_4s7h8cKcKs_4d3d_5sKd_8s3s_Td6h_9c5c() {
    assertEquals(
      "9c5c Td6h 4d3d 8s3s 5sKd",
      Solver.process("texas-holdem 4s7h8cKcKs 4d3d 5sKd 8s3s Td6h 9c5c"));
  }

  @Test
  public void test_texas_holdem_3220_2c8hQsTdTs_QhAh_Tc3h_3cKh_4d7c_Ad7s_3sJh_6hTh() {
    assertEquals(
      "4d7c 3sJh 3cKh Ad7s QhAh 6hTh=Tc3h",
      Solver.process("texas-holdem 2c8hQsTdTs QhAh Tc3h 3cKh 4d7c Ad7s 3sJh 6hTh"));
  }

  @Test
  public void test_texas_holdem_3221_2s4s6hJdKs_2d7h_9h5d_TcAd_AsQd_7c8h_5sKc_5h4d_6d7s_3dTh() {
    assertEquals(
      "7c8h 9h5d 3dTh TcAd AsQd 2d7h 5h4d 6d7s 5sKc",
      Solver.process("texas-holdem 2s4s6hJdKs 2d7h 9h5d TcAd AsQd 7c8h 5sKc 5h4d 6d7s 3dTh"));
  }

  @Test
  public void test_texas_holdem_3222_2c3s6hJsQc_Qh3h_5s5h() {
    assertEquals(
      "5s5h Qh3h",
      Solver.process("texas-holdem 2c3s6hJsQc Qh3h 5s5h"));
  }

  @Test
  public void test_texas_holdem_3223_6d8cJdKdQh_8hKh_7h3s_9hKs_4d5s_Th7c_AcJc() {
    assertEquals(
      "4d5s 7h3s Th7c AcJc 9hKs 8hKh",
      Solver.process("texas-holdem 6d8cJdKdQh 8hKh 7h3s 9hKs 4d5s Th7c AcJc"));
  }

  @Test
  public void test_texas_holdem_3224_2c6s8h8s9s_JsKh_9c4d() {
    assertEquals(
      "JsKh 9c4d",
      Solver.process("texas-holdem 2c6s8h8s9s JsKh 9c4d"));
  }

  @Test
  public void test_texas_holdem_3225_4h8cAdKdQs_Js2c_Ac4s() {
    assertEquals(
      "Js2c Ac4s",
      Solver.process("texas-holdem 4h8cAdKdQs Js2c Ac4s"));
  }

  @Test
  public void test_texas_holdem_3226_6h8h9hJcKc_5hAh_Jd2d_7dJh_AsTh_4s9d_Ac3c_Tc8s() {
    assertEquals(
      "Ac3c AsTh Tc8s 4s9d 7dJh=Jd2d 5hAh",
      Solver.process("texas-holdem 6h8h9hJcKc 5hAh Jd2d 7dJh AsTh 4s9d Ac3c Tc8s"));
  }

  @Test
  public void test_texas_holdem_3227_3c4d5dAhKs_9d2s_Jd3d_7h5s() {
    assertEquals(
      "Jd3d 7h5s 9d2s",
      Solver.process("texas-holdem 3c4d5dAhKs 9d2s Jd3d 7h5s"));
  }

  @Test
  public void test_texas_holdem_3228_4h6h7cAsQh_8h5s_5dKc_3d9c_8c6s_4d3c_8dQc_AhQd_5hKh() {
    assertEquals(
      "3d9c 5dKc 4d3c 8c6s 8dQc AhQd 8h5s 5hKh",
      Solver.process("texas-holdem 4h6h7cAsQh 8h5s 5dKc 3d9c 8c6s 4d3c 8dQc AhQd 5hKh"));
  }

  @Test
  public void test_texas_holdem_3229_6d8hJcKdKs_2c3c_Ac8c_6h2d() {
    assertEquals(
      "2c3c 6h2d Ac8c",
      Solver.process("texas-holdem 6d8hJcKdKs 2c3c Ac8c 6h2d"));
  }

  @Test
  public void test_texas_holdem_3230_4c5c6c6hJd_TcTd_TsKc_KhQd_Js9d_As2s() {
    assertEquals(
      "TsKc KhQd As2s TcTd Js9d",
      Solver.process("texas-holdem 4c5c6c6hJd TcTd TsKc KhQd Js9d As2s"));
  }

  @Test
  public void test_texas_holdem_3231_3d6cJdQcQd_TdKh_5c4s_6s2d_Qh7d_4dQs_6hTs_9h8h_TcJh() {
    assertEquals(
      "5c4s 9h8h TdKh 6hTs=6s2d TcJh 4dQs Qh7d",
      Solver.process("texas-holdem 3d6cJdQcQd TdKh 5c4s 6s2d Qh7d 4dQs 6hTs 9h8h TcJh"));
  }

  @Test
  public void test_texas_holdem_3232_3h3s4s6h6s_3c6d_Kc8d_7d8s_2cJd_7h9d_2dQh() {
    assertEquals(
      "7d8s 7h9d 2cJd 2dQh Kc8d 3c6d",
      Solver.process("texas-holdem 3h3s4s6h6s 3c6d Kc8d 7d8s 2cJd 7h9d 2dQh"));
  }

  @Test
  public void test_texas_holdem_3233_3d5h6sJdQc_4dAc_Kh7d_5c8h_QhJh_3h3c_Th7c_4h8d_Ts9d_QdQs() {
    assertEquals(
      "4h8d Th7c Ts9d Kh7d 4dAc 5c8h QhJh 3h3c QdQs",
      Solver.process("texas-holdem 3d5h6sJdQc 4dAc Kh7d 5c8h QhJh 3h3c Th7c 4h8d Ts9d QdQs"));
  }

  @Test
  public void test_texas_holdem_3234_2s4cAcJhJs_6s7h_8h5c_Ad2c_6h6c_7s9c_ThQs_Kc9h_7dTs_KsKd() {
    assertEquals(
      "6s7h 8h5c 7s9c 7dTs ThQs Kc9h 6h6c KsKd Ad2c",
      Solver.process("texas-holdem 2s4cAcJhJs 6s7h 8h5c Ad2c 6h6c 7s9c ThQs Kc9h 7dTs KsKd"));
  }

  @Test
  public void test_texas_holdem_3235_6d7d7hKcKd_5cJs_7s8c_Jc3s_Qc4c_AhKs_5d9c_8s7c_4s2s() {
    assertEquals(
      "4s2s 5d9c 5cJs=Jc3s Qc4c 7s8c=8s7c AhKs",
      Solver.process("texas-holdem 6d7d7hKcKd 5cJs 7s8c Jc3s Qc4c AhKs 5d9c 8s7c 4s2s"));
  }

  @Test
  public void test_texas_holdem_3236_2c4c5s7hQd_Ah9s_Jc2d_TsKd_9d3h() {
    assertEquals(
      "9d3h TsKd Ah9s Jc2d",
      Solver.process("texas-holdem 2c4c5s7hQd Ah9s Jc2d TsKd 9d3h"));
  }

  @Test
  public void test_texas_holdem_3237_3h7d8h9hKh_4c9d_JhQd_2s9c_Kd3s_7hAd_5s6d() {
    assertEquals(
      "2s9c=4c9d Kd3s 5s6d 7hAd JhQd",
      Solver.process("texas-holdem 3h7d8h9hKh 4c9d JhQd 2s9c Kd3s 7hAd 5s6d"));
  }

  @Test
  public void test_texas_holdem_3238_4s5c8hAcTh_2sJs_Qh8s_3sAh_Ad5h_4h9h_Qc2c_2d4d() {
    assertEquals(
      "2sJs Qc2c 2d4d 4h9h Qh8s 3sAh Ad5h",
      Solver.process("texas-holdem 4s5c8hAcTh 2sJs Qh8s 3sAh Ad5h 4h9h Qc2c 2d4d"));
  }

  @Test
  public void test_texas_holdem_3239_5s7c9dAcAh_6hTs_Tc6s_JsKh() {
    assertEquals(
      "6hTs=Tc6s JsKh",
      Solver.process("texas-holdem 5s7c9dAcAh 6hTs Tc6s JsKh"));
  }

  @Test
  public void test_texas_holdem_3240_2h4c6h7d7h_Qc5d_AsTd() {
    assertEquals(
      "Qc5d AsTd",
      Solver.process("texas-holdem 2h4c6h7d7h Qc5d AsTd"));
  }

  @Test
  public void test_texas_holdem_3241_2d2s3c6s8s_3hTh_AsJc() {
    assertEquals(
      "AsJc 3hTh",
      Solver.process("texas-holdem 2d2s3c6s8s 3hTh AsJc"));
  }

  @Test
  public void test_texas_holdem_3242_6c7s9cJcJh_Ts4d_2cQh_4cKd_6h8s_8dJd_As3s() {
    assertEquals(
      "Ts4d 2cQh 4cKd As3s 6h8s 8dJd",
      Solver.process("texas-holdem 6c7s9cJcJh Ts4d 2cQh 4cKd 6h8s 8dJd As3s"));
  }

  @Test
  public void test_texas_holdem_3243_3s6c8hAsTc_5c3h_9cJs_TsAd_Ac2h_Qs3d_7hKd_JdKs() {
    assertEquals(
      "9cJs 7hKd JdKs 5c3h Qs3d Ac2h TsAd",
      Solver.process("texas-holdem 3s6c8hAsTc 5c3h 9cJs TsAd Ac2h Qs3d 7hKd JdKs"));
  }

  @Test
  public void test_texas_holdem_3244_6s7dAsJcKs_KhQs_7sAd_2d5h_Td4h_9sQd_3c4c_5d3h() {
    assertEquals(
      "2d5h=3c4c=5d3h Td4h 9sQd KhQs 7sAd",
      Solver.process("texas-holdem 6s7dAsJcKs KhQs 7sAd 2d5h Td4h 9sQd 3c4c 5d3h"));
  }

  @Test
  public void test_texas_holdem_3245_3s4c5sKhQd_7dTc_7c7s_4hJc_9hTd_2cQc_KcAd() {
    assertEquals(
      "7dTc 9hTd 4hJc 7c7s 2cQc KcAd",
      Solver.process("texas-holdem 3s4c5sKhQd 7dTc 7c7s 4hJc 9hTd 2cQc KcAd"));
  }

  @Test
  public void test_texas_holdem_3246_5c7dJhQhTc_3hKh_4c5h_6hTh_Ah9c_2h4s_9s5s_9dJd_7s7h() {
    assertEquals(
      "2h4s 3hKh Ah9c 4c5h=9s5s 6hTh 9dJd 7s7h",
      Solver.process("texas-holdem 5c7dJhQhTc 3hKh 4c5h 6hTh Ah9c 2h4s 9s5s 9dJd 7s7h"));
  }

  @Test
  public void test_texas_holdem_3247_8dAcKhQhQs_Th7c_7sKs_5d3s() {
    assertEquals(
      "5d3s Th7c 7sKs",
      Solver.process("texas-holdem 8dAcKhQhQs Th7c 7sKs 5d3s"));
  }

  @Test
  public void test_texas_holdem_3248_3s8hKhQsTs_5s7h_7c9c_8d4s_Qc5d_JcJs_2c3h_7d2h() {
    assertEquals(
      "5s7h=7d2h 7c9c 2c3h 8d4s JcJs Qc5d",
      Solver.process("texas-holdem 3s8hKhQsTs 5s7h 7c9c 8d4s Qc5d JcJs 2c3h 7d2h"));
  }

  @Test
  public void test_texas_holdem_3249_2c3d4d8h9s_Ks3s_6d7c_7h2s_Td8d_Ac5c_Kc5h() {
    assertEquals(
      "6d7c Kc5h 7h2s Ks3s Td8d Ac5c",
      Solver.process("texas-holdem 2c3d4d8h9s Ks3s 6d7c 7h2s Td8d Ac5c Kc5h"));
  }

}
