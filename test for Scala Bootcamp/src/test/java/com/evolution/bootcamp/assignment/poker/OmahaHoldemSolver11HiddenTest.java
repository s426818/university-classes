
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OmahaHoldemSolver11HiddenTest {


  @Test
  public void test_omaha_holdem_2750_3h5h8dJhQc_Kc9h2c6s_Qh6d7c6c_AhTh4hAc_JdKs8c9d_JcTd9s5d_7s8h3dQd() {
    assertEquals(
      "Kc9h2c6s Qh6d7c6c JdKs8c9d 7s8h3dQd JcTd9s5d AhTh4hAc",
      Solver.process("omaha-holdem 3h5h8dJhQc Kc9h2c6s Qh6d7c6c AhTh4hAc JdKs8c9d JcTd9s5d 7s8h3dQd"));
  }

  @Test
  public void test_omaha_holdem_2751_4h7h7sJsQs_KcKs9cAs_8d2d2cTd_6h8h3hQd_7cQc3d5s_2sTc8c5c() {
    assertEquals(
      "2sTc8c5c 8d2d2cTd 6h8h3hQd KcKs9cAs 7cQc3d5s",
      Solver.process("omaha-holdem 4h7h7sJsQs KcKs9cAs 8d2d2cTd 6h8h3hQd 7cQc3d5s 2sTc8c5c"));
  }

  @Test
  public void test_omaha_holdem_2752_3s4c4s6sKd_TcJc6c4d_Qh9h7cJh_5s8hQdAs_5cJs7sKs_3h2d8d9s_KcTh7d7h() {
    assertEquals(
      "Qh9h7cJh 3h2d8d9s KcTh7d7h 5cJs7sKs 5s8hQdAs TcJc6c4d",
      Solver.process("omaha-holdem 3s4c4s6sKd TcJc6c4d Qh9h7cJh 5s8hQdAs 5cJs7sKs 3h2d8d9s KcTh7d7h"));
  }

  @Test
  public void test_omaha_holdem_2753_4s9dAcAsJd_2sKc4cQc_9h5d5c8h() {
    assertEquals(
      "2sKc4cQc 9h5d5c8h",
      Solver.process("omaha-holdem 4s9dAcAsJd 2sKc4cQc 9h5d5c8h"));
  }

  @Test
  public void test_omaha_holdem_2754_2h8c8d8hQh_7s5dJs4h_6h2dQdJd_Jc5s4sAd() {
    assertEquals(
      "7s5dJs4h 6h2dQdJd Jc5s4sAd",
      Solver.process("omaha-holdem 2h8c8d8hQh 7s5dJs4h 6h2dQdJd Jc5s4sAd"));
  }

  @Test
  public void test_omaha_holdem_2755_2c8c9dJcQc_6h7h6dJh_Ts2h8d2d_Kd6c9cTc() {
    assertEquals(
      "6h7h6dJh Ts2h8d2d Kd6c9cTc",
      Solver.process("omaha-holdem 2c8c9dJcQc 6h7h6dJh Ts2h8d2d Kd6c9cTc"));
  }

  @Test
  public void test_omaha_holdem_2756_7d8dJhJsQd_2cTcAs4c_3c5s6dQh_4s3sAc9c_2h4h6c7h_Ah2d7c9d_Td8sJcAd_5d9sTsKd_8c7s2s6s_5hQcThKh() {
    assertEquals(
      "4s3sAc9c 2cTcAs4c 2h4h6c7h 8c7s2s6s 3c5s6dQh 5hQcThKh Ah2d7c9d 5d9sTsKd Td8sJcAd",
      Solver.process("omaha-holdem 7d8dJhJsQd 2cTcAs4c 3c5s6dQh 4s3sAc9c 2h4h6c7h Ah2d7c9d Td8sJcAd 5d9sTsKd 8c7s2s6s 5hQcThKh"));
  }

  @Test
  public void test_omaha_holdem_2757_3s4s7c7sTs_Jh8h4hTh_9h4d7d2d_Jc8dJsAh_9s2h9dAs_QsAcKh8c_7hQh5hQc_Td2s5c6s_JdKsTc9c_4cQd8s2c() {
    assertEquals(
      "QsAcKh8c 4cQd8s2c Jh8h4hTh JdKsTc9c Jc8dJsAh 7hQh5hQc Td2s5c6s 9s2h9dAs 9h4d7d2d",
      Solver.process("omaha-holdem 3s4s7c7sTs Jh8h4hTh 9h4d7d2d Jc8dJsAh 9s2h9dAs QsAcKh8c 7hQh5hQc Td2s5c6s JdKsTc9c 4cQd8s2c"));
  }

  @Test
  public void test_omaha_holdem_2758_2c2h8c8dTh_3dKs6h6d_2d9dAsAc_AhTcJc2s() {
    assertEquals(
      "3dKs6h6d 2d9dAsAc AhTcJc2s",
      Solver.process("omaha-holdem 2c2h8c8dTh 3dKs6h6d 2d9dAsAc AhTcJc2s"));
  }

  @Test
  public void test_omaha_holdem_2759_6d7sKdQcQs_Th7h9s9d_QdJcJh6c_4hAdAs5s_8s2dKs2h_JsAh5cKh_7c8c6h4s_Ts7d2s5h_Kc6s3d4c_3c9c8h3h() {
    assertEquals(
      "3c9c8h3h 7c8c6h4s Ts7d2s5h Th7h9s9d Kc6s3d4c 8s2dKs2h JsAh5cKh 4hAdAs5s QdJcJh6c",
      Solver.process("omaha-holdem 6d7sKdQcQs Th7h9s9d QdJcJh6c 4hAdAs5s 8s2dKs2h JsAh5cKh 7c8c6h4s Ts7d2s5h Kc6s3d4c 3c9c8h3h"));
  }

  @Test
  public void test_omaha_holdem_2760_5h8hJcQhTs_4s2s8dAh_TcAc3hTh_7cTd5d7s_5cQd2d4h_6hJs7h3d_9h2c4dAd_Qs2h9c8c() {
    assertEquals(
      "9h2c4dAd 4s2s8dAh 7cTd5d7s 5cQd2d4h Qs2h9c8c 6hJs7h3d TcAc3hTh",
      Solver.process("omaha-holdem 5h8hJcQhTs 4s2s8dAh TcAc3hTh 7cTd5d7s 5cQd2d4h 6hJs7h3d 9h2c4dAd Qs2h9c8c"));
  }

  @Test
  public void test_omaha_holdem_2761_3d6cKsQsTh_Jh4d5c3c_Ac7h5h2d_KdQc6sAd_2s9h4h9s_JdKc5sJs_5d7d6h8c_2hJcTd8s_Qh2c8hTc_QdTs6dKh() {
    assertEquals(
      "Ac7h5h2d Jh4d5c3c 5d7d6h8c 2s9h4h9s 2hJcTd8s JdKc5sJs Qh2c8hTc KdQc6sAd=QdTs6dKh",
      Solver.process("omaha-holdem 3d6cKsQsTh Jh4d5c3c Ac7h5h2d KdQc6sAd 2s9h4h9s JdKc5sJs 5d7d6h8c 2hJcTd8s Qh2c8hTc QdTs6dKh"));
  }

  @Test
  public void test_omaha_holdem_2762_2s4d5d7s8d_6d7c3s9c_2c3h3dTh_QhKdKhJh_8c9d7h8h_6cJc5cAd_Qd9sTcTd() {
    assertEquals(
      "2c3h3dTh QhKdKhJh 8c9d7h8h 6cJc5cAd 6d7c3s9c Qd9sTcTd",
      Solver.process("omaha-holdem 2s4d5d7s8d 6d7c3s9c 2c3h3dTh QhKdKhJh 8c9d7h8h 6cJc5cAd Qd9sTcTd"));
  }

  @Test
  public void test_omaha_holdem_2763_4h5c7hAsKc_4d6hKd3c_6dQh5dQc_ThQsAd6s_TsQdAh8d_9s9dJhTc_6c4c2h5h_TdAc8c9h() {
    assertEquals(
      "9s9dJhTc 6dQh5dQc TdAc8c9h ThQsAd6s=TsQdAh8d 6c4c2h5h 4d6hKd3c",
      Solver.process("omaha-holdem 4h5c7hAsKc 4d6hKd3c 6dQh5dQc ThQsAd6s TsQdAh8d 9s9dJhTc 6c4c2h5h TdAc8c9h"));
  }

  @Test
  public void test_omaha_holdem_2764_4d8cAdKdTc_2d6sJhTs_3c3d9c2s_Jc2cKhAh_4cKsQc3h_3s7h2h9d() {
    assertEquals(
      "3s7h2h9d 3c3d9c2s 2d6sJhTs 4cKsQc3h Jc2cKhAh",
      Solver.process("omaha-holdem 4d8cAdKdTc 2d6sJhTs 3c3d9c2s Jc2cKhAh 4cKsQc3h 3s7h2h9d"));
  }

  @Test
  public void test_omaha_holdem_2765_2c2d3cKhQh_Ah8h4cTh_Qs7d3hQd_7s9d9hAc_2h3sJc6h() {
    assertEquals(
      "Ah8h4cTh 7s9d9hAc 2h3sJc6h Qs7d3hQd",
      Solver.process("omaha-holdem 2c2d3cKhQh Ah8h4cTh Qs7d3hQd 7s9d9hAc 2h3sJc6h"));
  }

  @Test
  public void test_omaha_holdem_2766_5d8s9dAcQs_TcAhAd6c_8dJd2c2h_3h8h4s8c_Jh5c6hTh_Ks7d3sTd_6d2s9s3d() {
    assertEquals(
      "Ks7d3sTd 8dJd2c2h 6d2s9s3d 3h8h4s8c TcAhAd6c Jh5c6hTh",
      Solver.process("omaha-holdem 5d8s9dAcQs TcAhAd6c 8dJd2c2h 3h8h4s8c Jh5c6hTh Ks7d3sTd 6d2s9s3d"));
  }

  @Test
  public void test_omaha_holdem_2767_3hJcJdJsQh_7d2h8cTc_6dKdAs4d_9cKc9h5c_6h4c7hQs_8h7s6sAc() {
    assertEquals(
      "7d2h8cTc 6h4c7hQs 8h7s6sAc 6dKdAs4d 9cKc9h5c",
      Solver.process("omaha-holdem 3hJcJdJsQh 7d2h8cTc 6dKdAs4d 9cKc9h5c 6h4c7hQs 8h7s6sAc"));
  }

  @Test
  public void test_omaha_holdem_2768_3h4h5d9cQd_4d5hJdTh_8sAcAs4s_6c3s9d7c_Td3dAh3c_6dKs5s9s_KhQc4cQh_8d7h8cKd_Tc9hJsQs_7d2sJh2c() {
    assertEquals(
      "7d2sJh2c 8d7h8cKd 8sAcAs4s 4d5hJdTh 6dKs5s9s Tc9hJsQs Td3dAh3c KhQc4cQh 6c3s9d7c",
      Solver.process("omaha-holdem 3h4h5d9cQd 4d5hJdTh 8sAcAs4s 6c3s9d7c Td3dAh3c 6dKs5s9s KhQc4cQh 8d7h8cKd Tc9hJsQs 7d2sJh2c"));
  }

  @Test
  public void test_omaha_holdem_2769_3c5h6c6s8s_4h3dJcAs_Js8cThQd_Kh7c8h2d_9sQcAc2c() {
    assertEquals(
      "9sQcAc2c 4h3dJcAs Js8cThQd Kh7c8h2d",
      Solver.process("omaha-holdem 3c5h6c6s8s 4h3dJcAs Js8cThQd Kh7c8h2d 9sQcAc2c"));
  }

  @Test
  public void test_omaha_holdem_2770_5s7cJdQhTs_8d3hAhQc_KsQsKcAs_7h6h8c6s_3c4s8h4c_5hJh9c5c() {
    assertEquals(
      "3c4s8h4c 7h6h8c6s 8d3hAhQc 5hJh9c5c KsQsKcAs",
      Solver.process("omaha-holdem 5s7cJdQhTs 8d3hAhQc KsQsKcAs 7h6h8c6s 3c4s8h4c 5hJh9c5c"));
  }

  @Test
  public void test_omaha_holdem_2771_5d8cKsTcTs_3d4dKdAh_4c8hTh2c_9cJh7d2s_9hJc6s7s_Qh4hQcAs_6h3sAcTd_Js3h7h6d() {
    assertEquals(
      "Js3h7h6d 9cJh7d2s=9hJc6s7s Qh4hQcAs 3d4dKdAh 6h3sAcTd 4c8hTh2c",
      Solver.process("omaha-holdem 5d8cKsTcTs 3d4dKdAh 4c8hTh2c 9cJh7d2s 9hJc6s7s Qh4hQcAs 6h3sAcTd Js3h7h6d"));
  }

  @Test
  public void test_omaha_holdem_2772_3d3h5cAhQd_8h9c7hTc_9s4cKh3c_7s5h4hAc_Jc2h5sKs_6cQc7dQs_8cJs2sKc_6d7cQh8s_TsJhAs2d() {
    assertEquals(
      "8h9c7hTc 8cJs2sKc Jc2h5sKs 6d7cQh8s TsJhAs2d 7s5h4hAc 9s4cKh3c 6cQc7dQs",
      Solver.process("omaha-holdem 3d3h5cAhQd 8h9c7hTc 9s4cKh3c 7s5h4hAc Jc2h5sKs 6cQc7dQs 8cJs2sKc 6d7cQh8s TsJhAs2d"));
  }

  @Test
  public void test_omaha_holdem_2773_4c9cKsQdQs_3hAh5hTd_2hKc3d7s_Ad2dKh4d_TcTs5d9h_QhTh8s3c_4s7h8dJd_KdAs7d6c_2c4hJhJc_3s8c2s6d() {
    assertEquals(
      "3s8c2s6d 3hAh5hTd 4s7h8dJd TcTs5d9h 2c4hJhJc 2hKc3d7s Ad2dKh4d=KdAs7d6c QhTh8s3c",
      Solver.process("omaha-holdem 4c9cKsQdQs 3hAh5hTd 2hKc3d7s Ad2dKh4d TcTs5d9h QhTh8s3c 4s7h8dJd KdAs7d6c 2c4hJhJc 3s8c2s6d"));
  }

  @Test
  public void test_omaha_holdem_2774_2c5h8s9dTh_3sQd3h3c_6dKs2s7h_8cJc7cQc_6h4hKcTc() {
    assertEquals(
      "3sQd3h3c 6h4hKcTc 6dKs2s7h 8cJc7cQc",
      Solver.process("omaha-holdem 2c5h8s9dTh 3sQd3h3c 6dKs2s7h 8cJc7cQc 6h4hKcTc"));
  }

  @Test
  public void test_omaha_holdem_2775_2d3d7h9hJc_6cAsQhQc_9s8d4cKs_3c3h5hKd_Qs6h7cJs() {
    assertEquals(
      "9s8d4cKs 6cAsQhQc Qs6h7cJs 3c3h5hKd",
      Solver.process("omaha-holdem 2d3d7h9hJc 6cAsQhQc 9s8d4cKs 3c3h5hKd Qs6h7cJs"));
  }

  @Test
  public void test_omaha_holdem_2776_2hJcKcQhTh_9s8d4s8c_7s9c7d7h_2sKs5c4c_5dKd7c4d_Qd9h8sTd_JdAcJhAs_Ad6cQc2d_3h3s3cTc_TsKh6hAh() {
    assertEquals(
      "7s9c7d7h 3h3s3cTc 5dKd7c4d 2sKs5c4c 9s8d4s8c Qd9h8sTd Ad6cQc2d=JdAcJhAs TsKh6hAh",
      Solver.process("omaha-holdem 2hJcKcQhTh 9s8d4s8c 7s9c7d7h 2sKs5c4c 5dKd7c4d Qd9h8sTd JdAcJhAs Ad6cQc2d 3h3s3cTc TsKh6hAh"));
  }

  @Test
  public void test_omaha_holdem_2777_2d3h9sJdJh_KhAs5d6s_8s2h4h2s_8dQd7d9c() {
    assertEquals(
      "KhAs5d6s 8dQd7d9c 8s2h4h2s",
      Solver.process("omaha-holdem 2d3h9sJdJh KhAs5d6s 8s2h4h2s 8dQd7d9c"));
  }

  @Test
  public void test_omaha_holdem_2778_4d6c6dAdAs_9c6h5d8s_2dJhJcKc_3c5c3h9h_Td7c3s8d() {
    assertEquals(
      "3c5c3h9h 2dJhJcKc 9c6h5d8s Td7c3s8d",
      Solver.process("omaha-holdem 4d6c6dAdAs 9c6h5d8s 2dJhJcKc 3c5c3h9h Td7c3s8d"));
  }

  @Test
  public void test_omaha_holdem_2779_4s5c7cKsTd_4d3hKh7s_Ah6h2cJd_Qd9s8s2s() {
    assertEquals(
      "Qd9s8s2s Ah6h2cJd 4d3hKh7s",
      Solver.process("omaha-holdem 4s5c7cKsTd 4d3hKh7s Ah6h2cJd Qd9s8s2s"));
  }

  @Test
  public void test_omaha_holdem_2780_4c4d7sJsKh_TdTh5hJc_As4h9c8h_9h6d2hTs_7dQcJhKc_Ac6cAh7h_Jd8sQs5s_Ks4s3s2s_9s8d3h2d() {
    assertEquals(
      "9s8d3h2d 9h6d2hTs TdTh5hJc Jd8sQs5s 7dQcJhKc Ac6cAh7h As4h9c8h Ks4s3s2s",
      Solver.process("omaha-holdem 4c4d7sJsKh TdTh5hJc As4h9c8h 9h6d2hTs 7dQcJhKc Ac6cAh7h Jd8sQs5s Ks4s3s2s 9s8d3h2d"));
  }

  @Test
  public void test_omaha_holdem_2781_6hAcJcKhKs_3h9d3s2s_Kd8c4h5d_8h2h5hTh_4sQh7c6d_Js2d8d6s() {
    assertEquals(
      "8h2h5hTh 3h9d3s2s 4sQh7c6d Js2d8d6s Kd8c4h5d",
      Solver.process("omaha-holdem 6hAcJcKhKs 3h9d3s2s Kd8c4h5d 8h2h5hTh 4sQh7c6d Js2d8d6s"));
  }

  @Test
  public void test_omaha_holdem_2782_2d2h3sJhQh_Td8s4hKs_7c2s7sJd_AcAh5sTs_5c9d3hAs_Jc3d5d6c_3cTh2c9h_Kc6h8cAd_8d7d7hKd() {
    assertEquals(
      "Td8s4hKs Kc6h8cAd 5c9d3hAs 8d7d7hKd Jc3d5d6c AcAh5sTs 3cTh2c9h 7c2s7sJd",
      Solver.process("omaha-holdem 2d2h3sJhQh Td8s4hKs 7c2s7sJd AcAh5sTs 5c9d3hAs Jc3d5d6c 3cTh2c9h Kc6h8cAd 8d7d7hKd"));
  }

  @Test
  public void test_omaha_holdem_2783_3d5c8dJdKc_6s4h5hKs_Th2sAdQd_9s7sKdAs_Ah2d9hQc_Tc6hTd3h_3c6cJhKh_7cQh3s4c_7hAc8h8c_QsTs5s9c() {
    assertEquals(
      "Ah2d9hQc 7cQh3s4c QsTs5s9c Tc6hTd3h 9s7sKdAs 6s4h5hKs 3c6cJhKh 7hAc8h8c Th2sAdQd",
      Solver.process("omaha-holdem 3d5c8dJdKc 6s4h5hKs Th2sAdQd 9s7sKdAs Ah2d9hQc Tc6hTd3h 3c6cJhKh 7cQh3s4c 7hAc8h8c QsTs5s9c"));
  }

  @Test
  public void test_omaha_holdem_2784_4h6d7sKdTc_Ac2s5c8c_Js7c3h6c_AsJc9hKh_4c3sJhTd_Ks9sAd7d() {
    assertEquals(
      "AsJc9hKh Js7c3h6c 4c3sJhTd Ks9sAd7d Ac2s5c8c",
      Solver.process("omaha-holdem 4h6d7sKdTc Ac2s5c8c Js7c3h6c AsJc9hKh 4c3sJhTd Ks9sAd7d"));
  }

  @Test
  public void test_omaha_holdem_2785_5h6s8h9cAh_7c8sTdJs_2sKc6h7s_Ts9hQs5d_2d3h3sAc() {
    assertEquals(
      "2d3h3sAc Ts9hQs5d 2sKc6h7s 7c8sTdJs",
      Solver.process("omaha-holdem 5h6s8h9cAh 7c8sTdJs 2sKc6h7s Ts9hQs5d 2d3h3sAc"));
  }

  @Test
  public void test_omaha_holdem_2786_6s7h9cQsTc_5sKd9s8h_As3h7c4c_Kh9d7dAd_KsJd6h6d_2s2dTh2c_3sQc5h5c() {
    assertEquals(
      "As3h7c4c 2s2dTh2c 3sQc5h5c Kh9d7dAd 5sKd9s8h KsJd6h6d",
      Solver.process("omaha-holdem 6s7h9cQsTc 5sKd9s8h As3h7c4c Kh9d7dAd KsJd6h6d 2s2dTh2c 3sQc5h5c"));
  }

  @Test
  public void test_omaha_holdem_2787_6d6hJsKhQd_2sAhJc5c_9c3s7cQc_Ad6s4c2d() {
    assertEquals(
      "2sAhJc5c 9c3s7cQc Ad6s4c2d",
      Solver.process("omaha-holdem 6d6hJsKhQd 2sAhJc5c 9c3s7cQc Ad6s4c2d"));
  }

  @Test
  public void test_omaha_holdem_2788_AdJdJhJsTh_8cTcAs4c_5sTdQh9h_3h7h8dAc() {
    assertEquals(
      "5sTdQh9h 3h7h8dAc 8cTcAs4c",
      Solver.process("omaha-holdem AdJdJhJsTh 8cTcAs4c 5sTdQh9h 3h7h8dAc"));
  }

  @Test
  public void test_omaha_holdem_2789_4d5d7sAcQh_2hQc8hTh_Kh7cQsAh_3hAsJs7h_Tc6c9s4h_4s6d9d2c_Kd2s5sTd_JdJhKc2d() {
    assertEquals(
      "4s6d9d2c Tc6c9s4h Kd2s5sTd JdJhKc2d 2hQc8hTh 3hAsJs7h Kh7cQsAh",
      Solver.process("omaha-holdem 4d5d7sAcQh 2hQc8hTh Kh7cQsAh 3hAsJs7h Tc6c9s4h 4s6d9d2c Kd2s5sTd JdJhKc2d"));
  }

  @Test
  public void test_omaha_holdem_2790_2s5s8s9sTh_9d3s2h6c_7dTdQdQc_3dKd5dTc_Ks2d6hTs_JdKh7c8d_5hAhJcJh() {
    assertEquals(
      "5hAhJcJh 7dTdQdQc 9d3s2h6c 3dKd5dTc JdKh7c8d Ks2d6hTs",
      Solver.process("omaha-holdem 2s5s8s9sTh 9d3s2h6c 7dTdQdQc 3dKd5dTc Ks2d6hTs JdKh7c8d 5hAhJcJh"));
  }

  @Test
  public void test_omaha_holdem_2791_4s5h9c9dQs_AsAh8c8d_Jc6h7dKs_2d3hQc5c_9s4hJsJh_Ts7c2sTh_Td5d3c8s() {
    assertEquals(
      "Jc6h7dKs Td5d3c8s Ts7c2sTh 2d3hQc5c AsAh8c8d 9s4hJsJh",
      Solver.process("omaha-holdem 4s5h9c9dQs AsAh8c8d Jc6h7dKs 2d3hQc5c 9s4hJsJh Ts7c2sTh Td5d3c8s"));
  }

  @Test
  public void test_omaha_holdem_2792_2c3h5c5d6h_Kd5sKh8s_9s3dTd7h_6cQh6s8c_Tc8hTh4h_Ks7sAsQs_QcQd5hJs_2hJcJd9c_Ad6dKcTs_9h3cAh7c() {
    assertEquals(
      "Ks7sAsQs 9s3dTd7h 9h3cAh7c Ad6dKcTs Tc8hTh4h 2hJcJd9c QcQd5hJs Kd5sKh8s 6cQh6s8c",
      Solver.process("omaha-holdem 2c3h5c5d6h Kd5sKh8s 9s3dTd7h 6cQh6s8c Tc8hTh4h Ks7sAsQs QcQd5hJs 2hJcJd9c Ad6dKcTs 9h3cAh7c"));
  }

  @Test
  public void test_omaha_holdem_2793_6s8d9dAcKh_6dKsQd3d_4sJhTsQc() {
    assertEquals(
      "4sJhTsQc 6dKsQd3d",
      Solver.process("omaha-holdem 6s8d9dAcKh 6dKsQd3d 4sJhTsQc"));
  }

  @Test
  public void test_omaha_holdem_2794_2s7hAsKdQd_2h4d4h5c_5h6h9sAc_3d5d7d4c_6d8cTd4s_3h2c8hKc_7sTh5s3s_JhKsKh2d_Qs9h8s3c() {
    assertEquals(
      "6d8cTd4s 2h4d4h5c 3d5d7d4c 7sTh5s3s Qs9h8s3c 5h6h9sAc 3h2c8hKc JhKsKh2d",
      Solver.process("omaha-holdem 2s7hAsKdQd 2h4d4h5c 5h6h9sAc 3d5d7d4c 6d8cTd4s 3h2c8hKc 7sTh5s3s JhKsKh2d Qs9h8s3c"));
  }

  @Test
  public void test_omaha_holdem_2795_2h5c7c9hJh_Td6c7dAd_Qh2d6hQc_AsTc9cJc_5hKdJs4c_8c8hQsKs_9d7h6s8s() {
    assertEquals(
      "Td6c7dAd 8c8hQsKs 5hKdJs4c AsTc9cJc 9d7h6s8s Qh2d6hQc",
      Solver.process("omaha-holdem 2h5c7c9hJh Td6c7dAd Qh2d6hQc AsTc9cJc 5hKdJs4c 8c8hQsKs 9d7h6s8s"));
  }

  @Test
  public void test_omaha_holdem_2796_6h8dKhKsQd_Ad9d9hKd_Td5c5hJc_7d7cAh6s() {
    assertEquals(
      "Td5c5hJc 7d7cAh6s Ad9d9hKd",
      Solver.process("omaha-holdem 6h8dKhKsQd Ad9d9hKd Td5c5hJc 7d7cAh6s"));
  }

  @Test
  public void test_omaha_holdem_2797_2h5c6c7dAc_7h6dKc2d_Td8sKs2c_AsQc7s9c_5sQsJhTs() {
    assertEquals(
      "Td8sKs2c 5sQsJhTs 7h6dKc2d AsQc7s9c",
      Solver.process("omaha-holdem 2h5c6c7dAc 7h6dKc2d Td8sKs2c AsQc7s9c 5sQsJhTs"));
  }

  @Test
  public void test_omaha_holdem_2798_2h4c5s9dQh_6c9sKsTc_Jh3c3dAs_ThAcJsKh() {
    assertEquals(
      "ThAcJsKh 6c9sKsTc Jh3c3dAs",
      Solver.process("omaha-holdem 2h4c5s9dQh 6c9sKsTc Jh3c3dAs ThAcJsKh"));
  }

  @Test
  public void test_omaha_holdem_2799_2s4s6h8hAd_ThTs9dJd_Kc7s3c7c_2hKd5h9h_QhQsJc8s_Td3d6s6d() {
    assertEquals(
      "2hKd5h9h Kc7s3c7c ThTs9dJd QhQsJc8s Td3d6s6d",
      Solver.process("omaha-holdem 2s4s6h8hAd ThTs9dJd Kc7s3c7c 2hKd5h9h QhQsJc8s Td3d6s6d"));
  }

  @Test
  public void test_omaha_holdem_2800_3d6h6s9cTh_Ad7sJsKs_6d2hTs8h_9sTc8s2c_5cAhJh5s_Jc7h7dJd() {
    assertEquals(
      "Ad7sJsKs 5cAhJh5s 9sTc8s2c Jc7h7dJd 6d2hTs8h",
      Solver.process("omaha-holdem 3d6h6s9cTh Ad7sJsKs 6d2hTs8h 9sTc8s2c 5cAhJh5s Jc7h7dJd"));
  }

  @Test
  public void test_omaha_holdem_2801_4c4s5hAdKd_Qc5dAs8d_3sTdQd8h_7h9c9h3c_6s9s7dKh_7cJcQs9d_Tc2d2cKc_8c4hJd6h_Ac5s6cTh() {
    assertEquals(
      "3sTdQd8h 7cJcQs9d 7h9c9h3c 6s9s7dKh Tc2d2cKc Ac5s6cTh=Qc5dAs8d 8c4hJd6h",
      Solver.process("omaha-holdem 4c4s5hAdKd Qc5dAs8d 3sTdQd8h 7h9c9h3c 6s9s7dKh 7cJcQs9d Tc2d2cKc 8c4hJd6h Ac5s6cTh"));
  }

  @Test
  public void test_omaha_holdem_2802_2h3d5cAhTd_4s7d8hTh_4hQh7hQs_AsKsJc7c_8c5hAdTs_Jd2d4d3s() {
    assertEquals(
      "4s7d8hTh 4hQh7hQs AsKsJc7c 8c5hAdTs Jd2d4d3s",
      Solver.process("omaha-holdem 2h3d5cAhTd 4s7d8hTh 4hQh7hQs AsKsJc7c 8c5hAdTs Jd2d4d3s"));
  }

  @Test
  public void test_omaha_holdem_2803_7d7sKhTdTs_Qs9h8c3h_Jh2s4h8h_9c3s7h2c_5c4d5sJc_As5hTc9d_Ad2d2h4s_JdTh3d8s_Ac3cQh5d() {
    assertEquals(
      "Jh2s4h8h Qs9h8c3h Ac3cQh5d Ad2d2h4s 5c4d5sJc 9c3s7h2c JdTh3d8s As5hTc9d",
      Solver.process("omaha-holdem 7d7sKhTdTs Qs9h8c3h Jh2s4h8h 9c3s7h2c 5c4d5sJc As5hTc9d Ad2d2h4s JdTh3d8s Ac3cQh5d"));
  }

  @Test
  public void test_omaha_holdem_2804_2h3d4hAdTh_4dAs9s3s_Jd2d9h9d_Td4sQs5s_7d2sJs8d_6c5d6h5h_Qh7cQd3c() {
    assertEquals(
      "7d2sJs8d Jd2d9h9d Qh7cQd3c 4dAs9s3s Td4sQs5s 6c5d6h5h",
      Solver.process("omaha-holdem 2h3d4hAdTh 4dAs9s3s Jd2d9h9d Td4sQs5s 7d2sJs8d 6c5d6h5h Qh7cQd3c"));
  }

  @Test
  public void test_omaha_holdem_2805_2d4c5c8sTd_6hAc8c3d_7dKc9d3h_3cTc7sAd() {
    assertEquals(
      "7dKc9d3h 3cTc7sAd 6hAc8c3d",
      Solver.process("omaha-holdem 2d4c5c8sTd 6hAc8c3d 7dKc9d3h 3cTc7sAd"));
  }

  @Test
  public void test_omaha_holdem_2806_3h4h5cQhTs_4dJdAhAc_Kd4cQcQs_4s3dKs8d_9c9s9h3s_7c3c6sTc_6h7h2h7s_8cKcJh2s() {
    assertEquals(
      "8cKcJh2s 9c9s9h3s 4dJdAhAc 4s3dKs8d Kd4cQcQs 7c3c6sTc 6h7h2h7s",
      Solver.process("omaha-holdem 3h4h5cQhTs 4dJdAhAc Kd4cQcQs 4s3dKs8d 9c9s9h3s 7c3c6sTc 6h7h2h7s 8cKcJh2s"));
  }

  @Test
  public void test_omaha_holdem_2807_6s7d9cAdQs_Kd7h8s3h_4h8hQdAh_5c8cTh4d_4c5dJhTs_Qc9h7sJc_Qh6d6h2d_Ac3c2sTc_6c9s7c2c() {
    assertEquals(
      "4c5dJhTs Kd7h8s3h Ac3c2sTc 6c9s7c2c Qc9h7sJc 4h8hQdAh Qh6d6h2d 5c8cTh4d",
      Solver.process("omaha-holdem 6s7d9cAdQs Kd7h8s3h 4h8hQdAh 5c8cTh4d 4c5dJhTs Qc9h7sJc Qh6d6h2d Ac3c2sTc 6c9s7c2c"));
  }

  @Test
  public void test_omaha_holdem_2808_JdKdKhKsTs_Qc6c2dAd_6dQhAh2h_Td5c8hQs_6hAc3c2s_5d9s4cJh_Jc3h9c2c_3d8s9h3s_9dTh5h8d_7s4h4d5s() {
    assertEquals(
      "9dTh5h8d 5d9s4cJh=Jc3h9c2c Td5c8hQs 6hAc3c2s 6dQhAh2h=Qc6c2dAd 3d8s9h3s 7s4h4d5s",
      Solver.process("omaha-holdem JdKdKhKsTs Qc6c2dAd 6dQhAh2h Td5c8hQs 6hAc3c2s 5d9s4cJh Jc3h9c2c 3d8s9h3s 9dTh5h8d 7s4h4d5s"));
  }

  @Test
  public void test_omaha_holdem_2809_3d4h5sJdTd_2c9h2hAh_5d9c9dJh_5c5h3s6h() {
    assertEquals(
      "5c5h3s6h 2c9h2hAh 5d9c9dJh",
      Solver.process("omaha-holdem 3d4h5sJdTd 2c9h2hAh 5d9c9dJh 5c5h3s6h"));
  }

  @Test
  public void test_omaha_holdem_2810_7s8cJhQhTs_Jd2dQc6s_Jc4sQs5s_2s4d6dKc_Tc9h9s7h() {
    assertEquals(
      "2s4d6dKc Jc4sQs5s=Jd2dQc6s Tc9h9s7h",
      Solver.process("omaha-holdem 7s8cJhQhTs Jd2dQc6s Jc4sQs5s 2s4d6dKc Tc9h9s7h"));
  }

  @Test
  public void test_omaha_holdem_2811_2c3dAsJdQs_7dTsJc6s_KcAh6d7h_5h6hJs9d_4d4s9hTh_Tc5c7cQh_8h4h9s2s_Ks8d5s7s_Ad5dJhQd() {
    assertEquals(
      "Ks8d5s7s 8h4h9s2s 4d4s9hTh 5h6hJs9d 7dTsJc6s Tc5c7cQh KcAh6d7h Ad5dJhQd",
      Solver.process("omaha-holdem 2c3dAsJdQs 7dTsJc6s KcAh6d7h 5h6hJs9d 4d4s9hTh Tc5c7cQh 8h4h9s2s Ks8d5s7s Ad5dJhQd"));
  }

  @Test
  public void test_omaha_holdem_2812_4c5dJcJsTd_2cTcKc4s_Kh2hJh4d_7sQs5c2s() {
    assertEquals(
      "7sQs5c2s 2cTcKc4s Kh2hJh4d",
      Solver.process("omaha-holdem 4c5dJcJsTd 2cTcKc4s Kh2hJh4d 7sQs5c2s"));
  }

  @Test
  public void test_omaha_holdem_2813_7s8hKcQcQs_2c5hTsJd_AhAcJs3d_Tc2h8sJh_7d9hQd9d_2sKd4s5d_Ks5c8d5s() {
    assertEquals(
      "2c5hTsJd Tc2h8sJh 2sKd4s5d Ks5c8d5s AhAcJs3d 7d9hQd9d",
      Solver.process("omaha-holdem 7s8hKcQcQs 2c5hTsJd AhAcJs3d Tc2h8sJh 7d9hQd9d 2sKd4s5d Ks5c8d5s"));
  }

  @Test
  public void test_omaha_holdem_2814_2c9cAsJcKs_9s6h3s9d_3c4c3h9h_7h6c2sQh_JhTd8c5s() {
    assertEquals(
      "7h6c2sQh JhTd8c5s 9s6h3s9d 3c4c3h9h",
      Solver.process("omaha-holdem 2c9cAsJcKs 9s6h3s9d 3c4c3h9h 7h6c2sQh JhTd8c5s"));
  }

  @Test
  public void test_omaha_holdem_2815_5dAdAsJdQs_9hKc9d8h_JsKdKs7c_3c4h2c5h_TdQhTcQc_6sAh9c8s() {
    assertEquals(
      "3c4h2c5h 9hKc9d8h JsKdKs7c 6sAh9c8s TdQhTcQc",
      Solver.process("omaha-holdem 5dAdAsJdQs 9hKc9d8h JsKdKs7c 3c4h2c5h TdQhTcQc 6sAh9c8s"));
  }

  @Test
  public void test_omaha_holdem_2816_2s4d4sJcQd_TcJh7s8h_As8sQh5s_3d6s8c7h_7d7c2h6h_Kc4cKhAc() {
    assertEquals(
      "3d6s8c7h 7d7c2h6h TcJh7s8h As8sQh5s Kc4cKhAc",
      Solver.process("omaha-holdem 2s4d4sJcQd TcJh7s8h As8sQh5s 3d6s8c7h 7d7c2h6h Kc4cKhAc"));
  }

  @Test
  public void test_omaha_holdem_2817_5c7c7hJsTs_Tc2cQd4c_Ad9c6cTd() {
    assertEquals(
      "Tc2cQd4c Ad9c6cTd",
      Solver.process("omaha-holdem 5c7c7hJsTs Tc2cQd4c Ad9c6cTd"));
  }

  @Test
  public void test_omaha_holdem_2818_5s7h8d9h9s_Tc2s7d3h_5c6h4d7c_4cKd5h9c_AhKh5dQh() {
    assertEquals(
      "AhKh5dQh Tc2s7d3h 5c6h4d7c 4cKd5h9c",
      Solver.process("omaha-holdem 5s7h8d9h9s Tc2s7d3h 5c6h4d7c 4cKd5h9c AhKh5dQh"));
  }

  @Test
  public void test_omaha_holdem_2819_7d7h9c9hJc_QsAs2cKd_7s8cKcAc_8d7c6dKs_Ad2d5sTc_AhJdTs4s_4d5h3hQc() {
    assertEquals(
      "4d5h3hQc Ad2d5sTc QsAs2cKd AhJdTs4s 8d7c6dKs 7s8cKcAc",
      Solver.process("omaha-holdem 7d7h9c9hJc QsAs2cKd 7s8cKcAc 8d7c6dKs Ad2d5sTc AhJdTs4s 4d5h3hQc"));
  }

  @Test
  public void test_omaha_holdem_2820_3d6dAhQsTc_4cJhJd8c_9sAd6h6c_Qh8s6s3h_4h7d2cTh_7cQcAsJc_9h2s2dTd_7h4s8h3s_Ks5s7sTs_AcKc5cKh() {
    assertEquals(
      "7h4s8h3s 4h7d2cTh 9h2s2dTd Ks5s7sTs 4cJhJd8c AcKc5cKh Qh8s6s3h 7cQcAsJc 9sAd6h6c",
      Solver.process("omaha-holdem 3d6dAhQsTc 4cJhJd8c 9sAd6h6c Qh8s6s3h 4h7d2cTh 7cQcAsJc 9h2s2dTd 7h4s8h3s Ks5s7sTs AcKc5cKh"));
  }

  @Test
  public void test_omaha_holdem_2821_3d6cJcQcTh_9d4sAs5s_Kh3cAd3s_4h2c6dQh_4c5h9s7c_4d2sKd3h_5c9hAcKc_JdTd8d8s() {
    assertEquals(
      "9d4sAs5s 4d2sKd3h JdTd8d8s 4h2c6dQh Kh3cAd3s 4c5h9s7c 5c9hAcKc",
      Solver.process("omaha-holdem 3d6cJcQcTh 9d4sAs5s Kh3cAd3s 4h2c6dQh 4c5h9s7c 4d2sKd3h 5c9hAcKc JdTd8d8s"));
  }

  @Test
  public void test_omaha_holdem_2822_3h8sJhJsQh_6c5s5c6d_8hTh9h7h_8d2sJd3d_7d2d9d9c_3cKd4sAc_7cAs5hKh() {
    assertEquals(
      "3cKd4sAc 6c5s5c6d 7d2d9d9c 8hTh9h7h 7cAs5hKh 8d2sJd3d",
      Solver.process("omaha-holdem 3h8sJhJsQh 6c5s5c6d 8hTh9h7h 8d2sJd3d 7d2d9d9c 3cKd4sAc 7cAs5hKh"));
  }

  @Test
  public void test_omaha_holdem_2823_4c6d8sJsQh_Qd8cTs9c_Jh8d6sKs_As7c4s8h_9d3c6cJd_3sQc7s7d_AcJcKh5h_5cTh7hKc() {
    assertEquals(
      "AcJcKh5h 3sQc7s7d As7c4s8h 9d3c6cJd Jh8d6sKs 5cTh7hKc Qd8cTs9c",
      Solver.process("omaha-holdem 4c6d8sJsQh Qd8cTs9c Jh8d6sKs As7c4s8h 9d3c6cJd 3sQc7s7d AcJcKh5h 5cTh7hKc"));
  }

  @Test
  public void test_omaha_holdem_2824_2c2h3h9dQh_Th8d5h8h_7h4cKh3s_JhTd3dTs_6s7s9h8c_4d2sAcAs() {
    assertEquals(
      "6s7s9h8c JhTd3dTs 4d2sAcAs Th8d5h8h 7h4cKh3s",
      Solver.process("omaha-holdem 2c2h3h9dQh Th8d5h8h 7h4cKh3s JhTd3dTs 6s7s9h8c 4d2sAcAs"));
  }

  @Test
  public void test_omaha_holdem_2825_6c8c9hJsQd_3hAhJdAd_5cJh9s8d_2sTs7h6h_QcQh4s4d_3d2c5sTc_9c3sKs3c_9d7d8h5h_Qs5d6s7c() {
    assertEquals(
      "3d2c5sTc 9c3sKs3c 3hAhJdAd 5cJh9s8d QcQh4s4d 9d7d8h5h=Qs5d6s7c 2sTs7h6h",
      Solver.process("omaha-holdem 6c8c9hJsQd 3hAhJdAd 5cJh9s8d 2sTs7h6h QcQh4s4d 3d2c5sTc 9c3sKs3c 9d7d8h5h Qs5d6s7c"));
  }

  @Test
  public void test_omaha_holdem_2826_8dAcJhKdTh_2s5d7d3c_QdAsTd4d_9d5cKh7c_Qc6sTs6h_7h9c8h7s_Qs3h8c8s_2cJc6c4h_TcJd2dAh() {
    assertEquals(
      "2s5d7d3c 2cJc6c4h TcJd2dAh Qs3h8c8s 7h9c8h7s=9d5cKh7c Qc6sTs6h=QdAsTd4d",
      Solver.process("omaha-holdem 8dAcJhKdTh 2s5d7d3c QdAsTd4d 9d5cKh7c Qc6sTs6h 7h9c8h7s Qs3h8c8s 2cJc6c4h TcJd2dAh"));
  }

  @Test
  public void test_omaha_holdem_2827_5c6h7s9dAc_KhKc7cAh_4s6cJs5h_3cQcTh4c_3s2sTc5s() {
    assertEquals(
      "3s2sTc5s 4s6cJs5h KhKc7cAh 3cQcTh4c",
      Solver.process("omaha-holdem 5c6h7s9dAc KhKc7cAh 4s6cJs5h 3cQcTh4c 3s2sTc5s"));
  }

  @Test
  public void test_omaha_holdem_2828_3d4d6s8hJs_7d6dKd2c_2d9d3h8c_2hTsQdQc_7sTc2s8d_9sAc4cKh_JcQs6hKs_9cAd7c9h_5c7hQhJh_6cAs5s5h() {
    assertEquals(
      "9sAc4cKh 7d6dKd2c 6cAs5s5h 7sTc2s8d 9cAd7c9h 2hTsQdQc 2d9d3h8c JcQs6hKs 5c7hQhJh",
      Solver.process("omaha-holdem 3d4d6s8hJs 7d6dKd2c 2d9d3h8c 2hTsQdQc 7sTc2s8d 9sAc4cKh JcQs6hKs 9cAd7c9h 5c7hQhJh 6cAs5s5h"));
  }

  @Test
  public void test_omaha_holdem_2829_2h3d7h8cJh_4sJc7cTc_5d5s3hAs_KcAh9d8d() {
    assertEquals(
      "5d5s3hAs KcAh9d8d 4sJc7cTc",
      Solver.process("omaha-holdem 2h3d7h8cJh 4sJc7cTc 5d5s3hAs KcAh9d8d"));
  }

  @Test
  public void test_omaha_holdem_2830_5c6h8cQdTc_4c2dAhAs_5hQh9h7c_TsKcKh5s_4hThQs8s_3d8d6d7h_9c4s8hJh_2s6cKsJc_3s7d3h6s() {
    assertEquals(
      "3s7d3h6s 4c2dAhAs 3d8d6d7h TsKcKh5s 4hThQs8s 5hQh9h7c 9c4s8hJh 2s6cKsJc",
      Solver.process("omaha-holdem 5c6h8cQdTc 4c2dAhAs 5hQh9h7c TsKcKh5s 4hThQs8s 3d8d6d7h 9c4s8hJh 2s6cKsJc 3s7d3h6s"));
  }

  @Test
  public void test_omaha_holdem_2831_5h6s7s9cTc_AsQs6cTd_KhAc4c7c_8dAhTs5c_QdAd2h6h_3h7d9hKc_Jc7h5dJd_4d8hKs2d_3d2cJs4s() {
    assertEquals(
      "QdAd2h6h KhAc4c7c Jc7h5dJd 3h7d9hKc AsQs6cTd 3d2cJs4s 4d8hKs2d 8dAhTs5c",
      Solver.process("omaha-holdem 5h6s7s9cTc AsQs6cTd KhAc4c7c 8dAhTs5c QdAd2h6h 3h7d9hKc Jc7h5dJd 4d8hKs2d 3d2cJs4s"));
  }

  @Test
  public void test_omaha_holdem_2832_5s6hJhThTs_2hQsAd9c_7h2sAsKc_3dJdJs9d_Ks4d6cQc_7s8h9h7c_9sTc4hAc_5d4s3sQd() {
    assertEquals(
      "2hQsAd9c 7h2sAsKc 5d4s3sQd Ks4d6cQc 9sTc4hAc 7s8h9h7c 3dJdJs9d",
      Solver.process("omaha-holdem 5s6hJhThTs 2hQsAd9c 7h2sAsKc 3dJdJs9d Ks4d6cQc 7s8h9h7c 9sTc4hAc 5d4s3sQd"));
  }

  @Test
  public void test_omaha_holdem_2833_3d4h7dQsTc_4dAcQc4s_5dQd8hJd_Ad2c5s8c_Ah2dKhKd() {
    assertEquals(
      "Ad2c5s8c 5dQd8hJd Ah2dKhKd 4dAcQc4s",
      Solver.process("omaha-holdem 3d4h7dQsTc 4dAcQc4s 5dQd8hJd Ad2c5s8c Ah2dKhKd"));
  }

  @Test
  public void test_omaha_holdem_2834_2s8s9dAcAh_4h7d8hJh_5s3sJd6h_4sKs3d6c_Qs3c9c9h_6sAd7cTh_Qc2dKd2h() {
    assertEquals(
      "5s3sJd6h 4sKs3d6c 4h7d8hJh 6sAd7cTh Qc2dKd2h Qs3c9c9h",
      Solver.process("omaha-holdem 2s8s9dAcAh 4h7d8hJh 5s3sJd6h 4sKs3d6c Qs3c9c9h 6sAd7cTh Qc2dKd2h"));
  }

  @Test
  public void test_omaha_holdem_2835_4h6hJcTdTh_9c2s8s6s_KhKd2c6d_4c5s5hAd() {
    assertEquals(
      "4c5s5hAd 9c2s8s6s KhKd2c6d",
      Solver.process("omaha-holdem 4h6hJcTdTh 9c2s8s6s KhKd2c6d 4c5s5hAd"));
  }

  @Test
  public void test_omaha_holdem_2836_3d4cJdJsQs_Kc6h8h9c_Ks3h2d7h_AsQd8d6d_5d2c7s8s_9d9s6c4d_3sTsQh7d_5cTdKd7c() {
    assertEquals(
      "5d2c7s8s Kc6h8h9c 5cTdKd7c Ks3h2d7h 9d9s6c4d 3sTsQh7d AsQd8d6d",
      Solver.process("omaha-holdem 3d4cJdJsQs Kc6h8h9c Ks3h2d7h AsQd8d6d 5d2c7s8s 9d9s6c4d 3sTsQh7d 5cTdKd7c"));
  }

  @Test
  public void test_omaha_holdem_2837_2c2d5d8sKs_3h6hJcAd_2sAhKd7c_Ac7hJd9c_3dTsThTd_3c8d2h3s() {
    assertEquals(
      "3h6hJcAd=Ac7hJd9c 3dTsThTd 3c8d2h3s 2sAhKd7c",
      Solver.process("omaha-holdem 2c2d5d8sKs 3h6hJcAd 2sAhKd7c Ac7hJd9c 3dTsThTd 3c8d2h3s"));
  }

  @Test
  public void test_omaha_holdem_2838_2c2s5dKdTs_3s5hJd3c_8d2hKc4c_4dTh3hKs_9hKh4sQc_7hAc8sTd_8h6h7d9s_9dQd4hTc() {
    assertEquals(
      "8h6h7d9s 3s5hJd3c 9dQd4hTc 7hAc8sTd 9hKh4sQc 4dTh3hKs 8d2hKc4c",
      Solver.process("omaha-holdem 2c2s5dKdTs 3s5hJd3c 8d2hKc4c 4dTh3hKs 9hKh4sQc 7hAc8sTd 8h6h7d9s 9dQd4hTc"));
  }

  @Test
  public void test_omaha_holdem_2839_4c5h6d7sAs_Qh3hQc6h_2s7c3c8s() {
    assertEquals(
      "Qh3hQc6h 2s7c3c8s",
      Solver.process("omaha-holdem 4c5h6d7sAs Qh3hQc6h 2s7c3c8s"));
  }

  @Test
  public void test_omaha_holdem_2840_3c6d7sJdTd_QhAcTs2h_8h9c5c3h_2d6h5hAd_Qd6cJsJc_Qc5dKc3d_AsAh7dQs_Kh4c8c8s_JhKs2s8d() {
    assertEquals(
      "Kh4c8c8s QhAcTs2h JhKs2s8d AsAh7dQs Qd6cJsJc 8h9c5c3h Qc5dKc3d 2d6h5hAd",
      Solver.process("omaha-holdem 3c6d7sJdTd QhAcTs2h 8h9c5c3h 2d6h5hAd Qd6cJsJc Qc5dKc3d AsAh7dQs Kh4c8c8s JhKs2s8d"));
  }

  @Test
  public void test_omaha_holdem_2841_4h6dAsQcTd_6s7hTs9h_5h3s4s3d_Jd9d8h9s_QsKsKhTc_2hAd6c2c() {
    assertEquals(
      "5h3s4s3d Jd9d8h9s 6s7hTs9h QsKsKhTc 2hAd6c2c",
      Solver.process("omaha-holdem 4h6dAsQcTd 6s7hTs9h 5h3s4s3d Jd9d8h9s QsKsKhTc 2hAd6c2c"));
  }

  @Test
  public void test_omaha_holdem_2842_3h4d8sKsQd_4hTcKc8h_7dTs6sJc() {
    assertEquals(
      "7dTs6sJc 4hTcKc8h",
      Solver.process("omaha-holdem 3h4d8sKsQd 4hTcKc8h 7dTs6sJc"));
  }

  @Test
  public void test_omaha_holdem_2843_5c5d9dJdQd_Ah8hAdKs_2sJs9c9h_8c2cTcKh_3hAc6h2h_Th4d9sQh_5s4cJc7c_3sJh6s5h_Kd3d6c6d() {
    assertEquals(
      "3hAc6h2h Th4d9sQh Ah8hAdKs 8c2cTcKh Kd3d6c6d 3sJh6s5h=5s4cJc7c 2sJs9c9h",
      Solver.process("omaha-holdem 5c5d9dJdQd Ah8hAdKs 2sJs9c9h 8c2cTcKh 3hAc6h2h Th4d9sQh 5s4cJc7c 3sJh6s5h Kd3d6c6d"));
  }

  @Test
  public void test_omaha_holdem_2844_6d7d8sAcJs_Qs8hKd9d_KcKhAd8d_5hAs3s4c_8c2c6c3c() {
    assertEquals(
      "Qs8hKd9d 8c2c6c3c KcKhAd8d 5hAs3s4c",
      Solver.process("omaha-holdem 6d7d8sAcJs Qs8hKd9d KcKhAd8d 5hAs3s4c 8c2c6c3c"));
  }

  @Test
  public void test_omaha_holdem_2845_2c4s9sKdTh_Qd7sJhKh_3d9dTcKc_Qh5d7h8s_6dJc9hTd_6c8c5c2d() {
    assertEquals(
      "Qh5d7h8s 6c8c5c2d 6dJc9hTd 3d9dTcKc Qd7sJhKh",
      Solver.process("omaha-holdem 2c4s9sKdTh Qd7sJhKh 3d9dTcKc Qh5d7h8s 6dJc9hTd 6c8c5c2d"));
  }

  @Test
  public void test_omaha_holdem_2846_4h6d6h8cTh_3h3c2d5s_QsJd2sAd_3d8dTc5d_5h9d8h8s_KsKdTsAh_Kh5c9s6c_2hJh7c2c_6s7h4d9c_7s4c4s7d() {
    assertEquals(
      "QsJd2sAd 3h3c2d5s 3d8dTc5d KsKdTsAh Kh5c9s6c 2hJh7c2c 7s4c4s7d 6s7h4d9c 5h9d8h8s",
      Solver.process("omaha-holdem 4h6d6h8cTh 3h3c2d5s QsJd2sAd 3d8dTc5d 5h9d8h8s KsKdTsAh Kh5c9s6c 2hJh7c2c 6s7h4d9c 7s4c4s7d"));
  }

  @Test
  public void test_omaha_holdem_2847_2d2h6h8dTd_7dJsAd6c_TcJd7cKc_AhThAc9c_As9h6dQd_8hKd3d7h_2c5c3h3s() {
    assertEquals(
      "TcJd7cKc AhThAc9c 2c5c3h3s As9h6dQd 8hKd3d7h 7dJsAd6c",
      Solver.process("omaha-holdem 2d2h6h8dTd 7dJsAd6c TcJd7cKc AhThAc9c As9h6dQd 8hKd3d7h 2c5c3h3s"));
  }

  @Test
  public void test_omaha_holdem_2848_3dJcJsKcTh_7sKs5d7d_As2d2c4s_Td2h4h6d_QcJhAd9h_5hTsJd3c_9s7hQd8h_Tc6sKd6c_Qh3h4d5c() {
    assertEquals(
      "As2d2c4s Qh3h4d5c Td2h4h6d 7sKs5d7d Tc6sKd6c 9s7hQd8h QcJhAd9h 5hTsJd3c",
      Solver.process("omaha-holdem 3dJcJsKcTh 7sKs5d7d As2d2c4s Td2h4h6d QcJhAd9h 5hTsJd3c 9s7hQd8h Tc6sKd6c Qh3h4d5c"));
  }

  @Test
  public void test_omaha_holdem_2849_3c8cAsJdQc_7h8s2c3s_QsQh6cKd_9c5dTs2h_Js6sTh9d() {
    assertEquals(
      "7h8s2c3s QsQh6cKd 9c5dTs2h=Js6sTh9d",
      Solver.process("omaha-holdem 3c8cAsJdQc 7h8s2c3s QsQh6cKd 9c5dTs2h Js6sTh9d"));
  }

  @Test
  public void test_omaha_holdem_2850_2s5h7hAsQh_6h4sAh8h_KcQs9d7c_7dTs9sJc_6c4d2dTc_8c7sKh2h_5cKd6dJh_4c9cQcTh() {
    assertEquals(
      "6c4d2dTc 5cKd6dJh 7dTs9sJc 4c9cQcTh KcQs9d7c 8c7sKh2h 6h4sAh8h",
      Solver.process("omaha-holdem 2s5h7hAsQh 6h4sAh8h KcQs9d7c 7dTs9sJc 6c4d2dTc 8c7sKh2h 5cKd6dJh 4c9cQcTh"));
  }

  @Test
  public void test_omaha_holdem_2851_4d7d8h9hQd_2sAhJh3d_3hAsAd6h_Kd6s3sTd_KsJc4h8s_5s9s5hAc_8cKh2cQs() {
    assertEquals(
      "2sAhJh3d 5s9s5hAc 3hAsAd6h KsJc4h8s 8cKh2cQs Kd6s3sTd",
      Solver.process("omaha-holdem 4d7d8h9hQd 2sAhJh3d 3hAsAd6h Kd6s3sTd KsJc4h8s 5s9s5hAc 8cKh2cQs"));
  }

  @Test
  public void test_omaha_holdem_2852_6d9sKcKhKs_3hAh2sTh_4dQd2dJd_Td7d3s8s_5d9d8hQc_9h4sKd3d_5c7h5sJh() {
    assertEquals(
      "Td7d3s8s 5d9d8hQc 4dQd2dJd 3hAh2sTh 5c7h5sJh 9h4sKd3d",
      Solver.process("omaha-holdem 6d9sKcKhKs 3hAh2sTh 4dQd2dJd Td7d3s8s 5d9d8hQc 9h4sKd3d 5c7h5sJh"));
  }

  @Test
  public void test_omaha_holdem_2853_2s3sAsKsTs_Jd6d6c3h_4hAh8sJc() {
    assertEquals(
      "Jd6d6c3h 4hAh8sJc",
      Solver.process("omaha-holdem 2s3sAsKsTs Jd6d6c3h 4hAh8sJc"));
  }

  @Test
  public void test_omaha_holdem_2854_2s7c8d8sQs_8c6s6d9c_9d9h3hQd_5s4dKs6h_3d7hJh7s_Kd4s2dKh_AcTdQcAs_Jd5d3cAh_Tc9s4c6c_3sTs7d2c() {
    assertEquals(
      "Tc9s4c6c Jd5d3cAh 9d9h3hQd Kd4s2dKh AcTdQcAs 8c6s6d9c 3sTs7d2c 5s4dKs6h 3d7hJh7s",
      Solver.process("omaha-holdem 2s7c8d8sQs 8c6s6d9c 9d9h3hQd 5s4dKs6h 3d7hJh7s Kd4s2dKh AcTdQcAs Jd5d3cAh Tc9s4c6c 3sTs7d2c"));
  }

  @Test
  public void test_omaha_holdem_2855_3d7s8dQcTh_2h9sKsAc_2s4s5hAd_AhQd7d5c_Jd4cQhJs() {
    assertEquals(
      "2s4s5hAd 2h9sKsAc Jd4cQhJs AhQd7d5c",
      Solver.process("omaha-holdem 3d7s8dQcTh 2h9sKsAc 2s4s5hAd AhQd7d5c Jd4cQhJs"));
  }

  @Test
  public void test_omaha_holdem_2856_2c2d3d9sTc_7c3c9h8h_3sTh4s2h_3h7sQdJs_Qs9c5cJh_JcKs8c2s_9d7dAcKc_Qc5dAd6h() {
    assertEquals(
      "Qc5dAd6h 3h7sQdJs Qs9c5cJh 9d7dAcKc 7c3c9h8h JcKs8c2s 3sTh4s2h",
      Solver.process("omaha-holdem 2c2d3d9sTc 7c3c9h8h 3sTh4s2h 3h7sQdJs Qs9c5cJh JcKs8c2s 9d7dAcKc Qc5dAd6h"));
  }

  @Test
  public void test_omaha_holdem_2857_4d9d9hJcJs_7cKs6c4c_8dJhQhQs_7dTs2hTc_5s7s2s9c_Th8c6s6d() {
    assertEquals(
      "7cKs6c4c Th8c6s6d 7dTs2hTc 5s7s2s9c 8dJhQhQs",
      Solver.process("omaha-holdem 4d9d9hJcJs 7cKs6c4c 8dJhQhQs 7dTs2hTc 5s7s2s9c Th8c6s6d"));
  }

  @Test
  public void test_omaha_holdem_2858_6h7c8c8d9h_TsQh4c9c_JcAcQsKc_5hKsAdAh_9sJs2c8s_Jd5c3cKd_3h2hTc5s_6c4s8hJh_5dThQd4d() {
    assertEquals(
      "3h2hTc5s Jd5c3cKd JcAcQsKc 5hKsAdAh 5dThQd4d TsQh4c9c 6c4s8hJh 9sJs2c8s",
      Solver.process("omaha-holdem 6h7c8c8d9h TsQh4c9c JcAcQsKc 5hKsAdAh 9sJs2c8s Jd5c3cKd 3h2hTc5s 6c4s8hJh 5dThQd4d"));
  }

  @Test
  public void test_omaha_holdem_2859_4dAsKcKdQc_8cQh7sKh_Ad3hTs2s() {
    assertEquals(
      "Ad3hTs2s 8cQh7sKh",
      Solver.process("omaha-holdem 4dAsKcKdQc 8cQh7sKh Ad3hTs2s"));
  }

  @Test
  public void test_omaha_holdem_2860_4h5d7cAdKs_2c8dKdJc_Jh5cTh8c() {
    assertEquals(
      "Jh5cTh8c 2c8dKdJc",
      Solver.process("omaha-holdem 4h5d7cAdKs 2c8dKdJc Jh5cTh8c"));
  }

  @Test
  public void test_omaha_holdem_2861_3s7cJhQsTh_4sTsKs2c_5c7s3h5d_Kc4h8c6d() {
    assertEquals(
      "Kc4h8c6d 4sTsKs2c 5c7s3h5d",
      Solver.process("omaha-holdem 3s7cJhQsTh 4sTsKs2c 5c7s3h5d Kc4h8c6d"));
  }

  @Test
  public void test_omaha_holdem_2862_6d6h7d8dJd_4sAhQh3d_4c7c2d6c() {
    assertEquals(
      "4sAhQh3d 4c7c2d6c",
      Solver.process("omaha-holdem 6d6h7d8dJd 4sAhQh3d 4c7c2d6c"));
  }

  @Test
  public void test_omaha_holdem_2863_2d5dAhKdTs_6h8h4hKc_6sQs2sJh_7hAc8s3d_3cKsQh5c_9hTh4d7c() {
    assertEquals(
      "9hTh4d7c 6h8h4hKc 7hAc8s3d 3cKsQh5c 6sQs2sJh",
      Solver.process("omaha-holdem 2d5dAhKdTs 6h8h4hKc 6sQs2sJh 7hAc8s3d 3cKsQh5c 9hTh4d7c"));
  }

  @Test
  public void test_omaha_holdem_2864_7h8cAdAsJh_3s6d5h7d_6hQh6s7c_7s9s5s5d_3h3d9dKs_Ts4h2d9h_Ah2sKc4c_JsTdJd6c_2h3c5c2c_8hThAcQs() {
    assertEquals(
      "2h3c5c2c 3h3d9dKs 3s6d5h7d 7s9s5s5d 6hQh6s7c Ah2sKc4c Ts4h2d9h JsTdJd6c 8hThAcQs",
      Solver.process("omaha-holdem 7h8cAdAsJh 3s6d5h7d 6hQh6s7c 7s9s5s5d 3h3d9dKs Ts4h2d9h Ah2sKc4c JsTdJd6c 2h3c5c2c 8hThAcQs"));
  }

  @Test
  public void test_omaha_holdem_2865_4d4h5hJhKc_As4s3cTc_Th6d5c8d_5sJsKh5d_Ks6c2s8h_Ah8c3s3h_9c6h8sQh_Ts2dJc9s_2h9dKd7h_3d2c7sQd() {
    assertEquals(
      "3d2c7sQd Th6d5c8d Ts2dJc9s Ks6c2s8h As4s3cTc 2h9dKd7h 9c6h8sQh Ah8c3s3h 5sJsKh5d",
      Solver.process("omaha-holdem 4d4h5hJhKc As4s3cTc Th6d5c8d 5sJsKh5d Ks6c2s8h Ah8c3s3h 9c6h8sQh Ts2dJc9s 2h9dKd7h 3d2c7sQd"));
  }

  @Test
  public void test_omaha_holdem_2866_2s4h6c7h9s_9hJd8cQh_Ac3d7d3h_5sJcKcKd() {
    assertEquals(
      "Ac3d7d3h 9hJd8cQh 5sJcKcKd",
      Solver.process("omaha-holdem 2s4h6c7h9s 9hJd8cQh Ac3d7d3h 5sJcKcKd"));
  }

  @Test
  public void test_omaha_holdem_2867_2d8cAhKcQs_5d7cKdTh_7dTs9s3s_5cKs9h5h_Kh6h3cAd_JsJc2cQd_Jh3hAc4h_6d2hQh6c_8dTd4d9c() {
    assertEquals(
      "7dTs9s3s 8dTd4d9c 5cKs9h5h 5d7cKdTh Jh3hAc4h 6d2hQh6c=JsJc2cQd Kh6h3cAd",
      Solver.process("omaha-holdem 2d8cAhKcQs 5d7cKdTh 7dTs9s3s 5cKs9h5h Kh6h3cAd JsJc2cQd Jh3hAc4h 6d2hQh6c 8dTd4d9c"));
  }

  @Test
  public void test_omaha_holdem_2868_4c8cJhKhTh_AhQd4sQc_Td9c5c2d_6d7d5d4h_8hJs2sQh_KsAc3h9d_8dJc3dKd_TsKcAs6s_Ad5hQs9s_9h3c3s2h() {
    assertEquals(
      "6d7d5d4h Td9c5c2d KsAc3h9d TsKcAs6s 8dJc3dKd Ad5hQs9s=AhQd4sQc 9h3c3s2h 8hJs2sQh",
      Solver.process("omaha-holdem 4c8cJhKhTh AhQd4sQc Td9c5c2d 6d7d5d4h 8hJs2sQh KsAc3h9d 8dJc3dKd TsKcAs6s Ad5hQs9s 9h3c3s2h"));
  }

  @Test
  public void test_omaha_holdem_2869_5d6hJcJsQh_Ts9c9s2d_Qs8d4d5s_As6dQdKc_Td8cQc2h_7hJd3c8s_3s6s2c2s_Th3d4sAh() {
    assertEquals(
      "Th3d4sAh 3s6s2c2s Ts9c9s2d Qs8d4d5s Td8cQc2h As6dQdKc 7hJd3c8s",
      Solver.process("omaha-holdem 5d6hJcJsQh Ts9c9s2d Qs8d4d5s As6dQdKc Td8cQc2h 7hJd3c8s 3s6s2c2s Th3d4sAh"));
  }

  @Test
  public void test_omaha_holdem_2870_2s3hAdKsQs_6c8hKc6h_Jh2d7c5h_Qc8s4c5c() {
    assertEquals(
      "Jh2d7c5h 6c8hKc6h Qc8s4c5c",
      Solver.process("omaha-holdem 2s3hAdKsQs 6c8hKc6h Jh2d7c5h Qc8s4c5c"));
  }

  @Test
  public void test_omaha_holdem_2871_3d4c8dQcQs_2dTc9d8c_4dKh2sKd_AhKs6h8s_4sThJc6s_As7h9s7s_Qh2c7d5d() {
    assertEquals(
      "4sThJc6s As7h9s7s 2dTc9d8c AhKs6h8s 4dKh2sKd Qh2c7d5d",
      Solver.process("omaha-holdem 3d4c8dQcQs 2dTc9d8c 4dKh2sKd AhKs6h8s 4sThJc6s As7h9s7s Qh2c7d5d"));
  }

  @Test
  public void test_omaha_holdem_2872_3c4s5d7cJh_5s2hTsKc_Td2sTh4d_AhKhJc8c_9s4hQhJs_Ad9h7h2d_9c2c7s4c_6cTc6h3s_6s8d8h9d_AsKdKs6d() {
    assertEquals(
      "5s2hTsKc Td2sTh4d AhKhJc8c AsKdKs6d 9c2c7s4c 9s4hQhJs Ad9h7h2d 6cTc6h3s 6s8d8h9d",
      Solver.process("omaha-holdem 3c4s5d7cJh 5s2hTsKc Td2sTh4d AhKhJc8c 9s4hQhJs Ad9h7h2d 9c2c7s4c 6cTc6h3s 6s8d8h9d AsKdKs6d"));
  }

  @Test
  public void test_omaha_holdem_2873_JcJdKdQcQd_3s6c5dTd_7h8s2s6h_7cQh5s7d_JsKh8dKc_6sQsJh2d_2c9c8h4s() {
    assertEquals(
      "7h8s2s6h 2c9c8h4s 7cQh5s7d 3s6c5dTd 6sQsJh2d JsKh8dKc",
      Solver.process("omaha-holdem JcJdKdQcQd 3s6c5dTd 7h8s2s6h 7cQh5s7d JsKh8dKc 6sQsJh2d 2c9c8h4s"));
  }

  @Test
  public void test_omaha_holdem_2874_3h4dJcKcKh_6s2dJd7h_6h3c2cTh_Tc5c4sTd_Ah7s2s9s_3d7d3s8h_QcJs7c8s() {
    assertEquals(
      "Ah7s2s9s 6h3c2cTh Tc5c4sTd 6s2dJd7h QcJs7c8s 3d7d3s8h",
      Solver.process("omaha-holdem 3h4dJcKcKh 6s2dJd7h 6h3c2cTh Tc5c4sTd Ah7s2s9s 3d7d3s8h QcJs7c8s"));
  }

  @Test
  public void test_omaha_holdem_2875_4d5h7cKcQh_Jh9dQdAs_4hThKs6s() {
    assertEquals(
      "Jh9dQdAs 4hThKs6s",
      Solver.process("omaha-holdem 4d5h7cKcQh Jh9dQdAs 4hThKs6s"));
  }

  @Test
  public void test_omaha_holdem_2876_3h4c9hQhTd_Th5sTs5d_8cQcJc6d() {
    assertEquals(
      "Th5sTs5d 8cQcJc6d",
      Solver.process("omaha-holdem 3h4c9hQhTd Th5sTs5d 8cQcJc6d"));
  }

  @Test
  public void test_omaha_holdem_2877_2c4s5s8sKh_4cTd4d7c_Th8c9s5h_7d7s3dJh_9h9cKc6c_Js3cAh8h() {
    assertEquals(
      "7d7s3dJh 9h9cKc6c Th8c9s5h 4cTd4d7c Js3cAh8h",
      Solver.process("omaha-holdem 2c4s5s8sKh 4cTd4d7c Th8c9s5h 7d7s3dJh 9h9cKc6c Js3cAh8h"));
  }

  @Test
  public void test_omaha_holdem_2878_2c3h5cAdJd_TsJh7s8s_3dThKhQh() {
    assertEquals(
      "3dThKhQh TsJh7s8s",
      Solver.process("omaha-holdem 2c3h5cAdJd TsJh7s8s 3dThKhQh"));
  }

  @Test
  public void test_omaha_holdem_2879_2c3d3s6cAc_AsJdTs7c_2d9c6dTh_6hKd8h6s_KsJs2h9s_QcQdTcQh_9d3cKc8c() {
    assertEquals(
      "KsJs2h9s 2d9c6dTh AsJdTs7c QcQdTcQh 9d3cKc8c 6hKd8h6s",
      Solver.process("omaha-holdem 2c3d3s6cAc AsJdTs7c 2d9c6dTh 6hKd8h6s KsJs2h9s QcQdTcQh 9d3cKc8c"));
  }

  @Test
  public void test_omaha_holdem_2880_2s7cAdJdJs_4cQhQsQc_4d9d9c5h_As6cAc7s() {
    assertEquals(
      "4d9d9c5h 4cQhQsQc As6cAc7s",
      Solver.process("omaha-holdem 2s7cAdJdJs 4cQhQsQc 4d9d9c5h As6cAc7s"));
  }

  @Test
  public void test_omaha_holdem_2881_3s4c6d8cTc_QhAs6c4s_2hJs2sTh_2c7sTdAc_3h3c3d2d_5sQdKh8s_Ts9hKs6h_Ad9s5dKd() {
    assertEquals(
      "Ad9s5dKd 5sQdKh8s 2hJs2sTh QhAs6c4s Ts9hKs6h 3h3c3d2d 2c7sTdAc",
      Solver.process("omaha-holdem 3s4c6d8cTc QhAs6c4s 2hJs2sTh 2c7sTdAc 3h3c3d2d 5sQdKh8s Ts9hKs6h Ad9s5dKd"));
  }

  @Test
  public void test_omaha_holdem_2882_3d3s4h7sTs_2c4d4s5d_3hAc8h2h_9d9hKhQh_8s4c5h5s_Qc6c6d8c_JdQs7cKc() {
    assertEquals(
      "Qc6c6d8c JdQs7cKc 9d9hKhQh 3hAc8h2h 8s4c5h5s 2c4d4s5d",
      Solver.process("omaha-holdem 3d3s4h7sTs 2c4d4s5d 3hAc8h2h 9d9hKhQh 8s4c5h5s Qc6c6d8c JdQs7cKc"));
  }

  @Test
  public void test_omaha_holdem_2883_7c7sAhJhKc_8h3dJs6h_3h2d8d3s_QsAcKh8c() {
    assertEquals(
      "3h2d8d3s 8h3dJs6h QsAcKh8c",
      Solver.process("omaha-holdem 7c7sAhJhKc 8h3dJs6h 3h2d8d3s QsAcKh8c"));
  }

  @Test
  public void test_omaha_holdem_2884_5h8sAcJcKh_2h7d4sQc_Kc7h2d4c_QdJsTs9s_Ah7sKs8c_6cQh8d8h() {
    assertEquals(
      "2h7d4sQc Kc7h2d4c Ah7sKs8c 6cQh8d8h QdJsTs9s",
      Solver.process("omaha-holdem 5h8sAcJcKh 2h7d4sQc Kc7h2d4c QdJsTs9s Ah7sKs8c 6cQh8d8h"));
  }

  @Test
  public void test_omaha_holdem_2885_2h6s7cAhQh_7d3h4dKd_5hJdQc6h_JcJs6d6c_3c3d5cKh_9cTdQd2c() {
    assertEquals(
      "3c3d5cKh 7d3h4dKd 9cTdQd2c JcJs6d6c 5hJdQc6h",
      Solver.process("omaha-holdem 2h6s7cAhQh 7d3h4dKd 5hJdQc6h JcJs6d6c 3c3d5cKh 9cTdQd2c"));
  }

  @Test
  public void test_omaha_holdem_2886_2d3h6sQdTd_4h7dJcJs_3cKsTc4c() {
    assertEquals(
      "4h7dJcJs 3cKsTc4c",
      Solver.process("omaha-holdem 2d3h6sQdTd 4h7dJcJs 3cKsTc4c"));
  }

  @Test
  public void test_omaha_holdem_2887_2d6c6d7d8s_6h7hJd2h_Th4h5h3c_Qd8cKhTd_KsQs7s4s_KcKdTcTs() {
    assertEquals(
      "KsQs7s4s KcKdTcTs Th4h5h3c Qd8cKhTd 6h7hJd2h",
      Solver.process("omaha-holdem 2d6c6d7d8s 6h7hJd2h Th4h5h3c Qd8cKhTd KsQs7s4s KcKdTcTs"));
  }

  @Test
  public void test_omaha_holdem_2888_7s9dJsTcTh_2d3h9cQc_2c3c7h4h_2s8d8cJc_Qd2h8h4d_8sTsAcKs_Jd6h6dAd_5sKd7c3s_6sAs5d9h() {
    assertEquals(
      "2c3c7h4h 5sKd7c3s 2d3h9cQc 6sAs5d9h Jd6h6dAd 2s8d8cJc=8sTsAcKs Qd2h8h4d",
      Solver.process("omaha-holdem 7s9dJsTcTh 2d3h9cQc 2c3c7h4h 2s8d8cJc Qd2h8h4d 8sTsAcKs Jd6h6dAd 5sKd7c3s 6sAs5d9h"));
  }

  @Test
  public void test_omaha_holdem_2889_2c8sKhQdTs_As8h8d9c_7d6s6c7h_Th6dJdQh_2dJsAh4c_4hQcTc3h_5c7c9d4d() {
    assertEquals(
      "5c7c9d4d 7d6s6c7h 4hQcTc3h=Th6dJdQh As8h8d9c 2dJsAh4c",
      Solver.process("omaha-holdem 2c8sKhQdTs As8h8d9c 7d6s6c7h Th6dJdQh 2dJsAh4c 4hQcTc3h 5c7c9d4d"));
  }

  @Test
  public void test_omaha_holdem_2890_4s5hAsJcKc_7d2sQs3c_7cQc2h8h_3d8dAh9c() {
    assertEquals(
      "7cQc2h8h 3d8dAh9c 7d2sQs3c",
      Solver.process("omaha-holdem 4s5hAsJcKc 7d2sQs3c 7cQc2h8h 3d8dAh9c"));
  }

  @Test
  public void test_omaha_holdem_2891_3h4d7sQsTh_Kh9sQh8s_Ad3cJsAh_Jh8c7cKc_5cTc6dTs_5dAs6s9c_2s2dJcJd() {
    assertEquals(
      "Jh8c7cKc 2s2dJcJd Kh9sQh8s Ad3cJsAh 5cTc6dTs=5dAs6s9c",
      Solver.process("omaha-holdem 3h4d7sQsTh Kh9sQh8s Ad3cJsAh Jh8c7cKc 5cTc6dTs 5dAs6s9c 2s2dJcJd"));
  }

  @Test
  public void test_omaha_holdem_2892_2d2s7dJcJh_AcTcQd9d_7sTs5c6s_5sQc4h6h_4c9s8c9c_Ah6cQh2h_4d8d6dJd() {
    assertEquals(
      "5sQc4h6h AcTcQd9d 7sTs5c6s 4c9s8c9c Ah6cQh2h 4d8d6dJd",
      Solver.process("omaha-holdem 2d2s7dJcJh AcTcQd9d 7sTs5c6s 5sQc4h6h 4c9s8c9c Ah6cQh2h 4d8d6dJd"));
  }

  @Test
  public void test_omaha_holdem_2893_4c4s5c8cQs_3hJhKhJc_7d3d6dKd_5s7hAh3c_9d3s6c2h_Qh7c8d7s_4d8h6h9h_9sAsTc5d() {
    assertEquals(
      "9d3s6c2h 5s7hAh3c=9sAsTc5d 3hJhKhJc Qh7c8d7s 7d3d6dKd 4d8h6h9h",
      Solver.process("omaha-holdem 4c4s5c8cQs 3hJhKhJc 7d3d6dKd 5s7hAh3c 9d3s6c2h Qh7c8d7s 4d8h6h9h 9sAsTc5d"));
  }

  @Test
  public void test_omaha_holdem_2894_7d7s9h9sJs_JcTh5sAc_4s5c9dQs_5hAs6d4c() {
    assertEquals(
      "5hAs6d4c JcTh5sAc 4s5c9dQs",
      Solver.process("omaha-holdem 7d7s9h9sJs JcTh5sAc 4s5c9dQs 5hAs6d4c"));
  }

  @Test
  public void test_omaha_holdem_2895_2s6d9hAsTh_Qd2hJsJh_8s6sTcQh_Td5sQc7c_8c7d4hKh() {
    assertEquals(
      "Td5sQc7c Qd2hJsJh 8s6sTcQh 8c7d4hKh",
      Solver.process("omaha-holdem 2s6d9hAsTh Qd2hJsJh 8s6sTcQh Td5sQc7c 8c7d4hKh"));
  }

  @Test
  public void test_omaha_holdem_2896_2d5c7c9dKh_9h9c5sKc_QcJsAdJd_Ks7h4hKd_AcAh6h8d_8hJc9s6s_As8c3h6c() {
    assertEquals(
      "QcJsAdJd 9h9c5sKc Ks7h4hKd 8hJc9s6s=AcAh6h8d=As8c3h6c",
      Solver.process("omaha-holdem 2d5c7c9dKh 9h9c5sKc QcJsAdJd Ks7h4hKd AcAh6h8d 8hJc9s6s As8c3h6c"));
  }

  @Test
  public void test_omaha_holdem_2897_4h6h7hJsQd_3d9d8h4s_AhKsJh5s_Kc2sQcJc_Qs3cKh9c_Qh2d2cTh_Kd4c7c6s_5c8d3s8c_2h4dTs7d_TcAs7sTd() {
    assertEquals(
      "3d9d8h4s TcAs7sTd Qs3cKh9c 2h4dTs7d Kd4c7c6s Kc2sQcJc 5c8d3s8c Qh2d2cTh AhKsJh5s",
      Solver.process("omaha-holdem 4h6h7hJsQd 3d9d8h4s AhKsJh5s Kc2sQcJc Qs3cKh9c Qh2d2cTh Kd4c7c6s 5c8d3s8c 2h4dTs7d TcAs7sTd"));
  }

  @Test
  public void test_omaha_holdem_2898_3d6dAsJcKd_Jd5dTh6h_8cAh8s5s_7h6cKc9c_QdQs3sTs() {
    assertEquals(
      "8cAh8s5s 7h6cKc9c QdQs3sTs Jd5dTh6h",
      Solver.process("omaha-holdem 3d6dAsJcKd Jd5dTh6h 8cAh8s5s 7h6cKc9c QdQs3sTs"));
  }

  @Test
  public void test_omaha_holdem_2899_2h5d7c9hQc_Js9s3hKh_8cAcTcQd_6s7h9cTh() {
    assertEquals(
      "Js9s3hKh 8cAcTcQd 6s7h9cTh",
      Solver.process("omaha-holdem 2h5d7c9hQc Js9s3hKh 8cAcTcQd 6s7h9cTh"));
  }

  @Test
  public void test_omaha_holdem_2900_2s3d6c9hAs_7dTdJs2d_Tc9s3h3c_9c3s2h4d_5sKc7c4c() {
    assertEquals(
      "7dTdJs2d 9c3s2h4d Tc9s3h3c 5sKc7c4c",
      Solver.process("omaha-holdem 2s3d6c9hAs 7dTdJs2d Tc9s3h3c 9c3s2h4d 5sKc7c4c"));
  }

  @Test
  public void test_omaha_holdem_2901_5h8h9dAhJd_2c6h4d5s_4c2hTs4s_8s5d6s4h_9h7c6cQh() {
    assertEquals(
      "4c2hTs4s 2c6h4d5s 8s5d6s4h 9h7c6cQh",
      Solver.process("omaha-holdem 5h8h9dAhJd 2c6h4d5s 4c2hTs4s 8s5d6s4h 9h7c6cQh"));
  }

  @Test
  public void test_omaha_holdem_2902_2h3s9cAcTc_Qs5sJc2c_AsKs5c3d_TdQh8h4h_6cJsTh6s_8c6h3c4s() {
    assertEquals(
      "6cJsTh6s TdQh8h4h AsKs5c3d 8c6h3c4s Qs5sJc2c",
      Solver.process("omaha-holdem 2h3s9cAcTc Qs5sJc2c AsKs5c3d TdQh8h4h 6cJsTh6s 8c6h3c4s"));
  }

  @Test
  public void test_omaha_holdem_2903_3s8hKhQhTc_6sTs8c5h_9dJs8sKc_Ad9c4s2d() {
    assertEquals(
      "Ad9c4s2d 6sTs8c5h 9dJs8sKc",
      Solver.process("omaha-holdem 3s8hKhQhTc 6sTs8c5h 9dJs8sKc Ad9c4s2d"));
  }

  @Test
  public void test_omaha_holdem_2904_2h4s6sAsQd_8h6c9hKh_4c8s7c7h_Tc5cQh9d_4d2c3h2d_QsJc8c7d_Ts3sTdJh_AdAh5d5s_Js9sJdAc() {
    assertEquals(
      "8h6c9hKh 4c8s7c7h Tc5cQh9d QsJc8c7d 4d2c3h2d AdAh5d5s Ts3sTdJh Js9sJdAc",
      Solver.process("omaha-holdem 2h4s6sAsQd 8h6c9hKh 4c8s7c7h Tc5cQh9d 4d2c3h2d QsJc8c7d Ts3sTdJh AdAh5d5s Js9sJdAc"));
  }

  @Test
  public void test_omaha_holdem_2905_3c4c5s8sKd_KcJs8d8c_Ad4h7c4d_7h2cTh5d_5h7dQh9d() {
    assertEquals(
      "7h2cTh5d 5h7dQh9d Ad4h7c4d KcJs8d8c",
      Solver.process("omaha-holdem 3c4c5s8sKd KcJs8d8c Ad4h7c4d 7h2cTh5d 5h7dQh9d"));
  }

  @Test
  public void test_omaha_holdem_2906_3c7sQcQhTh_6h6d4h5d_8c5h9s4s_Kd4dAsTd_AdJdQsKs_3d3s5c8d_6s7h2c2d_7cQdTs7d_JhKc5s4c_9c9dTcAh() {
    assertEquals(
      "8c5h9s4s JhKc5s4c 6h6d4h5d 6s7h2c2d 9c9dTcAh=Kd4dAsTd AdJdQsKs 3d3s5c8d 7cQdTs7d",
      Solver.process("omaha-holdem 3c7sQcQhTh 6h6d4h5d 8c5h9s4s Kd4dAsTd AdJdQsKs 3d3s5c8d 6s7h2c2d 7cQdTs7d JhKc5s4c 9c9dTcAh"));
  }

  @Test
  public void test_omaha_holdem_2907_3c3hJdQhTc_9d6h4d2c_8d9h6c7d_6d2hTd3d_9sTh7s4h_3sJc5hTs_AdAs5dAc_Qs9c6s7c_5s7hKsQc() {
    assertEquals(
      "9d6h4d2c 9sTh7s4h Qs9c6s7c 5s7hKsQc AdAs5dAc 8d9h6c7d 6d2hTd3d 3sJc5hTs",
      Solver.process("omaha-holdem 3c3hJdQhTc 9d6h4d2c 8d9h6c7d 6d2hTd3d 9sTh7s4h 3sJc5hTs AdAs5dAc Qs9c6s7c 5s7hKsQc"));
  }

  @Test
  public void test_omaha_holdem_2908_2h8hAcQcTd_8s4hKdJs_4dJh5cAh_9hJc3s6s_2s4cQd8d_Tc5h2d3h() {
    assertEquals(
      "4dJh5cAh Tc5h2d3h 2s4cQd8d 9hJc3s6s 8s4hKdJs",
      Solver.process("omaha-holdem 2h8hAcQcTd 8s4hKdJs 4dJh5cAh 9hJc3s6s 2s4cQd8d Tc5h2d3h"));
  }

  @Test
  public void test_omaha_holdem_2909_2h4dJcJhQh_6hQcTs2s_Js7s7dKs_4c5s8cQd_ThKhKd6s_3dAsQs9s_9h3c8s8h_8dAd6dJd_7hAh2d2c_5dTc4h9c() {
    assertEquals(
      "5dTc4h9c 4c5s8cQd 6hQcTs2s 3dAsQs9s Js7s7dKs 8dAd6dJd 9h3c8s8h ThKhKd6s 7hAh2d2c",
      Solver.process("omaha-holdem 2h4dJcJhQh 6hQcTs2s Js7s7dKs 4c5s8cQd ThKhKd6s 3dAsQs9s 9h3c8s8h 8dAd6dJd 7hAh2d2c 5dTc4h9c"));
  }

  @Test
  public void test_omaha_holdem_2910_4h4s6s8c8d_Qh9s3hKs_9h3cJhTh_2sKc8hAd_Jd7h8s4c_Kd6h7sKh() {
    assertEquals(
      "9h3cJhTh Qh9s3hKs Kd6h7sKh 2sKc8hAd Jd7h8s4c",
      Solver.process("omaha-holdem 4h4s6s8c8d Qh9s3hKs 9h3cJhTh 2sKc8hAd Jd7h8s4c Kd6h7sKh"));
  }

  @Test
  public void test_omaha_holdem_2911_2d5s8cJcJs_Ks7s6d9s_6s3cJh7c_Kd9h6h4s_2sAdAc7h_8s4d9c3d_Jd2c3sAs() {
    assertEquals(
      "Kd9h6h4s=Ks7s6d9s 8s4d9c3d 2sAdAc7h 6s3cJh7c Jd2c3sAs",
      Solver.process("omaha-holdem 2d5s8cJcJs Ks7s6d9s 6s3cJh7c Kd9h6h4s 2sAdAc7h 8s4d9c3d Jd2c3sAs"));
  }

  @Test
  public void test_omaha_holdem_2912_2s4s9cJcTd_3cAhKdAd_4c4dTs6s_7s6dQd5h_7dJdQc8c_ThKs3d8s_Tc2h9d3s() {
    assertEquals(
      "7s6dQd5h ThKs3d8s 3cAhKdAd Tc2h9d3s 4c4dTs6s 7dJdQc8c",
      Solver.process("omaha-holdem 2s4s9cJcTd 3cAhKdAd 4c4dTs6s 7s6dQd5h 7dJdQc8c ThKs3d8s Tc2h9d3s"));
  }

  @Test
  public void test_omaha_holdem_2913_7sKdKhQcTs_6dAdJh3c_Ks3hJdAc_QsTd8h5s_8c4dTc8d_4s5hJs9s_9h2dKc2h_7h3d4hQh() {
    assertEquals(
      "8c4dTc8d 7h3d4hQh QsTd8h5s 9h2dKc2h 4s5hJs9s 6dAdJh3c=Ks3hJdAc",
      Solver.process("omaha-holdem 7sKdKhQcTs 6dAdJh3c Ks3hJdAc QsTd8h5s 8c4dTc8d 4s5hJs9s 9h2dKc2h 7h3d4hQh"));
  }

  @Test
  public void test_omaha_holdem_2914_3d4s5hAdQc_TdKc5dKs_9d4h2sTc_5sQs7cQh() {
    assertEquals(
      "TdKc5dKs 5sQs7cQh 9d4h2sTc",
      Solver.process("omaha-holdem 3d4s5hAdQc TdKc5dKs 9d4h2sTc 5sQs7cQh"));
  }

  @Test
  public void test_omaha_holdem_2915_3c5s6cJcQh_7h7s6dKd_5c7cKcAc_9sQsJd4d_6s2sKh4s_Ad9dTs2d_4c9h5hKs_Tc5dTh3h_9c3d3s8s() {
    assertEquals(
      "Ad9dTs2d 4c9h5hKs 7h7s6dKd Tc5dTh3h 9sQsJd4d 9c3d3s8s 6s2sKh4s 5c7cKcAc",
      Solver.process("omaha-holdem 3c5s6cJcQh 7h7s6dKd 5c7cKcAc 9sQsJd4d 6s2sKh4s Ad9dTs2d 4c9h5hKs Tc5dTh3h 9c3d3s8s"));
  }

  @Test
  public void test_omaha_holdem_2916_2c9hAdKhTc_9c8s4hQd_3hTsKdQs_Qc5h9d6s_3cAh7sJc() {
    assertEquals(
      "9c8s4hQd=Qc5h9d6s 3cAh7sJc 3hTsKdQs",
      Solver.process("omaha-holdem 2c9hAdKhTc 9c8s4hQd 3hTsKdQs Qc5h9d6s 3cAh7sJc"));
  }

  @Test
  public void test_omaha_holdem_2917_5c7c9hJhQh_6dJc5hKs_Kh4dAs8c_4cTc2dTh_3s7d2hAd() {
    assertEquals(
      "Kh4dAs8c 3s7d2hAd 4cTc2dTh 6dJc5hKs",
      Solver.process("omaha-holdem 5c7c9hJhQh 6dJc5hKs Kh4dAs8c 4cTc2dTh 3s7d2hAd"));
  }

  @Test
  public void test_omaha_holdem_2918_2h5d7d7s9h_Ah3s2s8h_2cQsJh4s_Ad9s8d5s_QdQc4c6d_7c8s4d9d_KsJc6s6h_5cJsJdTh_Kc6cTd4h_AsKhTsTc() {
    assertEquals(
      "Kc6cTd4h 2cQsJh4s Ah3s2s8h KsJc6s6h Ad9s8d5s AsKhTsTc 5cJsJdTh QdQc4c6d 7c8s4d9d",
      Solver.process("omaha-holdem 2h5d7d7s9h Ah3s2s8h 2cQsJh4s Ad9s8d5s QdQc4c6d 7c8s4d9d KsJc6s6h 5cJsJdTh Kc6cTd4h AsKhTsTc"));
  }

  @Test
  public void test_omaha_holdem_2919_5h6c6d7sQh_9cJdKc7h_3s6s4h9s_Ts2d2c8d_5sTh3c2s_Td3d9d2h() {
    assertEquals(
      "Td3d9d2h Ts2d2c8d 5sTh3c2s 9cJdKc7h 3s6s4h9s",
      Solver.process("omaha-holdem 5h6c6d7sQh 9cJdKc7h 3s6s4h9s Ts2d2c8d 5sTh3c2s Td3d9d2h"));
  }

  @Test
  public void test_omaha_holdem_2920_4d7sJdKcQd_8dQh9cAs_Td3d2d9d_5cKd5h6d_Kh4cJs7d_3h2c9s6s_4hThQc9h_Ah5d7cJh_6c3s8s3c_8cAdKs2h() {
    assertEquals(
      "3h2c9s6s 6c3s8s3c 8dQh9cAs 8cAdKs2h Ah5d7cJh Kh4cJs7d 4hThQc9h Td3d2d9d 5cKd5h6d",
      Solver.process("omaha-holdem 4d7sJdKcQd 8dQh9cAs Td3d2d9d 5cKd5h6d Kh4cJs7d 3h2c9s6s 4hThQc9h Ah5d7cJh 6c3s8s3c 8cAdKs2h"));
  }

  @Test
  public void test_omaha_holdem_2921_5c5d6s8hJd_8sAs2s7h_7c6c9cJh_4h3s4cAd_Kh8cJc3d_AcQc2c8d_9sThTs5h_7s4dKc3h() {
    assertEquals(
      "4h3s4cAd 8sAs2s7h=AcQc2c8d Kh8cJc3d 9sThTs5h 7s4dKc3h 7c6c9cJh",
      Solver.process("omaha-holdem 5c5d6s8hJd 8sAs2s7h 7c6c9cJh 4h3s4cAd Kh8cJc3d AcQc2c8d 9sThTs5h 7s4dKc3h"));
  }

  @Test
  public void test_omaha_holdem_2922_5d6h7sAcKc_Tc3s3d4s_Ah4dQs2d_7hJdQdJc_Ks9s8hKd_8d5cQhJs_7dTh3h4c_6cJh7c2s() {
    assertEquals(
      "8d5cQhJs 7hJdQdJc Ah4dQs2d 6cJh7c2s 7dTh3h4c=Tc3s3d4s Ks9s8hKd",
      Solver.process("omaha-holdem 5d6h7sAcKc Tc3s3d4s Ah4dQs2d 7hJdQdJc Ks9s8hKd 8d5cQhJs 7dTh3h4c 6cJh7c2s"));
  }

  @Test
  public void test_omaha_holdem_2923_3c4c6c9sJs_Tc5c9d4d_7s5h2s4h_9h2cKcQh_2dQc3dJh_Jd2hAsAh() {
    assertEquals(
      "Jd2hAsAh 2dQc3dJh 7s5h2s4h Tc5c9d4d 9h2cKcQh",
      Solver.process("omaha-holdem 3c4c6c9sJs Tc5c9d4d 7s5h2s4h 9h2cKcQh 2dQc3dJh Jd2hAsAh"));
  }

  @Test
  public void test_omaha_holdem_2924_2c2h3dAhTs_3sQh6h3h_Ac4c7c5d_QdJd7h8h_Ks4h5h6c_JcQsKd7d_Kc6s2d3c_6dKh9h9s() {
    assertEquals(
      "QdJd7h8h JcQsKd7d 6dKh9h9s Ac4c7c5d=Ks4h5h6c Kc6s2d3c 3sQh6h3h",
      Solver.process("omaha-holdem 2c2h3dAhTs 3sQh6h3h Ac4c7c5d QdJd7h8h Ks4h5h6c JcQsKd7d Kc6s2d3c 6dKh9h9s"));
  }

  @Test
  public void test_omaha_holdem_2925_4dAcKcQcQd_5h3c9h3d_Ad9c5dJc() {
    assertEquals(
      "5h3c9h3d Ad9c5dJc",
      Solver.process("omaha-holdem 4dAcKcQcQd 5h3c9h3d Ad9c5dJc"));
  }

  @Test
  public void test_omaha_holdem_2926_4s6c7dAcQs_6s5cKc5s_4cTcKdAs_Ts3s3c8s_7hJsJc9h_7s8h6dTd_3d2hQh4h_5hQd2s9s_4d8c5dQc() {
    assertEquals(
      "Ts3s3c8s 6s5cKc5s 7hJsJc9h 5hQd2s9s 7s8h6dTd 3d2hQh4h 4cTcKdAs 4d8c5dQc",
      Solver.process("omaha-holdem 4s6c7dAcQs 6s5cKc5s 4cTcKdAs Ts3s3c8s 7hJsJc9h 7s8h6dTd 3d2hQh4h 5hQd2s9s 4d8c5dQc"));
  }

  @Test
  public void test_omaha_holdem_2927_4s5s9c9hKh_4dKd6s3d_6d2dAdTs_5d3hQsJc_6h5cQc7d_As8dAh7c_2sTc8cQh() {
    assertEquals(
      "2sTc8cQh 6d2dAdTs 5d3hQsJc=6h5cQc7d 4dKd6s3d As8dAh7c",
      Solver.process("omaha-holdem 4s5s9c9hKh 4dKd6s3d 6d2dAdTs 5d3hQsJc 6h5cQc7d As8dAh7c 2sTc8cQh"));
  }

  @Test
  public void test_omaha_holdem_2928_3c4h4s7hTh_9s8s3d2h_6hAhKc8c_TdJs9h7d_Ad5c2d3s_Kd3h6dQc_8d5hKh4c_5s6cQsJd_Ts9d7s6s() {
    assertEquals(
      "9s8s3d2h Kd3h6dQc Ad5c2d3s TdJs9h7d=Ts9d7s6s 5s6cQsJd 8d5hKh4c 6hAhKc8c",
      Solver.process("omaha-holdem 3c4h4s7hTh 9s8s3d2h 6hAhKc8c TdJs9h7d Ad5c2d3s Kd3h6dQc 8d5hKh4c 5s6cQsJd Ts9d7s6s"));
  }

  @Test
  public void test_omaha_holdem_2929_7c8cJhKdTd_2sQcJdQd_Th3sKcTc() {
    assertEquals(
      "2sQcJdQd Th3sKcTc",
      Solver.process("omaha-holdem 7c8cJhKdTd 2sQcJdQd Th3sKcTc"));
  }

  @Test
  public void test_omaha_holdem_2930_5hQdQhQsTd_Ac5sQcJh_Ks6c8c9h_3dAs2c8s_Kh4s5c7s() {
    assertEquals(
      "Kh4s5c7s Ks6c8c9h 3dAs2c8s Ac5sQcJh",
      Solver.process("omaha-holdem 5hQdQhQsTd Ac5sQcJh Ks6c8c9h 3dAs2c8s Kh4s5c7s"));
  }

  @Test
  public void test_omaha_holdem_2931_7c7s9cJdTh_2sTs4s3c_5dKh8d9d_4d4cAd7h_3sKcTd5h() {
    assertEquals(
      "2sTs4s3c 3sKcTd5h 4d4cAd7h 5dKh8d9d",
      Solver.process("omaha-holdem 7c7s9cJdTh 2sTs4s3c 5dKh8d9d 4d4cAd7h 3sKcTd5h"));
  }

  @Test
  public void test_omaha_holdem_2932_2s3s7hKhTc_JhKc9s7s_3h2cAcAd_Ts2h7c5h_8d4sJd4h_KdAh6dTh_5d2d6h8s_8h9h3d6c() {
    assertEquals(
      "5d2d6h8s 8h9h3d6c 8d4sJd4h 3h2cAcAd Ts2h7c5h JhKc9s7s KdAh6dTh",
      Solver.process("omaha-holdem 2s3s7hKhTc JhKc9s7s 3h2cAcAd Ts2h7c5h 8d4sJd4h KdAh6dTh 5d2d6h8s 8h9h3d6c"));
  }

  @Test
  public void test_omaha_holdem_2933_3hAdJdKhTc_5sKs9s2s_Td6d7cAh_2hJs4dJc_4c2cTh5c_5hAs6s7d_8sQc8c2d_JhQs3cKc_Ts4s7h6h_Kd9h4h8h() {
    assertEquals(
      "8sQc8c2d 4c2cTh5c Ts4s7h6h 5sKs9s2s=Kd9h4h8h 5hAs6s7d Td6d7cAh 2hJs4dJc JhQs3cKc",
      Solver.process("omaha-holdem 3hAdJdKhTc 5sKs9s2s Td6d7cAh 2hJs4dJc 4c2cTh5c 5hAs6s7d 8sQc8c2d JhQs3cKc Ts4s7h6h Kd9h4h8h"));
  }

  @Test
  public void test_omaha_holdem_2934_3c3d4s7h7s_QhTcKd9c_3s8sThJc_AdAcQs7c() {
    assertEquals(
      "QhTcKd9c 3s8sThJc AdAcQs7c",
      Solver.process("omaha-holdem 3c3d4s7h7s QhTcKd9c 3s8sThJc AdAcQs7c"));
  }

  @Test
  public void test_omaha_holdem_2935_8cAhKdKsQd_2sQs2h7s_Ts8h9hTc() {
    assertEquals(
      "Ts8h9hTc 2sQs2h7s",
      Solver.process("omaha-holdem 8cAhKdKsQd 2sQs2h7s Ts8h9hTc"));
  }

  @Test
  public void test_omaha_holdem_2936_2dAcJsKsQs_5h7s7h4d_Jd5c8d3s() {
    assertEquals(
      "5h7s7h4d Jd5c8d3s",
      Solver.process("omaha-holdem 2dAcJsKsQs 5h7s7h4d Jd5c8d3s"));
  }

  @Test
  public void test_omaha_holdem_2937_3d4dKcKdKs_7hAh3h2h_7c6c5cAd_8d6h9sTs_8c9cJd6s() {
    assertEquals(
      "8d6h9sTs 8c9cJd6s 7c6c5cAd=7hAh3h2h",
      Solver.process("omaha-holdem 3d4dKcKdKs 7hAh3h2h 7c6c5cAd 8d6h9sTs 8c9cJd6s"));
  }

  @Test
  public void test_omaha_holdem_2938_2d4c7dKcQd_KsKh2cTh_JsTc5dTd_As8s6s8h() {
    assertEquals(
      "As8s6s8h KsKh2cTh JsTc5dTd",
      Solver.process("omaha-holdem 2d4c7dKcQd KsKh2cTh JsTc5dTd As8s6s8h"));
  }

  @Test
  public void test_omaha_holdem_2939_3d7s8dTcTs_7dJcAsQd_9cKhKcQh_4d6c6h2d_4s2c2h3c_Jh3h5dAc() {
    assertEquals(
      "4s2c2h3c Jh3h5dAc 4d6c6h2d 7dJcAsQd 9cKhKcQh",
      Solver.process("omaha-holdem 3d7s8dTcTs 7dJcAsQd 9cKhKcQh 4d6c6h2d 4s2c2h3c Jh3h5dAc"));
  }

  @Test
  public void test_omaha_holdem_2940_3c5cKsQhTh_Qc7d6s5s_7h4d9d8d_2sJd4s7s() {
    assertEquals(
      "7h4d9d8d 2sJd4s7s Qc7d6s5s",
      Solver.process("omaha-holdem 3c5cKsQhTh Qc7d6s5s 7h4d9d8d 2sJd4s7s"));
  }

  @Test
  public void test_omaha_holdem_2941_2h4d5s7dTh_Jh7c2s6c_4s6d5cQs_6s4hKh3h_JcQh6h9d_Ah7sJs8d_Ts4c5d8h_QcAsTdKd() {
    assertEquals(
      "JcQh6h9d Ah7sJs8d QcAsTdKd 4s6d5cQs Jh7c2s6c Ts4c5d8h 6s4hKh3h",
      Solver.process("omaha-holdem 2h4d5s7dTh Jh7c2s6c 4s6d5cQs 6s4hKh3h JcQh6h9d Ah7sJs8d Ts4c5d8h QcAsTdKd"));
  }

  @Test
  public void test_omaha_holdem_2942_3h7dAdJcKc_Qc2s9s4h_Kd2c6h6s_3cQhTs3s() {
    assertEquals(
      "Qc2s9s4h Kd2c6h6s 3cQhTs3s",
      Solver.process("omaha-holdem 3h7dAdJcKc Qc2s9s4h Kd2c6h6s 3cQhTs3s"));
  }

  @Test
  public void test_omaha_holdem_2943_2h5c8hAhQd_4cJs4s3d_Qh3s6s2s_JdKcTh5d_6c6h8sKd_7d9d8c3h() {
    assertEquals(
      "JdKcTh5d 7d9d8c3h 6c6h8sKd Qh3s6s2s 4cJs4s3d",
      Solver.process("omaha-holdem 2h5c8hAhQd 4cJs4s3d Qh3s6s2s JdKcTh5d 6c6h8sKd 7d9d8c3h"));
  }

  @Test
  public void test_omaha_holdem_2944_2h8sAsJcTh_7c4dQhKd_7sAc6s6c_TcJd5c2d() {
    assertEquals(
      "7sAc6s6c TcJd5c2d 7c4dQhKd",
      Solver.process("omaha-holdem 2h8sAsJcTh 7c4dQhKd 7sAc6s6c TcJd5c2d"));
  }

  @Test
  public void test_omaha_holdem_2945_2c4d4hQcTc_9cKhQsTh_7h7dKd8d_3d8cTd2s_6sJh8h6d_Ah3s3c5h_2hJd9h6c_4c5sTs7c_Kc3hAc6h_Qd9sAdKs() {
    assertEquals(
      "2hJd9h6c Ah3s3c5h 6sJh8h6d 7h7dKd8d 3d8cTd2s Qd9sAdKs 9cKhQsTh Kc3hAc6h 4c5sTs7c",
      Solver.process("omaha-holdem 2c4d4hQcTc 9cKhQsTh 7h7dKd8d 3d8cTd2s 6sJh8h6d Ah3s3c5h 2hJd9h6c 4c5sTs7c Kc3hAc6h Qd9sAdKs"));
  }

  @Test
  public void test_omaha_holdem_2946_2s6c8sQcTs_9s8h7d8c_Qs3dKcJh_9cTd7h7s_Ks2c3sAd_9hKdAh4s_4c4d5s4h_2dAcTh3c_5c6sKhJd_AsJs5h3h() {
    assertEquals(
      "9hKdAh4s 4c4d5s4h 5c6sKhJd Qs3dKcJh 2dAcTh3c 9cTd7h7s=9s8h7d8c Ks2c3sAd AsJs5h3h",
      Solver.process("omaha-holdem 2s6c8sQcTs 9s8h7d8c Qs3dKcJh 9cTd7h7s Ks2c3sAd 9hKdAh4s 4c4d5s4h 2dAcTh3c 5c6sKhJd AsJs5h3h"));
  }

  @Test
  public void test_omaha_holdem_2947_5c7d9dKhTc_4h4sQsJd_7c4c6sAs_9c2sTs8h_Qh5h9hTh_Jh7s4d6d_6c3dKs2c_3s2dAdQd() {
    assertEquals(
      "3s2dAdQd Jh7s4d6d 7c4c6sAs 6c3dKs2c 9c2sTs8h=Qh5h9hTh 4h4sQsJd",
      Solver.process("omaha-holdem 5c7d9dKhTc 4h4sQsJd 7c4c6sAs 9c2sTs8h Qh5h9hTh Jh7s4d6d 6c3dKs2c 3s2dAdQd"));
  }

  @Test
  public void test_omaha_holdem_2948_3h4h6h6sQd_7dQsThKs_9s5cAh8s_6c8cAsAd_8h2s5d3d() {
    assertEquals(
      "9s5cAh8s 7dQsThKs 6c8cAsAd 8h2s5d3d",
      Solver.process("omaha-holdem 3h4h6h6sQd 7dQsThKs 9s5cAh8s 6c8cAsAd 8h2s5d3d"));
  }

  @Test
  public void test_omaha_holdem_2949_4d4h5c7sKd_5dQdAh9s_QsJd6c2c_Tc2sTs2h_AcKsJs2d_8s7c3sTh_8h3hJc6d_Kh9h9c4c_4s8cQc6h() {
    assertEquals(
      "QsJd6c2c 5dQdAh9s 8s7c3sTh Tc2sTs2h AcKsJs2d 4s8cQc6h=8h3hJc6d Kh9h9c4c",
      Solver.process("omaha-holdem 4d4h5c7sKd 5dQdAh9s QsJd6c2c Tc2sTs2h AcKsJs2d 8s7c3sTh 8h3hJc6d Kh9h9c4c 4s8cQc6h"));
  }

  @Test
  public void test_omaha_holdem_2950_3h3s5s6cJc_4hAsTs5c_2hJhTh5d_2d7d7s4c() {
    assertEquals(
      "4hAsTs5c 2hJhTh5d 2d7d7s4c",
      Solver.process("omaha-holdem 3h3s5s6cJc 4hAsTs5c 2hJhTh5d 2d7d7s4c"));
  }

  @Test
  public void test_omaha_holdem_2951_3c4s7h7s9d_3hKs8hJs_Ah2h5h4d_JhQh6d9c() {
    assertEquals(
      "3hKs8hJs Ah2h5h4d JhQh6d9c",
      Solver.process("omaha-holdem 3c4s7h7s9d 3hKs8hJs Ah2h5h4d JhQh6d9c"));
  }

  @Test
  public void test_omaha_holdem_2952_3d6c8hAdQs_3sJh6dJd_8c5h5d3c_4d2c9h3h_Qd2s2dTs_5sKd8dAh() {
    assertEquals(
      "4d2c9h3h Qd2s2dTs 3sJh6dJd 8c5h5d3c 5sKd8dAh",
      Solver.process("omaha-holdem 3d6c8hAdQs 3sJh6dJd 8c5h5d3c 4d2c9h3h Qd2s2dTs 5sKd8dAh"));
  }

  @Test
  public void test_omaha_holdem_2953_9cJdQhTdTh_7dJh5hAc_2c9d5c6s_7sQc7h2h() {
    assertEquals(
      "2c9d5c6s 7dJh5hAc 7sQc7h2h",
      Solver.process("omaha-holdem 9cJdQhTdTh 7dJh5hAc 2c9d5c6s 7sQc7h2h"));
  }

  @Test
  public void test_omaha_holdem_2954_AcAhQcQhTs_6h3d8d2d_TdJh8h2h_4c8cQs7c_Th9dKc6d_9c9h5h7d_2cKs4sKd_6s5sAs3s() {
    assertEquals(
      "6h3d8d2d 9c9h5h7d TdJh8h2h Th9dKc6d 2cKs4sKd 4c8cQs7c 6s5sAs3s",
      Solver.process("omaha-holdem AcAhQcQhTs 6h3d8d2d TdJh8h2h 4c8cQs7c Th9dKc6d 9c9h5h7d 2cKs4sKd 6s5sAs3s"));
  }

  @Test
  public void test_omaha_holdem_2955_3h4s6s9dQs_2dKs4cAs_5hTh6dQh_3c9hKcQd_6h8c9c2h() {
    assertEquals(
      "6h8c9c2h 5hTh6dQh 3c9hKcQd 2dKs4cAs",
      Solver.process("omaha-holdem 3h4s6s9dQs 2dKs4cAs 5hTh6dQh 3c9hKcQd 6h8c9c2h"));
  }

  @Test
  public void test_omaha_holdem_2956_5h5s8sAhQh_Qd3cJc4c_Td9c4s2h_4hTs8cAd_5dJhAc9s() {
    assertEquals(
      "Td9c4s2h Qd3cJc4c 4hTs8cAd 5dJhAc9s",
      Solver.process("omaha-holdem 5h5s8sAhQh Qd3cJc4c Td9c4s2h 4hTs8cAd 5dJhAc9s"));
  }

  @Test
  public void test_omaha_holdem_2957_3h6s8sQsTs_2c6c7hJh_7d8d4h8h_7s3c4cAc_JcQcQd2s_9s5hQhAh_3s7cAs9h_JsTc9cTh_5cKhKs6d_5d8c9d5s() {
    assertEquals(
      "7s3c4cAc 2c6c7hJh 5d8c9d5s 9s5hQhAh 5cKhKs6d 7d8d4h8h JcQcQd2s JsTc9cTh 3s7cAs9h",
      Solver.process("omaha-holdem 3h6s8sQsTs 2c6c7hJh 7d8d4h8h 7s3c4cAc JcQcQd2s 9s5hQhAh 3s7cAs9h JsTc9cTh 5cKhKs6d 5d8c9d5s"));
  }

  @Test
  public void test_omaha_holdem_2958_3s7d8s9sKd_8hQd2hJd_7c3h8c6d_Tc2d5s8d_4d7s6hAd_2cTsTd4h_Qc6s5d3d_9hAhAs7h() {
    assertEquals(
      "4d7s6hAd Tc2d5s8d 8hQd2hJd 2cTsTd4h 7c3h8c6d 9hAhAs7h Qc6s5d3d",
      Solver.process("omaha-holdem 3s7d8s9sKd 8hQd2hJd 7c3h8c6d Tc2d5s8d 4d7s6hAd 2cTsTd4h Qc6s5d3d 9hAhAs7h"));
  }

  @Test
  public void test_omaha_holdem_2959_2c4d5d5h9s_8c8h3c3s_QdJsJdQs_Ks7cTsQc_3d5c6hTh() {
    assertEquals(
      "Ks7cTsQc 8c8h3c3s QdJsJdQs 3d5c6hTh",
      Solver.process("omaha-holdem 2c4d5d5h9s 8c8h3c3s QdJsJdQs Ks7cTsQc 3d5c6hTh"));
  }

  @Test
  public void test_omaha_holdem_2960_9sJhKhQdQh_Jd2hTs2s_2cAc7sQc_3cTcAh3h_5h8cJc6s_3sKcJs7h_Kd9cTd8h_8d5c5d4h_2d6c4s3d() {
    assertEquals(
      "2d6c4s3d 8d5c5d4h 5h8cJc6s 3sKcJs7h 2cAc7sQc Jd2hTs2s=Kd9cTd8h 3cTcAh3h",
      Solver.process("omaha-holdem 9sJhKhQdQh Jd2hTs2s 2cAc7sQc 3cTcAh3h 5h8cJc6s 3sKcJs7h Kd9cTd8h 8d5c5d4h 2d6c4s3d"));
  }

  @Test
  public void test_omaha_holdem_2961_2s8d9hAdAs_4dTd9dKd_ThQh7d7h() {
    assertEquals(
      "ThQh7d7h 4dTd9dKd",
      Solver.process("omaha-holdem 2s8d9hAdAs 4dTd9dKd ThQh7d7h"));
  }

  @Test
  public void test_omaha_holdem_2962_3h5cJhKdQh_4s3c4d8c_5dTh9sTd_7c8sQc6c() {
    assertEquals(
      "4s3c4d8c 7c8sQc6c 5dTh9sTd",
      Solver.process("omaha-holdem 3h5cJhKdQh 4s3c4d8c 5dTh9sTd 7c8sQc6c"));
  }

  @Test
  public void test_omaha_holdem_2963_3h9hJdQhTd_4h5s5h4d_7hAc3c8s_Tc2s6h5d_6sQsQd2d() {
    assertEquals(
      "Tc2s6h5d 6sQsQd2d 7hAc3c8s 4h5s5h4d",
      Solver.process("omaha-holdem 3h9hJdQhTd 4h5s5h4d 7hAc3c8s Tc2s6h5d 6sQsQd2d"));
  }

  @Test
  public void test_omaha_holdem_2964_5hAhAsJdTc_6hTdKs3h_6c5dAdTh_7s7dKc9d_4hQc9s4c_3d7h5cQs_7c8s2d2c_9h2h8cQd_Jh9cQh4s_4d5sAc8h() {
    assertEquals(
      "9h2h8cQd 7c8s2d2c 4hQc9s4c 3d7h5cQs 7s7dKc9d 6hTdKs3h Jh9cQh4s 4d5sAc8h 6c5dAdTh",
      Solver.process("omaha-holdem 5hAhAsJdTc 6hTdKs3h 6c5dAdTh 7s7dKc9d 4hQc9s4c 3d7h5cQs 7c8s2d2c 9h2h8cQd Jh9cQh4s 4d5sAc8h"));
  }

  @Test
  public void test_omaha_holdem_2965_3d7sAcJcQc_Ad9cAhKh_Qh4d6s2d_9d8cTc3h_6c7d6h5c_TdKdKsKc() {
    assertEquals(
      "Qh4d6s2d Ad9cAhKh TdKdKsKc 6c7d6h5c 9d8cTc3h",
      Solver.process("omaha-holdem 3d7sAcJcQc Ad9cAhKh Qh4d6s2d 9d8cTc3h 6c7d6h5c TdKdKsKc"));
  }

  @Test
  public void test_omaha_holdem_2966_6h8dJhQsTh_Td2d2sTs_3d5sAd2h_2cJs4c7h_9cKc8cJc_8hTcAh5h() {
    assertEquals(
      "3d5sAd2h 2cJs4c7h Td2d2sTs 9cKc8cJc 8hTcAh5h",
      Solver.process("omaha-holdem 6h8dJhQsTh Td2d2sTs 3d5sAd2h 2cJs4c7h 9cKc8cJc 8hTcAh5h"));
  }

  @Test
  public void test_omaha_holdem_2967_3h4h6d6s7d_JhTdQsAd_QcKs8s9h_8d6h7s9c_Ac4s7c9d_9s5sTsQh_JdAs2hAh_Th4d8hQd_4c2sJsTc_3s5cJcKd() {
    assertEquals(
      "9s5sTsQh QcKs8s9h JhTdQsAd 4c2sJsTc Th4d8hQd Ac4s7c9d JdAs2hAh 3s5cJcKd 8d6h7s9c",
      Solver.process("omaha-holdem 3h4h6d6s7d JhTdQsAd QcKs8s9h 8d6h7s9c Ac4s7c9d 9s5sTsQh JdAs2hAh Th4d8hQd 4c2sJsTc 3s5cJcKd"));
  }

  @Test
  public void test_omaha_holdem_2968_2h4h6s8sJs_7dTs3cQh_4dAhKs3d_3hAdThKc_9d8h4sAs_Jd6d5s9s_Jh7sQc6c_2sQd8c3s_5cTd9cQs() {
    assertEquals(
      "5cTd9cQs=7dTs3cQh 3hAdThKc 4dAhKs3d Jh7sQc6c 2sQd8c3s Jd6d5s9s 9d8h4sAs",
      Solver.process("omaha-holdem 2h4h6s8sJs 7dTs3cQh 4dAhKs3d 3hAdThKc 9d8h4sAs Jd6d5s9s Jh7sQc6c 2sQd8c3s 5cTd9cQs"));
  }

  @Test
  public void test_omaha_holdem_2969_2h5s9hAcKh_AhTcJd9s_5d3cJs5h_4s4d2d6c_7s7hKd3h_9dQhQc6s_5c3s2c7d_QdTd8d4h() {
    assertEquals(
      "QdTd8d4h 4s4d2d6c 9dQhQc6s 5c3s2c7d AhTcJd9s 5d3cJs5h 7s7hKd3h",
      Solver.process("omaha-holdem 2h5s9hAcKh AhTcJd9s 5d3cJs5h 4s4d2d6c 7s7hKd3h 9dQhQc6s 5c3s2c7d QdTd8d4h"));
  }

  @Test
  public void test_omaha_holdem_2970_7h8s9dKdKh_5s4h4sKs_7sTd2c9h_4dQcJc6c_5d7c3sQs_QdJd8c6s_6hAh9cKc_Qh3d4cJs() {
    assertEquals(
      "4dQcJc6c=Qh3d4cJs 5d7c3sQs QdJd8c6s 7sTd2c9h 5s4h4sKs 6hAh9cKc",
      Solver.process("omaha-holdem 7h8s9dKdKh 5s4h4sKs 7sTd2c9h 4dQcJc6c 5d7c3sQs QdJd8c6s 6hAh9cKc Qh3d4cJs"));
  }

  @Test
  public void test_omaha_holdem_2971_4s6s7d8cQh_4cJd5h5s_2c7c7hAd_Th8h6dKs_Tc3h9s7s_Ac5dKhAs_Jh2d4dTs_KcAhQcKd_6h4h8d9c() {
    assertEquals(
      "Jh2d4dTs KcAhQcKd Ac5dKhAs 6h4h8d9c=Th8h6dKs 2c7c7hAd 4cJd5h5s Tc3h9s7s",
      Solver.process("omaha-holdem 4s6s7d8cQh 4cJd5h5s 2c7c7hAd Th8h6dKs Tc3h9s7s Ac5dKhAs Jh2d4dTs KcAhQcKd 6h4h8d9c"));
  }

  @Test
  public void test_omaha_holdem_2972_2h5s8dJsQs_2cAs7cAd_5c9cTcKh_7d8hKd3h_Qd9hTd8s_QcKsQh9s_6c5d6h4d_3dThTs2d_JcJh4cJd_2s3s4hKc() {
    assertEquals(
      "6c5d6h4d 7d8hKd3h 3dThTs2d 2cAs7cAd JcJh4cJd 5c9cTcKh=Qd9hTd8s 2s3s4hKc QcKsQh9s",
      Solver.process("omaha-holdem 2h5s8dJsQs 2cAs7cAd 5c9cTcKh 7d8hKd3h Qd9hTd8s QcKsQh9s 6c5d6h4d 3dThTs2d JcJh4cJd 2s3s4hKc"));
  }

  @Test
  public void test_omaha_holdem_2973_4d5c7c8cJd_9cTh2s2h_Ad6c4sAs_KcKdJc6s_Js3s8d2d_2c5dAhQh_6hTs6d4h_3cTcQd8h_5hKh9sJh() {
    assertEquals(
      "2c5dAhQh 5hKh9sJh Js3s8d2d 6hTs6d4h=Ad6c4sAs 9cTh2s2h 3cTcQd8h KcKdJc6s",
      Solver.process("omaha-holdem 4d5c7c8cJd 9cTh2s2h Ad6c4sAs KcKdJc6s Js3s8d2d 2c5dAhQh 6hTs6d4h 3cTcQd8h 5hKh9sJh"));
  }

  @Test
  public void test_omaha_holdem_2974_2d5s8d8s9c_8h9hThJs_Ts4dQsJc_5d2c4s7s() {
    assertEquals(
      "Ts4dQsJc 5d2c4s7s 8h9hThJs",
      Solver.process("omaha-holdem 2d5s8d8s9c 8h9hThJs Ts4dQsJc 5d2c4s7s"));
  }

  @Test
  public void test_omaha_holdem_2975_5h8h9dJhKd_AsTs2d5d_Jd4sQd6d_3c4cQc4h_Qs7cQh2s() {
    assertEquals(
      "3c4cQc4h AsTs2d5d Jd4sQd6d Qs7cQh2s",
      Solver.process("omaha-holdem 5h8h9dJhKd AsTs2d5d Jd4sQd6d 3c4cQc4h Qs7cQh2s"));
  }

  @Test
  public void test_omaha_holdem_2976_6c6h7sAcQd_QcKc7dAd_TdQh9s7h_5c5h2h3c_Ts2dKd8h_3d5s4d2c_4sQsJcJd() {
    assertEquals(
      "3d5s4d2c Ts2dKd8h 5c5h2h3c 4sQsJcJd TdQh9s7h QcKc7dAd",
      Solver.process("omaha-holdem 6c6h7sAcQd QcKc7dAd TdQh9s7h 5c5h2h3c Ts2dKd8h 3d5s4d2c 4sQsJcJd"));
  }

  @Test
  public void test_omaha_holdem_2977_2c7hAdJsQs_7s5dQh3h_4s8dTc9h_2d3c6d6h_Qd6c4c8h_KsTsJcTh_Jh9d4dKh_2sJd3s5s_7cAc9c8c() {
    assertEquals(
      "4s8dTc9h 2d3c6d6h Jh9d4dKh Qd6c4c8h 2sJd3s5s 7s5dQh3h 7cAc9c8c KsTsJcTh",
      Solver.process("omaha-holdem 2c7hAdJsQs 7s5dQh3h 4s8dTc9h 2d3c6d6h Qd6c4c8h KsTsJcTh Jh9d4dKh 2sJd3s5s 7cAc9c8c"));
  }

  @Test
  public void test_omaha_holdem_2978_4d5cQdTcTd_Qc8dKd3d_8h5d5s9d_2hAhJhAs_Th2cJs7d_Kh9h3s7s_3cAdAc8s_3h2s9c4h_9sQh4sKc() {
    assertEquals(
      "Kh9h3s7s 3h2s9c4h 9sQh4sKc 2hAhJhAs=3cAdAc8s Th2cJs7d Qc8dKd3d 8h5d5s9d",
      Solver.process("omaha-holdem 4d5cQdTcTd Qc8dKd3d 8h5d5s9d 2hAhJhAs Th2cJs7d Kh9h3s7s 3cAdAc8s 3h2s9c4h 9sQh4sKc"));
  }

  @Test
  public void test_omaha_holdem_2979_6c7d9c9hTh_3sAcTs8h_AhKd3dTc_KhQc8sKs_4d2c7sTd_5dKc9s4s() {
    assertEquals(
      "4d2c7sTd AhKd3dTc KhQc8sKs 5dKc9s4s 3sAcTs8h",
      Solver.process("omaha-holdem 6c7d9c9hTh 3sAcTs8h AhKd3dTc KhQc8sKs 4d2c7sTd 5dKc9s4s"));
  }

  @Test
  public void test_omaha_holdem_2980_2s5h6d8h9h_8s3d8cTh_3hAsQdJc_AcQhJh3c_2h6c9d2d() {
    assertEquals(
      "3hAsQdJc 2h6c9d2d 8s3d8cTh AcQhJh3c",
      Solver.process("omaha-holdem 2s5h6d8h9h 8s3d8cTh 3hAsQdJc AcQhJh3c 2h6c9d2d"));
  }

  @Test
  public void test_omaha_holdem_2981_2h9sJsQdTh_JcKhAcQc_7s5cTd5h_KsJd9d8c_2c3h4h9c_TcQsKcKd_JhAsAd2s_7h7c3c5d() {
    assertEquals(
      "7h7c3c5d 7s5cTd5h 2c3h4h9c JhAsAd2s KsJd9d8c=TcQsKcKd JcKhAcQc",
      Solver.process("omaha-holdem 2h9sJsQdTh JcKhAcQc 7s5cTd5h KsJd9d8c 2c3h4h9c TcQsKcKd JhAsAd2s 7h7c3c5d"));
  }

  @Test
  public void test_omaha_holdem_2982_3c3d8d9dKd_5s9sAd4s_2d7s4dKs_3hJs8sTs_4c8h6dTh_2sQc2h2c() {
    assertEquals(
      "2sQc2h2c 4c8h6dTh 5s9sAd4s 2d7s4dKs 3hJs8sTs",
      Solver.process("omaha-holdem 3c3d8d9dKd 5s9sAd4s 2d7s4dKs 3hJs8sTs 4c8h6dTh 2sQc2h2c"));
  }

  @Test
  public void test_omaha_holdem_2983_2h3c4c7hKh_7c3h7dTs_Ks5dTc8d_9dJs7s8h_9c4dKc3d() {
    assertEquals(
      "9dJs7s8h Ks5dTc8d 9c4dKc3d 7c3h7dTs",
      Solver.process("omaha-holdem 2h3c4c7hKh 7c3h7dTs Ks5dTc8d 9dJs7s8h 9c4dKc3d"));
  }

  @Test
  public void test_omaha_holdem_2984_2s6d9cJsKd_5h8sKs3d_Tc9h5c8h_Td9sAcKh_5d7h5s3s_8cAdTsJh_2cKcJd4h() {
    assertEquals(
      "5d7h5s3s Tc9h5c8h 8cAdTsJh 5h8sKs3d Td9sAcKh 2cKcJd4h",
      Solver.process("omaha-holdem 2s6d9cJsKd 5h8sKs3d Tc9h5c8h Td9sAcKh 5d7h5s3s 8cAdTsJh 2cKcJd4h"));
  }

  @Test
  public void test_omaha_holdem_2985_2c2d4h5h6h_Ah3c7cJd_9s5cTc8s_5sJhAcKh_Kc3sTh9c_4d6d6c8d_Td9hAd5d_3d9d8cJc_As6sJsQh_Qd4cQs7d() {
    assertEquals(
      "3d9d8cJc Kc3sTh9c 9s5cTc8s Td9hAd5d As6sJsQh Qd4cQs7d Ah3c7cJd 5sJhAcKh 4d6d6c8d",
      Solver.process("omaha-holdem 2c2d4h5h6h Ah3c7cJd 9s5cTc8s 5sJhAcKh Kc3sTh9c 4d6d6c8d Td9hAd5d 3d9d8cJc As6sJsQh Qd4cQs7d"));
  }

  @Test
  public void test_omaha_holdem_2986_2c7s9cJhQd_2s2dTdQh_3sTcKs8h_8c5d6h4c_9h7d9s8s_8dTsKcQs_JcAcTh5s() {
    assertEquals(
      "8c5d6h4c JcAcTh5s 2s2dTdQh 9h7d9s8s 3sTcKs8h=8dTsKcQs",
      Solver.process("omaha-holdem 2c7s9cJhQd 2s2dTdQh 3sTcKs8h 8c5d6h4c 9h7d9s8s 8dTsKcQs JcAcTh5s"));
  }

  @Test
  public void test_omaha_holdem_2987_2h3dKsQhTh_5dTsAc7s_4d3sKd7h_9d8s3h3c_9hAhJh8c_9s7dJsKc_5h2sAd2c_4cQc5s4h() {
    assertEquals(
      "5dTsAc7s 4cQc5s4h 4d3sKd7h 5h2sAd2c 9d8s3h3c 9s7dJsKc 9hAhJh8c",
      Solver.process("omaha-holdem 2h3dKsQhTh 5dTsAc7s 4d3sKd7h 9d8s3h3c 9hAhJh8c 9s7dJsKc 5h2sAd2c 4cQc5s4h"));
  }

  @Test
  public void test_omaha_holdem_2988_2c4d4sAsKs_5c8hJc8s_9d8c5dKh() {
    assertEquals(
      "5c8hJc8s 9d8c5dKh",
      Solver.process("omaha-holdem 2c4d4sAsKs 5c8hJc8s 9d8c5dKh"));
  }

  @Test
  public void test_omaha_holdem_2989_2c5dJsKsQd_5h7h3dAs_QcTc9d5s_3s8c7cQh_9h6c6d8h_TsAd4h2s_Qs8dAc8s_2d4c6s6h_5c3h9c4d_7sJd9s4s() {
    assertEquals(
      "5c3h9c4d 5h7h3dAs 2d4c6s6h=9h6c6d8h 7sJd9s4s 3s8c7cQh Qs8dAc8s QcTc9d5s TsAd4h2s",
      Solver.process("omaha-holdem 2c5dJsKsQd 5h7h3dAs QcTc9d5s 3s8c7cQh 9h6c6d8h TsAd4h2s Qs8dAc8s 2d4c6s6h 5c3h9c4d 7sJd9s4s"));
  }

  @Test
  public void test_omaha_holdem_2990_5d5h6d9sJd_TdAdQhKc_Th7cQdAh() {
    assertEquals(
      "Th7cQdAh TdAdQhKc",
      Solver.process("omaha-holdem 5d5h6d9sJd TdAdQhKc Th7cQdAh"));
  }

  @Test
  public void test_omaha_holdem_2991_2h5h8cAsTc_6s6dJhAc_4h6h8d5s_8h4c5d3h() {
    assertEquals(
      "6s6dJhAc 4h6h8d5s 8h4c5d3h",
      Solver.process("omaha-holdem 2h5h8cAsTc 6s6dJhAc 4h6h8d5s 8h4c5d3h"));
  }

  @Test
  public void test_omaha_holdem_2992_4s5d8sAsJh_Td4cTs9s_Jc4d6cKd_3c3dKh2h_2c8h7c2d() {
    assertEquals(
      "2c8h7c2d Jc4d6cKd 3c3dKh2h Td4cTs9s",
      Solver.process("omaha-holdem 4s5d8sAsJh Td4cTs9s Jc4d6cKd 3c3dKh2h 2c8h7c2d"));
  }

  @Test
  public void test_omaha_holdem_2993_5h8cAdJdTh_Qs9s7s6s_Ac3c7d2h_3hJc4dJs_4hKsQd3s_7hTdKd9d_9cQh8s7c_5c2d4c2c_5sAsJhQc_Ts9hTc8d() {
    assertEquals(
      "5c2d4c2c Ac3c7d2h 5sAsJhQc Ts9hTc8d 3hJc4dJs 7hTdKd9d 9cQh8s7c=Qs9s7s6s 4hKsQd3s",
      Solver.process("omaha-holdem 5h8cAdJdTh Qs9s7s6s Ac3c7d2h 3hJc4dJs 4hKsQd3s 7hTdKd9d 9cQh8s7c 5c2d4c2c 5sAsJhQc Ts9hTc8d"));
  }

  @Test
  public void test_omaha_holdem_2994_6c7c7s8dJc_7h5s5dAs_3sKd4dJd_QhAd9d9h_Kh2d9c9s_Qd2s3hTc_8sJhKs2h_3c4sAc5c_6s8c6h2c_Ts6d7dJs() {
    assertEquals(
      "Qd2s3hTc Kh2d9c9s=QhAd9d9h 3sKd4dJd 8sJhKs2h 7h5s5dAs 3c4sAc5c 6s8c6h2c Ts6d7dJs",
      Solver.process("omaha-holdem 6c7c7s8dJc 7h5s5dAs 3sKd4dJd QhAd9d9h Kh2d9c9s Qd2s3hTc 8sJhKs2h 3c4sAc5c 6s8c6h2c Ts6d7dJs"));
  }

  @Test
  public void test_omaha_holdem_2995_2s5s6c6sJs_3d5h6h5c_KhTdKd4c_2dAsAc4h_2h7c7h7d_3s3cKc6d() {
    assertEquals(
      "2h7c7h7d KhTdKd4c 2dAsAc4h 3s3cKc6d 3d5h6h5c",
      Solver.process("omaha-holdem 2s5s6c6sJs 3d5h6h5c KhTdKd4c 2dAsAc4h 2h7c7h7d 3s3cKc6d"));
  }

  @Test
  public void test_omaha_holdem_2996_7h9d9sAsJc_9c8c8sJs_5dKs3h5c_5sKcQdKd_6h4cThTs_4dTc7c2c_JhQs7sKh() {
    assertEquals(
      "5dKs3h5c 4dTc7c2c 6h4cThTs JhQs7sKh 5sKcQdKd 9c8c8sJs",
      Solver.process("omaha-holdem 7h9d9sAsJc 9c8c8sJs 5dKs3h5c 5sKcQdKd 6h4cThTs 4dTc7c2c JhQs7sKh"));
  }

  @Test
  public void test_omaha_holdem_2997_5s7c7sJhKd_As3cQc9d_5h8s9c5d_6h3h3sTs_Qd4sTd6s_8cQs9h2d_9sAh2sKh_JsJd2cJc() {
    assertEquals(
      "8cQs9h2d Qd4sTd6s As3cQc9d 6h3h3sTs 9sAh2sKh 5h8s9c5d JsJd2cJc",
      Solver.process("omaha-holdem 5s7c7sJhKd As3cQc9d 5h8s9c5d 6h3h3sTs Qd4sTd6s 8cQs9h2d 9sAh2sKh JsJd2cJc"));
  }

  @Test
  public void test_omaha_holdem_2998_4d5c7dKhQh_4s6dQdKs_7cThJh8c_3d2sJs8s_2dKc9dAd_8hAs9s3s_5s4c8d9h_4h3c6s3h_Qs6c7h2c() {
    assertEquals(
      "3d2sJs8s 8hAs9s3s 7cThJh8c 2dKc9dAd 5s4c8d9h Qs6c7h2c 4s6dQdKs 4h3c6s3h",
      Solver.process("omaha-holdem 4d5c7dKhQh 4s6dQdKs 7cThJh8c 3d2sJs8s 2dKc9dAd 8hAs9s3s 5s4c8d9h 4h3c6s3h Qs6c7h2c"));
  }

  @Test
  public void test_omaha_holdem_2999_3c5hKcQhTc_Qd2hAdQs_9s9d9hTd_JcThTsKs_Jh2c2d3d_8s4s3s7s_7h7c8cAs_4h5cKd2s_Jd8hJsAc() {
    assertEquals(
      "8s4s3s7s Jh2c2d3d 9s9d9hTd 4h5cKd2s JcThTsKs Qd2hAdQs Jd8hJsAc 7h7c8cAs",
      Solver.process("omaha-holdem 3c5hKcQhTc Qd2hAdQs 9s9d9hTd JcThTsKs Jh2c2d3d 8s4s3s7s 7h7c8cAs 4h5cKd2s Jd8hJsAc"));
  }

}
