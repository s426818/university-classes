
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OmahaHoldemSolver3HiddenTest {


  @Test
  public void test_omaha_holdem_750_4h5c9dJdJh_Js7d7c2s_9s5sKh2h_8cThTs8h() {
    assertEquals(
      "9s5sKh2h 8cThTs8h Js7d7c2s",
      Solver.process("omaha-holdem 4h5c9dJdJh Js7d7c2s 9s5sKh2h 8cThTs8h"));
  }

  @Test
  public void test_omaha_holdem_751_4d7d9c9hKh_5dJc4s5s_3sAdQs2h_7hKd2c9d() {
    assertEquals(
      "3sAdQs2h 5dJc4s5s 7hKd2c9d",
      Solver.process("omaha-holdem 4d7d9c9hKh 5dJc4s5s 3sAdQs2h 7hKd2c9d"));
  }

  @Test
  public void test_omaha_holdem_752_2d4d6c8c8s_9h5dAh6d_Ks4hTcTs_3c9s5s9d_Kc8d4sQd_3s9cQcJh() {
    assertEquals(
      "3s9cQcJh 9h5dAh6d Ks4hTcTs 3c9s5s9d Kc8d4sQd",
      Solver.process("omaha-holdem 2d4d6c8c8s 9h5dAh6d Ks4hTcTs 3c9s5s9d Kc8d4sQd 3s9cQcJh"));
  }

  @Test
  public void test_omaha_holdem_753_2h3c3h7sQc_Qd6hTd4c_7h8d4dKs_Ad9h9c3s_JdJhTs4s_6c8hKhQh_2cAh7c5c_3dTcAs7d_6d8s5s4h() {
    assertEquals(
      "6d8s5s4h 7h8d4dKs 2cAh7c5c JdJhTs4s Qd6hTd4c 6c8hKhQh Ad9h9c3s 3dTcAs7d",
      Solver.process("omaha-holdem 2h3c3h7sQc Qd6hTd4c 7h8d4dKs Ad9h9c3s JdJhTs4s 6c8hKhQh 2cAh7c5c 3dTcAs7d 6d8s5s4h"));
  }

  @Test
  public void test_omaha_holdem_754_2c5d9hJsTs_8dQh6d8s_AsKdQd6s_Ad7d2h4s_8hAh4d3d_9c6hTh9s_5s3sAc3c_7cQc5h8c_4c3hKs4h() {
    assertEquals(
      "8hAh4d3d Ad7d2h4s 4c3hKs4h 5s3sAc3c 9c6hTh9s 7cQc5h8c=8dQh6d8s AsKdQd6s",
      Solver.process("omaha-holdem 2c5d9hJsTs 8dQh6d8s AsKdQd6s Ad7d2h4s 8hAh4d3d 9c6hTh9s 5s3sAc3c 7cQc5h8c 4c3hKs4h"));
  }

  @Test
  public void test_omaha_holdem_755_3c5hJsKhQs_Jh8s4sTh_9dQd8h8c_Ad4dTs7s_6c3d3sTd_AcTc6hQh() {
    assertEquals(
      "Jh8s4sTh 9dQd8h8c 6c3d3sTd AcTc6hQh=Ad4dTs7s",
      Solver.process("omaha-holdem 3c5hJsKhQs Jh8s4sTh 9dQd8h8c Ad4dTs7s 6c3d3sTd AcTc6hQh"));
  }

  @Test
  public void test_omaha_holdem_756_9sAcAhJsKh_JhQsAs3d_3s8s7c2s_Qh7d5h4d_8d8cQd2d_Tc3cQcTh_5c5dKc2c_7s9d6hKs_4c3h4h6s_Kd9h7hTd() {
    assertEquals(
      "3s8s7c2s Qh7d5h4d 4c3h4h6s 8d8cQd2d 5c5dKc2c 7s9d6hKs Kd9h7hTd Tc3cQcTh JhQsAs3d",
      Solver.process("omaha-holdem 9sAcAhJsKh JhQsAs3d 3s8s7c2s Qh7d5h4d 8d8cQd2d Tc3cQcTh 5c5dKc2c 7s9d6hKs 4c3h4h6s Kd9h7hTd"));
  }

  @Test
  public void test_omaha_holdem_757_8cKcKhKsTh_Ad8d2c6d_2d7h9sQd() {
    assertEquals(
      "2d7h9sQd Ad8d2c6d",
      Solver.process("omaha-holdem 8cKcKhKsTh Ad8d2c6d 2d7h9sQd"));
  }

  @Test
  public void test_omaha_holdem_758_2c4s5sJdTh_9h6h2d4d_5c6c3dKc_3sQc9cKd_AsJsQs2h_Jh8hTs6d_8cKsQdAc() {
    assertEquals(
      "3sQc9cKd 8cKsQdAc 9h6h2d4d AsJsQs2h Jh8hTs6d 5c6c3dKc",
      Solver.process("omaha-holdem 2c4s5sJdTh 9h6h2d4d 5c6c3dKc 3sQc9cKd AsJsQs2h Jh8hTs6d 8cKsQdAc"));
  }

  @Test
  public void test_omaha_holdem_759_4dAsKhQhTd_7hQd2c3s_Ah6cJh5s_8c2h4sAc_5c3c8hAd_7sTs8d2d() {
    assertEquals(
      "7sTs8d2d 7hQd2c3s 5c3c8hAd 8c2h4sAc Ah6cJh5s",
      Solver.process("omaha-holdem 4dAsKhQhTd 7hQd2c3s Ah6cJh5s 8c2h4sAc 5c3c8hAd 7sTs8d2d"));
  }

  @Test
  public void test_omaha_holdem_760_5s8hAsQsTs_4d5h9hJc_5cQcJs4h_Kc2cJh6s_9dKs3sKh_Ad3c5d2d_7h2s8c6h_3h6d3d2h_8d7cQd6c() {
    assertEquals(
      "3h6d3d2h 7h2s8c6h 5cQcJs4h 8d7cQd6c Ad3c5d2d 4d5h9hJc Kc2cJh6s 9dKs3sKh",
      Solver.process("omaha-holdem 5s8hAsQsTs 4d5h9hJc 5cQcJs4h Kc2cJh6s 9dKs3sKh Ad3c5d2d 7h2s8c6h 3h6d3d2h 8d7cQd6c"));
  }

  @Test
  public void test_omaha_holdem_761_4d4sAcJcKd_8c5d8dAh_Js9s6c3d_Qh5cQc9c() {
    assertEquals(
      "Js9s6c3d Qh5cQc9c 8c5d8dAh",
      Solver.process("omaha-holdem 4d4sAcJcKd 8c5d8dAh Js9s6c3d Qh5cQc9c"));
  }

  @Test
  public void test_omaha_holdem_762_4s8c9d9hQc_Kd2hQs6s_2d4c5hTd_2s5d4dKc_Ad3d9sKh() {
    assertEquals(
      "2d4c5hTd 2s5d4dKc Kd2hQs6s Ad3d9sKh",
      Solver.process("omaha-holdem 4s8c9d9hQc Kd2hQs6s 2d4c5hTd 2s5d4dKc Ad3d9sKh"));
  }

  @Test
  public void test_omaha_holdem_763_6h7sAsKsTs_7c9dAc4h_8c8h9s6c_2cQc4sKh_4dAh9c7d_3h2d3s5c_8dQsKd9h_6d2h8s5h_Tc7h2sJd() {
    assertEquals(
      "3h2d3s5c 6d2h8s5h 2cQc4sKh Tc7h2sJd 4dAh9c7d=7c9dAc4h 8c8h9s6c=8dQsKd9h",
      Solver.process("omaha-holdem 6h7sAsKsTs 7c9dAc4h 8c8h9s6c 2cQc4sKh 4dAh9c7d 3h2d3s5c 8dQsKd9h 6d2h8s5h Tc7h2sJd"));
  }

  @Test
  public void test_omaha_holdem_764_2h6h7cKdTs_5c7sKs5h_2d2s9hQs() {
    assertEquals(
      "5c7sKs5h 2d2s9hQs",
      Solver.process("omaha-holdem 2h6h7cKdTs 5c7sKs5h 2d2s9hQs"));
  }

  @Test
  public void test_omaha_holdem_765_3h3s4d5hKd_4hJh4s4c_9cKc2d5c() {
    assertEquals(
      "9cKc2d5c 4hJh4s4c",
      Solver.process("omaha-holdem 3h3s4d5hKd 4hJh4s4c 9cKc2d5c"));
  }

  @Test
  public void test_omaha_holdem_766_2h4c5hKdQd_9s9h8s4h_QsAd9cJd() {
    assertEquals(
      "9s9h8s4h QsAd9cJd",
      Solver.process("omaha-holdem 2h4c5hKdQd 9s9h8s4h QsAd9cJd"));
  }

  @Test
  public void test_omaha_holdem_767_5d8d9cAhKc_3cAd8h2c_4sTc6cTh_Ts9hQs2d_2s7hQh8c_7s6d9d6s_4c5hJd5s_9sKdAsJs_4dTd7cJh_4h3s7dQd() {
    assertEquals(
      "4dTd7cJh 4h3s7dQd 2s7hQh8c Ts9hQs2d 4sTc6cTh 3cAd8h2c 9sKdAsJs 4c5hJd5s 7s6d9d6s",
      Solver.process("omaha-holdem 5d8d9cAhKc 3cAd8h2c 4sTc6cTh Ts9hQs2d 2s7hQh8c 7s6d9d6s 4c5hJd5s 9sKdAsJs 4dTd7cJh 4h3s7dQd"));
  }

  @Test
  public void test_omaha_holdem_768_9cAsKsQcQd_3h2hTdAh_9d3cQs8c_3s7c2cTh_Ac8h9sTc_Jh4dQh2s_KhAd9h5s_5c6h8d3d_7d4cKd5h_7hJcJd7s() {
    assertEquals(
      "5c6h8d3d 3s7c2cTh 7hJcJd7s 7d4cKd5h 3h2hTdAh=Ac8h9sTc KhAd9h5s Jh4dQh2s 9d3cQs8c",
      Solver.process("omaha-holdem 9cAsKsQcQd 3h2hTdAh 9d3cQs8c 3s7c2cTh Ac8h9sTc Jh4dQh2s KhAd9h5s 5c6h8d3d 7d4cKd5h 7hJcJd7s"));
  }

  @Test
  public void test_omaha_holdem_769_2h3sJsKsQh_8h9d6cJd_Th9s8sAh_KcAd5c8c() {
    assertEquals(
      "8h9d6cJd KcAd5c8c Th9s8sAh",
      Solver.process("omaha-holdem 2h3sJsKsQh 8h9d6cJd Th9s8sAh KcAd5c8c"));
  }

  @Test
  public void test_omaha_holdem_770_2d4s9hAcTc_AhKh7sKs_Jh4h7dJd_Qs8c2h7h_3s8h8dKd() {
    assertEquals(
      "Qs8c2h7h 3s8h8dKd Jh4h7dJd AhKh7sKs",
      Solver.process("omaha-holdem 2d4s9hAcTc AhKh7sKs Jh4h7dJd Qs8c2h7h 3s8h8dKd"));
  }

  @Test
  public void test_omaha_holdem_771_6h7dAcKsTd_9sQh7s4c_Kc6c5h5d_3c9d2cQs_9h4sQcTs() {
    assertEquals(
      "3c9d2cQs 9sQh7s4c 9h4sQcTs Kc6c5h5d",
      Solver.process("omaha-holdem 6h7dAcKsTd 9sQh7s4c Kc6c5h5d 3c9d2cQs 9h4sQcTs"));
  }

  @Test
  public void test_omaha_holdem_772_2s7dAdAhKd_9c9dAc9s_Td4hAsKh_TsQd8s6d_3c7h2hTc() {
    assertEquals(
      "3c7h2hTc 9c9dAc9s TsQd8s6d Td4hAsKh",
      Solver.process("omaha-holdem 2s7dAdAhKd 9c9dAc9s Td4hAsKh TsQd8s6d 3c7h2hTc"));
  }

  @Test
  public void test_omaha_holdem_773_4d7cAdJdQc_5cKdKh9h_6h8h9c6d_8d2dKc3s_2sTd4sKs_2hAcJh4h_ThAh7s7d() {
    assertEquals(
      "6h8h9c6d 5cKdKh9h 2hAcJh4h ThAh7s7d 2sTd4sKs 8d2dKc3s",
      Solver.process("omaha-holdem 4d7cAdJdQc 5cKdKh9h 6h8h9c6d 8d2dKc3s 2sTd4sKs 2hAcJh4h ThAh7s7d"));
  }

  @Test
  public void test_omaha_holdem_774_2c6h6s9dAd_5hTsTd5s_4dQs4c8c_JsAs8s7s() {
    assertEquals(
      "4dQs4c8c 5hTsTd5s JsAs8s7s",
      Solver.process("omaha-holdem 2c6h6s9dAd 5hTsTd5s 4dQs4c8c JsAs8s7s"));
  }

  @Test
  public void test_omaha_holdem_775_5d7s9dAhTh_4cKdJd4s_Ks3c7d4h_9h5sKhQs_Js5c6h6c() {
    assertEquals(
      "4cKdJd4s Js5c6h6c Ks3c7d4h 9h5sKhQs",
      Solver.process("omaha-holdem 5d7s9dAhTh 4cKdJd4s Ks3c7d4h 9h5sKhQs Js5c6h6c"));
  }

  @Test
  public void test_omaha_holdem_776_7dJdJhJsTh_5cQhKsKh_2h6d2d5d_9cAhKc7s_5sAc4s7h_5h6sQsTs_6h3d8s4d_TdQc8c9h() {
    assertEquals(
      "6h3d8s4d 5h6sQsTs 5sAc4s7h 9cAhKc7s TdQc8c9h 2h6d2d5d 5cQhKsKh",
      Solver.process("omaha-holdem 7dJdJhJsTh 5cQhKsKh 2h6d2d5d 9cAhKc7s 5sAc4s7h 5h6sQsTs 6h3d8s4d TdQc8c9h"));
  }

  @Test
  public void test_omaha_holdem_777_2c3h7cJsTs_5dJh3s9s_3d5cAd2h() {
    assertEquals(
      "3d5cAd2h 5dJh3s9s",
      Solver.process("omaha-holdem 2c3h7cJsTs 5dJh3s9s 3d5cAd2h"));
  }

  @Test
  public void test_omaha_holdem_778_5h5s9hQdTh_7s7d8hKd_2s4d4c8s_Qs3c6sAh() {
    assertEquals(
      "2s4d4c8s 7s7d8hKd Qs3c6sAh",
      Solver.process("omaha-holdem 5h5s9hQdTh 7s7d8hKd 2s4d4c8s Qs3c6sAh"));
  }

  @Test
  public void test_omaha_holdem_779_3s6c7d9sTc_JhAsJs7h_5s3c4hAh_8c8dQhQs_5h6sQcAc_2s9d8sTd_Kc6h2h7c_4s4dQd5d_2d8h3hAd() {
    assertEquals(
      "2d8h3hAd 5h6sQcAc JhAsJs7h 8c8dQhQs Kc6h2h7c 4s4dQd5d=5s3c4hAh 2s9d8sTd",
      Solver.process("omaha-holdem 3s6c7d9sTc JhAsJs7h 5s3c4hAh 8c8dQhQs 5h6sQcAc 2s9d8sTd Kc6h2h7c 4s4dQd5d 2d8h3hAd"));
  }

  @Test
  public void test_omaha_holdem_780_6c6s9cAsKd_6hJdKsQd_Js9d7h5s_8d2s3sQc_Th4c3d3c_4hQh9s5d_Ah5cTd8h_2hAc5h6d_9hKc4sJc_7d2d3h8s() {
    assertEquals(
      "7d2d3h8s 8d2s3sQc Th4c3d3c Js9d7h5s 4hQh9s5d 9hKc4sJc Ah5cTd8h 6hJdKsQd 2hAc5h6d",
      Solver.process("omaha-holdem 6c6s9cAsKd 6hJdKsQd Js9d7h5s 8d2s3sQc Th4c3d3c 4hQh9s5d Ah5cTd8h 2hAc5h6d 9hKc4sJc 7d2d3h8s"));
  }

  @Test
  public void test_omaha_holdem_781_3h6d7h8sJs_Kc4cAhJc_AcAs2d5h_TcQs2h4h_3c5d7d9s_Th6sQc2s() {
    assertEquals(
      "TcQs2h4h Th6sQc2s Kc4cAhJc AcAs2d5h 3c5d7d9s",
      Solver.process("omaha-holdem 3h6d7h8sJs Kc4cAhJc AcAs2d5h TcQs2h4h 3c5d7d9s Th6sQc2s"));
  }

  @Test
  public void test_omaha_holdem_782_2d4d7h8cAd_4cTh3d5c_6cKs9d5d_Kh8s6hQd_QhQs3h9s_2s5s8d7d_QcJs3cTs_AsKd7s7c_TcKc2cAh() {
    assertEquals(
      "QcJs3cTs Kh8s6hQd QhQs3h9s TcKc2cAh AsKd7s7c 4cTh3d5c 2s5s8d7d 6cKs9d5d",
      Solver.process("omaha-holdem 2d4d7h8cAd 4cTh3d5c 6cKs9d5d Kh8s6hQd QhQs3h9s 2s5s8d7d QcJs3cTs AsKd7s7c TcKc2cAh"));
  }

  @Test
  public void test_omaha_holdem_783_5d7d9sAsKh_4h5cQc4c_7h2cQs2s_Kd6d2hAh_Js3h8h5s_3c7cQdAd_6hJh6c8d_3d9hJcTc_Kc9d4d8c() {
    assertEquals(
      "Js3h8h5s 4h5cQc4c 7h2cQs2s 3d9hJcTc Kc9d4d8c 3c7cQdAd Kd6d2hAh 6hJh6c8d",
      Solver.process("omaha-holdem 5d7d9sAsKh 4h5cQc4c 7h2cQs2s Kd6d2hAh Js3h8h5s 3c7cQdAd 6hJh6c8d 3d9hJcTc Kc9d4d8c"));
  }

  @Test
  public void test_omaha_holdem_784_2c3s4c4s5h_5c9d6dKc_Qc8h9cAd_Qh2s7s5s_7c6s2d5d_6hTh3h7h_8sAc4dTs_TcKhTd7d_9h8d2hJd_3d6cJc8c() {
    assertEquals(
      "Qc8h9cAd 9h8d2hJd Qh2s7s5s TcKhTd7d 8sAc4dTs 3d6cJc8c=5c9d6dKc 6hTh3h7h=7c6s2d5d",
      Solver.process("omaha-holdem 2c3s4c4s5h 5c9d6dKc Qc8h9cAd Qh2s7s5s 7c6s2d5d 6hTh3h7h 8sAc4dTs TcKhTd7d 9h8d2hJd 3d6cJc8c"));
  }

  @Test
  public void test_omaha_holdem_785_5d5h8c8d8s_Js4sKcAc_4d2cQd5c_6hKdTdJd_3c9s6s5s_7s7cQc8h_6dKhThQh_Jc9dAd3h_2dAs7dTc_4h7hTs2h() {
    assertEquals(
      "3c9s6s5s 4h7hTs2h 4d2cQd5c 6hKdTdJd 6dKhThQh 2dAs7dTc Jc9dAd3h Js4sKcAc 7s7cQc8h",
      Solver.process("omaha-holdem 5d5h8c8d8s Js4sKcAc 4d2cQd5c 6hKdTdJd 3c9s6s5s 7s7cQc8h 6dKhThQh Jc9dAd3h 2dAs7dTc 4h7hTs2h"));
  }

  @Test
  public void test_omaha_holdem_786_3c3hKcThTs_Jh7c3s5h_6hTcTd7s_6c8dJs4d_5c8hKhQd_4hQhJcAd_Jd4c6sQc_7d9d6d2s_As2dQsAc() {
    assertEquals(
      "7d9d6d2s 6c8dJs4d Jd4c6sQc 4hQhJcAd 5c8hKhQd As2dQsAc Jh7c3s5h 6hTcTd7s",
      Solver.process("omaha-holdem 3c3hKcThTs Jh7c3s5h 6hTcTd7s 6c8dJs4d 5c8hKhQd 4hQhJcAd Jd4c6sQc 7d9d6d2s As2dQsAc"));
  }

  @Test
  public void test_omaha_holdem_787_2h5hJdQdTs_5s3c9s4s_8c6sQh6h_7h2sQc4c_Ad2cAc3d_3hKcTdTh_8s9h3sAs_JsTcKd8d_Ks7c6cJc_4h7d7sAh() {
    assertEquals(
      "5s3c9s4s 4h7d7sAh Ks7c6cJc 8c6sQh6h Ad2cAc3d JsTcKd8d 7h2sQc4c 3hKcTdTh 8s9h3sAs",
      Solver.process("omaha-holdem 2h5hJdQdTs 5s3c9s4s 8c6sQh6h 7h2sQc4c Ad2cAc3d 3hKcTdTh 8s9h3sAs JsTcKd8d Ks7c6cJc 4h7d7sAh"));
  }

  @Test
  public void test_omaha_holdem_788_4c4d5h5s7h_2hTh7cKs_JsTdJd7s_2s6hAs2c_4s3d5dTs() {
    assertEquals(
      "2s6hAs2c 2hTh7cKs JsTdJd7s 4s3d5dTs",
      Solver.process("omaha-holdem 4c4d5h5s7h 2hTh7cKs JsTdJd7s 2s6hAs2c 4s3d5dTs"));
  }

  @Test
  public void test_omaha_holdem_789_6h7sKdKhTd_Qh3s2d8d_5d4h3cJd_3h4sTs7h_Ks5cTc5h_5s2s4cQs() {
    assertEquals(
      "5d4h3cJd 5s2s4cQs Qh3s2d8d 3h4sTs7h Ks5cTc5h",
      Solver.process("omaha-holdem 6h7sKdKhTd Qh3s2d8d 5d4h3cJd 3h4sTs7h Ks5cTc5h 5s2s4cQs"));
  }

  @Test
  public void test_omaha_holdem_790_6d7hAdJdKs_Ah2d7c9h_7s8d5h3h_KcQc9cTc_Qh4h4d8h_2sJhThTs_6s7dAcQs_Td3cQd3s_4s9sJs6c_3dJcAsKh() {
    assertEquals(
      "Qh4h4d8h 7s8d5h3h 2sJhThTs 4s9sJs6c 6s7dAcQs=Ah2d7c9h 3dJcAsKh KcQc9cTc Td3cQd3s",
      Solver.process("omaha-holdem 6d7hAdJdKs Ah2d7c9h 7s8d5h3h KcQc9cTc Qh4h4d8h 2sJhThTs 6s7dAcQs Td3cQd3s 4s9sJs6c 3dJcAsKh"));
  }

  @Test
  public void test_omaha_holdem_791_8c8sAcKdQh_Jh3h9c3c_Tc6hJdQs_9s3s9d7c_2sJc5sJs_8d4dTdTh_5hKcKhAs() {
    assertEquals(
      "Jh3h9c3c 9s3s9d7c 2sJc5sJs 8d4dTdTh Tc6hJdQs 5hKcKhAs",
      Solver.process("omaha-holdem 8c8sAcKdQh Jh3h9c3c Tc6hJdQs 9s3s9d7c 2sJc5sJs 8d4dTdTh 5hKcKhAs"));
  }

  @Test
  public void test_omaha_holdem_792_2c3d3s8sKd_4sTsAs3h_9hJh9d2d_2s5h7cJs_8cJd4c7d_4d5c9s8d() {
    assertEquals(
      "2s5h7cJs 4d5c9s8d 8cJd4c7d 9hJh9d2d 4sTsAs3h",
      Solver.process("omaha-holdem 2c3d3s8sKd 4sTsAs3h 9hJh9d2d 2s5h7cJs 8cJd4c7d 4d5c9s8d"));
  }

  @Test
  public void test_omaha_holdem_793_2c5h6dJhQc_8d4c3sKc_Ad5s7dTc_9h6c8hKd_Jd9c3d2s() {
    assertEquals(
      "Ad5s7dTc 9h6c8hKd Jd9c3d2s 8d4c3sKc",
      Solver.process("omaha-holdem 2c5h6dJhQc 8d4c3sKc Ad5s7dTc 9h6c8hKd Jd9c3d2s"));
  }

  @Test
  public void test_omaha_holdem_794_6d9hJhKdTd_3h5h4c8c_AhTcKh5d_2s4sJs9d_Jc5c9cKc() {
    assertEquals(
      "3h5h4c8c 2s4sJs9d AhTcKh5d Jc5c9cKc",
      Solver.process("omaha-holdem 6d9hJhKdTd 3h5h4c8c AhTcKh5d 2s4sJs9d Jc5c9cKc"));
  }

  @Test
  public void test_omaha_holdem_795_2c2h3d7cJs_Jc5s4sTh_8d2d8cKs_QhJh3s5c_4h6h7h9d_5hKd8hQs_6d6cKcQd_7s6sAdTs_9h4d9cTd_TcAcAs7d() {
    assertEquals(
      "5hKd8hQs 6d6cKcQd 4h6h7h9d 7s6sAdTs 9h4d9cTd Jc5s4sTh QhJh3s5c TcAcAs7d 8d2d8cKs",
      Solver.process("omaha-holdem 2c2h3d7cJs Jc5s4sTh 8d2d8cKs QhJh3s5c 4h6h7h9d 5hKd8hQs 6d6cKcQd 7s6sAdTs 9h4d9cTd TcAcAs7d"));
  }

  @Test
  public void test_omaha_holdem_796_8h8sAsQdQh_3sQs5cTs_Ad6hKhKs_4h9sJs2c_4d3d9c7h_9h7d5d2s_Qc5h3h8c_Jd5s8dAh() {
    assertEquals(
      "4d3d9c7h=9h7d5d2s 4h9sJs2c Ad6hKhKs 3sQs5cTs Jd5s8dAh Qc5h3h8c",
      Solver.process("omaha-holdem 8h8sAsQdQh 3sQs5cTs Ad6hKhKs 4h9sJs2c 4d3d9c7h 9h7d5d2s Qc5h3h8c Jd5s8dAh"));
  }

  @Test
  public void test_omaha_holdem_797_4d6c6dAsQd_KhTs4sAh_3s7sJsKs_6h7h9c2c() {
    assertEquals(
      "3s7sJsKs KhTs4sAh 6h7h9c2c",
      Solver.process("omaha-holdem 4d6c6dAsQd KhTs4sAh 3s7sJsKs 6h7h9c2c"));
  }

  @Test
  public void test_omaha_holdem_798_6c8s9dJhTc_Qd7h3hKd_JdAhJs3d_3s9sAdAc() {
    assertEquals(
      "3s9sAdAc JdAhJs3d Qd7h3hKd",
      Solver.process("omaha-holdem 6c8s9dJhTc Qd7h3hKd JdAhJs3d 3s9sAdAc"));
  }

  @Test
  public void test_omaha_holdem_799_2s4c6c8sTc_4d3cAhQh_Kh4h7h7s_3dKd4s5s_9sKc5dAs_2hAc7d8h_KsThJd5h_JhQc2d6s_9cQd9hJc() {
    assertEquals(
      "9sKc5dAs 4d3cAhQh Kh4h7h7s KsThJd5h JhQc2d6s 2hAc7d8h 3dKd4s5s 9cQd9hJc",
      Solver.process("omaha-holdem 2s4c6c8sTc 4d3cAhQh Kh4h7h7s 3dKd4s5s 9sKc5dAs 2hAc7d8h KsThJd5h JhQc2d6s 9cQd9hJc"));
  }

  @Test
  public void test_omaha_holdem_800_3c6d7hJdQd_KdKc5s9d_JcAc5h5c() {
    assertEquals(
      "JcAc5h5c KdKc5s9d",
      Solver.process("omaha-holdem 3c6d7hJdQd KdKc5s9d JcAc5h5c"));
  }

  @Test
  public void test_omaha_holdem_801_5c7d9c9sAh_KhAc3c4h_4dJd8dAs_8h7h2d6c_Kd2c5d5s_Qh3sQsKc_8s4sKs6h_7c9hThQd_3h2sJs4c_Jc5h6sTs() {
    assertEquals(
      "3h2sJs4c Jc5h6sTs Qh3sQsKc 4dJd8dAs KhAc3c4h 8h7h2d6c=8s4sKs6h Kd2c5d5s 7c9hThQd",
      Solver.process("omaha-holdem 5c7d9c9sAh KhAc3c4h 4dJd8dAs 8h7h2d6c Kd2c5d5s Qh3sQsKc 8s4sKs6h 7c9hThQd 3h2sJs4c Jc5h6sTs"));
  }

  @Test
  public void test_omaha_holdem_802_3s5d6h9hQs_2s2h5cAh_9dKs6cQd_9s7hJdQh_4c9c2dQc_As8hJh5s_3hJc3cKc_Ac6dThTc() {
    assertEquals(
      "2s2h5cAh=As8hJh5s Ac6dThTc 9dKs6cQd=9s7hJdQh 3hJc3cKc 4c9c2dQc",
      Solver.process("omaha-holdem 3s5d6h9hQs 2s2h5cAh 9dKs6cQd 9s7hJdQh 4c9c2dQc As8hJh5s 3hJc3cKc Ac6dThTc"));
  }

  @Test
  public void test_omaha_holdem_803_2h9d9hJhKs_5c6c2c3s_5dTsJc8c_Kd9s4sKh_Js8h3hJd_TdQc6sAs_9c6h2sAd_Ac4d3d3c() {
    assertEquals(
      "5c6c2c3s Ac4d3d3c 5dTsJc8c TdQc6sAs 9c6h2sAd Js8h3hJd Kd9s4sKh",
      Solver.process("omaha-holdem 2h9d9hJhKs 5c6c2c3s 5dTsJc8c Kd9s4sKh Js8h3hJd TdQc6sAs 9c6h2sAd Ac4d3d3c"));
  }

  @Test
  public void test_omaha_holdem_804_2h2s5hKcTs_9hAcQc7s_7hQh6sKs_3dTc9c3c_2c9dKh4h_3s4d9s4c_AsAdTh5c_8s6cKdAh() {
    assertEquals(
      "9hAcQc7s 3s4d9s4c 3dTc9c3c 7hQh6sKs 8s6cKdAh AsAdTh5c 2c9dKh4h",
      Solver.process("omaha-holdem 2h2s5hKcTs 9hAcQc7s 7hQh6sKs 3dTc9c3c 2c9dKh4h 3s4d9s4c AsAdTh5c 8s6cKdAh"));
  }

  @Test
  public void test_omaha_holdem_805_2c3h4s5hJs_Qc5cJc5d_AsQhJhJd_6hTs8d3s_8s8h4h5s_Ks7c7dKc() {
    assertEquals(
      "Ks7c7dKc 8s8h4h5s Qc5cJc5d AsQhJhJd 6hTs8d3s",
      Solver.process("omaha-holdem 2c3h4s5hJs Qc5cJc5d AsQhJhJd 6hTs8d3s 8s8h4h5s Ks7c7dKc"));
  }

  @Test
  public void test_omaha_holdem_806_8c8hAdJhKh_Th6s6d2c_5h9c7sQh() {
    assertEquals(
      "Th6s6d2c 5h9c7sQh",
      Solver.process("omaha-holdem 8c8hAdJhKh Th6s6d2c 5h9c7sQh"));
  }

  @Test
  public void test_omaha_holdem_807_3sAcAsKcTs_6s5dTd5c_2dKs7dJh_QsQc7cAh() {
    assertEquals(
      "6s5dTd5c 2dKs7dJh QsQc7cAh",
      Solver.process("omaha-holdem 3sAcAsKcTs 6s5dTd5c 2dKs7dJh QsQc7cAh"));
  }

  @Test
  public void test_omaha_holdem_808_6h7c7sAhKc_8hKh3s2c_Jh3d9h2s_5d9cTs4c_8c7hTh3h() {
    assertEquals(
      "5d9cTs4c Jh3d9h2s 8hKh3s2c 8c7hTh3h",
      Solver.process("omaha-holdem 6h7c7sAhKc 8hKh3s2c Jh3d9h2s 5d9cTs4c 8c7hTh3h"));
  }

  @Test
  public void test_omaha_holdem_809_2s6h7sJsKh_Kc2d5s9d_6c5hKd7c_Qs9hAs4h_Th2hAh7h_3h3dJcJd_4c2c8c5d_3c4d4s6d() {
    assertEquals(
      "4c2c8c5d 3c4d4s6d Th2hAh7h Kc2d5s9d 6c5hKd7c 3h3dJcJd Qs9hAs4h",
      Solver.process("omaha-holdem 2s6h7sJsKh Kc2d5s9d 6c5hKd7c Qs9hAs4h Th2hAh7h 3h3dJcJd 4c2c8c5d 3c4d4s6d"));
  }

  @Test
  public void test_omaha_holdem_810_2c3h5d5h7c_3s9h6hJc_2d7d7sQc_TsJsTcTd_JhAs7h8c() {
    assertEquals(
      "3s9h6hJc JhAs7h8c TsJsTcTd 2d7d7sQc",
      Solver.process("omaha-holdem 2c3h5d5h7c 3s9h6hJc 2d7d7sQc TsJsTcTd JhAs7h8c"));
  }

  @Test
  public void test_omaha_holdem_811_4h5h7d8sTd_Qc2s8c8h_4cTh5sAd_3c7cAc6h_7s5dJdJh_KsAs2dQh_Ah9dTcQd_2c4s4d6c_9h2h5cKd() {
    assertEquals(
      "KsAs2dQh 9h2h5cKd Ah9dTcQd 7s5dJdJh 4cTh5sAd Qc2s8c8h 2c4s4d6c=3c7cAc6h",
      Solver.process("omaha-holdem 4h5h7d8sTd Qc2s8c8h 4cTh5sAd 3c7cAc6h 7s5dJdJh KsAs2dQh Ah9dTcQd 2c4s4d6c 9h2h5cKd"));
  }

  @Test
  public void test_omaha_holdem_812_2h6c8hJcQc_4h9sTd7d_5h3c6h9d_2c5sTcQs_KcJs2d6d_4d8dJhJd_As3sTh3h_8cKd7s9c_Ac4cQdKh() {
    assertEquals(
      "As3sTh3h 5h3c6h9d KcJs2d6d 4d8dJhJd 4h9sTd7d 8cKd7s9c 2c5sTcQs Ac4cQdKh",
      Solver.process("omaha-holdem 2h6c8hJcQc 4h9sTd7d 5h3c6h9d 2c5sTcQs KcJs2d6d 4d8dJhJd As3sTh3h 8cKd7s9c Ac4cQdKh"));
  }

  @Test
  public void test_omaha_holdem_813_5c5s8c9dQh_4dJsQcAd_Jd2sAs7d() {
    assertEquals(
      "Jd2sAs7d 4dJsQcAd",
      Solver.process("omaha-holdem 5c5s8c9dQh 4dJsQcAd Jd2sAs7d"));
  }

  @Test
  public void test_omaha_holdem_814_5h9h9sJcJh_Ac3c3h8c_8d5cQcTc_KcAhQsKh_6h7sJsKd_4dTd6s5s_Qh8s2s2c_9c3d2hAd_AsTh3s4s() {
    assertEquals(
      "AsTh3s4s Qh8s2s2c Ac3c3h8c 4dTd6s5s 8d5cQcTc 9c3d2hAd 6h7sJsKd KcAhQsKh",
      Solver.process("omaha-holdem 5h9h9sJcJh Ac3c3h8c 8d5cQcTc KcAhQsKh 6h7sJsKd 4dTd6s5s Qh8s2s2c 9c3d2hAd AsTh3s4s"));
  }

  @Test
  public void test_omaha_holdem_815_3d4c5d6sJs_7dTcQs6d_9s8d5hTh_2d7s4s8s_Jc9h4dQc_Qh2s3sQd_7h8c5sKc() {
    assertEquals(
      "9s8d5hTh Jc9h4dQc Qh2s3sQd 7dTcQs6d 2d7s4s8s=7h8c5sKc",
      Solver.process("omaha-holdem 3d4c5d6sJs 7dTcQs6d 9s8d5hTh 2d7s4s8s Jc9h4dQc Qh2s3sQd 7h8c5sKc"));
  }

  @Test
  public void test_omaha_holdem_816_4d5d5s6sJd_6c7d2h8d_7hQc3sAd_TsAh3hTh_9hJc2sKh_As6dKdQh_Qd8s9sTc_4s4c5cKc() {
    assertEquals(
      "Qd8s9sTc TsAh3hTh 9hJc2sKh 7hQc3sAd 6c7d2h8d As6dKdQh 4s4c5cKc",
      Solver.process("omaha-holdem 4d5d5s6sJd 6c7d2h8d 7hQc3sAd TsAh3hTh 9hJc2sKh As6dKdQh Qd8s9sTc 4s4c5cKc"));
  }

  @Test
  public void test_omaha_holdem_817_2s9cTcTdTh_7s3sKc4h_4d7d6c5h_4cJsTs3d_Ac8dQs8c_2c8hQcJc_KsKd8s5c_9s5sQdJh_7c2h7hAd() {
    assertEquals(
      "4d7d6c5h 2c8hQcJc=9s5sQdJh 7s3sKc4h 7c2h7hAd Ac8dQs8c KsKd8s5c 4cJsTs3d",
      Solver.process("omaha-holdem 2s9cTcTdTh 7s3sKc4h 4d7d6c5h 4cJsTs3d Ac8dQs8c 2c8hQcJc KsKd8s5c 9s5sQdJh 7c2h7hAd"));
  }

  @Test
  public void test_omaha_holdem_818_3c3d4h8sKc_5d7h6d8h_5s8dQh4d_4cKs5h2h_KhJh9h9d_Js6sJdAh() {
    assertEquals(
      "5d7h6d8h 5s8dQh4d Js6sJdAh KhJh9h9d 4cKs5h2h",
      Solver.process("omaha-holdem 3c3d4h8sKc 5d7h6d8h 5s8dQh4d 4cKs5h2h KhJh9h9d Js6sJdAh"));
  }

  @Test
  public void test_omaha_holdem_819_2s8d8hJcQs_2cTh6cQc_9c4s3d3h() {
    assertEquals(
      "9c4s3d3h 2cTh6cQc",
      Solver.process("omaha-holdem 2s8d8hJcQs 2cTh6cQc 9c4s3d3h"));
  }

  @Test
  public void test_omaha_holdem_820_2d8sAdKdKh_5hJc8d7h_Qd3c3hJh_AhQs7c6c_8h5sAs4s_Td9s4h6s_9hKs3s9c() {
    assertEquals(
      "Td9s4h6s Qd3c3hJh 5hJc8d7h 8h5sAs4s AhQs7c6c 9hKs3s9c",
      Solver.process("omaha-holdem 2d8sAdKdKh 5hJc8d7h Qd3c3hJh AhQs7c6c 8h5sAs4s Td9s4h6s 9hKs3s9c"));
  }

  @Test
  public void test_omaha_holdem_821_6d7d7h8hJs_6sTdQs4h_9dAc4d3c_Ah9c9h3h_Ts4c5dQh_6hJc5s3s() {
    assertEquals(
      "9dAc4d3c 6sTdQs4h Ah9c9h3h 6hJc5s3s Ts4c5dQh",
      Solver.process("omaha-holdem 6d7d7h8hJs 6sTdQs4h 9dAc4d3c Ah9c9h3h Ts4c5dQh 6hJc5s3s"));
  }

  @Test
  public void test_omaha_holdem_822_2d3h9cKhTh_QsTc2h5s_5d4hKc5c_5hKd2c2s_As9hJcTs_3dAc6dTd() {
    assertEquals(
      "5d4hKc5c QsTc2h5s 3dAc6dTd As9hJcTs 5hKd2c2s",
      Solver.process("omaha-holdem 2d3h9cKhTh QsTc2h5s 5d4hKc5c 5hKd2c2s As9hJcTs 3dAc6dTd"));
  }

  @Test
  public void test_omaha_holdem_823_4h4s6c6h9h_9c7s7d6d_Qs2sTs9s() {
    assertEquals(
      "Qs2sTs9s 9c7s7d6d",
      Solver.process("omaha-holdem 4h4s6c6h9h 9c7s7d6d Qs2sTs9s"));
  }

  @Test
  public void test_omaha_holdem_824_3c3s7d9hAs_5h4cKsAh_7h8sJd6s_9d7sKh9c_6c5cAdAc_Td8d4sTc_Ts7cQc5s_JcKc8h8c_Jh3d2h2c_6hQd3h2d() {
    assertEquals(
      "7h8sJd6s Ts7cQc5s JcKc8h8c Td8d4sTc 5h4cKsAh Jh3d2h2c 6hQd3h2d 9d7sKh9c 6c5cAdAc",
      Solver.process("omaha-holdem 3c3s7d9hAs 5h4cKsAh 7h8sJd6s 9d7sKh9c 6c5cAdAc Td8d4sTc Ts7cQc5s JcKc8h8c Jh3d2h2c 6hQd3h2d"));
  }

  @Test
  public void test_omaha_holdem_825_2s5c7cJcQc_Jh9s6c8s_9h6h5sAs_AhAd3h3c_4sQh7hJd() {
    assertEquals(
      "9h6h5sAs Jh9s6c8s AhAd3h3c 4sQh7hJd",
      Solver.process("omaha-holdem 2s5c7cJcQc Jh9s6c8s 9h6h5sAs AhAd3h3c 4sQh7hJd"));
  }

  @Test
  public void test_omaha_holdem_826_3d5c5dJcQc_JhKdAc4d_Qd5sJs7d_2h5h9h9c_4s9dAd9s() {
    assertEquals(
      "4s9dAd9s JhKdAc4d 2h5h9h9c Qd5sJs7d",
      Solver.process("omaha-holdem 3d5c5dJcQc JhKdAc4d Qd5sJs7d 2h5h9h9c 4s9dAd9s"));
  }

  @Test
  public void test_omaha_holdem_827_4c6c7sKcTs_TcQdJd5h_9d6d9cTh_As7c4h3h_3d3sQc6s_Kd2sAd4s_9hTd2c2d_QhKs9s6h_AhAc5c7d() {
    assertEquals(
      "3d3sQc6s 9hTd2c2d TcQdJd5h As7c4h3h 9d6d9cTh Kd2sAd4s QhKs9s6h AhAc5c7d",
      Solver.process("omaha-holdem 4c6c7sKcTs TcQdJd5h 9d6d9cTh As7c4h3h 3d3sQc6s Kd2sAd4s 9hTd2c2d QhKs9s6h AhAc5c7d"));
  }

  @Test
  public void test_omaha_holdem_828_3h8d8sJcKh_6s8c9h4c_6cAhKd7h_Qs9cAcKc_4s3d5d5s_6d3s5c2h_Ks5h2c2d_QhJh6hJd_AdJsTd8h_Ts4d9d2s() {
    assertEquals(
      "Ts4d9d2s 6d3s5c2h 4s3d5d5s Ks5h2c2d 6cAhKd7h=Qs9cAcKc 6s8c9h4c AdJsTd8h QhJh6hJd",
      Solver.process("omaha-holdem 3h8d8sJcKh 6s8c9h4c 6cAhKd7h Qs9cAcKc 4s3d5d5s 6d3s5c2h Ks5h2c2d QhJh6hJd AdJsTd8h Ts4d9d2s"));
  }

  @Test
  public void test_omaha_holdem_829_6s7cAhTdTs_Ks2c9c5c_4sJs5h7d_Qh9h8dJd() {
    assertEquals(
      "Ks2c9c5c 4sJs5h7d Qh9h8dJd",
      Solver.process("omaha-holdem 6s7cAhTdTs Ks2c9c5c 4sJs5h7d Qh9h8dJd"));
  }

  @Test
  public void test_omaha_holdem_830_2h4c6d7dJc_8sKc3h2s_6s5s7c5c_5hTs3c9s_3s9h2dAc() {
    assertEquals(
      "8sKc3h2s 3s9h2dAc 6s5s7c5c 5hTs3c9s",
      Solver.process("omaha-holdem 2h4c6d7dJc 8sKc3h2s 6s5s7c5c 5hTs3c9s 3s9h2dAc"));
  }

  @Test
  public void test_omaha_holdem_831_4h5c6hAsJd_QsJcThAh_3sJs5s4d_3cKcAd7h() {
    assertEquals(
      "3sJs5s4d QsJcThAh 3cKcAd7h",
      Solver.process("omaha-holdem 4h5c6hAsJd QsJcThAh 3sJs5s4d 3cKcAd7h"));
  }

  @Test
  public void test_omaha_holdem_832_3s4h6c8dKh_9cQh7h4c_3d4sKs5h_JcQsJdQd() {
    assertEquals(
      "9cQh7h4c JcQsJdQd 3d4sKs5h",
      Solver.process("omaha-holdem 3s4h6c8dKh 9cQh7h4c 3d4sKs5h JcQsJdQd"));
  }

  @Test
  public void test_omaha_holdem_833_2hJdKdKhQd_AhThQh3c_Jh7d3dQc() {
    assertEquals(
      "AhThQh3c Jh7d3dQc",
      Solver.process("omaha-holdem 2hJdKdKhQd AhThQh3c Jh7d3dQc"));
  }

  @Test
  public void test_omaha_holdem_834_6d8c9hJhKc_7c2h6hKh_KsKd4h9c_2d3dQdTs_ThAc3c8s_6s9s5s7s_6cTc3hJc_QsJd5h8h() {
    assertEquals(
      "ThAc3c8s 6cTc3hJc QsJd5h8h 7c2h6hKh KsKd4h9c 6s9s5s7s 2d3dQdTs",
      Solver.process("omaha-holdem 6d8c9hJhKc 7c2h6hKh KsKd4h9c 2d3dQdTs ThAc3c8s 6s9s5s7s 6cTc3hJc QsJd5h8h"));
  }

  @Test
  public void test_omaha_holdem_835_6d6s9dKcQh_AcTcThKh_6cJh5d4h_Ad9cAs3s_Ts7cJs4d_7hAh9s5h_3h8h5s8s_5c3d2d6h_8dJd4s2h() {
    assertEquals(
      "8dJd4s2h 3h8h5s8s 7hAh9s5h AcTcThKh Ad9cAs3s 5c3d2d6h 6cJh5d4h Ts7cJs4d",
      Solver.process("omaha-holdem 6d6s9dKcQh AcTcThKh 6cJh5d4h Ad9cAs3s Ts7cJs4d 7hAh9s5h 3h8h5s8s 5c3d2d6h 8dJd4s2h"));
  }

  @Test
  public void test_omaha_holdem_836_3s5s8hAdJc_2s9sQs3h_7sKc9h4s_Qc2h4h5c_7c3d7hQh_TcAh8cTs() {
    assertEquals(
      "7sKc9h4s 2s9sQs3h 7c3d7hQh TcAh8cTs Qc2h4h5c",
      Solver.process("omaha-holdem 3s5s8hAdJc 2s9sQs3h 7sKc9h4s Qc2h4h5c 7c3d7hQh TcAh8cTs"));
  }

  @Test
  public void test_omaha_holdem_837_4s6h9c9hKd_8s3s4dJd_QhTd7c2h_8hKs8d3c_6s7dThAd_7s6cTc2s_3dQsTs9s() {
    assertEquals(
      "QhTd7c2h 8s3s4dJd 7s6cTc2s 6s7dThAd 8hKs8d3c 3dQsTs9s",
      Solver.process("omaha-holdem 4s6h9c9hKd 8s3s4dJd QhTd7c2h 8hKs8d3c 6s7dThAd 7s6cTc2s 3dQsTs9s"));
  }

  @Test
  public void test_omaha_holdem_838_6hAhKcKhTd_Qd2h7s7d_8d4s6c6d_7hQsKd3c_5d9dJd5s_5cTc3hAc_AdAs4c4d_7cTh2d2c_Ts9sQc8h() {
    assertEquals(
      "5d9dJd5s Qd2h7s7d 7cTh2d2c Ts9sQc8h 5cTc3hAc 7hQsKd3c 8d4s6c6d AdAs4c4d",
      Solver.process("omaha-holdem 6hAhKcKhTd Qd2h7s7d 8d4s6c6d 7hQsKd3c 5d9dJd5s 5cTc3hAc AdAs4c4d 7cTh2d2c Ts9sQc8h"));
  }

  @Test
  public void test_omaha_holdem_839_3h3s7sKdTd_Ac3d4s5s_Qd4c7cJh() {
    assertEquals(
      "Qd4c7cJh Ac3d4s5s",
      Solver.process("omaha-holdem 3h3s7sKdTd Ac3d4s5s Qd4c7cJh"));
  }

  @Test
  public void test_omaha_holdem_840_3d4d7cAdJc_Kc4s2s8s_Jh4h5h7h_9cTsJs6c_7sJd9h5d_Qd8dQsAh() {
    assertEquals(
      "Kc4s2s8s 9cTsJs6c Jh4h5h7h 7sJd9h5d Qd8dQsAh",
      Solver.process("omaha-holdem 3d4d7cAdJc Kc4s2s8s Jh4h5h7h 9cTsJs6c 7sJd9h5d Qd8dQsAh"));
  }

  @Test
  public void test_omaha_holdem_841_5c5h6h9cJs_3d6dAs5s_Qh8d8h9d_Ts9s3s8s_Kc5dTh7h_4hTcAc7d_Kd2c2s9h_4sAhQc8c() {
    assertEquals(
      "4hTcAc7d 4sAhQc8c Ts9s3s8s Qh8d8h9d Kd2c2s9h Kc5dTh7h 3d6dAs5s",
      Solver.process("omaha-holdem 5c5h6h9cJs 3d6dAs5s Qh8d8h9d Ts9s3s8s Kc5dTh7h 4hTcAc7d Kd2c2s9h 4sAhQc8c"));
  }

  @Test
  public void test_omaha_holdem_842_4d7c8cAhKs_3dKhAs8h_6sQd7h6d_8d4h5cJh_4sKc2cQh_3s6h4c3c_7d9hAcTd_7sAd2hQs_Kd9d5dTs_JdTc6c5h() {
    assertEquals(
      "3s6h4c3c 6sQd7h6d Kd9d5dTs 8d4h5cJh 4sKc2cQh 7d9hAcTd=7sAd2hQs 3dKhAs8h JdTc6c5h",
      Solver.process("omaha-holdem 4d7c8cAhKs 3dKhAs8h 6sQd7h6d 8d4h5cJh 4sKc2cQh 3s6h4c3c 7d9hAcTd 7sAd2hQs Kd9d5dTs JdTc6c5h"));
  }

  @Test
  public void test_omaha_holdem_843_5s8h9sAsTd_8d2c8sAh_7c6cKsQd_3h7dKc4s_QhTs3c2h_9c2d2sKh_3dTh4d4h_Js7h5dTc() {
    assertEquals(
      "3h7dKc4s 9c2d2sKh 3dTh4d4h QhTs3c2h 8d2c8sAh 7c6cKsQd Js7h5dTc",
      Solver.process("omaha-holdem 5s8h9sAsTd 8d2c8sAh 7c6cKsQd 3h7dKc4s QhTs3c2h 9c2d2sKh 3dTh4d4h Js7h5dTc"));
  }

  @Test
  public void test_omaha_holdem_844_3s5c7cJcQs_6d9sKs4s_Jh8d4d8h_7d3c8s3d_Tc7sKd7h_9hAh2h2s_4c9dAdTs_6s4h6cQh_Kh5hJsQd() {
    assertEquals(
      "4c9dAdTs 9hAh2h2s Jh8d4d8h Kh5hJsQd 7d3c8s3d Tc7sKd7h 6d9sKs4s=6s4h6cQh",
      Solver.process("omaha-holdem 3s5c7cJcQs 6d9sKs4s Jh8d4d8h 7d3c8s3d Tc7sKd7h 9hAh2h2s 4c9dAdTs 6s4h6cQh Kh5hJsQd"));
  }

  @Test
  public void test_omaha_holdem_845_3s4c4d8hQh_7h2cAcTd_TcQc9sKc() {
    assertEquals(
      "7h2cAcTd TcQc9sKc",
      Solver.process("omaha-holdem 3s4c4d8hQh 7h2cAcTd TcQc9sKc"));
  }

  @Test
  public void test_omaha_holdem_846_3c3dQcQhTs_6c4h8s3h_7sTd6d9s_Jc7hAh4s_5c9hKc5s_8d8cAd9d_7cJd2c7d_Tc2sTh3s_JhQs4dAc() {
    assertEquals(
      "Jc7hAh4s 5c9hKc5s 7cJd2c7d 8d8cAd9d 7sTd6d9s 6c4h8s3h JhQs4dAc Tc2sTh3s",
      Solver.process("omaha-holdem 3c3dQcQhTs 6c4h8s3h 7sTd6d9s Jc7hAh4s 5c9hKc5s 8d8cAd9d 7cJd2c7d Tc2sTh3s JhQs4dAc"));
  }

  @Test
  public void test_omaha_holdem_847_2c2h7d8dJc_JhJs5hTd_As3d6h6c_9s2sAh3h_7sQcKh8c_4cKd5cTh_4d3cKsKc_4s3sJd8h_5s7c6d8s_2d6s7h9c() {
    assertEquals(
      "4cKd5cTh As3d6h6c 5s7c6d8s=7sQcKh8c 4s3sJd8h 4d3cKsKc 9s2sAh3h 2d6s7h9c JhJs5hTd",
      Solver.process("omaha-holdem 2c2h7d8dJc JhJs5hTd As3d6h6c 9s2sAh3h 7sQcKh8c 4cKd5cTh 4d3cKsKc 4s3sJd8h 5s7c6d8s 2d6s7h9c"));
  }

  @Test
  public void test_omaha_holdem_848_3s4c6d7c7d_8cTc5c5s_3h8hAc2d_8d2c9dJs_Ah9h8s2h() {
    assertEquals(
      "8d2c9dJs Ah9h8s2h 3h8hAc2d 8cTc5c5s",
      Solver.process("omaha-holdem 3s4c6d7c7d 8cTc5c5s 3h8hAc2d 8d2c9dJs Ah9h8s2h"));
  }

  @Test
  public void test_omaha_holdem_849_3s4h5s6d6h_Kd8d9c4d_5d3hQsAs_7dKc9hKs_Kh7s8c7h_8h4c7c2h_Th2c4sJc_Jd6sQc6c_AdTdJh9s() {
    assertEquals(
      "AdTdJh9s Kd8d9c4d 5d3hQsAs 7dKc9hKs Th2c4sJc 8h4c7c2h=Kh7s8c7h Jd6sQc6c",
      Solver.process("omaha-holdem 3s4h5s6d6h Kd8d9c4d 5d3hQsAs 7dKc9hKs Kh7s8c7h 8h4c7c2h Th2c4sJc Jd6sQc6c AdTdJh9s"));
  }

  @Test
  public void test_omaha_holdem_850_6c6s9cQcTh_6h2c3h5d_4hKs4dAs_QsAh5c9s_Js6d3dTd_Jd5sTc8h() {
    assertEquals(
      "4hKs4dAs QsAh5c9s 6h2c3h5d Jd5sTc8h Js6d3dTd",
      Solver.process("omaha-holdem 6c6s9cQcTh 6h2c3h5d 4hKs4dAs QsAh5c9s Js6d3dTd Jd5sTc8h"));
  }

  @Test
  public void test_omaha_holdem_851_5h5s6d6sTh_Ks2sKc2h_Ac3s9hAs_7hKd2cTd_6hQs4d9s_Jh8sKhAd_Qc8h4h6c_5dQhTc9d_8c2d7sJs_3h3dAhJd() {
    assertEquals(
      "8c2d7sJs Jh8sKhAd 3h3dAhJd 7hKd2cTd Ks2sKc2h Ac3s9hAs 6hQs4d9s=Qc8h4h6c 5dQhTc9d",
      Solver.process("omaha-holdem 5h5s6d6sTh Ks2sKc2h Ac3s9hAs 7hKd2cTd 6hQs4d9s Jh8sKhAd Qc8h4h6c 5dQhTc9d 8c2d7sJs 3h3dAhJd"));
  }

  @Test
  public void test_omaha_holdem_852_2c7dKdQhTs_Qc7cJs3s_3cTc2s4s() {
    assertEquals(
      "3cTc2s4s Qc7cJs3s",
      Solver.process("omaha-holdem 2c7dKdQhTs Qc7cJs3s 3cTc2s4s"));
  }

  @Test
  public void test_omaha_holdem_853_3c4d6h8sJc_Jh6c7cQc_7dAh9dQs_Ac5h4h2s_7hTc2hTh_4cAs8hJd_AdQh6d2d() {
    assertEquals(
      "7dAh9dQs AdQh6d2d 7hTc2hTh Jh6c7cQc 4cAs8hJd Ac5h4h2s",
      Solver.process("omaha-holdem 3c4d6h8sJc Jh6c7cQc 7dAh9dQs Ac5h4h2s 7hTc2hTh 4cAs8hJd AdQh6d2d"));
  }

  @Test
  public void test_omaha_holdem_854_6h7c9hAdTs_3d5dTdJh_AcQh8d4h_QdKhKdQc_4c2s2h3c_9dQs7d9c_5cJc6d6c_Ah4d7s8c_3s2d6s7h() {
    assertEquals(
      "4c2s2h3c 3d5dTdJh QdKhKdQc AcQh8d4h 3s2d6s7h 5cJc6d6c 9dQs7d9c Ah4d7s8c",
      Solver.process("omaha-holdem 6h7c9hAdTs 3d5dTdJh AcQh8d4h QdKhKdQc 4c2s2h3c 9dQs7d9c 5cJc6d6c Ah4d7s8c 3s2d6s7h"));
  }

  @Test
  public void test_omaha_holdem_855_3s6c8cJdJs_3cQcKh9h_8hJhQd2d_6sKd7cTh() {
    assertEquals(
      "3cQcKh9h 6sKd7cTh 8hJhQd2d",
      Solver.process("omaha-holdem 3s6c8cJdJs 3cQcKh9h 8hJhQd2d 6sKd7cTh"));
  }

  @Test
  public void test_omaha_holdem_856_3s5c6s8sTs_2dQs7cTc_9c6hTd5s_Jc7h5hJs_Jd5d9s3h_4s6c3d8d() {
    assertEquals(
      "2dQs7cTc Jc7h5hJs Jd5d9s3h 4s6c3d8d 9c6hTd5s",
      Solver.process("omaha-holdem 3s5c6s8sTs 2dQs7cTc 9c6hTd5s Jc7h5hJs Jd5d9s3h 4s6c3d8d"));
  }

  @Test
  public void test_omaha_holdem_857_3d6c9hQdTs_QhQc4s6d_AhQs7s6h_3s4c2d8h_9c7d9s5s_KdAs6sTd() {
    assertEquals(
      "3s4c2d8h KdAs6sTd AhQs7s6h 9c7d9s5s QhQc4s6d",
      Solver.process("omaha-holdem 3d6c9hQdTs QhQc4s6d AhQs7s6h 3s4c2d8h 9c7d9s5s KdAs6sTd"));
  }

  @Test
  public void test_omaha_holdem_858_3d4sJcKcQs_7d8hQh3c_Qd9s5hKs_JdThAhAc() {
    assertEquals(
      "7d8hQh3c Qd9s5hKs JdThAhAc",
      Solver.process("omaha-holdem 3d4sJcKcQs 7d8hQh3c Qd9s5hKs JdThAhAc"));
  }

  @Test
  public void test_omaha_holdem_859_2d6d7cJsQd_9hKc2cAc_7s8dQc3h_Jd3d4hAh() {
    assertEquals(
      "9hKc2cAc 7s8dQc3h Jd3d4hAh",
      Solver.process("omaha-holdem 2d6d7cJsQd 9hKc2cAc 7s8dQc3h Jd3d4hAh"));
  }

  @Test
  public void test_omaha_holdem_860_2h2s8s9hAh_Tc6h2cAs_8c6sTs7h_TdAdKd5d() {
    assertEquals(
      "8c6sTs7h TdAdKd5d Tc6h2cAs",
      Solver.process("omaha-holdem 2h2s8s9hAh Tc6h2cAs 8c6sTs7h TdAdKd5d"));
  }

  @Test
  public void test_omaha_holdem_861_3h6s8hKcTs_9s2s4s5h_KhKsQsJc_7h8d6cQd_Tc7d6d3c_9d5sAsTh_Jd2c7s2d_7cTdJh6h() {
    assertEquals(
      "9s2s4s5h Jd2c7s2d 9d5sAsTh 7h8d6cQd 7cTdJh6h=Tc7d6d3c KhKsQsJc",
      Solver.process("omaha-holdem 3h6s8hKcTs 9s2s4s5h KhKsQsJc 7h8d6cQd Tc7d6d3c 9d5sAsTh Jd2c7s2d 7cTdJh6h"));
  }

  @Test
  public void test_omaha_holdem_862_JdKcKdKhQh_6sAs6dTs_9h5sTd3c_7sQs7c9s_Tc2h4sJc_AhJs8c2s_8d5d4d8s_4hAc9dQd_Jh6h6c5h_3s7h2d3h() {
    assertEquals(
      "Tc2h4sJc AhJs8c2s 4hAc9dQd 9h5sTd3c 3s7h2d3h 6sAs6dTs=Jh6h6c5h 7sQs7c9s 8d5d4d8s",
      Solver.process("omaha-holdem JdKcKdKhQh 6sAs6dTs 9h5sTd3c 7sQs7c9s Tc2h4sJc AhJs8c2s 8d5d4d8s 4hAc9dQd Jh6h6c5h 3s7h2d3h"));
  }

  @Test
  public void test_omaha_holdem_863_3c4s5h9sQs_3hKdTh6h_2sQcTcJh_AcKc2c6s_Qh3d9d8h_JdKhJc5d() {
    assertEquals(
      "3hKdTh6h JdKhJc5d 2sQcTcJh Qh3d9d8h AcKc2c6s",
      Solver.process("omaha-holdem 3c4s5h9sQs 3hKdTh6h 2sQcTcJh AcKc2c6s Qh3d9d8h JdKhJc5d"));
  }

  @Test
  public void test_omaha_holdem_864_2c6d6h8d9h_5cJc7d3s_QsQhTd3h_4c5s5hTh_JdQd6sKs_2dJs4hKc() {
    assertEquals(
      "2dJs4hKc 4c5s5hTh QsQhTd3h JdQd6sKs 5cJc7d3s",
      Solver.process("omaha-holdem 2c6d6h8d9h 5cJc7d3s QsQhTd3h 4c5s5hTh JdQd6sKs 2dJs4hKc"));
  }

  @Test
  public void test_omaha_holdem_865_4c6c8sThTs_Kd6d2d5h_Td7hJhQc_As5d3h8d_Jd2c6h2s_5s7c3c9c() {
    assertEquals(
      "Jd2c6h2s Kd6d2d5h As5d3h8d Td7hJhQc 5s7c3c9c",
      Solver.process("omaha-holdem 4c6c8sThTs Kd6d2d5h Td7hJhQc As5d3h8d Jd2c6h2s 5s7c3c9c"));
  }

  @Test
  public void test_omaha_holdem_866_4d5c7d7sJs_6hKdJc4s_9c8h7c9s_AhKs2s3d_3s2hQc6s_5h3cAsTc_8sQs7hKc_9d3h8dAd_2cQhJhJd_Ts4h4c6d() {
    assertEquals(
      "9d3h8dAd AhKs2s3d 5h3cAsTc 6hKdJc4s 9c8h7c9s 8sQs7hKc 3s2hQc6s Ts4h4c6d 2cQhJhJd",
      Solver.process("omaha-holdem 4d5c7d7sJs 6hKdJc4s 9c8h7c9s AhKs2s3d 3s2hQc6s 5h3cAsTc 8sQs7hKc 9d3h8dAd 2cQhJhJd Ts4h4c6d"));
  }

  @Test
  public void test_omaha_holdem_867_5h6c7sKcQd_KhAcAh2c_4s9hQh7c_3s3cQs8c_6s3h9d8h_8s9c7dAs_5s8dKd4h() {
    assertEquals(
      "3s3cQs8c KhAcAh2c 4s9hQh7c 5s8dKd4h 6s3h9d8h=8s9c7dAs",
      Solver.process("omaha-holdem 5h6c7sKcQd KhAcAh2c 4s9hQh7c 3s3cQs8c 6s3h9d8h 8s9c7dAs 5s8dKd4h"));
  }

  @Test
  public void test_omaha_holdem_868_2d3c3d8d9h_QdKd2s3h_Ks9sJsKc_Qh8c5h9c() {
    assertEquals(
      "Qh8c5h9c Ks9sJsKc QdKd2s3h",
      Solver.process("omaha-holdem 2d3c3d8d9h QdKd2s3h Ks9sJsKc Qh8c5h9c"));
  }

  @Test
  public void test_omaha_holdem_869_2c4d5c6c9d_TcKh5s9h_6h2d7s7d_6d2h8c3h_Jd5d3d8s() {
    assertEquals(
      "6h2d7s7d TcKh5s9h 6d2h8c3h=Jd5d3d8s",
      Solver.process("omaha-holdem 2c4d5c6c9d TcKh5s9h 6h2d7s7d 6d2h8c3h Jd5d3d8s"));
  }

  @Test
  public void test_omaha_holdem_870_2h4d5d6d8h_Ac4c7cKs_8dQsQcAd_8s6cJc9c() {
    assertEquals(
      "8s6cJc9c Ac4c7cKs 8dQsQcAd",
      Solver.process("omaha-holdem 2h4d5d6d8h Ac4c7cKs 8dQsQcAd 8s6cJc9c"));
  }

  @Test
  public void test_omaha_holdem_871_9d9hAhQsTh_JsKh9sQc_4s3h4h5d_Jd5c3s6c_2cAsQh3c_7dKs8c8d_5s9c5h3d() {
    assertEquals(
      "Jd5c3s6c 7dKs8c8d 2cAsQh3c 5s9c5h3d 4s3h4h5d JsKh9sQc",
      Solver.process("omaha-holdem 9d9hAhQsTh JsKh9sQc 4s3h4h5d Jd5c3s6c 2cAsQh3c 7dKs8c8d 5s9c5h3d"));
  }

  @Test
  public void test_omaha_holdem_872_2s3h6d7hQc_4h3c6cJs_4sKhKs5s_7dQdJh3s_9sQhQsKc_2c5dAsTd_6sAd4c8d_2dJc7c9c_TsJdAh4d() {
    assertEquals(
      "TsJdAh4d 2c5dAsTd 6sAd4c8d 4h3c6cJs 2dJc7c9c 7dQdJh3s 9sQhQsKc 4sKhKs5s",
      Solver.process("omaha-holdem 2s3h6d7hQc 4h3c6cJs 4sKhKs5s 7dQdJh3s 9sQhQsKc 2c5dAsTd 6sAd4c8d 2dJc7c9c TsJdAh4d"));
  }

  @Test
  public void test_omaha_holdem_873_2h5s6d7c7d_3d4dJdQh_7sTsQc3h_2dJh6cAd_3cQs9c4c_8hAh9hTh_Ac3sKd4h_5dKc9d6s_KhQdTd2s_Js7h9s8d() {
    assertEquals(
      "KhQdTd2s 5dKc9d6s 2dJh6cAd 7sTsQc3h 3cQs9c4c=3d4dJdQh=Ac3sKd4h 8hAh9hTh=Js7h9s8d",
      Solver.process("omaha-holdem 2h5s6d7c7d 3d4dJdQh 7sTsQc3h 2dJh6cAd 3cQs9c4c 8hAh9hTh Ac3sKd4h 5dKc9d6s KhQdTd2s Js7h9s8d"));
  }

  @Test
  public void test_omaha_holdem_874_3s5s8c9dAd_JsAcQd6s_5h3cQc7c_6cKsKc2c_3h4c9c4h_QhTs9sKh() {
    assertEquals(
      "QhTs9sKh 6cKsKc2c JsAcQd6s 5h3cQc7c 3h4c9c4h",
      Solver.process("omaha-holdem 3s5s8c9dAd JsAcQd6s 5h3cQc7c 6cKsKc2c 3h4c9c4h QhTs9sKh"));
  }

  @Test
  public void test_omaha_holdem_875_2d3h3s4cQh_AsQd8h6c_QcKh5cTd_Tc9cAc7s() {
    assertEquals(
      "Tc9cAc7s QcKh5cTd AsQd8h6c",
      Solver.process("omaha-holdem 2d3h3s4cQh AsQd8h6c QcKh5cTd Tc9cAc7s"));
  }

  @Test
  public void test_omaha_holdem_876_3c4h7s9hTh_Qc5cKd3d_2sKs6s9s_As5hJc4s_7d6hJs8h_KhJd5sKc_9dAc6d2c() {
    assertEquals(
      "Qc5cKd3d As5hJc4s 2sKs6s9s 9dAc6d2c KhJd5sKc 7d6hJs8h",
      Solver.process("omaha-holdem 3c4h7s9hTh Qc5cKd3d 2sKs6s9s As5hJc4s 7d6hJs8h KhJd5sKc 9dAc6d2c"));
  }

  @Test
  public void test_omaha_holdem_877_2h4h6c6dJh_As3d5s9h_KhTc8d8c_5h2d7dTh_KsTd4c4s_9d2s6h3h_JcAhKc7h() {
    assertEquals(
      "KhTc8d8c As3d5s9h 5h2d7dTh JcAhKc7h KsTd4c4s 9d2s6h3h",
      Solver.process("omaha-holdem 2h4h6c6dJh As3d5s9h KhTc8d8c 5h2d7dTh KsTd4c4s 9d2s6h3h JcAhKc7h"));
  }

  @Test
  public void test_omaha_holdem_878_3h6h9dJcQh_4d7hAh8c_KsTh4c3s_2h4h2c7d_8d5d9cTc_Qs2s5cTd_6sJh5s8h() {
    assertEquals(
      "Qs2s5cTd 8d5d9cTc KsTh4c3s 2h4h2c7d 6sJh5s8h 4d7hAh8c",
      Solver.process("omaha-holdem 3h6h9dJcQh 4d7hAh8c KsTh4c3s 2h4h2c7d 8d5d9cTc Qs2s5cTd 6sJh5s8h"));
  }

  @Test
  public void test_omaha_holdem_879_2c3hJdJhQc_Qs9s9cJc_KsAs4h4d_7sQhKcTh_5h2d4sAc_AhTs8h7d() {
    assertEquals(
      "AhTs8h7d 5h2d4sAc KsAs4h4d 7sQhKcTh Qs9s9cJc",
      Solver.process("omaha-holdem 2c3hJdJhQc Qs9s9cJc KsAs4h4d 7sQhKcTh 5h2d4sAc AhTs8h7d"));
  }

  @Test
  public void test_omaha_holdem_880_5d6hKhQcTh_3c9d5sKs_6dAh7dTs_9cKdJc4h_Qs2sQdTd_As9s3s6c_8h2hAcAd() {
    assertEquals(
      "As9s3s6c 6dAh7dTs 3c9d5sKs Qs2sQdTd 9cKdJc4h 8h2hAcAd",
      Solver.process("omaha-holdem 5d6hKhQcTh 3c9d5sKs 6dAh7dTs 9cKdJc4h Qs2sQdTd As9s3s6c 8h2hAcAd"));
  }

  @Test
  public void test_omaha_holdem_881_4d9dJsKcQs_8sTc4c9c_Ks7s7c4s_7h2d7d8h_Qc8d6dQh_TdAhJh4h() {
    assertEquals(
      "7h2d7d8h Ks7s7c4s Qc8d6dQh 8sTc4c9c TdAhJh4h",
      Solver.process("omaha-holdem 4d9dJsKcQs 8sTc4c9c Ks7s7c4s 7h2d7d8h Qc8d6dQh TdAhJh4h"));
  }

  @Test
  public void test_omaha_holdem_882_4d6c6h7sQd_3h5d4s2s_3d2hJdAs_4c2c9sAh_6sQhTcTs() {
    assertEquals(
      "3d2hJdAs 4c2c9sAh 3h5d4s2s 6sQhTcTs",
      Solver.process("omaha-holdem 4d6c6h7sQd 3h5d4s2s 3d2hJdAs 4c2c9sAh 6sQhTcTs"));
  }

  @Test
  public void test_omaha_holdem_883_6c8sAhJdTs_Ks2c8c5s_7h5cAcAd_6h3d7cJc_Jh4cAs2d() {
    assertEquals(
      "Ks2c8c5s 6h3d7cJc Jh4cAs2d 7h5cAcAd",
      Solver.process("omaha-holdem 6c8sAhJdTs Ks2c8c5s 7h5cAcAd 6h3d7cJc Jh4cAs2d"));
  }

  @Test
  public void test_omaha_holdem_884_7c9c9hAsTh_Ad3sQd3h_Kh8h4d8s_3d9dTs6c_4hTd6s5s_3c4c7s8c_KcQc5h2d() {
    assertEquals(
      "KcQc5h2d 3c4c7s8c Kh8h4d8s 4hTd6s5s Ad3sQd3h 3d9dTs6c",
      Solver.process("omaha-holdem 7c9c9hAsTh Ad3sQd3h Kh8h4d8s 3d9dTs6c 4hTd6s5s 3c4c7s8c KcQc5h2d"));
  }

  @Test
  public void test_omaha_holdem_885_3c5h6d8h9d_7hTsKc2h_Qh7c2s6h_Ks3d2cQs() {
    assertEquals(
      "Ks3d2cQs Qh7c2s6h 7hTsKc2h",
      Solver.process("omaha-holdem 3c5h6d8h9d 7hTsKc2h Qh7c2s6h Ks3d2cQs"));
  }

  @Test
  public void test_omaha_holdem_886_3c5h5s8d9s_Td4h9hAs_6s7dQh4d_TcKdKh6d_QsJhJs3h_Ks5d5c2h_2c2d6cJd() {
    assertEquals(
      "2c2d6cJd Td4h9hAs QsJhJs3h TcKdKh6d 6s7dQh4d Ks5d5c2h",
      Solver.process("omaha-holdem 3c5h5s8d9s Td4h9hAs 6s7dQh4d TcKdKh6d QsJhJs3h Ks5d5c2h 2c2d6cJd"));
  }

  @Test
  public void test_omaha_holdem_887_4s8h8s9dAs_2c9h5cKh_JdQcQd6d_4c2sKd2d() {
    assertEquals(
      "4c2sKd2d 2c9h5cKh JdQcQd6d",
      Solver.process("omaha-holdem 4s8h8s9dAs 2c9h5cKh JdQcQd6d 4c2sKd2d"));
  }

  @Test
  public void test_omaha_holdem_888_2s5h7c9hQh_Ac3s4cQs_ThKh6c3c() {
    assertEquals(
      "Ac3s4cQs ThKh6c3c",
      Solver.process("omaha-holdem 2s5h7c9hQh Ac3s4cQs ThKh6c3c"));
  }

  @Test
  public void test_omaha_holdem_889_3c4c4h6dTh_AsQh9s7h_2h5sQcJd_3sJh7dJs_9h4dQsJc() {
    assertEquals(
      "AsQh9s7h 3sJh7dJs 9h4dQsJc 2h5sQcJd",
      Solver.process("omaha-holdem 3c4c4h6dTh AsQh9s7h 2h5sQcJd 3sJh7dJs 9h4dQsJc"));
  }

  @Test
  public void test_omaha_holdem_890_3c3s9dAsJd_6d3h6c8h_5d7sAh4h_4d6hTd5c_9hQh2hTh_3d7cAcJc_7hTs2c7d_9s8c9c5s() {
    assertEquals(
      "4d6hTd5c 7hTs2c7d 9hQh2hTh 5d7sAh4h 6d3h6c8h 3d7cAcJc 9s8c9c5s",
      Solver.process("omaha-holdem 3c3s9dAsJd 6d3h6c8h 5d7sAh4h 4d6hTd5c 9hQh2hTh 3d7cAcJc 7hTs2c7d 9s8c9c5s"));
  }

  @Test
  public void test_omaha_holdem_891_2c5c7cKhQc_Tc6sKd7h_9c6hAdTd_AcQs6cQd_Qh3d2s9d_8h7d6d3c_9s5d5h4d() {
    assertEquals(
      "9c6hAdTd 8h7d6d3c Qh3d2s9d Tc6sKd7h 9s5d5h4d AcQs6cQd",
      Solver.process("omaha-holdem 2c5c7cKhQc Tc6sKd7h 9c6hAdTd AcQs6cQd Qh3d2s9d 8h7d6d3c 9s5d5h4d"));
  }

  @Test
  public void test_omaha_holdem_892_5dKcKdKsTs_Ah2s8c7d_9h4h8h5h_Qs6d2cQh() {
    assertEquals(
      "9h4h8h5h Ah2s8c7d Qs6d2cQh",
      Solver.process("omaha-holdem 5dKcKdKsTs Ah2s8c7d 9h4h8h5h Qs6d2cQh"));
  }

  @Test
  public void test_omaha_holdem_893_7hKcQcQhTh_9c8s7s2h_AsTs4c6h_Ac7cQs5h_KdJs2dTd_3d8hAhTc_Jh4d7d3s_6s4s9sKh_9h5d5c6c() {
    assertEquals(
      "9h5d5c6c 9c8s7s2h Jh4d7d3s AsTs4c6h 6s4s9sKh KdJs2dTd 3d8hAhTc Ac7cQs5h",
      Solver.process("omaha-holdem 7hKcQcQhTh 9c8s7s2h AsTs4c6h Ac7cQs5h KdJs2dTd 3d8hAhTc Jh4d7d3s 6s4s9sKh 9h5d5c6c"));
  }

  @Test
  public void test_omaha_holdem_894_2c2h4s8dTc_TdTs8hKh_9h3sQc3h_4dKd9c9s_3cAh6s3d_AdQdQsJs_6cJcTh9d_7s4hJh5c_7d5s2s8c() {
    assertEquals(
      "3cAh6s3d=9h3sQc3h 7s4hJh5c 4dKd9c9s 6cJcTh9d AdQdQsJs 7d5s2s8c TdTs8hKh",
      Solver.process("omaha-holdem 2c2h4s8dTc TdTs8hKh 9h3sQc3h 4dKd9c9s 3cAh6s3d AdQdQsJs 6cJcTh9d 7s4hJh5c 7d5s2s8c"));
  }

  @Test
  public void test_omaha_holdem_895_3d3h9dJhQc_4hKs3cQd_9sAhTs4d_Jd7sQh2s_2d4c5c4s_2h7dTc6c() {
    assertEquals(
      "2h7dTc6c 2d4c5c4s 9sAhTs4d Jd7sQh2s 4hKs3cQd",
      Solver.process("omaha-holdem 3d3h9dJhQc 4hKs3cQd 9sAhTs4d Jd7sQh2s 2d4c5c4s 2h7dTc6c"));
  }

  @Test
  public void test_omaha_holdem_896_2c4h6cJhTs_Qc3cKsJs_4cJdTd9s_7sQd4s7h_As5cThKh_Tc8s5dKd_6s3d4dQh_5sJcAh3s_7c7dKcAd() {
    assertEquals(
      "7c7dKcAd=7sQd4s7h Tc8s5dKd As5cThKh Qc3cKsJs 6s3d4dQh 4cJdTd9s 5sJcAh3s",
      Solver.process("omaha-holdem 2c4h6cJhTs Qc3cKsJs 4cJdTd9s 7sQd4s7h As5cThKh Tc8s5dKd 6s3d4dQh 5sJcAh3s 7c7dKcAd"));
  }

  @Test
  public void test_omaha_holdem_897_3s7d8cQdTd_Kd3hAcKc_Jd5s3d2h_9hAd4h9d_8h4cQc7c_2dTc4d9c_5c7sTsJs_3cAhQhKh() {
    assertEquals(
      "Kd3hAcKc 5c7sTsJs 3cAhQhKh 8h4cQc7c 2dTc4d9c Jd5s3d2h 9hAd4h9d",
      Solver.process("omaha-holdem 3s7d8cQdTd Kd3hAcKc Jd5s3d2h 9hAd4h9d 8h4cQc7c 2dTc4d9c 5c7sTsJs 3cAhQhKh"));
  }

  @Test
  public void test_omaha_holdem_898_3d6h9dQsTd_2cKs2h7c_4hJdAs3h_5sAd7dKh() {
    assertEquals(
      "2cKs2h7c 4hJdAs3h 5sAd7dKh",
      Solver.process("omaha-holdem 3d6h9dQsTd 2cKs2h7c 4hJdAs3h 5sAd7dKh"));
  }

  @Test
  public void test_omaha_holdem_899_3c4d4h4sQs_3h8dTd2h_Qh2s4c9s() {
    assertEquals(
      "3h8dTd2h Qh2s4c9s",
      Solver.process("omaha-holdem 3c4d4h4sQs 3h8dTd2h Qh2s4c9s"));
  }

  @Test
  public void test_omaha_holdem_900_3s5c7cJdKs_2d9cQc9h_TsQdAd5s_Kd2s4sAh() {
    assertEquals(
      "TsQdAd5s 2d9cQc9h Kd2s4sAh",
      Solver.process("omaha-holdem 3s5c7cJdKs 2d9cQc9h TsQdAd5s Kd2s4sAh"));
  }

  @Test
  public void test_omaha_holdem_901_4s5d9c9h9s_Qh8dAc8h_7cQc8c5s_JcQsAdTd_ThJdKhAh_3c3dTcQd_6dKdTs4d_4h5c3hJs() {
    assertEquals(
      "4h5c3hJs 7cQc8c5s 6dKdTs4d JcQsAdTd ThJdKhAh 3c3dTcQd Qh8dAc8h",
      Solver.process("omaha-holdem 4s5d9c9h9s Qh8dAc8h 7cQc8c5s JcQsAdTd ThJdKhAh 3c3dTcQd 6dKdTs4d 4h5c3hJs"));
  }

  @Test
  public void test_omaha_holdem_902_5dJcJdJhQd_5c4s8dKs_Kc5s7d2d_Th3sQhAc_Kd2cAsTc_Ah2h4d9s_Td6h9hJs_2s8c7cAd_4h5h8s7s() {
    assertEquals(
      "4h5h8s7s 5c4s8dKs 2s8c7cAd Ah2h4d9s Th3sQhAc Kd2cAsTc Kc5s7d2d Td6h9hJs",
      Solver.process("omaha-holdem 5dJcJdJhQd 5c4s8dKs Kc5s7d2d Th3sQhAc Kd2cAsTc Ah2h4d9s Td6h9hJs 2s8c7cAd 4h5h8s7s"));
  }

  @Test
  public void test_omaha_holdem_903_3d4cJcQcTs_6dKc4d3c_QhAdAhAs_6s4s8dTc_Qs7h9d7s_5d3h5hJh_2d8c2h5c_KdTh7d9c() {
    assertEquals(
      "Qs7h9d7s QhAdAhAs 6s4s8dTc 5d3h5hJh KdTh7d9c 2d8c2h5c 6dKc4d3c",
      Solver.process("omaha-holdem 3d4cJcQcTs 6dKc4d3c QhAdAhAs 6s4s8dTc Qs7h9d7s 5d3h5hJh 2d8c2h5c KdTh7d9c"));
  }

  @Test
  public void test_omaha_holdem_904_3s4c4h4sAc_TdKc5s2d_8s6hQc7h_AsQs5c9d_9s9h5dJh_8d7d6cJd_Ks7s6s2s_TcJsKh3c_2h2c9c8c_Ts3dKdQh() {
    assertEquals(
      "8d7d6cJd 8s6hQc7h Ks7s6s2s TcJsKh3c Ts3dKdQh AsQs5c9d TdKc5s2d 2h2c9c8c 9s9h5dJh",
      Solver.process("omaha-holdem 3s4c4h4sAc TdKc5s2d 8s6hQc7h AsQs5c9d 9s9h5dJh 8d7d6cJd Ks7s6s2s TcJsKh3c 2h2c9c8c Ts3dKdQh"));
  }

  @Test
  public void test_omaha_holdem_905_2h4h7s9cKd_Jc4d6d7h_9d6sQc2s_Qd7cKh3c_QsJd8c8d_Td5h4s5s() {
    assertEquals(
      "Td5h4s5s QsJd8c8d Jc4d6d7h 9d6sQc2s Qd7cKh3c",
      Solver.process("omaha-holdem 2h4h7s9cKd Jc4d6d7h 9d6sQc2s Qd7cKh3c QsJd8c8d Td5h4s5s"));
  }

  @Test
  public void test_omaha_holdem_906_2d4d5dJsKd_5hQc4s3d_9s4c4hKc_Qh8hAs2s_Qs5s9dTc_9hJd7dTh() {
    assertEquals(
      "Qh8hAs2s Qs5s9dTc 5hQc4s3d 9s4c4hKc 9hJd7dTh",
      Solver.process("omaha-holdem 2d4d5dJsKd 5hQc4s3d 9s4c4hKc Qh8hAs2s Qs5s9dTc 9hJd7dTh"));
  }

  @Test
  public void test_omaha_holdem_907_3h6s8cKdKh_2dJs4c3c_9h6hQdAh_8h3sKcJh_Td5hAs6d_5c6cAc4h_KsTsQcQs() {
    assertEquals(
      "2dJs4c3c 5c6cAc4h=9h6hQdAh=Td5hAs6d KsTsQcQs 8h3sKcJh",
      Solver.process("omaha-holdem 3h6s8cKdKh 2dJs4c3c 9h6hQdAh 8h3sKcJh Td5hAs6d 5c6cAc4h KsTsQcQs"));
  }

  @Test
  public void test_omaha_holdem_908_2s6h9cKdKh_Jd3d7dKs_Jc7sQh6c_2cAdQs6d_As5d4dAh_2h2d7c3s_TdJhJs9s_5s4s3cTc_8sTh3h8d() {
    assertEquals(
      "5s4s3cTc Jc7sQh6c 2cAdQs6d 8sTh3h8d TdJhJs9s As5d4dAh Jd3d7dKs 2h2d7c3s",
      Solver.process("omaha-holdem 2s6h9cKdKh Jd3d7dKs Jc7sQh6c 2cAdQs6d As5d4dAh 2h2d7c3s TdJhJs9s 5s4s3cTc 8sTh3h8d"));
  }

  @Test
  public void test_omaha_holdem_909_4s5h7s8dTs_Qd4cKhJd_Th7d9hQh() {
    assertEquals(
      "Qd4cKhJd Th7d9hQh",
      Solver.process("omaha-holdem 4s5h7s8dTs Qd4cKhJd Th7d9hQh"));
  }

  @Test
  public void test_omaha_holdem_910_4c5cJhKdQs_Kc6s7d3d_JdThAs8s_5d6h9h9s_2s3s7h9d() {
    assertEquals(
      "2s3s7h9d 5d6h9h9s Kc6s7d3d JdThAs8s",
      Solver.process("omaha-holdem 4c5cJhKdQs Kc6s7d3d JdThAs8s 5d6h9h9s 2s3s7h9d"));
  }

  @Test
  public void test_omaha_holdem_911_3s5d9sAdQd_Tc9h7s4h_Ts3d5s2h_4dKd7h2s() {
    assertEquals(
      "Tc9h7s4h Ts3d5s2h 4dKd7h2s",
      Solver.process("omaha-holdem 3s5d9sAdQd Tc9h7s4h Ts3d5s2h 4dKd7h2s"));
  }

  @Test
  public void test_omaha_holdem_912_2d7h7sAhTs_8cJc9sJh_2cKs3c3s_Kh6h9c4s_8h2hQc5s_Jd8d5hQh_Qs7c5c3h_Ac9h4hTc() {
    assertEquals(
      "Jd8d5hQh Kh6h9c4s 8h2hQc5s 2cKs3c3s 8cJc9sJh Ac9h4hTc Qs7c5c3h",
      Solver.process("omaha-holdem 2d7h7sAhTs 8cJc9sJh 2cKs3c3s Kh6h9c4s 8h2hQc5s Jd8d5hQh Qs7c5c3h Ac9h4hTc"));
  }

  @Test
  public void test_omaha_holdem_913_3s7c8sAdTc_3hAhKc6h_JsQs5hQd_6d4sQh3d_Kh5d2s6s_8dAs7hJc() {
    assertEquals(
      "Kh5d2s6s 6d4sQh3d JsQs5hQd 3hAhKc6h 8dAs7hJc",
      Solver.process("omaha-holdem 3s7c8sAdTc 3hAhKc6h JsQs5hQd 6d4sQh3d Kh5d2s6s 8dAs7hJc"));
  }

  @Test
  public void test_omaha_holdem_914_5h6c8dKdQc_3d5d7h4s_QsAsTsAd_7d4h6sJd_Ac7c8cJs_9s6hQd8h_2s4d3sTc_5cKc3cKs_Jc8sTh9h() {
    assertEquals(
      "2s4d3sTc Jc8sTh9h Ac7c8cJs QsAsTsAd 9s6hQd8h 5cKc3cKs 3d5d7h4s=7d4h6sJd",
      Solver.process("omaha-holdem 5h6c8dKdQc 3d5d7h4s QsAsTsAd 7d4h6sJd Ac7c8cJs 9s6hQd8h 2s4d3sTc 5cKc3cKs Jc8sTh9h"));
  }

  @Test
  public void test_omaha_holdem_915_2s5cQhQsTc_3hAdAs9h_7dAc4dQc_JhTh2h8c_Kd6h2c7h_3c3d9d5s_Kc8s9cJd_Ah2dTs6d_3s7sTd9s() {
    assertEquals(
      "Kc8s9cJd Kd6h2c7h 3c3d9d5s 3s7sTd9s JhTh2h8c Ah2dTs6d 3hAdAs9h 7dAc4dQc",
      Solver.process("omaha-holdem 2s5cQhQsTc 3hAdAs9h 7dAc4dQc JhTh2h8c Kd6h2c7h 3c3d9d5s Kc8s9cJd Ah2dTs6d 3s7sTd9s"));
  }

  @Test
  public void test_omaha_holdem_916_4c6dKcKdTc_7c8sQd5c_6cThJs7d_7h3sQcKs() {
    assertEquals(
      "6cThJs7d 7h3sQcKs 7c8sQd5c",
      Solver.process("omaha-holdem 4c6dKcKdTc 7c8sQd5c 6cThJs7d 7h3sQcKs"));
  }

  @Test
  public void test_omaha_holdem_917_3s9sAsQcTh_5s2h7sKc_5dAh2c5c_7h7c9dQs_TsKs6h2s_4s8d4c8c_5hAdJh4h() {
    assertEquals(
      "4s8d4c8c 5dAh2c5c 5hAdJh4h 7h7c9dQs 5s2h7sKc TsKs6h2s",
      Solver.process("omaha-holdem 3s9sAsQcTh 5s2h7sKc 5dAh2c5c 7h7c9dQs TsKs6h2s 4s8d4c8c 5hAdJh4h"));
  }

  @Test
  public void test_omaha_holdem_918_7hJsKsQcQh_9h7sKd2c_9sAdJh2d_9dTdQd6h_4h6c2h9c_3d6sJc2s() {
    assertEquals(
      "4h6c2h9c 3d6sJc2s 9sAdJh2d 9h7sKd2c 9dTdQd6h",
      Solver.process("omaha-holdem 7hJsKsQcQh 9h7sKd2c 9sAdJh2d 9dTdQd6h 4h6c2h9c 3d6sJc2s"));
  }

  @Test
  public void test_omaha_holdem_919_3c7d7sJcTc_2c2sJh2d_9h8cQc6s() {
    assertEquals(
      "2c2sJh2d 9h8cQc6s",
      Solver.process("omaha-holdem 3c7d7sJcTc 2c2sJh2d 9h8cQc6s"));
  }

  @Test
  public void test_omaha_holdem_920_2h3c6dAcJh_Qc8c2cKh_Ad9h9d3s_ThTd5s8s_3h7cKsQh_Ts2d4cKd() {
    assertEquals(
      "Qc8c2cKh=Ts2d4cKd 3h7cKsQh ThTd5s8s Ad9h9d3s",
      Solver.process("omaha-holdem 2h3c6dAcJh Qc8c2cKh Ad9h9d3s ThTd5s8s 3h7cKsQh Ts2d4cKd"));
  }

  @Test
  public void test_omaha_holdem_921_2h3c3d3h3s_6cTd8c6h_AsKc2dTc_4sJc7hKh_9hKsAh9c_7c2s7dAd_8h6sJs5c_5d8sQd7s_6d8d2c5h_JdKdTsQs() {
    assertEquals(
      "6d8d2c5h 8h6sJs5c 5d8sQd7s 4sJc7hKh JdKdTsQs AsKc2dTc 6cTd8c6h 7c2s7dAd 9hKsAh9c",
      Solver.process("omaha-holdem 2h3c3d3h3s 6cTd8c6h AsKc2dTc 4sJc7hKh 9hKsAh9c 7c2s7dAd 8h6sJs5c 5d8sQd7s 6d8d2c5h JdKdTsQs"));
  }

  @Test
  public void test_omaha_holdem_922_2d5c7cAdKs_2cKh3s8h_6c7s9c5s_6h4dTd3h_9d4c2s5d() {
    assertEquals(
      "9d4c2s5d 6c7s9c5s 2cKh3s8h 6h4dTd3h",
      Solver.process("omaha-holdem 2d5c7cAdKs 2cKh3s8h 6c7s9c5s 6h4dTd3h 9d4c2s5d"));
  }

  @Test
  public void test_omaha_holdem_923_3c3d6dKhTh_9s8s6cJc_Kc7s4sQh_Js6s5h6h_Ad2d8cKs_5c4d7h3h_5s5d3s7d() {
    assertEquals(
      "9s8s6cJc Kc7s4sQh Ad2d8cKs 5c4d7h3h=5s5d3s7d Js6s5h6h",
      Solver.process("omaha-holdem 3c3d6dKhTh 9s8s6cJc Kc7s4sQh Js6s5h6h Ad2d8cKs 5c4d7h3h 5s5d3s7d"));
  }

  @Test
  public void test_omaha_holdem_924_5s6dJcJsQd_9hAh6h4s_7h5dTcTh_AsKh5c6c_Ad9dQc6s_Jh8h8dTd_Ac9c2dKs_8s5hQhQs_2c4c9s4h_Kd2s3d7d() {
    assertEquals(
      "Kd2s3d7d Ac9c2dKs 2c4c9s4h 9hAh6h4s=AsKh5c6c 7h5dTcTh Ad9dQc6s Jh8h8dTd 8s5hQhQs",
      Solver.process("omaha-holdem 5s6dJcJsQd 9hAh6h4s 7h5dTcTh AsKh5c6c Ad9dQc6s Jh8h8dTd Ac9c2dKs 8s5hQhQs 2c4c9s4h Kd2s3d7d"));
  }

  @Test
  public void test_omaha_holdem_925_4h7dJdJsKs_QhKh9c7c_Qd4s8cAh_As5cAdTc_JhQsTd6s_8h5s3sTh() {
    assertEquals(
      "8h5s3sTh Qd4s8cAh QhKh9c7c As5cAdTc JhQsTd6s",
      Solver.process("omaha-holdem 4h7dJdJsKs QhKh9c7c Qd4s8cAh As5cAdTc JhQsTd6s 8h5s3sTh"));
  }

  @Test
  public void test_omaha_holdem_926_7c8hAdAhTh_2sTd4dKh_6h4sKc8s_Js5dQc6s_QsQh6cAs_2h5hJh2d_9d6d7dAc_5s3hTcQd() {
    assertEquals(
      "Js5dQc6s 6h4sKc8s 5s3hTcQd 2sTd4dKh QsQh6cAs 2h5hJh2d 9d6d7dAc",
      Solver.process("omaha-holdem 7c8hAdAhTh 2sTd4dKh 6h4sKc8s Js5dQc6s QsQh6cAs 2h5hJh2d 9d6d7dAc 5s3hTcQd"));
  }

  @Test
  public void test_omaha_holdem_927_2d4h7hJdKs_6sAd6h2h_3c7s3dQh_Th8c7dQs_Kh5h5d6c_9c9d8sTc() {
    assertEquals(
      "6sAd6h2h 3c7s3dQh=Th8c7dQs 9c9d8sTc Kh5h5d6c",
      Solver.process("omaha-holdem 2d4h7hJdKs 6sAd6h2h 3c7s3dQh Th8c7dQs Kh5h5d6c 9c9d8sTc"));
  }

  @Test
  public void test_omaha_holdem_928_6dKdKsQcQs_9dJc9c6s_Ts7dAdTc_8s6cAhAs_2s5h6hKh_5sAc2c9h_Td8d8c4h_5dJh4c4s_3h3cThJs() {
    assertEquals(
      "5sAc2c9h 3h3cThJs 5dJh4c4s Td8d8c4h 9dJc9c6s Ts7dAdTc 8s6cAhAs 2s5h6hKh",
      Solver.process("omaha-holdem 6dKdKsQcQs 9dJc9c6s Ts7dAdTc 8s6cAhAs 2s5h6hKh 5sAc2c9h Td8d8c4h 5dJh4c4s 3h3cThJs"));
  }

  @Test
  public void test_omaha_holdem_929_3h5s9dJsQc_7hTsJcAd_5h8d9sAh_2h6h6cTh_Qh6sKhKc_2d7d3c3d_Jd9cKd6d_5cTd4h8c_9hKs3s4s_Tc2c8h4c() {
    assertEquals(
      "2h6h6cTh 7hTsJcAd Qh6sKhKc 9hKs3s4s 5h8d9sAh Jd9cKd6d 2d7d3c3d 5cTd4h8c=Tc2c8h4c",
      Solver.process("omaha-holdem 3h5s9dJsQc 7hTsJcAd 5h8d9sAh 2h6h6cTh Qh6sKhKc 2d7d3c3d Jd9cKd6d 5cTd4h8c 9hKs3s4s Tc2c8h4c"));
  }

  @Test
  public void test_omaha_holdem_930_3c4c7d8hKh_6sKc7hAc_TdJhTsQd() {
    assertEquals(
      "TdJhTsQd 6sKc7hAc",
      Solver.process("omaha-holdem 3c4c7d8hKh 6sKc7hAc TdJhTsQd"));
  }

  @Test
  public void test_omaha_holdem_931_6h8hJhJsKs_JcJdKcTh_5s8sKh4c() {
    assertEquals(
      "5s8sKh4c JcJdKcTh",
      Solver.process("omaha-holdem 6h8hJhJsKs JcJdKcTh 5s8sKh4c"));
  }

  @Test
  public void test_omaha_holdem_932_2d2s3c4hJs_6c8d7d6s_4s3s9sKh_3d6h7cQh_AdJh5cQc_4c6d5hAh_Qd5s2c9c() {
    assertEquals(
      "3d6h7cQh 4s3s9sKh 6c8d7d6s Qd5s2c9c AdJh5cQc 4c6d5hAh",
      Solver.process("omaha-holdem 2d2s3c4hJs 6c8d7d6s 4s3s9sKh 3d6h7cQh AdJh5cQc 4c6d5hAh Qd5s2c9c"));
  }

  @Test
  public void test_omaha_holdem_933_3d4cAdKsQh_5dJh4d8h_JcJd6dQs_9dJs6s2c_Td8dKc3h_2d6c3sTs_Qc9c3c7h() {
    assertEquals(
      "9dJs6s2c 2d6c3sTs 5dJh4d8h JcJd6dQs Qc9c3c7h Td8dKc3h",
      Solver.process("omaha-holdem 3d4cAdKsQh 5dJh4d8h JcJd6dQs 9dJs6s2c Td8dKc3h 2d6c3sTs Qc9c3c7h"));
  }

  @Test
  public void test_omaha_holdem_934_8sKdQcQdTc_8dTsKhKs_7h2d6c8h_JhAd9c5s_9d4c7dQh_6sQs3h6h_2sAcAs2h() {
    assertEquals(
      "7h2d6c8h 2sAcAs2h 6sQs3h6h 9d4c7dQh JhAd9c5s 8dTsKhKs",
      Solver.process("omaha-holdem 8sKdQcQdTc 8dTsKhKs 7h2d6c8h JhAd9c5s 9d4c7dQh 6sQs3h6h 2sAcAs2h"));
  }

  @Test
  public void test_omaha_holdem_935_2d2s7d7sQs_9d6h2h9c_KdTd7cQc_Jc8h6c4h_Qd8sAh6s_5s6dTsJs_Ac7h4cAs_Tc5c9hTh() {
    assertEquals(
      "Jc8h6c4h Tc5c9hTh 9d6h2h9c Ac7h4cAs Qd8sAh6s 5s6dTsJs KdTd7cQc",
      Solver.process("omaha-holdem 2d2s7d7sQs 9d6h2h9c KdTd7cQc Jc8h6c4h Qd8sAh6s 5s6dTsJs Ac7h4cAs Tc5c9hTh"));
  }

  @Test
  public void test_omaha_holdem_936_5c8d9cAcQd_9d8h4s7s_5s6d3d5h() {
    assertEquals(
      "9d8h4s7s 5s6d3d5h",
      Solver.process("omaha-holdem 5c8d9cAcQd 9d8h4s7s 5s6d3d5h"));
  }

  @Test
  public void test_omaha_holdem_937_8d9c9sJcKc_Qs7d4dQc_2d6d5h6s_2cTsQd3h_Kd2s8s6h_4s5dThJs_As9hAhQh_Tc5cKh8c() {
    assertEquals(
      "2d6d5h6s 4s5dThJs Qs7d4dQc Kd2s8s6h As9hAhQh 2cTsQd3h Tc5cKh8c",
      Solver.process("omaha-holdem 8d9c9sJcKc Qs7d4dQc 2d6d5h6s 2cTsQd3h Kd2s8s6h 4s5dThJs As9hAhQh Tc5cKh8c"));
  }

  @Test
  public void test_omaha_holdem_938_3d3sJhQsTs_2dKc6h5h_Jd9c6c3h_2hAh4d9d_AsAc7dAd_2s4hJs5c_Ks6d8hTd_4s8s9s5s_Th2cKdQc() {
    assertEquals(
      "2dKc6h5h 2hAh4d9d Ks6d8hTd Th2cKdQc AsAc7dAd 4s8s9s5s 2s4hJs5c Jd9c6c3h",
      Solver.process("omaha-holdem 3d3sJhQsTs 2dKc6h5h Jd9c6c3h 2hAh4d9d AsAc7dAd 2s4hJs5c Ks6d8hTd 4s8s9s5s Th2cKdQc"));
  }

  @Test
  public void test_omaha_holdem_939_8c8sJsKdQc_5s2c4sKh_9d7dAdJh() {
    assertEquals(
      "9d7dAdJh 5s2c4sKh",
      Solver.process("omaha-holdem 8c8sJsKdQc 5s2c4sKh 9d7dAdJh"));
  }

  @Test
  public void test_omaha_holdem_940_2d3d8d9hTc_Qc3sQhKd_Ks7s9s8s_Td5sTh4h_AsJsTs5h_7d5dKh6h_KcAh4c4d_3c4s8h5c_6c7hQsJc_2sJd9dAd() {
    assertEquals(
      "KcAh4c4d AsJsTs5h Qc3sQhKd 3c4s8h5c Ks7s9s8s Td5sTh4h 6c7hQsJc 7d5dKh6h 2sJd9dAd",
      Solver.process("omaha-holdem 2d3d8d9hTc Qc3sQhKd Ks7s9s8s Td5sTh4h AsJsTs5h 7d5dKh6h KcAh4c4d 3c4s8h5c 6c7hQsJc 2sJd9dAd"));
  }

  @Test
  public void test_omaha_holdem_941_3h5c6sKsTs_9sJs2c8s_7s6h5dQh_9hAh6c2h_4d6d3dKd_4c5s9c8d() {
    assertEquals(
      "4c5s9c8d 9hAh6c2h 7s6h5dQh 4d6d3dKd 9sJs2c8s",
      Solver.process("omaha-holdem 3h5c6sKsTs 9sJs2c8s 7s6h5dQh 9hAh6c2h 4d6d3dKd 4c5s9c8d"));
  }

  @Test
  public void test_omaha_holdem_942_5c5dJhQcQh_Qd2d6c6s_8d2sJdAh_As2c2h6h_8h5s8c7s_Kd9h4c4h_Tc3d7hAc_QsJs9c9s_TdTh5h6d_4sKh8s9d() {
    assertEquals(
      "4sKh8s9d Tc3d7hAc As2c2h6h Kd9h4c4h 8d2sJdAh 8h5s8c7s TdTh5h6d Qd2d6c6s QsJs9c9s",
      Solver.process("omaha-holdem 5c5dJhQcQh Qd2d6c6s 8d2sJdAh As2c2h6h 8h5s8c7s Kd9h4c4h Tc3d7hAc QsJs9c9s TdTh5h6d 4sKh8s9d"));
  }

  @Test
  public void test_omaha_holdem_943_2h4h6h6sAs_5dJcKcJs_Qs9dQc7c_2dTs6d2c_TcAd3dJh() {
    assertEquals(
      "5dJcKcJs Qs9dQc7c TcAd3dJh 2dTs6d2c",
      Solver.process("omaha-holdem 2h4h6h6sAs 5dJcKcJs Qs9dQc7c 2dTs6d2c TcAd3dJh"));
  }

  @Test
  public void test_omaha_holdem_944_2d5c5dJsTs_7dAdKcTd_6h3dAhJh_3c6c9sQs_8sTc5s8c_4d3s4hQd_KdAcThQh() {
    assertEquals(
      "3c6c9sQs 4d3s4hQd 7dAdKcTd=KdAcThQh 6h3dAhJh 8sTc5s8c",
      Solver.process("omaha-holdem 2d5c5dJsTs 7dAdKcTd 6h3dAhJh 3c6c9sQs 8sTc5s8c 4d3s4hQd KdAcThQh"));
  }

  @Test
  public void test_omaha_holdem_945_7dJcKdKsQd_Ac9dAs4h_5c6sTh7h_Jh6h6d9c_3d7sKc4d_5sJs4cTd_QhTsQs8h_7c2cAh8s_8cAd3c5d() {
    assertEquals(
      "5c6sTh7h 7c2cAh8s Jh6h6d9c 5sJs4cTd Ac9dAs4h 8cAd3c5d QhTsQs8h 3d7sKc4d",
      Solver.process("omaha-holdem 7dJcKdKsQd Ac9dAs4h 5c6sTh7h Jh6h6d9c 3d7sKc4d 5sJs4cTd QhTsQs8h 7c2cAh8s 8cAd3c5d"));
  }

  @Test
  public void test_omaha_holdem_946_3h6d8h9h9s_KcQsJcJs_6sTh2dTc_Kh4c8d8c_3cKs3d6h() {
    assertEquals(
      "6sTh2dTc KcQsJcJs 3cKs3d6h Kh4c8d8c",
      Solver.process("omaha-holdem 3h6d8h9h9s KcQsJcJs 6sTh2dTc Kh4c8d8c 3cKs3d6h"));
  }

  @Test
  public void test_omaha_holdem_947_2d5s9sJdKc_3s3dJs6d_TcTh3hJc_9cAc7hTs_4sAd3cKd_4h7s2s2c_QcJh2h6s_Ks9dAh8h_QhKh8s9h() {
    assertEquals(
      "9cAc7hTs 3s3dJs6d TcTh3hJc 4sAd3cKd QcJh2h6s Ks9dAh8h=QhKh8s9h 4h7s2s2c",
      Solver.process("omaha-holdem 2d5s9sJdKc 3s3dJs6d TcTh3hJc 9cAc7hTs 4sAd3cKd 4h7s2s2c QcJh2h6s Ks9dAh8h QhKh8s9h"));
  }

  @Test
  public void test_omaha_holdem_948_4h8hAcAsJs_KdJd7hTd_4sThAh2s_9c5cKc2h_5h2dJc3s_5d3d7cAd_Tc9s4c6d_3c8cQh5s_9hJh6h7d_2cKs7sQd() {
    assertEquals(
      "9c5cKc2h 2cKs7sQd Tc9s4c6d 3c8cQh5s 5h2dJc3s 9hJh6h7d KdJd7hTd 5d3d7cAd 4sThAh2s",
      Solver.process("omaha-holdem 4h8hAcAsJs KdJd7hTd 4sThAh2s 9c5cKc2h 5h2dJc3s 5d3d7cAd Tc9s4c6d 3c8cQh5s 9hJh6h7d 2cKs7sQd"));
  }

  @Test
  public void test_omaha_holdem_949_3c4d9sAcKh_Td2s5c3h_KdJs4hJc_Jd2dTc9c_7s5sAs8s_4c6sJhAd_9d4s7hTs_5h7d5d3s_KcQcAh8c() {
    assertEquals(
      "5h7d5d3s Jd2dTc9c 7s5sAs8s 9d4s7hTs KdJs4hJc 4c6sJhAd KcQcAh8c Td2s5c3h",
      Solver.process("omaha-holdem 3c4d9sAcKh Td2s5c3h KdJs4hJc Jd2dTc9c 7s5sAs8s 4c6sJhAd 9d4s7hTs 5h7d5d3s KcQcAh8c"));
  }

  @Test
  public void test_omaha_holdem_950_6s8c9cQcTh_5h9h2cQh_QsKcQdKd_6h8s6c6d_5s4d9d3h_7hJdAd9s_2s5d2h8h() {
    assertEquals(
      "2s5d2h8h 5s4d9d3h 5h9h2cQh 6h8s6c6d QsKcQdKd 7hJdAd9s",
      Solver.process("omaha-holdem 6s8c9cQcTh 5h9h2cQh QsKcQdKd 6h8s6c6d 5s4d9d3h 7hJdAd9s 2s5d2h8h"));
  }

  @Test
  public void test_omaha_holdem_951_3h6s7cJhKs_8cKcQd5d_8dKhTsAd_2c3d9cJd_3c4d2sQs_KdQh4c5h_6c4h7dQc_9d5sTc2h_8h9s6dJc_8sTdThAc() {
    assertEquals(
      "9d5sTc2h 3c4d2sQs 8sTdThAc 8cKcQd5d 8dKhTsAd 6c4h7dQc 2c3d9cJd 8h9s6dJc KdQh4c5h",
      Solver.process("omaha-holdem 3h6s7cJhKs 8cKcQd5d 8dKhTsAd 2c3d9cJd 3c4d2sQs KdQh4c5h 6c4h7dQc 9d5sTc2h 8h9s6dJc 8sTdThAc"));
  }

  @Test
  public void test_omaha_holdem_952_2s6h8hJdKs_AdJs7cAs_Kd6d2dAc() {
    assertEquals(
      "AdJs7cAs Kd6d2dAc",
      Solver.process("omaha-holdem 2s6h8hJdKs AdJs7cAs Kd6d2dAc"));
  }

  @Test
  public void test_omaha_holdem_953_2d4d9dJdTd_6d7dTh2c_6s3h7h8c_Ac9hQs5h_8sQd7sTs() {
    assertEquals(
      "Ac9hQs5h 6s3h7h8c 8sQd7sTs 6d7dTh2c",
      Solver.process("omaha-holdem 2d4d9dJdTd 6d7dTh2c 6s3h7h8c Ac9hQs5h 8sQd7sTs"));
  }

  @Test
  public void test_omaha_holdem_954_5s6d8sJsQc_Qd2hKh9c_7c8h7hAc_5d6cTh9d_Ks4cAh3c() {
    assertEquals(
      "Ks4cAh3c 7c8h7hAc Qd2hKh9c 5d6cTh9d",
      Solver.process("omaha-holdem 5s6d8sJsQc Qd2hKh9c 7c8h7hAc 5d6cTh9d Ks4cAh3c"));
  }

  @Test
  public void test_omaha_holdem_955_3d8hAhKcTh_4c8cKdQh_9h2cJh4h_7d8d5hQd_Qc3h2d6s_4s5c5d9s_3cAc9c2h_7cJc7sTd_6h2sAdAs() {
    assertEquals(
      "Qc3h2d6s 4s5c5d9s 7d8d5hQd 7cJc7sTd 4c8cKdQh 3cAc9c2h 6h2sAdAs 9h2cJh4h",
      Solver.process("omaha-holdem 3d8hAhKcTh 4c8cKdQh 9h2cJh4h 7d8d5hQd Qc3h2d6s 4s5c5d9s 3cAc9c2h 7cJc7sTd 6h2sAdAs"));
  }

  @Test
  public void test_omaha_holdem_956_3d4d4s6d7s_7d8sJs8d_5h5cJhKh_AcKsAs6s_3s9c2hKc() {
    assertEquals(
      "3s9c2hKc 5h5cJhKh AcKsAs6s 7d8sJs8d",
      Solver.process("omaha-holdem 3d4d4s6d7s 7d8sJs8d 5h5cJhKh AcKsAs6s 3s9c2hKc"));
  }

  @Test
  public void test_omaha_holdem_957_8s9hJcTdTs_TcJdKcAs_2d6hQs6s() {
    assertEquals(
      "2d6hQs6s TcJdKcAs",
      Solver.process("omaha-holdem 8s9hJcTdTs TcJdKcAs 2d6hQs6s"));
  }

  @Test
  public void test_omaha_holdem_958_3dKcKhKsTc_JhAc8s7c_Qd5sJdJs_Kd2d7sAh_6h2hTd9h_9s3s9d8d_4sQs3h6s() {
    assertEquals(
      "6h2hTd9h 4sQs3h6s JhAc8s7c 9s3s9d8d Qd5sJdJs Kd2d7sAh",
      Solver.process("omaha-holdem 3dKcKhKsTc JhAc8s7c Qd5sJdJs Kd2d7sAh 6h2hTd9h 9s3s9d8d 4sQs3h6s"));
  }

  @Test
  public void test_omaha_holdem_959_2d4c8h9cTh_AsKc4s9d_3c7dKhJs_7s4hQhTs_6s2s3d5c() {
    assertEquals(
      "6s2s3d5c AsKc4s9d 7s4hQhTs 3c7dKhJs",
      Solver.process("omaha-holdem 2d4c8h9cTh AsKc4s9d 3c7dKhJs 7s4hQhTs 6s2s3d5c"));
  }

  @Test
  public void test_omaha_holdem_960_2c8c8hJcKs_Qh5s5h4h_3c9cAcJd_4cKcJh9d_Qc9sJs4d() {
    assertEquals(
      "Qh5s5h4h Qc9sJs4d 4cKcJh9d 3c9cAcJd",
      Solver.process("omaha-holdem 2c8c8hJcKs Qh5s5h4h 3c9cAcJd 4cKcJh9d Qc9sJs4d"));
  }

  @Test
  public void test_omaha_holdem_961_3h4c6hAcJc_7c3cTsQd_3dKsTc2h_5d9d9cKc_5hJhAhAd_Kd8dTd4s_QcQs4d8h_4h5c2d9s_Kh8c2sTh() {
    assertEquals(
      "Kh8c2sTh 3dKsTc2h Kd8dTd4s QcQs4d8h 5hJhAhAd 4h5c2d9s 7c3cTsQd 5d9d9cKc",
      Solver.process("omaha-holdem 3h4c6hAcJc 7c3cTsQd 3dKsTc2h 5d9d9cKc 5hJhAhAd Kd8dTd4s QcQs4d8h 4h5c2d9s Kh8c2sTh"));
  }

  @Test
  public void test_omaha_holdem_962_3d5s6s8hTh_TsQs5dAc_4d8s5h2d_Kc6d2s5c() {
    assertEquals(
      "Kc6d2s5c TsQs5dAc 4d8s5h2d",
      Solver.process("omaha-holdem 3d5s6s8hTh TsQs5dAc 4d8s5h2d Kc6d2s5c"));
  }

  @Test
  public void test_omaha_holdem_963_3d4c4d9sQs_Js9dAs3s_2c5c2h5s_Jd3cJc7d_Kc5dQh8c_Ts7hKs2d_4s7s8d9c_Td9hKd6d() {
    assertEquals(
      "Ts7hKs2d 2c5c2h5s Td9hKd6d Js9dAs3s Jd3cJc7d Kc5dQh8c 4s7s8d9c",
      Solver.process("omaha-holdem 3d4c4d9sQs Js9dAs3s 2c5c2h5s Jd3cJc7d Kc5dQh8c Ts7hKs2d 4s7s8d9c Td9hKd6d"));
  }

  @Test
  public void test_omaha_holdem_964_2c4sAdKdQh_Jc6h4h4d_8h9cJh3c_Qd6d6c8s_7c5c2h5s_9hAc6s8d_As5dTs9d_3sKcKsTd_Tc5h7s2s() {
    assertEquals(
      "8h9cJh3c Tc5h7s2s 7c5c2h5s Qd6d6c8s 9hAc6s8d As5dTs9d Jc6h4h4d 3sKcKsTd",
      Solver.process("omaha-holdem 2c4sAdKdQh Jc6h4h4d 8h9cJh3c Qd6d6c8s 7c5c2h5s 9hAc6s8d As5dTs9d 3sKcKsTd Tc5h7s2s"));
  }

  @Test
  public void test_omaha_holdem_965_4h5cAhJcTd_3s7d7sJh_5s6s6d4c_8h2cQs8s_KdQd9d9h_3h8dKs4s_2d7cJdTs_5hTc3cTh() {
    assertEquals(
      "3h8dKs4s 8h2cQs8s 3s7d7sJh 5s6s6d4c 2d7cJdTs 5hTc3cTh KdQd9d9h",
      Solver.process("omaha-holdem 4h5cAhJcTd 3s7d7sJh 5s6s6d4c 8h2cQs8s KdQd9d9h 3h8dKs4s 2d7cJdTs 5hTc3cTh"));
  }

  @Test
  public void test_omaha_holdem_966_2h4cQhQsTc_AcKc5d5h_9sTd3d6h_3c7d7sAh_7cAdAsKs_6c6d9c8h() {
    assertEquals(
      "AcKc5d5h 6c6d9c8h 3c7d7sAh 9sTd3d6h 7cAdAsKs",
      Solver.process("omaha-holdem 2h4cQhQsTc AcKc5d5h 9sTd3d6h 3c7d7sAh 7cAdAsKs 6c6d9c8h"));
  }

  @Test
  public void test_omaha_holdem_967_7c8cKdKsTd_2h6h9cKh_7s2d3s5d_Jh8hQdQc_As7d2s5c_TcTs9h5h() {
    assertEquals(
      "7s2d3s5d As7d2s5c Jh8hQdQc 2h6h9cKh TcTs9h5h",
      Solver.process("omaha-holdem 7c8cKdKsTd 2h6h9cKh 7s2d3s5d Jh8hQdQc As7d2s5c TcTs9h5h"));
  }

  @Test
  public void test_omaha_holdem_968_2d3c6h8sQs_Ts6c8dQd_AdTc7d2c_Ks8c7hJs_5h9d2hAc() {
    assertEquals(
      "5h9d2hAc=AdTc7d2c Ks8c7hJs Ts6c8dQd",
      Solver.process("omaha-holdem 2d3c6h8sQs Ts6c8dQd AdTc7d2c Ks8c7hJs 5h9d2hAc"));
  }

  @Test
  public void test_omaha_holdem_969_5s6s7sKdTd_2sJd3hTc_2h8dKh3d_9h9dJc6d_Th7h8hQd_5h4c3cKs() {
    assertEquals(
      "9h9dJc6d 2sJd3hTc 2h8dKh3d Th7h8hQd 5h4c3cKs",
      Solver.process("omaha-holdem 5s6s7sKdTd 2sJd3hTc 2h8dKh3d 9h9dJc6d Th7h8hQd 5h4c3cKs"));
  }

  @Test
  public void test_omaha_holdem_970_2d6d6h8hAs_Kh7h4d6s_Qs3c8dTs_8sKs5cKc() {
    assertEquals(
      "Qs3c8dTs 8sKs5cKc Kh7h4d6s",
      Solver.process("omaha-holdem 2d6d6h8hAs Kh7h4d6s Qs3c8dTs 8sKs5cKc"));
  }

  @Test
  public void test_omaha_holdem_971_5c5h9dKsQd_4c6h5d3d_3c2dAd2s_AsAh2h8c() {
    assertEquals(
      "3c2dAd2s AsAh2h8c 4c6h5d3d",
      Solver.process("omaha-holdem 5c5h9dKsQd 4c6h5d3d 3c2dAd2s AsAh2h8c"));
  }

  @Test
  public void test_omaha_holdem_972_2d3d7c8sJh_9hJcQc2s_AhQh5c7h_7d4sKs6s() {
    assertEquals(
      "7d4sKs6s AhQh5c7h 9hJcQc2s",
      Solver.process("omaha-holdem 2d3d7c8sJh 9hJcQc2s AhQh5c7h 7d4sKs6s"));
  }

  @Test
  public void test_omaha_holdem_973_3c4d5h9sJh_Qd2sTc8d_Kc8hJs9d_7s5c9c8c_QcQs8sQh_2d6cKs5d_2c5s6d3h() {
    assertEquals(
      "Qd2sTc8d QcQs8sQh 7s5c9c8c Kc8hJs9d 2c5s6d3h=2d6cKs5d",
      Solver.process("omaha-holdem 3c4d5h9sJh Qd2sTc8d Kc8hJs9d 7s5c9c8c QcQs8sQh 2d6cKs5d 2c5s6d3h"));
  }

  @Test
  public void test_omaha_holdem_974_2s5s8h9sTc_6d7s8dTd_5c5hTs6h_Ac7cJhKh() {
    assertEquals(
      "5c5hTs6h 6d7s8dTd Ac7cJhKh",
      Solver.process("omaha-holdem 2s5s8h9sTc 6d7s8dTd 5c5hTs6h Ac7cJhKh"));
  }

  @Test
  public void test_omaha_holdem_975_2s5d8dKhTh_AcKc4d3h_7c8c3s9h_4s3d7s8s_Js2h6sQs_7hQdAh5s_4cTd9cAd_9sJcTc4h_5h6dJh3c_Qc6c6h9d() {
    assertEquals(
      "Js2h6sQs 5h6dJh3c 7hQdAh5s Qc6c6h9d 4s3d7s8s 7c8c3s9h 9sJcTc4h 4cTd9cAd AcKc4d3h",
      Solver.process("omaha-holdem 2s5d8dKhTh AcKc4d3h 7c8c3s9h 4s3d7s8s Js2h6sQs 7hQdAh5s 4cTd9cAd 9sJcTc4h 5h6dJh3c Qc6c6h9d"));
  }

  @Test
  public void test_omaha_holdem_976_4c4d6cAsJh_4s3d8h6d_Jc2sAc7s() {
    assertEquals(
      "Jc2sAc7s 4s3d8h6d",
      Solver.process("omaha-holdem 4c4d6cAsJh 4s3d8h6d Jc2sAc7s"));
  }

  @Test
  public void test_omaha_holdem_977_6h7s9h9sAc_Kc4hJcKh_9c4s2d5s_Ah3d7d8c_8s5c7h4c_Ts6dKs8h_As8d6s4d_Js5hJh3c_5dKd3hQh() {
    assertEquals(
      "5dKd3hQh Js5hJh3c Kc4hJcKh Ah3d7d8c=As8d6s4d 9c4s2d5s 8s5c7h4c Ts6dKs8h",
      Solver.process("omaha-holdem 6h7s9h9sAc Kc4hJcKh 9c4s2d5s Ah3d7d8c 8s5c7h4c Ts6dKs8h As8d6s4d Js5hJh3c 5dKd3hQh"));
  }

  @Test
  public void test_omaha_holdem_978_6d7h7sQcQd_4cAh3hJs_8dThAs2s_AcQs5c8h_9sKc3dTs_6c8sQh3c_2h4dJhKs_4s4h5s6h_Tc6s9cJc_AdJdTd9d() {
    assertEquals(
      "9sKc3dTs 2h4dJhKs 8dThAs2s 4cAh3hJs=AdJdTd9d 4s4h5s6h Tc6s9cJc AcQs5c8h 6c8sQh3c",
      Solver.process("omaha-holdem 6d7h7sQcQd 4cAh3hJs 8dThAs2s AcQs5c8h 9sKc3dTs 6c8sQh3c 2h4dJhKs 4s4h5s6h Tc6s9cJc AdJdTd9d"));
  }

  @Test
  public void test_omaha_holdem_979_4h7d9cJsTh_9s8cQc3h_AsJd7cAc_AdKh6d2s_6s3d6c9d_8s3c4dTc() {
    assertEquals(
      "AdKh6d2s 6s3d6c9d AsJd7cAc 8s3c4dTc 9s8cQc3h",
      Solver.process("omaha-holdem 4h7d9cJsTh 9s8cQc3h AsJd7cAc AdKh6d2s 6s3d6c9d 8s3c4dTc"));
  }

  @Test
  public void test_omaha_holdem_980_2dJcJhQhQs_KhAd7s5h_6sTd3hJd_3c6d2hAs_7d8c9dAh_6cAc5s2s_4dTs9c8s() {
    assertEquals(
      "4dTs9c8s 7d8c9dAh KhAd7s5h 3c6d2hAs=6cAc5s2s 6sTd3hJd",
      Solver.process("omaha-holdem 2dJcJhQhQs KhAd7s5h 6sTd3hJd 3c6d2hAs 7d8c9dAh 6cAc5s2s 4dTs9c8s"));
  }

  @Test
  public void test_omaha_holdem_981_2c4s6c6d6h_5h9dKh8h_2dTs5d4c_2h8dQdTh() {
    assertEquals(
      "2dTs5d4c 2h8dQdTh 5h9dKh8h",
      Solver.process("omaha-holdem 2c4s6c6d6h 5h9dKh8h 2dTs5d4c 2h8dQdTh"));
  }

  @Test
  public void test_omaha_holdem_982_4c6d8cAdKs_KdJdTsJc_Qh5h3c6h_3s9d7s4s() {
    assertEquals(
      "3s9d7s4s Qh5h3c6h KdJdTsJc",
      Solver.process("omaha-holdem 4c6d8cAdKs KdJdTsJc Qh5h3c6h 3s9d7s4s"));
  }

  @Test
  public void test_omaha_holdem_983_3d3h4d7sAh_8h7h6hQc_Qh2d2cTc_3c5cKs8d_JdTd6cTh() {
    assertEquals(
      "Qh2d2cTc 8h7h6hQc JdTd6cTh 3c5cKs8d",
      Solver.process("omaha-holdem 3d3h4d7sAh 8h7h6hQc Qh2d2cTc 3c5cKs8d JdTd6cTh"));
  }

  @Test
  public void test_omaha_holdem_984_2c2d8hKhTs_4s3hAs9c_Ah6h8d2s_Tc4h6sTd_7c5sJd5d_Ad2hKd3s_9s7hKc3d_6c6d4cJs_9hQd8cKs_QhQcQs5h() {
    assertEquals(
      "4s3hAs9c 7c5sJd5d 6c6d4cJs QhQcQs5h 9s7hKc3d 9hQd8cKs Ah6h8d2s Ad2hKd3s Tc4h6sTd",
      Solver.process("omaha-holdem 2c2d8hKhTs 4s3hAs9c Ah6h8d2s Tc4h6sTd 7c5sJd5d Ad2hKd3s 9s7hKc3d 6c6d4cJs 9hQd8cKs QhQcQs5h"));
  }

  @Test
  public void test_omaha_holdem_985_3c6c6sAsKd_6h7s5sQs_Qh9s9d4s_6d7cTs3h() {
    assertEquals(
      "Qh9s9d4s 6h7s5sQs 6d7cTs3h",
      Solver.process("omaha-holdem 3c6c6sAsKd 6h7s5sQs Qh9s9d4s 6d7cTs3h"));
  }

  @Test
  public void test_omaha_holdem_986_2s4d7h7sQc_Qh3hAs3d_9s8dQsJc_2cTc6c3c() {
    assertEquals(
      "2cTc6c3c 9s8dQsJc Qh3hAs3d",
      Solver.process("omaha-holdem 2s4d7h7sQc Qh3hAs3d 9s8dQsJc 2cTc6c3c"));
  }

  @Test
  public void test_omaha_holdem_987_4h6c7c9dTc_Qd9h7d7s_Jd5dJc3h_4s3sTh5c_6s2c7h8h_5h3d9c2d() {
    assertEquals(
      "Qd9h7d7s 4s3sTh5c=5h3d9c2d=Jd5dJc3h 6s2c7h8h",
      Solver.process("omaha-holdem 4h6c7c9dTc Qd9h7d7s Jd5dJc3h 4s3sTh5c 6s2c7h8h 5h3d9c2d"));
  }

  @Test
  public void test_omaha_holdem_988_3s5cJdQcTc_Qs9s2hQh_Kh2c5h4c_7hAcAsAd_2s6s5s3h_6cKc8s3c_8c6dJh8h_3d4d9cTs() {
    assertEquals(
      "8c6dJh8h 7hAcAsAd 2s6s5s3h 3d4d9cTs Qs9s2hQh Kh2c5h4c 6cKc8s3c",
      Solver.process("omaha-holdem 3s5cJdQcTc Qs9s2hQh Kh2c5h4c 7hAcAsAd 2s6s5s3h 6cKc8s3c 8c6dJh8h 3d4d9cTs"));
  }

  @Test
  public void test_omaha_holdem_989_3c5h7d7hJs_2dAhKs5c_7c9hKc7s() {
    assertEquals(
      "2dAhKs5c 7c9hKc7s",
      Solver.process("omaha-holdem 3c5h7d7hJs 2dAhKs5c 7c9hKc7s"));
  }

  @Test
  public void test_omaha_holdem_990_5c6h8hQhTd_2h9dAd4d_Ts7c6cKc_3cAs5hAh_JcTc3h2c() {
    assertEquals(
      "2h9dAd4d JcTc3h2c Ts7c6cKc 3cAs5hAh",
      Solver.process("omaha-holdem 5c6h8hQhTd 2h9dAd4d Ts7c6cKc 3cAs5hAh JcTc3h2c"));
  }

  @Test
  public void test_omaha_holdem_991_2c2h4h7sJc_2sKh3c9h_Qh5cAd3d() {
    assertEquals(
      "Qh5cAd3d 2sKh3c9h",
      Solver.process("omaha-holdem 2c2h4h7sJc 2sKh3c9h Qh5cAd3d"));
  }

  @Test
  public void test_omaha_holdem_992_2d3cAhJsQs_4c3s4s2c_5h9c2hKc_2sAc7d9d_KhQcTsTh_Qh4d5c7c_8h7sKdKs() {
    assertEquals(
      "5h9c2hKc 8h7sKdKs 4c3s4s2c 2sAc7d9d Qh4d5c7c KhQcTsTh",
      Solver.process("omaha-holdem 2d3cAhJsQs 4c3s4s2c 5h9c2hKc 2sAc7d9d KhQcTsTh Qh4d5c7c 8h7sKdKs"));
  }

  @Test
  public void test_omaha_holdem_993_6c7h8cQsTs_5hJd5d3c_ThAd2cAs() {
    assertEquals(
      "5hJd5d3c ThAd2cAs",
      Solver.process("omaha-holdem 6c7h8cQsTs 5hJd5d3c ThAd2cAs"));
  }

  @Test
  public void test_omaha_holdem_994_3d4s8cJsTs_5c7c5sAs_6s9hKdAd_9c6c9d3c_2s2cQdJd() {
    assertEquals(
      "6s9hKdAd 9c6c9d3c 2s2cQdJd 5c7c5sAs",
      Solver.process("omaha-holdem 3d4s8cJsTs 5c7c5sAs 6s9hKdAd 9c6c9d3c 2s2cQdJd"));
  }

  @Test
  public void test_omaha_holdem_995_2d2h5s8dJc_4h3s9d5d_4c2s6s6c_TdKsAd3h_KcQcAsAc_2c6d9s7s_TsJhQdKd() {
    assertEquals(
      "TdKsAd3h 4h3s9d5d TsJhQdKd KcQcAsAc 4c2s6s6c 2c6d9s7s",
      Solver.process("omaha-holdem 2d2h5s8dJc 4h3s9d5d 4c2s6s6c TdKsAd3h KcQcAsAc 2c6d9s7s TsJhQdKd"));
  }

  @Test
  public void test_omaha_holdem_996_2d3h8c8hTc_JsJc7c2h_Td5d3d4c_7s6sAd9h() {
    assertEquals(
      "7s6sAd9h Td5d3d4c JsJc7c2h",
      Solver.process("omaha-holdem 2d3h8c8hTc JsJc7c2h Td5d3d4c 7s6sAd9h"));
  }

  @Test
  public void test_omaha_holdem_997_2c5c7d8dTc_Ah3s7hKd_9h6sJd8h_9c6dTs5h_9d9s6hQd_QhAd4dAs_7c3d8sQc_Js3c6cKh_JcKcJh4s_QsAc2sTh() {
    assertEquals(
      "Ah3s7hKd QhAd4dAs QsAc2sTh 9c6dTs5h=9d9s6hQd 9h6sJd8h Js3c6cKh 7c3d8sQc JcKcJh4s",
      Solver.process("omaha-holdem 2c5c7d8dTc Ah3s7hKd 9h6sJd8h 9c6dTs5h 9d9s6hQd QhAd4dAs 7c3d8sQc Js3c6cKh JcKcJh4s QsAc2sTh"));
  }

  @Test
  public void test_omaha_holdem_998_4d9sAcAsQd_6c4hTsJs_3d9c5hJd_Kc7h6dKs_4c2d7cKh_2c3c2h8s_8h3h6h3s() {
    assertEquals(
      "2c3c2h8s 8h3h6h3s 6c4hTsJs 4c2d7cKh 3d9c5hJd Kc7h6dKs",
      Solver.process("omaha-holdem 4d9sAcAsQd 6c4hTsJs 3d9c5hJd Kc7h6dKs 4c2d7cKh 2c3c2h8s 8h3h6h3s"));
  }

  @Test
  public void test_omaha_holdem_999_3s7cJsKcKh_3h4hAd6c_8sQh4c4d_9c5cQc5h_7dQsQdKs_JcTcAc6s_6dJd8d3d() {
    assertEquals(
      "3h4hAd6c 8sQh4c4d 9c5cQc5h 6dJd8d3d JcTcAc6s 7dQsQdKs",
      Solver.process("omaha-holdem 3s7cJsKcKh 3h4hAd6c 8sQh4c4d 9c5cQc5h 7dQsQdKs JcTcAc6s 6dJd8d3d"));
  }

}
